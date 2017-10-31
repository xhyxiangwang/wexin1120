package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b.c;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.appcache.a;
import com.tencent.mm.plugin.appbrand.appcache.u;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;

public final class n
{
  private static final b.i jkS;
  
  static
  {
    GMTrace.i(17297712349184L, 128878);
    jkS = new b.c();
    GMTrace.o(17297712349184L, 128878);
  }
  
  public static Bitmap g(f paramf, String paramString)
  {
    GMTrace.i(18358300835840L, 136780);
    if (paramf == null)
    {
      GMTrace.o(18358300835840L, 136780);
      return null;
    }
    Object localObject = a.nW(paramString);
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(18358300835840L, 136780);
      return null;
    }
    paramString = paramf.hashCode() + 35 + (String)localObject;
    Bitmap localBitmap = jkS.hm(paramString);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      GMTrace.o(18358300835840L, 136780);
      return localBitmap;
    }
    paramf = u.d(paramf, (String)localObject);
    if (paramf != null) {}
    try
    {
      int i = paramf.available();
      if (i <= 0)
      {
        if (paramf != null) {
          bg.g(paramf);
        }
        GMTrace.o(18358300835840L, 136780);
        return null;
      }
      localObject = d.decodeStream(paramf);
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        jkS.b(paramString, (Bitmap)localObject);
        if (paramf != null) {
          bg.g(paramf);
        }
        GMTrace.o(18358300835840L, 136780);
        return (Bitmap)localObject;
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandPageIconCache", "try decode icon e = %s", new Object[] { paramString });
        if (paramf != null) {
          bg.g(paramf);
        }
      }
    }
    finally
    {
      if (paramf == null) {
        break label239;
      }
      bg.g(paramf);
    }
    GMTrace.o(18358300835840L, 136780);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */