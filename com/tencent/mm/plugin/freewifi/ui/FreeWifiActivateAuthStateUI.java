package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.g.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public class FreeWifiActivateAuthStateUI
  extends FreeWifiActivateStateUI
{
  public FreeWifiActivateAuthStateUI()
  {
    GMTrace.i(7207894646784L, 53703);
    GMTrace.o(7207894646784L, 53703);
  }
  
  protected final void MH()
  {
    GMTrace.i(7208163082240L, 53705);
    super.MH();
    this.mfR = ((Button)findViewById(R.h.bOI));
    this.mfR.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7203599679488L, 53671);
        paramAnonymousView = FreeWifiActivateAuthStateUI.this.getString(R.l.eaY);
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramAnonymousView);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("show_bottom", false);
        com.tencent.mm.bi.d.b(FreeWifiActivateAuthStateUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(7203599679488L, 53671);
      }
    });
    oC(R.l.ebo);
    GMTrace.o(7208163082240L, 53705);
  }
  
  protected final void VX()
  {
    GMTrace.i(7208565735424L, 53708);
    j.aAj().a(this.ssid, new g.b()
    {
      public final void bb(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(7188701511680L, 53560);
        String str = com.tencent.mm.plugin.freewifi.model.d.azT();
        w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "get ap auth data : %s, url : %s, mac : %s", new Object[] { paramAnonymousString, FreeWifiActivateAuthStateUI.this.meB, str });
        if (!bg.mZ(paramAnonymousString)) {
          new com.tencent.mm.plugin.freewifi.d.a(FreeWifiActivateAuthStateUI.this.meB, FreeWifiActivateAuthStateUI.this.ssid, str, FreeWifiActivateAuthStateUI.this.mfS, paramAnonymousString, "", paramAnonymousInt, m.B(FreeWifiActivateAuthStateUI.this.getIntent())).b(new e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
            {
              GMTrace.i(7162663272448L, 53366);
              w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
              FreeWifiActivateAuthStateUI.this.mfU = false;
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
              {
                paramAnonymous2String = ((com.tencent.mm.plugin.freewifi.d.a)paramAnonymous2k).aAm();
                w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "authUrl : %s", new Object[] { paramAnonymous2String });
                j.aAj().a(FreeWifiActivateAuthStateUI.this.ssid, paramAnonymous2String, FreeWifiActivateAuthStateUI.this.getIntent());
                GMTrace.o(7162663272448L, 53366);
                return;
              }
              if (paramAnonymous2Int2 == 63522)
              {
                com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateAuthStateUI.this.ssid, 63522, FreeWifiActivateAuthStateUI.this.getIntent());
                GMTrace.o(7162663272448L, 53366);
                return;
              }
              com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateAuthStateUI.this.ssid, 3, FreeWifiActivateAuthStateUI.this.getIntent());
              GMTrace.o(7162663272448L, 53366);
            }
          });
        }
        GMTrace.o(7188701511680L, 53560);
      }
    }, this.fjU, getIntent());
    GMTrace.o(7208565735424L, 53708);
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7208431517696L, 53707);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (com.tencent.mm.plugin.freewifi.model.d.xS(this.ssid)))
    {
      aAN();
      aAP();
    }
    GMTrace.o(7208431517696L, 53707);
  }
  
  protected final void aAI()
  {
    GMTrace.i(7208699953152L, 53709);
    aAM();
    com.tencent.mm.plugin.freewifi.model.d.xT(this.ssid);
    GMTrace.o(7208699953152L, 53709);
  }
  
  protected final int aAJ()
  {
    GMTrace.i(7208834170880L, 53710);
    j.aAd();
    int i = com.tencent.mm.plugin.freewifi.model.d.xR(this.ssid);
    GMTrace.o(7208834170880L, 53710);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7208028864512L, 53704);
    super.onCreate(paramBundle);
    if (this.cyK != 2) {
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 1, getIntent());
    }
    w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "now it is from qrcode, try to auth");
    GMTrace.o(7208028864512L, 53704);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7208297299968L, 53706);
    super.onDestroy();
    GMTrace.o(7208297299968L, 53706);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiActivateAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */