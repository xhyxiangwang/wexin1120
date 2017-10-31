package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;
import com.tencent.mm.x.m;

@com.tencent.mm.ui.base.a(19)
public class WalletSetPasswordUI
  extends WalletBaseUI
{
  public EditHintPasswdView rEk;
  
  public WalletSetPasswordUI()
  {
    GMTrace.i(6951404568576L, 51792);
    GMTrace.o(6951404568576L, 51792);
  }
  
  protected final void MH()
  {
    GMTrace.i(6951673004032L, 51794);
    TextView localTextView;
    Object localObject;
    if (this.un.getInt("key_err_code", 0) == 64534)
    {
      localTextView = (TextView)findViewById(R.h.bQf);
      localTextView.setVisibility(0);
      if (m.zS())
      {
        localObject = getString(R.l.eZm);
        localTextView.setText((CharSequence)localObject);
        this.un.putInt("key_err_code", 0);
      }
    }
    else
    {
      this.rEk = ((EditHintPasswdView)findViewById(R.h.bQg));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.rEk);
      findViewById(R.h.bmo).setVisibility(8);
      localTextView = (TextView)findViewById(R.h.cKg);
      localObject = com.tencent.mm.wallet_core.a.aa(this);
      if ((localObject == null) || (!(localObject instanceof com.tencent.mm.plugin.wallet_core.id_verify.a))) {
        break label187;
      }
      localObject = getString(R.l.eZj);
    }
    for (;;)
    {
      localTextView.setText((CharSequence)localObject);
      this.rEk.xhY = new EditHintPasswdView.a()
      {
        public final void gQ(boolean paramAnonymousBoolean)
        {
          GMTrace.i(6931674562560L, 51645);
          if (paramAnonymousBoolean)
          {
            String str = WalletSetPasswordUI.this.rEk.cjt();
            Bundle localBundle = new Bundle();
            localBundle.putString("key_new_pwd1", str);
            WalletSetPasswordUI.this.rEk.aYY();
            com.tencent.mm.wallet_core.a.i(WalletSetPasswordUI.this, localBundle);
          }
          GMTrace.o(6931674562560L, 51645);
        }
      };
      e(this.rEk, 0, false);
      GMTrace.o(6951673004032L, 51794);
      return;
      localObject = getString(R.l.eZl);
      break;
      label187:
      if (m.zS()) {
        localObject = getString(R.l.eZk);
      } else {
        localObject = getString(R.l.cKg);
      }
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(6952344092672L, 51799);
    GMTrace.o(6952344092672L, 51799);
    return 1;
  }
  
  protected final boolean bvz()
  {
    GMTrace.i(6952209874944L, 51798);
    GMTrace.o(6952209874944L, 51798);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6951941439488L, 51796);
    GMTrace.o(6951941439488L, 51796);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6952075657216L, 51797);
    int i = R.i.djo;
    GMTrace.o(6952075657216L, 51797);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6951538786304L, 51793);
    super.onCreate(paramBundle);
    rV(s.fJ(this));
    MH();
    c.b(this, this.un, 5);
    GMTrace.o(6951538786304L, 51793);
  }
  
  public void onResume()
  {
    GMTrace.i(6951807221760L, 51795);
    this.rEk.requestFocus();
    super.onResume();
    GMTrace.o(6951807221760L, 51795);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */