package com.tencent.mm.plugin.collect.reward.ui;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class QrRewardBaseUI
  extends WalletBaseUI
{
  public QrRewardBaseUI()
  {
    GMTrace.i(19372315770880L, 144335);
    GMTrace.o(19372315770880L, 144335);
  }
  
  protected void anP()
  {
    GMTrace.i(19372584206336L, 144337);
    cO().cP().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.e.aMZ)));
    Object localObject = cO().cP().getCustomView();
    if (localObject != null)
    {
      View localView = ((View)localObject).findViewById(R.h.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(R.e.aOF));
      }
      localObject = ((View)localObject).findViewById(16908309);
      if ((localObject != null) && ((localObject instanceof TextView))) {
        ((TextView)localObject).setTextColor(getResources().getColor(R.e.white));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).setStatusBarColor(getResources().getColor(R.e.aNa));
    }
    GMTrace.o(19372584206336L, 144337);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19372449988608L, 144336);
    super.onCreate(paramBundle);
    anP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19378624004096L, 144382);
        QrRewardBaseUI.this.aKl();
        QrRewardBaseUI.a(QrRewardBaseUI.this);
        QrRewardBaseUI.this.finish();
        GMTrace.o(19378624004096L, 144382);
        return false;
      }
    });
    GMTrace.o(19372449988608L, 144336);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */