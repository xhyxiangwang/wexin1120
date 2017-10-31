package com.tencent.mm.plugin.wear.model.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bqz;
import com.tencent.mm.protocal.c.bra;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ay;

public final class b
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private com.tencent.mm.ac.b hEw;
  
  public b(String paramString)
  {
    GMTrace.i(9182103207936L, 68412);
    Object localObject = new b.a();
    ((b.a)localObject).hlW = 976;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendyo";
    ((b.a)localObject).hlX = new bqz();
    ((b.a)localObject).hlY = new bra();
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.hEw = ((b.a)localObject).DA();
    localObject = (bqz)this.hEw.hlU.hmc;
    ((bqz)localObject).mGA = paramString;
    ((bqz)localObject).uiS = ((bqz)localObject).orU;
    ((bqz)localObject).orU = ((int)ay.gB(paramString));
    ((bqz)localObject).jXP = 63;
    ((bqz)localObject).uGh = 1;
    ((bqz)localObject).jWQ = 1;
    GMTrace.o(9182103207936L, 68412);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9182505861120L, 68415);
    this.gMF = parame1;
    int i = a(parame, this.hEw, this);
    GMTrace.o(9182505861120L, 68415);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9182237425664L, 68413);
    w.i("MicroMsg.Wear.NetSceneSendYo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9182237425664L, 68413);
  }
  
  public final int getType()
  {
    GMTrace.i(9182371643392L, 68414);
    GMTrace.o(9182371643392L, 68414);
    return 976;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */