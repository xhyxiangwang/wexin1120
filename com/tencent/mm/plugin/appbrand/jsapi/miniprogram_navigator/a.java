package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public enum a
{
  public final int iQS;
  
  static
  {
    GMTrace.i(19829998223360L, 147745);
    iZc = new a("RELEASE", 0, 0);
    iZd = new a("DEVELOP", 1, 1);
    iZe = new a("TRIAL", 2, 2);
    iZf = new a[] { iZc, iZd, iZe };
    GMTrace.o(19829998223360L, 147745);
  }
  
  private a(int paramInt)
  {
    GMTrace.i(19829729787904L, 147743);
    this.iQS = paramInt;
    GMTrace.o(19829729787904L, 147743);
  }
  
  public static a a(String paramString, a parama)
  {
    GMTrace.i(19829864005632L, 147744);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19829864005632L, 147744);
      return parama;
    }
    a[] arrayOfa = values();
    int j = arrayOfa.length;
    int i = 0;
    while (i < j)
    {
      a locala = arrayOfa[i];
      if (locala.name().toLowerCase().equals(paramString))
      {
        GMTrace.o(19829864005632L, 147744);
        return locala;
      }
      i += 1;
    }
    GMTrace.o(19829864005632L, 147744);
    return parama;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */