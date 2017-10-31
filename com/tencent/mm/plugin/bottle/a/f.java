package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ab.h;
import com.tencent.mm.ab.i;
import com.tencent.mm.ab.n;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.protocal.c.ase;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import java.util.Map;

public final class f
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  boolean keU;
  
  public f()
  {
    GMTrace.i(7595649662976L, 56592);
    this.keU = false;
    b.a locala = new b.a();
    locala.hlX = new asd();
    locala.hlY = new ase();
    locala.uri = "/cgi-bin/micromsg-bin/pickbottle";
    locala.hlW = 155;
    locala.hlZ = 54;
    locala.hma = 1000000054;
    this.gMC = locala.DA();
    GMTrace.o(7595649662976L, 56592);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7595783880704L, 56593);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7595783880704L, 56593);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7596052316160L, 56595);
    w.d("MicroMsg.NetScenePickBottle", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    if ((paramInt2 == 4) && ((paramInt3 == 63534) || (paramInt3 == -56)))
    {
      c.kU(0);
      c.kV(0);
    }
    paramArrayOfByte = (ase)this.gMC.hlV.hmc;
    if (paramInt2 == 4) {
      switch (paramInt3)
      {
      default: 
        c.kV(paramArrayOfByte.tUj);
        c.kU(paramArrayOfByte.tUi);
      }
    }
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.keU = true;
      w.d("MicroMsg.NetScenePickBottle", "bottle pack:pack:" + paramArrayOfByte.tUj + " throw:" + paramArrayOfByte.tUi);
      paramp = null;
      if (paramArrayOfByte.umm != null) {
        paramp = paramArrayOfByte.umm.split(":");
      }
      x localx;
      if ((paramp != null) && (paramp.length >= 2))
      {
        str = paramp[0];
        ap.AS();
        paramp = com.tencent.mm.x.c.yL().SL(str);
        if ((paramp == null) || (!paramp.field_username.equals(str)))
        {
          localx = new x();
          localx.setUsername(str);
          if (paramArrayOfByte.jYc != null) {
            break label855;
          }
          paramp = "";
          localx.cg(paramp);
          localx.dn(3);
          paramp = new h();
          paramp.username = str;
          paramp.gbL = 3;
          paramp.bf(true);
          paramp.fJg = -1;
        }
      }
      try
      {
        Map localMap = bh.p(paramArrayOfByte.tWf, "userinfo");
        if (localMap != null)
        {
          localx.jdMethod_do(bg.getInt((String)localMap.get(".userinfo.$sex"), 0));
          localx.ct((String)localMap.get(".userinfo.$signature"));
          localx.cz(RegionCodeDecoder.ae((String)localMap.get(".userinfo.$country"), (String)localMap.get(".userinfo.$province"), (String)localMap.get(".userinfo.$city")));
          w.d("MicroMsg.NetScenePickBottle", "user:" + str + " sig:" + localx.signature + " sex" + localx.gbM + " city:" + localx.getCity() + " prov:" + localx.getProvince());
          paramp.hlm = ((String)localMap.get(".userinfo.$bigheadimgurl"));
          paramp.hll = ((String)localMap.get(".userinfo.$smallheadimgurl"));
          paramp.fJg = -1;
          w.d("MicroMsg.NetScenePickBottle", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { str, paramp.Do(), paramp.Dp() });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.NetScenePickBottle", "Set Contact failed " + localException.getMessage() + " user:" + str);
        }
      }
      ap.AS();
      com.tencent.mm.x.c.yL().P(localx);
      n.Di().a(paramp);
      w.d("MicroMsg.NetScenePickBottle", "getBottleType " + paramArrayOfByte.unO);
      w.d("MicroMsg.NetScenePickBottle", "getMsgType " + paramArrayOfByte.mDF);
      w.d("MicroMsg.NetScenePickBottle", "getBottleInfo " + paramArrayOfByte.umm);
      w.d("MicroMsg.NetScenePickBottle", "getUserInfo " + paramArrayOfByte.tWf);
      w.d("MicroMsg.NetScenePickBottle", "getNickName " + paramArrayOfByte.jYc);
      w.d("MicroMsg.NetScenePickBottle", "getUserStatus " + paramArrayOfByte.unP);
      w.d("MicroMsg.NetScenePickBottle", "getThrowCount " + paramArrayOfByte.tUi);
      w.d("MicroMsg.NetScenePickBottle", "getPickCount " + paramArrayOfByte.tUj);
      w.d("MicroMsg.NetScenePickBottle", "getDistance " + paramArrayOfByte.unQ);
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7596052316160L, 56595);
      return;
      label855:
      paramp = paramArrayOfByte.jYc;
      break;
      if (paramInt3 == -56)
      {
        c.kV(paramArrayOfByte.tUj);
        c.kV(paramArrayOfByte.tUi);
      }
    }
  }
  
  final ase agU()
  {
    GMTrace.i(7596186533888L, 56596);
    ase localase = (ase)this.gMC.hlV.hmc;
    GMTrace.o(7596186533888L, 56596);
    return localase;
  }
  
  public final int getType()
  {
    GMTrace.i(7595918098432L, 56594);
    GMTrace.o(7595918098432L, 56594);
    return 155;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */