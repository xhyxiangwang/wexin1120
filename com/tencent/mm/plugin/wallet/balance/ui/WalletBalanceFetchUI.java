package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.g.a.sb.b;
import com.tencent.mm.plugin.wallet_core.b.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.ui.g;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletBalanceFetchUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private String fAF;
  private final int ije;
  private View krg;
  private Button lsT;
  private double oWT;
  private int rCA;
  private DecimalFormat rCB;
  private boolean rCC;
  private boolean rCD;
  private boolean rCE;
  private boolean rCF;
  private boolean rCG;
  private ArrayList<Bankcard> rCk;
  private Bankcard rCl;
  private String rCm;
  private WalletFormView rCn;
  private WalletFormView rCo;
  private View rCp;
  private TextView rCq;
  private TextView rCr;
  private TextView rCs;
  private TextView rCt;
  private TextView rCu;
  private int rCv;
  private int rCw;
  private int rCx;
  private double rCy;
  private int rCz;
  
  public WalletBalanceFetchUI()
  {
    GMTrace.i(7710271602688L, 57446);
    this.ije = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 270);
    this.fAF = null;
    this.rCv = 0;
    this.rCw = 0;
    this.rCx = 0;
    this.rCy = 0.0D;
    this.rCz = -1;
    this.rCA = 0;
    this.rCB = new DecimalFormat("0.00");
    this.rCC = false;
    this.rCD = false;
    this.rCE = false;
    this.rCF = false;
    this.rCG = false;
    GMTrace.o(7710271602688L, 57446);
  }
  
  private void X(Intent paramIntent)
  {
    boolean bool2 = false;
    GMTrace.i(7712687521792L, 57464);
    boolean bool1 = bool2;
    if (paramIntent != null)
    {
      bool1 = bool2;
      if (paramIntent.getBooleanExtra("intent_bind_end", false)) {
        bool1 = true;
      }
    }
    this.rCC = bool1;
    if (this.rCC)
    {
      w.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
      PayInfo localPayInfo = (PayInfo)this.un.get("key_pay_info");
      paramIntent = localPayInfo;
      if (localPayInfo == null)
      {
        paramIntent = new PayInfo();
        paramIntent.fAF = this.fAF;
        paramIntent.fIG = 21;
      }
      r(new m(paramIntent.fAF, 4));
      GMTrace.o(7712687521792L, 57464);
      return;
    }
    r(new m(null, 4));
    w.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card fail or from create call");
    GMTrace.o(7712687521792L, 57464);
  }
  
  private void a(com.tencent.mm.plugin.wallet.balance.a.b paramb)
  {
    GMTrace.i(7711613779968L, 57456);
    if (!bg.mZ(this.fAF))
    {
      Object localObject = new PayInfo();
      ((PayInfo)localObject).fAF = this.fAF;
      ((PayInfo)localObject).fIG = 21;
      this.un.putParcelable("key_pay_info", (Parcelable)localObject);
      localObject = new Orders();
      ((Orders)localObject).rOR = (paramb.oWk - paramb.oVZ);
      ((Orders)localObject).rOS = (paramb.oWk - paramb.oVZ);
      ((Orders)localObject).rPj.add(new Orders.Commodity());
      ((Orders)localObject).oVZ = paramb.oVZ;
      this.un.putParcelable("key_orders", (Parcelable)localObject);
      this.un.putParcelable("key_bankcard", this.rCl);
      if (cjm() == null)
      {
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, this.un, null);
        GMTrace.o(7711613779968L, 57456);
        return;
      }
      cjn().j(new Object[] { this.un });
      GMTrace.o(7711613779968L, 57456);
      return;
    }
    w.w("MicroMsg.WalletBalanceFetchUI", "hy: req key is null. abandon");
    GMTrace.o(7711613779968L, 57456);
  }
  
  private void ar()
  {
    GMTrace.i(7711211126784L, 57453);
    label138:
    label149:
    String str;
    if (this.rCn.jpp != null)
    {
      this.rCn.jpp.setText(String.format(getString(R.l.ezR), new Object[] { s.ciV() }));
      if (this.rCl == null) {
        break label362;
      }
      this.rCo.setText(this.rCl.field_desc);
      this.rCo.setVisibility(0);
      if (this.rCo.oSW == null) {
        break label329;
      }
      if ((this.rCv != 1) || (this.rCl.field_fetch_charge_rate <= 0.0D)) {
        break label301;
      }
      if (TextUtils.isEmpty(this.rCl.field_fetch_charge_info)) {
        break label246;
      }
      this.rCo.oSW.setText(this.rCl.field_fetch_charge_info);
      this.rCo.oSW.setVisibility(0);
      if (bg.mZ(this.rCl.field_fetchArriveTimeWording)) {
        break label340;
      }
      this.rCs.setText(this.rCl.field_fetchArriveTimeWording);
      this.rCs.setVisibility(0);
      com.tencent.mm.plugin.wallet.a.p.bvm();
      str = com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNe;
      if (bg.mZ(str)) {
        break label411;
      }
      this.rCr.setVisibility(0);
      this.rCr.setText(str);
    }
    for (;;)
    {
      buR();
      GMTrace.o(7711211126784L, 57453);
      return;
      w.i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
      break;
      label246:
      str = getString(R.l.eSa) + this.rCl.field_fetch_charge_rate * 100.0D + "%";
      this.rCo.oSW.setText(str);
      break label138;
      label301:
      this.rCo.oSW.setText("");
      this.rCo.oSW.setVisibility(8);
      break label149;
      label329:
      w.i("MicroMsg.WalletBalanceFetchUI", "mBankcardEHV.getTipsTv() is null");
      break label149;
      label340:
      this.rCs.setText("");
      for (;;)
      {
        this.rCs.setVisibility(8);
        break;
        label362:
        this.rCo.setText(this.rCm);
        if (this.rCo.oSW != null)
        {
          this.rCo.oSW.setText("");
          this.rCo.oSW.setVisibility(8);
        }
      }
      label411:
      this.rCr.setVisibility(8);
    }
  }
  
  private boolean b(final com.tencent.mm.plugin.wallet.balance.a.b paramb)
  {
    boolean bool3 = true;
    GMTrace.i(7712284868608L, 57461);
    boolean bool1;
    if (!this.rCD) {
      if (paramb.rBy)
      {
        this.rCD = true;
        h.a(this, false, paramb.rBz, "", getString(R.l.dwr), getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7723961810944L, 57548);
            paramAnonymousDialogInterface.dismiss();
            if (!WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb))
            {
              WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb.fCP);
              WalletBalanceFetchUI.b(WalletBalanceFetchUI.this, paramb);
            }
            GMTrace.o(7723961810944L, 57548);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7704902893568L, 57406);
            paramAnonymousDialogInterface.dismiss();
            WalletBalanceFetchUI.i(WalletBalanceFetchUI.this);
            GMTrace.o(7704902893568L, 57406);
          }
        });
        bool1 = true;
      }
    }
    for (;;)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.rCE)
        {
          com.tencent.mm.plugin.wallet_core.model.b localb = paramb.rBA;
          if ((localb == null) || ((TextUtils.isEmpty(localb.rML)) && ((localb.rMM == null) || (localb.rMM.size() <= 0)))) {
            break label259;
          }
          this.rCE = true;
          g.a(this, localb, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7719398408192L, 57514);
              paramAnonymousDialogInterface.dismiss();
              if (!WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb))
              {
                WalletBalanceFetchUI.a(WalletBalanceFetchUI.this, paramb.fCP);
                WalletBalanceFetchUI.b(WalletBalanceFetchUI.this, paramb);
              }
              GMTrace.o(7719398408192L, 57514);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7722216980480L, 57535);
              paramAnonymousDialogInterface.dismiss();
              WalletBalanceFetchUI.i(WalletBalanceFetchUI.this);
              GMTrace.o(7722216980480L, 57535);
            }
          });
          bool2 = true;
        }
      }
      label165:
      if ((!bool2) && (!this.rCF))
      {
        paramb = paramb.rBB;
        if ((paramb != null) && ((!TextUtils.isEmpty(paramb.rML)) || ((paramb.rMM != null) && (paramb.rMM.size() > 0))))
        {
          this.rCF = true;
          g.a(this, paramb, true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7710137384960L, 57445);
              paramAnonymousDialogInterface.dismiss();
              paramAnonymousDialogInterface = "";
              if (WalletBalanceFetchUI.j(WalletBalanceFetchUI.this) != null) {
                paramAnonymousDialogInterface = WalletBalanceFetchUI.j(WalletBalanceFetchUI.this).field_bankcardType;
              }
              WalletBalanceFetchUI.k(WalletBalanceFetchUI.this);
              WalletBalanceFetchUI.l(WalletBalanceFetchUI.this);
              WalletBalanceFetchUI.this.l(new com.tencent.mm.plugin.wallet.balance.a.b(WalletBalanceFetchUI.m(WalletBalanceFetchUI.this), "CNY", paramAnonymousDialogInterface, WalletBalanceFetchUI.n(WalletBalanceFetchUI.this)));
              GMTrace.o(7710137384960L, 57445);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7721680109568L, 57531);
              paramAnonymousDialogInterface.dismiss();
              WalletBalanceFetchUI.i(WalletBalanceFetchUI.this);
              GMTrace.o(7721680109568L, 57531);
            }
          });
          bool1 = bool3;
        }
      }
      for (;;)
      {
        GMTrace.o(7712284868608L, 57461);
        return bool1;
        bool1 = false;
        break;
        label259:
        bool2 = false;
        break label165;
        bool1 = false;
        continue;
        bool1 = bool2;
      }
      bool1 = false;
    }
  }
  
  private void buQ()
  {
    GMTrace.i(7710808473600L, 57450);
    com.tencent.mm.plugin.wallet.a.p.bvm();
    ae localae = com.tencent.mm.plugin.wallet.a.p.bvn();
    Object localObject2;
    int i;
    if (this.rCC)
    {
      w.i("MicroMsg.WalletBalanceFetchUI", "is from new bind bankcard");
      localObject1 = new ArrayList();
      localObject2 = new ArrayList();
      if ((this.rCk != null) && (this.rCk.size() > 0)) {
        ((ArrayList)localObject1).addAll(this.rCk);
      }
      this.rCk = localae.bxk();
      if ((this.rCk != null) && (this.rCk.size() > 0)) {
        ((ArrayList)localObject2).addAll(this.rCk);
      }
      if ((((ArrayList)localObject1).size() <= 0) || (((ArrayList)localObject2).size() <= 0)) {
        break label528;
      }
      ArrayList localArrayList = new ArrayList();
      i = 0;
      while (i < ((ArrayList)localObject1).size())
      {
        Bankcard localBankcard1 = (Bankcard)((ArrayList)localObject1).get(i);
        int j = 0;
        while (j < ((ArrayList)localObject2).size())
        {
          Bankcard localBankcard2 = (Bankcard)((ArrayList)localObject2).get(j);
          if ((localBankcard1 != null) && (localBankcard2 != null) && (localBankcard1.field_bindSerial.equals(localBankcard2.field_bindSerial))) {
            localArrayList.add(localBankcard2);
          }
          j += 1;
        }
        i += 1;
      }
      if (localArrayList.size() > 0) {
        ((ArrayList)localObject2).removeAll(localArrayList);
      }
      if (((ArrayList)localObject2).size() <= 0) {
        break label528;
      }
    }
    label349:
    label514:
    label528:
    for (Object localObject1 = (Bankcard)((ArrayList)localObject2).get(0);; localObject1 = null)
    {
      if (localObject1 == null) {
        localObject1 = localae.a(this.rCk, null, false, true);
      }
      for (;;)
      {
        i = 0;
        if ((this.rCk != null) && (i < this.rCk.size()))
        {
          localObject2 = (Bankcard)this.rCk.get(i);
          if ((localObject1 != null) && (localObject2 != null) && (((Bankcard)localObject1).field_bindSerial.equals(((Bankcard)localObject2).field_bindSerial))) {
            this.rCz = i;
          }
        }
        else
        {
          this.rCl = ((Bankcard)localObject1);
          this.rCC = false;
          if (localae.rRt == null) {
            break label514;
          }
          this.rCv = localae.rRt.rCv;
          this.rCw = localae.rRt.rCw;
          this.rCy = localae.rRt.rCy;
          this.rCx = localae.rRt.rCx;
        }
        for (;;)
        {
          w.i("MicroMsg.WalletBalanceFetchUI", "is_show_charge:" + this.rCv + " is_cal_charge:" + this.rCw + " min_charge_fee:" + this.rCy + " is_full_fetch_direct:" + this.rCx);
          GMTrace.o(7710808473600L, 57450);
          return;
          i += 1;
          break;
          this.rCk = localae.bxk();
          this.rCl = localae.a(this.rCk, null, false, true);
          break label349;
          w.e("MicroMsg.WalletBalanceFetchUI", "BalanceFetchInfo is null");
        }
      }
    }
  }
  
  private void buR()
  {
    GMTrace.i(7711479562240L, 57455);
    this.oWT = bg.getDouble(this.rCn.getText(), 0.0D);
    double d;
    StringBuilder localStringBuilder;
    if (this.oWT > 0.0D)
    {
      this.lsT.setEnabled(true);
      d = this.oWT;
      com.tencent.mm.plugin.wallet.a.p.bvm();
      if ((d != com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNc) && (this.rCl != null))
      {
        d = this.oWT;
        com.tencent.mm.plugin.wallet.a.p.bvm();
        if (d != com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNc - this.rCl.field_full_fetch_charge_fee) {
          this.rCA = 0;
        }
      }
      localStringBuilder = new StringBuilder();
      d = this.oWT;
      com.tencent.mm.plugin.wallet.a.p.bvm();
      if (d <= com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNa) {
        break label211;
      }
      this.rCu.setVisibility(8);
      this.rCt.setTextColor(getResources().getColor(R.e.aPW));
      localStringBuilder.append(getString(R.l.eSj));
    }
    for (;;)
    {
      this.rCt.setText(localStringBuilder.toString());
      GMTrace.o(7711479562240L, 57455);
      return;
      this.lsT.setEnabled(false);
      break;
      label211:
      Object localObject;
      if ((this.rCl != null) && (this.rCv != 0) && ((this.rCv != 1) || (this.rCl.field_fetch_charge_rate > 0.0D)) && ((this.rCv != 1) || (this.rCl.field_fetch_charge_rate <= 0.0D) || (this.rCw != 0)))
      {
        d = this.rCy;
        com.tencent.mm.plugin.wallet.a.p.bvm();
        if (d < com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNc) {}
      }
      else
      {
        this.rCu.setVisibility(0);
        this.rCt.setTextColor(getResources().getColor(R.e.aOI));
        com.tencent.mm.plugin.wallet.a.p.bvm();
        localObject = com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNf;
        if (!bg.mZ((String)localObject)) {
          localStringBuilder.append((String)localObject);
        }
        for (;;)
        {
          localStringBuilder.append("，");
          break;
          w.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          com.tencent.mm.plugin.wallet.a.p.bvm();
          d = com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNc;
          localStringBuilder.append(getString(R.l.eSd, new Object[] { e.d(d, "CNY") }));
        }
      }
      if ((this.rCv == 1) && (this.rCl.field_fetch_charge_rate > 0.0D) && (this.rCw == 1) && ((this.oWT <= 0.0D) || (!this.rCn.QR())))
      {
        this.rCu.setVisibility(0);
        this.rCt.setTextColor(getResources().getColor(R.e.aOI));
        com.tencent.mm.plugin.wallet.a.p.bvm();
        localObject = com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNf;
        if (!bg.mZ((String)localObject)) {
          localStringBuilder.append((String)localObject);
        }
        for (;;)
        {
          localStringBuilder.append("，");
          break;
          w.i("MicroMsg.WalletBalanceFetchUI", "hy: wording's missing. use former routine");
          com.tencent.mm.plugin.wallet.a.p.bvm();
          d = com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNc;
          localStringBuilder.append(getString(R.l.eSd, new Object[] { e.d(d, "CNY") }));
        }
      }
      if ((this.rCv == 1) && (this.rCl.field_fetch_charge_rate > 0.0D) && (this.rCw == 1))
      {
        this.rCu.setVisibility(8);
        this.rCt.setTextColor(getResources().getColor(R.e.aOI));
        d = this.oWT;
        com.tencent.mm.plugin.wallet.a.p.bvm();
        if ((d == com.tencent.mm.plugin.wallet.a.p.bvn().rCP.rNc - this.rCl.field_full_fetch_charge_fee) && (this.rCl.field_full_fetch_charge_fee > 0.0D))
        {
          localStringBuilder.append(getString(R.l.eRW, new Object[] { e.d(this.rCl.field_full_fetch_charge_fee, "CNY") }));
        }
        else
        {
          int i = R.l.eRW;
          d = this.oWT;
          com.tencent.mm.plugin.wallet.a.p.bvm();
          localObject = com.tencent.mm.plugin.wallet.a.p.bvn();
          localStringBuilder.append(getString(i, new Object[] { e.d(Math.max(Math.round((d - ((ae)localObject).rRt.oWd) * this.rCl.field_fetch_charge_rate * 100.0D) / 100.0D, ((ae)localObject).rRt.rCy), "CNY") }));
        }
      }
    }
  }
  
  private void buS()
  {
    GMTrace.i(7712419086336L, 57462);
    this.rCD = false;
    this.rCE = false;
    this.rCF = false;
    this.rCG = false;
    GMTrace.o(7712419086336L, 57462);
  }
  
  protected final void MH()
  {
    GMTrace.i(7710942691328L, 57451);
    oC(R.l.eSi);
    a(0, R.g.bfr, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7727585689600L, 57575);
        e.m(WalletBalanceFetchUI.this.vov.voR, "http://kf.qq.com/touch/product/wechatwallet_app.html?platform=15&scene_id=kf4", false);
        GMTrace.o(7727585689600L, 57575);
        return true;
      }
    });
    this.krg = findViewById(R.h.bHU);
    this.rCo = ((WalletFormView)findViewById(R.h.bkm));
    this.rCo.xie = new com.tencent.mm.wallet_core.ui.formview.a.a()
    {
      public final boolean a(WalletFormView paramAnonymousWalletFormView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(7718190448640L, 57505);
        GMTrace.o(7718190448640L, 57505);
        return false;
      }
      
      public final void buT()
      {
        GMTrace.i(7718324666368L, 57506);
        WalletBalanceFetchUI.a(WalletBalanceFetchUI.this);
        GMTrace.o(7718324666368L, 57506);
      }
    };
    com.tencent.mm.wallet_core.ui.formview.a.g(this.rCo);
    final Object localObject = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7726780383232L, 57569);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_scene_select_bankcard_mode_ui", 0);
        paramAnonymousView.putExtra("key_select_index", WalletBalanceFetchUI.b(WalletBalanceFetchUI.this));
        paramAnonymousView.setClass(WalletBalanceFetchUI.this, WalletSelectBankcardModeUI.class);
        WalletBalanceFetchUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(7726780383232L, 57569);
      }
    };
    this.rCp = findViewById(R.h.bkn);
    this.rCp.setOnClickListener((View.OnClickListener)localObject);
    this.rCo.setOnClickListener((View.OnClickListener)localObject);
    this.rCn = ((WalletFormView)findViewById(R.h.bkp));
    e(this.rCn, 2, false);
    com.tencent.mm.wallet_core.ui.formview.a.e(this.rCn);
    this.rCn.xid = this;
    this.lsT = ((Button)findViewById(R.h.cgl));
    this.lsT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7727854125056L, 57577);
        WalletBalanceFetchUI.c(WalletBalanceFetchUI.this);
        GMTrace.o(7727854125056L, 57577);
      }
    });
    this.lsT.setEnabled(false);
    this.rCq = ((TextView)findViewById(R.h.cHB));
    this.rCr = ((TextView)findViewById(R.h.bkr));
    this.rCs = ((TextView)findViewById(R.h.bkq));
    this.rCt = ((TextView)findViewById(R.h.bHT));
    this.rCu = ((TextView)findViewById(R.h.bHS));
    this.rCu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7718861537280L, 57510);
        WalletBalanceFetchUI.d(WalletBalanceFetchUI.this);
        GMTrace.o(7718861537280L, 57510);
      }
    });
    this.rCn.a(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(7717116706816L, 57497);
        if (paramAnonymousEditable.toString().startsWith(".")) {
          paramAnonymousEditable.insert(0, "0");
        }
        String str = paramAnonymousEditable.toString();
        int i = str.indexOf(".");
        str.length();
        int j = str.lastIndexOf(".");
        int k = str.length();
        if ((i >= 0) && (k - i > 3)) {
          paramAnonymousEditable.delete(i + 3, k);
        }
        for (;;)
        {
          WalletBalanceFetchUI.e(WalletBalanceFetchUI.this);
          GMTrace.o(7717116706816L, 57497);
          return;
          if (j != i) {
            paramAnonymousEditable.delete(j, k);
          }
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(7716982489088L, 57496);
        GMTrace.o(7716982489088L, 57496);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(7716848271360L, 57495);
        GMTrace.o(7716848271360L, 57495);
      }
    });
    this.nzs = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void gS(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18390110437376L, 137017);
        if (paramAnonymousBoolean)
        {
          WalletBalanceFetchUI.f(WalletBalanceFetchUI.this);
          GMTrace.o(18390110437376L, 137017);
          return;
        }
        WalletBalanceFetchUI.g(WalletBalanceFetchUI.this).scrollTo(0, 0);
        GMTrace.o(18390110437376L, 137017);
      }
    };
    localObject = new sb();
    ((sb)localObject).fQc.fQe = "3";
    ((sb)localObject).fwM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18390915743744L, 137023);
        if (!bg.mZ(localObject.fQd.fQf))
        {
          e.a(WalletBalanceFetchUI.h(WalletBalanceFetchUI.this), localObject.fQd.fQf, localObject.fQd.content, localObject.fQd.url);
          GMTrace.o(18390915743744L, 137023);
          return;
        }
        w.i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
        GMTrace.o(18390915743744L, 137023);
      }
    };
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(7710942691328L, 57451);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7712016433152L, 57459);
    GMTrace.o(7712016433152L, 57459);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7711747997696L, 57457);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet.balance.a.b))
      {
        paramString = (com.tencent.mm.plugin.wallet.balance.a.b)paramk;
        this.rCD = false;
        if (!this.rCG) {
          this.rCE = false;
        }
        this.rCF = false;
        this.rCG = false;
        if ("1".equals(paramString.fQq))
        {
          w.i("MicroMsg.WalletBalanceFetchUI", "need realname verify");
          paramk = new Bundle();
          paramk.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceFetchUI");
          paramk.putString("realname_verify_process_jump_plugin", "wallet");
          String str = paramString.fQr;
          str = paramString.fQs;
          str = paramString.fQt;
          aMd();
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramk, 0);
        }
        while (bool)
        {
          GMTrace.o(7711747997696L, 57457);
          return false;
          if ("2".equals(paramString.fQq))
          {
            w.i("MicroMsg.WalletBalanceFetchUI", "need upload credit");
            bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString.fQr, paramString.fQu, paramString.fQs, paramString.fQt, aMd(), null);
          }
          else
          {
            w.i("MicroMsg.WalletBalanceFetchUI", "realnameGuideFlag =  " + paramString.fQq);
            bool = false;
          }
        }
        if (!b(paramString))
        {
          this.fAF = paramString.fCP;
          a(paramString);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(7711747997696L, 57457);
      return false;
      if ((paramk instanceof m))
      {
        buQ();
        ar();
        if (this.rCv != 0)
        {
          w.i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.rCv);
        }
        else
        {
          ap.AS();
          bool = ((Boolean)c.xi().get(w.a.uYn, Boolean.valueOf(false))).booleanValue();
          com.tencent.mm.plugin.wallet.a.p.bvm();
          paramString = com.tencent.mm.plugin.wallet.a.p.bvn().rRt;
          if ((paramString != null) && (!bool))
          {
            double d = paramString.oWd;
            h.a(this, getString(R.l.eXu, new Object[] { e.s(d) }), getString(R.l.eXv), getString(R.l.dvT), getString(R.l.eXw), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(18393600098304L, 137043);
                paramAnonymousDialogInterface.dismiss();
                GMTrace.o(18393600098304L, 137043);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(18393868533760L, 137045);
                Intent localIntent = new Intent();
                localIntent.putExtra("rawUrl", WalletBalanceFetchUI.this.getString(R.l.eUE));
                localIntent.putExtra("showShare", false);
                com.tencent.mm.bi.d.b(WalletBalanceFetchUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
                paramAnonymousDialogInterface.dismiss();
                GMTrace.o(18393868533760L, 137045);
              }
            }, R.e.aQR);
            ap.AS();
            c.xi().a(w.a.uYn, Boolean.valueOf(true));
            continue;
            if ((paramk instanceof com.tencent.mm.plugin.wallet.balance.a.b)) {
              buS();
            }
          }
        }
      }
    }
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(7711882215424L, 57458);
    this.rCn.dI(null);
    GMTrace.o(7711882215424L, 57458);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7710405820416L, 57447);
    int i = R.i.dhR;
    GMTrace.o(7710405820416L, 57447);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7712150650880L, 57460);
    if (paramInt1 == 1)
    {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramInt1 = paramIntent.getIntExtra("key_select_index", -1);
        paramInt2 = this.rCz;
        this.rCz = paramInt1;
        w.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is " + paramInt1);
        if ((this.rCk == null) || (paramInt1 < 0) || (paramInt1 >= this.rCk.size())) {
          if ((this.rCk == null) || (paramInt1 < 0) || (paramInt1 > this.rCk.size()))
          {
            this.rCl = null;
            Bundle localBundle = new Bundle();
            PayInfo localPayInfo = (PayInfo)this.un.get("key_pay_info");
            paramIntent = localPayInfo;
            if (localPayInfo == null)
            {
              paramIntent = new PayInfo();
              paramIntent.fAF = this.fAF;
              paramIntent.fIG = 21;
            }
            if (paramIntent != null) {
              localBundle.putParcelable("key_pay_info", paramIntent);
            }
            localBundle.putInt("key_scene", 21);
            localBundle.putInt("key_bind_scene", 0);
            localBundle.putBoolean("key_need_bind_response", true);
            localBundle.putInt("key_bind_scene", 0);
            localBundle.putBoolean("key_is_bind_bankcard", true);
            localBundle.putInt("from_bind_ui", com.tencent.mm.plugin.wallet.balance.a.rBw);
            com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.a.class, localBundle, null);
          }
        }
        for (;;)
        {
          ar();
          GMTrace.o(7712150650880L, 57460);
          return;
          this.rCz = paramInt2;
          break;
          this.rCl = ((Bankcard)this.rCk.get(paramInt1));
        }
      }
      w.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
      GMTrace.o(7712150650880L, 57460);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7712150650880L, 57460);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7710540038144L, 57448);
    super.onCreate(paramBundle);
    X(getIntent());
    buQ();
    this.rCm = getString(R.l.eSx);
    MH();
    ar();
    o.eK(4, 0);
    GMTrace.o(7710540038144L, 57448);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7710674255872L, 57449);
    this.rCo.xie = null;
    super.onDestroy();
    GMTrace.o(7710674255872L, 57449);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7712553304064L, 57463);
    buS();
    X(paramIntent);
    GMTrace.o(7712553304064L, 57463);
  }
  
  public void onResume()
  {
    GMTrace.i(7711076909056L, 57452);
    buS();
    super.onResume();
    GMTrace.o(7711076909056L, 57452);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */