package com.tencent.mm.plugin.wallet.balance;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.f.a.i;
import java.text.SimpleDateFormat;
import java.util.Date;

public class b
  extends com.tencent.mm.wallet_core.b
{
  public b()
  {
    GMTrace.i(7729196302336L, 57587);
    GMTrace.o(7729196302336L, 57587);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7729330520064L, 57588);
    com.tencent.mm.wallet_core.c.n.Ec(14);
    if ((paramActivity instanceof WalletBalanceFetchUI))
    {
      p.bvm();
      if (p.bvn().bwY()) {
        if ((Bankcard)this.lRQ.getParcelable("key_bankcard") != null)
        {
          this.lRQ.putInt("key_pay_flag", 3);
          this.lRQ.putString("key_pwd_cash_title", paramActivity.getString(R.l.eSi));
          Orders localOrders = (Orders)this.lRQ.getParcelable("key_orders");
          if (localOrders != null) {
            this.lRQ.putString("key_pwd_cash_money", com.tencent.mm.wallet_core.ui.e.s(localOrders.rOR));
          }
          c(paramActivity, WalletBalanceFetchPwdInputUI.class, paramBundle);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(7729330520064L, 57588);
      return this;
      this.lRQ.putInt("key_pay_flag", 2);
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      continue;
      this.lRQ.putInt("key_pay_flag", 1);
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      continue;
      c(paramActivity, WalletBalanceFetchUI.class, paramBundle);
    }
  }
  
  public final d a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.f paramf)
  {
    GMTrace.i(7730001608704L, 57593);
    if ((paramMMActivity instanceof WalletBalanceFetchUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7728256778240L, 57580);
          GMTrace.o(7728256778240L, 57580);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7728390995968L, 57581);
          b.this.a(this.xgA, 0, b.this.lRQ);
          GMTrace.o(7728390995968L, 57581);
          return true;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7728122560512L, 57579);
          paramAnonymousVarArgs = b.a(b.this);
          p.bvm();
          paramAnonymousVarArgs.putParcelable("key_history_bankcard", p.bvn().rRq);
          paramAnonymousVarArgs = (PayInfo)b.this.lRQ.get("key_pay_info");
          com.tencent.mm.wallet_core.d.f localf = this.xgB;
          if (paramAnonymousVarArgs == null) {}
          for (paramAnonymousVarArgs = null;; paramAnonymousVarArgs = paramAnonymousVarArgs.fAF)
          {
            localf.a(new com.tencent.mm.plugin.wallet_core.b.m(paramAnonymousVarArgs, 4), true);
            GMTrace.o(7728122560512L, 57579);
            return false;
          }
        }
      };
      GMTrace.o(7730001608704L, 57593);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletBalanceFetchPwdInputUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          boolean bool = false;
          GMTrace.i(7702486974464L, 57388);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pay.a.a.b)))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramAnonymousk;
            b.b(b.this).putString("kreq_token", paramAnonymousString.token);
            b.c(b.this).putParcelable("key_authen", paramAnonymousString.rGU);
            paramAnonymousk = b.d(b.this);
            if (!paramAnonymousString.rGS) {
              bool = true;
            }
            paramAnonymousk.putBoolean("key_need_verify_sms", bool);
            paramAnonymousString = paramAnonymousString.onA;
            if (paramAnonymousString != null) {
              b.e(b.this).putParcelable("key_realname_guide_helper", paramAnonymousString);
            }
            a.i(this.xgA, b.f(b.this));
            this.xgA.finish();
            GMTrace.o(7702486974464L, 57388);
            return true;
          }
          GMTrace.o(7702486974464L, 57388);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7702621192192L, 57389);
          Bankcard localBankcard = (Bankcard)b.g(b.this).getParcelable("key_bankcard");
          Object localObject = (String)paramAnonymousVarArgs[0];
          b.h(b.this).putString("key_pwd1", (String)localObject);
          b.i(b.this).putString("key_mobile", localBankcard.field_mobile);
          localObject = new Authen();
          ((Authen)localObject).fJg = 3;
          ((Authen)localObject).rMu = ((String)paramAnonymousVarArgs[0]);
          ((Authen)localObject).oqm = localBankcard.field_bindSerial;
          ((Authen)localObject).oql = localBankcard.field_bankcardType;
          ((Authen)localObject).oRb = ((PayInfo)b.j(b.this).getParcelable("key_pay_info"));
          ((Authen)localObject).rMC = localBankcard.field_arrive_type;
          this.xgB.a(new com.tencent.mm.plugin.wallet.pay.a.a.b((Authen)localObject, (Orders)b.k(b.this).getParcelable("key_orders")), true, 1);
          GMTrace.o(7702621192192L, 57389);
          return true;
        }
      };
      GMTrace.o(7730001608704L, 57593);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletCardElementUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7735370317824L, 57633);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramAnonymousk;
              b.l(b.this).putString("kreq_token", paramAnonymousString.token);
              if (paramAnonymousString.rHU) {
                b.m(b.this).putParcelable("key_orders", paramAnonymousString.rGT);
              }
            }
            if (b.this.c(this.xgA, null))
            {
              paramAnonymousk = this.xgB;
              paramAnonymousString = b.this;
              if (paramAnonymousString.lRQ != null)
              {
                paramAnonymousString = (PayInfo)paramAnonymousString.lRQ.getParcelable("key_pay_info");
                if (paramAnonymousString == null) {}
              }
              for (paramAnonymousString = paramAnonymousString.fAF;; paramAnonymousString = "")
              {
                paramAnonymousk.a(new com.tencent.mm.plugin.wallet_core.b.m(paramAnonymousString), true, 1);
                GMTrace.o(7735370317824L, 57633);
                return true;
              }
            }
            b.this.a(this.xgA, 0, b.n(b.this));
            GMTrace.o(7735370317824L, 57633);
            return true;
          }
          GMTrace.o(7735370317824L, 57633);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7735504535552L, 57634);
          Authen localAuthen = (Authen)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = (Orders)paramAnonymousVarArgs[1];
          switch (b.o(b.this).getInt("key_pay_flag", 0))
          {
          default: 
            GMTrace.o(7735504535552L, 57634);
            return false;
          case 1: 
            if (!b.this.ciy()) {
              localAuthen.fJg = 1;
            }
            break;
          }
          for (;;)
          {
            b.p(b.this).putParcelable("key_authen", localAuthen);
            this.xgB.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramAnonymousVarArgs), true, 1);
            GMTrace.o(7735504535552L, 57634);
            return true;
            localAuthen.fJg = 4;
            continue;
            if (!b.this.ciy())
            {
              localAuthen.fJg = 2;
            }
            else
            {
              localAuthen.fJg = 5;
              continue;
              if (!b.this.ciy()) {
                localAuthen.fJg = 3;
              } else {
                localAuthen.fJg = 6;
              }
            }
          }
        }
      };
      GMTrace.o(7730001608704L, 57593);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7701144797184L, 57378);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pay.a.c.e))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.c.e)paramAnonymousk;
              if (paramAnonymousString.rHU) {
                b.q(b.this).putParcelable("key_orders", paramAnonymousString.rGT);
              }
              a.i(this.xgA, b.r(b.this));
              GMTrace.o(7701144797184L, 57378);
              return true;
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramAnonymousk;
              paramAnonymousk = paramAnonymousString.onA;
              if (paramAnonymousk != null) {
                b.s(b.this).putParcelable("key_realname_guide_helper", paramAnonymousk);
              }
              b.t(b.this).putString("kreq_token", paramAnonymousString.token);
              GMTrace.o(7701144797184L, 57378);
              return true;
            }
          }
          GMTrace.o(7701144797184L, 57378);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7701279014912L, 57379);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.n)paramAnonymousVarArgs[1];
          if ((paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.oRb != null)) {
            paramAnonymousVarArgs.oRb.fIG = 21;
          }
          Orders localOrders = (Orders)b.u(b.this).getParcelable("key_orders");
          switch (b.this.lRQ.getInt("key_pay_flag", 0))
          {
          default: 
            GMTrace.o(7701279014912L, 57379);
            return false;
          case 1: 
            paramAnonymousVarArgs.flag = "1";
          }
          for (;;)
          {
            this.xgB.a(new com.tencent.mm.plugin.wallet.pay.a.c.e(paramAnonymousVarArgs, localOrders), true, 1);
            GMTrace.o(7701279014912L, 57379);
            return true;
            if (!b.this.ciy())
            {
              paramAnonymousVarArgs.flag = "2";
            }
            else
            {
              paramAnonymousVarArgs.flag = "5";
              continue;
              if (!b.this.ciy()) {
                paramAnonymousVarArgs.flag = "3";
              } else {
                paramAnonymousVarArgs.flag = "6";
              }
            }
          }
        }
        
        public final boolean q(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7701413232640L, 57380);
          paramAnonymousVarArgs = (Orders)b.v(b.this).getParcelable("key_orders");
          Authen localAuthen = (Authen)b.w(b.this).getParcelable("key_authen");
          this.xgB.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramAnonymousVarArgs), true, 1);
          GMTrace.o(7701413232640L, 57380);
          return true;
        }
      };
      GMTrace.o(7730001608704L, 57593);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletBalanceResultUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7701950103552L, 57384);
          GMTrace.o(7701950103552L, 57384);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7702084321280L, 57385);
          GMTrace.o(7702084321280L, 57385);
          return false;
        }
        
        public final boolean p(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7701815885824L, 57383);
          Orders localOrders = (Orders)b.z(b.this).getParcelable("key_orders");
          Bankcard localBankcard = com.tencent.mm.plugin.wallet_core.model.m.bwE().rCP;
          localBankcard.rNa -= localOrders.rOR;
          b.A(b.this).putInt("key_balance_result_logo", R.k.dqz);
          boolean bool = super.p(paramAnonymousVarArgs);
          GMTrace.o(7701815885824L, 57383);
          return bool;
        }
        
        public final CharSequence rQ(int paramAnonymousInt)
        {
          GMTrace.i(7702218539008L, 57386);
          switch (paramAnonymousInt)
          {
          }
          do
          {
            localObject = super.rQ(paramAnonymousInt);
            GMTrace.o(7702218539008L, 57386);
            return (CharSequence)localObject;
            localObject = this.xgA.getString(R.l.eSr);
            GMTrace.o(7702218539008L, 57386);
            return (CharSequence)localObject;
            localObject = (Orders)b.B(b.this).getParcelable("key_orders");
            if ((localObject != null) && (!bg.mZ(((Orders)localObject).rPe)))
            {
              localObject = ((Orders)localObject).rPe;
              GMTrace.o(7702218539008L, 57386);
              return (CharSequence)localObject;
            }
            localObject = this.xgA.getString(R.l.eSq);
            GMTrace.o(7702218539008L, 57386);
            return (CharSequence)localObject;
            localObject = (Orders)b.C(b.this).getParcelable("key_orders");
          } while ((localObject == null) || (((Orders)localObject).rPd <= 0L));
          Object localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(((Orders)localObject).rPd));
          GMTrace.o(7702218539008L, 57386);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7730001608704L, 57593);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7734833446912L, 57629);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pay.a.d.f)))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.d.f)paramAnonymousk;
            if (paramAnonymousString.rHU) {
              b.D(b.this).putParcelable("key_orders", paramAnonymousString.rGT);
            }
            b.this.a(this.xgA, 0, b.E(b.this));
            GMTrace.o(7734833446912L, 57629);
            return true;
          }
          GMTrace.o(7734833446912L, 57629);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7734967664640L, 57630);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.n)paramAnonymousVarArgs[0];
          Orders localOrders = (Orders)b.F(b.this).getParcelable("key_orders");
          this.xgB.a(new com.tencent.mm.plugin.wallet.pay.a.d.f(paramAnonymousVarArgs, localOrders), true, 1);
          GMTrace.o(7734967664640L, 57630);
          return true;
        }
      };
      GMTrace.o(7730001608704L, 57593);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7730001608704L, 57593);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7729464737792L, 57589);
    if ((paramActivity instanceof WalletBalanceFetchUI))
    {
      p.bvm();
      if (p.bvn().bwY())
      {
        if ((Bankcard)this.lRQ.getParcelable("key_bankcard") != null)
        {
          this.lRQ.putInt("key_pay_flag", 3);
          this.lRQ.putString("key_pwd_cash_title", paramActivity.getString(R.l.eSi));
          Orders localOrders = (Orders)this.lRQ.getParcelable("key_orders");
          if (localOrders != null) {
            this.lRQ.putString("key_pwd_cash_money", com.tencent.mm.wallet_core.ui.e.s(localOrders.rOR));
          }
          c(paramActivity, WalletBalanceFetchPwdInputUI.class, paramBundle);
          GMTrace.o(7729464737792L, 57589);
          return;
        }
        this.lRQ.putInt("key_pay_flag", 2);
        c(paramActivity, WalletCheckPwdUI.class, paramBundle);
        GMTrace.o(7729464737792L, 57589);
        return;
      }
      this.lRQ.putInt("key_pay_flag", 1);
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletBalanceFetchPwdInputUI))
    {
      if (paramBundle.getBoolean("key_need_verify_sms", false))
      {
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        GMTrace.o(7729464737792L, 57589);
        return;
      }
      c(paramActivity, WalletBalanceResultUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
    {
      c(paramActivity, WalletCardElementUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletCardElementUI))
    {
      c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletVerifyCodeUI))
    {
      p.bvm();
      if (p.bvn().bwY())
      {
        c(paramActivity, WalletBalanceResultUI.class, paramBundle);
        GMTrace.o(7729464737792L, 57589);
        return;
      }
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      c(paramActivity, WalletBalanceResultUI.class, paramBundle);
      GMTrace.o(7729464737792L, 57589);
      return;
    }
    if ((paramActivity instanceof WalletBalanceResultUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(7729464737792L, 57589);
  }
  
  public final String azd()
  {
    GMTrace.i(7730270044160L, 57595);
    GMTrace.o(7730270044160L, 57595);
    return "BalanceFetchProcess";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(7730135826432L, 57594);
    paramInt = R.l.eSe;
    GMTrace.o(7730135826432L, 57594);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7729733173248L, 57591);
    a(paramActivity, WalletBalanceManagerUI.class, -1, true);
    GMTrace.o(7729733173248L, 57591);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7729598955520L, 57590);
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      GMTrace.o(7729598955520L, 57590);
      return;
    }
    if ((paramActivity instanceof WalletBalanceResultUI))
    {
      com.tencent.mm.wallet_core.c.n.ciN();
      b(paramActivity, this.lRQ);
      GMTrace.o(7729598955520L, 57590);
      return;
    }
    com.tencent.mm.wallet_core.c.n.ciN();
    B(paramActivity);
    GMTrace.o(7729598955520L, 57590);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7729867390976L, 57592);
    GMTrace.o(7729867390976L, 57592);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */