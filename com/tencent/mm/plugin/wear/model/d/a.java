package com.tencent.mm.plugin.wear.model.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.afw;
import com.tencent.mm.protocal.c.afx;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends k
  implements j
{
  public String flE;
  public String fxj;
  private com.tencent.mm.ac.e gMF;
  private com.tencent.mm.ac.b hEw;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(9180224159744L, 68398);
    this.flE = paramString1;
    this.fxj = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).hlW = 1091;
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/register";
    ((b.a)localObject).hlX = new afw();
    ((b.a)localObject).hlY = new afx();
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.hEw = ((b.a)localObject).DA();
    localObject = (afw)this.hEw.hlU.hmc;
    ((afw)localObject).tyP = new com.tencent.mm.bl.b(paramString1.getBytes());
    ((afw)localObject).tyR = new com.tencent.mm.bl.b(paramString2.getBytes());
    ((afw)localObject).ubs = new com.tencent.mm.bl.b("5".getBytes());
    GMTrace.o(9180224159744L, 68398);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9180492595200L, 68400);
    this.gMF = parame1;
    int i = a(parame, this.hEw, this);
    GMTrace.o(9180492595200L, 68400);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9180626812928L, 68401);
    w.i("MicroMsg.Wear.NetSceneBizDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9180626812928L, 68401);
  }
  
  public final int getType()
  {
    GMTrace.i(9180358377472L, 68399);
    GMTrace.o(9180358377472L, 68399);
    return 1091;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */