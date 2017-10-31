package com.tencent.mm.plugin.appbrand.dynamic.jsengine;

import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.f;
import java.util.concurrent.CountDownLatch;

class AppBrandIndV8JsEngine
  implements e
{
  public f iqj;
  private volatile boolean iqk;
  private volatile boolean iql;
  private volatile CountDownLatch iqm;
  private ae mHandler;
  
  public AppBrandIndV8JsEngine(Object paramObject, String paramString, f paramf)
  {
    GMTrace.i(19916971311104L, 148393);
    this.iql = false;
    this.iqj = paramf;
    this.iqk = false;
    this.iqj.addJavascriptInterface(paramObject, paramString);
    this.mHandler = new ae(Looper.getMainLooper());
    this.iqj.addJavascriptInterface(this, "WeixinJsThreadCaller");
    GMTrace.o(19916971311104L, 148393);
  }
  
  @JavascriptInterface
  public int callFromJsThread()
  {
    GMTrace.i(19917105528832L, 148394);
    w.d("MicroMsg.AppBrandX5BasedJsEngine", "enter callFromJsThread, pendingPause %b", new Object[] { Boolean.valueOf(this.iql) });
    if (this.iql)
    {
      w.i("MicroMsg.AppBrandX5BasedJsEngine", "pause await threadId %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
      this.iql = false;
      this.iqm = new CountDownLatch(1);
    }
    try
    {
      this.iqm.await();
      GMTrace.o(19917105528832L, 148394);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandX5BasedJsEngine", "pause await e = %s", new Object[] { localInterruptedException });
      }
    }
  }
  
  public void cleanup()
  {
    GMTrace.i(19917373964288L, 148396);
    if (!this.iqk) {
      this.iqj.cleanup();
    }
    this.iqk = true;
    GMTrace.o(19917373964288L, 148396);
  }
  
  public void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19917239746560L, 148395);
    if (this.iqk)
    {
      GMTrace.o(19917239746560L, 148395);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19918045052928L, 148401);
        AppBrandIndV8JsEngine.this.iqj.evaluateJavascript(paramString, paramValueCallback);
        GMTrace.o(19918045052928L, 148401);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19917239746560L, 148395);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(19917239746560L, 148395);
  }
  
  public void pause()
  {
    GMTrace.i(19917508182016L, 148397);
    if (this.iqj.wu())
    {
      this.iqj.pause();
      GMTrace.o(19917508182016L, 148397);
      return;
    }
    this.iql = true;
    evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new ValueCallback() {});
    GMTrace.o(19917508182016L, 148397);
  }
  
  public void resume()
  {
    GMTrace.i(19917642399744L, 148398);
    if (this.iqj.wu())
    {
      this.iqj.resume();
      GMTrace.o(19917642399744L, 148398);
      return;
    }
    this.iql = false;
    if (this.iqm != null)
    {
      this.iqm.countDown();
      this.iqm = null;
    }
    GMTrace.o(19917642399744L, 148398);
  }
  
  public boolean wu()
  {
    GMTrace.i(19917776617472L, 148399);
    GMTrace.o(19917776617472L, 148399);
    return true;
  }
  
  public boolean wv()
  {
    GMTrace.i(19916837093376L, 148392);
    boolean bool = this.iqj.wv();
    GMTrace.o(19916837093376L, 148392);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsengine/AppBrandIndV8JsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */