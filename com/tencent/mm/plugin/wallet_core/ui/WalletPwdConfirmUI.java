package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.sj;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

@com.tencent.mm.ui.base.a(19)
public class WalletPwdConfirmUI
  extends WalletBaseUI
{
  private com.tencent.mm.sdk.b.c gCa;
  public EditHintPasswdView rEk;
  private PayInfo rHl;
  private TextView rWd;
  private boolean rWe;
  private aj rWf;
  
  public WalletPwdConfirmUI()
  {
    GMTrace.i(6954491576320L, 51815);
    this.rWe = false;
    this.rWf = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(6977442807808L, 51986);
        if (WalletPwdConfirmUI.c(WalletPwdConfirmUI.this))
        {
          WalletPwdConfirmUI.d(WalletPwdConfirmUI.this);
          WalletPwdConfirmUI.e(WalletPwdConfirmUI.this);
        }
        GMTrace.o(6977442807808L, 51986);
        return false;
      }
    }, false);
    this.gCa = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6954491576320L, 51815);
  }
  
  private void bxO()
  {
    GMTrace.i(6955162664960L, 51820);
    Bundle localBundle = this.un;
    localBundle.putBoolean("intent_bind_end", true);
    com.tencent.mm.wallet_core.a.i(this, localBundle);
    GMTrace.o(6955162664960L, 51820);
  }
  
  protected final void MH()
  {
    GMTrace.i(6954760011776L, 51817);
    TextView localTextView = (TextView)findViewById(R.h.cKg);
    String str;
    if (com.tencent.mm.x.m.zS())
    {
      str = getString(R.l.eWB);
      localTextView.setText(str);
      this.rWd = ((TextView)findViewById(R.h.bQh));
      if (bg.L(rQ(0))) {
        break label190;
      }
      this.rWd.setText(R.l.eZn);
    }
    for (;;)
    {
      this.rWd.setVisibility(0);
      this.rWd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6952612528128L, 51801);
          Object localObject = WalletPwdConfirmUI.this.un.getString("key_new_pwd1");
          String str2 = WalletPwdConfirmUI.this.rEk.cjt();
          paramAnonymousView = WalletPwdConfirmUI.this.un.getString("kreq_token");
          String str1 = WalletPwdConfirmUI.this.un.getString("key_verify_code");
          w.d("Micromsg.WalletPwdConfirmUI", "mPayInfo " + WalletPwdConfirmUI.a(WalletPwdConfirmUI.this) + " vertifyCode: " + str1);
          if ((localObject != null) && (((String)localObject).equals(str2)))
          {
            localObject = new n();
            ((n)localObject).rQC = WalletPwdConfirmUI.this.rEk.getText();
            ((n)localObject).oRb = WalletPwdConfirmUI.a(WalletPwdConfirmUI.this);
            ((n)localObject).token = paramAnonymousView;
            ((n)localObject).rQD = str1;
            ((n)localObject).rQE = WalletPwdConfirmUI.this.un.getBoolean("key_is_bind_bankcard", true);
            if (!com.tencent.mm.wallet_core.a.aa(WalletPwdConfirmUI.this).ciy()) {}
            for (((n)localObject).flag = "1";; ((n)localObject).flag = "4")
            {
              paramAnonymousView = (FavorPayInfo)WalletPwdConfirmUI.this.un.getParcelable("key_favor_pay_info");
              if (paramAnonymousView != null)
              {
                ((n)localObject).rMF = paramAnonymousView.rOu;
                ((n)localObject).rMG = paramAnonymousView.rOr;
              }
              WalletPwdConfirmUI.this.cjn().j(new Object[] { localObject });
              GMTrace.o(6952612528128L, 51801);
              return;
            }
          }
          com.tencent.mm.wallet_core.a.k(WalletPwdConfirmUI.this, 64534);
          GMTrace.o(6952612528128L, 51801);
        }
      });
      this.rWd.setEnabled(false);
      this.rWd.setClickable(false);
      this.rEk = ((EditHintPasswdView)findViewById(R.h.bQg));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.rEk);
      this.rEk.xhY = new EditHintPasswdView.a()
      {
        public final void gQ(boolean paramAnonymousBoolean)
        {
          GMTrace.i(6918521225216L, 51547);
          if (paramAnonymousBoolean)
          {
            String str1 = WalletPwdConfirmUI.this.un.getString("key_new_pwd1");
            String str2 = WalletPwdConfirmUI.this.rEk.cjt();
            if ((str1 == null) || (!str1.equals(str2)))
            {
              com.tencent.mm.wallet_core.a.k(WalletPwdConfirmUI.this, 64534);
              GMTrace.o(6918521225216L, 51547);
              return;
            }
            WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setEnabled(paramAnonymousBoolean);
            WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setClickable(paramAnonymousBoolean);
            GMTrace.o(6918521225216L, 51547);
            return;
          }
          WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setEnabled(paramAnonymousBoolean);
          WalletPwdConfirmUI.b(WalletPwdConfirmUI.this).setClickable(paramAnonymousBoolean);
          GMTrace.o(6918521225216L, 51547);
        }
      };
      findViewById(R.h.bmo).setVisibility(8);
      e(this.rEk, 0, false);
      GMTrace.o(6954760011776L, 51817);
      return;
      str = getString(R.l.eWA);
      break;
      label190:
      this.rWd.setText(R.l.dvM);
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(6955699535872L, 51824);
    GMTrace.o(6955699535872L, 51824);
    return 1;
  }
  
  protected final boolean bvz()
  {
    GMTrace.i(6955565318144L, 51823);
    GMTrace.o(6955565318144L, 51823);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6955296882688L, 51821);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.un.putString("key_pwd1", this.rEk.getText());
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m)) {
        if (!this.rWe) {
          bxO();
        }
      }
      for (;;)
      {
        GMTrace.o(6955296882688L, 51821);
        return true;
        if ((com.tencent.mm.wallet_core.a.aa(this) != null) && (com.tencent.mm.wallet_core.a.aa(this).c(this, null)))
        {
          if (this.rHl != null) {}
          for (paramString = this.rHl.fAF;; paramString = "")
          {
            r(new com.tencent.mm.plugin.wallet_core.b.m(paramString));
            paramString = new sj();
            if (com.tencent.mm.sdk.b.a.uLm.t(paramString.getClass()))
            {
              this.rWe = true;
              com.tencent.mm.sdk.b.a.uLm.m(paramString);
            }
            this.rWf.w(10000L, 10000L);
            break;
          }
        }
        com.tencent.mm.wallet_core.a.i(this, this.un);
      }
    }
    GMTrace.o(6955296882688L, 51821);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6955431100416L, 51822);
    int i = R.i.djo;
    GMTrace.o(6955431100416L, 51822);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6954625794048L, 51816);
    super.onCreate(paramBundle);
    rV(s.fJ(this));
    this.rHl = ((PayInfo)this.un.getParcelable("key_pay_info"));
    MH();
    com.tencent.mm.plugin.wallet_core.d.c.b(this, this.un, 6);
    GMTrace.o(6954625794048L, 51816);
  }
  
  public void onPause()
  {
    GMTrace.i(6955028447232L, 51819);
    super.onPause();
    com.tencent.mm.sdk.b.a.uLm.c(this.gCa);
    GMTrace.o(6955028447232L, 51819);
  }
  
  public void onResume()
  {
    GMTrace.i(6954894229504L, 51818);
    this.rEk.requestFocus();
    super.onResume();
    com.tencent.mm.sdk.b.a.uLm.b(this.gCa);
    GMTrace.o(6954894229504L, 51818);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */