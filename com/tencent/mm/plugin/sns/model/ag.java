package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class ag
  implements com.tencent.mm.plugin.sns.storage.g
{
  public HashMap<String, k> qel;
  
  public ag()
  {
    GMTrace.i(8060311437312L, 60054);
    this.qel = new HashMap();
    GMTrace.o(8060311437312L, 60054);
  }
  
  public final k GC(String paramString)
  {
    GMTrace.i(8060445655040L, 60055);
    paramString = (k)this.qel.get(paramString);
    GMTrace.o(8060445655040L, 60055);
    return paramString;
  }
  
  public final boolean a(final k paramk)
  {
    GMTrace.i(8060848308224L, 60058);
    if ((paramk == null) || (bg.mZ(paramk.field_userName)))
    {
      GMTrace.o(8060848308224L, 60058);
      return false;
    }
    ae.bgZ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8090376208384L, 60278);
        ag.this.qel.put(paramk.field_userName, paramk);
        GMTrace.o(8090376208384L, 60278);
      }
    });
    GMTrace.o(8060848308224L, 60058);
    return true;
  }
  
  public final boolean bhF()
  {
    GMTrace.i(8060579872768L, 60056);
    ae.bgZ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8127957172224L, 60558);
        if (ag.this.qel.size() > 50) {
          ag.this.ue(10);
        }
        GMTrace.o(8127957172224L, 60558);
      }
    });
    GMTrace.o(8060579872768L, 60056);
    return true;
  }
  
  public final boolean bhG()
  {
    GMTrace.i(8060714090496L, 60057);
    ae.bgZ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8091718385664L, 60288);
        ag.this.ue(ag.this.qel.size());
        GMTrace.o(8091718385664L, 60288);
      }
    });
    GMTrace.o(8060714090496L, 60057);
    return true;
  }
  
  public final void ue(int paramInt)
  {
    GMTrace.i(16041300197376L, 119517);
    if ((this.qel == null) || (this.qel.size() == 0))
    {
      w.i("MicroMsg.SnsExtCache", "nothing need to pushto snsext");
      GMTrace.o(16041300197376L, 119517);
      return;
    }
    long l2 = System.currentTimeMillis();
    long l1;
    int i;
    if (ae.yI() != null)
    {
      l1 = ae.yI().cA(Thread.currentThread().getId());
      i = 1;
    }
    for (;;)
    {
      w.d("MicroMsg.SnsExtCache", "writeNums " + paramInt + " " + l1);
      Object localObject1 = new LinkedList();
      Object localObject2 = this.qel.keySet().iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        ((LinkedList)localObject1).add((String)((Iterator)localObject2).next());
      } while (((LinkedList)localObject1).size() < paramInt);
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if ((this.qel.containsKey(localObject2)) && (!ae.bgY()))
        {
          ae.bhs().b((k)this.qel.get(localObject2));
          this.qel.remove(localObject2);
        }
      }
      if (i != 0) {
        ae.yI().aJ(l1);
      }
      w.d("MicroMsg.SnsExtCache", "wirtes times : " + (System.currentTimeMillis() - l2));
      GMTrace.o(16041300197376L, 119517);
      return;
      i = 0;
      l1 = 0L;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */