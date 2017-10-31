package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.te;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.protocal.c.tg;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class t
{
  public HashMap<String, WeakReference<a>> hxa;
  public tg lOP;
  private HashSet<Integer> lOQ;
  private boolean lOR;
  private List<te> lOS;
  
  public t()
  {
    GMTrace.i(6269310074880L, 46710);
    this.lOP = new tg();
    this.hxa = new HashMap();
    this.lOQ = new HashSet();
    this.lOR = true;
    this.lOS = new LinkedList();
    ap.AS();
    byte[] arrayOfByte = bg.RA((String)com.tencent.mm.x.c.xi().get(225283, ""));
    try
    {
      this.lOP.aC(arrayOfByte);
      w.i("MicroMsg.FavTagSetMgr", "tag:\n%s", new Object[] { this.lOP.tQK });
      GMTrace.o(6269310074880L, 46710);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FavTagSetMgr", localException, "", new Object[0]);
        w.w("MicroMsg.FavTagSetMgr", "init tag info set fail, %s", new Object[] { localException.getMessage() });
        this.lOP = new tg();
      }
    }
  }
  
  private void es(boolean paramBoolean)
  {
    GMTrace.i(6269578510336L, 46712);
    Iterator localIterator = this.hxa.values().iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        if (paramBoolean) {
          ((a)localWeakReference.get()).awU();
        } else {
          ((a)localWeakReference.get()).awV();
        }
      }
    }
    GMTrace.o(6269578510336L, 46712);
  }
  
  private void removeTag(final String paramString)
  {
    GMTrace.i(6270652252160L, 46720);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6270652252160L, 46720);
      return;
    }
    this.lOQ.remove(Integer.valueOf(paramString.hashCode()));
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      w.d("MicroMsg.FavTagSetMgr", "remove tag %s, post", new Object[] { paramString });
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6275752525824L, 46758);
          t.this.xi(paramString);
          GMTrace.o(6275752525824L, 46758);
        }
      });
      GMTrace.o(6270652252160L, 46720);
      return;
    }
    w.d("MicroMsg.FavTagSetMgr", "remove tag %s", new Object[] { paramString });
    xi(paramString);
    GMTrace.o(6270652252160L, 46720);
  }
  
  private void save()
  {
    GMTrace.i(6269712728064L, 46713);
    try
    {
      final byte[] arrayOfByte = this.lOP.toByteArray();
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6276020961280L, 46760);
          String str = bg.br(arrayOfByte);
          ap.AS();
          com.tencent.mm.x.c.xi().set(225283, str);
          GMTrace.o(6276020961280L, 46760);
        }
        
        public final String toString()
        {
          GMTrace.i(6276155179008L, 46761);
          String str = super.toString() + "|save";
          GMTrace.o(6276155179008L, 46761);
          return str;
        }
      });
      this.lOR = true;
      GMTrace.o(6269712728064L, 46713);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FavTagSetMgr", localException, "", new Object[0]);
        w.w("MicroMsg.FavTagSetMgr", "save tag info set fail, %s", new Object[] { localException.getMessage() });
        Object localObject = null;
      }
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6269444292608L, 46711);
    if (parama == null)
    {
      GMTrace.o(6269444292608L, 46711);
      return;
    }
    this.hxa.put(parama.toString(), new WeakReference(parama));
    GMTrace.o(6269444292608L, 46711);
  }
  
  public final int awT()
  {
    GMTrace.i(6269981163520L, 46715);
    Iterator localIterator = this.lOP.tQK.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((tf)localIterator.next()).tQJ.size() + i) {}
    GMTrace.o(6269981163520L, 46715);
    return i;
  }
  
  public final void c(Set<String> paramSet)
  {
    GMTrace.i(6270518034432L, 46719);
    if ((paramSet == null) || (paramSet.isEmpty()))
    {
      GMTrace.o(6270518034432L, 46719);
      return;
    }
    w.d("MicroMsg.FavTagSetMgr", "do remove tags: %s", new Object[] { paramSet });
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      removeTag((String)paramSet.next());
    }
    GMTrace.o(6270518034432L, 46719);
  }
  
  public final void i(j paramj)
  {
    GMTrace.i(6270383816704L, 46718);
    if (paramj == null)
    {
      GMTrace.o(6270383816704L, 46718);
      return;
    }
    paramj = paramj.field_tagProto.tQM.iterator();
    while (paramj.hasNext()) {
      removeTag((String)paramj.next());
    }
    GMTrace.o(6270383816704L, 46718);
  }
  
  public final List<te> nq(int paramInt)
  {
    GMTrace.i(6269846945792L, 46714);
    if ((paramInt < 0) || (paramInt > 1))
    {
      GMTrace.o(6269846945792L, 46714);
      return null;
    }
    if (this.lOR)
    {
      w.w("MicroMsg.FavTagSetMgr", "want get tag list, it is dirty, reload data");
      this.lOS.clear();
      localObject = this.lOP.tQK.iterator();
      while (((Iterator)localObject).hasNext())
      {
        tf localtf = (tf)((Iterator)localObject).next();
        this.lOS.addAll(localtf.tQJ);
      }
      this.lOR = false;
    }
    w.i("MicroMsg.FavTagSetMgr", "want get tag list, tag list size is %d", new Object[] { Integer.valueOf(this.lOS.size()) });
    Object localObject = this.lOS;
    GMTrace.o(6269846945792L, 46714);
    return (List<te>)localObject;
  }
  
  public final void xg(final String paramString)
  {
    GMTrace.i(6270115381248L, 46716);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6270115381248L, 46716);
      return;
    }
    if (this.lOQ.contains(Integer.valueOf(paramString.hashCode())))
    {
      w.d("MicroMsg.FavTagSetMgr", "has add tag %s", new Object[] { paramString });
      GMTrace.o(6270115381248L, 46716);
      return;
    }
    this.lOQ.add(Integer.valueOf(paramString.hashCode()));
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      w.d("MicroMsg.FavTagSetMgr", "add tag %s, post", new Object[] { paramString });
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6279644839936L, 46787);
          t.this.xh(paramString);
          GMTrace.o(6279644839936L, 46787);
        }
      });
      GMTrace.o(6270115381248L, 46716);
      return;
    }
    w.d("MicroMsg.FavTagSetMgr", "add tag %s", new Object[] { paramString });
    xh(paramString);
    GMTrace.o(6270115381248L, 46716);
  }
  
  public final void xh(String paramString)
  {
    int k = 0;
    GMTrace.i(6270249598976L, 46717);
    String str = com.tencent.mm.platformtools.c.mO(paramString.toLowerCase());
    if ((str != null) && (str.length() > 0)) {}
    for (int i = str.charAt(0);; i = 35)
    {
      Object localObject = this.lOP.tQK.iterator();
      int j = 0;
      tf localtf;
      if (((Iterator)localObject).hasNext())
      {
        localtf = (tf)((Iterator)localObject).next();
        if (localtf.tQI != i) {}
      }
      for (;;)
      {
        label86:
        if (localtf == null)
        {
          localtf = new tf();
          localtf.tQI = i;
          this.lOP.tQK.add(localtf);
        }
        for (;;)
        {
          localObject = localtf.tQJ.iterator();
          i = k;
          label132:
          if (((Iterator)localObject).hasNext())
          {
            te localte = (te)((Iterator)localObject).next();
            j = localte.tQH.compareTo(str);
            if (j != 0) {
              break label355;
            }
            j = localte.svi.compareTo(paramString);
          }
          label355:
          for (;;)
          {
            if (j == 0)
            {
              GMTrace.o(6270249598976L, 46717);
              return;
              if (localtf.tQI > i)
              {
                localtf = new tf();
                localtf.tQI = i;
                this.lOP.tQK.add(j, localtf);
                break label86;
              }
              j += 1;
              break;
            }
            if (j > 0)
            {
              localObject = new te();
              ((te)localObject).svi = paramString;
              ((te)localObject).tQH = str;
              localtf.tQJ.add(i, localObject);
              save();
              es(true);
              GMTrace.o(6270249598976L, 46717);
              return;
            }
            i += 1;
            break label132;
            localObject = new te();
            ((te)localObject).svi = paramString;
            ((te)localObject).tQH = str;
            localtf.tQJ.add(localObject);
            es(true);
            save();
            GMTrace.o(6270249598976L, 46717);
            return;
          }
        }
        localtf = null;
      }
    }
  }
  
  public final void xi(String paramString)
  {
    GMTrace.i(6270786469888L, 46721);
    String str = com.tencent.mm.platformtools.c.mO(paramString.toLowerCase());
    if ((str != null) && (str.length() > 0)) {}
    for (int j = str.charAt(0);; j = 35)
    {
      Object localObject = this.lOP.tQK.iterator();
      int i = 0;
      tf localtf;
      if (((Iterator)localObject).hasNext())
      {
        localtf = (tf)((Iterator)localObject).next();
        if (localtf.tQI != j) {}
      }
      for (;;)
      {
        if (localtf == null)
        {
          GMTrace.o(6270786469888L, 46721);
          return;
          if (localtf.tQI > j)
          {
            GMTrace.o(6270786469888L, 46721);
            return;
          }
          i += 1;
          break;
        }
        Iterator localIterator = localtf.tQJ.iterator();
        j = 0;
        if (localIterator.hasNext())
        {
          localObject = (te)localIterator.next();
          int m = ((te)localObject).tQH.compareTo(str);
          k = m;
          if (m == 0) {
            k = ((te)localObject).svi.compareTo(paramString);
          }
          if (k == 0)
          {
            paramString = h.awC();
            str = ((te)localObject).svi;
            if (!bg.mZ(str))
            {
              str = "select count(localId) from FavSearchInfo where tagContent like '%" + str + "%'";
              w.d("MicroMsg.FavSearchStorage", "is tag exist sql {%s}", new Object[] { str });
              paramString = paramString.gMB.a(str, null, 2);
              if ((paramString == null) || (!paramString.moveToFirst())) {
                break label407;
              }
            }
          }
        }
        label407:
        for (int k = paramString.getInt(0);; k = 0)
        {
          if (paramString != null) {
            paramString.close();
          }
          if (k > 0) {}
          for (k = 1;; k = 0)
          {
            if (k == 0)
            {
              localtf.tQJ.remove(j);
              if (localtf.tQJ.isEmpty()) {
                this.lOP.tQK.remove(i);
              }
              es(false);
              save();
            }
            GMTrace.o(6270786469888L, 46721);
            return;
          }
          if (k > 0)
          {
            GMTrace.o(6270786469888L, 46721);
            return;
          }
          j += 1;
          break;
          GMTrace.o(6270786469888L, 46721);
          return;
        }
        localtf = null;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void awU();
    
    public abstract void awV();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */