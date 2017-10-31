package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private atf mYZ;
  public atg mZa;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(11584600539136L, 86312);
    this.gMC = null;
    this.mYZ = null;
    this.mZa = null;
    b.a locala = new b.a();
    locala.hlX = new atf();
    locala.hlY = new atg();
    locala.hlW = 807;
    locala.uri = "/cgi-bin/micromsg-bin/pstnchecknumber";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.mYZ = ((atf)this.gMC.hlU.hmc);
    this.mYZ.uoN = paramString1;
    this.mYZ.uoP = paramString2;
    this.mYZ.uoR = paramString3;
    this.mYZ.uoQ = paramString4;
    this.mYZ.uoS = paramInt;
    w.i("MicroMsg.NetSceneIPCallCheckNumber", "NetSceneIPCallCheckNumber pureNumber:%s,lastCountry:%s,osCountry:%s,simCountry:%s,dialScene:%d", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramInt) });
    GMTrace.o(11584600539136L, 86312);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11584868974592L, 86314);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11584868974592L, 86314);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11585003192320L, 86315);
    w.i("MicroMsg.NetSceneIPCallCheckNumber", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZa = ((atg)((com.tencent.mm.ac.b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11585003192320L, 86315);
  }
  
  public final int getType()
  {
    GMTrace.i(11584734756864L, 86313);
    GMTrace.o(11584734756864L, 86313);
    return 807;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */