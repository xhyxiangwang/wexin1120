package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.zj;
import com.tencent.mm.protocal.c.zk;
import com.tencent.mm.sdk.platformtools.w;

public final class ag
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public ag()
  {
    GMTrace.i(6266223067136L, 46687);
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new zj();
    locala.hlY = new zk();
    locala.uri = "/cgi-bin/micromsg-bin/getfavinfo";
    locala.hlW = 438;
    locala.hlZ = 217;
    locala.hma = 1000000217;
    this.gMC = locala.DA();
    GMTrace.o(6266223067136L, 46687);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6266357284864L, 46688);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6266357284864L, 46688);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6266491502592L, 46689);
    w.d("MicroMsg.NetSceneGetFavInfo", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (zk)((b)paramp).hlV.hmc;
      w.v("MicroMsg.NetSceneGetFavInfo", "used:%d  total:%d  mxDown:%d  mxUp:%d  mxFile:%d", new Object[] { Long.valueOf(paramp.tvl), Long.valueOf(paramp.jXn), Integer.valueOf(paramp.tVZ), Integer.valueOf(paramp.tVY), Integer.valueOf(paramp.tVX) });
      x.ck(paramp.tvl);
      x.cl(paramp.jXn);
      x.cm(paramp.tVZ);
      x.cn(paramp.tVY);
      x.co(paramp.tVX);
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6266491502592L, 46689);
  }
  
  public final int getType()
  {
    GMTrace.i(6266625720320L, 46690);
    GMTrace.o(6266625720320L, 46690);
    return 438;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */