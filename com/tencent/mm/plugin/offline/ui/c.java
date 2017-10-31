package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Vibrator;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.offline.a.r.b;
import com.tencent.mm.plugin.offline.a.r.g;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_core.ui.l.a;
import com.tencent.mm.plugin.wallet_core.ui.l.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class c
{
  Vibrator kiq;
  public Activity mActivity;
  public a ooF;
  l ooG;
  float ooH;
  int ooI;
  
  public c(Activity paramActivity, a parama)
  {
    GMTrace.i(6229715845120L, 46415);
    this.ooH = 0.0F;
    this.ooI = 20000;
    this.mActivity = paramActivity;
    this.ooF = parama;
    GMTrace.o(6229715845120L, 46415);
  }
  
  public static boolean aTV()
  {
    GMTrace.i(6230521151488L, 46421);
    com.tencent.mm.plugin.offline.k.aTF();
    if (com.tencent.mm.plugin.offline.k.aTG().ood != null)
    {
      GMTrace.o(6230521151488L, 46421);
      return true;
    }
    GMTrace.o(6230521151488L, 46421);
    return false;
  }
  
  public final void a(com.tencent.mm.ac.k paramk, int paramInt, String paramString)
  {
    GMTrace.i(6229850062848L, 46416);
    a(paramk, paramInt, paramString, null);
    GMTrace.o(6229850062848L, 46416);
  }
  
  public final void a(com.tencent.mm.ac.k paramk, int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6229984280576L, 46417);
    w.i("MicroMsg.OfflineLogicMgr", "handleErrorEvent errCode :" + paramInt + " msg:" + paramString1);
    aTU();
    if (paramInt == 409)
    {
      w.i("MicroMsg.OfflineLogicMgr", "goLimitChangeUI msg:" + paramString1);
      com.tencent.mm.ui.base.h.a(this.mActivity, paramString1, "", getString(R.l.fan), getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6235889860608L, 46461);
          f.R(c.this.mActivity, 0);
          w.i("MicroMsg.OfflineLogicMgr", "do startBindBankcard");
          GMTrace.o(6235889860608L, 46461);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6206227742720L, 46240);
          GMTrace.o(6206227742720L, 46240);
        }
      });
      GMTrace.o(6229984280576L, 46417);
      return;
    }
    if (paramInt == 410)
    {
      w.i("MicroMsg.OfflineLogicMgr", "showBindNewBankcardDialog msg:" + paramString1);
      com.tencent.mm.ui.base.h.a(this.mActivity, paramString1, "", getString(R.l.eWX), getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6214683459584L, 46303);
          f.R(c.this.mActivity, 0);
          w.i("MicroMsg.OfflineLogicMgr", "do startBindBankcard");
          GMTrace.o(6214683459584L, 46303);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6227434143744L, 46398);
          GMTrace.o(6227434143744L, 46398);
        }
      });
      GMTrace.o(6229984280576L, 46417);
      return;
    }
    if (paramInt == 413)
    {
      w.i("MicroMsg.OfflineLogicMgr", "goChangeBankcard msg:" + paramString1);
      com.tencent.mm.ui.base.h.a(this.mActivity, paramString1, "", getString(R.l.eZW), getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6234145030144L, 46448);
          c.this.ooF.aTQ();
          w.i("MicroMsg.OfflineLogicMgr", "do changeBankcard");
          GMTrace.o(6234145030144L, 46448);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6206764613632L, 46244);
          GMTrace.o(6206764613632L, 46244);
        }
      });
      GMTrace.o(6229984280576L, 46417);
      return;
    }
    if (paramInt == 411)
    {
      if ((m.bwE().bwV()) || (m.bwE().bwZ()))
      {
        w.i("MicroMsg.OfflineLogicMgr", "is unreg or simplereg");
        GMTrace.o(6229984280576L, 46417);
        return;
      }
      if ((com.tencent.mm.plugin.offline.k.onk) && ((this.mActivity instanceof WalletOfflineCoinPurseUI)))
      {
        paramk = (WalletOfflineCoinPurseUI)this.mActivity;
        paramk.ope.setVisibility(4);
        paramk.ops.a(paramk.ooW, new WalletOfflineCoinPurseUI.21(paramk), 6);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 1L, 1L, true);
        GMTrace.o(6229984280576L, 46417);
        return;
        com.tencent.mm.plugin.offline.c.a.b(this.mActivity, paramString1);
      }
    }
    Activity localActivity;
    if ((this.mActivity instanceof WalletBaseUI)) {
      if (!com.tencent.mm.wallet_core.d.e.a((WalletBaseUI)this.mActivity, paramk, 1000, paramInt, paramString1))
      {
        localActivity = this.mActivity;
        if (!TextUtils.isEmpty(paramString1)) {
          break label560;
        }
      }
    }
    label560:
    for (paramk = localActivity.getString(R.l.eZz);; paramk = paramString1)
    {
      if (!bg.mZ(paramString2))
      {
        w.i("MicroMsg.OfflineErrorHelper", "error_detail_url is not null ");
        com.tencent.mm.ui.base.h.a(localActivity, paramk, null, localActivity.getResources().getString(R.l.eUv), localActivity.getResources().getString(R.l.dwr), true, new b.2(paramString2, localActivity), new b.3());
        GMTrace.o(6229984280576L, 46417);
        return;
      }
      b.a(localActivity, paramk);
      GMTrace.o(6229984280576L, 46417);
      return;
      b.a(this.mActivity, paramString1);
      GMTrace.o(6229984280576L, 46417);
      return;
    }
  }
  
  public final void a(r.b paramb)
  {
    GMTrace.i(6230386933760L, 46420);
    if (paramb == null)
    {
      GMTrace.o(6230386933760L, 46420);
      return;
    }
    w.i("MicroMsg.OfflineLogicMgr", "showFreeMsg");
    if ("1".equals(paramb.ooh)) {
      com.tencent.mm.ui.base.h.a(this.mActivity, false, paramb.ooj, "", getString(R.l.fah), getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6229044756480L, 46410);
          paramAnonymousDialogInterface.dismiss();
          com.tencent.mm.plugin.offline.c.a.C(c.this.mActivity);
          w.i("MicroMsg.OfflineLogicMgr", "doFreezeOffline");
          GMTrace.o(6229044756480L, 46410);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6236695166976L, 46467);
          paramAnonymousDialogInterface.dismiss();
          c.this.mActivity.finish();
          GMTrace.o(6236695166976L, 46467);
        }
      });
    }
    GMTrace.o(6230386933760L, 46420);
  }
  
  public final void aTU()
  {
    GMTrace.i(6230252716032L, 46419);
    if (this.ooG != null)
    {
      this.ooG.dismiss();
      this.ooG = null;
    }
    GMTrace.o(6230252716032L, 46419);
  }
  
  public final void aTW()
  {
    GMTrace.i(16030965432320L, 119440);
    w.i("MicroMsg.OfflineLogicMgr", "closeOffline");
    if (this.ooF != null) {
      this.ooF.aTR();
    }
    GMTrace.o(16030965432320L, 119440);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    boolean bool = false;
    GMTrace.i(6230118498304L, 46418);
    w.i("MicroMsg.OfflineLogicMgr", "errType:" + paramInt1 + "  errCode" + paramInt2 + " errMsg:" + paramString + " cgi type:" + paramk.getType());
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
      {
        paramString = (com.tencent.mm.plugin.offline.a.e)paramk;
        localObject = paramString.onw;
        aTU();
        if ((paramString.onx != 0) || (TextUtils.isEmpty((CharSequence)localObject))) {
          break label148;
        }
        com.tencent.mm.plugin.offline.c.a.a(this.mActivity, (String)localObject, paramk);
        this.mActivity.finish();
        bool = true;
      }
    }
    for (;;)
    {
      GMTrace.o(6230118498304L, 46418);
      return bool;
      label148:
      if ((paramString.onx != 0) && (paramString.kKx != 0) && (paramString.onz == 1))
      {
        w.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
        a(paramString, paramString.onx, paramString.ony);
      }
      bool = true;
      continue;
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
      {
        localObject = (com.tencent.mm.plugin.offline.a.e)paramk;
        aTU();
        if (((com.tencent.mm.plugin.offline.a.e)localObject).onz == 1)
        {
          w.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
          a(paramk, paramInt2, paramString);
        }
        bool = true;
      }
    }
  }
  
  final String getString(int paramInt)
  {
    GMTrace.i(6230655369216L, 46422);
    String str = this.mActivity.getString(paramInt);
    GMTrace.o(6230655369216L, 46422);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */