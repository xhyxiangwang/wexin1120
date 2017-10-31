package com.tencent.mm.wallet_core.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.i;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bgy;
import com.tencent.mm.protocal.c.bgz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.r;
import com.tencent.mm.x.m;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Vector;
import org.json.JSONObject;

public abstract class h
  extends com.tencent.mm.wallet_core.c.g
{
  public static Vector<String> xgK;
  protected boolean xgJ;
  
  static
  {
    GMTrace.i(1522834341888L, 11346);
    xgK = new Vector();
    int i = 0;
    while (i < c.tof.length)
    {
      xgK.add(c.tof[i]);
      i += 1;
    }
    GMTrace.o(1522834341888L, 11346);
  }
  
  public h()
  {
    GMTrace.i(1520821075968L, 11331);
    this.xgJ = false;
    GMTrace.o(1520821075968L, 11331);
  }
  
  private int d(com.tencent.mm.ac.b paramb)
  {
    GMTrace.i(1522163253248L, 11341);
    Object localObject1 = (bgy)paramb.hlU.hmc;
    if (((bgy)localObject1).ubH != null) {
      new String(((bgy)localObject1).ubH.ush.toK);
    }
    if (((bgy)localObject1).unH != null) {
      new String(((bgy)localObject1).unH.ush.toK);
    }
    r.ciT();
    if (this.xgJ)
    {
      Object localObject2 = (bgz)paramb.hlV.hmc;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new bgz();
      }
      localObject2 = "".getBytes();
      ((bgz)localObject1).ubI = new axs().bd((byte[])localObject2);
      ((bgz)localObject1).ubL = bvT();
      ((bgz)localObject1).ubJ = 0;
      try
      {
        localObject2 = new JSONObject(null);
        ((bgz)localObject1).unI = ((JSONObject)localObject2).optInt("TenpayErrType");
        ((bgz)localObject1).unJ = ((JSONObject)localObject2).optString("TenpayErrMsg");
        a(1, 0, 0, "", paramb, null);
        GMTrace.o(1522163253248L, 11341);
        return 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSenceTenPayBase", localException, "", new Object[0]);
        }
      }
    }
    GMTrace.o(1522163253248L, 11341);
    return -1;
  }
  
  public int Bc()
  {
    GMTrace.i(1522700124160L, 11345);
    GMTrace.o(1522700124160L, 11345);
    return 385;
  }
  
  public final String Jj(String paramString)
  {
    GMTrace.i(1521626382336L, 11337);
    paramString = TenpayUtil.signWith3Des(paramString);
    GMTrace.o(1521626382336L, 11337);
    return paramString;
  }
  
  public int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(1522431688704L, 11343);
    this.gMF = parame1;
    String str1 = this.gMC.uri;
    if (xgK.contains(str1))
    {
      w.d("MicroMsg.NetSenceTenPayBase", "black cgi bye bye %s", new Object[] { str1 });
      if (this.xgJ)
      {
        i = d(this.gMC);
        if (i != -1)
        {
          GMTrace.o(1522431688704L, 11343);
          return i;
        }
      }
    }
    else
    {
      a.ciD();
      w.i("MicroMsg.NetSenceTenPayBase", "cert try get errormsg %s", new Object[] { Integer.valueOf(a.getLastError()) });
      long l = System.currentTimeMillis();
      a.ciD();
      a.init(ab.getContext());
      bgy localbgy = (bgy)this.gMC.hlU.hmc;
      str1 = "";
      String str2 = "";
      if (localbgy.ubH != null) {
        str1 = new String(localbgy.ubH.ush.toK);
      }
      if (localbgy.unH != null) {
        str2 = new String(localbgy.unH.ush.toK);
      }
      str1 = new String((str1 + "&&" + str2).getBytes());
      q.ciR();
      str2 = q.ciQ();
      a.ciD();
      if (a.isCertExist(str2))
      {
        com.tencent.mm.plugin.report.service.g.paX.a(414L, 20L, 1L, true);
        a.ciD();
        String str3 = a.genUserSig(str2, str1);
        com.tencent.mm.plugin.report.service.g.paX.a(414L, 21L, System.currentTimeMillis() - l, true);
        w.v("MicroMsg.NetSenceTenPayBase", "sign ret src:%s sign:%s", new Object[] { str1, str3 });
        localbgy.sign = str3;
        localbgy.uyo = str2;
      }
      for (;;)
      {
        w.i("MicroMsg.NetSenceTenPayBase", "sign cost time %s cn %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str2 });
        break;
        a.ciD();
        w.i("MicroMsg.NetSenceTenPayBase", "cert not exist cn %s %s", new Object[] { str2, Integer.valueOf(a.getLastError()) });
      }
    }
    if (m.zS())
    {
      w.e("MicroMsg.NetSenceTenPayBase", "hy: serious error: is payupay");
      parame1.a(1000, -100868, "Pay Method Err", this);
      GMTrace.o(1522431688704L, 11343);
      return 1;
    }
    int i = a(parame, this.gMC, this);
    GMTrace.o(1522431688704L, 11343);
    return i;
  }
  
  public final void a(com.tencent.mm.ac.b paramb, axs paramaxs)
  {
    GMTrace.i(1521760600064L, 11338);
    ((bgy)paramb.hlU.hmc).ubH = paramaxs;
    GMTrace.o(1521760600064L, 11338);
  }
  
  public abstract int anK();
  
  public final void b(com.tencent.mm.ac.b paramb, axs paramaxs)
  {
    GMTrace.i(1521894817792L, 11339);
    ((bgy)paramb.hlU.hmc).unH = paramaxs;
    GMTrace.o(1521894817792L, 11339);
  }
  
  public boolean bie()
  {
    GMTrace.i(1521357946880L, 11335);
    GMTrace.o(1521357946880L, 11335);
    return true;
  }
  
  public int bvT()
  {
    GMTrace.i(1521089511424L, 11333);
    int i = anK();
    GMTrace.o(1521089511424L, 11333);
    return i;
  }
  
  public final l c(com.tencent.mm.ac.b paramb)
  {
    GMTrace.i(1522029035520L, 11340);
    paramb = (bgz)paramb.hlV.hmc;
    l locall = new l();
    locall.ubL = paramb.ubL;
    locall.ubK = paramb.ubK;
    locall.ubJ = paramb.ubJ;
    locall.ubI = paramb.ubI;
    locall.lpl = paramb.unJ;
    locall.xgg = paramb.unI;
    GMTrace.o(1522029035520L, 11340);
    return locall;
  }
  
  public final void cjb()
  {
    GMTrace.i(1522297470976L, 11342);
    this.xgJ = true;
    GMTrace.o(1522297470976L, 11342);
  }
  
  public int getType()
  {
    GMTrace.i(1521492164608L, 11336);
    GMTrace.o(1521492164608L, 11336);
    return 385;
  }
  
  public String getUri()
  {
    GMTrace.i(1522565906432L, 11344);
    GMTrace.o(1522565906432L, 11344);
    return "/cgi-bin/micromsg-bin/tenpay";
  }
  
  public void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1521223729152L, 11334);
    Object localObject1 = this.gMC;
    Object localObject2;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).hlX = new bgy();
      ((b.a)localObject1).hlY = new bgz();
      localObject2 = getUri();
      int i = Bc();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).hlW = i;
      ((b.a)localObject1).hlZ = 185;
      ((b.a)localObject1).hma = 1000000185;
      localObject1 = ((b.a)localObject1).DA();
      if (!bie())
      {
        bool = true;
        ((i)localObject1).hml = bool;
      }
    }
    for (;;)
    {
      localObject2 = (bgy)((com.tencent.mm.ac.b)localObject1).hlU.hmc;
      if (paramBoolean1) {
        ((bgy)localObject2).ubF = anK();
      }
      if (paramBoolean2) {
        ((bgy)localObject2).ubG = 1;
      }
      this.gMC = ((com.tencent.mm.ac.b)localObject1);
      GMTrace.o(1521223729152L, 11334);
      return;
      bool = false;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/f/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */