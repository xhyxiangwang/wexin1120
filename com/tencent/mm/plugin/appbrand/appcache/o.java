package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.modelcdntran.h.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.pluginsdk.j.a.d.f.d;
import com.tencent.mm.pluginsdk.j.a.d.j;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.pluginsdk.j.a.d.m;
import com.tencent.mm.pluginsdk.j.a.d.m.a;
import com.tencent.mm.pluginsdk.j.a.d.t;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLException;

final class o
{
  final c iBs;
  
  o()
  {
    GMTrace.i(10599710851072L, 78974);
    this.iBs = new c();
    GMTrace.o(10599710851072L, 78974);
  }
  
  static String SA()
  {
    GMTrace.i(10599845068800L, 78975);
    String str2 = com.tencent.mm.kernel.h.xz().cachePath;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    str1 = str1 + "appbrand/pkg/";
    com.tencent.mm.sdk.platformtools.h.Mt(str1);
    GMTrace.o(10599845068800L, 78975);
    return str1;
  }
  
  final int b(p paramp)
  {
    GMTrace.i(19996965076992L, 148989);
    if (this.iBs.NU(paramp.sUR))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s already in queue", new Object[] { paramp.sUR });
      GMTrace.o(19996965076992L, 148989);
      return 0;
    }
    int i = this.iBs.b(paramp);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s, addResult %d", new Object[] { paramp.sUR, Integer.valueOf(i) });
    GMTrace.o(19996965076992L, 148989);
    return i;
  }
  
  private static final class a
  {
    public a()
    {
      GMTrace.i(15542547120128L, 115801);
      GMTrace.o(15542547120128L, 115801);
    }
    
    public final com.tencent.mm.pluginsdk.j.a.d.l a(o.d paramd)
    {
      GMTrace.i(15542681337856L, 115802);
      str = paramd.bHc();
      try
      {
        final CountDownLatch localCountDownLatch = new CountDownLatch(1);
        final com.tencent.mm.plugin.appbrand.n.d locald = new com.tencent.mm.plugin.appbrand.n.d();
        Object localObject1 = paramd.SB();
        Object localObject2 = new a(paramd)
        {
          final void b(com.tencent.mm.pluginsdk.j.a.d.l paramAnonymousl)
          {
            GMTrace.i(15544694603776L, 115817);
            locald.jwe = paramAnonymousl;
            localCountDownLatch.countDown();
            GMTrace.o(15544694603776L, 115817);
          }
        };
        paramd = new com.tencent.mm.modelcdntran.h();
        paramd.field_mediaId = ((k)localObject1).sUR;
        paramd.field_fullpath = ((p)localObject1).getFilePath();
        paramd.hsQ = ((k)localObject1).url;
        paramd.fRd = false;
        paramd.hsO = ((h.a)localObject2);
        paramd.hsP = true;
        paramd.hsR = 15;
        paramd.hsS = 30;
        localObject1 = Uri.parse(paramd.hsQ).getHost();
        if (!bg.mZ((String)localObject1)) {
          localObject2 = new ArrayList();
        }
        try
        {
          com.tencent.mm.kernel.h.xy().gQO.hmK.getHostByName((String)localObject1, (List)localObject2);
          paramd.hsT = new String[((ArrayList)localObject2).size()];
          ((ArrayList)localObject2).toArray(paramd.hsT);
          com.tencent.mm.modelcdntran.g.Gi().b(paramd, -1);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            try
            {
              localCountDownLatch.await();
              paramd = (com.tencent.mm.pluginsdk.j.a.d.l)locald.jwe;
              GMTrace.o(15542681337856L, 115802);
              return paramd;
            }
            catch (Exception paramd)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "cdn https perform, urlKey %s semaphore await e = %s", new Object[] { str, paramd });
              GMTrace.o(15542681337856L, 115802);
            }
            localException = localException;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "cdn https getHostByName e = %s", new Object[] { localException });
          }
        }
        return null;
      }
      catch (Exception paramd)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "cdn https perform urlKey %s exp %s", new Object[] { str, paramd });
        GMTrace.o(15542681337856L, 115802);
        return null;
      }
    }
    
    static abstract class a
      implements h.a
    {
      private final o.d iBw;
      
      a(o.d paramd)
      {
        GMTrace.i(16161290846208L, 120411);
        this.iBw = paramd;
        GMTrace.o(16161290846208L, 120411);
      }
      
      public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
      {
        GMTrace.i(15541741813760L, 115795);
        if (paramInt != 0)
        {
          b(new com.tencent.mm.pluginsdk.j.a.d.l(this.iBw, new SSLException(String.format(Locale.US, "CdnHttpsAddTaskFailed$%s$%d", new Object[] { this.iBw.bHc(), Integer.valueOf(paramInt) })), 3));
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "urlKey %s, startRet %d", new Object[] { this.iBw.bHc(), Integer.valueOf(paramInt) });
          GMTrace.o(15541741813760L, 115795);
          return 0;
        }
        if (paramkeep_ProgressInfo != null)
        {
          GMTrace.o(15541741813760L, 115795);
          return 0;
        }
        if (paramkeep_SceneResult != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.CdnHttpsDownloadPerformer", "urlKey %s, retCode %d", new Object[] { this.iBw.bHc(), Integer.valueOf(paramkeep_SceneResult.field_retCode) });
          if (paramkeep_SceneResult.field_retCode == 0) {
            break label227;
          }
          b(new com.tencent.mm.pluginsdk.j.a.d.l(this.iBw, new SSLException(String.format(Locale.US, "CdnHttpsDownloadFailed$%s$%d", new Object[] { this.iBw.bHc(), Integer.valueOf(paramkeep_SceneResult.field_retCode) })), 3));
        }
        for (;;)
        {
          GMTrace.o(15541741813760L, 115795);
          return 0;
          label227:
          b(new com.tencent.mm.pluginsdk.j.a.d.l(this.iBw, -1L, null));
          paramInt = com.tencent.mm.a.e.aY(this.iBw.SB().getFilePath());
          if (ag.a.hfs != null) {
            ag.a.hfs.aH(paramInt, 0);
          }
        }
      }
      
      public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
      {
        GMTrace.i(15541876031488L, 115796);
        GMTrace.o(15541876031488L, 115796);
      }
      
      abstract void b(com.tencent.mm.pluginsdk.j.a.d.l paraml);
      
      public final byte[] h(String paramString, byte[] paramArrayOfByte)
      {
        GMTrace.i(15542010249216L, 115797);
        GMTrace.o(15542010249216L, 115797);
        return new byte[0];
      }
    }
  }
  
  @SuppressLint({"DefaultLocale"})
  public static class b
    extends p
  {
    b(String paramString1, String paramString2, int paramInt)
    {
      super(str2 + String.format("debug_%d_%d_%d.wxapkg", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(paramString2.hashCode()) }), paramString2, paramString1, String.format("%d-%s", new Object[] { Integer.valueOf(paramInt), paramString2 }).hashCode(), paramInt);
      GMTrace.i(10620648816640L, 79130);
      GMTrace.o(10620648816640L, 79130);
    }
  }
  
  private final class c
    extends m
  {
    c()
    {
      super(new o.e(o.this));
      GMTrace.i(10602932076544L, 78998);
      GMTrace.o(10602932076544L, 78998);
    }
    
    protected final f.d a(k paramk)
    {
      GMTrace.i(10603066294272L, 78999);
      paramk = new o.d((p)paramk);
      paramk.sWH = this.sWE;
      GMTrace.o(10603066294272L, 78999);
      return paramk;
    }
    
    protected final int b(k paramk)
    {
      GMTrace.i(10603200512000L, 79000);
      int i = super.b(paramk);
      if (i == 1)
      {
        super.b(paramk);
        GMTrace.o(10603200512000L, 79000);
        return 2;
      }
      GMTrace.o(10603200512000L, 79000);
      return i;
    }
    
    public final void shutdown()
    {
      GMTrace.i(17654328852480L, 131535);
      super.shutdown();
      ((o.e)this.sWE).iBB.getLooper().quit();
      GMTrace.o(17654328852480L, 131535);
    }
  }
  
  private static final class d
    extends m.a<p>
  {
    private static final ThreadLocal<o.a> iBy;
    final g.a iBA;
    private String iBz;
    
    static
    {
      GMTrace.i(15541473378304L, 115793);
      iBy = new ThreadLocal() {};
      GMTrace.o(15541473378304L, 115793);
    }
    
    d(p paramp)
    {
      super();
      GMTrace.i(19998173036544L, 148998);
      this.iBz = null;
      g.a locala = g.a(paramp);
      paramp = locala;
      if (locala == null) {
        paramp = d.iAF;
      }
      this.iBA = paramp;
      GMTrace.o(19998173036544L, 148998);
    }
    
    protected final p SB()
    {
      GMTrace.i(19998307254272L, 148999);
      p localp = (p)super.SJ();
      GMTrace.o(19998307254272L, 148999);
      return localp;
    }
    
    public final String SC()
    {
      GMTrace.i(10601589899264L, 78988);
      GMTrace.o(10601589899264L, 78988);
      return "AppBrandWxaPkgDownloader";
    }
    
    public final boolean SD()
    {
      GMTrace.i(10601724116992L, 78989);
      GMTrace.o(10601724116992L, 78989);
      return true;
    }
    
    public final boolean SE()
    {
      GMTrace.i(10601858334720L, 78990);
      GMTrace.o(10601858334720L, 78990);
      return false;
    }
    
    public final boolean SF()
    {
      GMTrace.i(10601992552448L, 78991);
      GMTrace.o(10601992552448L, 78991);
      return true;
    }
    
    protected final boolean SG()
    {
      GMTrace.i(10602126770176L, 78992);
      GMTrace.o(10602126770176L, 78992);
      return false;
    }
    
    public final boolean SH()
    {
      GMTrace.i(10602260987904L, 78993);
      GMTrace.o(10602260987904L, 78993);
      return false;
    }
    
    public final boolean SI()
    {
      GMTrace.i(10602395205632L, 78994);
      switch (com.tencent.mm.compatible.d.v.tv())
      {
      default: 
        GMTrace.o(10602395205632L, 78994);
        return false;
      case 0: 
        GMTrace.o(10602395205632L, 78994);
        return false;
      }
      boolean bool = super.SI();
      GMTrace.o(10602395205632L, 78994);
      return bool;
    }
    
    protected final com.tencent.mm.pluginsdk.j.a.d.l a(j paramj)
    {
      GMTrace.i(10601455681536L, 78987);
      p localp = (p)super.SJ();
      com.tencent.mm.loader.stub.b.deleteFile(localp.getFilePath());
      this.iBz = localp.url;
      Object localObject = this.iBA;
      this.iBz.startsWith("https");
      ((g.a)localObject).Sp();
      if (this.iBz.startsWith("https"))
      {
        localObject = ((o.a)iBy.get()).a(this);
        if (((localObject != null) && (((com.tencent.mm.pluginsdk.j.a.d.l)localObject).status != 3)) || (!this.iBz.startsWith("https"))) {
          break label175;
        }
        this.iBA.Sq();
        if (!(localp instanceof o.b)) {
          break label193;
        }
      }
      label175:
      label193:
      for (int i = 0;; i = 1)
      {
        if (i != 0)
        {
          this.iBz = this.iBz.replaceFirst("https", "http");
          paramj = super.a(paramj);
        }
        for (;;)
        {
          this.iBA.a(paramj);
          GMTrace.o(10601455681536L, 78987);
          return paramj;
          localObject = null;
          break;
          if (localObject == null) {
            paramj = super.a(paramj);
          } else {
            paramj = (j)localObject;
          }
        }
      }
    }
    
    public final String getURL()
    {
      GMTrace.i(14345190768640L, 106880);
      String str = this.iBz;
      GMTrace.o(14345190768640L, 106880);
      return str;
    }
  }
  
  private final class e
    implements com.tencent.mm.pluginsdk.j.a.d.c
  {
    public final ae iBB;
    
    e()
    {
      GMTrace.i(10617696026624L, 79108);
      this.iBB = new ae(new af("WxaPkgDownloadPerformerEventDispatchThread").nTP.getLooper());
      GMTrace.o(10617696026624L, 79108);
    }
    
    public static void b(com.tencent.mm.pluginsdk.j.a.d.e parame, com.tencent.mm.pluginsdk.j.a.d.l paraml)
    {
      GMTrace.i(15064329355264L, 112238);
      e(parame, paraml);
      GMTrace.o(15064329355264L, 112238);
    }
    
    public static void c(com.tencent.mm.pluginsdk.j.a.d.e parame, com.tencent.mm.pluginsdk.j.a.d.l paraml)
    {
      GMTrace.i(15064463572992L, 112239);
      Object localObject1 = ((o.d)parame).SB();
      if ((localObject1 instanceof l))
      {
        paraml = (l)localObject1;
        parame = ((o.d)parame).iBA;
        localObject1 = ((a)com.tencent.mm.kernel.h.h(a.class)).RT();
        if (localObject1 == null)
        {
          w.a(paraml.sUR, paraml.appId, w.a.b.iCv, null);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        Object localObject2 = paraml.appId;
        j = paraml.iBe;
        i = paraml.iBf;
        String str = l.T((String)localObject2, i);
        r localr = ((v)localObject1).a((String)localObject2, j, 0, new String[] { "pkgPath" });
        localObject2 = ((v)localObject1).a((String)localObject2, i, 0, new String[] { "versionMd5" });
        if ((localr == null) || (localObject2 == null))
        {
          w.a(paraml.sUR, paraml.appId, w.a.b.iCv, null);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        parame.Sr();
        long l1 = SystemClock.elapsedRealtime();
        j = e.u(localr.field_pkgPath, str, paraml.getFilePath());
        long l2 = SystemClock.elapsedRealtime();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "applyPkgPatch, appId[%s], oldPath[%s], newPath[%s], patchPath[%s], cost %d, ret %d", new Object[] { paraml.appId, localr.field_pkgPath, str, paraml.getFilePath(), Long.valueOf(l2 - l1), Integer.valueOf(j) });
        parame.hL(j);
        if (j == 0)
        {
          com.tencent.mm.loader.stub.b.deleteFile(paraml.getFilePath());
          w.a(paraml.sUR, paraml.appId, str, i, 0, parame);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        com.tencent.mm.loader.stub.b.deleteFile(str);
        parame = ((v)localObject1).a(paraml.appId, paraml.iBf, 0, new String[] { "downloadURL" });
        if (parame == null)
        {
          w.a(paraml.sUR, paraml.appId, w.a.b.iCv, null);
          GMTrace.o(15064463572992L, 112239);
          return;
        }
        w.oe(paraml.sUR);
        w.a(paraml.appId, 0, paraml.iBf, parame.field_downloadURL, paraml.iBg);
        GMTrace.o(15064463572992L, 112239);
        return;
      }
      localObject1 = ((o.d)parame).SB().appId;
      int i = ((o.d)parame).SB().version;
      int j = ((o.d)parame).SB().fBH;
      try
      {
        w.a(paraml.sUR, (String)localObject1, paraml.filePath, i, j, ((o.d)parame).iBA);
        GMTrace.o(15064463572992L, 112239);
        return;
      }
      catch (Exception parame)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AppBrandWxaPkgDownloadPerformer", parame, "dispatchComplete", new Object[0]);
        w.aA(paraml.sUR, (String)localObject1);
        GMTrace.o(15064463572992L, 112239);
      }
    }
    
    public static void d(com.tencent.mm.pluginsdk.j.a.d.e parame, com.tencent.mm.pluginsdk.j.a.d.l paraml)
    {
      GMTrace.i(16162096152576L, 120417);
      e(parame, paraml);
      GMTrace.o(16162096152576L, 120417);
    }
    
    private static void e(com.tencent.mm.pluginsdk.j.a.d.e parame, com.tencent.mm.pluginsdk.j.a.d.l paraml)
    {
      GMTrace.i(14345324986368L, 106881);
      com.tencent.mm.loader.stub.b.deleteFile(paraml.filePath);
      String str = ((o.d)parame).SB().appId;
      switch (paraml.httpStatusCode)
      {
      }
      for (parame = w.a.b.iCq;; parame = w.a.b.iCu)
      {
        w.a(paraml.sUR, str, parame);
        GMTrace.o(14345324986368L, 106881);
        return;
      }
    }
    
    public final void a(final com.tencent.mm.pluginsdk.j.a.d.e parame, final com.tencent.mm.pluginsdk.j.a.d.l paraml)
    {
      GMTrace.i(10617830244352L, 79109);
      this.iBB.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10612058882048L, 79066);
          switch (paraml.status)
          {
          }
          for (;;)
          {
            GMTrace.o(10612058882048L, 79066);
            return;
            o.e.d(parame, paraml);
            GMTrace.o(10612058882048L, 79066);
            return;
            o.e.c(parame, paraml);
            GMTrace.o(10612058882048L, 79066);
            return;
            o.e.b(parame, paraml);
          }
        }
      });
      GMTrace.o(10617830244352L, 79109);
    }
    
    public final void m(String paramString, long paramLong)
    {
      GMTrace.i(10618098679808L, 79111);
      GMTrace.o(10618098679808L, 79111);
    }
    
    public final void n(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10617964462080L, 79110);
      GMTrace.o(10617964462080L, 79110);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */