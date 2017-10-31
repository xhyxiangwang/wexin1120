package com.tencent.mm.plugin.appbrand;

import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.a.d;
import com.tencent.xweb.f;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public class AppBrandIndV8JsEngine
  implements c
{
  public f iqj;
  private volatile boolean iqk;
  private volatile boolean iql;
  private volatile CountDownLatch iqm;
  private ae mHandler;
  
  public AppBrandIndV8JsEngine(Object paramObject, String paramString, f paramf)
  {
    GMTrace.i(19694572535808L, 146736);
    this.iql = false;
    this.iqj = paramf;
    this.iqk = false;
    this.iqj.addJavascriptInterface(paramObject, paramString);
    this.mHandler = new ae(Looper.getMainLooper());
    this.iqj.addJavascriptInterface(this, "WeixinJsThreadCaller");
    GMTrace.o(19694572535808L, 146736);
  }
  
  public final int Ru()
  {
    GMTrace.i(19695377842176L, 146742);
    int i = this.iqj.xOC.Ru();
    GMTrace.o(19695377842176L, 146742);
    return i;
  }
  
  public final boolean Rv()
  {
    GMTrace.i(19695780495360L, 146745);
    boolean bool = this.iqj.xOC.Rv();
    GMTrace.o(19695780495360L, 146745);
    return bool;
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    GMTrace.i(19695646277632L, 146744);
    this.iqj.xOC.a(paramInt, paramByteBuffer);
    GMTrace.o(19695646277632L, 146744);
  }
  
  @JavascriptInterface
  public int callFromJsThread()
  {
    GMTrace.i(19694706753536L, 146737);
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
      GMTrace.o(19694706753536L, 146737);
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
  
  public final void cleanup()
  {
    GMTrace.i(19694975188992L, 146739);
    if (!this.iqk) {
      this.iqj.cleanup();
    }
    this.iqk = true;
    GMTrace.o(19694975188992L, 146739);
  }
  
  public void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19694840971264L, 146738);
    if (this.iqk)
    {
      GMTrace.o(19694840971264L, 146738);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19861136736256L, 147977);
        AppBrandIndV8JsEngine.this.iqj.evaluateJavascript(paramString, paramValueCallback);
        GMTrace.o(19861136736256L, 147977);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19694840971264L, 146738);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(19694840971264L, 146738);
  }
  
  public final ByteBuffer hI(int paramInt)
  {
    GMTrace.i(19695512059904L, 146743);
    ByteBuffer localByteBuffer = this.iqj.xOC.hI(paramInt);
    GMTrace.o(19695512059904L, 146743);
    return localByteBuffer;
  }
  
  public final void pause()
  {
    GMTrace.i(19695109406720L, 146740);
    if (this.iqj.wu())
    {
      this.iqj.pause();
      GMTrace.o(19695109406720L, 146740);
      return;
    }
    this.iql = true;
    evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new ValueCallback() {});
    GMTrace.o(19695109406720L, 146740);
  }
  
  public final void resume()
  {
    GMTrace.i(19695243624448L, 146741);
    if (this.iqj.wu())
    {
      this.iqj.resume();
      GMTrace.o(19695243624448L, 146741);
      return;
    }
    this.iql = false;
    if (this.iqm != null)
    {
      this.iqm.countDown();
      this.iqm = null;
    }
    GMTrace.o(19695243624448L, 146741);
  }
  
  public final boolean wv()
  {
    GMTrace.i(19694438318080L, 146735);
    boolean bool = this.iqj.wv();
    GMTrace.o(19694438318080L, 146735);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/AppBrandIndV8JsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */