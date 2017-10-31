package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;

public class FreeWifiSuccUI
  extends MMActivity
  implements e
{
  private String fBG;
  private String fKY;
  private Button jUG;
  private CheckBox kzn;
  private String meD;
  private TextView mhJ;
  private int mhQ;
  private String mhR;
  private View mhW;
  private TextView mhX;
  private View mhY;
  private TextView mhZ;
  private View mia;
  private int mib;
  private boolean mic;
  private boolean mid;
  private String signature;
  
  public FreeWifiSuccUI()
  {
    GMTrace.i(7203733897216L, 53672);
    this.mic = false;
    this.mid = false;
    GMTrace.o(7203733897216L, 53672);
  }
  
  private void aBa()
  {
    GMTrace.i(7204941856768L, 53681);
    if (this.mid)
    {
      GMTrace.o(7204941856768L, 53681);
      return;
    }
    this.mid = true;
    if ((this.mic) && (!bg.mZ(this.fKY)) && ((!o.fn(this.fBG)) || (!o.fm(this.fBG))))
    {
      ap.wT().a(1703, this);
      i locali = new i(this.fKY, getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_channel_id", 0), m.B(getIntent()));
      ap.wT().a(locali, 0);
    }
    l.c(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), this.mic);
    GMTrace.o(7204941856768L, 53681);
  }
  
  protected final void MH()
  {
    GMTrace.i(7204807639040L, 53680);
    oC(R.l.ebo);
    kU(false);
    this.mhW = findViewById(R.h.bKm);
    this.mhX = ((TextView)findViewById(R.h.bKn));
    this.kzn = ((CheckBox)findViewById(R.h.bKk));
    this.mhY = findViewById(R.h.bKh);
    this.mhZ = ((TextView)findViewById(R.h.bKi));
    this.mia = findViewById(R.h.bKo);
    this.mhJ = ((TextView)findViewById(R.h.bKj));
    this.jUG = ((Button)findViewById(R.h.bxm));
    this.jUG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7179037835264L, 53488);
        FreeWifiSuccUI.this.finish();
        FreeWifiSuccUI.a(FreeWifiSuccUI.this);
        GMTrace.o(7179037835264L, 53488);
      }
    });
    if ((bg.mZ(this.fKY)) || (bg.mZ(this.fBG)) || (bg.mZ(this.meD)))
    {
      this.mhW.setVisibility(8);
      this.mhY.setVisibility(8);
      this.mia.setVisibility(8);
    }
    for (;;)
    {
      if (m.E(getIntent()) == 10)
      {
        final String str = com.tencent.mm.compatible.d.p.gJg.gJA;
        if ((!m.xJ(str)) && (!m.xJ(com.tencent.mm.compatible.d.p.aD(this.vov.voR))))
        {
          Button localButton = (Button)findViewById(R.h.bKp);
          localButton.setText(String.format(getString(R.l.ebn), new Object[] { com.tencent.mm.compatible.d.p.aD(this.vov.voR) }));
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7184809197568L, 53531);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", str);
              com.tencent.mm.bi.d.b(FreeWifiSuccUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
              GMTrace.o(7184809197568L, 53531);
            }
          });
          localButton.setVisibility(0);
        }
      }
      GMTrace.o(7204807639040L, 53680);
      return;
      if ((!o.fn(this.fBG)) || (!o.fm(this.fBG))) {
        break;
      }
      l.b(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), true);
      this.mhW.setVisibility(8);
      this.mhY.setVisibility(8);
      this.mia.setVisibility(0);
      this.mhJ.setText(this.meD);
      this.mia.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7195815051264L, 53613);
          if (!bg.mZ(FreeWifiSuccUI.b(FreeWifiSuccUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Contact_User", FreeWifiSuccUI.b(FreeWifiSuccUI.this));
            com.tencent.mm.bi.d.b(FreeWifiSuccUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
          }
          GMTrace.o(7195815051264L, 53613);
        }
      });
    }
    l.b(com.tencent.mm.plugin.freewifi.model.d.azX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), false);
    this.mia.setVisibility(8);
    this.mhW.setVisibility(0);
    if (bg.mZ(this.signature))
    {
      this.mhY.setVisibility(8);
      findViewById(R.h.bKl).setBackgroundColor(getResources().getColor(R.e.white));
      label495:
      this.mhX.setText(getString(R.l.eba, new Object[] { this.meD }));
      if (this.mib != 1) {
        break label581;
      }
      this.kzn.setChecked(true);
    }
    for (this.mic = true;; this.mic = false)
    {
      this.kzn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          GMTrace.i(7160918441984L, 53353);
          if (paramAnonymousBoolean)
          {
            FreeWifiSuccUI.a(FreeWifiSuccUI.this, true);
            GMTrace.o(7160918441984L, 53353);
            return;
          }
          FreeWifiSuccUI.a(FreeWifiSuccUI.this, false);
          GMTrace.o(7160918441984L, 53353);
        }
      });
      break;
      this.mhY.setVisibility(0);
      this.mhZ.setText(this.signature);
      break label495;
      label581:
      this.kzn.setChecked(false);
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(7204539203584L, 53678);
    GMTrace.o(7204539203584L, 53678);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(7204404985856L, 53677);
    w.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ap.wT().b(1703, this);
    GMTrace.o(7204404985856L, 53677);
  }
  
  public void finish()
  {
    GMTrace.i(7204136550400L, 53675);
    super.finish();
    aBa();
    GMTrace.o(7204136550400L, 53675);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7204673421312L, 53679);
    int i = R.i.cVm;
    GMTrace.o(7204673421312L, 53679);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7203868114944L, 53673);
    super.onCreate(paramBundle);
    this.fKY = getIntent().getStringExtra("free_wifi_appid");
    this.meD = getIntent().getStringExtra("free_wifi_app_nickname");
    this.fBG = getIntent().getStringExtra("free_wifi_app_username");
    this.mhQ = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.mhR = getIntent().getStringExtra("free_wifi_finish_url");
    this.mib = getIntent().getIntExtra(e.b.vkA, 0);
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    w.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.fKY, this.meD, this.fBG, Integer.valueOf(this.mhQ), this.mhR, this.signature });
    WifiInfo localWifiInfo = com.tencent.mm.plugin.freewifi.model.d.azW();
    k.a locala = com.tencent.mm.plugin.freewifi.k.azB();
    String str = localWifiInfo.getMacAddress();
    paramBundle = str;
    if (Build.VERSION.SDK_INT > 22) {
      if (str != null)
      {
        paramBundle = str;
        if (!str.equals("02:00:00:00:00:00")) {}
      }
      else
      {
        paramBundle = m.azG();
      }
    }
    if (localWifiInfo != null)
    {
      locala.ssid = m.xK(localWifiInfo.getSSID());
      locala.bssid = localWifiInfo.getBSSID();
      locala.fvG = paramBundle;
    }
    locala.fvF = getIntent().getStringExtra("free_wifi_ap_key");
    locala.mbW = this.fKY;
    locala.mbX = m.B(getIntent());
    locala.mbY = m.D(getIntent());
    locala.mbZ = k.b.mcl.mcK;
    locala.mca = k.b.mcl.name;
    locala.fIC = m.E(getIntent());
    locala.mcb = this.fBG;
    locala.azD().azC();
    GMTrace.o(7203868114944L, 53673);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7204270768128L, 53676);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      GMTrace.o(7204270768128L, 53676);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7204270768128L, 53676);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(7204002332672L, 53674);
    super.onResume();
    MH();
    GMTrace.o(7204002332672L, 53674);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiSuccUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */