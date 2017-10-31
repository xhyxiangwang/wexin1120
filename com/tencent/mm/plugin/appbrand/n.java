package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

@JgClassChecked(author=30, fComment="checked", lastDate="20170320", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class n
  extends WebView
  implements c
{
  private final LinkedList<Pair<String, ValueCallback<String>>> irY;
  private boolean irZ;
  private com.tencent.xweb.n isa;
  private Context mContext;
  private ae mHandler;
  private volatile boolean pR;
  
  public n(Context paramContext, Object paramObject, String paramString)
  {
    this(paramContext, paramObject, paramString, "https://servicewechat.com/app-service");
    GMTrace.i(10142296834048L, 75566);
    GMTrace.o(10142296834048L, 75566);
  }
  
  private n(Context paramContext, Object paramObject, String paramString1, String paramString2)
  {
    super(paramContext);
    GMTrace.i(17664663617536L, 131612);
    this.irY = new LinkedList();
    this.irZ = false;
    this.pR = false;
    this.isa = new com.tencent.xweb.n()
    {
      public final void a(WebView arg1, String paramAnonymousString)
      {
        GMTrace.i(19903281102848L, 148291);
        synchronized (n.a(n.this))
        {
          paramAnonymousString = n.a(n.this).iterator();
          if (paramAnonymousString.hasNext())
          {
            Pair localPair = (Pair)paramAnonymousString.next();
            n.b(n.this, (String)localPair.first, (ValueCallback)localPair.second);
          }
        }
        n.a(n.this).clear();
        n.b(n.this);
        GMTrace.o(19903281102848L, 148291);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19903415320576L, 148292);
        GMTrace.o(19903415320576L, 148292);
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
    GMTrace.o(17664663617536L, 131612);
  }
  
  private void a(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19888919805952L, 148184);
    if (this.pR)
    {
      GMTrace.o(19888919805952L, 148184);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10269132587008L, 76511);
        n.a(n.this, paramString, paramValueCallback);
        GMTrace.o(10269132587008L, 76511);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19888919805952L, 148184);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(19888919805952L, 148184);
  }
  
  public final int Ru()
  {
    GMTrace.i(19889054023680L, 148185);
    GMTrace.o(19889054023680L, 148185);
    return 0;
  }
  
  public final boolean Rv()
  {
    GMTrace.i(19889456676864L, 148188);
    GMTrace.o(19889456676864L, 148188);
    return false;
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    GMTrace.i(19889322459136L, 148187);
    GMTrace.o(19889322459136L, 148187);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10142699487232L, 75569);
    this.pR = true;
    destroy();
    GMTrace.o(10142699487232L, 75569);
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19888785588224L, 148183);
    synchronized (this.irY)
    {
      if (!this.irZ)
      {
        this.irY.add(new Pair(paramString, paramValueCallback));
        GMTrace.o(19888785588224L, 148183);
        return;
      }
      a(paramString, paramValueCallback);
      GMTrace.o(19888785588224L, 148183);
      return;
    }
  }
  
  public final ByteBuffer hI(int paramInt)
  {
    GMTrace.i(19889188241408L, 148186);
    GMTrace.o(19889188241408L, 148186);
    return null;
  }
  
  public final void pause()
  {
    GMTrace.i(18848732413952L, 140434);
    GMTrace.o(18848732413952L, 140434);
  }
  
  public final void resume()
  {
    GMTrace.i(18848866631680L, 140435);
    GMTrace.o(18848866631680L, 140435);
  }
  
  public final boolean wv()
  {
    GMTrace.i(19889590894592L, 148189);
    GMTrace.o(19889590894592L, 148189);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */