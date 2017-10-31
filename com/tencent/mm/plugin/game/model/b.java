package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.downloader.e.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  public LinkedList<String> myV;
  public LinkedList<f> myW;
  
  public b()
  {
    GMTrace.i(12627203850240L, 94080);
    this.myW = new LinkedList();
    this.myV = new LinkedList();
    GMTrace.o(12627203850240L, 94080);
  }
  
  private void aDZ()
  {
    GMTrace.i(12627606503424L, 94083);
    Object localObject1 = new ArrayList();
    ap.AS();
    Object localObject2 = c.yR().rawQuery("select * from FileDownloadInfo where status=3", new String[0]);
    if (localObject2 == null) {}
    while (!((List)localObject1).isEmpty())
    {
      localObject1 = ((List)localObject1).iterator();
      Object localObject3;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if ((!bg.mZ((String)localObject2)) && (!this.myV.contains(localObject2)))
        {
          localObject3 = g.aM((String)localObject2, false);
          if ((localObject3 != null) && (!this.myW.contains(localObject3)))
          {
            this.myW.add(localObject3);
            this.myV.add(localObject2);
          }
        }
      }
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new a();
        ((a)localObject3).b((Cursor)localObject2);
        if ((!bg.mZ(((a)localObject3).field_appId)) && (((a)localObject3).field_appId.startsWith("wx")) && (((a)localObject3).field_status == 3) && (!((a)localObject3).field_autoDownload) && (e.aZ(((a)localObject3).field_filePath)) && (!((List)localObject1).contains(((a)localObject3).field_appId))) {
          ((List)localObject1).add(((a)localObject3).field_appId);
        }
      }
      ((Cursor)localObject2).close();
    }
    GMTrace.o(12627606503424L, 94083);
  }
  
  private void cw(Context paramContext)
  {
    GMTrace.i(12627472285696L, 94082);
    Object localObject = an.aUV().bGD();
    LinkedList localLinkedList = new LinkedList();
    if (localObject == null)
    {
      w.e("MicroMsg.GameAppCacheService", "getInstalledGame faild: curosr is null");
      GMTrace.o(12627472285696L, 94082);
      return;
    }
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        f localf = new f();
        localf.b((Cursor)localObject);
        if ((g.a(paramContext, localf)) && (!this.myV.contains(localf.field_appId)))
        {
          w.i("MicroMsg.GameAppCacheService", "installed game:[%s][%s]", new Object[] { localf.field_appName, localf.field_appId });
          this.myW.add(localf);
          this.myV.add(localf.field_appId);
        }
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    paramContext = localLinkedList.iterator();
    while (paramContext.hasNext())
    {
      localObject = (f)paramContext.next();
      this.myW.add(localObject);
      this.myV.add(((f)localObject).field_appId);
    }
    GMTrace.o(12627472285696L, 94082);
  }
  
  public final void init(Context paramContext)
  {
    GMTrace.i(12627338067968L, 94081);
    if (this.myW == null)
    {
      this.myW = new LinkedList();
      if (this.myV != null) {
        break label128;
      }
      this.myV = new LinkedList();
    }
    for (;;)
    {
      long l1 = System.currentTimeMillis();
      cw(paramContext);
      long l2 = System.currentTimeMillis();
      aDZ();
      long l3 = System.currentTimeMillis();
      w.i("MicroMsg.GameAppCacheService", "Init time: %d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(l3 - l1) });
      GMTrace.o(12627338067968L, 94081);
      return;
      this.myW.clear();
      break;
      label128:
      this.myV.clear();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */