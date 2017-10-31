package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.q;

@Deprecated
public abstract class FreeWifiStateUI
  extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected int cyK;
  protected String fBG;
  protected String fKY;
  protected int fjU;
  protected String fvF;
  private int fyk;
  private final com.tencent.mm.an.a.a.c hCC;
  protected String meB;
  protected String meD;
  protected String mfS;
  protected FreeWifiNetworkReceiver mfT;
  protected boolean mfU;
  private aj mfW;
  private aj mfX;
  private j.a mfY;
  private ImageView mgK;
  private TextView mgL;
  private TextView mgM;
  private Button mgN;
  private Button mgO;
  protected String mgR;
  protected String mgS;
  protected String mgT;
  protected String mgU;
  private TextView mgw;
  private q mhL;
  protected int mhQ;
  protected String mhR;
  protected String mhS;
  protected String signature;
  protected String ssid;
  
  public FreeWifiStateUI()
  {
    GMTrace.i(7227087781888L, 53846);
    this.fyk = 1;
    this.mfU = false;
    this.mhL = null;
    this.mfW = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(7177158787072L, 53474);
        if (!bg.mZ(FreeWifiStateUI.this.ssid))
        {
          FreeWifiStateUI.a(FreeWifiStateUI.this, FreeWifiStateUI.this.aAJ());
          w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { FreeWifiStateUI.this.ssid, Integer.valueOf(FreeWifiStateUI.a(FreeWifiStateUI.this)) });
          FreeWifiStateUI.b(FreeWifiStateUI.this).MM();
          k.a locala = k.azB();
          locala.ssid = FreeWifiStateUI.this.ssid;
          locala.fvF = FreeWifiStateUI.this.fvF;
          locala.mbX = m.B(FreeWifiStateUI.this.getIntent());
          locala.mbY = m.D(FreeWifiStateUI.this.getIntent());
          locala.mbZ = k.b.mck.mcK;
          locala.mca = k.b.mck.name;
          locala.result = -16;
          locala.fIC = m.E(FreeWifiStateUI.this.getIntent());
          locala.mbW = FreeWifiStateUI.this.fKY;
          locala.mcb = FreeWifiStateUI.this.fBG;
          locala.azD().azC();
          if (FreeWifiStateUI.a(FreeWifiStateUI.this) != 2)
          {
            FreeWifiStateUI.this.aAN();
            FreeWifiStateUI.this.aAL();
            com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiStateUI.this.ssid, 3, FreeWifiStateUI.this.getIntent());
          }
        }
        GMTrace.o(7177158787072L, 53474);
        return false;
      }
    }, false);
    this.mfX = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(7173132255232L, 53444);
        if (com.tencent.mm.plugin.freewifi.model.d.xS(FreeWifiStateUI.this.ssid))
        {
          FreeWifiStateUI.this.a(NetworkInfo.State.CONNECTED);
          FreeWifiStateUI.b(FreeWifiStateUI.this).MM();
          GMTrace.o(7173132255232L, 53444);
          return false;
        }
        GMTrace.o(7173132255232L, 53444);
        return true;
      }
    }, true);
    c.a locala = new c.a();
    locala.hCN = true;
    locala.hCO = true;
    locala.hDe = R.g.aYQ;
    locala.hDm = true;
    locala.hDn = 0.0F;
    this.hCC = locala.Jk();
    this.mfY = new j.a()
    {
      private int mhU;
      
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(7221853290496L, 53807);
        FreeWifiStateUI.a(FreeWifiStateUI.this, FreeWifiStateUI.this.aAJ());
        if (this.mhU != FreeWifiStateUI.a(FreeWifiStateUI.this))
        {
          this.mhU = FreeWifiStateUI.a(FreeWifiStateUI.this);
          FreeWifiStateUI.this.mT(FreeWifiStateUI.a(FreeWifiStateUI.this));
        }
        GMTrace.o(7221853290496L, 53807);
      }
    };
    GMTrace.o(7227087781888L, 53846);
  }
  
  private void aAO()
  {
    GMTrace.i(7228027305984L, 53853);
    this.mfT = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.mfT, localIntentFilter);
    GMTrace.o(7228027305984L, 53853);
  }
  
  private void goBack()
  {
    GMTrace.i(7228966830080L, 53860);
    com.tencent.mm.plugin.freewifi.l.r(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.ifM.i(localIntent, this);
    finish();
    GMTrace.o(7228966830080L, 53860);
  }
  
  protected void MH()
  {
    GMTrace.i(7227490435072L, 53849);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7185614503936L, 53537);
        FreeWifiStateUI.c(FreeWifiStateUI.this);
        GMTrace.o(7185614503936L, 53537);
        return true;
      }
    });
    if (getIntent().getIntExtra("free_wifi_protocol_type", 0) == 1) {
      findViewById(R.h.cDH).setVisibility(0);
    }
    this.mgK = ((ImageView)findViewById(R.h.bJH));
    this.mgL = ((TextView)findViewById(R.h.bKt));
    this.mgM = ((TextView)findViewById(R.h.bKg));
    this.mgw = ((TextView)findViewById(R.h.bJO));
    this.mgN = ((Button)findViewById(R.h.bxl));
    this.mgN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7232993361920L, 53890);
        com.tencent.mm.plugin.freewifi.l.q(com.tencent.mm.plugin.freewifi.model.d.azX(), FreeWifiStateUI.this.getIntent().getStringExtra("free_wifi_ap_key"), FreeWifiStateUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        if (FreeWifiStateUI.this.aAJ() == 2)
        {
          FreeWifiStateUI.this.finish();
          GMTrace.o(7232993361920L, 53890);
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiStateUI.this.ssid, 1, FreeWifiStateUI.this.getIntent());
        FreeWifiStateUI.this.mfU = false;
        FreeWifiStateUI.this.aAP();
        GMTrace.o(7232993361920L, 53890);
      }
    });
    this.mgO = ((Button)findViewById(R.h.cDI));
    this.mgO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7162931707904L, 53368);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", FreeWifiStateUI.this.mgU);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        com.tencent.mm.bi.d.b(FreeWifiStateUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7162931707904L, 53368);
      }
    });
    if (bg.mZ(this.ssid))
    {
      this.mgM.setText(getString(R.l.ebm));
      this.mgN.setVisibility(4);
    }
    GMTrace.o(7227490435072L, 53849);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7227356217344L, 53848);
    GMTrace.o(7227356217344L, 53848);
    return 1;
  }
  
  protected abstract void VX();
  
  public abstract void a(NetworkInfo.State paramState);
  
  protected abstract void aAI();
  
  protected abstract int aAJ();
  
  protected final void aAL()
  {
    GMTrace.i(7227624652800L, 53850);
    if (this.mfT != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister wifi state change receiver");
      this.mfT.mdS = null;
    }
    GMTrace.o(7227624652800L, 53850);
  }
  
  protected final void aAM()
  {
    GMTrace.i(7227758870528L, 53851);
    if (this.mfT == null) {
      aAO();
    }
    this.mfT.mdT = this;
    GMTrace.o(7227758870528L, 53851);
  }
  
  protected final void aAN()
  {
    GMTrace.i(7227893088256L, 53852);
    if (this.mfT != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister network changed receiver");
      this.mfT.mdT = null;
    }
    GMTrace.o(7227893088256L, 53852);
  }
  
  protected final void aAP()
  {
    GMTrace.i(7228161523712L, 53854);
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.mfW.w(60000L, 60000L);
      this.mfX.w(1000L, 1000L);
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "wifi is not enable, enable it");
      j.aAh().azR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7196754575360L, 53620);
          FreeWifiStateUI.d(FreeWifiStateUI.this);
          GMTrace.o(7196754575360L, 53620);
        }
      });
      GMTrace.o(7228161523712L, 53854);
      return;
    }
    this.fyk = aAJ();
    w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.fyk) });
    if (this.fyk != 2)
    {
      if (m.D(getIntent()) == 4) {
        this.mfW.w(30000L, 30000L);
      }
      for (;;)
      {
        this.mfX.w(1000L, 1000L);
        if (!com.tencent.mm.plugin.freewifi.model.d.xS(this.ssid)) {
          break label274;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.mfU) });
        if (!this.mfU) {
          break;
        }
        w.d("MicroMsg.FreeWifi.FreeWifiStateUI", "now it is authing");
        GMTrace.o(7228161523712L, 53854);
        return;
        this.mfW.w(60000L, 60000L);
      }
      this.mfW.w(60000L, 60000L);
      this.mfX.w(1000L, 1000L);
      VX();
      this.mfU = true;
      GMTrace.o(7228161523712L, 53854);
      return;
      label274:
      j.aAh().azR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7176890351616L, 53472);
          w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now network ssid is not wechat freewifi :%s", new Object[] { FreeWifiStateUI.this.ssid });
          FreeWifiStateUI.this.aAI();
          GMTrace.o(7176890351616L, 53472);
        }
      });
      GMTrace.o(7228161523712L, 53854);
      return;
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, this.fyk, getIntent());
    GMTrace.o(7228161523712L, 53854);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7228429959168L, 53856);
    int i = R.i.cVe;
    GMTrace.o(7228429959168L, 53856);
    return i;
  }
  
  protected final void mT(int paramInt)
  {
    GMTrace.i(7228295741440L, 53855);
    w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      if (this.mhL != null) {
        this.mhL.dismiss();
      }
      this.mgw.setVisibility(4);
      this.mgN.setText(R.l.dLS);
      if (this.cyK == 3) {
        this.mgM.setText(getString(R.l.eoY, new Object[] { this.ssid }));
      }
      break;
    }
    for (;;)
    {
      if (!bg.mZ(this.fKY))
      {
        if (!bg.mZ(this.mgS)) {
          this.mgL.setText(this.mgS);
        }
        if (!bg.mZ(this.mgR)) {
          n.Ja().a(this.mgR, this.mgK, this.hCC);
        }
      }
      label488:
      for (;;)
      {
        GMTrace.o(7228295741440L, 53855);
        return;
        if (this.mhL != null) {
          this.mhL.dismiss();
        }
        this.mfW.MM();
        this.mfX.MM();
        this.mfU = false;
        this.mgw.setVisibility(4);
        this.mgN.setText(R.l.dLS);
        if ((m.E(getIntent()) == 10) && (!m.xJ(com.tencent.mm.compatible.d.p.gJg.gJA)) && (!m.xJ(com.tencent.mm.compatible.d.p.aD(this.vov.voR)))) {
          this.mgN.setText(String.format(getString(R.l.eaK), new Object[] { com.tencent.mm.compatible.d.p.aD(this.vov.voR) }));
        }
        if (this.cyK == 3) {
          this.mgM.setText(getString(R.l.eoY, new Object[] { this.ssid }));
        }
        for (;;)
        {
          if (bg.mZ(this.fKY)) {
            break label488;
          }
          if (!bg.mZ(this.mgS)) {
            this.mgL.setText(this.mgS);
          }
          if (bg.mZ(this.mgR)) {
            break;
          }
          n.Ja().a(this.mgR, this.mgK, this.hCC);
          GMTrace.o(7228295741440L, 53855);
          return;
          if (bg.mZ(this.mgT)) {
            this.mgM.setText(getString(R.l.dLO));
          } else {
            this.mgM.setText(this.mgT);
          }
        }
      }
      if (this.mhL != null) {
        this.mhL.dismiss();
      }
      this.mfW.MM();
      this.mfX.MM();
      this.mgw.setVisibility(0);
      this.mgN.setText(R.l.ebk);
      GMTrace.o(7228295741440L, 53855);
      return;
      if (this.mhL != null) {
        this.mhL.dismiss();
      }
      this.mfW.MM();
      this.mfX.MM();
      this.mgN.setText(R.l.dLM);
      this.mgN.setClickable(false);
      Intent localIntent = getIntent();
      localIntent.putExtra("free_wifi_appid", this.fKY);
      localIntent.putExtra("free_wifi_app_nickname", this.meD);
      localIntent.putExtra("free_wifi_app_username", this.fBG);
      localIntent.putExtra("free_wifi_signature", this.signature);
      localIntent.putExtra("free_wifi_finish_actioncode", this.mhQ);
      localIntent.putExtra("free_wifi_finish_url", this.mhR);
      if (bg.mZ(this.mhS)) {
        localIntent.setClass(this, FreeWifiSuccUI.class);
      }
      for (;;)
      {
        finish();
        startActivity(localIntent);
        d.rB();
        GMTrace.o(7228295741440L, 53855);
        return;
        localIntent.putExtra("free_wifi_qinghuai_url", this.mhS);
        localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
      }
      this.mgw.setVisibility(4);
      this.mgN.setText(R.l.dLP);
      this.mhL = h.a(this.vov.voR, getString(R.l.dLP), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7161857966080L, 53360);
          com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiStateUI.this.ssid, 4, FreeWifiStateUI.this.getIntent());
          GMTrace.o(7161857966080L, 53360);
        }
      });
      GMTrace.o(7228295741440L, 53855);
      return;
      if (this.mhL != null) {
        this.mhL.dismiss();
      }
      this.mfW.MM();
      this.mfX.MM();
      this.mgw.setVisibility(0);
      this.mgN.setText(R.l.ebk);
      GMTrace.o(7228295741440L, 53855);
      return;
      GMTrace.o(7228295741440L, 53855);
      return;
      if (bg.mZ(this.mgT)) {
        this.mgM.setText(getString(R.l.dLO));
      } else {
        this.mgM.setText(this.mgT);
      }
    }
  }
  
  public final void nJ(int paramInt)
  {
    GMTrace.i(7228698394624L, 53858);
    w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7228698394624L, 53858);
      return;
      GMTrace.o(7228698394624L, 53858);
      return;
      GMTrace.o(7228698394624L, 53858);
      return;
      aAL();
      aAP();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7227221999616L, 53847);
    super.onCreate(paramBundle);
    this.fvF = getIntent().getStringExtra("free_wifi_ap_key");
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.mfS = getIntent().getStringExtra("free_wifi_mid");
    this.meB = getIntent().getStringExtra("free_wifi_url");
    this.cyK = getIntent().getIntExtra("free_wifi_source", 1);
    this.fjU = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.fKY = getIntent().getStringExtra("free_wifi_appid");
    this.mgR = getIntent().getStringExtra("free_wifi_head_img_url");
    this.mgS = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.mgT = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.mgU = getIntent().getStringExtra("free_wifi_privacy_url");
    this.meD = getIntent().getStringExtra("free_wifi_app_nickname");
    switch (this.cyK)
    {
    default: 
      if (bg.mZ(this.ssid)) {
        w.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      break;
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        label243:
        MH();
        j.aAe().c(this.mfY);
        com.tencent.mm.plugin.freewifi.l.p(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
        GMTrace.o(7227221999616L, 53847);
        return;
        paramBundle = j.aAe().aAG();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.mfS = paramBundle.field_mid;
          this.meB = paramBundle.field_url;
          w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.mfS, this.meB });
          break;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bg.mZ(this.ssid)) {
          break label398;
        }
        w.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      label398:
      paramBundle = j.aAe().yb(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = aa.QW(this.ssid);
        paramBundle.field_ssid = this.ssid;
      }
      break;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.meB;
      paramBundle.field_mid = this.mfS;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      paramBundle.field_connectState = 1;
      if (i != 0)
      {
        j.aAe().b(paramBundle);
        break;
      }
      j.aAe().c(paramBundle, new String[0]);
      break;
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.mfS, Integer.valueOf(this.cyK) });
      break label243;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7228564176896L, 53857);
    super.onDestroy();
    j.aAe().j(this.mfY);
    aAL();
    aAN();
    if (this.mfT != null) {
      unregisterReceiver(this.mfT);
    }
    this.mfW.MM();
    this.mfX.MM();
    j.aAh().release();
    GMTrace.o(7228564176896L, 53857);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7228832612352L, 53859);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7228832612352L, 53859);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7228832612352L, 53859);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */