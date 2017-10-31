package com.tencent.mm.plugin.wallet_core.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class b
  extends a
{
  public b()
  {
    GMTrace.i(6830877048832L, 50894);
    GMTrace.o(6830877048832L, 50894);
  }
  
  public com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6831011266560L, 50895);
    w(new Object[] { "start", paramActivity, paramBundle });
    w.d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
    if (paramBundle != null)
    {
      o.eK(6, paramBundle.getInt("key_bind_scene"));
      com.tencent.mm.wallet_core.c.n.Ec(paramBundle.getInt("key_bind_scene"));
    }
    while (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY())
    {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      GMTrace.o(6831011266560L, 50895);
      return this;
      o.eK(6, 0);
      com.tencent.mm.wallet_core.c.n.Ec(0);
    }
    if (paramBundle != null) {
      c.dx(paramBundle.getInt("key_bind_scene", 0), 1);
    }
    if ((paramBundle != null) && (paramBundle.getBoolean("key_is_import_bind", false)))
    {
      c(paramActivity, WalletCardImportUI.class, paramBundle);
      GMTrace.o(6831011266560L, 50895);
      return this;
    }
    paramActivity = super.a(paramActivity, paramBundle);
    GMTrace.o(6831011266560L, 50895);
    return paramActivity;
  }
  
  public d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(6831279702016L, 50897);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6826313646080L, 50860);
          GMTrace.o(6826313646080L, 50860);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6826447863808L, 50861);
          GMTrace.o(6826447863808L, 50861);
          return false;
        }
        
        public final CharSequence rQ(int paramAnonymousInt)
        {
          GMTrace.i(6826582081536L, 50862);
          switch (paramAnonymousInt)
          {
          default: 
            localObject = super.rQ(paramAnonymousInt);
            GMTrace.o(6826582081536L, 50862);
            return (CharSequence)localObject;
          case 1: 
            localObject = this.xgA.getString(R.l.eUN);
            GMTrace.o(6826582081536L, 50862);
            return (CharSequence)localObject;
          }
          Object localObject = this.xgA.getString(R.l.eTS);
          GMTrace.o(6826582081536L, 50862);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    if (((paramMMActivity instanceof WalletCardElementUI)) || ((paramMMActivity instanceof WalletCardImportUI)))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6826850516992L, 50864);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.a.a.a))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet_core.a.a.a)paramAnonymousk;
              b.a(b.this).putString("kreq_token", paramAnonymousString.token);
              if (b.this.c(this.xgA, b.b(b.this)))
              {
                w.i("MicroMsg.BindCardProcess", "need update bankcardlist");
                this.xgB.a(new com.tencent.mm.plugin.wallet_core.b.m(null), false);
              }
              for (;;)
              {
                GMTrace.o(6826850516992L, 50864);
                return true;
                w.i("MicroMsg.BindCardProcess", "not need update bankcardlist");
                b.this.a(this.xgA, 0, b.c(b.this));
              }
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.m))
            {
              w.i("MicroMsg.BindCardProcess", "update bankcardlist success!");
              b.this.a(this.xgA, 0, b.d(b.this));
              GMTrace.o(6826850516992L, 50864);
              return true;
            }
          }
          GMTrace.o(6826850516992L, 50864);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          int i = 2;
          GMTrace.i(6826984734720L, 50865);
          b.this.w(new Object[] { "onNext", paramAnonymousVarArgs });
          w.i("MicroMsg.BindCardProcess", "onNext, do bind bank card!");
          paramAnonymousVarArgs = (Authen)paramAnonymousVarArgs[0];
          if (!b.this.ciy()) {
            if (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()) {}
          }
          for (;;)
          {
            paramAnonymousVarArgs.fJg = i;
            this.xgB.a(new com.tencent.mm.plugin.wallet_core.a.a.a(paramAnonymousVarArgs), true, 1);
            GMTrace.o(6826984734720L, 50865);
            return true;
            i = 1;
            continue;
            if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()) {
              i = 5;
            } else {
              i = 4;
            }
          }
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6827253170176L, 50867);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.a.a.a))
            {
              w.i("MicroMsg.BindCardProcess", "verify code success!");
              paramAnonymousString = (com.tencent.mm.plugin.wallet_core.a.a.a)paramAnonymousk;
              b.e(b.this).putString("kreq_token", paramAnonymousString.token);
              GMTrace.o(6827253170176L, 50867);
              return true;
            }
            if (!(paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.h)) {
              break label92;
            }
            b.this.a(this.xgB);
          }
          label92:
          while (!(paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.h))
          {
            GMTrace.o(6827253170176L, 50867);
            return false;
          }
          GMTrace.o(6827253170176L, 50867);
          return true;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6827387387904L, 50868);
          b.this.w(new Object[] { "WalletVerifyCodeUI onNext", paramAnonymousVarArgs });
          w.i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.n)paramAnonymousVarArgs[1];
          if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY())
          {
            paramAnonymousVarArgs.flag = "2";
            if (!"realname_verify_process".equals(b.this.azd())) {
              break label121;
            }
            this.xgB.a(new com.tencent.mm.plugin.wallet_core.b.h(paramAnonymousVarArgs, b.this.lRQ.getInt("entry_scene", -1)), true, 1);
          }
          for (;;)
          {
            GMTrace.o(6827387387904L, 50868);
            return true;
            paramAnonymousVarArgs.flag = "1";
            break;
            label121:
            this.xgB.a(new com.tencent.mm.plugin.wallet_core.b.h(paramAnonymousVarArgs), true, 1);
          }
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6828863782912L, 50879);
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.a.a.b)) {
            b.this.a(this.xgB);
          }
          while (!(paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.h))
          {
            GMTrace.o(6828863782912L, 50879);
            return false;
          }
          GMTrace.o(6828863782912L, 50879);
          return true;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6828998000640L, 50880);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.n)paramAnonymousVarArgs[0];
          b.f(b.this).getString("verify_card_flag", "0");
          if ("realname_verify_process".equals(b.this.azd())) {
            this.xgB.a(new com.tencent.mm.plugin.wallet_core.a.a.b(paramAnonymousVarArgs, b.this.lRQ.getInt("entry_scene", -1)), true);
          }
          for (;;)
          {
            GMTrace.o(6828998000640L, 50880);
            return false;
            this.xgB.a(new com.tencent.mm.plugin.wallet_core.a.a.b(paramAnonymousVarArgs), true);
          }
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6831279702016L, 50897);
    return paramMMActivity;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6831145484288L, 50896);
    w(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    w.i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      if (paramBundle.getBoolean("key_is_import_bind", false))
      {
        c(paramActivity, WalletCardImportUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    if (((paramActivity instanceof WalletCardElementUI)) || ((paramActivity instanceof WalletCardImportUI)))
    {
      if (!ciy())
      {
        w.i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      if (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY())
      {
        w.i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      w.i("MicroMsg.BindCardProcess", "bind bank card success!!");
      paramBundle.putBoolean("intent_bind_end", true);
      com.tencent.mm.ui.base.h.bl(paramActivity, paramActivity.getString(R.l.eSE));
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    if (((paramActivity instanceof WalletVerifyCodeUI)) && (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()))
    {
      w.i("MicroMsg.BindCardProcess", "end process after verify!");
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      w.i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
      c.dx(this.lRQ.getInt("key_bind_scene", 0), 7);
      paramBundle.putBoolean("intent_bind_end", true);
      com.tencent.mm.ui.base.h.bl(paramActivity, paramActivity.getString(R.l.eSE));
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    w.i("MicroMsg.BindCardProcess", "super forward!");
    super.a(paramActivity, 0, paramBundle);
    GMTrace.o(6831145484288L, 50896);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(6831413919744L, 50898);
    w.d("MicroMsg.BindCardProcess", "do set user exinfo");
    paramf.a(new com.tencent.mm.plugin.wallet_core.id_verify.model.h(this.lRQ.getString("key_country_code", ""), this.lRQ.getString("key_province_code", ""), this.lRQ.getString("key_city_code", ""), (Profession)this.lRQ.getParcelable("key_profession")), false, 1);
    GMTrace.o(6831413919744L, 50898);
  }
  
  public String azd()
  {
    GMTrace.i(6831816572928L, 50901);
    GMTrace.o(6831816572928L, 50901);
    return "BindCardProcess";
  }
  
  public void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6831548137472L, 50899);
    w(new Object[] { "end", paramActivity, paramBundle });
    w.i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
    com.tencent.mm.wallet_core.c.n.ciN();
    ciC();
    if ((paramBundle != null) && (paramBundle.getBoolean("key_need_bind_response", false)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      a(paramActivity, "wallet", ".bind.ui.WalletBindUI", -1, localIntent, false);
      GMTrace.o(6831548137472L, 50899);
      return;
    }
    d(paramActivity, "mall", ".ui.MallIndexUI");
    GMTrace.o(6831548137472L, 50899);
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6831682355200L, 50900);
    if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY())
    {
      if (((paramActivity instanceof WalletCardElementUI)) && (ciy()))
      {
        GMTrace.o(6831682355200L, 50900);
        return true;
      }
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        GMTrace.o(6831682355200L, 50900);
        return true;
      }
      GMTrace.o(6831682355200L, 50900);
      return false;
    }
    boolean bool = paramActivity instanceof WalletPwdConfirmUI;
    GMTrace.o(6831682355200L, 50900);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */