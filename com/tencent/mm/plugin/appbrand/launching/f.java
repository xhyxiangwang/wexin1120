package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.plugin.appbrand.appcache.i;
import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.n.e;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.protocal.c.ajv;
import com.tencent.mm.protocal.c.ajw;
import com.tencent.mm.protocal.c.ajx;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.protocal.c.bsj;
import com.tencent.mm.protocal.c.bsy;
import com.tencent.mm.protocal.c.btb;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Locale;

final class f
  extends a<ajx>
{
  final com.tencent.mm.ac.b gMC;
  final String irM;
  volatile h jgk;
  public volatile boolean jgl;
  
  f(String paramString1, bsb parambsb, String paramString2, int paramInt)
  {
    this(paramString1, false, parambsb, null, null, paramString2, paramInt);
    GMTrace.i(19679003279360L, 146620);
    GMTrace.o(19679003279360L, 146620);
  }
  
  f(String paramString1, boolean paramBoolean, bsb parambsb, bth parambth, btb parambtb, String paramString2, int paramInt)
  {
    GMTrace.i(19678869061632L, 146619);
    this.jgl = false;
    this.irM = paramString2;
    paramString2 = new ajw();
    paramString2.mDD = paramString1;
    paramString2.ueR = parambsb;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      paramString2.tYq = i;
      paramString2.ueU = parambth;
      paramString2.ueV = parambtb;
      paramString1 = new bsy();
      paramString1.ugy = paramInt;
      if (paramInt > 0)
      {
        parambsb = new com.tencent.mm.plugin.appbrand.appcache.h();
        parambsb.field_key = "@LibraryAppId";
        parambsb.field_version = paramInt;
        if (com.tencent.mm.plugin.appbrand.app.f.Sn().b(parambsb, new String[] { "key", "version" }))
        {
          paramString1.tvf = ((int)parambsb.field_updateTime);
          paramString1.uHI = parambsb.field_scene;
        }
      }
      paramString2.ueT = paramString1;
      paramString1 = new b.a();
      paramString1.hlW = 1122;
      paramString1.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
      paramString1.hlX = paramString2;
      paramString1.hlY = new ajx();
      paramString1 = paramString1.DA();
      this.gMC = paramString1;
      this.gMC = paramString1;
      GMTrace.o(19678869061632L, 146619);
      return;
    }
  }
  
  private int XZ()
  {
    GMTrace.i(15441749606400L, 115050);
    int i = ((ajw)this.gMC.hlU.hmc).ueR.ude;
    GMTrace.o(15441749606400L, 115050);
    return i;
  }
  
  private boolean Ya()
  {
    GMTrace.i(17328582426624L, 129108);
    if (((ajw)this.gMC.hlU.hmc).ueR.ugw > 0)
    {
      GMTrace.o(17328582426624L, 129108);
      return true;
    }
    GMTrace.o(17328582426624L, 129108);
    return false;
  }
  
  private String getAppId()
  {
    GMTrace.i(15441615388672L, 115049);
    String str = ((ajw)this.gMC.hlU.hmc).mDD;
    GMTrace.o(15441615388672L, 115049);
    return str;
  }
  
  final void Yb()
  {
    GMTrace.i(15441883824128L, 115051);
    com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15439870558208L, 115036);
        f.this.jgl = false;
        f.this.Dy();
        GMTrace.o(15439870558208L, 115036);
      }
    });
    GMTrace.o(15441883824128L, 115051);
  }
  
  void a(int paramInt1, int paramInt2, String paramString, ajx paramajx)
  {
    GMTrace.i(15442018041856L, 115052);
    if (paramajx == null) {
      localObject1 = "NULL";
    }
    Object localObject2;
    String str;
    for (;;)
    {
      w.i("MicroMsg.CgiLaunchWxaApp", "onCgiBack, errType %d, errCode %d, errMsg %s, req[appId %s, bg %B, sync %B, libVersion %d], resp[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, getAppId(), Boolean.valueOf(Ya()), Boolean.valueOf(this.jgl), Integer.valueOf(((ajw)this.gMC.hlU.hmc).ueT.ugy), localObject1 });
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramajx == null)) {
        break label887;
      }
      localObject2 = com.tencent.mm.plugin.appbrand.app.f.Sb();
      str = getAppId();
      if ((!bg.mZ(str)) && (paramajx != null)) {
        break;
      }
      paramString = null;
      this.jgk = paramString;
      if (paramajx.ueW == null) {
        break label937;
      }
      if (paramajx.ueW.ueP) {
        com.tencent.mm.plugin.appbrand.app.f.Sf().a(p.pd(getAppId()), XZ(), Ya(), ((ajw)this.gMC.hlU.hmc).ueR.ttY, 1, this.irM);
      }
      if (this.jgl) {
        break label937;
      }
      paramString = AppBrandLaunchErrorAction.CREATOR;
      com.tencent.mm.plugin.appbrand.ipc.d.a(AppBrandLaunchErrorAction.a.a(getAppId(), XZ(), this.jgk));
      GMTrace.o(15442018041856L, 115052);
      return;
      if (paramajx.ueX == null)
      {
        localObject1 = "NULL_API_INFO";
        if (paramajx.ueW == null) {
          localObject1 = (String)localObject1 + " || NULL_LAUNCH";
        }
      }
      else
      {
        localObject2 = new StringBuilder("api_info~ fg:");
        if (paramajx.ueX.tId == null) {}
        for (localObject1 = "NULL";; localObject1 = Integer.valueOf(paramajx.ueX.tId.toK.length))
        {
          str = localObject1;
          localObject2 = str;
          if (paramajx.ueX.tIe != null)
          {
            localObject1 = str;
            if (paramajx.ueX.tIe.size() > 0) {
              localObject1 = str + " | bg:" + ((com.tencent.mm.bl.b)paramajx.ueX.tIe.get(0)).toK.length;
            }
            localObject2 = localObject1;
            if (paramajx.ueX.tIe.size() > 1) {
              localObject2 = (String)localObject1 + " | suspend:" + ((com.tencent.mm.bl.b)paramajx.ueX.tIe.get(1)).toK.length;
            }
          }
          localObject1 = (String)localObject2 + "~";
          break;
        }
      }
      localObject1 = (String)localObject1 + " || launch " + paramajx.ueW.tsx;
    }
    Object localObject1 = new h();
    ((h)localObject1).field_appId = str;
    boolean bool2;
    label603:
    label680:
    boolean bool3;
    if (!((g)localObject2).a((h)localObject1, new String[] { "appId" }))
    {
      bool2 = true;
      boolean bool1 = false;
      if (!e.a(((h)localObject1).field_launchAction, paramajx.ueW))
      {
        ((h)localObject1).field_launchAction = paramajx.ueW;
        bool1 = true;
      }
      if (!e.a(((h)localObject1).field_jsapiInfo, paramajx.ueX))
      {
        ((h)localObject1).field_jsapiInfo = paramajx.ueX;
        bool1 = true;
      }
      if (paramajx.ueY != null) {
        break label856;
      }
      paramString = new bsj();
      paramajx.ueY = paramString;
      if (!e.a(((h)localObject1).field_hostInfo, paramajx.ueY))
      {
        ((h)localObject1).field_hostInfo = paramajx.ueY;
        bool1 = true;
      }
      bool3 = bool1;
      if (paramajx.ufa != null)
      {
        bool3 = bool1;
        if (!e.a(((h)localObject1).field_actionsheetInfo, paramajx.ufa))
        {
          ((h)localObject1).field_actionsheetInfo = paramajx.ufa;
          bool3 = true;
        }
      }
      w.i("MicroMsg.LaunchWxaAppCacheStorage", "flush resp, appId %s, apply %B, insert %B", new Object[] { str, Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
      if (bool3)
      {
        if (!bool2) {
          break label865;
        }
        ((g)localObject2).a((h)localObject1, false);
      }
    }
    for (;;)
    {
      k.a(paramajx.ueZ);
      if (bool3) {
        ((g)localObject2).a((h)localObject1, new String[] { "appId" });
      }
      paramString = (String)localObject1;
      break;
      bool2 = false;
      break label603;
      label856:
      paramString = paramajx.ueY;
      break label680;
      label865:
      ((g)localObject2).b((h)localObject1, false, new String[] { "appId" });
    }
    label887:
    if (!Ya()) {
      l.qL(l.e(p.i.iyr, new Object[] { String.format(Locale.US, " (%d,%d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) }));
    }
    label937:
    GMTrace.o(15442018041856L, 115052);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */