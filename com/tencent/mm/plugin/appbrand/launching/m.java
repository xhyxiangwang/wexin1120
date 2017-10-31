package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.q;
import com.tencent.mm.plugin.appbrand.appcache.q.a;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.appcache.w.a;
import com.tencent.mm.plugin.appbrand.appcache.w.a.a;
import com.tencent.mm.plugin.appbrand.appcache.w.a.b;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.protocal.c.aet;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import junit.framework.Assert;

public class m
  extends k<WxaPkgWrappingInfo>
{
  final String appId;
  public int iCy;
  public String iMu;
  final int iQS;
  private WxaPkgWrappingInfo jgo;
  
  m(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(19678197972992L, 146614);
    this.appId = paramString;
    this.iQS = paramInt1;
    this.iCy = paramInt2;
    this.iMu = null;
    GMTrace.o(19678197972992L, 146614);
  }
  
  private WxaPkgWrappingInfo UY()
  {
    GMTrace.i(17667884843008L, 131636);
    Pair localPair = q.p(this.appId, this.iQS, this.iCy);
    Object localObject1;
    if (localPair.second != null)
    {
      localObject1 = (WxaPkgWrappingInfo)localPair.second;
      GMTrace.o(17667884843008L, 131636);
      return (WxaPkgWrappingInfo)localObject1;
    }
    if (q.a.iBK.equals(localPair.first))
    {
      if (this.iQS == 0)
      {
        this.jgo = nY(this.appId);
        try
        {
          localObject1 = f.Sh().a(this.appId, 0, new String[] { "version", "versionMd5", "versionState" });
          if (localObject1 == null) {
            throw new m.a.a().c(com.tencent.mm.plugin.appbrand.o.d.e(p.i.iys, new Object[] { com.tencent.mm.plugin.appbrand.appcache.a.hJ(this.iQS) }), new Object[0]).f("get NULL record with md5", new Object[0]).Ye();
          }
        }
        catch (a locala)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "release_pkg APP_BROKEN obtain appId %s, message %s", new Object[] { this.appId, locala.getMessage() });
          Object localObject3 = nY(this.appId);
          if (localObject3 != null)
          {
            GMTrace.o(17667884843008L, 131636);
            return (WxaPkgWrappingInfo)localObject3;
            int j = locala.field_version;
            int i;
            if (this.jgo == null)
            {
              i = 0;
              localObject3 = c.b(new com.tencent.mm.plugin.appbrand.appcache.b(this.appId, locala.field_version, locala.field_versionMd5, 0, i).gMC);
              if ((localObject3 != null) && (((a.a)localObject3).errType == 0) && (((a.a)localObject3).errCode == 0)) {
                break label446;
              }
              localObject4 = new m.a.a();
              if (localObject3 != null) {
                break label389;
              }
              localObject2 = null;
              label307:
              localObject2 = ((m.a.a)localObject4).f("fail get download url, resp %s", new Object[] { localObject2 });
              k = p.i.iyo;
              if (localObject3 != null) {
                break label428;
              }
              i = -1;
              label336:
              if (localObject3 != null) {
                break label437;
              }
            }
            label389:
            label428:
            label437:
            for (j = -1;; j = ((a.a)localObject3).errCode)
            {
              throw ((m.a.a)localObject2).c(l.e(k, new Object[] { Integer.valueOf(i), Integer.valueOf(j) }), new Object[0]).Ye();
              i = this.jgo.iCy;
              break;
              localObject2 = String.format(Locale.US, "(%d, %d)", new Object[] { Integer.valueOf(((a.a)localObject3).errType), Integer.valueOf(((a.a)localObject3).errCode) });
              break label307;
              i = ((a.a)localObject3).errType;
              break label336;
            }
            label446:
            if (bg.mZ(((aet)((a.a)localObject3).fPm).url)) {
              throw new m.a.a().f("CgiGetDownloadURL return EMPTY url, ret = %d", new Object[] { Integer.valueOf(((aet)((a.a)localObject3).fPm).ret) }).Ye();
            }
            Object localObject4 = new bss();
            String str = ((aet)((a.a)localObject3).fPm).url;
            this.iMu = str;
            ((bss)localObject4).uHD = str;
            int k = ((r)localObject2).field_version;
            this.iCy = k;
            ((bss)localObject4).tAS = k;
            ((bss)localObject4).uHB = ((r)localObject2).field_versionState;
            ((bss)localObject4).uHC = ((r)localObject2).field_versionMd5;
            f.Sh().a(this.appId, (bss)localObject4, 0);
            localObject2 = b(new c(i, j, (aet)((a.a)localObject3).fPm));
            if (localObject2 != null)
            {
              GMTrace.o(17667884843008L, 131636);
              return (WxaPkgWrappingInfo)localObject2;
            }
            throw new m.a.a().f("Download Fail", new Object[0]).Ye();
          }
          if (bg.mZ(((a)localObject2).jgp)) {
            break label706;
          }
        }
        l.qL(((a)localObject2).jgp);
        GMTrace.o(17667884843008L, 131636);
        return null;
      }
      Object localObject2 = b(new d());
      if (localObject2 != null)
      {
        GMTrace.o(17667884843008L, 131636);
        return (WxaPkgWrappingInfo)localObject2;
      }
    }
    label706:
    a((q.a)localPair.first);
    GMTrace.o(17667884843008L, 131636);
    return null;
  }
  
  private WxaPkgWrappingInfo b(Callable<WxaPkgWrappingInfo> paramCallable)
  {
    GMTrace.i(19678332190720L, 146615);
    if (paramCallable == this)
    {
      Assert.assertTrue("Why the hell you pass 'this' to this method", false);
      GMTrace.o(19678332190720L, 146615);
      return null;
    }
    XX();
    try
    {
      paramCallable = (WxaPkgWrappingInfo)paramCallable.call();
      XY();
      GMTrace.o(19678332190720L, 146615);
      return paramCallable;
    }
    catch (Exception paramCallable)
    {
      for (;;)
      {
        paramCallable = null;
      }
    }
  }
  
  static WxaPkgWrappingInfo nY(String paramString)
  {
    int i = 1;
    GMTrace.i(17668019060736L, 131637);
    int[] arrayOfInt = f.Sh().od(paramString);
    if ((arrayOfInt != null) && (arrayOfInt.length > 1)) {}
    for (;;)
    {
      int j = i + 1;
      Pair localPair = q.p(paramString, 0, arrayOfInt[i]);
      if ((localPair != null) && (localPair.first == q.a.iBG) && (localPair.second != null))
      {
        paramString = (WxaPkgWrappingInfo)localPair.second;
        GMTrace.o(17668019060736L, 131637);
        return paramString;
      }
      if (j >= arrayOfInt.length)
      {
        GMTrace.o(17668019060736L, 131637);
        return null;
      }
      i = j;
    }
  }
  
  void XX()
  {
    GMTrace.i(10149007720448L, 75616);
    GMTrace.o(10149007720448L, 75616);
  }
  
  void XY()
  {
    GMTrace.i(17328716644352L, 129109);
    GMTrace.o(17328716644352L, 129109);
  }
  
  public final void a(q.a parama)
  {
    GMTrace.i(10149276155904L, 75618);
    if (q.a.iBH.equals(parama))
    {
      if (this.iQS == 1) {}
      for (parama = com.tencent.mm.plugin.appbrand.o.d.e(p.i.ixA, new Object[0]);; parama = com.tencent.mm.plugin.appbrand.o.d.e(p.i.iys, new Object[] { com.tencent.mm.plugin.appbrand.appcache.a.hJ(this.iQS) }))
      {
        if (this.iQS == 1)
        {
          com.tencent.mm.plugin.appbrand.task.b.at(this.appId, this.iQS);
          com.tencent.mm.plugin.appbrand.report.a.x(this.appId, 10, this.iQS + 1);
        }
        l.qL(parama);
        GMTrace.o(10149276155904L, 75618);
        return;
      }
    }
    if ((q.a.iBJ.equals(parama)) || (q.a.iBI.equals(parama)))
    {
      if (this.iQS != 0) {}
      for (int i = p.i.ixA;; i = p.i.ixC)
      {
        l.iO(i);
        if (this.iQS == 1) {
          com.tencent.mm.plugin.appbrand.report.a.x(this.appId, 10, this.iQS + 1);
        }
        com.tencent.mm.plugin.appbrand.task.b.at(this.appId, this.iQS);
        GMTrace.o(10149276155904L, 75618);
        return;
      }
    }
    l.qL(com.tencent.mm.plugin.appbrand.o.d.e(p.i.iyq, new Object[] { Integer.valueOf(1), Integer.valueOf(parama.SK()) }));
    GMTrace.o(10149276155904L, 75618);
  }
  
  final String getTag()
  {
    GMTrace.i(17328850862080L, 129110);
    GMTrace.o(17328850862080L, 129110);
    return "MicroMsg.AppBrand.PrepareStepCheckAppPkg";
  }
  
  private static final class a
    extends Error
  {
    final String jgp;
    
    a(String paramString1, String paramString2)
    {
      super();
      GMTrace.i(17669092802560L, 131645);
      this.jgp = paramString2;
      GMTrace.o(17669092802560L, 131645);
    }
    
    static final class a
    {
      String jgp;
      String jgq;
      
      a()
      {
        GMTrace.i(17668287496192L, 131639);
        GMTrace.o(17668287496192L, 131639);
      }
      
      final m.a Ye()
      {
        GMTrace.i(17668690149376L, 131642);
        m.a locala = new m.a(this.jgq, this.jgp);
        GMTrace.o(17668690149376L, 131642);
        return locala;
      }
      
      final a c(String paramString, Object... paramVarArgs)
      {
        GMTrace.i(17668421713920L, 131640);
        this.jgp = String.format(Locale.US, paramString, paramVarArgs);
        GMTrace.o(17668421713920L, 131640);
        return this;
      }
      
      final a f(String paramString, Object... paramVarArgs)
      {
        GMTrace.i(17668555931648L, 131641);
        this.jgq = String.format(Locale.US, paramString, paramVarArgs);
        GMTrace.o(17668555931648L, 131641);
        return this;
      }
    }
  }
  
  private abstract class b
    implements w.a
  {
    public b()
    {
      GMTrace.i(19676721577984L, 146603);
      GMTrace.o(19676721577984L, 146603);
    }
    
    abstract String Yf();
    
    public final void a(String paramString, w.a.b paramb, w.a.a parama)
    {
      GMTrace.i(19676855795712L, 146604);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "[%s] onPkgUpdatingCallback, appId = %s, return = %s", new Object[] { Yf(), paramString, paramb.name() });
      if (w.a.b.iCp.equals(paramb))
      {
        paramString = WxaPkgWrappingInfo.of(parama.filePath);
        if (paramString == null) {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "[%s] onPkgUpdatingCallback, ret=OK but obtain null appPkgInfo");
        }
        for (;;)
        {
          c(paramString);
          GMTrace.o(19676855795712L, 146604);
          return;
          paramString.iCy = parama.version;
          paramString.iCz = com.tencent.mm.plugin.appbrand.o.d.aaW();
          paramString.iCx = parama.iCo;
        }
      }
      if (w.a.b.iCu.equals(paramb))
      {
        l.iO(p.i.iyt);
        com.tencent.mm.plugin.appbrand.report.a.x(paramString, 23, m.this.iQS + 1);
      }
      for (;;)
      {
        c(null);
        GMTrace.o(19676855795712L, 146604);
        return;
        l.qL(com.tencent.mm.plugin.appbrand.o.d.e(p.i.iyq, new Object[] { Integer.valueOf(2), Integer.valueOf(paramb.code) }));
      }
    }
    
    abstract void c(WxaPkgWrappingInfo paramWxaPkgWrappingInfo);
  }
  
  private final class c
    implements Callable<WxaPkgWrappingInfo>
  {
    public final int jgs;
    public final int jgt;
    private final aet jgu;
    
    public c(int paramInt1, int paramInt2, aet paramaet)
    {
      GMTrace.i(19678466408448L, 146616);
      this.jgs = paramInt1;
      this.jgt = paramInt2;
      this.jgu = paramaet;
      GMTrace.o(19678466408448L, 146616);
    }
    
    private WxaPkgWrappingInfo Yg()
    {
      GMTrace.i(19678600626176L, 146617);
      final CountDownLatch localCountDownLatch = new CountDownLatch(1);
      final Object localObject = new com.tencent.mm.plugin.appbrand.n.d();
      m.b local1 = new m.b((com.tencent.mm.plugin.appbrand.n.d)localObject)
      {
        final String Yf()
        {
          GMTrace.i(19677526884352L, 146609);
          String str = String.format(Locale.US, "Incremental %d|%d", new Object[] { Integer.valueOf(m.c.this.jgs), Integer.valueOf(m.c.this.jgt) });
          GMTrace.o(19677526884352L, 146609);
          return str;
        }
        
        final void c(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
        {
          GMTrace.i(19677661102080L, 146610);
          localObject.jwe = paramAnonymousWxaPkgWrappingInfo;
          localCountDownLatch.countDown();
          GMTrace.o(19677661102080L, 146610);
        }
      };
      if (!com.tencent.mm.plugin.appbrand.appcache.w.a(new com.tencent.mm.plugin.appbrand.appcache.l(m.this.appId, this.jgs, this.jgt, this.jgu.fEu, local1), local1))
      {
        GMTrace.o(19678600626176L, 146617);
        return null;
      }
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((com.tencent.mm.plugin.appbrand.n.d)localObject).jwe;
        GMTrace.o(19678600626176L, 146617);
        return (WxaPkgWrappingInfo)localObject;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localInterruptedException, "downloadIncremental semaphore exp ", new Object[0]);
        }
      }
    }
  }
  
  private final class d
    implements Callable<WxaPkgWrappingInfo>
  {
    public d()
    {
      GMTrace.i(19676318924800L, 146600);
      GMTrace.o(19676318924800L, 146600);
    }
    
    public final WxaPkgWrappingInfo UY()
    {
      GMTrace.i(19676453142528L, 146601);
      final CountDownLatch localCountDownLatch = new CountDownLatch(1);
      final Object localObject = new com.tencent.mm.plugin.appbrand.n.d();
      m.b local1 = new m.b((com.tencent.mm.plugin.appbrand.n.d)localObject)
      {
        final String Yf()
        {
          GMTrace.i(19677929537536L, 146612);
          String str = String.format(Locale.US, "NonIncremental %d", new Object[] { Integer.valueOf(m.this.iCy) });
          GMTrace.o(19677929537536L, 146612);
          return str;
        }
        
        final void c(WxaPkgWrappingInfo paramAnonymousWxaPkgWrappingInfo)
        {
          GMTrace.i(19678063755264L, 146613);
          localObject.jwe = paramAnonymousWxaPkgWrappingInfo;
          localCountDownLatch.countDown();
          GMTrace.o(19678063755264L, 146613);
        }
      };
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental before start appId(%s), type(%d), pkgVersion(%d)", new Object[] { m.this.appId, Integer.valueOf(m.this.iQS), Integer.valueOf(m.this.iCy) });
      if (m.this.iQS != 0)
      {
        m.this.iMu = f.Sh().V(m.this.appId, m.this.iQS);
        if (bg.mZ(m.this.iMu))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, get EMPTY url appId(%s), type(%d)", new Object[] { m.this.appId, Integer.valueOf(m.this.iQS) });
          m.this.a(q.a.iBH);
          GMTrace.o(19676453142528L, 146601);
          return null;
        }
      }
      if (!com.tencent.mm.plugin.appbrand.appcache.w.a(m.this.appId, m.this.iQS, m.this.iCy, m.this.iMu, local1))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.PrepareStepCheckAppPkg", "tryDownload, not incremental FATAL ERROR appId(%s), type(%d), pkgVersion(%d)", new Object[] { m.this.appId, Integer.valueOf(m.this.iQS), Integer.valueOf(m.this.iCy) });
        m.this.a(q.a.iBL);
        GMTrace.o(19676453142528L, 146601);
        return null;
      }
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((com.tencent.mm.plugin.appbrand.n.d)localObject).jwe;
        GMTrace.o(19676453142528L, 146601);
        return (WxaPkgWrappingInfo)localObject;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localException, "downloadNonIncremental semaphore exp ", new Object[0]);
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */