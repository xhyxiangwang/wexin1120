package com.tencent.mm.plugin.freewifi.ui;

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
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

@Deprecated
public abstract class FreeWifiActivateStateUI
  extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected int cyK;
  protected int fjU;
  private int fyk;
  protected String meB;
  private FreeWifiStateView mfN;
  private TextView mfO;
  private TextView mfP;
  private Button mfQ;
  protected Button mfR;
  protected String mfS;
  protected FreeWifiNetworkReceiver mfT;
  protected boolean mfU;
  private boolean mfV;
  private aj mfW;
  private aj mfX;
  private j.a mfY;
  protected String ssid;
  
  public FreeWifiActivateStateUI()
  {
    GMTrace.i(7218497847296L, 53782);
    this.fyk = 1;
    this.mfU = false;
    this.mfV = false;
    this.mfW = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(7163468578816L, 53372);
        if (!bg.mZ(FreeWifiActivateStateUI.this.ssid))
        {
          FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this, FreeWifiActivateStateUI.this.aAJ());
          w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { FreeWifiActivateStateUI.this.ssid, Integer.valueOf(FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this)) });
          FreeWifiActivateStateUI.b(FreeWifiActivateStateUI.this).MM();
          if (FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this) != 2)
          {
            FreeWifiActivateStateUI.this.aAN();
            FreeWifiActivateStateUI.this.aAL();
            com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateStateUI.this.ssid, 3, FreeWifiActivateStateUI.this.getIntent());
          }
        }
        GMTrace.o(7163468578816L, 53372);
        return false;
      }
    }, false);
    this.mfX = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(7194338656256L, 53602);
        if (com.tencent.mm.plugin.freewifi.model.d.xS(FreeWifiActivateStateUI.this.ssid))
        {
          FreeWifiActivateStateUI.this.a(NetworkInfo.State.CONNECTED);
          FreeWifiActivateStateUI.b(FreeWifiActivateStateUI.this).MM();
          GMTrace.o(7194338656256L, 53602);
          return false;
        }
        GMTrace.o(7194338656256L, 53602);
        return true;
      }
    }, true);
    this.mfY = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(7202794373120L, 53665);
        FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this, FreeWifiActivateStateUI.this.aAJ());
        FreeWifiActivateStateUI.this.mT(FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this));
        GMTrace.o(7202794373120L, 53665);
      }
    };
    GMTrace.o(7218497847296L, 53782);
  }
  
  private void aAO()
  {
    GMTrace.i(7219571589120L, 53790);
    this.mfT = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.mfT, localIntentFilter);
    GMTrace.o(7219571589120L, 53790);
  }
  
  private void goBack()
  {
    GMTrace.i(7220511113216L, 53797);
    finish();
    if (getIntent().getBooleanExtra("free_wifi_jump_to_main_ui", false))
    {
      Intent localIntent = new Intent();
      g.ifM.i(localIntent, this);
    }
    GMTrace.o(7220511113216L, 53797);
  }
  
  protected void MH()
  {
    GMTrace.i(7219034718208L, 53786);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7179843141632L, 53494);
        FreeWifiActivateStateUI.c(FreeWifiActivateStateUI.this);
        GMTrace.o(7179843141632L, 53494);
        return true;
      }
    });
    this.mfN = ((FreeWifiStateView)findViewById(R.h.bJJ));
    this.mfO = ((TextView)findViewById(R.h.bJK));
    this.mfP = ((TextView)findViewById(R.h.bJL));
    if (this.cyK == 3) {
      this.mfP.setText(getString(R.l.eoY, new Object[] { this.ssid }));
    }
    for (;;)
    {
      this.mfQ = ((Button)findViewById(R.h.cnX));
      this.mfQ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7178769399808L, 53486);
          if (FreeWifiActivateStateUI.this.aAJ() == 2)
          {
            FreeWifiActivateStateUI.this.finish();
            GMTrace.o(7178769399808L, 53486);
            return;
          }
          com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateStateUI.this.ssid, 1, FreeWifiActivateStateUI.this.getIntent());
          FreeWifiActivateStateUI.this.mfU = false;
          FreeWifiActivateStateUI.this.aAP();
          GMTrace.o(7178769399808L, 53486);
        }
      });
      this.mfR = ((Button)findViewById(R.h.bOI));
      this.mfR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7162394836992L, 53364);
          paramAnonymousView = FreeWifiActivateStateUI.this.getString(R.l.eaY);
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("show_bottom", false);
          com.tencent.mm.bi.d.b(FreeWifiActivateStateUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(7162394836992L, 53364);
        }
      });
      GMTrace.o(7219034718208L, 53786);
      return;
      this.mfP.setText(getString(R.l.dLQ, new Object[] { this.ssid }));
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(7218766282752L, 53784);
    GMTrace.o(7218766282752L, 53784);
    return 1;
  }
  
  protected abstract void VX();
  
  protected abstract void aAI();
  
  protected abstract int aAJ();
  
  protected final void aAL()
  {
    GMTrace.i(7219168935936L, 53787);
    if (this.mfT != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister wifi state change receiver");
      this.mfT.mdS = null;
    }
    GMTrace.o(7219168935936L, 53787);
  }
  
  protected final void aAM()
  {
    GMTrace.i(7219303153664L, 53788);
    if (this.mfT == null) {
      aAO();
    }
    this.mfT.mdT = this;
    GMTrace.o(7219303153664L, 53788);
  }
  
  protected final void aAN()
  {
    GMTrace.i(7219437371392L, 53789);
    if (this.mfT != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister network changed receiver");
      this.mfT.mdT = null;
    }
    GMTrace.o(7219437371392L, 53789);
  }
  
  protected final void aAP()
  {
    GMTrace.i(7219705806848L, 53791);
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.mfW.w(60000L, 60000L);
      this.mfX.w(1000L, 1000L);
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "wifi is not enable, enable it");
      j.aAh().azR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7188030423040L, 53555);
          FreeWifiActivateStateUI.d(FreeWifiActivateStateUI.this);
          GMTrace.o(7188030423040L, 53555);
        }
      });
      GMTrace.o(7219705806848L, 53791);
      return;
    }
    this.fyk = aAJ();
    w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.fyk) });
    if (this.fyk != 2)
    {
      this.mfW.w(60000L, 60000L);
      this.mfX.w(1000L, 1000L);
      if (com.tencent.mm.plugin.freewifi.model.d.xS(this.ssid))
      {
        w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.mfU) });
        if (this.mfU)
        {
          w.d("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now it is authing");
          GMTrace.o(7219705806848L, 53791);
          return;
        }
        this.mfW.w(60000L, 60000L);
        this.mfX.w(1000L, 1000L);
        VX();
        this.mfU = true;
        GMTrace.o(7219705806848L, 53791);
        return;
      }
      j.aAh().azR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7233798668288L, 53896);
          w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now network ssid is not wechat freewifi :%s", new Object[] { FreeWifiActivateStateUI.this.ssid });
          FreeWifiActivateStateUI.this.aAI();
          GMTrace.o(7233798668288L, 53896);
        }
      });
      GMTrace.o(7219705806848L, 53791);
      return;
    }
    mT(this.fyk);
    GMTrace.o(7219705806848L, 53791);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7219974242304L, 53793);
    int i = R.i.cVl;
    GMTrace.o(7219974242304L, 53793);
    return i;
  }
  
  protected final void mT(int paramInt)
  {
    GMTrace.i(7219840024576L, 53792);
    this.mfN.setOnClickListener(null);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      this.mfN.setImageResource(R.g.aYY);
      this.mfO.setText(R.l.dLN);
      if (this.cyK == 3) {
        this.mfP.setText(getString(R.l.eoY, new Object[] { this.ssid }));
      }
      break;
    }
    for (;;)
    {
      this.mfQ.setVisibility(8);
      GMTrace.o(7219840024576L, 53792);
      return;
      this.mfN.setImageResource(R.g.aYY);
      this.mfN.setState(3);
      this.mfN.lva = 2;
      this.mfO.setText(R.l.dLR);
      this.mfQ.setVisibility(0);
      this.mfQ.setText(R.l.ebk);
      this.mfW.MM();
      this.mfX.MM();
      GMTrace.o(7219840024576L, 53792);
      return;
      this.mfN.setImageResource(R.g.aYW);
      this.mfN.setState(2);
      this.mfO.setText(R.l.dLM);
      this.mfQ.setVisibility(0);
      this.mfQ.setText(R.l.eaH);
      this.mfW.MM();
      this.mfX.MM();
      if ((this.cyK == 1) || (this.cyK == 5) || (this.cyK == 4))
      {
        this.mfQ.setVisibility(4);
        final com.tencent.mm.plugin.freewifi.g.c localc = j.aAe().yb(this.ssid);
        if ((localc != null) && (!bg.mZ(localc.field_showUrl)) && (!this.mfV))
        {
          this.mfV = true;
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7193264914432L, 53594);
              Intent localIntent = new Intent();
              String str = v.d(FreeWifiActivateStateUI.this.getSharedPreferences(ab.bNa(), 0));
              localIntent.putExtra("rawUrl", localc.field_showUrl + "&lang=" + str);
              localIntent.putExtra("show_bottom", false);
              localIntent.putExtra("stastic_scene", 7);
              com.tencent.mm.bi.d.b(FreeWifiActivateStateUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
              w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "jump to ad page after auth success, url is : %s", new Object[] { localIntent.getStringExtra("rawUrl") });
              FreeWifiActivateStateUI.this.finish();
              GMTrace.o(7193264914432L, 53594);
            }
          }, 1000L);
        }
      }
      d.rB();
      GMTrace.o(7219840024576L, 53792);
      return;
      this.mfN.setImageResource(R.g.aYY);
      this.mfN.setState(1);
      this.mfO.setText(R.l.dLN);
      continue;
      this.mfW.MM();
      this.mfX.MM();
      this.mfN.setImageResource(R.g.aYX);
      this.mfN.setState(3);
      this.mfO.setText(R.l.ebb);
      this.mfO.setVisibility(0);
      this.mfP.setText(R.l.ebc);
      this.mfP.setVisibility(0);
      continue;
      this.mfP.setText(getString(R.l.dLQ, new Object[] { this.ssid }));
    }
  }
  
  public final void nJ(int paramInt)
  {
    GMTrace.i(7220242677760L, 53795);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7220242677760L, 53795);
      return;
      GMTrace.o(7220242677760L, 53795);
      return;
      GMTrace.o(7220242677760L, 53795);
      return;
      aAL();
      aAP();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7218632065024L, 53783);
    super.onCreate(paramBundle);
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.mfS = getIntent().getStringExtra("free_wifi_mid");
    this.meB = getIntent().getStringExtra("free_wifi_url");
    this.cyK = getIntent().getIntExtra("free_wifi_source", 1);
    this.fjU = getIntent().getIntExtra("free_wifi_channel_id", 0);
    switch (this.cyK)
    {
    default: 
      if (bg.mZ(this.ssid)) {
        w.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      break;
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 5: 
      for (;;)
      {
        label143:
        MH();
        j.aAe().c(this.mfY);
        GMTrace.o(7218632065024L, 53783);
        return;
        paramBundle = j.aAe().aAG();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.mfS = paramBundle.field_mid;
          this.meB = paramBundle.field_url;
          w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.mfS, this.meB });
          break;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bg.mZ(this.ssid)) {
          break label273;
        }
        w.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      label273:
      paramBundle = j.aAe().yb(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = aa.QW(this.ssid);
        paramBundle.field_ssid = this.ssid;
        paramBundle.field_connectState = 1;
      }
      break;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.meB;
      paramBundle.field_mid = this.mfS;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      if (i != 0)
      {
        j.aAe().b(paramBundle);
        break;
      }
      j.aAe().c(paramBundle, new String[0]);
      break;
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.mfS, Integer.valueOf(this.cyK) });
      break label143;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7220108460032L, 53794);
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
    GMTrace.o(7220108460032L, 53794);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7220376895488L, 53796);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7220376895488L, 53796);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7220376895488L, 53796);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(7218900500480L, 53785);
    super.onResume();
    if (!bg.mZ(this.ssid)) {
      aAP();
    }
    GMTrace.o(7218900500480L, 53785);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiActivateStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */