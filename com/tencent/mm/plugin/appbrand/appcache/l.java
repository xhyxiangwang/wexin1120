package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import java.util.Locale;

public final class l
  extends p
{
  final int iBe;
  final int iBf;
  final w.a iBg;
  
  public l(String paramString1, int paramInt1, int paramInt2, String paramString2, w.a parama)
  {
    super(String.format(Locale.US, "WxaPkgDiff_%s_%d_%d", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), o.SA() + String.format(Locale.US, "_%s_%d_%d.wxapkg.diff", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), paramString2, paramString1, 0, paramInt2);
    GMTrace.i(19994280722432L, 148969);
    this.iBe = paramInt1;
    this.iBf = paramInt2;
    this.iBg = parama;
    GMTrace.o(19994280722432L, 148969);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */