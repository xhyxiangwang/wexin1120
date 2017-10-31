package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.ac.k;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.g.a.sb.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.plugin.wallet_core.ui.i.10;
import com.tencent.mm.plugin.wallet_core.ui.i.2;
import com.tencent.mm.plugin.wallet_core.ui.i.6;
import com.tencent.mm.plugin.wallet_core.ui.i.7;
import com.tencent.mm.plugin.wallet_core.ui.i.8;
import com.tencent.mm.plugin.wallet_core.ui.i.9;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.Iterator;

public class WalletBalanceManagerUI
  extends WalletBaseUI
  implements i
{
  protected int hJp;
  protected TextView rCK;
  protected Button rCL;
  protected View rCM;
  protected View rCN;
  protected TextView rCO;
  protected Bankcard rCP;
  protected TextView rCq;
  
  public WalletBalanceManagerUI()
  {
    GMTrace.i(7705037111296L, 57407);
    GMTrace.o(7705037111296L, 57407);
  }
  
  private void buW()
  {
    GMTrace.i(7706245070848L, 57416);
    p.bvm();
    p.bvn();
    String str = this.rCP.field_bindSerial;
    if (!bg.mZ(this.rCP.rNd)) {
      a(0, getString(R.l.eSn), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(18394002751488L, 137046);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("rawUrl", WalletBalanceManagerUI.this.rCP.rNd);
          paramAnonymousMenuItem.putExtra("showShare", false);
          paramAnonymousMenuItem.putExtra("geta8key_username", com.tencent.mm.x.m.zF());
          paramAnonymousMenuItem.putExtra("KPublisherId", "pay_blance_list");
          paramAnonymousMenuItem.putExtra("geta8key_scene", 33);
          d.b(WalletBalanceManagerUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
          e.Eh(16);
          GMTrace.o(18394002751488L, 137046);
          return true;
        }
      });
    }
    GMTrace.o(7706245070848L, 57416);
  }
  
  protected final void MH()
  {
    GMTrace.i(7705842417664L, 57413);
    oC(R.l.eSp);
    this.rCK = ((TextView)findViewById(R.h.cHN));
    this.rCq = ((TextView)findViewById(R.h.cHB));
    ((Button)findViewById(R.h.cgl)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7709868949504L, 57443);
        WalletBalanceManagerUI.this.buV();
        e.Eh(14);
        GMTrace.o(7709868949504L, 57443);
      }
    });
    this.rCL = ((Button)findViewById(R.h.cHC));
    this.rCL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7725035552768L, 57556);
        p.bvm();
        paramAnonymousView = p.bvn().bxk();
        if ((paramAnonymousView == null) || (paramAnonymousView.size() == 0))
        {
          w.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is empty, do bind card to fetch");
          WalletBalanceManagerUI.a(WalletBalanceManagerUI.this);
          GMTrace.o(7725035552768L, 57556);
          return;
        }
        w.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is valid, to do fetch");
        com.tencent.mm.wallet_core.a.a(WalletBalanceManagerUI.this, com.tencent.mm.plugin.wallet.balance.b.class, null, null);
        e.Eh(15);
        GMTrace.o(7725035552768L, 57556);
      }
    });
    final Object localObject = (TextView)findViewById(R.h.cHD);
    boolean bool;
    if (!v.bMQ().equals("zh_CN"))
    {
      bool = true;
      if (bool) {
        break label245;
      }
      ((TextView)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7719935279104L, 57518);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://kf.qq.com/touch/scene_product.html?scene_id=kf4");
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("geta8key_username", com.tencent.mm.x.m.zF());
          d.b(WalletBalanceManagerUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          e.Eh(17);
          GMTrace.o(7719935279104L, 57518);
        }
      });
      ((TextView)localObject).setVisibility(0);
    }
    for (;;)
    {
      ((TextView)findViewById(R.h.cKh)).setText(s.ciU());
      this.rCM = findViewById(R.h.bTz);
      this.rCO = ((TextView)findViewById(R.h.bTA));
      this.rCN = findViewById(R.h.bTy);
      localObject = new sb();
      ((sb)localObject).fQc.fQe = "2";
      ((sb)localObject).fwM = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7724767117312L, 57554);
          if (!bg.mZ(localObject.fQd.fQf)) {
            e.a(WalletBalanceManagerUI.this.rCq, localObject.fQd.fQf, localObject.fQd.content, localObject.fQd.url);
          }
          GMTrace.o(7724767117312L, 57554);
        }
      };
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(7705842417664L, 57413);
      return;
      bool = bg.Jt();
      break;
      label245:
      ((TextView)localObject).setVisibility(8);
    }
  }
  
  public final void ar()
  {
    GMTrace.i(7706110853120L, 57415);
    p.bvm();
    this.rCP = p.bvn().rCP;
    if (this.rCP != null)
    {
      if (this.rCP.rNa >= 0.0D)
      {
        this.rCK.setText(e.s(this.rCP.rNa));
        p.bvm();
        localObject = p.bvn().bxc();
        if ((((ac)localObject).rRn & 0x4) <= 0) {
          break label348;
        }
        bool = true;
        label81:
        w.i("MicroMsg.WalletSwitchConfig", "isBalanceFetchOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ac)localObject).rRn) });
        if ((!bool) || (this.rCP.rNa <= 0.0D)) {
          break label353;
        }
        i = 1;
        label129:
        if (i == 0) {
          break label358;
        }
        this.rCL.setVisibility(0);
        label141:
        buW();
      }
    }
    else
    {
      localObject = findViewById(R.h.bVB);
      ap.AS();
      if (((Integer)c.xi().get(w.a.vcP, Integer.valueOf(-1))).intValue() != 1) {
        break label370;
      }
      ((View)localObject).setVisibility(0);
      label185:
      localObject = new ac();
      if ((((ac)localObject).rRn & 0x8000) <= 0) {
        break label379;
      }
    }
    label348:
    label353:
    label358:
    label370:
    label379:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ac)localObject).rRn) });
      if (!bool) {
        break label384;
      }
      ap.AS();
      localObject = (String)c.xi().get(w.a.uYA, getString(R.l.ewS));
      this.rCM.setVisibility(0);
      this.rCO.setTextColor(getResources().getColor(R.e.aQD));
      this.rCO.setText((CharSequence)localObject);
      this.rCN.setVisibility(8);
      this.rCM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7717385142272L, 57499);
          ap.AS();
          c.xi().a(w.a.vcP, Integer.valueOf(-1));
          paramAnonymousView = new Bundle();
          paramAnonymousView.putInt("real_name_verify_mode", 0);
          paramAnonymousView.putString("realname_verify_process_jump_plugin", "wallet");
          paramAnonymousView.putString("realname_verify_process_jump_activity", "com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI");
          paramAnonymousView.putInt("entry_scene", 1009);
          com.tencent.mm.wallet_core.a.a(WalletBalanceManagerUI.this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramAnonymousView);
          GMTrace.o(7717385142272L, 57499);
        }
      });
      GMTrace.o(7706110853120L, 57415);
      return;
      this.rCK.setText(getString(R.l.eUO));
      break;
      bool = false;
      break label81;
      i = 0;
      break label129;
      this.rCL.setVisibility(8);
      break label141;
      ((View)localObject).setVisibility(8);
      break label185;
    }
    label384:
    p.bvm();
    final Object localObject = p.bvn();
    ap.AS();
    int i = ((Integer)c.xi().get(w.a.vdn, Integer.valueOf(-1))).intValue();
    if (i != -1) {
      if (i == 1) {
        i = 1;
      }
    }
    while (i != 0)
    {
      this.rCM.setVisibility(0);
      this.rCM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7709063643136L, 57437);
          ap.AS();
          c.xi().a(w.a.vcP, Integer.valueOf(-1));
          paramAnonymousView = new Intent(WalletBalanceManagerUI.this, WalletLqtDetailUI.class);
          WalletBalanceManagerUI.this.startActivity(paramAnonymousView);
          GMTrace.o(7709063643136L, 57437);
        }
      });
      localObject = this.rCO;
      p.bvm();
      ((TextView)localObject).setText(p.bvn().bxf());
      this.rCN.setVisibility(0);
      GMTrace.o(7706110853120L, 57415);
      return;
      i = 0;
      continue;
      if (((ae)localObject).rRp != null)
      {
        if (((ae)localObject).rRp.field_lqt_state == 1) {
          i = 1;
        } else {
          i = 0;
        }
      }
      else {
        i = 0;
      }
    }
    p.bvm();
    localObject = p.bvn();
    if (localObject != null)
    {
      ac localac = ((ae)localObject).bxc();
      if ((localac.rRn & 0x400) > 0) {}
      for (bool = true;; bool = false)
      {
        w.i("MicroMsg.WalletSwitchConfig", "isSupportLCT, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(localac.rRn) });
        if ((!bool) || (TextUtils.isEmpty(((ae)localObject).bxf())) || (TextUtils.isEmpty(((ae)localObject).bxg()))) {
          break;
        }
        this.rCM.setVisibility(0);
        this.rCO.setText(((ae)localObject).bxf());
        this.rCN.setVisibility(0);
        this.rCM.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18390647308288L, 137021);
            ap.AS();
            c.xi().a(w.a.vcP, Integer.valueOf(-1));
            e.m(WalletBalanceManagerUI.this, localObject.bxg(), true);
            GMTrace.o(18390647308288L, 137021);
          }
        });
        GMTrace.o(7706110853120L, 57415);
        return;
      }
    }
    this.rCM.setVisibility(8);
    GMTrace.o(7706110853120L, 57415);
  }
  
  public void buU()
  {
    GMTrace.i(7705439764480L, 57410);
    p.bvm();
    if (p.bvn().rCP == null) {}
    for (boolean bool = true;; bool = false)
    {
      b(new com.tencent.mm.plugin.wallet_core.b.m(null, 0), bool);
      GMTrace.o(7705439764480L, 57410);
      return;
    }
  }
  
  public void buV()
  {
    GMTrace.i(7705708199936L, 57412);
    y(WalletBalanceSaveUI.class);
    GMTrace.o(7705708199936L, 57412);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7706379288576L, 57417);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (!(paramk instanceof com.tencent.mm.plugin.wallet.bind.a.b)) && ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))) {
      ar();
    }
    GMTrace.o(7706379288576L, 57417);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7705171329024L, 57408);
    int i = R.i.dhS;
    GMTrace.o(7705171329024L, 57408);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7705305546752L, 57409);
    super.onCreate(paramBundle);
    ((com.tencent.mm.plugin.walletlock.a.b)h.h(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    this.hJp = getIntent().getIntExtra("key_scene_balance_manager", 0);
    paramBundle = getIntent();
    Object localObject1 = paramBundle.getStringExtra("key_inc_bal_amt_flag");
    paramBundle = (ECardInfo)paramBundle.getParcelableExtra("key_ecard_info");
    Button localButton;
    CheckBox localCheckBox;
    if ("3".equals(localObject1))
    {
      if (paramBundle == null) {
        break label732;
      }
      Object localObject2 = LayoutInflater.from(this).inflate(R.i.diA, null);
      ImageView localImageView = (ImageView)((View)localObject2).findViewById(R.h.bvp);
      int i = BackwardSupportUtil.b.a(this, 15.0F);
      bg.j(localImageView, i, i, i, i);
      Object localObject5 = (TextView)((View)localObject2).findViewById(R.h.bZo);
      Object localObject4 = (LinearLayout)((View)localObject2).findViewById(R.h.bZn);
      localButton = (Button)((View)localObject2).findViewById(R.h.cDv);
      Object localObject3 = (TextView)((View)localObject2).findViewById(R.h.bZj);
      localCheckBox = (CheckBox)((View)localObject2).findViewById(R.h.checkbox);
      localObject1 = (TextView)((View)localObject2).findViewById(R.h.bva);
      ((TextView)localObject5).setText(paramBundle.title);
      ((LinearLayout)localObject4).removeAllViews();
      localObject5 = paramBundle.rNJ.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        String str = (String)((Iterator)localObject5).next();
        View localView = LayoutInflater.from(this).inflate(R.i.diz, null);
        ((TextView)localView.findViewById(R.h.cLG)).setText(str);
        ((LinearLayout)localObject4).addView(localView);
      }
      i = paramBundle.rNM.length();
      int j = (paramBundle.rNM + paramBundle.rNN).length();
      localObject4 = new SpannableString(paramBundle.rNM + paramBundle.rNN);
      ((SpannableString)localObject4).setSpan(new ForegroundColorSpan(getResources().getColor(R.e.aQL)), i, j, 33);
      ((TextView)localObject3).setText((CharSequence)localObject4);
      ((TextView)localObject3).setOnClickListener(new i.6(paramBundle, this));
      localObject3 = new Dialog(this, R.m.fdt);
      ((Dialog)localObject3).setContentView((View)localObject2);
      ((Dialog)localObject3).setTitle(null);
      ((Dialog)localObject3).setOnCancelListener(new i.7((Dialog)localObject3));
      localImageView.setOnClickListener(new i.8((Dialog)localObject3));
      localButton.setOnClickListener(new i.9(paramBundle, this, (Dialog)localObject3));
      if (paramBundle.rND != 1) {
        break label722;
      }
      localCheckBox.setOnCheckedChangeListener(new i.10(localButton));
      if (paramBundle.rNE != 1) {
        break label701;
      }
      localCheckBox.setChecked(true);
      i = paramBundle.rNF.length();
      j = (paramBundle.rNF + paramBundle.rNG).length();
      localObject2 = new SpannableString(paramBundle.rNF + paramBundle.rNG);
      ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(getResources().getColor(R.e.aQL)), i, j, 33);
      ((TextView)localObject1).setText((CharSequence)localObject2);
      ((TextView)localObject1).setOnClickListener(new i.2(paramBundle, this));
      ((Dialog)localObject3).show();
    }
    for (;;)
    {
      hz(621);
      com.tencent.mm.plugin.wallet_core.model.m.bwL();
      y.a(this);
      MH();
      o.eK(2, 0);
      g.paX.i(11850, new Object[] { Integer.valueOf(6), Integer.valueOf(0) });
      e.Eh(10);
      GMTrace.o(7705305546752L, 57409);
      return;
      label701:
      localCheckBox.setChecked(false);
      localButton.setEnabled(false);
      localButton.setClickable(false);
      break;
      label722:
      localCheckBox.setVisibility(8);
      break;
      label732:
      w.w("MicroMsg.WalletBalanceManagerUI", "ecard info is null");
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7705573982208L, 57411);
    hA(621);
    com.tencent.mm.plugin.wallet_core.model.m.bwL();
    y.b(this);
    super.onDestroy();
    GMTrace.o(7705573982208L, 57411);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7706647724032L, 57419);
    w.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from bind ui flag:" + paramIntent.getIntExtra("from_bind_ui", 0));
    if (paramIntent.getIntExtra("from_bind_ui", 0) == com.tencent.mm.plugin.wallet.balance.a.rBv)
    {
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, null, null);
      e.Eh(15);
    }
    GMTrace.o(7706647724032L, 57419);
  }
  
  public void onResume()
  {
    GMTrace.i(7705976635392L, 57414);
    ar();
    buU();
    super.onResume();
    com.tencent.mm.plugin.walletlock.a.b localb = (com.tencent.mm.plugin.walletlock.a.b)h.h(com.tencent.mm.plugin.walletlock.a.b.class);
    localb.a(this, localb.byv(), null);
    GMTrace.o(7705976635392L, 57414);
  }
  
  public final void qb(int paramInt)
  {
    GMTrace.i(7706513506304L, 57418);
    p.bvm();
    this.rCP = p.bvn().rCP;
    if (this.rCP != null)
    {
      if (this.rCP.rNa < 0.0D) {
        break label73;
      }
      this.rCK.setText(e.s(this.rCP.rNa));
    }
    for (;;)
    {
      buW();
      GMTrace.o(7706513506304L, 57418);
      return;
      label73:
      this.rCK.setText(getString(R.l.eUO));
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */