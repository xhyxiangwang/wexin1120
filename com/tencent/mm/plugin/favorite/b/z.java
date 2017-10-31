package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.favorite.c.d;
import com.tencent.mm.protocal.c.anp;
import com.tencent.mm.protocal.c.ans;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.st;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class z
{
  public static void a(long paramLong, LinkedList<anp> paramLinkedList, LinkedList<ans> paramLinkedList1)
  {
    GMTrace.i(6261928099840L, 46655);
    Object localObject1 = new anp();
    ((anp)localObject1).ujy = 4;
    ((anp)localObject1).ujz = 0;
    paramLinkedList.add(localObject1);
    localObject1 = com.tencent.mm.plugin.favorite.h.awy();
    paramLinkedList = new LinkedList();
    Object localObject2 = "select * from FavCdnInfo where favLocalId = " + paramLong + " and type = 0" + " and status = 3";
    localObject1 = ((b)localObject1).gMB.a((String)localObject2, null, 2);
    if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst())) {
      do
      {
        localObject2 = new a();
        ((a)localObject2).b((Cursor)localObject1);
        paramLinkedList.add(localObject2);
      } while (((Cursor)localObject1).moveToNext());
    }
    if (localObject1 != null) {
      ((Cursor)localObject1).close();
    }
    w.v("MicroMsg.FavCdnStorage", "getUploadedInfos size:%d", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    paramLinkedList = paramLinkedList.iterator();
    label545:
    while (paramLinkedList.hasNext())
    {
      localObject1 = (a)paramLinkedList.next();
      boolean bool = x.xm(((a)localObject1).field_dataId);
      if ((bg.mZ(((a)localObject1).field_cdnUrl)) || (bool))
      {
        w.e("MicroMsg.ModFavItemLogic", "setModAfterClientUpload cdnUrl:%s, isThumb:%b,  favLocalId:%d", new Object[] { ((a)localObject1).field_cdnUrl, Boolean.valueOf(bool), Long.valueOf(paramLong) });
      }
      else
      {
        localObject2 = new ans();
        ((ans)localObject2).mFu = ("dataitem." + ((a)localObject1).field_dataId + ".cdn_dataurl");
        ((ans)localObject2).paD = ((a)localObject1).field_cdnUrl;
        paramLinkedList1.add(localObject2);
        localObject2 = new ans();
        ((ans)localObject2).mFu = ("dataitem." + ((a)localObject1).field_dataId + ".cdn_datakey");
        ((ans)localObject2).paD = ((a)localObject1).field_cdnKey;
        paramLinkedList1.add(localObject2);
        localObject2 = new ans();
        ((ans)localObject2).mFu = ("dataitem." + ((a)localObject1).field_dataId);
        ((ans)localObject2).ujE = "datastatus";
        ((ans)localObject2).paD = "0";
        paramLinkedList1.add(localObject2);
        localObject2 = com.tencent.mm.plugin.favorite.h.awD().cc(((a)localObject1).field_favLocalId);
        if (localObject2 != null)
        {
          if (((j)localObject2).field_type == 4) {}
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label545;
            }
            localObject2 = x.a((j)localObject2, ((a)localObject1).field_dataId);
            ans localans = new ans();
            localans.mFu = ("dataitem." + ((a)localObject1).field_dataId + ".stream_videoid");
            localans.paD = ((sp)localObject2).tPh;
            paramLinkedList1.add(localans);
            break;
          }
        }
      }
    }
    GMTrace.o(6261928099840L, 46655);
  }
  
  public static void a(j paramj, int paramInt)
  {
    GMTrace.i(6261793882112L, 46654);
    if (paramj == null)
    {
      w.w("MicroMsg.ModFavItemLogic", "modeTag, item info is null");
      GMTrace.o(6261793882112L, 46654);
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    Object localObject1 = new anp();
    ((anp)localObject1).ujy = 4;
    ((anp)localObject1).ujz = 0;
    localLinkedList1.add(localObject1);
    LinkedList localLinkedList2 = new LinkedList();
    localObject1 = new ans();
    ((ans)localObject1).mFu = "favitem.taglist";
    ((ans)localObject1).jXP = 1;
    Object localObject2 = new StringBuffer();
    int j = paramj.field_tagProto.tQM.size();
    int i = 0;
    while (i < j)
    {
      ((StringBuffer)localObject2).append("<tag>").append(bg.RD((String)paramj.field_tagProto.tQM.get(i))).append("</tag>");
      i += 1;
    }
    ((ans)localObject1).paD = ((StringBuffer)localObject2).toString();
    w.v("MicroMsg.ModFavItemLogic", "do net scene mod tag, id=%d, tag=%s", new Object[] { Integer.valueOf(paramj.field_id), ((ans)localObject1).paD });
    localLinkedList2.add(localObject1);
    if (paramj.field_id > 0)
    {
      localObject1 = new ah(paramj.field_id, localLinkedList1, localLinkedList2);
      ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
      com.tencent.mm.plugin.report.service.g.paX.i(11122, new Object[] { Integer.valueOf(paramj.field_id), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.plugin.favorite.h.aww().awT()), Integer.valueOf(paramInt) });
      GMTrace.o(6261793882112L, 46654);
      return;
    }
    localObject2 = com.tencent.mm.plugin.favorite.h.awB();
    long l = paramj.field_localId;
    i = 0;
    paramj = com.tencent.mm.plugin.favorite.h.awz();
    w.d("MicroMsg.FavModInfoStorage", "get mod info sql %s, {%d, %d}", new Object[] { "select * from FavEditInfo where localId =  ? and type =  ?", Long.valueOf(l), Integer.valueOf(0) });
    localObject1 = paramj.gMB.a("select * from FavEditInfo where localId =  ? and type =  ?", new String[] { String.valueOf(l), "0" }, 2);
    if (localObject1 == null)
    {
      paramj = null;
      localObject1 = paramj;
      if (paramj == null)
      {
        i = 1;
        localObject1 = new g();
      }
      ((g)localObject1).field_localId = l;
      paramj = new st();
      paramj.lQc = localLinkedList1;
      paramj.tQp = localLinkedList2;
      ((g)localObject1).field_modItem = paramj;
      ((g)localObject1).field_time = bg.Pp();
      ((g)localObject1).field_type = 0;
      ((g)localObject1).field_scene = paramInt;
      if (i == 0) {
        break label529;
      }
      com.tencent.mm.plugin.favorite.h.awz().b((c)localObject1);
    }
    for (;;)
    {
      ((d)localObject2).run();
      GMTrace.o(6261793882112L, 46654);
      return;
      paramj = null;
      if (((Cursor)localObject1).moveToFirst())
      {
        paramj = new g();
        paramj.b((Cursor)localObject1);
      }
      ((Cursor)localObject1).close();
      break;
      label529:
      com.tencent.mm.plugin.favorite.h.awz().c((c)localObject1, new String[] { "localId" });
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */