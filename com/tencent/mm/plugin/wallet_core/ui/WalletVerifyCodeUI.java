package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.ac.a.a;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.f.a;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.f.a.l;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

@com.tencent.mm.ui.base.a(19)
public class WalletVerifyCodeUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private com.tencent.mm.plugin.ac.a iTN;
  private Orders oZx;
  private Button rFt;
  private Authen rFy;
  private PayInfo rHl;
  public int rXB;
  public WalletFormView rXC;
  private Button rXD;
  private String rXE;
  private String rXF;
  private boolean rXG;
  private a rXH;
  private TextView rXI;
  private boolean rXJ;
  private com.tencent.mm.plugin.wallet_core.model.g rXK;
  private f.a rXL;
  
  public WalletVerifyCodeUI()
  {
    GMTrace.i(6970866139136L, 51937);
    this.rXB = 60000;
    this.rXC = null;
    this.iTN = null;
    this.rXG = false;
    this.rXH = null;
    this.rXJ = false;
    this.rXK = new com.tencent.mm.plugin.wallet_core.model.g();
    this.rXL = new f.a()
    {
      public final void byd()
      {
        GMTrace.i(6981066686464L, 52013);
        WalletVerifyCodeUI.this.byc();
        GMTrace.o(6981066686464L, 52013);
      }
    };
    GMTrace.o(6970866139136L, 51937);
  }
  
  private String bxZ()
  {
    GMTrace.i(6971134574592L, 51939);
    String str = bg.ap(this.un.getString("key_mobile"), "");
    if (bg.mZ(str))
    {
      Bankcard localBankcard = (Bankcard)this.un.getParcelable("key_bankcard");
      if (localBankcard != null) {
        str = localBankcard.field_mobile;
      }
    }
    for (;;)
    {
      GMTrace.o(6971134574592L, 51939);
      return str;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(6971537227776L, 51942);
    com.tencent.mm.wallet_core.b localb = com.tencent.mm.wallet_core.a.aa(this);
    this.rXI = ((TextView)findViewById(R.h.bmo));
    final Object localObject1 = bxZ();
    Object localObject2;
    if (bg.mZ((String)localObject1))
    {
      localObject2 = (Bankcard)this.un.getParcelable("key_bankcard");
      if (localObject2 != null)
      {
        localObject1 = ((Bankcard)localObject2).field_mobile;
        this.un.putString("key_mobile", (String)localObject1);
      }
    }
    for (;;)
    {
      localObject2 = rQ(0);
      boolean bool2;
      label318:
      Object localObject3;
      if (!bg.L((CharSequence)localObject2))
      {
        this.rXI.setText((CharSequence)localObject2);
        this.rXI.setGravity(3);
        this.rXC = ((WalletFormView)findViewById(R.h.bmd));
        this.rXC.xid = this;
        this.rXD = ((Button)findViewById(R.h.bNM));
        this.rXD.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7017976561664L, 52288);
            WalletVerifyCodeUI.this.byb();
            GMTrace.o(7017976561664L, 52288);
          }
        });
        this.rXD.setClickable(false);
        this.rXD.setEnabled(false);
        if (this.rXH != null)
        {
          this.rXH.cancel();
          this.rXH = null;
        }
        localObject1 = new a(this.rXB);
        this.rXH = ((a)localObject1);
        ((a)localObject1).start();
        this.rFt = ((Button)findViewById(R.h.bma));
        this.rFt.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6953686269952L, 51809);
            if (WalletVerifyCodeUI.a(WalletVerifyCodeUI.this, WalletVerifyCodeUI.a(WalletVerifyCodeUI.this)))
            {
              GMTrace.o(6953686269952L, 51809);
              return;
            }
            WalletVerifyCodeUI.this.byc();
            GMTrace.o(6953686269952L, 51809);
          }
        });
        localObject2 = (TextView)findViewById(R.h.bmn);
        localObject1 = (Bankcard)this.un.getParcelable("key_bankcard");
        boolean bool1 = this.un.getBoolean("key_is_changing_balance_phone_num");
        bool2 = this.un.getBoolean("key_need_show_switch_phone", false);
        if ((!bool1) || (bool2)) {
          break label480;
        }
        ((TextView)localObject2).setVisibility(8);
        localObject3 = (PayInfo)this.un.getParcelable("key_pay_info");
        if (localObject3 == null) {
          break label624;
        }
      }
      label480:
      label574:
      label624:
      for (int i = ((PayInfo)localObject3).fIG;; i = 0)
      {
        if (bool2)
        {
          ((TextView)localObject2).setText(R.l.eZJ);
          ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              boolean bool2 = true;
              GMTrace.i(6997843902464L, 52138);
              w.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
              w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess and finish!");
              paramAnonymousView = WalletVerifyCodeUI.this.un;
              paramAnonymousView.putInt("key_err_code", 417);
              paramAnonymousView.putBoolean("key_need_show_switch_phone", true);
              boolean bool1 = bool2;
              if (localObject1 != null) {
                if (!localObject1.bwm()) {
                  break label100;
                }
              }
              label100:
              for (bool1 = bool2;; bool1 = false)
              {
                paramAnonymousView.putBoolean("key_isbalance", bool1);
                com.tencent.mm.wallet_core.a.i(WalletVerifyCodeUI.this, paramAnonymousView);
                WalletVerifyCodeUI.this.finish();
                GMTrace.o(6997843902464L, 52138);
                return;
              }
            }
          });
        }
        for (;;)
        {
          this.rXC.requestFocus();
          a(0, R.g.bfr, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(6978382331904L, 51993);
              paramAnonymousMenuItem = WalletVerifyCodeUI.this.un.getString("key_QADNA_URL");
              if (bg.mZ(paramAnonymousMenuItem)) {
                e.m(WalletVerifyCodeUI.this.vov.voR, "https://kf.qq.com/touch/sappfaq/160830qY7NJJ1608307ZJzqy.html", false);
              }
              for (;;)
              {
                GMTrace.o(6978382331904L, 51993);
                return true;
                e.m(WalletVerifyCodeUI.this.vov.voR, paramAnonymousMenuItem, false);
              }
            }
          });
          a(new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(6927379595264L, 51613);
              WalletVerifyCodeUI.this.aKl();
              if (WalletVerifyCodeUI.this.bvz()) {
                WalletVerifyCodeUI.this.showDialog(1000);
              }
              for (;;)
              {
                GMTrace.o(6927379595264L, 51613);
                return false;
                WalletVerifyCodeUI.this.finish();
              }
            }
          });
          GMTrace.o(6971537227776L, 51942);
          return;
          localObject3 = this.rXI;
          if (com.tencent.mm.x.m.zS()) {}
          for (localObject2 = getString(R.l.eZC);; localObject2 = getString(R.l.eZB))
          {
            ((TextView)localObject3).setText(String.format((String)localObject2, new Object[] { localObject1 }));
            this.rXI.setGravity(3);
            break;
          }
          ((TextView)localObject2).setVisibility(0);
          break label318;
          if ((localb == null) || (!localb.ciB()) || (i == 11) || (i == 21)) {
            break label574;
          }
          if ((!((Bankcard)localObject1).bwm()) && (!((Bankcard)localObject1).bwn()))
          {
            ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(6996367507456L, 52127);
                com.tencent.mm.ui.base.h.a(WalletVerifyCodeUI.this, WalletVerifyCodeUI.this.getString(R.l.eXF, new Object[] { localObject1.field_desc, localObject1.field_mobile }), "", WalletVerifyCodeUI.this.getString(R.l.eXE), WalletVerifyCodeUI.this.getString(R.l.duP), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(6961202462720L, 51865);
                    w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess2 and finish to reset mobile num!");
                    paramAnonymous2DialogInterface = WalletVerifyCodeUI.this.un;
                    paramAnonymous2DialogInterface.putInt("key_err_code", 408);
                    com.tencent.mm.wallet_core.a.i(WalletVerifyCodeUI.this, paramAnonymous2DialogInterface);
                    WalletVerifyCodeUI.this.finish();
                    GMTrace.o(6961202462720L, 51865);
                  }
                }, null);
                GMTrace.o(6996367507456L, 52127);
              }
            });
          }
          else
          {
            ((TextView)localObject2).setText(R.l.eZJ);
            ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                boolean bool = false;
                GMTrace.i(6927111159808L, 51611);
                w.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
                w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess3 and finish!");
                if ((WalletVerifyCodeUI.b(WalletVerifyCodeUI.this) != null) && (WalletVerifyCodeUI.b(WalletVerifyCodeUI.this).bwr())) {
                  com.tencent.mm.plugin.report.service.g.paX.i(13731, new Object[] { Integer.valueOf(9) });
                }
                paramAnonymousView = WalletVerifyCodeUI.this.un;
                paramAnonymousView.putInt("key_err_code", 417);
                paramAnonymousView.putBoolean("key_need_show_switch_phone", true);
                if ((localObject1 == null) || (localObject1.bwm())) {
                  bool = true;
                }
                paramAnonymousView.putBoolean("key_isbalance", bool);
                com.tencent.mm.wallet_core.a.i(WalletVerifyCodeUI.this, paramAnonymousView);
                WalletVerifyCodeUI.this.finish();
                GMTrace.o(6927111159808L, 51611);
              }
            });
          }
        }
        if (com.tencent.mm.x.m.zS()) {}
        for (localObject1 = getString(R.l.eZE);; localObject1 = getString(R.l.eZD))
        {
          ((TextView)localObject2).setText((CharSequence)localObject1);
          ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6982811516928L, 52026);
              WalletVerifyCodeUI.c(WalletVerifyCodeUI.this);
              GMTrace.o(6982811516928L, 52026);
            }
          });
          break;
        }
      }
    }
  }
  
  public boolean bvz()
  {
    GMTrace.i(6972476751872L, 51949);
    boolean bool = getIntent().getBooleanExtra("key_need_confirm_finish", false);
    if (((this.rHl != null) && (this.rHl.mBc)) || (bool))
    {
      GMTrace.o(6972476751872L, 51949);
      return true;
    }
    bool = super.bvz();
    GMTrace.o(6972476751872L, 51949);
    return bool;
  }
  
  public void bya()
  {
    GMTrace.i(6971268792320L, 51940);
    GMTrace.o(6971268792320L, 51940);
  }
  
  public void byb()
  {
    int j = 2;
    GMTrace.i(6971403010048L, 51941);
    w.i("MicroMsg.WalletVertifyCodeUI", "get verify code!");
    Object localObject = com.tencent.mm.plugin.report.service.g.paX;
    int i;
    if ((this.rHl != null) && (this.rHl.fIG != 0))
    {
      i = 1;
      if (!this.rXG) {
        break label188;
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(10706, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      this.rXG = true;
      this.rXD.setClickable(false);
      this.rXD.setEnabled(false);
      if (this.rXH != null)
      {
        this.rXH.cancel();
        this.rXH = null;
      }
      localObject = new a(this.rXB);
      this.rXH = ((a)localObject);
      ((a)localObject).start();
      if (this.iTN != null) {
        this.iTN.start();
      }
      if (!cjn().q(new Object[] { this.rXE })) {
        break label193;
      }
      GMTrace.o(6971403010048L, 51941);
      return;
      i = 2;
      break;
      label188:
      j = 1;
    }
    label193:
    if (mE(false))
    {
      GMTrace.o(6971403010048L, 51941);
      return;
    }
    this.rFy = ((Authen)this.un.getParcelable("key_authen"));
    if (this.rFy == null)
    {
      w.w("MicroMsg.WalletVertifyCodeUI", "error authen is null");
      GMTrace.o(6971403010048L, 51941);
      return;
    }
    c.byf();
    GMTrace.o(6971403010048L, 51941);
  }
  
  public void byc()
  {
    GMTrace.i(6971671445504L, 51943);
    Bundle localBundle = this.un;
    Object localObject = this.un.getString("key_pwd1");
    this.rXE = this.rXC.getText();
    n localn = new n();
    localn.rQC = ((String)localObject);
    localn.oRb = this.rHl;
    localn.rQD = this.rXE;
    localn.token = bg.ap(this.un.getString("kreq_token"), "");
    localObject = (Bankcard)localBundle.getParcelable("key_bankcard");
    if (localObject != null)
    {
      localn.oql = ((Bankcard)localObject).field_bankcardType;
      localn.oqm = ((Bankcard)localObject).field_bindSerial;
      localn.rMC = bg.ap(((Bankcard)localObject).field_arrive_type, "");
    }
    for (;;)
    {
      w.d("MicroMsg.WalletVertifyCodeUI", "payInfo " + localn.oRb + " mVerifyCode: " + this.rXE);
      localBundle.putString("key_verify_code", this.rXE);
      com.tencent.mm.wallet_core.a.aa(this);
      boolean bool = cjn().j(new Object[] { this.rXE, localn });
      w.i("MicroMsg.WalletVertifyCodeUI", "do verify result : " + bool);
      GMTrace.o(6971671445504L, 51943);
      return;
      localn.oql = this.un.getString("key_bank_type");
    }
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6971805663232L, 51944);
    w.d("MicroMsg.WalletVertifyCodeUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramk instanceof com.tencent.mm.wallet_core.c.f))
    {
      if ((paramInt2 != 0) && (((com.tencent.mm.wallet_core.c.f)paramk).fMW)) {
        com.tencent.mm.ui.base.h.a(this.vov.voR, paramString, null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7020124045312L, 52304);
            GMTrace.o(7020124045312L, 52304);
          }
        });
      }
      GMTrace.o(6971805663232L, 51944);
      return true;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.wallet_core.a.aa(this);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
      {
        this.un.putBoolean("intent_bind_end", true);
        com.tencent.mm.ui.base.h.bl(this, getString(R.l.eSE));
        w.i("MicroMsg.WalletVertifyCodeUI", "query bound bank card resp!");
        paramInt1 = 1;
      }
    }
    for (;;)
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.h)) {
        com.tencent.mm.plugin.report.service.g.paX.i(10707, new Object[] { Integer.valueOf(2), Integer.valueOf(c.byg()) });
      }
      if ((this.rFy != null) && ((paramk instanceof com.tencent.mm.wallet_core.f.a.h)))
      {
        paramString = ((com.tencent.mm.wallet_core.f.a.h)paramk).aUD();
        if (!bg.mZ(paramString)) {
          this.un.putString("kreq_token", paramString);
        }
      }
      if (paramInt1 != 0)
      {
        w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess1 and finish!");
        com.tencent.mm.wallet_core.a.i(this, this.un);
        finish();
        GMTrace.o(6971805663232L, 51944);
        return true;
        if (!(paramk instanceof l))
        {
          if (paramString.c(this, null))
          {
            r(new com.tencent.mm.plugin.wallet_core.b.m(bvp()));
            w.i("MicroMsg.WalletVertifyCodeUI", "to query bound bank card!");
          }
        }
        else {
          paramInt1 = 0;
        }
      }
      else
      {
        GMTrace.o(6971805663232L, 51944);
        return false;
      }
      paramInt1 = 1;
    }
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(6972208316416L, 51947);
    if (this.rXC.dI(null))
    {
      this.rFt.setEnabled(true);
      this.rFt.setClickable(true);
      GMTrace.o(6972208316416L, 51947);
      return;
    }
    this.rFt.setEnabled(false);
    this.rFt.setClickable(false);
    GMTrace.o(6972208316416L, 51947);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6971939880960L, 51945);
    int i = R.i.djv;
    GMTrace.o(6971939880960L, 51945);
    return i;
  }
  
  public final boolean i(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6972745187328L, 51951);
    w.i("MicroMsg.WalletVertifyCodeUI", "onPreSceneEnd %s %s", new Object[] { Integer.valueOf(paramInt2), paramk });
    if (((paramk instanceof com.tencent.mm.wallet_core.c.f)) && (paramInt2 == 0))
    {
      this.rXJ = true;
      t.makeText(this, R.l.eWJ, 0).show();
      w.i("MicroMsg.WalletVertifyCodeUI", "tag it isCertInstalled ok");
    }
    GMTrace.o(6972745187328L, 51951);
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int j = 2;
    GMTrace.i(6971000356864L, 51938);
    super.onCreate(paramBundle);
    oC(R.l.eZO);
    this.rHl = ((PayInfo)this.un.getParcelable("key_pay_info"));
    this.oZx = ((Orders)this.un.getParcelable("key_orders"));
    this.rXF = this.un.getString("key_bank_phone");
    this.iTN = new com.tencent.mm.plugin.ac.a(this);
    this.iTN.pFP = getResources().getStringArray(R.c.aMV);
    this.iTN.pFN = new a.a()
    {
      public final void qa(String paramAnonymousString)
      {
        GMTrace.i(6964021035008L, 51886);
        WalletVerifyCodeUI.this.rXC.setText(paramAnonymousString);
        GMTrace.o(6964021035008L, 51886);
      }
    };
    this.iTN.start();
    this.rXK = new com.tencent.mm.plugin.wallet_core.model.g(this.un);
    this.rXG = false;
    bya();
    MH();
    paramBundle = com.tencent.mm.plugin.report.service.g.paX;
    int i;
    if ((this.rHl != null) && (this.rHl.fIG != 0))
    {
      i = 1;
      if (!this.rXG) {
        break label436;
      }
      label180:
      paramBundle.i(10706, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      c.byf();
      c.b(this, this.un, 4);
      if (!this.rXK.bwr()) {
        break label441;
      }
      com.tencent.mm.plugin.report.service.g.paX.i(13731, new Object[] { Integer.valueOf(5) });
      this.un.putBoolean("key_block_bind_new_card", true);
      if (!bg.mZ(this.rXK.rNB.title)) {
        rV(this.rXK.rNB.title);
      }
      findViewById(R.h.brF).setVisibility(8);
      ((TextView)findViewById(R.h.brG)).setText(this.rXK.rNB.xfR);
      if (this.rXI != null)
      {
        paramBundle = bxZ();
        this.rXI.setText(bg.i(this.rXK.rNB.xfS, new Object[] { paramBundle }));
        this.rXI.setGravity(1);
      }
      if ((this.rFt != null) && (!bg.mZ(this.rXK.rNB.xfT))) {
        this.rFt.setText(this.rXK.rNB.xfT);
      }
    }
    for (;;)
    {
      this.xhw.hz(1580);
      GMTrace.o(6971000356864L, 51938);
      return;
      i = 2;
      break;
      label436:
      j = 1;
      break label180;
      label441:
      findViewById(R.h.brF).setVisibility(8);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6972342534144L, 51948);
    if (this.iTN != null) {
      this.iTN.stop();
    }
    this.xhw.hA(1580);
    super.onDestroy();
    GMTrace.o(6972342534144L, 51948);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6972074098688L, 51946);
    if (this.iTN != null) {
      this.iTN.stop();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6972074098688L, 51946);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(6972610969600L, 51950);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.WalletVertifyCodeUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bOd() });
        GMTrace.o(6972610969600L, 51950);
        return;
      }
    }
    w.i("MicroMsg.WalletVertifyCodeUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6972610969600L, 51950);
      return;
      if ((paramArrayOfInt[0] == 0) && (this.iTN != null)) {
        this.iTN.start();
      }
    }
  }
  
  final class a
    extends CountDownTimer
  {
    public a(long paramLong)
    {
      super(1000L);
      GMTrace.i(6946035859456L, 51752);
      GMTrace.o(6946035859456L, 51752);
    }
    
    public final void onFinish()
    {
      GMTrace.i(6946304294912L, 51754);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setClickable(true);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setEnabled(true);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setText(WalletVerifyCodeUI.this.getString(R.l.eZN));
      GMTrace.o(6946304294912L, 51754);
    }
    
    public final void onTick(long paramLong)
    {
      GMTrace.i(6946170077184L, 51753);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setText(WalletVerifyCodeUI.this.getString(R.l.eZN) + "(" + paramLong / 1000L + ")");
      GMTrace.o(6946170077184L, 51753);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */