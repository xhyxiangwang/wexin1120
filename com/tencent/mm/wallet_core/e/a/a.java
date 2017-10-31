package com.tencent.mm.wallet_core.e.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.i;
import com.tencent.mm.protocal.c.arw;
import com.tencent.mm.protocal.c.arx;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.x.m;
import com.tenpay.android.wechat.TenpayUtil;
import java.net.URLEncoder;

public abstract class a
  extends g
{
  public a()
  {
    GMTrace.i(1527800397824L, 11383);
    GMTrace.o(1527800397824L, 11383);
  }
  
  public final String Jj(String paramString)
  {
    GMTrace.i(1528471486464L, 11388);
    paramString = TenpayUtil.signWith3Des(paramString);
    GMTrace.o(1528471486464L, 11388);
    return paramString;
  }
  
  public int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(1529008357376L, 11392);
    this.gMF = parame1;
    if (!m.zS())
    {
      w.e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
      parame1.a(1000, -100868, "Pay Method Err", this);
      GMTrace.o(1529008357376L, 11392);
      return 1;
    }
    int i = a(parame, this.gMC, this);
    GMTrace.o(1529008357376L, 11392);
    return i;
  }
  
  public final void a(b paramb, axs paramaxs)
  {
    GMTrace.i(1528605704192L, 11389);
    ((arw)paramb.hlU.hmc).ubH = paramaxs;
    GMTrace.o(1528605704192L, 11389);
  }
  
  public final void b(b paramb, axs paramaxs)
  {
    GMTrace.i(1528739921920L, 11390);
    ((arw)paramb.hlU.hmc).unH = paramaxs;
    GMTrace.o(1528739921920L, 11390);
  }
  
  public final void b(StringBuilder paramStringBuilder, String paramString)
  {
    GMTrace.i(1529142575104L, 11393);
    paramStringBuilder.append(URLEncoder.encode(paramString));
    GMTrace.o(1529142575104L, 11393);
  }
  
  public final int bvT()
  {
    GMTrace.i(1528068833280L, 11385);
    int i = bwi();
    GMTrace.o(1528068833280L, 11385);
    return i;
  }
  
  public abstract int bwi();
  
  public final l c(b paramb)
  {
    GMTrace.i(1528874139648L, 11391);
    paramb = (arx)paramb.hlV.hmc;
    l locall = new l();
    locall.ubL = paramb.ubL;
    locall.ubK = paramb.ubK;
    locall.ubJ = paramb.ubJ;
    locall.ubI = paramb.ubI;
    locall.lpl = paramb.unJ;
    locall.xgg = paramb.unI;
    GMTrace.o(1528874139648L, 11391);
    return locall;
  }
  
  public final int getType()
  {
    GMTrace.i(1528337268736L, 11387);
    GMTrace.o(1528337268736L, 11387);
    return 1518;
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1528203051008L, 11386);
    Object localObject2 = this.gMC;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).hlX = new arw();
      ((b.a)localObject1).hlY = new arx();
      ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/payu";
      ((b.a)localObject1).hlW = 1518;
      ((b.a)localObject1).hlZ = 0;
      ((b.a)localObject1).hma = 0;
      localObject1 = ((b.a)localObject1).DA();
      ((i)localObject1).hml = true;
    }
    localObject2 = (arw)((b)localObject1).hlU.hmc;
    if (paramBoolean1) {
      ((arw)localObject2).ubF = bwi();
    }
    if (paramBoolean2) {
      ((arw)localObject2).ubG = 1;
    }
    this.gMC = ((b)localObject1);
    GMTrace.o(1528203051008L, 11386);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */