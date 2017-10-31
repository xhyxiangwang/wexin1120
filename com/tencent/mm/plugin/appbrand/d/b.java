package com.tencent.mm.plugin.appbrand.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.h.a;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public final class b
{
  public h.a hAM;
  public Vector<d.b> iGq;
  public Vector<d.a> iGr;
  public HashMap<String, d.c> iGs;
  public i.a iGt;
  
  public b()
  {
    GMTrace.i(14285598097408L, 106436);
    this.iGr = new Vector();
    this.iGq = new Vector();
    this.hAM = new h.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(14286671839232L, 106444);
        Object localObject1;
        Object localObject2;
        if (paramAnonymouskeep_ProgressInfo == null)
        {
          localObject1 = "null";
          if (paramAnonymouskeep_SceneResult != null) {
            break label118;
          }
          localObject2 = "null";
          label25:
          w.i("MicroMsg.AppbrandCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), localObject1, localObject2 });
          localObject1 = f.Sj();
          if (!bg.mZ(paramAnonymousString)) {
            break label128;
          }
          w.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByMediaID error, media id is null or nil");
          label75:
          break label143;
          label76:
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 != null) {
            break label183;
          }
          w.e("MicroMsg.AppbrandCdnService", "get item by media id failed, media is : %s", new Object[] { paramAnonymousString });
          GMTrace.o(14286671839232L, 106444);
          return 0;
          localObject1 = paramAnonymouskeep_ProgressInfo.toString();
          break;
          label118:
          localObject2 = paramAnonymouskeep_SceneResult.toString();
          break label25;
          label128:
          localObject2 = ((c)localObject1).iGv.values().iterator();
          label143:
          if (!((Iterator)localObject2).hasNext()) {
            break label76;
          }
          localObject1 = (a)((Iterator)localObject2).next();
          if (!bg.mY(((a)localObject1).mediaId).equals(paramAnonymousString)) {
            break label75;
          }
        }
        label183:
        if (paramAnonymousInt == 44531)
        {
          w.i("MicroMsg.AppbrandCdnService", "duplicate request, ignore this request, media id is %s", new Object[] { paramAnonymousString });
          GMTrace.o(14286671839232L, 106444);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          w.e("MicroMsg.AppbrandCdnService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          b.this.a(false, ((a)localObject1).fAx, ((a)localObject1).mediaId, null);
          GMTrace.o(14286671839232L, 106444);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          w.i("MicroMsg.AppbrandCdnService", "progressInfo : %s", new Object[] { paramAnonymouskeep_ProgressInfo.toString() });
          paramAnonymousInt = 0;
          if (paramAnonymouskeep_ProgressInfo.field_toltalLength > 0) {
            paramAnonymousInt = paramAnonymouskeep_ProgressInfo.field_finishedLength * 100 / paramAnonymouskeep_ProgressInfo.field_toltalLength;
          }
          if (paramAnonymousInt < 0) {
            paramAnonymousInt = 0;
          }
        }
        label539:
        label696:
        for (;;)
        {
          paramAnonymouskeep_ProgressInfo = b.this;
          paramAnonymousBoolean = ((a)localObject1).iGn;
          int i = ((a)localObject1).fzJ;
          paramAnonymousString = ((a)localObject1).fAx;
          w.i("MicroMsg.AppbrandCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(i), Integer.valueOf(paramAnonymousInt), paramAnonymousString, ((a)localObject1).mediaId });
          if ((paramAnonymouskeep_ProgressInfo.iGr != null) && (paramAnonymouskeep_ProgressInfo.iGr.size() > 0))
          {
            paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_ProgressInfo.iGr.iterator();
            for (;;)
            {
              if (paramAnonymouskeep_ProgressInfo.hasNext())
              {
                ((d.a)paramAnonymouskeep_ProgressInfo.next()).u(paramAnonymousInt, paramAnonymousString);
                continue;
                if (paramAnonymousInt <= 100) {
                  break label696;
                }
                paramAnonymousInt = 100;
                break;
              }
            }
          }
          GMTrace.o(14286671839232L, 106444);
          return 0;
          if (paramAnonymouskeep_SceneResult != null)
          {
            if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
              break label539;
            }
            w.e("MicroMsg.AppbrandCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
            b.this.a(false, ((a)localObject1).fAx, ((a)localObject1).mediaId, null);
          }
          do
          {
            GMTrace.o(14286671839232L, 106444);
            return 0;
            w.i("MicroMsg.AppbrandCdnService", "cdn trans suceess, media id : %s", new Object[] { paramAnonymousString });
          } while (localObject1 == null);
          if (((a)localObject1).iGm == null) {
            ((a)localObject1).iGm = new a.a();
          }
          if (paramAnonymouskeep_SceneResult == null) {
            w.e("MicroMsg.AppBrandMediaCdnItem", "sceneResult info is null");
          }
          for (;;)
          {
            f.Sj().a((a)localObject1);
            b.this.a(true, ((a)localObject1).fAx, ((a)localObject1).iGl, ((a)localObject1).iGm.field_fileUrl);
            break;
            ((a)localObject1).iGm.field_aesKey = paramAnonymouskeep_SceneResult.field_aesKey;
            ((a)localObject1).iGm.field_fileId = paramAnonymouskeep_SceneResult.field_fileId;
            ((a)localObject1).iGm.field_fileUrl = paramAnonymouskeep_SceneResult.field_fileUrl;
            ((a)localObject1).iGm.field_fileLength = paramAnonymouskeep_SceneResult.field_fileLength;
            ((a)localObject1).iGl = ((a)localObject1).iGm.field_fileId;
          }
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(14286403403776L, 106442);
        w.i("MicroMsg.AppbrandCdnService", "getCdnAuthInfo, mediaId = %s", new Object[] { paramAnonymousString });
        GMTrace.o(14286403403776L, 106442);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(14286537621504L, 106443);
        w.i("MicroMsg.AppbrandCdnService", "decodePrepareResponse, mediaId = %s", new Object[] { paramAnonymousString });
        GMTrace.o(14286537621504L, 106443);
        return null;
      }
    };
    this.iGs = new HashMap();
    this.iGt = new i.a()
    {
      public final void f(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(17398912516096L, 129632);
        w.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on progress [%s %d %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        paramAnonymousString = (d.c)b.this.iGs.get(paramAnonymousString);
        if (paramAnonymousString != null) {
          paramAnonymousString.bm(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(17398912516096L, 129632);
      }
      
      public final void onDataAvailable(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(17398778298368L, 129631);
        w.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on data available [%s %d %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        paramAnonymousString = (d.c)b.this.iGs.get(paramAnonymousString);
        if (paramAnonymousString != null) {
          paramAnonymousString.bl(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(17398778298368L, 129631);
      }
      
      public final void onMoovReady(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(17398644080640L, 129630);
        w.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on moov ready [%s %d %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        paramAnonymousString = (d.c)b.this.iGs.get(paramAnonymousString);
        if (paramAnonymousString != null) {
          paramAnonymousString.bk(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(17398644080640L, 129630);
      }
      
      public final void y(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(17399046733824L, 129633);
        w.i("MicroMsg.AppbrandCdnService", "appbrand cdn service on finish [%s %d]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
        d.c localc = (d.c)b.this.iGs.get(paramAnonymousString);
        if (localc != null) {
          localc.y(paramAnonymousString, paramAnonymousInt);
        }
        GMTrace.o(17399046733824L, 129633);
      }
    };
    GMTrace.o(14285598097408L, 106436);
  }
  
  public static boolean ou(String paramString)
  {
    GMTrace.i(14286000750592L, 106439);
    a locala = f.Sj().ow(paramString);
    if (locala == null)
    {
      w.e("MicroMsg.AppbrandCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString });
      GMTrace.o(14286000750592L, 106439);
      return false;
    }
    boolean bool = g.Gi().jm(locala.mediaId);
    GMTrace.o(14286000750592L, 106439);
    return bool;
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(14285866532864L, 106438);
    if ((this.iGr != null) && (parama != null)) {
      this.iGr.remove(parama);
    }
    GMTrace.o(14285866532864L, 106438);
  }
  
  public final void a(d.b paramb)
  {
    GMTrace.i(14285732315136L, 106437);
    if ((this.iGq != null) && (paramb != null)) {
      this.iGq.remove(paramb);
    }
    GMTrace.o(14285732315136L, 106437);
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16054050881536L, 119612);
    if ((this.iGq != null) && (this.iGq.size() > 0))
    {
      Iterator localIterator = this.iGq.iterator();
      while (localIterator.hasNext()) {
        ((d.b)localIterator.next()).b(paramBoolean, paramString1, paramString2, paramString3);
      }
    }
    GMTrace.o(16054050881536L, 119612);
  }
  
  public final void ov(String paramString)
  {
    GMTrace.i(17399717822464L, 129638);
    this.iGs.remove(paramString);
    GMTrace.o(17399717822464L, 129638);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */