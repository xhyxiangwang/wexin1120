package com.tencent.mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;

class j
  implements MMActivity.a
{
  final String appId;
  final int fEJ;
  
  j(String paramString)
  {
    GMTrace.i(10157731872768L, 75681);
    this.fEJ = (j.class.hashCode() & 0xFFFF);
    this.appId = paramString;
    GMTrace.o(10157731872768L, 75681);
  }
  
  void XU()
  {
    GMTrace.i(10157463437312L, 75679);
    GMTrace.o(10157463437312L, 75679);
  }
  
  void XV()
  {
    GMTrace.i(10157597655040L, 75680);
    Intent localIntent = new Intent().putExtra("rawUrl", m.R(this.appId, 2)).putExtra("showShare", false).putExtra("show_bottom", false).putExtra("isWebwx", false).addFlags(268435456);
    com.tencent.mm.bi.d.b(ab.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    g.paX.a(366L, 8L, 1L, false);
    GMTrace.o(10157597655040L, 75680);
  }
  
  final void Yc()
  {
    GMTrace.i(10158000308224L, 75683);
    if (com.tencent.mm.compatible.util.d.et(17))
    {
      onReady();
      GMTrace.o(10158000308224L, 75683);
      return;
    }
    XV();
    GMTrace.o(10158000308224L, 75683);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10158134525952L, 75684);
    if (this.fEJ != paramInt1)
    {
      GMTrace.o(10158134525952L, 75684);
      return;
    }
    if (paramInt2 == -1)
    {
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs download ok");
      onReady();
      GMTrace.o(10158134525952L, 75684);
      return;
    }
    if (paramInt2 == 2)
    {
      w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs cancel loading, download in background");
      XU();
      GMTrace.o(10158134525952L, 75684);
      return;
    }
    w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs download unknown error, resultCode = %d, apiLevel = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(Build.VERSION.SDK_INT) });
    Yc();
    GMTrace.o(10158134525952L, 75684);
  }
  
  void onReady()
  {
    GMTrace.i(10157329219584L, 75678);
    GMTrace.o(10157329219584L, 75678);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */