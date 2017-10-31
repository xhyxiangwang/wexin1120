package com.tencent.mm.plugin.appbrand.launching;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.j.a;
import com.tencent.mm.vending.j.c;
import java.util.concurrent.Future;

public class e
{
  public static final c<AppBrandSysConfig, AppBrandLaunchErrorAction> jgg;
  public final String appId;
  final int fNV;
  final AppBrandLaunchReferrer iIA;
  final String iIy;
  public final int iQS;
  final int jge;
  final String jgf;
  
  static
  {
    GMTrace.i(17327911337984L, 129103);
    jgg = a.u(null, null);
    GMTrace.o(17327911337984L, 129103);
  }
  
  public e(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString3)
  {
    GMTrace.i(19679137497088L, 146621);
    this.appId = paramString1;
    this.iQS = paramInt1;
    this.fNV = paramInt2;
    this.jge = paramInt3;
    this.iIy = paramString2;
    this.iIA = paramAppBrandLaunchReferrer;
    this.jgf = paramString3;
    GMTrace.o(19679137497088L, 146621);
  }
  
  public static void XY()
  {
    GMTrace.i(17327508684800L, 129100);
    GMTrace.o(17327508684800L, 129100);
  }
  
  public void XX()
  {
    GMTrace.i(10158939832320L, 75690);
    GMTrace.o(10158939832320L, 75690);
  }
  
  public void a(AppBrandSysConfig paramAppBrandSysConfig, AppBrandLaunchErrorAction paramAppBrandLaunchErrorAction)
  {
    GMTrace.i(17327642902528L, 129101);
    GMTrace.o(17327642902528L, 129101);
  }
  
  public final void a(c<AppBrandSysConfig, AppBrandLaunchErrorAction> paramc)
  {
    GMTrace.i(17327777120256L, 129102);
    a((AppBrandSysConfig)paramc.get(0), (AppBrandLaunchErrorAction)paramc.get(1));
    paramc = (AppBrandSysConfig)paramc.get(0);
    String str = this.appId;
    int i = this.iQS;
    int j = this.jge;
    if (paramc != null) {}
    for (boolean bool = true;; bool = false)
    {
      LaunchBroadCast.a(str, i, j, bool);
      GMTrace.o(17327777120256L, 129102);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */