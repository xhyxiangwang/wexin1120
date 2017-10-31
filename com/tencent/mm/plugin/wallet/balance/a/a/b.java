package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.ast;

public final class b
  extends a<ast>
{
  public b(int paramInt)
  {
    GMTrace.i(18416148676608L, 137211);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ass();
    ((b.a)localObject).hlY = new ast();
    ((b.a)localObject).hlW = 1324;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/preredeemfund";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    localObject = ((b.a)localObject).DA();
    ((ass)((com.tencent.mm.ac.b)localObject).hlU.hmc).uok = paramInt;
    this.gMC = ((com.tencent.mm.ac.b)localObject);
    GMTrace.o(18416148676608L, 137211);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */