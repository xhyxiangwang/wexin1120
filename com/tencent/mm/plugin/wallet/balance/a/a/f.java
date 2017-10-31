package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.awc;

public final class f
  extends a<awc>
{
  public f(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(18422993780736L, 137262);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new awb();
    ((b.a)localObject).hlY = new awc();
    ((b.a)localObject).hlW = 1338;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/redeemfund";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    localObject = ((b.a)localObject).DA();
    awb localawb = (awb)((b)localObject).hlU.hmc;
    localawb.uok = paramInt;
    localawb.tJn = paramString1;
    localawb.uol = paramString2;
    this.gMC = ((b)localObject);
    GMTrace.o(18422993780736L, 137262);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */