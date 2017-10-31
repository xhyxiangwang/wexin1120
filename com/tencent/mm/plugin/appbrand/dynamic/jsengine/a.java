package com.tencent.mm.plugin.appbrand.dynamic.jsengine;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.e;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.n;
import java.util.Iterator;
import java.util.LinkedList;

@JgClassChecked(author=30, fComment="checked", lastDate="20170320", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public class a
  extends WebView
  implements e
{
  private final LinkedList<Pair<String, ValueCallback<String>>> irY;
  private boolean irZ;
  private n isa;
  private Context mContext;
  private ae mHandler;
  private volatile boolean pR;
  
  public a(Context paramContext, Object paramObject, String paramString1, String paramString2)
  {
    super(paramContext);
    GMTrace.i(19919253012480L, 148410);
    this.irY = new LinkedList();
    this.irZ = false;
    this.pR = false;
    this.isa = new n()
    {
      public final void a(WebView arg1, String paramAnonymousString)
      {
        GMTrace.i(19921937367040L, 148430);
        synchronized (a.a(a.this))
        {
          paramAnonymousString = a.a(a.this).iterator();
          if (paramAnonymousString.hasNext())
          {
            Pair localPair = (Pair)paramAnonymousString.next();
            a.b(a.this, (String)localPair.first, (ValueCallback)localPair.second);
          }
        }
        a.a(a.this).clear();
        a.b(a.this);
        GMTrace.o(19921937367040L, 148430);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19922071584768L, 148431);
        GMTrace.o(19922071584768L, 148431);
        return true;
      }
    };
    this.mContext = paramContext;
    this.mHandler = new ae(Looper.getMainLooper());
    getSettings().setJavaScriptEnabled(true);
    getSettings().setUserAgentString(s.aY(this.mContext, getSettings().getUserAgentString()));
    setWebViewClient(this.isa);
    if ((paramObject != null) && (!bg.mZ(paramString1))) {
      addJavascriptInterface(paramObject, paramString1);
    }
    setWillNotDraw(true);
    loadDataWithBaseURL(paramString2, "<html>\n  <head>\n    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none';script-src 'unsafe-eval';\">\n  </head>\n  <body></body>\n</html>", "text/html", "utf-8", null);
    GMTrace.o(19919253012480L, 148410);
  }
  
  private void a(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19919521447936L, 148412);
    if (this.pR)
    {
      GMTrace.o(19919521447936L, 148412);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19916300222464L, 148388);
        a.a(a.this, paramString, paramValueCallback);
        GMTrace.o(19916300222464L, 148388);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19919521447936L, 148412);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(19919521447936L, 148412);
  }
  
  public final void cleanup()
  {
    GMTrace.i(19919655665664L, 148413);
    this.pR = true;
    destroy();
    GMTrace.o(19919655665664L, 148413);
  }
  
  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19919387230208L, 148411);
    synchronized (this.irY)
    {
      if (!this.irZ)
      {
        this.irY.add(new Pair(paramString, paramValueCallback));
        GMTrace.o(19919387230208L, 148411);
        return;
      }
      a(paramString, paramValueCallback);
      GMTrace.o(19919387230208L, 148411);
      return;
    }
  }
  
  public void pause()
  {
    GMTrace.i(19919789883392L, 148414);
    GMTrace.o(19919789883392L, 148414);
  }
  
  public void resume()
  {
    GMTrace.i(19919924101120L, 148415);
    GMTrace.o(19919924101120L, 148415);
  }
  
  public boolean wu()
  {
    GMTrace.i(19920058318848L, 148416);
    GMTrace.o(19920058318848L, 148416);
    return false;
  }
  
  public final boolean wv()
  {
    GMTrace.i(19920192536576L, 148417);
    GMTrace.o(19920192536576L, 148417);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsengine/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */