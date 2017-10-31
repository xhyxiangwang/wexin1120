package com.tencent.mm.plugin.appbrand.dynamic.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.n.e;
import com.tencent.mm.plugin.appbrand.widget.m;
import com.tencent.mm.plugin.appbrand.widget.n;
import com.tencent.mm.protocal.c.ajy;
import com.tencent.mm.protocal.c.ajz;
import com.tencent.mm.protocal.c.brw;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ac.a<ajz>
{
  private int fBH;
  public final b gMC;
  public n iMJ;
  private int iMr;
  
  public a(String paramString, boolean paramBoolean, bti parambti)
  {
    GMTrace.i(17757005414400L, 132300);
    ajy localajy = new ajy();
    localajy.mDD = paramString;
    localajy.ufb = parambti;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localajy.tYq = i;
      paramString = new b.a();
      paramString.hlW = 1181;
      paramString.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxawidget";
      paramString.hlX = localajy;
      paramString.hlY = new ajz();
      paramString = paramString.DA();
      this.gMC = paramString;
      this.gMC = paramString;
      this.iMr = parambti.uHV;
      this.fBH = com.tencent.mm.plugin.appbrand.dynamic.j.a.bo(this.iMr, parambti.ude);
      GMTrace.o(17757005414400L, 132300);
      return;
    }
  }
  
  private String getAppId()
  {
    GMTrace.i(17757139632128L, 132301);
    String str = ((ajy)this.gMC.hlU.hmc).mDD;
    GMTrace.o(17757139632128L, 132301);
    return str;
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, ajz paramajz)
  {
    GMTrace.i(17757273849856L, 132302);
    w.i("MicroMsg.CgiLaunchWxaWidget", "onCgiBack, errType %d, errCode %d, errMsg %s, req appId %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, getAppId() });
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramajz != null))
    {
      str = getAppId();
      Object localObject = ((com.tencent.mm.plugin.appbrand.widget.a.a)h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sc();
      paramInt1 = this.fBH;
      paramInt2 = this.iMr;
      if ((bg.mZ(str)) || (paramajz == null))
      {
        paramString = null;
        this.iMJ = paramString;
        if (paramajz.ufd == null) {
          break label525;
        }
        paramString = ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().V(str, this.fBH);
        localObject = new bss();
        ((bss)localObject).uHD = paramString;
        ((bss)localObject).tAS = paramajz.ufd.tAS;
        if (this.fBH == 10102)
        {
          ((bss)localObject).uHC = paramajz.ufd.uGU;
          ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, (bss)localObject, this.fBH);
          GMTrace.o(17757273849856L, 132302);
        }
      }
      else
      {
        paramString = new n();
        paramString.field_appIdHash = str.hashCode();
        paramString.field_appId = str;
        paramString.field_pkgType = paramInt1;
        paramString.field_widgetType = paramInt2;
        if (!((m)localObject).a(paramString, new String[] { "appId", "pkgType", "widgetType" }))
        {
          paramInt2 = 1;
          label287:
          paramInt1 = 0;
          if (!e.a(paramString.field_launchAction, paramajz.ufc))
          {
            paramString.field_launchAction = paramajz.ufc;
            paramInt1 = 1;
          }
          if (!e.a(paramString.field_jsApiInfo, paramajz.ueX))
          {
            paramString.field_jsApiInfo = paramajz.ueX;
            paramInt1 = 1;
          }
          if (!e.a(paramString.field_versionInfo, paramajz.ufd))
          {
            paramString.field_versionInfo = paramajz.ufd;
            paramInt1 = 1;
          }
          if (!e.a(paramString.field_widgetSetting, paramajz.ufe))
          {
            paramString.field_widgetSetting = paramajz.ufe;
            paramInt1 = 1;
          }
          if (paramInt1 != 0)
          {
            if (paramInt2 == 0) {
              break label447;
            }
            ((m)localObject).a(paramString, false);
          }
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            ((m)localObject).a(paramString, new String[] { "appId", "pkgType", "widgetType" });
          }
          break;
          paramInt2 = 0;
          break label287;
          label447:
          ((m)localObject).a(paramString, false, new String[] { "appId", "pkgType", "widgetType" });
        }
      }
      if (this.fBH == 10002)
      {
        ((bss)localObject).uHC = paramajz.ufd.uGT;
        ((com.tencent.mm.plugin.appbrand.a.a)h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, (bss)localObject, this.fBH);
      }
      label525:
      GMTrace.o(17757273849856L, 132302);
      return;
    }
    paramajz = ((com.tencent.mm.plugin.appbrand.widget.a.a)h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sc();
    String str = getAppId();
    paramInt1 = this.fBH;
    paramInt2 = this.iMr;
    if (!bg.mZ(str))
    {
      paramString = new n();
      paramString.field_appIdHash = str.hashCode();
      paramString.field_appId = str;
      paramString.field_pkgType = paramInt1;
      paramString.field_widgetType = paramInt2;
      if (!paramajz.a(paramString, new String[] { "appId", "pkgType", "widgetType" })) {}
    }
    for (;;)
    {
      this.iMJ = paramString;
      GMTrace.o(17757273849856L, 132302);
      return;
      paramString = null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */