package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.plugin.wallet_core.id_verify.model.c;
import com.tencent.mm.plugin.wallet_core.id_verify.model.h;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.d;

public class a
  extends com.tencent.mm.plugin.wallet_core.a.b
{
  public int aHi;
  public boolean kpQ;
  private int mMode;
  public String rLf;
  public String rLg;
  private boolean rLh;
  private int rLi;
  
  public a()
  {
    GMTrace.i(6856244199424L, 51083);
    this.rLf = null;
    this.rLg = null;
    this.rLh = false;
    this.aHi = 0;
    this.rLi = -1;
    this.kpQ = false;
    GMTrace.o(6856244199424L, 51083);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6856378417152L, 51084);
    w(new Object[] { "start", paramActivity, paramBundle });
    if (this.lRQ == null) {
      this.lRQ = new Bundle();
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = this.lRQ;
    }
    boolean bool;
    if (localBundle != null)
    {
      this.mMode = localBundle.getInt("real_name_verify_mode", 0);
      this.rLi = this.mMode;
      localBundle.putBoolean("key_is_realname_verify_process", true);
      this.rLf = localBundle.getString("realname_verify_process_jump_plugin", "");
      this.rLg = localBundle.getString("realname_verify_process_jump_activity", "");
      if (localBundle.getInt("realname_verify_process_allow_idverify", 0) != 1) {
        break label222;
      }
      bool = true;
      label133:
      this.rLh = bool;
      w.i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", new Object[] { Boolean.valueOf(this.rLh), this.rLf, this.rLg });
      switch (this.mMode)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(6856378417152L, 51084);
      return this;
      this.mMode = 0;
      break;
      label222:
      bool = false;
      break label133;
      localBundle.putBoolean("key_need_bind_response", true);
      com.tencent.mm.wallet_core.c.n.Ec(10);
      super.a(paramActivity, localBundle);
      continue;
      com.tencent.mm.wallet_core.c.n.Ec(10);
      c(paramActivity, SwitchRealnameVerifyModeUI.class, localBundle);
      continue;
      c(paramActivity, WalletRealNameVerifyUI.class, localBundle);
    }
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(6856915288064L, 51088);
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      if (this.mMode == 2)
      {
        paramMMActivity = new d(paramMMActivity, paramf)
        {
          public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(6860941819904L, 51118);
            if ((paramAnonymousk instanceof c))
            {
              if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
              {
                a.b(a.this).putInt("realname_verify_process_ret", -1);
                w.i("MicroMsg.RealNameVerifyProcess", "real name reg succ ,update user info");
                m.bwE().axG();
                paramAnonymousString = new sc(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6839064330240L, 50955);
                    w.i("MicroMsg.RealNameVerifyProcess", "update user info succ,end process");
                    GMTrace.o(6839064330240L, 50955);
                  }
                });
                com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousString);
                a.a(a.this, this.xgB);
                a.this.b(this.xgA, a.c(a.this));
                GMTrace.o(6860941819904L, 51118);
                return true;
              }
            }
            else if ((paramAnonymousk instanceof h))
            {
              GMTrace.o(6860941819904L, 51118);
              return true;
            }
            GMTrace.o(6860941819904L, 51118);
            return false;
          }
          
          public final boolean j(Object... paramAnonymousVarArgs)
          {
            GMTrace.i(6860807602176L, 51117);
            paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.n)paramAnonymousVarArgs[0];
            String str = a.a(a.this).getString("key_real_name_token");
            if ((paramAnonymousVarArgs == null) || (bg.mZ(paramAnonymousVarArgs.rQC))) {
              w.e("MicroMsg.RealNameVerifyProcess", "get pwd error");
            }
            for (;;)
            {
              GMTrace.o(6860807602176L, 51117);
              return true;
              if (bg.mZ(str))
              {
                w.e("MicroMsg.RealNameVerifyProcess", "get token error");
              }
              else
              {
                paramAnonymousVarArgs = new c(paramAnonymousVarArgs.rQC, str, a.this.lRQ.getInt("entry_scene", -1));
                this.xgB.a(paramAnonymousVarArgs, true);
              }
            }
          }
        };
        GMTrace.o(6856915288064L, 51088);
        return paramMMActivity;
      }
      paramMMActivity = super.a(paramMMActivity, paramf);
      GMTrace.o(6856915288064L, 51088);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletRealNameVerifyUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6837990588416L, 50947);
          GMTrace.o(6837990588416L, 50947);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6837856370688L, 50946);
          GMTrace.o(6837856370688L, 50946);
          return false;
        }
        
        public final CharSequence rQ(int paramAnonymousInt)
        {
          GMTrace.i(6837722152960L, 50945);
          Object localObject = null;
          if (paramAnonymousInt == 0)
          {
            String str = this.xgA.getString(R.l.eYf);
            localObject = this.xgA.getString(R.l.eYe);
            str = this.xgA.getString(R.l.eYh, new Object[] { str, localObject });
            com.tencent.mm.plugin.wallet_core.ui.f localf = new com.tencent.mm.plugin.wallet_core.ui.f(this.xgA);
            SpannableString localSpannableString = new SpannableString(str);
            localSpannableString.setSpan(localf, str.length() - ((String)localObject).length(), str.length(), 33);
            localObject = localSpannableString.subSequence(0, localSpannableString.length());
          }
          GMTrace.o(6837722152960L, 50945);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(6856915288064L, 51088);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6856915288064L, 51088);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6856646852608L, 51086);
    w(new Object[] { "forward", paramActivity, "actionCode:" + paramInt, paramBundle });
    int i = this.lRQ.getInt("real_name_verify_mode", this.mMode);
    if (this.mMode != i) {
      this.mMode = i;
    }
    if (this.mMode == 2)
    {
      if ((paramActivity instanceof WalletRealNameVerifyUI))
      {
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      if ((!(paramActivity instanceof WalletPwdConfirmUI)) && ((paramActivity instanceof SwitchRealnameVerifyModeUI)))
      {
        c(paramActivity, WalletRealNameVerifyUI.class, paramBundle);
        this.mMode = 2;
        GMTrace.o(6856646852608L, 51086);
      }
    }
    else
    {
      if (this.mMode == 1)
      {
        if ((paramActivity instanceof SwitchRealnameVerifyModeUI))
        {
          if (m.bwE().bwY())
          {
            c(paramActivity, WalletCheckPwdUI.class, paramBundle);
            GMTrace.o(6856646852608L, 51086);
            return;
          }
          c(paramActivity, WalletBankcardIdUI.class, paramBundle);
          GMTrace.o(6856646852608L, 51086);
          return;
        }
        if ((paramActivity instanceof WalletCheckPwdUI))
        {
          c(paramActivity, WalletBankcardIdUI.class, paramBundle);
          GMTrace.o(6856646852608L, 51086);
          return;
        }
        super.a(paramActivity, paramInt, paramBundle);
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      if ((paramActivity instanceof WalletRealNameVerifyUI))
      {
        c(paramActivity, WalletBankcardIdUI.class, paramBundle);
        this.mMode = 1;
        GMTrace.o(6856646852608L, 51086);
        return;
      }
      super.a(paramActivity, paramInt, paramBundle);
    }
    GMTrace.o(6856646852608L, 51086);
  }
  
  public final String azd()
  {
    GMTrace.i(6857049505792L, 51089);
    GMTrace.o(6857049505792L, 51089);
    return "realname_verify_process";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(6857183723520L, 51090);
    paramInt = R.l.eVf;
    GMTrace.o(6857183723520L, 51090);
    return paramInt;
  }
  
  public final void b(final Activity paramActivity, final Bundle paramBundle)
  {
    GMTrace.i(6856781070336L, 51087);
    w(new Object[] { "end", paramActivity, paramBundle });
    com.tencent.mm.wallet_core.c.n.ciN();
    if (paramBundle == null) {
      paramBundle = this.lRQ;
    }
    for (;;)
    {
      final Object localObject = paramBundle;
      if (paramBundle == null) {
        localObject = new Bundle();
      }
      if (this.mMode == 1)
      {
        ciC();
        if (((Bundle)localObject).getBoolean("intent_bind_end", false)) {
          this.aHi = -1;
        }
      }
      for (;;)
      {
        if (((Bundle)localObject).containsKey("intent_bind_end")) {
          ((Bundle)localObject).remove("intent_bind_end");
        }
        if (((Bundle)localObject).containsKey("key_is_bind_reg_process")) {
          ((Bundle)localObject).remove("key_is_bind_reg_process");
        }
        ((Bundle)localObject).putInt("realname_verify_process_ret", this.aHi);
        paramBundle = new Intent();
        paramBundle.putExtras((Bundle)localObject);
        if (this.aHi == -1) {
          Toast.makeText(paramActivity, paramActivity.getString(R.l.ewT), 0).show();
        }
        localObject = new sc();
        ((sc)localObject).fwM = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6846446305280L, 51010);
            if (!a.this.kpQ)
            {
              localObject.fwM = null;
              a.this.kpQ = true;
              if ((!bg.mZ(a.this.rLf)) && (!bg.mZ(a.this.rLg)))
              {
                w.i("MicroMsg.RealNameVerifyProcess", "real name verify process end,jump to " + a.this.rLf + a.this.rLg);
                af.i(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6836916846592L, 50939);
                    a.1.this.gLd.putExtra("key_process_is_end", true);
                    a.1.this.gLd.putExtra("key_process_is_stay", this.rLl);
                    a.a(a.this, a.1.this.ibu, a.this.rLf, a.this.rLg, a.this.aHi, a.1.this.gLd, this.rLl);
                    if (a.this.aHi == -1)
                    {
                      sn localsn = new sn();
                      localsn.fRe.result = a.this.aHi;
                      com.tencent.mm.sdk.b.a.uLm.m(localsn);
                    }
                    GMTrace.o(6836916846592L, 50939);
                  }
                }, 500L);
                GMTrace.o(6846446305280L, 51010);
                return;
              }
              a.this.ab(paramActivity);
              if (a.this.aHi == -1)
              {
                sn localsn = new sn();
                localsn.fRe.result = a.this.aHi;
                com.tencent.mm.sdk.b.a.uLm.m(localsn);
              }
            }
            GMTrace.o(6846446305280L, 51010);
          }
        };
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
        GMTrace.o(6856781070336L, 51087);
        return;
        this.aHi = 0;
        continue;
        if (((Bundle)localObject).containsKey("realname_verify_process_ret")) {
          this.aHi = ((Bundle)localObject).getInt("realname_verify_process_ret", -1);
        } else {
          this.aHi = 0;
        }
      }
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6856512634880L, 51085);
    w(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    com.tencent.mm.wallet_core.c.n.ciN();
    if ((paramActivity instanceof SwitchRealnameVerifyModeUI)) {
      if (paramInt == 0) {
        b(paramActivity, this.lRQ);
      }
    }
    for (;;)
    {
      if ((paramActivity instanceof WalletPwdConfirmUI)) {
        a(paramActivity, WalletSetPasswordUI.class, paramInt);
      }
      GMTrace.o(6856512634880L, 51085);
      return;
      if (((paramActivity instanceof WalletRealNameVerifyUI)) || ((paramActivity instanceof WalletBankcardIdUI)))
      {
        if (this.rLi != 0) {
          b(paramActivity, this.lRQ);
        }
      }
      else if ((paramActivity instanceof WalletCheckPwdUI)) {
        b(paramActivity, this.lRQ);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */