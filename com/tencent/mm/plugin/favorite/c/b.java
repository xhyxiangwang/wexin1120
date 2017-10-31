package com.tencent.mm.plugin.favorite.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.network.m;
import com.tencent.mm.network.m.a;
import com.tencent.mm.plugin.favorite.b.ad;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class b
  implements com.tencent.mm.ac.e
{
  public static Map<Long, g.a> frX;
  private Queue<j> frV;
  public boolean frZ;
  public boolean fsa;
  public long fsc;
  public aj fsg;
  public m hrU;
  public boolean lQm;
  
  static
  {
    GMTrace.i(6482582044672L, 48299);
    frX = new HashMap();
    GMTrace.o(6482582044672L, 48299);
  }
  
  public b()
  {
    GMTrace.i(6480837214208L, 48286);
    this.fsa = false;
    this.fsc = 0L;
    this.frZ = false;
    this.frV = new LinkedList();
    this.hrU = new m.a()
    {
      public final void db(int paramAnonymousInt)
      {
        Iterator localIterator = null;
        GMTrace.i(6496809123840L, 48405);
        boolean bool;
        b localb;
        for (;;)
        {
          Object localObject1;
          Object localObject2;
          try
          {
            bool = am.isWifi(ab.getContext());
            if ((paramAnonymousInt != 4) && (paramAnonymousInt != 6))
            {
              b.this.lQm = bool;
              GMTrace.o(6496809123840L, 48405);
              return;
            }
            w.i("MicroMsg.CheckFavCdnService", "onNetworkChange st:%d isWifi:%B, lastIsWifi:%B", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(bool), Boolean.valueOf(b.this.lQm) });
            if ((b.this.lQm) || (!bool)) {
              break label360;
            }
            localb = b.this;
            localObject1 = h.awD();
            localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lOE + " from FavItemInfo where itemStatus" + "=3";
            localObject1 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).gMB.rawQuery((String)localObject2, null);
            if (localObject1 == null)
            {
              if ((localIterator == null) || (localIterator.size() <= 0)) {
                break label360;
              }
              w.i("MicroMsg.CheckFavCdnService", "startAll list.size:%d", new Object[] { Integer.valueOf(localIterator.size()) });
              localIterator = localIterator.iterator();
              if (!localIterator.hasNext()) {
                break;
              }
              localObject1 = (j)localIterator.next();
              if (((j)localObject1).field_itemStatus != 3) {
                continue;
              }
              ((j)localObject1).field_itemStatus = 1;
              h.awD().a((j)localObject1, new String[] { "localId" });
              continue;
            }
            if (((Cursor)localObject1).getCount() != 0) {
              break label299;
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("MicroMsg.CheckFavCdnService", localException, "", new Object[0]);
            GMTrace.o(6496809123840L, 48405);
            return;
          }
          ((Cursor)localObject1).close();
          continue;
          label299:
          LinkedList localLinkedList = new LinkedList();
          while (((Cursor)localObject1).moveToNext())
          {
            localObject2 = new j();
            ((j)localObject2).b((Cursor)localObject1);
            localLinkedList.add(localObject2);
          }
          ((Cursor)localObject1).close();
        }
        localb.run();
        label360:
        b.this.lQm = bool;
        GMTrace.o(6496809123840L, 48405);
      }
    };
    this.fsg = new aj(ap.xC().nTP.getLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(6479360819200L, 48275);
        try
        {
          b.this.qL();
          GMTrace.o(6479360819200L, 48275);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.CheckFavCdnService", localException, "", new Object[0]);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6479495036928L, 48276);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(6479495036928L, 48276);
        return str;
      }
    }, false);
    this.lQm = am.isWifi(ab.getContext());
    ap.a(this.hrU);
    ap.wT().a(404, this);
    GMTrace.o(6480837214208L, 48286);
  }
  
  public final void a(final int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6480971431936L, 48287);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6488219189248L, 48341);
        if (paramk.getType() != 404)
        {
          GMTrace.o(6488219189248L, 48341);
          return;
        }
        if (!(paramk instanceof ad))
        {
          GMTrace.o(6488219189248L, 48341);
          return;
        }
        b.this.frZ = false;
        long l = ((ad)paramk).lPM.field_localId;
        j localj = ((ad)paramk).lPM;
        b.frX.remove(Long.valueOf(l));
        if (paramInt1 != 0)
        {
          w.e("MicroMsg.CheckFavCdnService", "achieved retry limit, set error, localId:%d", new Object[] { Long.valueOf(l) });
          g.paX.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(-2), Long.valueOf(x.k(localj)), Long.valueOf(x.ch(localj.field_localId)) });
          h.awD().r(3, l);
        }
        b.this.qL();
        GMTrace.o(6488219189248L, 48341);
      }
      
      public final String toString()
      {
        GMTrace.i(6488353406976L, 48342);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(6488353406976L, 48342);
        return str;
      }
    });
    GMTrace.o(6480971431936L, 48287);
  }
  
  public final void qL()
  {
    GMTrace.i(16032307609600L, 119450);
    this.fsc = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if ((!this.frZ) && (this.frV.size() == 0))
    {
      localObject1 = h.awD();
      localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lOE + " from FavItemInfo where itemStatus" + "=1";
      localObject2 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).gMB.a((String)localObject2, null, 2);
      if (localObject2 == null)
      {
        localObject1 = null;
        if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
          break label194;
        }
      }
    }
    else
    {
      label99:
      if ((this.frZ) || (this.frV.size() > 0)) {
        break label363;
      }
      qM();
      w.d("MicroMsg.CheckFavCdnService", "klem No Data Any More , Stop Service");
      GMTrace.o(16032307609600L, 119450);
      return;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new LinkedList();
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
      label194:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        if (frX.containsKey(Long.valueOf(((j)localObject2).field_localId)))
        {
          w.d("MicroMsg.CheckFavCdnService", "File is Already running:" + ((j)localObject2).field_localId);
        }
        else
        {
          this.frV.add(localObject2);
          frX.put(Long.valueOf(((j)localObject2).field_localId), null);
        }
      }
      w.d("MicroMsg.CheckFavCdnService", "klem GetNeedRun procing:" + frX.size() + ",send:" + this.frV.size() + "]");
      this.frV.size();
      break label99;
      label363:
      if ((!this.frZ) && (this.frV.size() > 0))
      {
        localObject1 = (j)this.frV.poll();
        if ((localObject1 != null) && (((j)localObject1).field_localId > 0L))
        {
          this.frZ = true;
          localObject1 = new ad((j)localObject1);
          ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
        }
      }
      GMTrace.o(16032307609600L, 119450);
      return;
      localObject1 = null;
    }
  }
  
  public final void qM()
  {
    GMTrace.i(6481239867392L, 48289);
    this.frV.clear();
    frX.clear();
    this.fsa = false;
    this.frZ = false;
    GMTrace.o(6481239867392L, 48289);
  }
  
  public final void run()
  {
    GMTrace.i(6481105649664L, 48288);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6488890277888L, 48346);
        long l = System.currentTimeMillis() - b.this.fsc;
        if (b.this.fsa)
        {
          if (l < 60000L)
          {
            GMTrace.o(6488890277888L, 48346);
            return;
          }
          w.e("MicroMsg.CheckFavCdnService", "klem ERR: Try Run service runningFlag:" + b.this.fsa + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + b.this.fsa);
        }
        b.this.frZ = false;
        b.this.fsa = true;
        b.this.fsg.w(10L, 10L);
        GMTrace.o(6488890277888L, 48346);
      }
      
      public final String toString()
      {
        GMTrace.i(6489024495616L, 48347);
        String str = super.toString() + "|run";
        GMTrace.o(6489024495616L, 48347);
        return str;
      }
    });
    GMTrace.o(6481105649664L, 48288);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */