package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

@Deprecated
public class FreewifiActivateWeChatNoAuthStateUI
  extends FreeWifiActivateNoAuthStateUI
{
  private int fzv;
  private String mij;
  private String mik;
  
  public FreewifiActivateWeChatNoAuthStateUI()
  {
    GMTrace.i(7174608650240L, 53455);
    GMTrace.o(7174608650240L, 53455);
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7174877085696L, 53457);
    w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.xS(this.ssid)) && (this.mfU))
    {
      aAN();
      this.mfU = false;
      this.mij = d.azT();
      this.mik = d.azV();
      this.fzv = d.azU();
      w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "now has connect the ap, check from server rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(this.fzv), this.mij, this.mik });
      new a(this.meB, this.mij, this.mik, this.fzv, this.fjU, m.B(getIntent())).b(new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7176085045248L, 53466);
          ap.wT().b(640, this);
          w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "check ap ok");
            d.a(FreewifiActivateWeChatNoAuthStateUI.this.ssid, 2, FreewifiActivateWeChatNoAuthStateUI.this.getIntent());
            GMTrace.o(7176085045248L, 53466);
            return;
          }
          w.e("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "check ap failed ： rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(FreewifiActivateWeChatNoAuthStateUI.a(FreewifiActivateWeChatNoAuthStateUI.this)), FreewifiActivateWeChatNoAuthStateUI.b(FreewifiActivateWeChatNoAuthStateUI.this), FreewifiActivateWeChatNoAuthStateUI.c(FreewifiActivateWeChatNoAuthStateUI.this) });
          FreewifiActivateWeChatNoAuthStateUI.this.mT(63522);
          d.xU(FreewifiActivateWeChatNoAuthStateUI.c(FreewifiActivateWeChatNoAuthStateUI.this));
          GMTrace.o(7176085045248L, 53466);
        }
      });
    }
    GMTrace.o(7174877085696L, 53457);
  }
  
  protected final int aAJ()
  {
    GMTrace.i(7175145521152L, 53459);
    j.aAd();
    int i = d.xR(this.ssid);
    w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "get connect state = %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      GMTrace.o(7175145521152L, 53459);
      return 63522;
    }
    GMTrace.o(7175145521152L, 53459);
    return i;
  }
  
  protected final String aAK()
  {
    GMTrace.i(7174742867968L, 53456);
    String str = getString(R.l.ebo);
    GMTrace.o(7174742867968L, 53456);
    return str;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7175011303424L, 53458);
    super.onDestroy();
    GMTrace.o(7175011303424L, 53458);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreewifiActivateWeChatNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */