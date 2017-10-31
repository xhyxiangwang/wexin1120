package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.plugin.wallet_core.c.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.util.Date;

public final class s
  extends com.tencent.mm.sdk.b.c<sb>
  implements e
{
  private sb rQK;
  private String rQL;
  
  public s()
  {
    GMTrace.i(6901207138304L, 51418);
    this.rQL = null;
    this.uLu = sb.class.getName().hashCode();
    GMTrace.o(6901207138304L, 51418);
  }
  
  private void bwN()
  {
    GMTrace.i(6901341356032L, 51419);
    d locald = m.bwI();
    p localp = new p();
    localp.field_bulletin_scene = this.rQL;
    if (!locald.b(localp, new String[0])) {
      w.i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
    }
    for (;;)
    {
      this.rQK.fwM.run();
      this.rQK = null;
      GMTrace.o(6901341356032L, 51419);
      return;
      this.rQK.fQd.fQf = localp.field_bulletin_scene;
      this.rQK.fQd.content = localp.field_bulletin_content;
      this.rQK.fQd.url = localp.field_bulletin_url;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6901475573760L, 51420);
    w.i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + paramInt1 + ";errCode=" + paramInt2);
    ap.wT().b(385, this);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uXF, Long.valueOf(new Date().getTime()));
    bwN();
    GMTrace.o(6901475573760L, 51420);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */