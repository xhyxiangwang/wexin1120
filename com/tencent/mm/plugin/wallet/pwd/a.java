package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pwd.a.e;
import com.tencent.mm.plugin.wallet.pwd.a.j.1;
import com.tencent.mm.plugin.wallet.pwd.a.j.2;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdBindNewUI;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

public class a
  extends com.tencent.mm.plugin.wallet_core.a.a
{
  public a()
  {
    GMTrace.i(7743154946048L, 57691);
    GMTrace.o(7743154946048L, 57691);
  }
  
  public final b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7743289163776L, 57692);
    w.d("MicroMsg.ProcessManager", "start Process : ForgotPwdProcess");
    Bundle localBundle = this.lRQ;
    p.bvm();
    boolean bool;
    if (!p.bvn().bxd())
    {
      bool = true;
      localBundle.putBoolean("key_is_oversea", bool);
      localBundle = this.lRQ;
      p.bvm();
      if (!p.bvn().bxd()) {
        break label109;
      }
    }
    label109:
    for (int i = 1;; i = 2)
    {
      localBundle.putInt("key_support_bankcard", i);
      this.lRQ.putBoolean("key_is_forgot_process", true);
      c(paramActivity, WalletForgotPwdUI.class, paramBundle);
      GMTrace.o(7743289163776L, 57692);
      return this;
      bool = false;
      break;
    }
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(7743691816960L, 57695);
    if ((paramMMActivity instanceof WalletForgotPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7768924749824L, 57883);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.m)))
          {
            paramAnonymousString = com.tencent.mm.plugin.wallet_core.model.m.bwA().bxx();
            w.i("MicroMsg.ProcessManager", "hy: reset_pwd_flag: %s, find_pwd_url: %s", new Object[] { paramAnonymousString.field_reset_passwd_flag, paramAnonymousString.field_find_passwd_url });
            if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bxi() != null) {
              break label149;
            }
          }
          label149:
          for (paramAnonymousInt1 = 0;; paramAnonymousInt1 = com.tencent.mm.plugin.wallet_core.model.m.bwE().bxi().size())
          {
            if ((paramAnonymousInt1 <= 0) && (!bg.mZ(paramAnonymousString.field_find_passwd_url)))
            {
              w.i("MicroMsg.ProcessManager", "hy: no bankcard and do not support add bank card to forget");
              paramAnonymousString = this.xgA;
              com.tencent.mm.ui.base.h.a(paramAnonymousString, true, paramAnonymousString.getString(R.l.eWy), "", paramAnonymousString.getString(R.l.dwr), paramAnonymousString.getString(R.l.duP), new j.1(paramAnonymousString), new j.2(true, paramAnonymousString));
            }
            GMTrace.o(7768924749824L, 57883);
            return false;
          }
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7769058967552L, 57884);
          GMTrace.o(7769058967552L, 57884);
          return false;
        }
      };
      GMTrace.o(7743691816960L, 57695);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletCardElementUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7742349639680L, 57685);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pwd.a.f)))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet.pwd.a.f)paramAnonymousk;
            a.a(a.this).putString("kreq_token", paramAnonymousString.token);
            a.this.a(this.xgA, 0, a.b(a.this));
            GMTrace.o(7742349639680L, 57685);
            return true;
          }
          GMTrace.o(7742349639680L, 57685);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7742483857408L, 57686);
          paramAnonymousVarArgs = (Authen)paramAnonymousVarArgs[0];
          if (!a.this.ciy()) {}
          for (paramAnonymousVarArgs.fJg = 1;; paramAnonymousVarArgs.fJg = 4)
          {
            this.xgB.a(new com.tencent.mm.plugin.wallet.pwd.a.f(paramAnonymousVarArgs, a.c(a.this).getBoolean("key_is_reset_with_new_card", false)), true, 1);
            GMTrace.o(7742483857408L, 57686);
            return true;
          }
        }
      };
      GMTrace.o(7743691816960L, 57695);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7737383583744L, 57648);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pwd.a.f)))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet.pwd.a.f)paramAnonymousk;
            a.d(a.this).putString("kreq_token", paramAnonymousString.token);
            GMTrace.o(7737383583744L, 57648);
            return true;
          }
          GMTrace.o(7737383583744L, 57648);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7737517801472L, 57649);
          paramAnonymousVarArgs = (n)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.flag = "3";
          this.xgB.a(new com.tencent.mm.plugin.wallet.pwd.a.h(paramAnonymousVarArgs), true, 1);
          GMTrace.o(7737517801472L, 57649);
          return true;
        }
      };
      GMTrace.o(7743691816960L, 57695);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7769595838464L, 57888);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof e)))
          {
            a.this.a(this.xgA, 0, a.e(a.this));
            GMTrace.o(7769595838464L, 57888);
            return true;
          }
          GMTrace.o(7769595838464L, 57888);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7769730056192L, 57889);
          paramAnonymousVarArgs = (n)paramAnonymousVarArgs[0];
          this.xgB.a(new e(paramAnonymousVarArgs), true, 1);
          GMTrace.o(7769730056192L, 57889);
          return true;
        }
      };
      GMTrace.o(7743691816960L, 57695);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7743691816960L, 57695);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7743423381504L, 57693);
    if ((paramActivity instanceof WalletForgotPwdUI))
    {
      if ((paramBundle.containsKey("key_is_force_bind")) && (paramBundle.getBoolean("key_is_force_bind")))
      {
        c(paramActivity, WalletForgotPwdBindNewUI.class, paramBundle);
        GMTrace.o(7743423381504L, 57693);
        return;
      }
      c(paramActivity, WalletCardElementUI.class, paramBundle);
      GMTrace.o(7743423381504L, 57693);
      return;
    }
    if ((paramActivity instanceof WalletCardElementUI))
    {
      if (!ciy())
      {
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        GMTrace.o(7743423381504L, 57693);
        return;
      }
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      GMTrace.o(7743423381504L, 57693);
      return;
    }
    if ((paramActivity instanceof WalletVerifyCodeUI))
    {
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      GMTrace.o(7743423381504L, 57693);
      return;
    }
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      GMTrace.o(7743423381504L, 57693);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      b(paramActivity, paramBundle);
      GMTrace.o(7743423381504L, 57693);
      return;
    }
    if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
    {
      w(new Object[] { "startActivity2", paramActivity, WalletCardElementUI.class, paramBundle, "flag: 67108864" });
      Intent localIntent = new Intent(paramActivity, WalletCardElementUI.class);
      localIntent.putExtra("process_id", getClass().hashCode());
      localIntent.addFlags(67108864);
      paramActivity.startActivity(localIntent);
      if (paramBundle != null) {
        this.lRQ.putAll(paramBundle);
      }
      w.d("MicroMsg.ProcessManager", "bankcard tag :" + cix());
    }
    GMTrace.o(7743423381504L, 57693);
  }
  
  public final boolean a(final WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    GMTrace.i(7743960252416L, 57697);
    switch (paramInt)
    {
    default: 
      GMTrace.o(7743960252416L, 57697);
      return false;
    }
    com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(R.l.eUL), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7769327403008L, 57886);
        a.this.b(paramWalletBaseUI, a.f(a.this));
        if (paramWalletBaseUI.aMd()) {
          paramWalletBaseUI.finish();
        }
        WalletBaseUI.cjk();
        GMTrace.o(7769327403008L, 57886);
      }
    });
    GMTrace.o(7743960252416L, 57697);
    return true;
  }
  
  public final String azd()
  {
    GMTrace.i(7744228687872L, 57699);
    GMTrace.o(7744228687872L, 57699);
    return "ForgotPwdProcess";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(7744094470144L, 57698);
    paramInt = R.l.eUL;
    GMTrace.o(7744094470144L, 57698);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7743557599232L, 57694);
    a(paramActivity, WalletForgotPwdUI.class, -1, false);
    GMTrace.o(7743557599232L, 57694);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7743826034688L, 57696);
    boolean bool = paramActivity instanceof WalletPwdConfirmUI;
    GMTrace.o(7743826034688L, 57696);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */