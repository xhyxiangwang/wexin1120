package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.auj;
import com.tencent.mm.protocal.c.auk;

public final class e
  extends a<auk>
{
  private b hMN;
  private auj rBD;
  
  public e()
  {
    GMTrace.i(18415746023424L, 137208);
    this.rBD = null;
    b.a locala = new b.a();
    locala.hlX = new auj();
    locala.hlY = new auk();
    locala.hlW = 1211;
    locala.uri = "/cgi-bin/mmpay-bin/qryusrfunddetail";
    locala.hlZ = 0;
    locala.hma = 0;
    this.hMN = locala.DA();
    this.rBD = ((auj)this.hMN.hlU.hmc);
    this.rBD.time_stamp = ((int)System.currentTimeMillis());
    this.gMC = locala.DA();
    GMTrace.o(18415746023424L, 137208);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */