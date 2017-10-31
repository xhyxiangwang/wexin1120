package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.xk;
import com.tencent.mm.protocal.c.xl;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ac
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public int kmA;
  public LinkedList<String> kmw;
  public int kmy;
  public int kmz;
  
  public ac(String paramString)
  {
    GMTrace.i(4901228773376L, 36517);
    b.a locala = new b.a();
    locala.hlX = new xk();
    locala.hlY = new xl();
    locala.uri = "/cgi-bin/micromsg-bin/getcardserial";
    locala.hlW = 577;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((xk)this.gMC.hlU.hmc).fMv = paramString;
    GMTrace.o(4901228773376L, 36517);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4901497208832L, 36519);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4901497208832L, 36519);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4901631426560L, 36520);
    w.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (xl)this.gMC.hlV.hmc;
      this.kmw = paramp.kmw;
      this.kmy = paramp.kmy;
      this.kmz = paramp.kmz;
      this.kmA = paramp.kmA;
    }
    w.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", new Object[] { Integer.valueOf(this.kmy), Integer.valueOf(this.kmz), Integer.valueOf(this.kmA) });
    if (this.kmw != null) {
      w.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.kmw.size());
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4901631426560L, 36520);
  }
  
  public final int getType()
  {
    GMTrace.i(4901362991104L, 36518);
    GMTrace.o(4901362991104L, 36518);
    return 577;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */