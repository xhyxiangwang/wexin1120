package com.tencent.mm.plugin.appbrand.c;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.c.aeu;
import com.tencent.mm.protocal.c.aev;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public enum c
{
  private static volatile long iEd;
  private static volatile aev iEe;
  private static final Set<c> iEf;
  
  static
  {
    GMTrace.i(15409940004864L, 114813);
    iEg = new c[0];
    iEf = Collections.newSetFromMap(new ConcurrentHashMap());
    GMTrace.o(15409940004864L, 114813);
  }
  
  public static boolean Tg()
  {
    GMTrace.i(15408463609856L, 114802);
    GMTrace.o(15408463609856L, 114802);
    return true;
  }
  
  public static boolean Th()
  {
    GMTrace.i(15408597827584L, 114803);
    switch (3.iEl[Ti().ordinal()])
    {
    }
    do
    {
      GMTrace.o(15408597827584L, 114803);
      return false;
      GMTrace.o(15408597827584L, 114803);
      return false;
      GMTrace.o(15408597827584L, 114803);
      return true;
      if (Tj())
      {
        GMTrace.o(15408597827584L, 114803);
        return true;
      }
    } while (iEe == null);
    if (iEe.jMS >= iEe.uaA)
    {
      GMTrace.o(15408597827584L, 114803);
      return true;
    }
    GMTrace.o(15408597827584L, 114803);
    return false;
  }
  
  static a Ti()
  {
    int i = 0;
    GMTrace.i(15408866263040L, 114805);
    if (!h.xx().wM())
    {
      localObject = a.iEm;
      GMTrace.o(15408866263040L, 114805);
      return (a)localObject;
    }
    Object localObject = com.tencent.mm.x.c.c.Cu().em("100215");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      int j = bg.getInt((String)((com.tencent.mm.storage.c)localObject).bPn().get("isOpenNewNearEntry"), 0);
      localObject = a.values();
      int k = localObject.length;
      while (i < k)
      {
        a locala = localObject[i];
        if (locala.value == j)
        {
          GMTrace.o(15408866263040L, 114805);
          return locala;
        }
        i += 1;
      }
    }
    localObject = a.iEm;
    GMTrace.o(15408866263040L, 114805);
    return (a)localObject;
  }
  
  static boolean Tj()
  {
    GMTrace.i(15409000480768L, 114806);
    boolean bool = h.xz().xi().c(w.a.uZg, false);
    GMTrace.o(15409000480768L, 114806);
    return bool;
  }
  
  static void Tk()
  {
    GMTrace.i(15409134698496L, 114807);
    h.xz().xi().a(w.a.uZg, Boolean.valueOf(true));
    GMTrace.o(15409134698496L, 114807);
  }
  
  public static aev Tl()
  {
    GMTrace.i(15409403133952L, 114809);
    aev localaev = iEe;
    GMTrace.o(15409403133952L, 114809);
    return localaev;
  }
  
  public static boolean Tm()
  {
    GMTrace.i(15409537351680L, 114810);
    long l2 = bg.Po();
    if ((!h.xx().wM()) || (iEe == null)) {}
    for (long l1 = 0L; l2 >= l1; l1 = iEd)
    {
      GMTrace.o(15409537351680L, 114810);
      return true;
    }
    GMTrace.o(15409537351680L, 114810);
    return false;
  }
  
  public static void Tn()
  {
    GMTrace.i(15409671569408L, 114811);
    iEe = null;
    GMTrace.o(15409671569408L, 114811);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(15408195174400L, 114800);
    if (paramc == null)
    {
      GMTrace.o(15408195174400L, 114800);
      return;
    }
    iEf.add(paramc);
    GMTrace.o(15408195174400L, 114800);
  }
  
  public static void b(c paramc)
  {
    GMTrace.i(15408329392128L, 114801);
    if (paramc == null)
    {
      GMTrace.o(15408329392128L, 114801);
      return;
    }
    iEf.remove(paramc);
    GMTrace.o(15408329392128L, 114801);
  }
  
  public static boolean refresh()
  {
    GMTrace.i(15408732045312L, 114804);
    iEe = null;
    iEd = 0L;
    final Object localObject = Ti();
    if (a.iEm == localObject)
    {
      GMTrace.o(15408732045312L, 114804);
      return false;
    }
    localObject = new PBool();
    final PBool localPBool = new PBool();
    ((PBool)localObject).value = false;
    localPBool.value = false;
    aj localaj = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(16284771155968L, 121331);
        if (this.iEh.value)
        {
          GMTrace.o(16284771155968L, 121331);
          return false;
        }
        localObject.value = true;
        c.a(null);
        GMTrace.o(16284771155968L, 121331);
        return false;
      }
    }, false);
    long l = TimeUnit.SECONDS.toMillis(20L);
    localaj.w(l, l);
    localObject = (a.a)com.tencent.mm.plugin.appbrand.o.d.aQ(new a.a()
    {
      private int iEj;
      
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(16284502720512L, 121329);
        com.tencent.mm.plugin.appbrand.o.d.aR(this);
        com.tencent.mm.modelgeo.c.Io().c(this);
        paramAnonymousInt = this.iEj + 1;
        this.iEj = paramAnonymousInt;
        if ((paramAnonymousInt > 1) || (this.iEi.value))
        {
          GMTrace.o(16284502720512L, 121329);
          return false;
        }
        localPBool.value = true;
        if (!paramAnonymousBoolean)
        {
          c.a(null);
          GMTrace.o(16284502720512L, 121329);
          return false;
        }
        b.a locala = new b.a();
        locala.hlW = 1056;
        locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxaappnearby";
        aeu localaeu = new aeu();
        localaeu.uat = paramAnonymousFloat1;
        localaeu.uau = paramAnonymousFloat2;
        if (!c.Tj()) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          localaeu.uaw = paramAnonymousBoolean;
          locala.hlX = localaeu;
          locala.hlY = new aev();
          u.a(locala.DA(), new u.a()
          {
            public final int a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, b paramAnonymous2b, k paramAnonymous2k)
            {
              GMTrace.i(16284234285056L, 121327);
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0) && (paramAnonymous2b != null) && (paramAnonymous2b.hlV.hmc != null) && ((paramAnonymous2b.hlV.hmc instanceof aev))) {
                c.a((aev)paramAnonymous2b.hlV.hmc);
              }
              for (;;)
              {
                GMTrace.o(16284234285056L, 121327);
                return 0;
                w.e("MicroMsg.AppBrandNearbyLogic", "refresh() cgi return errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
                c.a(null);
              }
            }
          }, true);
          GMTrace.o(16284502720512L, 121329);
          return false;
        }
      }
    });
    com.tencent.mm.modelgeo.c.Io().b((a.a)localObject, false);
    GMTrace.o(15408732045312L, 114804);
    return true;
  }
  
  static enum a
  {
    final int value;
    
    static
    {
      GMTrace.i(15414637625344L, 114848);
      iEm = new a("FORCE_OFF", 0, 0);
      iEn = new a("FORCE_ON", 1, 1);
      iEo = new a("DYNAMIC_THRESHOLD", 2, 2);
      iEp = new a[] { iEm, iEn, iEo };
      GMTrace.o(15414637625344L, 114848);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(15414503407616L, 114847);
      this.value = paramInt;
      GMTrace.o(15414503407616L, 114847);
    }
  }
  
  public static enum b
  {
    final int value;
    
    static
    {
      GMTrace.i(19886101233664L, 148163);
      iEq = new b("DEFAULT", 0, 0);
      iEr = new b("SHOW_COUNT", 1, 1);
      iEs = new b("SHOW_WORDING", 2, 2);
      iEt = new b[] { iEq, iEr, iEs };
      GMTrace.o(19886101233664L, 148163);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(19885832798208L, 148161);
      this.value = paramInt;
      GMTrace.o(19885832798208L, 148161);
    }
    
    public static b hR(int paramInt)
    {
      GMTrace.i(19885967015936L, 148162);
      Object localObject = values();
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        b localb = localObject[i];
        if (localb.value == paramInt)
        {
          GMTrace.o(19885967015936L, 148162);
          return localb;
        }
        i += 1;
      }
      localObject = iEq;
      GMTrace.o(19885967015936L, 148162);
      return (b)localObject;
    }
  }
  
  public static abstract interface c
  {
    public abstract void To();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */