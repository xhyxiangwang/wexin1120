package com.tencent.mm.vending.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.base.Vending;
import com.tencent.mm.vending.base.Vending.h;
import com.tencent.mm.vending.e.b;
import com.tencent.mm.vending.h.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;

public abstract class a
  implements b
{
  Context mContext;
  private com.tencent.mm.vending.e.c wZA;
  public com.tencent.mm.vending.e.c<Vending> wZB;
  public Map<Class, a> wZC;
  byte[] wZD;
  public com.tencent.mm.vending.base.a<Object> wZE;
  private AtomicBoolean wZF;
  boolean wZG;
  public Map<Class, com.tencent.mm.vending.b.c<b>> wZH;
  public com.tencent.mm.vending.d.a wZI;
  
  public a()
  {
    GMTrace.i(250852933632L, 1869);
    this.wZA = new com.tencent.mm.vending.e.c();
    this.wZB = new com.tencent.mm.vending.e.c();
    this.wZC = new ConcurrentHashMap();
    this.wZD = new byte[0];
    this.wZE = new com.tencent.mm.vending.base.a()
    {
      protected final Object D(Class<?> paramAnonymousClass)
      {
        GMTrace.i(249644974080L, 1860);
        a.a locala = (a.a)a.this.wZC.get(paramAnonymousClass);
        Object localObject;
        if (locala != null)
        {
          locala.wZL = true;
          localObject = locala.PN();
          locala.wZL = false;
          if (locala.wZK) {
            locala.wZM = defer(paramAnonymousClass);
          }
        }
        else
        {
          GMTrace.o(249644974080L, 1860);
          return null;
        }
        GMTrace.o(249644974080L, 1860);
        return localObject;
      }
    };
    this.wZF = new AtomicBoolean(false);
    this.wZG = false;
    this.wZH = new HashMap();
    this.wZB.a(this.wZE);
    this.wZE.addVendingDataResolvedCallback(new com.tencent.mm.vending.base.a.a() {});
    GMTrace.o(250852933632L, 1869);
  }
  
  private void cgU()
  {
    GMTrace.i(251658240000L, 1875);
    if ((Looper.myLooper() == this.wZE.getLooper()) && (!this.wZF.get())) {
      com.tencent.mm.vending.f.a.e("Vending.Interactor", "This interactor has not call onCreate() yet! Interactor : %s", new Object[] { this });
    }
    GMTrace.o(251658240000L, 1875);
  }
  
  public final <_Struct> _Struct B(Class<_Struct> paramClass)
  {
    GMTrace.i(251255586816L, 1872);
    cgU();
    if ((Looper.myLooper() == Looper.getMainLooper()) && (!this.wZG)) {}
    synchronized (this.wZD)
    {
      boolean bool = this.wZG;
      if (!bool) {}
      try
      {
        this.wZD.wait();
        paramClass = this.wZE.get(paramClass);
        GMTrace.o(251255586816L, 1872);
        return paramClass;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          com.tencent.mm.vending.f.a.printErrStackTrace("Vending.Interactor", localInterruptedException, "", new Object[0]);
        }
      }
    }
  }
  
  public final void C(Class<?> paramClass)
  {
    GMTrace.i(251389804544L, 1873);
    cgU();
    this.wZE.request(paramClass);
    GMTrace.o(251389804544L, 1873);
  }
  
  public final void a(com.tencent.mm.vending.e.a parama)
  {
    GMTrace.i(250987151360L, 1870);
    Assert.assertTrue("target must be a ILifeCycle", parama instanceof com.tencent.mm.vending.e.a);
    this.wZA.a(parama);
    GMTrace.o(250987151360L, 1870);
  }
  
  public final <_Struct> void a(Class<_Struct> paramClass, a<_Struct> parama)
  {
    GMTrace.i(251524022272L, 1874);
    cgU();
    this.wZC.put(paramClass, parama);
    GMTrace.o(251524022272L, 1874);
  }
  
  public final <_Struct> void a(Class<_Struct> paramClass, b<_Struct> paramb)
  {
    GMTrace.i(251121369088L, 1871);
    com.tencent.mm.vending.b.c localc = (com.tencent.mm.vending.b.c)this.wZH.get(paramClass);
    Object localObject = localc;
    if (localc == null)
    {
      localObject = new com.tencent.mm.vending.b.c(d.xby) {};
      this.wZH.put(paramClass, localObject);
    }
    ((com.tencent.mm.vending.b.c)localObject).bQ(paramb);
    paramClass = this.wZE.peek(paramClass);
    if (paramClass != null) {
      paramb.aF(paramClass);
    }
    GMTrace.o(251121369088L, 1871);
  }
  
  public void onCreate()
  {
    GMTrace.i(251792457728L, 1876);
    this.wZF.set(true);
    GMTrace.o(251792457728L, 1876);
  }
  
  public void onDestroy()
  {
    GMTrace.i(251926675456L, 1877);
    this.wZA.dead();
    this.wZB.dead();
    GMTrace.o(251926675456L, 1877);
  }
  
  public abstract class a<_Struct>
  {
    boolean wZK;
    public boolean wZL;
    Vending.h wZM;
    
    public a()
    {
      GMTrace.i(250450280448L, 1866);
      this.wZK = false;
      this.wZL = false;
      GMTrace.o(250450280448L, 1866);
    }
    
    public abstract _Struct PN();
  }
  
  public static abstract interface b<_Struct>
  {
    public abstract void aF(_Struct param_Struct);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/vending/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */