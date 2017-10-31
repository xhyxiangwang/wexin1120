package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBalanceResultUI
  extends WalletBaseUI
{
  protected Button lsT;
  protected TextView nCb;
  public Orders oZx;
  protected TextView qYe;
  public TextView rCS;
  public TextView rCT;
  protected TextView rCU;
  public CheckBox rCV;
  public Bankcard rCW;
  
  public WalletBalanceResultUI()
  {
    GMTrace.i(7720069496832L, 57519);
    GMTrace.o(7720069496832L, 57519);
  }
  
  private void buX()
  {
    GMTrace.i(7720606367744L, 57523);
    if ((this.rCV.getVisibility() == 0) && (this.rCV.isChecked()))
    {
      int i = this.un.getInt("key_pay_flag", 0);
      String str1 = this.un.getString("key_pwd1");
      String str2 = this.un.getString("key_verify_code");
      PayInfo localPayInfo = (PayInfo)this.un.getParcelable("key_pay_info");
      l(new com.tencent.mm.plugin.wallet.balance.a.a(i, str1, str2, localPayInfo.fAF, localPayInfo.fIG));
      GMTrace.o(7720606367744L, 57523);
      return;
    }
    buY();
    GMTrace.o(7720606367744L, 57523);
  }
  
  public void MH()
  {
    GMTrace.i(7720472150016L, 57522);
    rV((String)cjn().rQ(0));
    this.qYe = ((TextView)findViewById(R.h.cHF));
    this.qYe.setText(cjn().rQ(1));
    this.rCU = ((TextView)findViewById(R.h.cHK));
    this.nCb = ((TextView)findViewById(R.h.cHJ));
    Object localObject = cjn().rQ(2);
    if (!bg.L((CharSequence)localObject))
    {
      this.rCU.setVisibility(0);
      this.nCb.setVisibility(0);
      this.nCb.setText((CharSequence)localObject);
      localObject = (ImageView)findViewById(R.h.cHI);
      int i = this.un.getInt("key_balance_result_logo", -1);
      if (i <= 0) {
        break label325;
      }
      ((ImageView)localObject).setImageResource(i);
      label151:
      this.rCT = ((TextView)findViewById(R.h.cHE));
      this.rCS = ((TextView)findViewById(R.h.cHL));
      localObject = (TextView)findViewById(R.h.cHM);
      if ((cjm() instanceof b)) {
        ((TextView)localObject).setText(getString(R.l.eSu));
      }
      this.rCV = ((CheckBox)findViewById(R.h.blC));
      this.rCW = ((Bankcard)this.un.getParcelable("key_bankcard"));
      if (this.rCW == null) {
        break label335;
      }
      this.rCV.setVisibility(8);
    }
    for (;;)
    {
      this.lsT = ((Button)findViewById(R.h.cgl));
      this.lsT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7723693375488L, 57546);
          WalletBalanceResultUI.a(WalletBalanceResultUI.this);
          GMTrace.o(7723693375488L, 57546);
        }
      });
      bUv();
      kR(false);
      GMTrace.o(7720472150016L, 57522);
      return;
      this.rCU.setVisibility(8);
      this.nCb.setVisibility(8);
      break;
      label325:
      ((ImageView)localObject).setImageResource(R.k.dqw);
      break label151;
      label335:
      this.rCV.setVisibility(0);
    }
  }
  
  public void ar()
  {
    GMTrace.i(7720740585472L, 57524);
    if (this.oZx != null)
    {
      this.rCS.setText(e.d(this.oZx.rOR, this.oZx.ori));
      Object localObject;
      if ((this.oZx.rPj != null) && (this.oZx.rPj.size() > 0))
      {
        localObject = (Orders.Commodity)this.oZx.rPj.get(0);
        if (bg.mZ(((Orders.Commodity)localObject).rPz)) {
          break label219;
        }
        this.rCT.setText(((Orders.Commodity)localObject).org + " " + getString(R.l.eXo) + ((Orders.Commodity)localObject).rPz);
      }
      while ((cjm() instanceof b)) {
        if (this.oZx.oVZ > 0.0D)
        {
          findViewById(R.h.cHH).setVisibility(0);
          localObject = (TextView)findViewById(R.h.cHG);
          ((TextView)localObject).setText(e.d(this.oZx.oVZ, this.oZx.ori));
          ((TextView)localObject).setVisibility(0);
          GMTrace.o(7720740585472L, 57524);
          return;
          label219:
          this.rCT.setText(((Orders.Commodity)localObject).org);
        }
        else
        {
          w.i("MicroMsg.WalletBalanceResultUI", "fetch_fee is 0");
        }
      }
    }
    GMTrace.o(7720740585472L, 57524);
  }
  
  public final void buY()
  {
    GMTrace.i(7720874803200L, 57525);
    if (!cjn().j(new Object[] { this.oZx })) {
      super.buY();
    }
    GMTrace.o(7720874803200L, 57525);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7721143238656L, 57527);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.wallet.balance.a.a)))
    {
      p.bvm();
      p.bvn().rRw = bg.Po();
      buY();
      GMTrace.o(7721143238656L, 57527);
      return true;
    }
    GMTrace.o(7721143238656L, 57527);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7720203714560L, 57520);
    int i = R.i.dhT;
    GMTrace.o(7720203714560L, 57520);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(7721009020928L, 57526);
    GMTrace.o(7721009020928L, 57526);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7720337932288L, 57521);
    super.onCreate(paramBundle);
    this.oZx = ((Orders)this.un.getParcelable("key_orders"));
    MH();
    ar();
    GMTrace.o(7720337932288L, 57521);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */