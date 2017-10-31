package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class r
  extends i<q>
{
  public static final String[] iAV;
  public static final String[] jzS;
  
  static
  {
    GMTrace.i(19992535891968L, 148956);
    iAV = new String[] { i.a(q.iBQ, "WxaWidgetInfo") };
    jzS = new String[0];
    GMTrace.o(19992535891968L, 148956);
  }
  
  public r(e parame)
  {
    super(parame, q.iBQ, "WxaWidgetInfo", jzS);
    GMTrace.i(19992267456512L, 148954);
    GMTrace.o(19992267456512L, 148954);
  }
  
  public final q st(String paramString)
  {
    GMTrace.i(19992401674240L, 148955);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19992401674240L, 148955);
      return null;
    }
    q localq = new q();
    localq.field_appId = paramString;
    localq.field_appIdHash = paramString.hashCode();
    if (!b(localq, new String[] { "appIdHash" }))
    {
      GMTrace.o(19992401674240L, 148955);
      return null;
    }
    GMTrace.o(19992401674240L, 148955);
    return localq;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */