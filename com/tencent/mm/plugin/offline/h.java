package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.plugin.offline.a.i;
import com.tencent.mm.plugin.offline.a.n;
import com.tencent.mm.plugin.offline.a.p;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f.6;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class h
  extends b
{
  public h()
  {
    GMTrace.i(6201530122240L, 46205);
    GMTrace.o(6201530122240L, 46205);
  }
  
  public final void B(Activity paramActivity)
  {
    int i = 2;
    GMTrace.i(6202335428608L, 46211);
    int j;
    if (paramActivity != null)
    {
      j = this.lRQ.getInt("offline_from_scene", -1);
      if (j != 1) {
        break label102;
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(14096, new Object[] { Integer.valueOf(i) });
      Intent localIntent = new Intent(paramActivity, WalletOfflineEntranceUI.class);
      localIntent.putExtra("key_from_scene", j);
      localIntent.putExtra("is_offline_create", true);
      a(paramActivity, WalletOfflineEntranceUI.class, localIntent);
      paramActivity.finish();
      GMTrace.o(6202335428608L, 46211);
      return;
      label102:
      if (j == 2) {
        i = 1;
      } else if (j == 3) {
        i = 3;
      } else if (j == 4) {
        i = 6;
      } else if (j == 8) {
        i = 4;
      } else {
        i = 1;
      }
    }
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6201664339968L, 46206);
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    GMTrace.o(6201664339968L, 46206);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(6202469646336L, 46212);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        private void aTD()
        {
          GMTrace.i(6252667076608L, 46586);
          n localn = new n(System.currentTimeMillis(), com.tencent.mm.plugin.offline.c.a.oqc);
          this.xgB.a(localn, false, 1);
          GMTrace.o(6252667076608L, 46586);
        }
        
        public final boolean d(final int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(6252398641152L, 46584);
          label164:
          final Object localObject;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              w.i("MicroMsg.OfflineProcess", "Offline is Create ");
              aTD();
              h.a(h.this).putBoolean("is_offline_create", true);
            }
            for (;;)
            {
              GMTrace.o(6252398641152L, 46584);
              return true;
              if ((paramAnonymousk instanceof n))
              {
                w.i("MicroMsg.OfflineProcess", "OfflineQueryUser is ok ");
                paramAnonymousString = this.xgB;
                if ((paramAnonymousString.imq == null) || ((paramAnonymousString.imq != null) && (!paramAnonymousString.imq.isShowing())))
                {
                  if (paramAnonymousString.imq != null) {
                    paramAnonymousString.imq.dismiss();
                  }
                  if (paramAnonymousString.mContext != null) {
                    break label164;
                  }
                  w.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
                }
                for (;;)
                {
                  paramAnonymousString = new sc();
                  paramAnonymousString.fQh.fQb = new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6250653810688L, 46571);
                      w.d("MicroMsg.OfflineProcess", "tofutest do callback");
                      h.this.a(h.1.this.xgA, 0, h.b(h.this));
                      h.1.this.xgB.bvu();
                      GMTrace.o(6250653810688L, 46571);
                    }
                  };
                  com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousString);
                  break;
                  paramAnonymousString.imq = com.tencent.mm.wallet_core.ui.g.a(paramAnonymousString.mContext, false, new f.6(paramAnonymousString));
                }
              }
              if ((paramAnonymousk instanceof i))
              {
                paramAnonymousk = (i)paramAnonymousk;
                if ("1".equals(paramAnonymousk.onG))
                {
                  paramAnonymousString = this.xgA;
                  paramAnonymousk = paramAnonymousk.fFP;
                  localObject = new Bundle();
                  ((Bundle)localObject).putParcelable("key_authen", new Authen());
                  ((Bundle)localObject).putString("key_pwd1", h.j(h.this).getString("key_pwd1"));
                  ((Bundle)localObject).putString("key_mobile", paramAnonymousk);
                  ((Bundle)localObject).putInt("verify_scene", 1);
                  ((Bundle)localObject).putInt("offline_add_fee", h.k(h.this).getInt("offline_chg_fee", 0));
                  com.tencent.mm.wallet_core.a.a(paramAnonymousString, l.class, (Bundle)localObject);
                  h.this.a(paramAnonymousString, 0, h.l(h.this));
                }
                else
                {
                  h.c(h.this).putBoolean("back_to_coin_purse_ui", true);
                  aTD();
                }
              }
              else if ((paramAnonymousk instanceof p))
              {
                com.tencent.mm.plugin.offline.c.a.Ds("");
                k.aTF();
                k.aTG().ood = null;
                h.this.a(this.xgA, 0, h.d(h.this));
              }
            }
          }
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
          {
            w.i("MicroMsg.OfflineProcess", "Offline Create is failed!");
            paramAnonymousk = (com.tencent.mm.plugin.offline.a.k)paramAnonymousk;
            if (paramAnonymousInt2 == 410)
            {
              localObject = this.xgA;
              paramAnonymousInt1 = paramAnonymousk.onU;
              com.tencent.mm.ui.base.h.a((Context)localObject, paramAnonymousString, "", ((MMActivity)localObject).getString(R.l.eWX), ((MMActivity)localObject).getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(6239782174720L, 46490);
                  com.tencent.mm.pluginsdk.wallet.f.R(localObject, paramAnonymousInt1);
                  h.this.a(localObject, 0, h.m(h.this));
                  GMTrace.o(6239782174720L, 46490);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(6253606600704L, 46593);
                  h.this.a(localObject, 0, h.n(h.this));
                  GMTrace.o(6253606600704L, 46593);
                }
              });
              GMTrace.o(6252398641152L, 46584);
              return true;
            }
          }
          GMTrace.o(6252398641152L, 46584);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6252532858880L, 46585);
          String str = (String)paramAnonymousVarArgs[0];
          h.e(h.this).putString("key_pwd1", str);
          Object localObject2 = com.tencent.mm.plugin.offline.c.a.aUs();
          Object localObject1 = localObject2;
          if (localObject2 == null)
          {
            w.e("MicroMsg.OfflineProcess", "no support bank car for offline");
            localObject1 = com.tencent.mm.plugin.offline.c.a.aUt();
          }
          if (localObject1 == null)
          {
            w.e("MicroMsg.OfflineProcess", "no any bank car for offline");
            GMTrace.o(6252532858880L, 46585);
            return false;
          }
          localObject2 = h.f(h.this).getString("oper");
          if (!com.tencent.mm.plugin.offline.c.a.aUp())
          {
            w.i("MicroMsg.OfflineProcess", "Offline is not Create ");
            this.xgB.a(new com.tencent.mm.plugin.offline.a.k((Bankcard)localObject1, (String)paramAnonymousVarArgs[0], h.g(h.this).getInt("offline_chg_fee", 0)), true, 1);
          }
          for (;;)
          {
            GMTrace.o(6252532858880L, 46585);
            return true;
            if (localObject2 != null)
            {
              w.i("MicroMsg.OfflineProcess", "oper == " + (String)localObject2);
              if (((String)localObject2).equals("create"))
              {
                this.xgB.a(new com.tencent.mm.plugin.offline.a.k((Bankcard)localObject1, (String)paramAnonymousVarArgs[0], h.h(h.this).getInt("offline_chg_fee", 0)), true, 1);
              }
              else if (((String)localObject2).equals("clr"))
              {
                this.xgB.a(new i((Bankcard)localObject1, str, "clr", 0, ""), true, 1);
              }
              else if (((String)localObject2).equals("changeto"))
              {
                this.xgB.a(new i((Bankcard)localObject1, str, "changeto", h.i(h.this).getInt("offline_chg_fee"), ""), true, 1);
              }
              else
              {
                if (!((String)localObject2).equals("freeze")) {
                  break;
                }
                this.xgB.a(new p(str), true, 1);
              }
            }
          }
          GMTrace.o(6252532858880L, 46585);
          return false;
        }
      };
      GMTrace.o(6202469646336L, 46212);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6202469646336L, 46212);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6201798557696L, 46207);
    if ((paramActivity instanceof WalletCheckPwdUI)) {
      B(paramActivity);
    }
    GMTrace.o(6201798557696L, 46207);
  }
  
  public final String azd()
  {
    GMTrace.i(6202603864064L, 46213);
    GMTrace.o(6202603864064L, 46213);
    return "OfflineProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6202066993152L, 46209);
    B(paramActivity);
    if ((paramBundle != null) && (paramBundle.getBoolean("is_offline_create"))) {
      com.tencent.mm.plugin.offline.c.a.E((WalletBaseUI)paramActivity);
    }
    GMTrace.o(6202066993152L, 46209);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6201932775424L, 46208);
    if (paramActivity != null) {
      paramActivity.finish();
    }
    GMTrace.o(6201932775424L, 46208);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6202201210880L, 46210);
    GMTrace.o(6202201210880L, 46210);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */