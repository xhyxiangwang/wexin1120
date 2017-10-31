package com.tencent.mm.wallet_core.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bi.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.wallet_core.f.a.i;
import com.tencent.mm.wallet_core.f.a.l;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;

public final class e
{
  public static boolean a(WalletBaseUI paramWalletBaseUI, k paramk, int paramInt1, final int paramInt2, String paramString)
  {
    GMTrace.i(1433579552768L, 10681);
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt1 == 1000)
    {
      if (!bg.mZ(paramString)) {
        break label543;
      }
      paramString = paramWalletBaseUI.getString(R.l.eZz);
    }
    label543:
    for (;;)
    {
      com.tencent.mm.wallet_core.b localb = a.aa(paramWalletBaseUI);
      switch (paramInt2)
      {
      default: 
        bool1 = bool2;
      }
      for (;;)
      {
        GMTrace.o(1433579552768L, 10681);
        return bool1;
        paramInt1 = 0;
        if ((paramk instanceof i)) {
          paramInt1 = ((i)paramk).rPs;
        }
        if (paramInt1 == 1) {
          h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(R.l.eUJ), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1439887785984L, 10728);
              if (this.rGM.aMd()) {
                this.rGM.finish();
              }
              GMTrace.o(1439887785984L, 10728);
            }
          });
        }
        for (;;)
        {
          bool1 = true;
          break;
          h.a(paramWalletBaseUI, false, paramString, "", paramWalletBaseUI.getString(R.l.eUK), paramWalletBaseUI.getString(R.l.dwU), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1435324383232L, 10694);
              if (m.zS()) {
                a.b(this.rGM, "PayUForgotPwdProcess", null);
              }
              for (;;)
              {
                if (this.rGM.aMd()) {
                  this.rGM.finish();
                }
                GMTrace.o(1435324383232L, 10694);
                return;
                a.b(this.rGM, "ForgotPwdProcess", null);
              }
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1438008737792L, 10714);
              this.rGM.sa(1);
              GMTrace.o(1438008737792L, 10714);
            }
          });
        }
        bool1 = bool2;
        if (localb != null)
        {
          bool1 = localb.a(paramWalletBaseUI, paramInt2, paramString);
          continue;
          ciZ();
          if (m.zS()) {
            b(paramWalletBaseUI, paramInt2, paramString);
          }
          for (;;)
          {
            bool1 = true;
            break;
            h.a(paramWalletBaseUI, paramString, null, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(1440156221440L, 10730);
                a.c(this.rGM, null, paramInt2);
                if (this.rGM.aMd()) {
                  this.rGM.finish();
                }
                GMTrace.o(1440156221440L, 10730);
              }
            });
          }
          bool1 = bool2;
          if (localb != null)
          {
            bool1 = localb.a(paramWalletBaseUI, paramInt2, paramString);
            continue;
            paramInt1 = 0;
            if ((paramk instanceof i)) {
              paramInt1 = ((i)paramk).rPs;
            }
            if (paramInt1 == 1) {
              h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(R.l.eUJ), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(1439082479616L, 10722);
                  if (this.rGM.aMd()) {
                    this.rGM.finish();
                  }
                  GMTrace.o(1439082479616L, 10722);
                }
              });
            }
            for (;;)
            {
              bool1 = true;
              break;
              h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(R.l.eYO), paramWalletBaseUI.getString(R.l.duP), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(1432908464128L, 10676);
                  this.rGM.mE(true);
                  GMTrace.o(1432908464128L, 10676);
                }
              }, null);
            }
            h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(R.l.eZP), paramWalletBaseUI.getString(R.l.duP), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(1433445335040L, 10680);
                paramAnonymousDialogInterface = new Bundle();
                paramAnonymousDialogInterface.putBoolean("key_is_bind_bankcard", false);
                a.a(this.rGM, "BindCardProcess", paramAnonymousDialogInterface, new b.a()
                {
                  public final Intent k(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                  {
                    GMTrace.i(1440961527808L, 10736);
                    GMTrace.o(1440961527808L, 10736);
                    return null;
                  }
                });
                GMTrace.o(1433445335040L, 10680);
              }
            }, null);
            bool1 = true;
            continue;
            ciZ();
            b(paramWalletBaseUI, paramInt2, paramString);
            bool1 = true;
            continue;
            h.a(paramWalletBaseUI, paramWalletBaseUI.getString(R.l.eUA), null, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(1440424656896L, 10732);
                a.c(this.rGM, this.rGM.un, paramInt2);
                if (this.rGM.aMd()) {
                  this.rGM.finish();
                }
                GMTrace.o(1440424656896L, 10732);
              }
            });
            bool1 = true;
            continue;
            h.a(paramWalletBaseUI, paramWalletBaseUI.getString(R.l.eUz), null, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(1435861254144L, 10698);
                a.c(this.rGM, this.rGM.un, paramInt2);
                if (this.rGM.aMd()) {
                  this.rGM.finish();
                }
                GMTrace.o(1435861254144L, 10698);
              }
            });
            bool1 = true;
          }
        }
      }
    }
  }
  
  private static void b(WalletBaseUI paramWalletBaseUI, final int paramInt, String paramString)
  {
    GMTrace.i(1433847988224L, 10683);
    h.a(paramWalletBaseUI, false, paramString, "", paramWalletBaseUI.getString(R.l.eUy), paramWalletBaseUI.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1435592818688L, 10696);
        paramAnonymousDialogInterface = new Intent();
        paramAnonymousDialogInterface.putExtra("rawUrl", "https://www.payu.co.za/wechat/contact-us/");
        d.b(this.rGM, "webview", ".ui.tools.WebViewUI", paramAnonymousDialogInterface);
        if ((this.rGM.aMd()) || (this.rGM.vov.iiK.getVisibility() != 0)) {
          this.rGM.finish();
        }
        GMTrace.o(1435592818688L, 10696);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1434116423680L, 10685);
        a.c(this.rGM, this.rGM.un, paramInt);
        if ((this.rGM.aMd()) || (this.rGM.vov.iiK.getVisibility() != 0)) {
          this.rGM.finish();
        }
        GMTrace.o(1434116423680L, 10685);
      }
    });
    GMTrace.o(1433847988224L, 10683);
  }
  
  private static void ciZ()
  {
    GMTrace.i(1433713770496L, 10682);
    if (!m.zS()) {}
    for (Object localObject = new l();; localObject = new com.tencent.mm.wallet_core.e.a.b())
    {
      ap.wT().a((k)localObject, 0);
      GMTrace.o(1433713770496L, 10682);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */