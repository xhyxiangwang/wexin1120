package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.wv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;

public final class d
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public d()
  {
    GMTrace.i(7601018372096L, 56632);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new wu();
    ((b.a)localObject).hlY = new wv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbottlecount";
    ((b.a)localObject).hlW = 152;
    ((b.a)localObject).hlZ = 49;
    ((b.a)localObject).hma = 1000000049;
    ((b.a)localObject).hmb = false;
    this.gMC = ((b.a)localObject).DA();
    localObject = (wu)this.gMC.hlU.hmc;
    ((wu)localObject).jWW = m.zF();
    ((wu)localObject).tUh = ((int)bg.Po());
    GMTrace.o(7601018372096L, 56632);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7601152589824L, 56633);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7601152589824L, 56633);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7601421025280L, 56635);
    paramp = (wv)this.gMC.hlV.hmc;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      c.kV(paramp.tUj);
      c.kU(paramp.tUi);
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneGetBottleCount", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3 + " ret:" + paramp.tyi + " pickCnt:" + paramp.tUj + " throwCnt:" + paramp.tUi);
      this.gMF.a(0, paramp.tyi, paramString, this);
      GMTrace.o(7601421025280L, 56635);
      return;
      if ((paramp.tyi == 63534) || (paramp.tyi == -56))
      {
        c.kV(0);
        c.kU(0);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7601286807552L, 56634);
    GMTrace.o(7601286807552L, 56634);
    return 152;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */