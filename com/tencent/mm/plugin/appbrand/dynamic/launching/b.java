package com.tencent.mm.plugin.appbrand.dynamic.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.dynamic.f.a.1;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.widget.m;
import com.tencent.mm.plugin.appbrand.widget.n;
import com.tencent.mm.protocal.c.ajz;
import com.tencent.mm.protocal.c.brv;
import com.tencent.mm.protocal.c.brw;
import com.tencent.mm.protocal.c.bti;
import java.util.concurrent.Callable;

public final class b
  implements Callable<n>
{
  final String appId;
  final int fBH;
  final int fNP;
  final int iMr;
  final int scene;
  
  public b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18298305511424L, 136333);
    this.appId = paramString;
    this.fBH = paramInt1;
    this.fNP = paramInt2;
    this.scene = paramInt3;
    this.iMr = paramInt4;
    GMTrace.o(18298305511424L, 136333);
  }
  
  public final n UX()
  {
    GMTrace.i(19908112941056L, 148327);
    Object localObject1 = new n();
    ((n)localObject1).field_appId = this.appId;
    Object localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a.a)h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sc();
    if (localObject2 == null)
    {
      GMTrace.o(19908112941056L, 148327);
      return null;
    }
    bti localbti = new bti();
    localbti.ude = com.tencent.mm.plugin.appbrand.dynamic.j.a.iu(this.fBH);
    localbti.tAS = this.fNP;
    localbti.uHV = this.iMr;
    localbti.ttY = this.scene;
    localbti.uHW = 0;
    if (((m)localObject2).a((n)localObject1, new String[] { "appId", "pkgType", "widgetType" })) {
      if (((n)localObject1).field_jsApiInfo == null) {
        break label246;
      }
    }
    label246:
    for (int i = 1; (i == 0) || (((n)localObject1).field_launchAction == null) || (1 != ((n)localObject1).field_launchAction.tsx) || (((n)localObject1).field_versionInfo == null) || (((n)localObject1).field_versionInfo.tAS < this.fNP); i = 0)
    {
      localObject1 = new com.tencent.mm.plugin.appbrand.dynamic.f.a(this.appId, true, localbti);
      localObject2 = c.b(((com.tencent.mm.plugin.appbrand.dynamic.f.a)localObject1).gMC);
      ((com.tencent.mm.plugin.appbrand.dynamic.f.a)localObject1).a(((a.a)localObject2).errType, ((a.a)localObject2).errCode, ((a.a)localObject2).ftU, (ajz)((a.a)localObject2).fPm);
      localObject1 = ((com.tencent.mm.plugin.appbrand.dynamic.f.a)localObject1).iMJ;
      GMTrace.o(19908112941056L, 148327);
      return (n)localObject1;
    }
    com.tencent.mm.bu.a.post(new a.1(new com.tencent.mm.plugin.appbrand.dynamic.f.a(this.appId, false, localbti)));
    GMTrace.o(19908112941056L, 148327);
    return (n)localObject1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */