package com.tencent.mm.plugin.appbrand.appcache;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
{
  public static final Runnable iBR;
  
  static
  {
    GMTrace.i(10606287519744L, 79023);
    iBR = new Runnable()
    {
      private static void SM()
      {
        Object localObject1 = null;
        GMTrace.i(10596892278784L, 78953);
        Object localObject2 = f.Sh();
        Object localObject4 = ((v)localObject2).iCj.a(String.format("select distinct %s from %s ", new Object[] { "appId", "AppBrandWxaPkgManifestRecord" }), null, 2);
        Object localObject3 = new ArrayList();
        while (((Cursor)localObject4).moveToNext()) {
          ((List)localObject3).add(((Cursor)localObject4).getString(0));
        }
        ((Cursor)localObject4).close();
        if (bg.bX((List)localObject3)) {}
        while (bg.bX((List)localObject1))
        {
          GMTrace.o(10596892278784L, 78953);
          return;
          localObject1 = new LinkedList();
          localObject3 = ((List)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = ((v)localObject2).q((String)((Iterator)localObject3).next(), 0, 2);
            if (!bg.bX((List)localObject4)) {
              ((List)localObject1).addAll((Collection)localObject4);
            }
          }
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (r)((Iterator)localObject1).next();
          com.tencent.mm.loader.stub.b.deleteFile(((r)localObject2).field_pkgPath);
          f.Sh().a((r)localObject2);
          f.Sn().S(((r)localObject2).field_appId, ((r)localObject2).field_version);
        }
        GMTrace.o(10596892278784L, 78953);
      }
      
      private static void SN()
      {
        GMTrace.i(10597026496512L, 78954);
        Object localObject1 = new File(o.SA());
        if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
        {
          GMTrace.o(10597026496512L, 78954);
          return;
        }
        localObject1 = ((File)localObject1).listFiles();
        int j = localObject1.length;
        int i = 0;
        if (i < j)
        {
          Object localObject2 = localObject1[i];
          Object localObject4 = f.Sh();
          Object localObject3 = ((File)localObject2).getAbsolutePath();
          localObject4 = ((v)localObject4).iCj;
          String str = String.format("%s=?", new Object[] { "pkgPath" });
          localObject3 = ((g)localObject4).a("AppBrandWxaPkgManifestRecord", new String[] { "appId" }, str, new String[] { localObject3 }, null, null, null, 2);
          boolean bool;
          if (localObject3 == null) {
            bool = false;
          }
          for (;;)
          {
            if (!bool) {
              com.tencent.mm.loader.stub.b.deleteFile(((File)localObject2).getAbsolutePath());
            }
            i += 1;
            break;
            bool = ((Cursor)localObject3).moveToFirst();
            ((Cursor)localObject3).close();
          }
        }
        GMTrace.o(10597026496512L, 78954);
      }
      
      public final void run()
      {
        GMTrace.i(10597160714240L, 78955);
        for (;;)
        {
          Object localObject2;
          Object localObject3;
          try
          {
            Object localObject1 = f.Sh();
            localObject2 = new StringBuilder("debugType");
            ((StringBuilder)localObject2).append(" in (");
            localObject3 = c.iAD;
            int j = localObject3.length;
            int i = 0;
            if (i < j)
            {
              ((StringBuilder)localObject2).append(localObject3[i]).append(',');
              i += 1;
              continue;
            }
            ((StringBuilder)localObject2).append(-1).append(')');
            localObject2 = ((StringBuilder)localObject2).toString();
            localObject2 = ((v)localObject1).iCj.a("AppBrandWxaPkgManifestRecord", null, (String)localObject2, null, null, null, null, 2);
            if (localObject2 == null)
            {
              localObject1 = null;
              if (bg.bX((List)localObject1)) {
                break;
              }
              long l = bg.Po();
              localObject1 = ((List)localObject1).iterator();
              if (!((Iterator)localObject1).hasNext()) {
                break;
              }
              localObject2 = (r)((Iterator)localObject1).next();
              if ((((r)localObject2).field_endTime <= 0L) || (((r)localObject2).field_endTime > l)) {
                continue;
              }
              com.tencent.mm.loader.stub.b.deleteFile(((r)localObject2).field_pkgPath);
              f.Sh().a((r)localObject2);
              com.tencent.mm.plugin.appbrand.task.b.at(((r)localObject2).field_appId, ((r)localObject2).field_debugType);
              continue;
            }
            if (((Cursor)localObject2).moveToFirst()) {
              break label267;
            }
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.AppBrand.WxaPkgPruner", "prune running, exp = %s", new Object[] { bg.f(localException) });
            GMTrace.o(10597160714240L, 78955);
            return;
          }
          ((Cursor)localObject2).close();
          ArrayList localArrayList = null;
          continue;
          label267:
          localArrayList = new ArrayList();
          do
          {
            localObject3 = new r();
            ((r)localObject3).b((Cursor)localObject2);
            localArrayList.add(localObject3);
          } while (((Cursor)localObject2).moveToNext());
          ((Cursor)localObject2).close();
        }
        SM();
        SN();
        GMTrace.o(10597160714240L, 78955);
      }
    };
    GMTrace.o(10606287519744L, 79023);
  }
  
  public static void SL()
  {
    GMTrace.i(10606153302016L, 79022);
    d.xC().C(iBR);
    GMTrace.o(10606153302016L, 79022);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */