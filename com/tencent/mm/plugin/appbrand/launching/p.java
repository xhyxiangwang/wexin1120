package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.q.2;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Locale;

final class p
  extends k<AppBrandSysConfig>
{
  private String appId;
  private final String iIy;
  private final int iQS;
  private final int jgx;
  private String username;
  
  p(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    GMTrace.i(19675647836160L, 146595);
    this.username = paramString1;
    this.appId = paramString2;
    this.iQS = paramInt1;
    this.jgx = paramInt2;
    this.iIy = paramString3;
    GMTrace.o(19675647836160L, 146595);
  }
  
  public final AppBrandSysConfig Yh()
  {
    GMTrace.i(10151289421824L, 75633);
    if (!bg.mZ(this.username)) {
      this.appId = com.tencent.mm.plugin.appbrand.config.p.pb(this.username);
    }
    for (boolean bool1 = bg.mZ(this.appId);; bool1 = false)
    {
      Object localObject1;
      Object localObject2;
      if (!bool1)
      {
        localObject1 = this.appId;
        if (this.iQS == 0)
        {
          localObject2 = f.Sh().a((String)localObject1, 0, new String[] { "version", "pkgPath", "versionMd5" });
          if (localObject2 == null)
          {
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, get null manifest record by appId %s, forceSync", new Object[] { localObject1 });
            bool1 = true;
          }
        }
      }
      for (;;)
      {
        label140:
        int i;
        if (!bg.mZ(this.appId))
        {
          localObject1 = this.appId;
          localObject1 = q.a((String)localObject1, bool1, new q.2((String)localObject1));
          if (((Pair)localObject1).first == null)
          {
            i = p.i.iyp;
            if (((Pair)localObject1).second != null) {
              break label673;
            }
          }
        }
        label424:
        label514:
        label519:
        label524:
        label673:
        for (localObject2 = "";; localObject2 = String.format(Locale.US, "(%d,%d)", new Object[] { Integer.valueOf(((a.a)((Pair)localObject1).second).errType), Integer.valueOf(((a.a)((Pair)localObject1).second).errCode) }))
        {
          l.qL(l.e(i, new Object[] { localObject2 }));
          com.tencent.mm.plugin.appbrand.report.a.x("", 7, this.iQS + 1);
          if ((!bool1) && (((Pair)localObject1).first != null))
          {
            if (bg.mZ(this.username)) {
              this.username = ((AppBrandSysConfig)((Pair)localObject1).first).ftu;
            }
            q.pj(this.username);
          }
          if ((!bool1) || (((Pair)localObject1).second == null) || (((a.a)((Pair)localObject1).second).errType != 2)) {
            break label724;
          }
          l.qL(l.e(p.i.iyp, new Object[] { String.format(Locale.US, "(%d,%d)", new Object[] { Integer.valueOf(((a.a)((Pair)localObject1).second).errType), Integer.valueOf(((a.a)((Pair)localObject1).second).errCode) }) }));
          GMTrace.o(10151289421824L, 75633);
          return null;
          if ((this.jgx > 0) && (this.jgx > ((r)localObject2).field_version))
          {
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, preferVersion[%d], localVersion[%d], forceSync", new Object[] { Integer.valueOf(this.jgx), Integer.valueOf(((r)localObject2).field_version) });
            bool1 = true;
            break;
          }
          if ((e.aZ(((r)localObject2).field_pkgPath)) && (((r)localObject2).field_versionMd5.equals(g.bg(((r)localObject2).field_pkgPath))))
          {
            bool1 = true;
            if (!bool1) {
              b.deleteFile(((r)localObject2).field_pkgPath);
            }
            if (bg.mZ(this.iIy)) {
              break label524;
            }
            if ((!bool1) || (!com.tencent.mm.plugin.appbrand.appcache.a.az(((r)localObject2).field_pkgPath, this.iIy))) {
              break label514;
            }
          }
          for (boolean bool2 = true;; bool2 = false)
          {
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, latestPkgExists[%B], enterPath[%s], pathAccessible[%B]", new Object[] { Boolean.valueOf(bool1), this.iIy, Boolean.valueOf(bool2) });
            if (bool2) {
              break label519;
            }
            bool1 = true;
            break;
            bool1 = false;
            break label424;
          }
          bool1 = false;
          break;
          if (bool1) {
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "local available pkg version[%d] LATEST, no need force update", new Object[] { Integer.valueOf(((r)localObject2).field_version) });
          }
          for (;;)
          {
            bool1 = false;
            break;
            localObject1 = m.nY((String)localObject1);
            if (localObject1 == null)
            {
              w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, no local available pkg, force update");
              bool1 = true;
              break;
            }
            if ((this.jgx > 0) && (this.jgx > ((WxaPkgWrappingInfo)localObject1).iCy))
            {
              w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, local available pkg version[%d], preferred version[%d], force update", new Object[] { Integer.valueOf(((WxaPkgWrappingInfo)localObject1).iCy), Integer.valueOf(this.jgx) });
              bool1 = true;
              break;
            }
            w.i("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "forceUpdateAttrsByPkgState, local available pkg version[%d], no need force update", new Object[] { Integer.valueOf(((WxaPkgWrappingInfo)localObject1).iCy) });
          }
          localObject1 = q.G(this.username, bool1);
          break label140;
        }
        label724:
        localObject1 = (AppBrandSysConfig)((Pair)localObject1).first;
        GMTrace.o(10151289421824L, 75633);
        return (AppBrandSysConfig)localObject1;
      }
    }
  }
  
  final String getTag()
  {
    GMTrace.i(17334085353472L, 129149);
    GMTrace.o(17334085353472L, 129149);
    return "MicroMsg.AppBrand.PrepareStepGetWxaAttrs";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */