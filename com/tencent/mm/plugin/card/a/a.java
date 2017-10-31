package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.g.a.oh.a;
import com.tencent.mm.g.a.oh.b;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.o;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class a
  extends c<oh>
  implements com.tencent.mm.ac.e
{
  private oh kmq;
  
  public a()
  {
    GMTrace.i(5116379791360L, 38120);
    this.uLu = oh.class.getName().hashCode();
    GMTrace.o(5116379791360L, 38120);
  }
  
  private boolean a(oh paramoh)
  {
    GMTrace.i(5116514009088L, 38121);
    if (!ap.AV())
    {
      w.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
      GMTrace.o(5116514009088L, 38121);
      return false;
    }
    if ((paramoh instanceof oh))
    {
      this.kmq = paramoh;
      paramoh = this.kmq.fMt.fMv;
      String str = this.kmq.fMt.fMw;
      int i = this.kmq.fMt.fMx;
      if (TextUtils.isEmpty(paramoh))
      {
        w.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
        aiW();
        GMTrace.o(5116514009088L, 38121);
        return false;
      }
      ap.wT().a(651, this);
      w.i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene " + i);
      paramoh = new o(paramoh, i, "", str, "", "", 0, 0, null);
      ap.wT().a(paramoh, 0);
      GMTrace.o(5116514009088L, 38121);
      return true;
    }
    GMTrace.o(5116514009088L, 38121);
    return false;
  }
  
  private void aiW()
  {
    GMTrace.i(5116782444544L, 38123);
    if (this.kmq.fwM != null) {
      this.kmq.fwM.run();
    }
    this.kmq = null;
    GMTrace.o(5116782444544L, 38123);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5116648226816L, 38122);
    oh.b localb;
    if ((paramk instanceof o))
    {
      localb = new oh.b();
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label248;
      }
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
      paramk = (o)paramk;
      paramInt1 = paramk.kpr;
      paramString = paramk.kpq;
      paramk = paramk.kps;
      if (paramInt1 != 0) {
        break label208;
      }
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
      localb.fyM = true;
      paramk = new CardInfo();
      f.a(paramk, paramString);
      if (TextUtils.isEmpty(paramk.field_card_id)) {
        break label191;
      }
      localb.fMv = paramk.field_card_id;
      al.ajH().putValue("key_accept_card_info", paramk);
    }
    for (;;)
    {
      ap.wT().b(651, this);
      this.kmq.fMu = localb;
      aiW();
      GMTrace.o(5116648226816L, 38122);
      return;
      label191:
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
      localb.fMv = "";
      break;
      label208:
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + paramInt1 + " retMsg" + paramk);
      localb.fyM = false;
      continue;
      label248:
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
      localb.fyM = false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */