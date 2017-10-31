package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.bkj;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.Arrays;
import java.util.Map;

public final class d
{
  public static final c iEu;
  
  static
  {
    GMTrace.i(15412758577152L, 114834);
    iEu = new c();
    GMTrace.o(15412758577152L, 114834);
  }
  
  public static boolean Tp()
  {
    GMTrace.i(15411819053056L, 114827);
    c.Tg();
    if (!h.xx().wM())
    {
      GMTrace.o(15411819053056L, 114827);
      return false;
    }
    boolean bool = ((Boolean)h.xz().xi().get(w.a.uZf, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(15411819053056L, 114827);
    return bool;
  }
  
  static a Tq()
  {
    int i = 0;
    GMTrace.i(15411953270784L, 114828);
    if (!Tr())
    {
      localObject = a.iEv;
      GMTrace.o(15411953270784L, 114828);
      return (a)localObject;
    }
    int j = ((Integer)h.xz().xi().get(w.a.uYW, Integer.valueOf(0))).intValue();
    Object localObject = a.values();
    int k = localObject.length;
    while (i < k)
    {
      a locala = localObject[i];
      if (locala.value == j)
      {
        GMTrace.o(15411953270784L, 114828);
        return locala;
      }
      i += 1;
    }
    localObject = a.iEv;
    GMTrace.o(15411953270784L, 114828);
    return (a)localObject;
  }
  
  public static boolean Tr()
  {
    GMTrace.i(15412087488512L, 114829);
    if (!h.xx().wM())
    {
      GMTrace.o(15412087488512L, 114829);
      return false;
    }
    long l = ((Long)h.xz().xi().get(w.a.uYT, Long.valueOf(0L))).longValue();
    if (l > bg.Po()) {}
    for (boolean bool = true;; bool = false)
    {
      if ((!bool) && (l > 0L))
      {
        h.xz().xi().a(w.a.uYT, Long.valueOf(0L));
        e locale = e.iEG;
        e.a((String)h.xz().xi().get(w.a.uYU, ""), ((Long)h.xz().xi().get(w.a.uYV, Long.valueOf(0L))).longValue(), 3, e.Tv());
      }
      GMTrace.o(15412087488512L, 114829);
      return bool;
    }
  }
  
  static void Ts()
  {
    GMTrace.i(15412221706240L, 114830);
    c.Tg();
    if (!h.xx().wM())
    {
      GMTrace.o(15412221706240L, 114830);
      return;
    }
    e locale = e.iEG;
    if (!((Boolean)h.xz().xi().get(w.a.uYZ, Boolean.valueOf(false))).booleanValue())
    {
      e.a((String)h.xz().xi().get(w.a.uYU, ""), ((Long)h.xz().xi().get(w.a.uYV, Long.valueOf(0L))).longValue(), 0, e.Tv());
      h.xz().xi().a(w.a.uYZ, Boolean.valueOf(true));
    }
    GMTrace.o(15412221706240L, 114830);
  }
  
  public static void Tt()
  {
    GMTrace.i(15412355923968L, 114831);
    if (!h.xx().wM())
    {
      GMTrace.o(15412355923968L, 114831);
      return;
    }
    if (Tr())
    {
      a(false, 0L);
      a(false, 0L, 0L);
      e locale = e.iEG;
      e.a((String)h.xz().xi().get(w.a.uYU, ""), ((Long)h.xz().xi().get(w.a.uYV, Long.valueOf(0L))).longValue(), 2, e.Tv());
    }
    GMTrace.o(15412355923968L, 114831);
  }
  
  public static void a(boolean paramBoolean, long paramLong)
  {
    GMTrace.i(15411550617600L, 114825);
    if (!paramBoolean)
    {
      h.xz().xi().a(w.a.uYT, Long.valueOf(0L));
      GMTrace.o(15411550617600L, 114825);
      return;
    }
    if (paramLong == 0L) {}
    for (paramLong = Long.MAX_VALUE;; paramLong = bg.Po() + Math.max(0L, paramLong))
    {
      h.xz().xi().a(w.a.uYT, Long.valueOf(paramLong));
      h.xz().xi().a(w.a.uZf, Boolean.valueOf(true));
      h.xz().xi().a(w.a.uYZ, Boolean.valueOf(false));
      e locale = e.iEG;
      e.a((String)h.xz().xi().get(w.a.uYU, ""), ((Long)h.xz().xi().get(w.a.uYV, Long.valueOf(0L))).longValue(), 1, e.Tv());
      GMTrace.o(15411550617600L, 114825);
      return;
    }
  }
  
  public static void a(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    long l = 0L;
    GMTrace.i(15411684835328L, 114826);
    t localt = h.xz().xi();
    w.a locala = w.a.uZc;
    if (!paramBoolean) {}
    for (paramLong1 = l;; paramLong1 = Math.max(0L, paramLong1) + l)
    {
      localt.a(locala, Long.valueOf(paramLong1));
      localt = h.xz().xi();
      locala = w.a.uZe;
      if (!paramBoolean) {
        paramLong2 = Long.MAX_VALUE;
      }
      localt.a(locala, Long.valueOf(paramLong2));
      GMTrace.o(15411684835328L, 114826);
      return;
      l = bg.Po();
    }
  }
  
  static enum a
  {
    final int value;
    
    static
    {
      GMTrace.i(15411416399872L, 114824);
      iEv = new a("NONE", 0, 0);
      iEw = new a("REDDOT", 1, 1);
      iEx = new a("NEW", 2, 2);
      iEy = new a[] { iEv, iEw, iEx };
      GMTrace.o(15411416399872L, 114824);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(15411282182144L, 114823);
      this.value = paramInt;
      GMTrace.o(15411282182144L, 114823);
    }
  }
  
  public static final class b
    implements bp.a
  {
    private static final b iEz;
    
    static
    {
      GMTrace.i(15416114020352L, 114859);
      iEz = new b();
      GMTrace.o(15416114020352L, 114859);
    }
    
    private b()
    {
      GMTrace.i(15415442931712L, 114854);
      GMTrace.o(15415442931712L, 114854);
    }
    
    public static void Tu()
    {
      GMTrace.i(15415577149440L, 114855);
      c.Tg();
      ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("wxareddot", iEz, true);
      GMTrace.o(15415577149440L, 114855);
    }
    
    public static void op(String paramString)
    {
      GMTrace.i(16052842921984L, 119603);
      boolean bool = h.xx().wM();
      w.i("MicroMsg.AppBrandPushNewOrRedDotLogic", "parseThenProcess, accReady %b, received xml %s", new Object[] { Boolean.valueOf(bool), paramString });
      if (!bool)
      {
        GMTrace.o(16052842921984L, 119603);
        return;
      }
      paramString = bh.p(paramString, "sysmsg");
      if ((paramString == null) || (paramString.size() <= 0))
      {
        GMTrace.o(16052842921984L, 119603);
        return;
      }
      String str = (String)paramString.get(".sysmsg.wxareddot.id");
      int i = bg.getInt((String)paramString.get(".sysmsg.wxareddot.activitytype"), 0);
      if ((bg.mZ(str)) || ((i != 1) && (i != 2)))
      {
        GMTrace.o(16052842921984L, 119603);
        return;
      }
      int j = bg.getInt((String)paramString.get(".sysmsg.wxareddot.close"), 0);
      long l1 = bg.getLong((String)paramString.get(".sysmsg.wxareddot.pushtime"), 0L);
      long l2 = bg.getLong((String)paramString.get(".sysmsg.wxareddot.duration"), 0L);
      long l3 = bg.getLong((String)paramString.get(".sysmsg.wxareddot.frequency"), 0L);
      paramString.get(".sysmsg.wxareddot.tips");
      int k = bg.getInt((String)paramString.get(".sysmsg.wxareddot.showType"), 0);
      int m = bg.getInt((String)paramString.get(".sysmsg.wxareddot.reason"), 0);
      switch (i)
      {
      }
      do
      {
        do
        {
          GMTrace.o(16052842921984L, 119603);
          return;
        } while ((str.equals((String)h.xz().xi().get(w.a.uYU, null))) || (a.SZ()) || (bg.br(ab.getContext()).equals(AppBrandLauncherUI.class.getName())) || (c.Ti() == c.a.iEm));
        h.xz().xi().a(w.a.uYU, str);
        h.xz().xi().a(w.a.uYV, Long.valueOf(l1));
        h.xz().xi().a(w.a.uYW, Integer.valueOf(k));
        h.xz().xi().a(w.a.uYX, Integer.valueOf(m));
        if ((j == 1) && (d.Tr()))
        {
          paramString = d.e.iEG;
          d.e.a((String)h.xz().xi().get(w.a.uYU, ""), ((Long)h.xz().xi().get(w.a.uYV, Long.valueOf(0L))).longValue(), 4, d.e.Tv());
        }
        if (j != 1) {}
        for (bool = true;; bool = false)
        {
          d.a(bool, l2);
          GMTrace.o(16052842921984L, 119603);
          return;
        }
      } while (str.equals((String)h.xz().xi().get(w.a.uZb, null)));
      if (j != 1) {}
      for (bool = true;; bool = false)
      {
        d.a(bool, l2, l3);
        break;
      }
    }
    
    public static void unregister()
    {
      GMTrace.i(15415711367168L, 114856);
      c.Tg();
      ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("wxareddot", iEz, true);
      GMTrace.o(15415711367168L, 114856);
    }
    
    public final void a(final com.tencent.mm.ac.d.a parama)
    {
      GMTrace.i(15415845584896L, 114857);
      parama = com.tencent.mm.platformtools.n.a(parama.hme.tvq);
      if (bg.mZ(parama))
      {
        GMTrace.o(15415845584896L, 114857);
        return;
      }
      com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15413295448064L, 114838);
          d.b.op(parama);
          GMTrace.o(15413295448064L, 114838);
        }
      });
      GMTrace.o(15415845584896L, 114857);
    }
  }
  
  public static final class c
  {
    public c()
    {
      GMTrace.i(15413966536704L, 114843);
      GMTrace.o(15413966536704L, 114843);
    }
  }
  
  public static final class d
  {
    public final String[] iEF;
    
    public d()
    {
      GMTrace.i(15410208440320L, 114815);
      this.iEF = new String[9];
      Arrays.fill(this.iEF, "0");
      this.iEF[0] = ((String)h.xz().xi().get(w.a.uYU, ""));
      this.iEF[1] = String.valueOf(h.xz().xi().get(w.a.uYV, Long.valueOf(0L)));
      this.iEF[2] = String.valueOf(bg.Po());
      GMTrace.o(15410208440320L, 114815);
    }
  }
  
  static final class e
  {
    static final e iEG;
    
    static
    {
      GMTrace.i(15410879528960L, 114820);
      iEG = new e();
      GMTrace.o(15410879528960L, 114820);
    }
    
    e()
    {
      GMTrace.i(15410476875776L, 114817);
      GMTrace.o(15410476875776L, 114817);
    }
    
    static int Tv()
    {
      GMTrace.i(15410611093504L, 114818);
      if (h.xz().xi().c(w.a.uZa, false))
      {
        GMTrace.o(15410611093504L, 114818);
        return 1;
      }
      int j = ((Integer)h.xz().xi().get(w.a.uYX, Integer.valueOf(0))).intValue();
      int i = j;
      if (j > 0) {
        i = j + 1;
      }
      GMTrace.o(15410611093504L, 114818);
      return i;
    }
    
    static void a(String paramString, long paramLong, int paramInt1, int paramInt2)
    {
      GMTrace.i(15410745311232L, 114819);
      g.paX.i(14112, new Object[] { Integer.valueOf(1), bg.mY(paramString), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(15410745311232L, 114819);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */