package com.tencent.mm.plugin.wallet_core.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView.a;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView;
import com.tencent.mm.protocal.c.ej;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletSwitchVerifyPhoneUI
  extends WalletBaseUI
{
  private SwitchPhoneItemGroupView rXn;
  private List<ej> rXo;
  public boolean rXp;
  
  public WalletSwitchVerifyPhoneUI()
  {
    GMTrace.i(7013010505728L, 52251);
    this.rXp = false;
    GMTrace.o(7013010505728L, 52251);
  }
  
  private void bvq()
  {
    GMTrace.i(7013950029824L, 52258);
    w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
    Authen localAuthen = (Authen)this.un.getParcelable("key_authen");
    Bankcard localBankcard = (Bankcard)this.un.getParcelable("key_bankcard");
    ElementQuery localElementQuery = m.bwM().Jn(localBankcard.field_bankcardType);
    this.un.putParcelable("elemt_query", localElementQuery);
    localAuthen.oql = localBankcard.field_bankcardType;
    localAuthen.oqm = localBankcard.field_bindSerial;
    localBankcard.field_bankPhone = localElementQuery.rOa;
    this.un.putBoolean("key_balance_change_phone_need_confirm_phone", true);
    this.un.putBoolean("key_is_changing_balance_phone_num", true);
    this.un.putInt("key_err_code", 418);
    com.tencent.mm.wallet_core.a.i(this, this.un);
    GMTrace.o(7013950029824L, 52258);
  }
  
  protected final void MH()
  {
    GMTrace.i(7013278941184L, 52253);
    this.rXn = ((SwitchPhoneItemGroupView)findViewById(R.h.cjy));
    this.rXn.rYh = new SwitchPhoneItemGroupView.a()
    {
      public final void cN(View paramAnonymousView)
      {
        GMTrace.i(6987777572864L, 52063);
        if (paramAnonymousView.getTag() != null)
        {
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          w.d("MicroMsg.WalletSwitchVerifyPhoneUI", "index: %d", new Object[] { Integer.valueOf(i) });
          if (i == -1)
          {
            w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do bind new card");
            WalletSwitchVerifyPhoneUI.a(WalletSwitchVerifyPhoneUI.this);
            GMTrace.o(6987777572864L, 52063);
            return;
          }
          paramAnonymousView = (ej)WalletSwitchVerifyPhoneUI.b(WalletSwitchVerifyPhoneUI.this).get(i);
          WalletSwitchVerifyPhoneUI.this.un.putBoolean("key_balance_change_phone_need_confirm_phone", false);
          w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "select wx phone: %s", new Object[] { Boolean.valueOf(paramAnonymousView.tyz.equals("wx")) });
          WalletSwitchVerifyPhoneUI.this.cjn().j(new Object[] { paramAnonymousView });
        }
        GMTrace.o(6987777572864L, 52063);
      }
    };
    GMTrace.o(7013278941184L, 52253);
  }
  
  protected final boolean bvz()
  {
    GMTrace.i(7013815812096L, 52257);
    GMTrace.o(7013815812096L, 52257);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(7013547376640L, 52255);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.d))
      {
        this.rXo = ((com.tencent.mm.plugin.wallet_core.b.d)paramk).rKB.tTJ;
        Collections.sort(this.rXo, new Comparator() {});
        if ((this.rXo == null) || (this.rXo.isEmpty()))
        {
          w.i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
          GMTrace.o(7013547376640L, 52255);
          return true;
        }
        paramInt1 = this.rXo.size() - 1;
        label102:
        if (paramInt1 >= 0)
        {
          paramk = (ej)this.rXo.get(paramInt1);
          if (!paramk.tyz.equals("cft")) {
            break label395;
          }
          SwitchPhoneItemView localSwitchPhoneItemView = new SwitchPhoneItemView(this.vov.voR);
          if (!paramk.tyA.equals("1")) {
            break label258;
          }
          paramString = getString(R.l.eZt);
          label173:
          paramString = getString(R.l.eZr, new Object[] { paramk.mVv, paramString, paramk.tyB });
          if (!this.rXp) {
            break label269;
          }
          paramString = new SpannableString(paramString);
          label221:
          localSwitchPhoneItemView.setTag(Integer.valueOf(paramInt1));
          localSwitchPhoneItemView.a(paramk.rKI, paramString);
          this.rXn.a(localSwitchPhoneItemView, 0);
        }
        for (;;)
        {
          paramInt1 -= 1;
          break label102;
          break;
          label258:
          paramString = getString(R.l.eZs);
          break label173;
          label269:
          String str1 = getString(R.l.eZv);
          f localf = new f(this);
          String str2 = paramString + "，";
          localf.rE = getResources().getColor(R.e.aNB);
          paramString = new SpannableString(str2 + str1);
          paramString.setSpan(localf, str2.length(), str2.length() + str1.length(), 33);
          localf.rTY = new f.a()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6982408863744L, 52023);
              w.d("MicroMsg.WalletSwitchVerifyPhoneUI", "span click");
              WalletSwitchVerifyPhoneUI.a(WalletSwitchVerifyPhoneUI.this, paramk);
              GMTrace.o(6982408863744L, 52023);
            }
          };
          break label221;
          label395:
          paramString = new SwitchPhoneItemView(this.vov.voR);
          paramString.setTag(Integer.valueOf(paramInt1));
          paramString.a(paramk.rKI, getString(R.l.eZw));
          this.rXn.a(paramString, 0);
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.k)) {
        bvq();
      }
    }
    GMTrace.o(7013547376640L, 52255);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7013681594368L, 52256);
    int i = R.i.djq;
    GMTrace.o(7013681594368L, 52256);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7013144723456L, 52252);
    overridePendingTransition(R.a.aLT, R.a.aLt);
    super.onCreate(paramBundle);
    rV(getString(R.l.eZu));
    MH();
    this.rXp = this.un.getBoolean("key_block_bind_new_card", false);
    if (!this.rXp)
    {
      paramBundle = new SwitchPhoneItemView(this.vov.voR);
      paramBundle.setTag(Integer.valueOf(-1));
      paramBundle.a(getString(R.l.eZq), null);
      this.rXn.a(paramBundle, -1);
    }
    hz(1667);
    hz(461);
    hz(1505);
    l(new com.tencent.mm.plugin.wallet_core.b.d(bvp()));
    GMTrace.o(7013144723456L, 52252);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7013413158912L, 52254);
    super.onDestroy();
    hA(1667);
    hA(461);
    hA(1505);
    GMTrace.o(7013413158912L, 52254);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSwitchVerifyPhoneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */