package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.ry;
import com.tencent.mm.g.a.ry.a;
import com.tencent.mm.g.a.ry.b;
import com.tencent.mm.plugin.wallet_core.b.a.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;

public final class j
  extends com.tencent.mm.sdk.b.c<ry>
{
  public j()
  {
    GMTrace.i(19536866705408L, 145561);
    this.uLu = ry.class.getName().hashCode();
    GMTrace.o(19536866705408L, 145561);
  }
  
  private static void a(ry paramry, e parame)
  {
    GMTrace.i(19537000923136L, 145562);
    w.i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
    ap.wT().a(1767, parame);
    paramry = paramry.fPW;
    w.i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", new Object[] { paramry.appId, paramry.nonceStr, paramry.fwH, paramry.fPY, paramry.fPZ, paramry.signType, paramry.url });
    paramry = new a(paramry.appId, paramry.nonceStr, paramry.fwH, paramry.fPY, paramry.fPZ, paramry.signType, paramry.url);
    ap.wT().a(paramry, 0);
    GMTrace.o(19537000923136L, 145562);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */