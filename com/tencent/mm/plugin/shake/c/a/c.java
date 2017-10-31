package com.tencent.mm.plugin.shake.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.bbe;
import com.tencent.mm.protocal.c.bbf;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  e pvX;
  
  public c(float paramFloat1, float paramFloat2, int paramInt, String paramString)
  {
    GMTrace.i(6522847363072L, 48599);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bbe();
    ((b.a)localObject).hlY = new bbf();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/shakecard";
    ((b.a)localObject).hlW = 1250;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bbe)this.gMC.hlU.hmc;
    ((bbe)localObject).fFh = paramFloat2;
    ((bbe)localObject).fGL = paramFloat1;
    ((bbe)localObject).scene = paramInt;
    ((bbe)localObject).utx = paramString;
    GMTrace.o(6522847363072L, 48599);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6523115798528L, 48601);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6523115798528L, 48601);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6523250016256L, 48602);
    w.i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = 1250" + " errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (bbf)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.pvX = new e();
        this.pvX.kpb = paramp.kpb;
        this.pvX.knp = paramp.knp;
        this.pvX.fMw = paramp.fMw;
        this.pvX.title = paramp.title;
        this.pvX.kns = paramp.kns;
        this.pvX.knt = paramp.knt;
        this.pvX.koD = paramp.koD;
        this.pvX.knr = paramp.knr;
        this.pvX.hbA = paramp.hbA;
        this.pvX.pvY = paramp.pvY;
        this.pvX.pwb = paramp.pwb;
        this.pvX.pwc = paramp.pwc;
        this.pvX.pwd = paramp.pwd;
        this.pvX.pwe = paramp.pwe;
        this.pvX.pwf = paramp.pwf;
        this.pvX.knw = paramp.knw;
        this.pvX.pwg = paramp.pwg;
        this.pvX.pwh = paramp.pwh;
        m.bdC().pwa = this.pvX.pwf;
      }
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6523250016256L, 48602);
      return;
      this.pvX = new e();
      this.pvX.kpb = 3;
      this.pvX.pwf = m.bdC().pwa;
      continue;
      this.pvX = new e();
      this.pvX.kpb = 3;
      this.pvX.pwf = m.bdC().pwa;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6522981580800L, 48600);
    GMTrace.o(6522981580800L, 48600);
    return 1250;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */