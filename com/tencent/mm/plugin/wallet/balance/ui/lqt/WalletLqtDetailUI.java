package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.px;
import com.tencent.mm.plugin.wallet.balance.a.a.h.a;
import com.tencent.mm.plugin.wallet.balance.a.a.h.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.amz;
import com.tencent.mm.protocal.c.auk;
import com.tencent.mm.protocal.c.mv;
import com.tencent.mm.protocal.c.pj;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.Iterator;
import java.util.LinkedList;

public class WalletLqtDetailUI
  extends WalletLqtBasePresenterUI
{
  private ae handler;
  private Dialog iiw;
  private TextView rDA;
  private boolean rDB;
  private com.tencent.mm.plugin.wallet.balance.a.a.g rDg;
  private com.tencent.mm.plugin.wallet.balance.a.a.h rDh;
  private auk rDi;
  private ViewGroup rDj;
  private TextView rDk;
  private WalletTextView rDl;
  private TextView rDm;
  private TextView rDn;
  private TextView rDo;
  private WalletTextView rDp;
  private Button rDq;
  private Button rDr;
  private LinearLayout rDs;
  private TextView rDt;
  private View rDu;
  private TextView rDv;
  private View rDw;
  private View rDx;
  private CdnImageView rDy;
  private TextView rDz;
  
  public WalletLqtDetailUI()
  {
    GMTrace.i(18406753435648L, 137141);
    this.rDg = ((com.tencent.mm.plugin.wallet.balance.a.a.g)p(com.tencent.mm.plugin.wallet.balance.a.a.g.class));
    this.rDh = ((com.tencent.mm.plugin.wallet.balance.a.a.h)m(com.tencent.mm.plugin.wallet.balance.a.a.h.class));
    this.rDB = true;
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(18406753435648L, 137141);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18407156088832L, 137144);
    int i = R.i.diE;
    GMTrace.o(18407156088832L, 137144);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18407290306560L, 137145);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 123) && (paramInt2 == -1))
    {
      this.rDB = false;
      paramIntent = paramIntent.getStringExtra("lqt_enc_pwd");
      if (this.iiw != null) {
        break label114;
      }
      this.iiw = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
    }
    for (;;)
    {
      h.a locala = this.rDh.rBI;
      com.tencent.mm.vending.g.g.bV(paramIntent).a(locala).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
      {
        public final void aE(Object paramAnonymousObject)
        {
          GMTrace.i(18404874387456L, 137127);
          if (WalletLqtDetailUI.a(WalletLqtDetailUI.this) != null) {
            WalletLqtDetailUI.a(WalletLqtDetailUI.this).dismiss();
          }
          w.i("MicroMsg.WalletLqtDetailUI", "close account failed: %s", new Object[] { paramAnonymousObject });
          if (paramAnonymousObject != null) {
            if (!(paramAnonymousObject instanceof String)) {
              break label80;
            }
          }
          label80:
          for (paramAnonymousObject = paramAnonymousObject.toString();; paramAnonymousObject = WalletLqtDetailUI.this.getString(R.l.eVx))
          {
            Toast.makeText(WalletLqtDetailUI.this, (CharSequence)paramAnonymousObject, 1).show();
            GMTrace.o(18404874387456L, 137127);
            return;
          }
        }
      });
      GMTrace.o(18407290306560L, 137145);
      return;
      label114:
      this.iiw.show();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18406887653376L, 137142);
    super.onCreate(paramBundle);
    if (cO().cP() != null) {
      cO().cP().setBackgroundDrawable(getResources().getDrawable(R.e.aQI));
    }
    if (com.tencent.mm.compatible.util.d.et(21)) {
      getWindow().setStatusBarColor(getResources().getColor(R.e.aQI));
    }
    rV(getString(R.l.eVF));
    this.rDj = ((ViewGroup)findViewById(R.h.bAU));
    this.rDk = ((TextView)findViewById(R.h.bVz));
    this.rDl = ((WalletTextView)findViewById(R.h.bVi));
    this.rDm = ((TextView)findViewById(R.h.bVj));
    this.rDn = ((TextView)findViewById(R.h.bVk));
    this.rDo = ((TextView)findViewById(R.h.bVs));
    this.rDp = ((WalletTextView)findViewById(R.h.bVt));
    this.rDq = ((Button)findViewById(R.h.bVw));
    this.rDr = ((Button)findViewById(R.h.bVr));
    this.rDs = ((LinearLayout)findViewById(R.h.bVo));
    this.rDt = ((TextView)findViewById(R.h.bVq));
    this.rDu = findViewById(R.h.bVl);
    this.rDv = ((TextView)findViewById(R.h.bVm));
    this.rDx = findViewById(R.h.bVy);
    this.rDy = ((CdnImageView)findViewById(R.h.cAS));
    this.rDz = ((TextView)findViewById(R.h.cAT));
    this.rDA = ((TextView)findViewById(R.h.cAR));
    this.rDw = findViewById(R.h.bVx);
    this.rDt.setVisibility(4);
    GMTrace.o(18406887653376L, 137142);
  }
  
  public void onDestroy()
  {
    GMTrace.i(18407424524288L, 137146);
    super.onDestroy();
    this.rDg = null;
    this.rDh = null;
    GMTrace.o(18407424524288L, 137146);
  }
  
  public void onResume()
  {
    GMTrace.i(18407021871104L, 137143);
    super.onResume();
    if (this.rDB)
    {
      this.rDj.setVisibility(8);
      this.iiw = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      h.b localb = this.rDh.rBH;
      com.tencent.mm.vending.g.g.chn().a(localb).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
      {
        public final void aE(Object paramAnonymousObject)
        {
          GMTrace.i(18413330104320L, 137190);
          if (WalletLqtDetailUI.a(WalletLqtDetailUI.this) != null) {
            WalletLqtDetailUI.a(WalletLqtDetailUI.this).dismiss();
          }
          w.i("MicroMsg.WalletLqtDetailUI", "fetch detail failed: %s", new Object[] { paramAnonymousObject });
          if (paramAnonymousObject != null) {
            if (!(paramAnonymousObject instanceof String)) {
              break label80;
            }
          }
          label80:
          for (paramAnonymousObject = paramAnonymousObject.toString();; paramAnonymousObject = WalletLqtDetailUI.this.getString(R.l.eVx))
          {
            Toast.makeText(WalletLqtDetailUI.this, (CharSequence)paramAnonymousObject, 1).show();
            GMTrace.o(18413330104320L, 137190);
            return;
          }
        }
      });
    }
    this.rDB = true;
    GMTrace.o(18407021871104L, 137143);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */