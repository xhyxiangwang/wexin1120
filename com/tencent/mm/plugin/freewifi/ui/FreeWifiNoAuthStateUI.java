package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public abstract class FreeWifiNoAuthStateUI
  extends FreeWifiStateUI
{
  private String mbz;
  private int mfL;
  private boolean mfM;
  
  public FreeWifiNoAuthStateUI()
  {
    GMTrace.i(7181587972096L, 53507);
    GMTrace.o(7181587972096L, 53507);
  }
  
  protected final void MH()
  {
    GMTrace.i(7181856407552L, 53509);
    super.MH();
    rV(aAK());
    GMTrace.o(7181856407552L, 53509);
  }
  
  protected final void VX()
  {
    GMTrace.i(7182259060736L, 53512);
    aAI();
    GMTrace.o(7182259060736L, 53512);
  }
  
  public void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7182124843008L, 53511);
    w.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.xS(this.ssid)))
    {
      aAN();
      this.mfU = false;
      d.a(this.ssid, 2, getIntent());
    }
    GMTrace.o(7182124843008L, 53511);
  }
  
  protected final void aAI()
  {
    GMTrace.i(7182393278464L, 53513);
    if (this.mfU)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "it is authing now");
      GMTrace.o(7182393278464L, 53513);
      return;
    }
    this.mfU = true;
    aAM();
    int i = d.d(this.ssid, this.mbz, this.mfL, this.mfM);
    k.a locala = k.azB();
    locala.ssid = this.ssid;
    locala.fvF = this.fvF;
    locala.mbX = m.B(getIntent());
    locala.mbY = m.D(getIntent());
    locala.mbZ = k.b.mck.mcK;
    locala.mca = k.b.mck.name;
    locala.result = i;
    locala.fIC = m.E(getIntent());
    locala.mbW = this.fKY;
    locala.mcb = this.fBG;
    locala.azD().azC();
    GMTrace.o(7182393278464L, 53513);
  }
  
  protected int aAJ()
  {
    GMTrace.i(7182527496192L, 53514);
    if (d.xS(this.ssid))
    {
      d.a(this.ssid, 2, getIntent());
      GMTrace.o(7182527496192L, 53514);
      return 2;
    }
    GMTrace.o(7182527496192L, 53514);
    return 1;
  }
  
  protected abstract String aAK();
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7181722189824L, 53508);
    this.mfL = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.mbz = getIntent().getStringExtra("free_wifi_passowrd");
    this.mfM = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    d.a(this.ssid, 4, getIntent());
    w.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "Comes from webview, do auth");
    GMTrace.o(7181722189824L, 53508);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7181990625280L, 53510);
    super.onDestroy();
    GMTrace.o(7181990625280L, 53510);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */