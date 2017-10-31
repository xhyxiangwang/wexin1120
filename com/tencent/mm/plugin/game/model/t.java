package com.tencent.mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class t
{
  public t()
  {
    GMTrace.i(12588549144576L, 93792);
    GMTrace.o(12588549144576L, 93792);
  }
  
  static boolean a(q paramq1, q paramq2)
  {
    GMTrace.i(12588683362304L, 93793);
    if (paramq1.field_weight.compareTo(paramq2.field_weight) >= 0)
    {
      GMTrace.o(12588683362304L, 93793);
      return true;
    }
    GMTrace.o(12588683362304L, 93793);
    return false;
  }
  
  public static q aEr()
  {
    GMTrace.i(12588951797760L, 93795);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWQ, Long.valueOf(0L))).longValue();
    if (l != 0L) {}
    for (q localq = SubCoreGameCenter.aFe().cw(l);; localq = null)
    {
      if ((localq == null) || (localq.field_isHidden) || (d(localq)))
      {
        ai.zg("");
        GMTrace.o(12588951797760L, 93795);
        return null;
      }
      GMTrace.o(12588951797760L, 93795);
      return localq;
    }
  }
  
  public static void aEs()
  {
    GMTrace.i(12589086015488L, 93796);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWQ, Long.valueOf(0L))).longValue();
    q localq = null;
    if (l != 0L) {
      localq = SubCoreGameCenter.aFe().cw(l);
    }
    if ((localq == null) || (localq.field_isHidden))
    {
      GMTrace.o(12589086015488L, 93796);
      return;
    }
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uWQ, Long.valueOf(0L));
    GMTrace.o(12589086015488L, 93796);
  }
  
  public static q aEt()
  {
    GMTrace.i(12589220233216L, 93797);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWU, Long.valueOf(0L))).longValue();
    if (l == 0L)
    {
      GMTrace.o(12589220233216L, 93797);
      return null;
    }
    q localq = SubCoreGameCenter.aFe().cw(l);
    if ((localq == null) || (localq.field_isHidden) || (d(localq)))
    {
      GMTrace.o(12589220233216L, 93797);
      return null;
    }
    GMTrace.o(12589220233216L, 93797);
    return localq;
  }
  
  public static void aEu()
  {
    GMTrace.i(12589354450944L, 93798);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWU, Long.valueOf(0L))).longValue();
    q localq = null;
    if (l != 0L) {
      localq = SubCoreGameCenter.aFe().cw(l);
    }
    if ((localq == null) || (localq.field_isHidden))
    {
      GMTrace.o(12589354450944L, 93798);
      return;
    }
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uWU, Long.valueOf(0L));
    GMTrace.o(12589354450944L, 93798);
  }
  
  public static q aEv()
  {
    GMTrace.i(12589488668672L, 93799);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWR, Long.valueOf(0L))).longValue();
    if (l == 0L)
    {
      GMTrace.o(12589488668672L, 93799);
      return null;
    }
    q localq = SubCoreGameCenter.aFe().cw(l);
    if ((localq == null) || (localq.field_isHidden) || (d(localq)))
    {
      GMTrace.o(12589488668672L, 93799);
      return null;
    }
    GMTrace.o(12589488668672L, 93799);
    return localq;
  }
  
  public static void aEw()
  {
    GMTrace.i(12589622886400L, 93800);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWR, Long.valueOf(0L))).longValue();
    q localq = null;
    if (l != 0L) {
      localq = SubCoreGameCenter.aFe().cw(l);
    }
    if ((localq == null) || (localq.field_isHidden))
    {
      GMTrace.o(12589622886400L, 93800);
      return;
    }
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uWR, Long.valueOf(0L));
    GMTrace.o(12589622886400L, 93800);
  }
  
  public static q aEx()
  {
    GMTrace.i(12589757104128L, 93801);
    ap.AS();
    long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWT, Long.valueOf(0L))).longValue();
    q localq = SubCoreGameCenter.aFe().cw(l);
    GMTrace.o(12589757104128L, 93801);
    return localq;
  }
  
  private static boolean d(q paramq)
  {
    GMTrace.i(12589891321856L, 93802);
    long l = System.currentTimeMillis() / 1000L;
    if (paramq.field_expireTime < l)
    {
      GMTrace.o(12589891321856L, 93802);
      return true;
    }
    GMTrace.o(12589891321856L, 93802);
    return false;
  }
  
  static void e(q paramq)
  {
    GMTrace.i(12590025539584L, 93803);
    if (bg.mZ(paramq.field_mergerId))
    {
      GMTrace.o(12590025539584L, 93803);
      return;
    }
    Object localObject2 = SubCoreGameCenter.aFe();
    Object localObject1 = paramq.field_mergerId;
    int i = paramq.field_msgType;
    String str = "select * from GameRawMessage where msgType=" + i + " and mergerId= \"" + (String)localObject1 + "\" order by createTime desc limit 1";
    localObject1 = new q();
    localObject2 = ((u)localObject2).rawQuery(str, new String[0]);
    if (localObject2 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        ((q)localObject1).aEq();
        if (!bg.bX(((q)localObject1).mAo))
        {
          paramq.aEq();
          localObject2 = new LinkedList(((q)localObject1).mAo);
          if (!bg.bX(paramq.mAo))
          {
            str = ((q.h)paramq.mAo.get(0)).userName;
            if (!bg.mZ(str))
            {
              Iterator localIterator = ((q)localObject1).mAo.iterator();
              while (localIterator.hasNext())
              {
                q.h localh = (q.h)localIterator.next();
                if (localh.userName.equals(str)) {
                  ((LinkedList)localObject2).remove(localh);
                }
              }
            }
          }
          if (!bg.bX((List)localObject2)) {
            paramq.field_rawXML = aj.a(paramq.field_rawXML, (LinkedList)localObject2, ((q)localObject1).mAt);
          }
          SubCoreGameCenter.aFe().a((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
        }
      }
      GMTrace.o(12590025539584L, 93803);
      return;
      if (((Cursor)localObject2).moveToFirst()) {
        ((q)localObject1).b((Cursor)localObject2);
      }
      ((Cursor)localObject2).close();
    }
  }
  
  public final void a(lp paramlp)
  {
    GMTrace.i(12588817580032L, 93794);
    q localq = aEr();
    if (localq == null)
    {
      GMTrace.o(12588817580032L, 93794);
      return;
    }
    localq.aEq();
    ai.zg(localq.mAY);
    paramlp.fJu.showType = localq.mAq.mBf;
    paramlp.fJu.appId = localq.field_appId;
    paramlp.fJu.appName = localq.mAq.jzo;
    paramlp.fJu.fJv = localq.mAq.mBd;
    paramlp.fJu.msgType = localq.field_msgType;
    if (localq.field_msgType == 100) {
      paramlp.fJu.msgType = localq.mAX;
    }
    paramlp.fJu.fJw = localq.field_gameMsgId;
    paramlp.fJu.fuy = localq.mAY;
    GMTrace.o(12588817580032L, 93794);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */