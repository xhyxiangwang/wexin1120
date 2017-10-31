package com.tencent.mm.plugin.favorite.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.favorite.b.ah;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.b.z;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.anp;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class f
  implements com.tencent.mm.ac.e
{
  public static Map<Integer, g.a> frX;
  public static Map<Integer, Integer> lQA;
  private Queue<j> frV;
  public boolean frZ;
  public boolean fsa;
  public int fsb;
  public long fsc;
  public aj fsg;
  
  static
  {
    GMTrace.i(6494661640192L, 48389);
    frX = new HashMap();
    lQA = new HashMap();
    GMTrace.o(6494661640192L, 48389);
  }
  
  public f()
  {
    GMTrace.i(6492514156544L, 48373);
    this.fsa = false;
    this.fsb = 0;
    this.fsc = 0L;
    this.frZ = false;
    this.frV = new LinkedList();
    this.fsg = new aj(ap.xC().nTP.getLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(6477347553280L, 48260);
        try
        {
          f.this.axz();
          GMTrace.o(6477347553280L, 48260);
          return false;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FavModService", localException, "", new Object[0]);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(6477481771008L, 48261);
        String str = super.toString() + "|scenePusher";
        GMTrace.o(6477481771008L, 48261);
        return str;
      }
    }, false);
    ap.wT().a(426, this);
    GMTrace.o(6492514156544L, 48373);
  }
  
  public final void a(final int paramInt1, final int paramInt2, String paramString, final com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6492648374272L, 48374);
    if (paramk.getType() != 426)
    {
      GMTrace.o(6492648374272L, 48374);
      return;
    }
    if (!(paramk instanceof ah))
    {
      GMTrace.o(6492648374272L, 48374);
      return;
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6494930075648L, 48391);
        f.this.frZ = false;
        int i = ((ah)paramk).lPZ;
        f.frX.remove(Integer.valueOf(i));
        Object localObject;
        if ((paramInt2 != 3) || (paramInt2 != 0))
        {
          localObject = f.this;
          ((f)localObject).fsb -= 1;
        }
        j localj = h.awD().cd(i);
        if ((localj == null) || (localj.field_itemStatus == 10))
        {
          GMTrace.o(6494930075648L, 48391);
          return;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          if (localj.field_itemStatus == 17)
          {
            g.paX.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(0), Long.valueOf(x.k(localj)), Long.valueOf(x.ch(localj.field_localId)) });
            w.v("MicroMsg.FavModService", "mod end set status done. favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
            localj.field_itemStatus = 10;
            h.awD().a(localj, new String[] { "localId" });
            h.awy().ca(localj.field_localId);
          }
        }
        while (f.this.fsb > 0)
        {
          if (f.this.axz()) {
            break label492;
          }
          x.startSync();
          GMTrace.o(6494930075648L, 48391);
          return;
          Integer localInteger = Integer.valueOf(bg.a((Integer)f.lQA.get(Integer.valueOf(i)), 0));
          localObject = localInteger;
          if (paramInt1 != 1)
          {
            localObject = localInteger;
            if (paramInt1 != 0) {
              localObject = Integer.valueOf(localInteger.intValue() - 1);
            }
          }
          if (((Integer)localObject).intValue() <= 0)
          {
            int j = x.bZ(paramInt1, paramInt2);
            g.paX.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localj.field_type), Integer.valueOf(j), Long.valueOf(x.k(localj)), Long.valueOf(x.ch(localj.field_localId)) });
            f.lQA.remove(Integer.valueOf(i));
            w.e("MicroMsg.FavModService", "achieved retry limit, set error, favId:%d", new Object[] { Integer.valueOf(i) });
            localj.field_itemStatus = 18;
            h.awD().a(localj, new String[] { "localId" });
          }
        }
        w.d("MicroMsg.FavModService", "klem stopFlag <= 0 , Stop Service");
        f.this.qM();
        label492:
        GMTrace.o(6494930075648L, 48391);
      }
      
      public final String toString()
      {
        GMTrace.i(6495064293376L, 48392);
        String str = super.toString() + "|onSceneEnd";
        GMTrace.o(6495064293376L, 48392);
        return str;
      }
    });
    GMTrace.o(6492648374272L, 48374);
  }
  
  public final boolean axz()
  {
    GMTrace.i(16032844480512L, 119454);
    this.fsc = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if ((!this.frZ) && (this.frV.size() == 0))
    {
      localObject1 = h.awD();
      localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lOE + " from FavItemInfo where itemStatus" + "=17";
      localObject2 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).gMB.a((String)localObject2, null, 2);
      if (localObject2 == null)
      {
        localObject1 = null;
        if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
          break label195;
        }
      }
    }
    else
    {
      label99:
      if ((this.frZ) || (this.frV.size() > 0)) {
        break label401;
      }
      qM();
      w.d("MicroMsg.FavModService", "klem No Data Any More , Stop Service");
      GMTrace.o(16032844480512L, 119454);
      return false;
    }
    Object localObject3;
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new ArrayList();
      do
      {
        localObject3 = new j();
        ((j)localObject3).b((Cursor)localObject2);
        ((List)localObject1).add(localObject3);
      } while (((Cursor)localObject2).moveToNext());
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      label195:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        if (frX.containsKey(Integer.valueOf(((j)localObject2).field_id)))
        {
          w.d("MicroMsg.FavModService", "File is Already running:" + ((j)localObject2).field_id);
        }
        else
        {
          if (!lQA.containsKey(Integer.valueOf(((j)localObject2).field_id))) {
            lQA.put(Integer.valueOf(((j)localObject2).field_id), Integer.valueOf(3));
          }
          this.frV.add(localObject2);
          frX.put(Integer.valueOf(((j)localObject2).field_id), null);
        }
      }
      w.d("MicroMsg.FavModService", "klem GetNeedRun procing:" + frX.size() + ",send:" + this.frV.size() + "]");
      this.frV.size();
      break label99;
      label401:
      if ((!this.frZ) && (this.frV.size() > 0))
      {
        localObject1 = (j)this.frV.poll();
        if ((localObject1 != null) && (((j)localObject1).field_id > 0))
        {
          this.frZ = true;
          localObject2 = new LinkedList();
          localObject3 = new LinkedList();
          if (((j)localObject1).field_type != 18)
          {
            z.a(((j)localObject1).field_localId, (LinkedList)localObject2, (LinkedList)localObject3);
            localObject1 = new ah(((j)localObject1).field_id, (LinkedList)localObject2, (LinkedList)localObject3);
            ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
          }
          for (;;)
          {
            GMTrace.o(16032844480512L, 119454);
            return true;
            anp localanp = new anp();
            localanp.ujy = 1;
            localanp.ujz = ((int)bg.Po());
            ((LinkedList)localObject2).add(localanp);
            localObject1 = new ah(((j)localObject1).field_id, (LinkedList)localObject2, (LinkedList)localObject3, j.b((j)localObject1));
            ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
          }
        }
      }
      GMTrace.o(16032844480512L, 119454);
      return false;
      localObject1 = null;
    }
  }
  
  public final void qM()
  {
    GMTrace.i(6492916809728L, 48376);
    this.frV.clear();
    frX.clear();
    this.fsa = false;
    this.frZ = false;
    lQA.clear();
    GMTrace.o(6492916809728L, 48376);
  }
  
  public final void run()
  {
    GMTrace.i(6492782592000L, 48375);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6496003817472L, 48399);
        long l = System.currentTimeMillis() - f.this.fsc;
        if (f.this.fsa)
        {
          if (l < 60000L)
          {
            GMTrace.o(6496003817472L, 48399);
            return;
          }
          w.e("MicroMsg.FavModService", "klem ERR: Try Run service runningFlag:" + f.this.fsa + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + f.this.fsa);
        }
        f.this.frZ = false;
        f.this.fsa = true;
        f.this.fsb = 3;
        f.this.fsg.w(10L, 10L);
        GMTrace.o(6496003817472L, 48399);
      }
      
      public final String toString()
      {
        GMTrace.i(6496138035200L, 48400);
        String str = super.toString() + "|run";
        GMTrace.o(6496138035200L, 48400);
        return str;
      }
    });
    GMTrace.o(6492782592000L, 48375);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */