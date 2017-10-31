package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;

public class WalletLqtSaveFetchFinishUI
  extends WalletBaseUI
{
  private Button nWU;
  private TextView rDH;
  private WalletTextView rDI;
  private TextView rDJ;
  private TextView rDK;
  
  public WalletLqtSaveFetchFinishUI()
  {
    GMTrace.i(18398834589696L, 137082);
    GMTrace.o(18398834589696L, 137082);
  }
  
  protected final int Qb()
  {
    GMTrace.i(18399371460608L, 137086);
    GMTrace.o(18399371460608L, 137086);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(18399103025152L, 137084);
    GMTrace.o(18399103025152L, 137084);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18399237242880L, 137085);
    int i = R.i.diF;
    GMTrace.o(18399237242880L, 137085);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18398968807424L, 137083);
    super.onCreate(paramBundle);
    this.rDH = ((TextView)findViewById(R.h.czq));
    this.rDI = ((WalletTextView)findViewById(R.h.bhS));
    this.nWU = ((Button)findViewById(R.h.bIz));
    this.rDJ = ((TextView)findViewById(R.h.ckZ));
    this.rDK = ((TextView)findViewById(R.h.cDq));
    int i = getIntent().getIntExtra("key_mode", 1);
    double d = getIntent().getDoubleExtra("key_amount", 0.0D);
    paramBundle = getIntent().getStringExtra("profile_date_wording");
    String str = getIntent().getStringExtra("profile_upgrade_wording");
    if (i == 1)
    {
      this.rDH.setText(getString(R.l.eVD));
      rV(getString(R.l.eVD));
    }
    for (;;)
    {
      this.rDI.setText(e.r(d));
      this.nWU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18401250508800L, 137100);
          WalletLqtSaveFetchFinishUI.this.finish();
          GMTrace.o(18401250508800L, 137100);
        }
      });
      if (!bg.mZ(paramBundle))
      {
        this.rDJ.setText(paramBundle);
        this.rDJ.setVisibility(0);
      }
      if (!bg.mZ(str))
      {
        this.rDK.setText(h.f(this, str, (int)this.rDK.getTextSize()));
        this.rDK.setClickable(true);
        this.rDK.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
        this.rDK.setVisibility(0);
      }
      GMTrace.o(18398968807424L, 137083);
      return;
      if (i == 2)
      {
        this.rDH.setText(getString(R.l.eVu));
        rV(getString(R.l.eVu));
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */