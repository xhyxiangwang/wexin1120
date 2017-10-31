package com.tencent.mm.plugin.favorite.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.favorite.b.aa;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class h
  implements com.tencent.mm.ac.e
{
  public static Map<Long, g.a> frX;
  public static Map<Long, Integer> lQA;
  public static Set<Long> lQO;
  private Queue<j> frV;
  public boolean frZ;
  public boolean fsa;
  public int fsb;
  public long fsc;
  public aj fsg;
  private int hTl;
  
  static
  {
    GMTrace.i(6491977285632L, 48369);
    frX = new HashMap();
    lQA = new HashMap();
    lQO = new HashSet();
    GMTrace.o(6491977285632L, 48369);
  }
  
  public h()
  {
    GMTrace.i(6489695584256L, 48352);
    this.fsa = false;
    this.fsb = 0;
    this.fsc = 0L;
    this.frZ = false;
    this.frV = new LinkedList();
    this.hTl = 0;
    this.fsg = new aj(ap.xC().nTP.getLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(6483924221952L, 48309);
        try
        {
          h.this.axz();
          GMTrace.o(6483924221952L, 48309);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.SendFavService", localException, "", new Object[0]);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6484058439680L, 48310);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(6484058439680L, 48310);
        return str;
      }
    }, false);
    ap.wT().a(401, this);
    GMTrace.o(6489695584256L, 48352);
  }
  
  public final void a(final int paramInt1, final int paramInt2, String paramString, final com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6489829801984L, 48353);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6498151301120L, 48415);
        if (paramk.getType() != 401)
        {
          GMTrace.o(6498151301120L, 48415);
          return;
        }
        if (!(paramk instanceof aa))
        {
          GMTrace.o(6498151301120L, 48415);
          return;
        }
        h.this.frZ = false;
        j localj = ((aa)paramk).lPF;
        long l = localj.field_localId;
        h.frX.remove(Long.valueOf(l));
        if (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt2 == 65136)) {
          h.lQO.add(Long.valueOf(l));
        }
        if ((paramInt1 != 0) && (paramInt2 != 65136))
        {
          localObject = h.this;
          ((h)localObject).fsb -= 1;
        }
        Integer localInteger = Integer.valueOf(bg.a((Integer)h.lQA.get(Long.valueOf(l)), 0));
        Object localObject = localInteger;
        if (paramInt1 != 1)
        {
          localObject = localInteger;
          if (paramInt1 != 0)
          {
            localObject = Integer.valueOf(localInteger.intValue() - 1);
            h.lQA.put(Long.valueOf(localj.field_localId), localObject);
          }
        }
        if (((Integer)localObject).intValue() <= 0)
        {
          int i = x.bZ(paramInt1, paramInt2);
          g.paX.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(i), Long.valueOf(x.k(localj)), Long.valueOf(x.ch(localj.field_localId)) });
          h.lQA.remove(Long.valueOf(l));
          w.e("MicroMsg.SendFavService", "achieved retry limit, set error, localId:%d", new Object[] { Long.valueOf(l) });
          if (localj.field_itemStatus == 12) {
            com.tencent.mm.plugin.favorite.h.awD().r(14, localj.field_localId);
          }
          if (localj.field_itemStatus == 9) {
            com.tencent.mm.plugin.favorite.h.awD().r(11, localj.field_localId);
          }
        }
        if (h.this.fsb > 0)
        {
          if (!h.this.axz())
          {
            x.startSync();
            GMTrace.o(6498151301120L, 48415);
          }
        }
        else
        {
          w.d("MicroMsg.SendFavService", "klem stopFlag <= 0 , Stop Service");
          h.this.qM();
        }
        GMTrace.o(6498151301120L, 48415);
      }
      
      public final String toString()
      {
        GMTrace.i(6498285518848L, 48416);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(6498285518848L, 48416);
        return str;
      }
    });
    GMTrace.o(6489829801984L, 48353);
  }
  
  public final boolean axz()
  {
    GMTrace.i(16032710262784L, 119453);
    this.fsc = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if ((!this.frZ) && (this.frV.size() == 0))
    {
      localObject1 = com.tencent.mm.plugin.favorite.h.awD();
      localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lOE + " from FavItemInfo where (itemStatus" + "=9 or itemStatus" + "=12)";
      localObject2 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).gMB.a((String)localObject2, null, 2);
      if (localObject2 == null)
      {
        localObject1 = null;
        if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
          break label200;
        }
      }
    }
    else
    {
      label104:
      if ((this.frZ) || (this.frV.size() > 0)) {
        break label477;
      }
      qM();
      w.d("MicroMsg.SendFavService", "klem No Data Any More , Stop Service");
      GMTrace.o(16032710262784L, 119453);
      return false;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new ArrayList();
      do
      {
        j localj = new j();
        localj.b((Cursor)localObject2);
        ((List)localObject1).add(localj);
      } while (((Cursor)localObject2).moveToNext());
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      label200:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        if (lQO.contains(Long.valueOf(((j)localObject2).field_localId)))
        {
          w.d("MicroMsg.SendFavService", "info has existed, id %d, localId %d, sourceType %d, sourceId %s", new Object[] { Integer.valueOf(((j)localObject2).field_id), Long.valueOf(((j)localObject2).field_localId), Integer.valueOf(((j)localObject2).field_sourceType), ((j)localObject2).field_sourceId });
        }
        else if (frX.containsKey(Long.valueOf(((j)localObject2).field_localId)))
        {
          w.d("MicroMsg.SendFavService", "File is Already running:" + ((j)localObject2).field_localId);
        }
        else
        {
          if (!lQA.containsKey(Long.valueOf(((j)localObject2).field_localId))) {
            lQA.put(Long.valueOf(((j)localObject2).field_localId), Integer.valueOf(3));
          }
          this.frV.add(localObject2);
          frX.put(Long.valueOf(((j)localObject2).field_localId), null);
        }
      }
      w.d("MicroMsg.SendFavService", "klem GetNeedRun procing:" + frX.size() + ",send:" + this.frV.size() + "]");
      this.frV.size();
      break label104;
      label477:
      if ((!this.frZ) && (this.frV.size() > 0))
      {
        localObject1 = (j)this.frV.poll();
        if ((localObject1 != null) && (((j)localObject1).field_localId > 0L))
        {
          this.frZ = true;
          localObject1 = new aa((j)localObject1);
          ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
          GMTrace.o(16032710262784L, 119453);
          return true;
        }
      }
      GMTrace.o(16032710262784L, 119453);
      return false;
      localObject1 = null;
    }
  }
  
  public final void qM()
  {
    GMTrace.i(6490098237440L, 48355);
    w.i("MicroMsg.SendFavService", "on finish");
    this.frV.clear();
    frX.clear();
    this.fsa = false;
    this.frZ = false;
    lQA.clear();
    GMTrace.o(6490098237440L, 48355);
  }
  
  public final void run()
  {
    GMTrace.i(6489964019712L, 48354);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6496406470656L, 48402);
        long l = System.currentTimeMillis() - h.this.fsc;
        if (h.this.fsa)
        {
          if (l < 60000L)
          {
            GMTrace.o(6496406470656L, 48402);
            return;
          }
          w.e("MicroMsg.SendFavService", "klem ERR: Try Run service runningFlag:" + h.this.fsa + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + h.this.fsa);
        }
        h.this.frZ = false;
        h.this.fsa = true;
        h.this.fsb = 3;
        h.this.fsg.w(10L, 10L);
        GMTrace.o(6496406470656L, 48402);
      }
      
      public final String toString()
      {
        GMTrace.i(6496540688384L, 48403);
        String str = super.toString() + "|run";
        GMTrace.o(6496540688384L, 48403);
        return str;
      }
    });
    GMTrace.o(6489964019712L, 48354);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */