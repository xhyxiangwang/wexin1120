package com.tencent.mm.plugin.brandservice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class a
  implements k
{
  public static i ifM;
  public static h ifN;
  
  public a()
  {
    GMTrace.i(10914988294144L, 81323);
    GMTrace.o(10914988294144L, 81323);
  }
  
  public static void d(int paramInt, Object paramObject)
  {
    GMTrace.i(10915390947328L, 81326);
    if (paramObject == null) {}
    for (String str = "null";; str = paramObject.toString())
    {
      w.i("MicroMsg.BrandService.BrandServiceApplication", "set config, key[%d], value[%s]", new Object[] { Integer.valueOf(paramInt), str });
      ap.AS();
      c.xi().set(paramInt, paramObject);
      GMTrace.o(10915390947328L, 81326);
      return;
    }
  }
  
  public final void a(h paramh)
  {
    GMTrace.i(10915256729600L, 81325);
    ifN = paramh;
    GMTrace.o(10915256729600L, 81325);
  }
  
  public final void a(i parami)
  {
    GMTrace.i(10915122511872L, 81324);
    ifM = parami;
    GMTrace.o(10915122511872L, 81324);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */