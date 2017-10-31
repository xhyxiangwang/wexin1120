package com.tencent.mm.g.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import junit.framework.Assert;

public final class ed
  extends g
{
  private static ed gAZ;
  private static HashMap<Integer, g.d> gBa;
  
  static
  {
    GMTrace.i(4170010591232L, 31069);
    gAZ = null;
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("FavItemInfo".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4122497515520L, 30715);
        String str = i.a(ba.qR(), "FavItemInfo");
        GMTrace.o(4122497515520L, 30715);
        return new String[] { str };
      }
    });
    gBa.put(Integer.valueOf("FavSearchInfo".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4123302821888L, 30721);
        String str = i.a(bb.qR(), "FavSearchInfo");
        GMTrace.o(4123302821888L, 30721);
        return new String[] { str };
      }
    });
    gBa.put(Integer.valueOf("FavEditInfo".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4114310234112L, 30654);
        String str = i.a(az.qR(), "FavEditInfo");
        GMTrace.o(4114310234112L, 30654);
        return new String[] { str };
      }
    });
    gBa.put(Integer.valueOf("FavCdnInfo".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4138603642880L, 30835);
        String str = i.a(ax.qR(), "FavCdnInfo");
        GMTrace.o(4138603642880L, 30835);
        return new String[] { str };
      }
    });
    gBa.put(Integer.valueOf("FavConfigInfo".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4115115540480L, 30660);
        String str = i.a(ay.qR(), "FavConfigInfo");
        GMTrace.o(4115115540480L, 30660);
        return new String[] { str };
      }
    });
    GMTrace.o(4170010591232L, 31069);
  }
  
  private ed()
  {
    GMTrace.i(4169607938048L, 31066);
    long l = System.currentTimeMillis();
    h.xx();
    if (a.wy() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      str = h.xz().cachePath + "enFavorite.db";
      w.d("MicroMsg.FavoriteDataBase", "db path", new Object[] { str });
      h.xx();
      if (a("", str, a.wy(), p.te(), gBa)) {
        break;
      }
      throw new com.tencent.mm.x.b((byte)0);
    }
    String str = this.vhr;
    if (!bg.mZ(str))
    {
      w.e("MicroMsg.FavoriteDataBase", "dbinit failed :" + str);
      com.tencent.mm.sdk.a.b.q("init db Favorite Failed: [ " + str + "]", "DBinit");
    }
    w.d("MicroMsg.FavoriteDataBase", "init db Favorite time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(4169607938048L, 31066);
  }
  
  public static ed rj()
  {
    GMTrace.i(4169742155776L, 31067);
    if (gAZ == null) {
      gAZ = new ed();
    }
    ed localed = gAZ;
    GMTrace.o(4169742155776L, 31067);
    return localed;
  }
  
  public final void df(String paramString)
  {
    GMTrace.i(4169876373504L, 31068);
    super.df(paramString);
    gAZ = null;
    GMTrace.o(4169876373504L, 31068);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */