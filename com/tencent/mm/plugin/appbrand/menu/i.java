package com.tencent.mm.plugin.appbrand.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;

final class i
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  i()
  {
    super(l.jil - 1);
    GMTrace.i(15554358280192L, 115889);
    GMTrace.o(15554358280192L, 115889);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(17666274230272L, 131624);
    if (b.bMv()) {
      paramm.e(this.jix, paramContext.getString(p.i.iyF));
    }
    GMTrace.o(17666274230272L, 131624);
  }
  
  @SuppressLint({"DefaultLocale"})
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15554626715648L, 115891);
    paramString = com.tencent.mm.plugin.appbrand.a.nx(paramString);
    if (paramString.iJb.iCx == 0)
    {
      paramk = new StringBuilder().append("");
      int i = paramString.iJb.iCy;
      if (paramString.iJb.iCA)
      {
        paramAppBrandPageView = " [ LOCAL ]";
        paramAppBrandPageView = String.format("公共库版本: %d%s\n", new Object[] { Integer.valueOf(i), paramAppBrandPageView });
        label89:
        if (paramString.iJa.iCx != 0) {
          break label207;
        }
      }
    }
    label207:
    for (paramAppBrandPageView = paramAppBrandPageView + String.format("正式包版本: %d", new Object[] { Integer.valueOf(paramString.iJa.iCy) });; paramAppBrandPageView = paramAppBrandPageView + String.format(new StringBuilder().append(com.tencent.mm.plugin.appbrand.appcache.a.hJ(paramString.iJa.iCx)).append(" 更新时间: %s").toString(), new Object[] { bg.eF(paramString.iJa.iCz) }))
    {
      Toast.makeText(paramContext, paramAppBrandPageView, 1).show();
      GMTrace.o(15554626715648L, 115891);
      return;
      paramAppBrandPageView = "";
      break;
      paramAppBrandPageView = "" + String.format("测试版公共库更新时间: %s\n", new Object[] { bg.eF(paramString.iJb.iCz) });
      break label89;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */