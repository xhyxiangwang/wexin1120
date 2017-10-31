package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.e.b;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  public ConcurrentHashMap<Long, WeakReference<a>> qmx;
  public ConcurrentHashMap<String, b> qmy;
  
  public a()
  {
    GMTrace.i(8197079302144L, 61073);
    this.qmx = new ConcurrentHashMap();
    this.qmy = new ConcurrentHashMap();
    f.aoQ();
    c.a(new n()
    {
      public final void bp(long paramAnonymousLong)
      {
        GMTrace.i(8195737124864L, 61063);
        Object localObject = (WeakReference)a.this.qmx.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null)
          {
            FileDownloadTaskInfo localFileDownloadTaskInfo = f.aoQ().bd(paramAnonymousLong);
            if ((localFileDownloadTaskInfo.fCc >= 0L) && (localFileDownloadTaskInfo.fCd > 0L)) {
              ((a.a)localObject).tU((int)(localFileDownloadTaskInfo.fCc * 100L / localFileDownloadTaskInfo.fCd));
            }
          }
        }
        GMTrace.o(8195737124864L, 61063);
      }
      
      public final void c(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(8195334471680L, 61060);
        Object localObject = (WeakReference)a.this.qmx.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null)
          {
            ((a.a)localObject).bgp();
            a.this.qmx.remove(Long.valueOf(paramAnonymousLong));
          }
          a.this.E(8, paramAnonymousLong);
        }
        GMTrace.o(8195334471680L, 61060);
      }
      
      public final void c(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(8195200253952L, 61059);
        paramAnonymousString = (WeakReference)a.this.qmx.get(Long.valueOf(paramAnonymousLong));
        if (paramAnonymousString != null)
        {
          paramAnonymousString = (a.a)paramAnonymousString.get();
          if (paramAnonymousString != null)
          {
            paramAnonymousString.bgo();
            a.this.qmx.remove(Long.valueOf(paramAnonymousLong));
          }
          a.this.E(3, paramAnonymousLong);
        }
        GMTrace.o(8195200253952L, 61059);
      }
      
      public final void k(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14313649602560L, 106645);
        paramAnonymousString = (WeakReference)a.this.qmx.get(Long.valueOf(paramAnonymousLong));
        if (paramAnonymousString != null)
        {
          paramAnonymousString = (a.a)paramAnonymousString.get();
          if (paramAnonymousString != null) {
            paramAnonymousString.bgq();
          }
          a.this.E(7, paramAnonymousLong);
        }
        GMTrace.o(14313649602560L, 106645);
      }
      
      public final void onTaskPaused(long paramAnonymousLong)
      {
        GMTrace.i(8195602907136L, 61062);
        Object localObject = (WeakReference)a.this.qmx.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null) {
            ((a.a)localObject).bgm();
          }
          a.this.E(6, paramAnonymousLong);
        }
        GMTrace.o(8195602907136L, 61062);
      }
      
      public final void onTaskRemoved(long paramAnonymousLong)
      {
        GMTrace.i(8195468689408L, 61061);
        Object localObject = (WeakReference)a.this.qmx.get(Long.valueOf(paramAnonymousLong));
        if (localObject != null)
        {
          localObject = (a.a)((WeakReference)localObject).get();
          if (localObject != null)
          {
            ((a.a)localObject).bgn();
            a.this.qmx.remove(Long.valueOf(paramAnonymousLong));
          }
          a.this.E(2, paramAnonymousLong);
        }
        GMTrace.o(8195468689408L, 61061);
      }
      
      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(8195066036224L, 61058);
        a.this.E(1, paramAnonymousLong);
        GMTrace.o(8195066036224L, 61058);
      }
    });
    GMTrace.o(8197079302144L, 61073);
  }
  
  private static String o(Object... paramVarArgs)
  {
    GMTrace.i(8198018826240L, 61080);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < 3)
    {
      localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
      i += 1;
    }
    localStringBuilder.append(String.valueOf(paramVarArgs[3]));
    paramVarArgs = localStringBuilder.toString();
    GMTrace.o(8198018826240L, 61080);
    return paramVarArgs;
  }
  
  public static long queryIdByAppid(String paramString)
  {
    GMTrace.i(15248476078080L, 113610);
    paramString = f.aoQ().uX(paramString);
    if (paramString != null)
    {
      long l = paramString.id;
      GMTrace.o(15248476078080L, 113610);
      return l;
    }
    GMTrace.o(15248476078080L, 113610);
    return Long.MAX_VALUE;
  }
  
  public static void stopTask(long paramLong)
  {
    GMTrace.i(15248341860352L, 113609);
    f.aoQ().bc(paramLong);
    GMTrace.o(15248341860352L, 113609);
  }
  
  public final void E(int paramInt, long paramLong)
  {
    GMTrace.i(8197884608512L, 61079);
    Object localObject = ((com.tencent.mm.plugin.downloader.b.a)h.h(com.tencent.mm.plugin.downloader.b.a.class)).yR().bq(paramLong);
    if (localObject == null)
    {
      GMTrace.o(8197884608512L, 61079);
      return;
    }
    localObject = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_appId;
    com.tencent.mm.plugin.downloader.e.a locala = ((com.tencent.mm.plugin.downloader.b.a)h.h(com.tencent.mm.plugin.downloader.b.a.class)).yR().uT((String)localObject);
    if (locala == null)
    {
      w.i("MicroMsg.AdDownloadApkMgr", "downloadinfo not found");
      GMTrace.o(8197884608512L, 61079);
      return;
    }
    String str1 = locala.field_packageName;
    String str2 = locala.field_md5;
    c(paramInt, (String)localObject, str1, locala.field_downloadUrl);
    GMTrace.o(8197884608512L, 61079);
  }
  
  public final void c(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18581504917504L, 138443);
    System.currentTimeMillis();
    b localb = (b)this.qmy.get(paramString1);
    String str = paramString2;
    if (!TextUtils.isEmpty(paramString2)) {
      str = paramString2.replaceAll("\\.", "_");
    }
    if (localb == null) {}
    for (paramString2 = "";; paramString2 = localb.qlp + "." + localb.iMY + "." + str + ".0.20.0")
    {
      paramString1 = o(new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, paramString2 });
      w.i("MicroMsg.AdDownloadApkMgr", "reporting %d  %s", new Object[] { Integer.valueOf(14542), paramString1 });
      w.d("MicroMsg.AdDownloadApkMgr", "14542  extinfo : " + paramString2);
      g.paX.z(14542, paramString1);
      GMTrace.o(18581504917504L, 138443);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void bgm();
    
    public abstract void bgn();
    
    public abstract void bgo();
    
    public abstract void bgp();
    
    public abstract void bgq();
    
    public abstract void start();
    
    public abstract void tU(int paramInt);
  }
  
  public static final class b
    implements Serializable
  {
    public String iMY;
    public String qlp;
    
    public b(String paramString1, String paramString2)
    {
      GMTrace.i(15248207642624L, 113608);
      this.qlp = paramString1;
      this.iMY = paramString2;
      GMTrace.o(15248207642624L, 113608);
    }
  }
  
  private static final class c
  {
    public static final a qmA;
    
    static
    {
      GMTrace.i(8193723858944L, 61048);
      qmA = new a();
      GMTrace.o(8193723858944L, 61048);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */