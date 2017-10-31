package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.auh;
import com.tencent.mm.protocal.c.aui;

public final class d
  extends a<aui>
{
  public d(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(18418564595712L, 137229);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new auh();
    ((b.a)localObject).hlY = new aui();
    ((b.a)localObject).hlW = 1283;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/qrypurchaseresult";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    localObject = ((b.a)localObject).DA();
    auh localauh = (auh)((b)localObject).hlU.hmc;
    localauh.upI = paramString1;
    localauh.oWy = paramString2;
    localauh.upp = paramInt;
    this.gMC = ((b)localObject);
    GMTrace.o(18418564595712L, 137229);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */