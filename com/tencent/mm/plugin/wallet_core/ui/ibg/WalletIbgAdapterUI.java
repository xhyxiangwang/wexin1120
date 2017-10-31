package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.wallet_core.b.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

@com.tencent.mm.ui.base.a(7)
public class WalletIbgAdapterUI
  extends WalletBaseUI
{
  public WalletIbgAdapterUI()
  {
    GMTrace.i(6958786543616L, 51847);
    GMTrace.o(6958786543616L, 51847);
  }
  
  private void JO(String paramString)
  {
    GMTrace.i(6959457632256L, 51852);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6959457632256L, 51852);
  }
  
  private void bye()
  {
    GMTrace.i(6959591849984L, 51853);
    ap.AS();
    c.xi().a(com.tencent.mm.storage.w.a.uYl, Boolean.valueOf(true));
    h.a(this, false, getString(R.l.fbC), "", getString(R.l.fbx), getString(R.l.fbw), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6958383890432L, 51844);
        com.tencent.mm.pluginsdk.model.w.a.dM(WalletIbgAdapterUI.this);
        Toast.makeText(WalletIbgAdapterUI.this, WalletIbgAdapterUI.this.getString(R.l.fby), 1).show();
        WalletIbgAdapterUI.this.finish();
        GMTrace.o(6958383890432L, 51844);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6958652325888L, 51846);
        WalletIbgAdapterUI.this.finish();
        GMTrace.o(6958652325888L, 51846);
      }
    });
    GMTrace.o(6959591849984L, 51853);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6959189196800L, 51850);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof b)))
    {
      paramInt1 = ((b)paramk).rLd;
      paramString = ((b)paramk).jumpUrl;
      w.i("MicroMsg.WalletH5AdapterUI", "hy: get success! url is: %s, download x5 = %b", new Object[] { paramString, Integer.valueOf(paramInt1) });
      if (paramInt1 == 1)
      {
        paramInt1 = com.tencent.mm.pluginsdk.model.w.a.bGr();
        w.i("MicroMsg.WalletH5AdapterUI", "now status = %d", new Object[] { Integer.valueOf(paramInt1) });
        switch (paramInt1)
        {
        default: 
          bye();
        case 1: 
        case 4: 
          for (paramInt1 = 0; paramInt1 != 0; paramInt1 = 1)
          {
            JO(paramString);
            finish();
            GMTrace.o(6959189196800L, 51850);
            return false;
          }
        }
        ap.AS();
        if (((Boolean)c.xi().get(com.tencent.mm.storage.w.a.uYl, Boolean.valueOf(false))).booleanValue())
        {
          Toast.makeText(this, getString(R.l.fbz), 1).show();
          com.tencent.mm.pluginsdk.model.w.a.dM(this);
          finish();
        }
        for (;;)
        {
          paramInt1 = 0;
          break;
          bye();
        }
      }
      JO(paramString);
      finish();
      GMTrace.o(6959189196800L, 51850);
      return false;
    }
    com.tencent.mm.wallet_core.a.c(this, null, 0);
    GMTrace.o(6959189196800L, 51850);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6959726067712L, 51854);
    GMTrace.o(6959726067712L, 51854);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6958920761344L, 51848);
    super.onCreate(paramBundle);
    sh(4);
    this.xhw.hz(1564);
    r(new b());
    GMTrace.o(6958920761344L, 51848);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6959323414528L, 51851);
    this.xhw.hA(1564);
    super.onDestroy();
    GMTrace.o(6959323414528L, 51851);
  }
  
  public void onResume()
  {
    GMTrace.i(6959054979072L, 51849);
    super.onResume();
    GMTrace.o(6959054979072L, 51849);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/ibg/WalletIbgAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */