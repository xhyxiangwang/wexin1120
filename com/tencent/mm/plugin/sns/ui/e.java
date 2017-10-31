package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class e<T>
{
  private com.tencent.mm.sdk.platformtools.ae handler;
  List<Integer> qwC;
  
  public e()
  {
    GMTrace.i(8586176495616L, 63972);
    this.handler = null;
    this.qwC = new LinkedList();
    this.handler = com.tencent.mm.plugin.sns.model.ae.aCa();
    this.qwC.clear();
    GMTrace.o(8586176495616L, 63972);
  }
  
  public abstract List<T> bkK();
  
  public final void bw(final List<T> paramList)
  {
    GMTrace.i(16046266253312L, 119554);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8565238530048L, 63816);
        e.this.bx(paramList);
        e locale = e.this;
        boolean bool = this.qwG;
        com.tencent.mm.plugin.sns.model.ae.bgZ().post(new e.3(locale, bool));
        GMTrace.o(8565238530048L, 63816);
      }
    });
    GMTrace.o(16046266253312L, 119554);
  }
  
  public abstract void bx(List<T> paramList);
  
  protected final void fM(final boolean paramBoolean)
  {
    GMTrace.i(8586310713344L, 63973);
    int i;
    if (paramBoolean)
    {
      i = 0;
      if (i == 1)
      {
        Iterator localIterator = this.qwC.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (((Integer)localIterator.next()).intValue() != 1);
      }
    }
    else
    {
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label89;
        }
        w.e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
        GMTrace.o(8586310713344L, 63973);
        return;
        i = 1;
        break;
      }
    }
    label89:
    if (!paramBoolean) {
      w.d("MicroMsg.AdapterLoader", "ui load");
    }
    while (this.qwC.size() > 1)
    {
      GMTrace.o(8586310713344L, 63973);
      return;
      w.d("MicroMsg.AdapterLoader", "thread load" + this.qwC.size());
    }
    this.qwC.add(Integer.valueOf(i));
    if (paramBoolean)
    {
      com.tencent.mm.plugin.sns.model.ae.bgZ().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8688047751168L, 64731);
          List localList = e.this.bkK();
          e.this.bw(localList);
          GMTrace.o(8688047751168L, 64731);
        }
      });
      GMTrace.o(8586310713344L, 63973);
      return;
    }
    bw(bkK());
    GMTrace.o(8586310713344L, 63973);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */