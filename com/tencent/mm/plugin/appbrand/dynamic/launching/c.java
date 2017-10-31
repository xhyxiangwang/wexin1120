package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.b;
import com.tencent.mm.plugin.appbrand.appcache.q;
import com.tencent.mm.plugin.appbrand.appcache.q.a;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.appcache.w.a;
import com.tencent.mm.plugin.appbrand.appcache.w.a.a;
import com.tencent.mm.plugin.appbrand.appcache.w.a.b;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aet;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final class c
  implements Callable<WxaPkgWrappingInfo>
{
  public static int iMs;
  public static int iMt;
  final String appId;
  final int fBH;
  volatile int iCy;
  String iKu;
  int iMr;
  volatile String iMu;
  
  static
  {
    GMTrace.i(17846662856704L, 132968);
    iMs = 0;
    iMt = 1;
    GMTrace.o(17846662856704L, 132968);
  }
  
  public c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    GMTrace.i(18298171293696L, 136332);
    this.appId = paramString1;
    this.fBH = paramInt1;
    this.iCy = paramInt2;
    this.iMu = paramString3;
    this.iMr = paramInt3;
    this.iKu = paramString2;
    GMTrace.o(18298171293696L, 136332);
  }
  
  private WxaPkgWrappingInfo UZ()
  {
    GMTrace.i(17846260203520L, 132965);
    final CountDownLatch localCountDownLatch = new CountDownLatch(1);
    final Object localObject = new d();
    w.a local1 = new w.a()
    {
      public final void a(String paramAnonymousString, w.a.b paramAnonymousb, w.a.a paramAnonymousa)
      {
        GMTrace.i(17847333945344L, 132973);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "onPkgUpdatingCallback, appId = %s, return = %s", new Object[] { paramAnonymousString, paramAnonymousb.name() });
        if (w.a.b.iCp.equals(paramAnonymousb))
        {
          paramAnonymousString = WxaPkgWrappingInfo.of(paramAnonymousa.filePath);
          if (paramAnonymousString == null) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "onPkgUpdatingCallback, ret=OK but obtain null appPkgInfo");
          }
        }
        for (;;)
        {
          localCountDownLatch.countDown();
          GMTrace.o(17847333945344L, 132973);
          return;
          paramAnonymousString.iCy = paramAnonymousa.version;
          paramAnonymousString.iCz = bg.Po();
          paramAnonymousString.iCx = paramAnonymousa.iCo;
          localObject.jwe = paramAnonymousString;
          continue;
          w.a.b.iCu.equals(paramAnonymousb);
        }
      }
    };
    if ((this.fBH == 10002) || (this.fBH == 10102))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, debug type is release, start download appId(%s), pkgVersion(%d)", new Object[] { this.appId, Integer.valueOf(this.iCy) });
      if (!com.tencent.mm.plugin.appbrand.appcache.w.a(this.appId, this.fBH, this.iCy, this.iMu, local1))
      {
        a(q.a.iBL);
        GMTrace.o(17846260203520L, 132965);
        return null;
      }
    }
    else
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, appId = %s, debug type is %d", new Object[] { this.appId, Integer.valueOf(this.fBH) });
      if (((a)h.h(a.class)).RT() == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, null storage");
        a(q.a.iBL);
        GMTrace.o(17846260203520L, 132965);
        return null;
      }
      String str = ((a)h.h(a.class)).RT().V(this.appId, this.fBH);
      if (bg.mZ(str))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", "triggerDownloading, url is null or nil");
        a(q.a.iBH);
        GMTrace.o(17846260203520L, 132965);
        return null;
      }
      com.tencent.mm.plugin.appbrand.appcache.w.a(this.appId, this.fBH, str, local1);
    }
    try
    {
      localCountDownLatch.await();
      localObject = (WxaPkgWrappingInfo)((d)localObject).jwe;
      GMTrace.o(17846260203520L, 132965);
      return (WxaPkgWrappingInfo)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckWidgetPkg", localException, "tryDownload semaphore exp ", new Object[0]);
      }
    }
  }
  
  private static void a(q.a parama)
  {
    GMTrace.i(17846394421248L, 132966);
    if (q.a.iBH.equals(parama))
    {
      GMTrace.o(17846394421248L, 132966);
      return;
    }
    if ((q.a.iBJ.equals(parama)) || (q.a.iBI.equals(parama)))
    {
      GMTrace.o(17846394421248L, 132966);
      return;
    }
    GMTrace.o(17846394421248L, 132966);
  }
  
  public final WxaPkgWrappingInfo UY()
  {
    int j = 1;
    GMTrace.i(17846125985792L, 132964);
    Object localObject1 = q.p(this.appId, this.fBH, this.iCy);
    if (((Pair)localObject1).second != null)
    {
      localObject1 = (WxaPkgWrappingInfo)((Pair)localObject1).second;
      GMTrace.o(17846125985792L, 132964);
      return (WxaPkgWrappingInfo)localObject1;
    }
    Object localObject2;
    Object localObject3;
    if (q.a.iBK.equals(((Pair)localObject1).first))
    {
      if ((this.fBH == 10002) || (this.fBH == 10102))
      {
        localObject2 = ((a)h.h(a.class)).RT().a(this.appId, this.fBH, new String[] { "version", "versionMd5", "versionState" });
        if (localObject2 == null)
        {
          a((q.a)((Pair)localObject1).first);
          GMTrace.o(17846125985792L, 132964);
          return null;
        }
        if (this.fBH == 10102) {}
        for (i = 2;; i = 1)
        {
          localObject4 = com.tencent.mm.plugin.appbrand.g.c.b(new b(this.appId, ((r)localObject2).field_version, ((r)localObject2).field_versionMd5, i).gMC);
          if ((localObject4 != null) && (((a.a)localObject4).errType == 0) && (((a.a)localObject4).errCode == 0)) {
            break;
          }
          if (this.iMr == 1) {
            g.paX.i(14452, new Object[] { this.iKu + "-" + this.appId, Integer.valueOf(6), Long.valueOf(System.currentTimeMillis()) });
          }
          GMTrace.o(17846125985792L, 132964);
          return null;
        }
        if (bg.mZ(((aet)((a.a)localObject4).fPm).url))
        {
          if (this.iMr == 1) {
            g.paX.i(14452, new Object[] { this.iKu + "-" + this.appId, Integer.valueOf(6), Long.valueOf(System.currentTimeMillis()) });
          }
          GMTrace.o(17846125985792L, 132964);
          return null;
        }
        if (this.iMr == 1) {
          g.paX.i(14452, new Object[] { this.iKu + "-" + this.appId, Integer.valueOf(5), Long.valueOf(System.currentTimeMillis()) });
        }
        localObject3 = new bss();
        Object localObject4 = ((aet)((a.a)localObject4).fPm).url;
        this.iMu = ((String)localObject4);
        ((bss)localObject3).uHD = ((String)localObject4);
        i = ((r)localObject2).field_version;
        this.iCy = i;
        ((bss)localObject3).tAS = i;
        ((bss)localObject3).uHB = ((r)localObject2).field_versionState;
        ((bss)localObject3).uHC = ((r)localObject2).field_versionMd5;
        ((a)h.h(a.class)).RT().a(this.appId, (bss)localObject3, this.fBH);
      }
      localObject2 = UZ();
      if (localObject2 != null)
      {
        if (this.iMr == 1) {
          g.paX.i(14452, new Object[] { this.iKu + "-" + this.appId, Integer.valueOf(7), Long.valueOf(System.currentTimeMillis()) });
        }
        GMTrace.o(17846125985792L, 132964);
        return (WxaPkgWrappingInfo)localObject2;
      }
      if (this.iMr == 1) {
        g.paX.i(14452, new Object[] { this.iKu + "-" + this.appId, Integer.valueOf(8), Long.valueOf(System.currentTimeMillis()) });
      }
    }
    if ((this.fBH == 10002) || (this.fBH == 10102))
    {
      localObject2 = ((a)h.h(a.class)).RT().od(this.appId);
      if ((localObject2 == null) || (localObject2.length <= 1)) {}
    }
    for (int i = j;; i = j)
    {
      localObject3 = this.appId;
      int k = this.fBH;
      j = i + 1;
      localObject3 = q.p((String)localObject3, k, localObject2[i]);
      if ((localObject3 != null) && (((Pair)localObject3).first == q.a.iBG) && (((Pair)localObject3).second != null))
      {
        localObject1 = (WxaPkgWrappingInfo)((Pair)localObject3).second;
        GMTrace.o(17846125985792L, 132964);
        return (WxaPkgWrappingInfo)localObject1;
      }
      if (j >= localObject2.length)
      {
        a((q.a)((Pair)localObject1).first);
        GMTrace.o(17846125985792L, 132964);
        return null;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */