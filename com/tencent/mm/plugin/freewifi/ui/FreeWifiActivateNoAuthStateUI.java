package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public abstract class FreeWifiActivateNoAuthStateUI
  extends FreeWifiActivateStateUI
{
  private String mbz;
  private int mfL;
  private boolean mfM;
  
  public FreeWifiActivateNoAuthStateUI()
  {
    GMTrace.i(7212726484992L, 53739);
    GMTrace.o(7212726484992L, 53739);
  }
  
  protected final void MH()
  {
    GMTrace.i(7212994920448L, 53741);
    super.MH();
    this.mfR.setVisibility(0);
    rV(aAK());
    GMTrace.o(7212994920448L, 53741);
  }
  
  protected final void VX()
  {
    GMTrace.i(7213397573632L, 53744);
    aAI();
    GMTrace.o(7213397573632L, 53744);
  }
  
  public void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7213263355904L, 53743);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.xS(this.ssid)))
    {
      aAN();
      this.mfU = false;
      d.a(this.ssid, 2, getIntent());
    }
    GMTrace.o(7213263355904L, 53743);
  }
  
  protected final void aAI()
  {
    GMTrace.i(7213531791360L, 53745);
    if (this.mfU)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "it is authing now");
      GMTrace.o(7213531791360L, 53745);
      return;
    }
    this.mfU = true;
    aAM();
    d.d(this.ssid, this.mbz, this.mfL, this.mfM);
    GMTrace.o(7213531791360L, 53745);
  }
  
  protected int aAJ()
  {
    GMTrace.i(7213666009088L, 53746);
    if (d.xS(this.ssid))
    {
      d.a(this.ssid, 2, getIntent());
      GMTrace.o(7213666009088L, 53746);
      return 2;
    }
    GMTrace.o(7213666009088L, 53746);
    return 1;
  }
  
  protected abstract String aAK();
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7212860702720L, 53740);
    this.mfL = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.mbz = getIntent().getStringExtra("free_wifi_passowrd");
    this.mfM = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    d.a(this.ssid, 1, getIntent());
    w.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "Comes from webview, do auth");
    GMTrace.o(7212860702720L, 53740);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7213129138176L, 53742);
    super.onDestroy();
    GMTrace.o(7213129138176L, 53742);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiActivateNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */