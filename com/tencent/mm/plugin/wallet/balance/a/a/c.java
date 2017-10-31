package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.atw;
import com.tencent.mm.protocal.c.atx;

public final class c
  extends a<atx>
{
  public c(String paramString, int paramInt)
  {
    GMTrace.i(18419772555264L, 137238);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new atw();
    ((b.a)localObject).hlY = new atx();
    ((b.a)localObject).hlW = 1276;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/purchasefund";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    localObject = ((b.a)localObject).DA();
    atw localatw = (atw)((b)localObject).hlU.hmc;
    localatw.upo = paramString;
    localatw.upp = paramInt;
    this.gMC = ((b)localObject);
    GMTrace.o(18419772555264L, 137238);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */