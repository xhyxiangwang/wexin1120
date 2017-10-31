package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.bl.b;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.c.a;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.bsv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.w.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class q
{
  public static Pair<AppBrandSysConfig, a.a> G(String paramString, boolean paramBoolean)
  {
    GMTrace.i(15540668071936L, 115787);
    if (ph(paramString))
    {
      paramString = new Pair(null, null);
      GMTrace.o(15540668071936L, 115787);
      return paramString;
    }
    paramString = a(paramString, paramBoolean, new a()
    {
      public final String getUsername()
      {
        GMTrace.i(17269258190848L, 128666);
        String str = this.hkC;
        GMTrace.o(17269258190848L, 128666);
        return str;
      }
      
      public final j pl(String paramAnonymousString)
      {
        GMTrace.i(17269392408576L, 128667);
        paramAnonymousString = new j(paramAnonymousString, null);
        GMTrace.o(17269392408576L, 128667);
        return paramAnonymousString;
      }
    });
    GMTrace.o(15540668071936L, 115787);
    return paramString;
  }
  
  public static void S(List<String> paramList)
  {
    int j = 0;
    GMTrace.i(15540802289664L, 115788);
    if (bg.bX(paramList))
    {
      GMTrace.o(15540802289664L, 115788);
      return;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      if (!pg((String)localIterator.next())) {
        localIterator.remove();
      }
    }
    if (bg.bX(paramList))
    {
      GMTrace.o(15540802289664L, 115788);
      return;
    }
    w.i("MicroMsg.WxaAttrSyncHelper", "batchSync, list size %d", new Object[] { Integer.valueOf(paramList.size()) });
    int i = 0;
    while (i < paramList.size() / 20)
    {
      int k = i * 20;
      j = k + 20;
      T(paramList.subList(k, j));
      i += 1;
    }
    if (j < paramList.size()) {
      T(paramList.subList(j, paramList.size()));
    }
    GMTrace.o(15540802289664L, 115788);
  }
  
  private static void T(List<String> paramList)
  {
    GMTrace.i(15540936507392L, 115789);
    if (bg.bX(paramList))
    {
      GMTrace.o(15540936507392L, 115789);
      return;
    }
    paramList = new i(paramList) {};
    com.tencent.mm.plugin.appbrand.o.d.xC().C(new i.1(paramList));
    GMTrace.o(15540936507392L, 115789);
  }
  
  public static <T> Pair<T, a.a> a(String paramString, boolean paramBoolean, a<T> parama)
  {
    a.a locala = null;
    GMTrace.i(17265902747648L, 128641);
    if (bg.mZ(paramString))
    {
      paramString = Pair.create(null, null);
      GMTrace.o(17265902747648L, 128641);
      return paramString;
    }
    Object localObject2;
    if (!paramBoolean)
    {
      localObject2 = parama.pm(paramString);
      localObject1 = localObject2;
      if (localObject2 != null) {
        if (!bg.mZ(parama.aI(localObject2))) {
          break label529;
        }
      }
    }
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      locala = c.b(parama.pl(paramString).gMC);
      if ((locala == null) || ((locala instanceof c.a)) || (locala.errType != 0) || (locala.errCode != 0))
      {
        int i;
        int j;
        if (locala == null)
        {
          i = -1;
          if (locala != null) {
            break label230;
          }
          j = -1;
          label133:
          if (locala != null) {
            break label240;
          }
        }
        label230:
        label240:
        for (localObject2 = "null resp";; localObject2 = locala.ftU)
        {
          w.e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, errType = %d, errCode = %d, errMsg = %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j), localObject2 });
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = parama.pm(paramString);
            if (localObject2 == null) {
              break label250;
            }
          }
          paramString = Pair.create(localObject2, locala);
          GMTrace.o(17265902747648L, 128641);
          return paramString;
          i = locala.errType;
          break;
          j = locala.errCode;
          break label133;
        }
        label250:
        paramString = Pair.create(null, locala);
        GMTrace.o(17265902747648L, 128641);
        return paramString;
      }
      localObject1 = ((bsv)locala.fPm).tBa.iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bsu)((Iterator)localObject1).next();
          if ("UserName".equalsIgnoreCase(((bsu)localObject2).tBb))
          {
            localObject2 = ((bsu)localObject2).paD;
            localObject1 = localObject2;
            if (((String)localObject2).endsWith("@app")) {
              break;
            }
          }
        }
      }
      for (localObject1 = (String)localObject2 + "@app";; localObject1 = null)
      {
        localObject2 = localObject1;
        if (bg.mZ((String)localObject1))
        {
          localObject1 = parama.getUsername();
          localObject2 = localObject1;
          if (bg.mZ((String)localObject1))
          {
            w.e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, key %s, cgi sync fail username invalid", new Object[] { Boolean.valueOf(paramBoolean), paramString });
            paramString = Pair.create(null, null);
            GMTrace.o(17265902747648L, 128641);
            return paramString;
          }
        }
        if (f.Sa().a((String)localObject2, ((bsv)locala.fPm).tAZ, ((bsv)locala.fPm).tBa)) {
          p.Up().a("single", 3, localObject2);
        }
        localObject2 = parama.pm(paramString);
        w.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, cgi sync result %s", new Object[] { Boolean.valueOf(paramBoolean), localObject2 });
        for (paramString = locala;; paramString = locala)
        {
          paramString = Pair.create(localObject2, paramString);
          GMTrace.o(17265902747648L, 128641);
          return paramString;
          label529:
          w.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, no need cgi sync, query record %s", new Object[] { Boolean.valueOf(paramBoolean), localObject2 });
        }
      }
    }
  }
  
  static void a(String paramString, final b<WxaAttributes> paramb)
  {
    GMTrace.i(18347294982144L, 136698);
    if (ph(paramString))
    {
      GMTrace.o(18347294982144L, 136698);
      return;
    }
    Looper localLooper;
    if ((af.isMainThread()) || (Looper.myLooper() == null)) {
      localLooper = new af().nTP.getLooper();
    }
    for (final boolean bool = true;; bool = false)
    {
      new ae(localLooper).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17266573836288L, 128646);
          Pair localPair = q.a(this.hkC, false, new q.a()
          {
            public final String getUsername()
            {
              GMTrace.i(17268452884480L, 128660);
              String str = q.4.this.hkC;
              GMTrace.o(17268452884480L, 128660);
              return str;
            }
            
            public final j pl(String paramAnonymous2String)
            {
              GMTrace.i(17268587102208L, 128661);
              paramAnonymous2String = new j(paramAnonymous2String, null);
              GMTrace.o(17268587102208L, 128661);
              return paramAnonymous2String;
            }
          });
          if (paramb != null) {
            paramb.aH(localPair.first);
          }
          if (bool) {
            try
            {
              ((HandlerThread)Looper.myLooper().getThread()).quit();
              GMTrace.o(17266573836288L, 128646);
              return;
            }
            catch (Exception localException) {}
          }
          GMTrace.o(17266573836288L, 128646);
        }
      });
      GMTrace.o(18347294982144L, 136698);
      return;
      localLooper = Looper.myLooper();
    }
  }
  
  static boolean pg(String paramString)
  {
    GMTrace.i(18347026546688L, 136696);
    long l2 = bg.Po();
    WxaAttributes localWxaAttributes = f.Sa().d(paramString, new String[] { "syncTimeSecond" });
    if (localWxaAttributes == null) {}
    for (long l1 = 0L;; l1 = localWxaAttributes.field_syncTimeSecond)
    {
      int i = g.uz().getInt("MMBizAttrSyncFreq", 3600);
      w.i("MicroMsg.WxaAttrSyncHelper", "needUpdateAttr, username(%s), currentMS(%d), lastUpdateTime(%d), freq(%d).", new Object[] { paramString, Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(i) });
      if (l2 - l1 < i) {
        break;
      }
      GMTrace.o(18347026546688L, 136696);
      return true;
    }
    GMTrace.o(18347026546688L, 136696);
    return false;
  }
  
  private static boolean ph(String paramString)
  {
    GMTrace.i(18347160764416L, 136697);
    if (bg.mZ(paramString))
    {
      GMTrace.o(18347160764416L, 136697);
      return false;
    }
    if (!h.eE(paramString))
    {
      w.e("MicroMsg.WxaAttrSyncHelper", "checkLogIfInvalidUsername %s, %s", new Object[] { paramString, ah.f(new Throwable()) });
      com.tencent.mm.plugin.report.d.oZR.a(648L, 1L, 1L, false);
      GMTrace.o(18347160764416L, 136697);
      return true;
    }
    GMTrace.o(18347160764416L, 136697);
    return false;
  }
  
  static b pi(String paramString)
  {
    GMTrace.i(17265768529920L, 128640);
    paramString = f.Sa().d(paramString, new String[] { "syncVersion" });
    if (paramString == null) {}
    for (paramString = new byte[0];; paramString = bg.RA(bg.mY(paramString.field_syncVersion)))
    {
      paramString = new b(paramString);
      GMTrace.o(17265768529920L, 128640);
      return paramString;
    }
  }
  
  public static void pj(final String paramString)
  {
    GMTrace.i(19889993547776L, 148192);
    if (!ph(paramString)) {
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15538923241472L, 115774);
          if (this.iJw)
          {
            q.G(paramString, true);
            GMTrace.o(15538923241472L, 115774);
            return;
          }
          q.pk(paramString);
          GMTrace.o(15538923241472L, 115774);
        }
      }, "WxaAttrSync");
    }
    GMTrace.o(19889993547776L, 148192);
  }
  
  public static AppBrandSysConfig pk(String paramString)
  {
    GMTrace.i(16160888193024L, 120408);
    if (ph(paramString))
    {
      GMTrace.o(16160888193024L, 120408);
      return null;
    }
    if (pg(paramString))
    {
      paramString = G(paramString, true);
      if ((paramString.first != null) && (paramString.second != null))
      {
        paramString = (AppBrandSysConfig)paramString.first;
        GMTrace.o(16160888193024L, 120408);
        return paramString;
      }
    }
    GMTrace.o(16160888193024L, 120408);
    return null;
  }
  
  static abstract interface a<T>
  {
    public abstract String aI(T paramT);
    
    public abstract String getUsername();
    
    public abstract j pl(String paramString);
    
    public abstract T pm(String paramString);
  }
  
  public static abstract interface b<T>
  {
    public abstract void aH(T paramT);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */