package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.b.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

@com.tencent.mm.ui.base.a(1)
public class WalletLqtSimpleCheckPwdUI
  extends WalletBaseUI
{
  private EditHintPasswdView rEk;
  private i rEl;
  
  public WalletLqtSimpleCheckPwdUI()
  {
    GMTrace.i(18405277040640L, 137130);
    GMTrace.o(18405277040640L, 137130);
  }
  
  protected final int Qb()
  {
    GMTrace.i(18405948129280L, 137135);
    GMTrace.o(18405948129280L, 137135);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(18405545476096L, 137132);
    w.d("MicroMsg.WalletLqtSimpleCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof i))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.rEk.getText();
        paramk = new Intent();
        paramk.putExtra("lqt_enc_pwd", paramString);
        setResult(-1, paramk);
        finish();
        GMTrace.o(18405545476096L, 137132);
        return true;
      }
      if (this.rEk != null) {
        this.rEk.aYY();
      }
    }
    GMTrace.o(18405545476096L, 137132);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18405813911552L, 137134);
    int i = R.i.diH;
    GMTrace.o(18405813911552L, 137134);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18405411258368L, 137131);
    super.onCreate(paramBundle);
    rV(s.fK(this));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18412793233408L, 137186);
        WalletLqtSimpleCheckPwdUI.this.finish();
        GMTrace.o(18412793233408L, 137186);
        return false;
      }
    });
    ((TextView)findViewById(R.h.bQj)).setText(R.l.eTS);
    this.rEk = ((EditHintPasswdView)findViewById(R.h.bQg));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rEk);
    this.rEk.xhY = new EditHintPasswdView.a()
    {
      public final void gQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18413061668864L, 137188);
        if (paramAnonymousBoolean)
        {
          WalletLqtSimpleCheckPwdUI.a(WalletLqtSimpleCheckPwdUI.this, new i(WalletLqtSimpleCheckPwdUI.a(WalletLqtSimpleCheckPwdUI.this).getText(), 7, WalletLqtSimpleCheckPwdUI.this.bvp()));
          WalletLqtSimpleCheckPwdUI.this.r(WalletLqtSimpleCheckPwdUI.b(WalletLqtSimpleCheckPwdUI.this));
        }
        GMTrace.o(18413061668864L, 137188);
      }
    };
    e(this.rEk, 0, false);
    GMTrace.o(18405411258368L, 137131);
  }
  
  public final void sa(int paramInt)
  {
    GMTrace.i(18405679693824L, 137133);
    super.sa(paramInt);
    if (this.rEk != null) {
      this.rEk.aYY();
    }
    GMTrace.o(18405679693824L, 137133);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSimpleCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */