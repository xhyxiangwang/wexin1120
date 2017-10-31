package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends i<b>
{
  public static final String[] iAV;
  public final e iDo;
  
  static
  {
    GMTrace.i(10590315610112L, 78904);
    iAV = new String[] { i.a(b.iBQ, "AppBrandCommonKVData") };
    GMTrace.o(10590315610112L, 78904);
  }
  
  public c(e parame)
  {
    super(parame, b.iBQ, "AppBrandCommonKVData", null);
    GMTrace.i(10589912956928L, 78901);
    this.iDo = parame;
    GMTrace.o(10589912956928L, 78901);
  }
  
  public final boolean aP(String paramString1, String paramString2)
  {
    GMTrace.i(10590047174656L, 78902);
    if (bg.mZ(paramString1))
    {
      GMTrace.o(10590047174656L, 78902);
      return false;
    }
    b localb = new b();
    localb.field_key = paramString1;
    localb.field_value = paramString2;
    if (bg.mZ(localb.field_value))
    {
      if (!super.a(localb, new String[0]))
      {
        GMTrace.o(10590047174656L, 78902);
        return true;
      }
      GMTrace.o(10590047174656L, 78902);
      return false;
    }
    boolean bool = super.a(localb);
    GMTrace.o(10590047174656L, 78902);
    return bool;
  }
  
  public final String get(String paramString1, String paramString2)
  {
    GMTrace.i(10590181392384L, 78903);
    if (bg.mZ(paramString1))
    {
      GMTrace.o(10590181392384L, 78903);
      return paramString2;
    }
    b localb = new b();
    localb.field_key = paramString1;
    if (super.b(localb, new String[0]))
    {
      paramString1 = localb.field_value;
      GMTrace.o(10590181392384L, 78903);
      return paramString1;
    }
    GMTrace.o(10590181392384L, 78903);
    return paramString2;
  }
  
  public final void oQ(String paramString)
  {
    GMTrace.i(17818477133824L, 132758);
    super.eL("AppBrandCommonKVData", String.format("delete from %s where %s like '%s%%'", new Object[] { "AppBrandCommonKVData", "key", paramString }));
    GMTrace.o(17818477133824L, 132758);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */