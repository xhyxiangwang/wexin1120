package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.yd;
import com.tencent.mm.protocal.c.ye;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public e(String paramString)
  {
    GMTrace.i(9511473512448L, 70866);
    w.i("MicroMsg.NetSceneGetConnectInfo", "summerbak NetSceneGetConnectInfo init, url[%s], stack[%s]", new Object[] { paramString, bg.bOd() });
    b.a locala = new b.a();
    locala.hlX = new yd();
    locala.hlY = new ye();
    locala.uri = "/cgi-bin/micromsg-bin/getconnectinfo";
    locala.hlZ = 0;
    locala.hma = 0;
    locala.hlW = 595;
    this.gMC = locala.DA();
    ((yd)this.gMC.hlU.hmc).URL = paramString;
    GMTrace.o(9511473512448L, 70866);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9511741947904L, 70868);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(9511741947904L, 70868);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9512010383360L, 70870);
    w.i("MicroMsg.NetSceneGetConnectInfo", "onGYNetEnd errType[%d], errCode[%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = afa();
      com.tencent.mm.plugin.backup.a.e.P(paramp.txQ.ush.toK);
      w.i("MicroMsg.NetSceneGetConnectInfo", "onGYNetEnd id[%s], hello[%s], ok[%s], PCName[%s], PCAcctName[%s], scene[%d], resource[%s]", new Object[] { paramp.ID, paramp.tym, paramp.tyn, paramp.tye, paramp.tyf, Integer.valueOf(paramp.ttY), paramp.tUZ });
      paramp = paramp.txQ.ush;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9512010383360L, 70870);
  }
  
  public final ye afa()
  {
    GMTrace.i(18462319575040L, 137555);
    ye localye = (ye)this.gMC.hlV.hmc;
    GMTrace.o(18462319575040L, 137555);
    return localye;
  }
  
  public final int getType()
  {
    GMTrace.i(9511607730176L, 70867);
    GMTrace.o(9511607730176L, 70867);
    return 595;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */