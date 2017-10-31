package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
{
  private final LinkedList<String> soc;
  
  public j()
  {
    GMTrace.i(11987656376320L, 89315);
    this.soc = new LinkedList();
    GMTrace.o(11987656376320L, 89315);
  }
  
  public final void KL(String paramString)
  {
    GMTrace.i(11987790594048L, 89316);
    try
    {
      if (!bg.mZ(paramString)) {
        synchronized (this.soc)
        {
          String str = (String)this.soc.peekLast();
          paramString = URLEncoder.encode(paramString);
          if ((str == null) || (!str.equals(paramString))) {
            this.soc.addLast(paramString);
          }
          if (this.soc.size() > 10) {
            this.soc.removeFirst();
          }
          GMTrace.o(11987790594048L, 89316);
          return;
        }
      }
      GMTrace.o(11987790594048L, 89316);
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WebViewURLRouteList", "add exp = %s", new Object[] { bg.f(paramString) });
      GMTrace.o(11987790594048L, 89316);
      return;
    }
  }
  
  public final String[] bAP()
  {
    GMTrace.i(11987924811776L, 89317);
    synchronized (this.soc)
    {
      String[] arrayOfString = new String[this.soc.size()];
      Iterator localIterator = this.soc.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        arrayOfString[i] = ((String)localIterator.next());
        i += 1;
      }
      GMTrace.o(11987924811776L, 89317);
      return arrayOfString;
    }
  }
  
  public final void bAQ()
  {
    GMTrace.i(11988059029504L, 89318);
    if (!b.bMv())
    {
      GMTrace.o(11988059029504L, 89318);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("routeList: ");
    synchronized (this.soc)
    {
      Iterator localIterator = this.soc.iterator();
      if (localIterator.hasNext()) {
        localStringBuilder.append(URLDecoder.decode((String)localIterator.next())).append("\n");
      }
    }
    w.d("MicroMsg.WebViewURLRouteList", ((StringBuilder)localObject).toString());
    GMTrace.o(11988059029504L, 89318);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */