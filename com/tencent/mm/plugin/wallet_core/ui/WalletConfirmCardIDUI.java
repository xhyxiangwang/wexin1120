package com.tencent.mm.plugin.wallet_core.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.bankcard.TenpaySegmentEditText;

public class WalletConfirmCardIDUI
  extends WalletBaseUI
{
  private Button rTZ;
  private TenpaySegmentEditText rUa;
  private boolean rUb;
  
  public WalletConfirmCardIDUI()
  {
    GMTrace.i(6929661296640L, 51630);
    this.rUb = true;
    GMTrace.o(6929661296640L, 51630);
  }
  
  protected final void MH()
  {
    GMTrace.i(6930198167552L, 51634);
    final Object localObject = this.un.getString("key_bankcard_id");
    String str = this.un.getString("key_bankcard_des");
    Bitmap localBitmap = (Bitmap)this.un.getParcelable("key_bankcard_cropimg");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      w.e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
      finish();
      GMTrace.o(6930198167552L, 51634);
      return;
    }
    if (localBitmap == null)
    {
      w.e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
      finish();
      GMTrace.o(6930198167552L, 51634);
      return;
    }
    oC(R.l.eUa);
    this.rTZ = ((Button)findViewById(R.h.cgl));
    this.rUa = ((TenpaySegmentEditText)findViewById(R.h.bDi));
    this.rUa.setText((String)localObject, str);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(R.h.cAi));
    this.nzg = findViewById(R.h.cAh);
    ((ImageView)findViewById(R.h.bqe)).setImageBitmap(localBitmap);
    this.rUa.setKeyboard(this.mKeyboard);
    this.mKeyboard.setXMode(0);
    ((InputMethodManager)this.vov.voR.getSystemService("input_method")).hideSoftInputFromWindow(this.rUa.getWindowToken(), 0);
    this.nzg.setVisibility(8);
    this.rUa.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6984019476480L, 52035);
        if ((!WalletConfirmCardIDUI.a(WalletConfirmCardIDUI.this).isShown()) && (!WalletConfirmCardIDUI.b(WalletConfirmCardIDUI.this)))
        {
          WalletConfirmCardIDUI.c(WalletConfirmCardIDUI.this).setVisibility(0);
          WalletConfirmCardIDUI.d(WalletConfirmCardIDUI.this).setVisibility(0);
        }
        WalletConfirmCardIDUI.e(WalletConfirmCardIDUI.this);
        GMTrace.o(6984019476480L, 52035);
      }
    });
    localObject = this.rUa.get3DesEncrptData();
    this.rTZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6945901641728L, 51751);
        paramAnonymousView = WalletConfirmCardIDUI.f(WalletConfirmCardIDUI.this).get3DesEncrptData();
        if ((paramAnonymousView != null) && (paramAnonymousView.equals(localObject))) {
          g.paX.i(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
        }
        for (;;)
        {
          WalletConfirmCardIDUI.g(WalletConfirmCardIDUI.this);
          GMTrace.o(6945901641728L, 51751);
          return;
          g.paX.i(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
        }
      }
    });
    this.mKeyboard = ((MyKeyboardWindow)findViewById(R.h.cAi));
    this.nzg = findViewById(R.h.cAh);
    localObject = findViewById(R.h.cAj);
    if ((this.mKeyboard == null) || (this.nzg == null)) {}
    for (;;)
    {
      this.rUa.setFocusable(false);
      this.rUa.setFocusableInTouchMode(true);
      GMTrace.o(6930198167552L, 51634);
      return;
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16596156284928L, 123651);
          WalletConfirmCardIDUI.h(WalletConfirmCardIDUI.this);
          GMTrace.o(16596156284928L, 123651);
        }
      });
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6930332385280L, 51635);
    paramString = new Bundle();
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.k))
      {
        paramk = (com.tencent.mm.plugin.wallet_core.b.k)paramk;
        paramString.putBoolean("key_need_area", paramk.bwg());
        paramString.putBoolean("key_need_profession", paramk.bwh());
        paramString.putParcelableArray("key_profession_list", paramk.rKQ);
        if (paramk.rKL != null)
        {
          if ((paramk.rKL.rNV) && (paramk.rKL.isError()))
          {
            h.h(this, R.l.eSD, R.l.dxm);
            GMTrace.o(6930332385280L, 51635);
            return true;
          }
          paramString.putString("bank_name", paramk.rKL.mVv);
          paramString.putParcelable("elemt_query", paramk.rKL);
          paramString.putString("key_card_id", this.rUa.getEncryptDataWithHash(false));
          a.i(this, paramString);
          GMTrace.o(6930332385280L, 51635);
          return true;
        }
        paramString.putString("bank_name", "");
        paramString.putParcelable("elemt_query", new ElementQuery());
        paramString.putString("key_card_id", this.rUa.getEncryptDataWithHash(false));
        a.i(this, paramString);
      }
    }
    while ((paramInt2 != 1) || (!(paramk instanceof com.tencent.mm.plugin.wallet_core.b.k)))
    {
      GMTrace.o(6930332385280L, 51635);
      return false;
    }
    paramString.putString("bank_name", "");
    paramString.putParcelable("elemt_query", new ElementQuery());
    paramString.putString("key_card_id", this.rUa.getEncryptDataWithHash(false));
    a.i(this, paramString);
    GMTrace.o(6930332385280L, 51635);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6929795514368L, 51631);
    int i = R.i.dip;
    GMTrace.o(6929795514368L, 51631);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6929929732096L, 51632);
    super.onCreate(paramBundle);
    MH();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16594277236736L, 123637);
        n.ciN();
        WalletConfirmCardIDUI.this.finish();
        GMTrace.o(16594277236736L, 123637);
        return false;
      }
    });
    GMTrace.o(6929929732096L, 51632);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6930063949824L, 51633);
    super.onDestroy();
    GMTrace.o(6930063949824L, 51633);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */