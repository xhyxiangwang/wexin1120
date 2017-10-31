package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.mu;
import com.tencent.mm.protocal.c.mv;

public final class a
  extends com.tencent.mm.ac.a<mv>
{
  public a(String paramString)
  {
    GMTrace.i(18415343370240L, 137205);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new mu();
    ((b.a)localObject).hlY = new mv();
    ((b.a)localObject).hlW = 1386;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/closefundaccount";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    localObject = ((b.a)localObject).DA();
    ((mu)((b)localObject).hlU.hmc).tJn = paramString;
    this.gMC = ((b)localObject);
    GMTrace.o(18415343370240L, 137205);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */