package com.tencent.mm.plugin.freewifi.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.x.ap;

public class FreeWifiSuccWebViewUI
  extends WebViewUI
  implements e
{
  private String fBG;
  private int fIC;
  private String fKY;
  private String meD;
  private int mhQ;
  private String mhR;
  private boolean mic;
  private String signature;
  
  public FreeWifiSuccWebViewUI()
  {
    GMTrace.i(7197694099456L, 53627);
    this.mic = false;
    GMTrace.o(7197694099456L, 53627);
  }
  
  protected final void MH()
  {
    GMTrace.i(7198499405824L, 53633);
    super.MH();
    kU(false);
    a(0, getString(R.l.eaZ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7171655860224L, 53433);
        FreeWifiSuccWebViewUI.this.finish();
        FreeWifiSuccWebViewUI.a(FreeWifiSuccWebViewUI.this);
        GMTrace.o(7171655860224L, 53433);
        return true;
      }
    }, p.b.vpG);
    GMTrace.o(7198499405824L, 53633);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(7198767841280L, 53635);
    w.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ap.wT().b(1703, this);
    GMTrace.o(7198767841280L, 53635);
  }
  
  protected final void aal()
  {
    GMTrace.i(7198096752640L, 53630);
    super.aal();
    GMTrace.o(7198096752640L, 53630);
  }
  
  public void finish()
  {
    GMTrace.i(7198230970368L, 53631);
    super.finish();
    GMTrace.o(7198230970368L, 53631);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(7198365188096L, 53632);
    super.onBackPressed();
    GMTrace.o(7198365188096L, 53632);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7197828317184L, 53628);
    com.tencent.mm.plugin.freewifi.j.userName = "";
    com.tencent.mm.plugin.freewifi.j.type = 0;
    String str = getIntent().getStringExtra("free_wifi_qinghuai_url");
    w.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "qinghuaiUrl=%s", new Object[] { str });
    getIntent().putExtra("rawUrl", str);
    getIntent().putExtra("showShare", false);
    super.onCreate(paramBundle);
    this.fKY = getIntent().getStringExtra("free_wifi_appid");
    this.meD = getIntent().getStringExtra("free_wifi_app_nickname");
    this.fBG = getIntent().getStringExtra("free_wifi_app_username");
    this.mhQ = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.mhR = getIntent().getStringExtra("free_wifi_finish_url");
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    this.fIC = m.E(getIntent());
    if (this.fIC == 10)
    {
      paramBundle = com.tencent.mm.compatible.d.p.gJg.gJA;
      str = com.tencent.mm.compatible.d.p.aD(this.vov.voR);
      if ((!m.xJ(paramBundle)) && (!m.xJ(str))) {
        this.mhR = Uri.parse(this.mhR).buildUpon().appendQueryParameter("manufacturer", str).appendQueryParameter("manufacturerUsername", paramBundle).toString();
      }
    }
    w.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.fKY, this.meD, this.fBG, Integer.valueOf(this.mhQ), this.mhR, this.signature });
    WifiInfo localWifiInfo = d.azW();
    k.a locala = com.tencent.mm.plugin.freewifi.k.azB();
    if (localWifiInfo != null)
    {
      str = localWifiInfo.getMacAddress();
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
    GMTrace.o(7197828317184L, 53628);
  }
  
  @TargetApi(11)
  protected void onDestroy()
  {
    GMTrace.i(7197962534912L, 53629);
    super.onDestroy();
    ap.wT().b(1703, this);
    GMTrace.o(7197962534912L, 53629);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(7198633623552L, 53634);
    String str = (String)paramMenu.getItem(0).getTitle();
    if (!getString(R.l.eaZ).equals(str)) {
      a(0, getString(R.l.eaZ), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7209907912704L, 53718);
          FreeWifiSuccWebViewUI.this.finish();
          FreeWifiSuccWebViewUI.a(FreeWifiSuccWebViewUI.this);
          GMTrace.o(7209907912704L, 53718);
          return true;
        }
      }, p.b.vpG);
    }
    boolean bool = super.onPrepareOptionsMenu(paramMenu);
    GMTrace.o(7198633623552L, 53634);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiSuccWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */