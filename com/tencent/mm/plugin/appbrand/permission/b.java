package com.tencent.mm.plugin.appbrand.permission;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.protocal.c.aiq;
import com.tencent.mm.protocal.c.air;
import com.tencent.mm.protocal.c.ais;
import com.tencent.mm.protocal.c.ait;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public final class b
{
  public static final LinkedList<Runnable> jnl;
  public static final a jnm;
  public static boolean jnn;
  public final String iqL;
  public final b jnj;
  public final String jnk;
  
  static
  {
    GMTrace.i(10568438120448L, 78741);
    jnl = new LinkedList();
    jnm = new a();
    jnn = false;
    GMTrace.o(10568438120448L, 78741);
  }
  
  private b(b paramb, String paramString1, String paramString2)
  {
    GMTrace.i(10566424854528L, 78726);
    this.jnj = paramb;
    this.iqL = paramString1;
    this.jnk = paramString2;
    GMTrace.o(10566424854528L, 78726);
  }
  
  public static void a(final String paramString1, final String paramString2, final b paramb)
  {
    GMTrace.i(10566827507712L, 78729);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
    {
      GMTrace.o(10566827507712L, 78729);
      return;
    }
    paramb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19691753963520L, 146715);
        b.b(this.fnb, paramString2, new b.c(paramb));
        GMTrace.o(19691753963520L, 146715);
      }
    };
    d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19692022398976L, 146717);
        if (b.jnn)
        {
          b.jnl.add(this.jnu);
          w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, another request already running, put this in queue, appId %s, api %s", new Object[] { paramString1, paramString2 });
          GMTrace.o(19692022398976L, 146717);
          return;
        }
        b.jnn = true;
        this.jnu.run();
        GMTrace.o(19692022398976L, 146717);
      }
    });
    GMTrace.o(10566827507712L, 78729);
  }
  
  public static void b(String paramString1, String paramString2, b paramb)
  {
    GMTrace.i(16057540542464L, 119638);
    if (jnm.be(paramString1, paramString2))
    {
      w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, before cgi, appId %s, api %s, found in AUTH_CACHE, return ok", new Object[] { paramString1, paramString2 });
      paramb.Zu();
      GMTrace.o(16057540542464L, 119638);
      return;
    }
    w.i("MicroMsg.AppBrandJsApiUserAuth", "requestUSerAuth, before cgi, appId %s, api %s", new Object[] { paramString1, paramString2 });
    paramString1 = new b(paramb, paramString1, paramString2);
    paramString2 = new com.tencent.mm.ac.b.a();
    paramString2.hlW = 1116;
    paramString2.uri = "/cgi-bin/mmbiz-bin/js-userauth";
    paramb = new aiq();
    paramb.mDD = paramString1.iqL;
    paramb.uds = paramString1.jnk;
    paramString2.hlX = paramb;
    paramString2.hlY = new air();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(paramString2.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(10559982403584L, 78678);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
        {
          w.e("MicroMsg.AppBrandJsApiUserAuth", "checkAuth, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
          b.jnm.x(b.this.iqL, b.this.jnk);
          b.this.jnj.Zv();
          GMTrace.o(10559982403584L, 78678);
          return;
        }
        paramAnonymousString = b.this;
        Object localObject = (air)paramAnonymousb.hlV.hmc;
        w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, appId %s, api %s, checkAuth Response.errcode %d", new Object[] { paramAnonymousString.iqL, paramAnonymousString.jnk, Integer.valueOf(((air)localObject).udg.fzx) });
        if (((air)localObject).udg.fzx == 0)
        {
          b.jnm.put(paramAnonymousString.iqL, paramAnonymousString.jnk);
          paramAnonymousString.jnj.Zu();
          GMTrace.o(10559982403584L, 78678);
          return;
        }
        if (((air)localObject).udg.fzx != 53536)
        {
          paramAnonymousString.jnj.Zv();
          GMTrace.o(10559982403584L, 78678);
          return;
        }
        paramAnonymousb = ((air)localObject).tBZ;
        localObject = ((air)localObject).udt;
        af.u(new b.3(paramAnonymousString, com.tencent.mm.plugin.appbrand.a.nv(paramAnonymousString.iqL), paramAnonymousb, (String)localObject));
        GMTrace.o(10559982403584L, 78678);
      }
    });
    GMTrace.o(16057540542464L, 119638);
  }
  
  public static boolean bd(String paramString1, String paramString2)
  {
    GMTrace.i(10566693289984L, 78728);
    boolean bool = jnm.be(paramString1, paramString2);
    GMTrace.o(10566693289984L, 78728);
    return bool;
  }
  
  public final void aq(String paramString, final int paramInt)
  {
    GMTrace.i(16057406324736L, 119637);
    com.tencent.mm.ac.b.a locala = new com.tencent.mm.ac.b.a();
    locala.hlW = 1027;
    locala.uri = "/cgi-bin/mmbiz-bin/js-usersetauth";
    ais localais = new ais();
    localais.mDD = this.iqL;
    localais.tBX = paramString;
    localais.udd = paramInt;
    locala.hlX = localais;
    locala.hlY = new ait();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(10561593016320L, 78690);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
        {
          w.e("MicroMsg.AppBrandJsApiUserAuth", "setAuth, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
          GMTrace.o(10561593016320L, 78690);
          return;
        }
        if ((((ait)paramAnonymousb.hlV.hmc).udg.fzx == 0) && (1 == paramInt))
        {
          w.i("MicroMsg.AppBrandJsApiUserAuth", "setAuth, add allow cache appId = %s, api = %s", new Object[] { b.this.iqL, b.this.jnk });
          b.jnm.put(b.this.iqL, b.this.jnk);
          GMTrace.o(10561593016320L, 78690);
          return;
        }
        GMTrace.o(10561593016320L, 78690);
      }
    });
    GMTrace.o(16057406324736L, 119637);
  }
  
  private static final class a
  {
    final HashMap<String, HashSet<String>> jnv;
    
    public a()
    {
      GMTrace.i(14432432291840L, 107530);
      this.jnv = new HashMap();
      GMTrace.o(14432432291840L, 107530);
    }
    
    /* Error */
    final boolean be(String paramString1, String paramString2)
    {
      // Byte code:
      //   0: ldc2_w 35
      //   3: ldc 37
      //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_1
      //   9: invokestatic 43	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
      //   12: ifne +10 -> 22
      //   15: aload_2
      //   16: invokestatic 43	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
      //   19: ifeq +13 -> 32
      //   22: ldc2_w 35
      //   25: ldc 37
      //   27: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   30: iconst_0
      //   31: ireturn
      //   32: aload_0
      //   33: monitorenter
      //   34: aload_0
      //   35: getfield 28	com/tencent/mm/plugin/appbrand/permission/b$a:jnv	Ljava/util/HashMap;
      //   38: aload_1
      //   39: invokevirtual 47	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   42: checkcast 49	java/util/HashSet
      //   45: astore_1
      //   46: aload_1
      //   47: ifnull +25 -> 72
      //   50: aload_1
      //   51: aload_2
      //   52: invokevirtual 53	java/util/HashSet:contains	(Ljava/lang/Object;)Z
      //   55: ifeq +17 -> 72
      //   58: iconst_1
      //   59: istore_3
      //   60: aload_0
      //   61: monitorexit
      //   62: ldc2_w 35
      //   65: ldc 37
      //   67: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   70: iload_3
      //   71: ireturn
      //   72: iconst_0
      //   73: istore_3
      //   74: goto -14 -> 60
      //   77: astore_1
      //   78: aload_0
      //   79: monitorexit
      //   80: aload_1
      //   81: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	82	0	this	a
      //   0	82	1	paramString1	String
      //   0	82	2	paramString2	String
      //   59	15	3	bool	boolean
      // Exception table:
      //   from	to	target	type
      //   34	46	77	finally
      //   50	58	77	finally
      //   60	62	77	finally
      //   78	80	77	finally
    }
    
    final void put(String paramString1, String paramString2)
    {
      GMTrace.i(14432700727296L, 107532);
      if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
      {
        GMTrace.o(14432700727296L, 107532);
        return;
      }
      try
      {
        HashSet localHashSet2 = (HashSet)this.jnv.get(paramString1);
        HashSet localHashSet1 = localHashSet2;
        if (localHashSet2 == null)
        {
          localHashSet1 = new HashSet();
          this.jnv.put(paramString1, localHashSet1);
        }
        localHashSet1.add(paramString2);
        GMTrace.o(14432700727296L, 107532);
        return;
      }
      finally {}
    }
    
    final void x(String paramString1, String paramString2)
    {
      GMTrace.i(14432834945024L, 107533);
      if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)))
      {
        GMTrace.o(14432834945024L, 107533);
        return;
      }
      try
      {
        paramString1 = (HashSet)this.jnv.get(paramString1);
        if (paramString1 != null) {
          paramString1.remove(paramString2);
        }
        GMTrace.o(14432834945024L, 107533);
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface b
  {
    public abstract void Zu();
    
    public abstract void Zv();
    
    public abstract void onCancel();
  }
  
  private static final class c
    implements b.b
  {
    private final b.b jnw;
    
    public c(b.b paramb)
    {
      GMTrace.i(10561995669504L, 78693);
      this.jnw = paramb;
      GMTrace.o(10561995669504L, 78693);
    }
    
    private void Zw()
    {
      GMTrace.i(10562532540416L, 78697);
      d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10565887983616L, 78722);
          Runnable localRunnable = (Runnable)b.jnl.pollFirst();
          if (localRunnable != null)
          {
            localRunnable.run();
            GMTrace.o(10565887983616L, 78722);
            return;
          }
          w.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, poll null from queue, all requests done");
          b.jnn = false;
          GMTrace.o(10565887983616L, 78722);
        }
      });
      GMTrace.o(10562532540416L, 78697);
    }
    
    public final void Zu()
    {
      GMTrace.i(10562129887232L, 78694);
      if (this.jnw != null) {
        this.jnw.Zu();
      }
      Zw();
      GMTrace.o(10562129887232L, 78694);
    }
    
    public final void Zv()
    {
      GMTrace.i(10562264104960L, 78695);
      if (this.jnw != null) {
        this.jnw.Zv();
      }
      Zw();
      GMTrace.o(10562264104960L, 78695);
    }
    
    public final void onCancel()
    {
      GMTrace.i(10562398322688L, 78696);
      if (this.jnw != null) {
        this.jnw.onCancel();
      }
      Zw();
      GMTrace.o(10562398322688L, 78696);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/permission/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */