package com.tencent.mm.vending.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import java.util.Map;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.vending.e.b
{
  private com.tencent.mm.vending.e.c wZA;
  private b wZS;
  private a wZT;
  private com.tencent.mm.vending.c.b<? extends a> wZU;
  private int wZV;
  
  public c()
  {
    GMTrace.i(252731981824L, 1883);
    this.wZS = b.cgV();
    this.wZV = 0;
    this.wZA = new com.tencent.mm.vending.e.c();
    GMTrace.o(252731981824L, 1883);
  }
  
  private void A(Intent paramIntent, Context paramContext)
  {
    try
    {
      GMTrace.i(253268852736L, 1887);
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.wZT);
      this.wZT.mContext = paramContext;
      this.wZT.wZI = new com.tencent.mm.vending.d.a(paramIntent);
      GMTrace.o(253268852736L, 1887);
      return;
    }
    finally
    {
      paramIntent = finally;
      throw paramIntent;
    }
  }
  
  private <T extends com.tencent.mm.vending.c.b<? extends a>> T E(Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    try
    {
      GMTrace.i(252866199552L, 1884);
      if (this.wZU == null) {
        break label79;
      }
      if (!paramClass.isInstance(this.wZU)) {
        throw new IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + paramClass.toString());
      }
    }
    finally {}
    paramClass = this.wZU;
    GMTrace.o(252866199552L, 1884);
    for (;;)
    {
      return paramClass;
      try
      {
        label79:
        this.wZU = ((com.tencent.mm.vending.c.b)paramClass.newInstance());
        if (this.wZT == null) {
          this.wZT = ((a)this.wZU.PC());
        }
        cgW();
        com.tencent.mm.vending.c.b localb = this.wZU;
        GMTrace.o(252866199552L, 1884);
        paramClass = localb;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
      catch (InstantiationException localInstantiationException)
      {
        for (;;) {}
      }
    }
    throw new InternalError("Could not create interactor api instance : " + paramClass.toString());
  }
  
  private <T extends a> T F(Class<? extends a> paramClass)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(253000417280L, 1885);
        if (this.wZU != null)
        {
          paramClass = (a)this.wZU.PC();
          GMTrace.o(253000417280L, 1885);
          return paramClass;
        }
        if (this.wZT == null) {
          break label111;
        }
        if (!paramClass.isInstance(this.wZT)) {
          throw new IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + paramClass.toString());
        }
      }
      finally {}
      paramClass = this.wZT;
      GMTrace.o(253000417280L, 1885);
      continue;
      try
      {
        label111:
        this.wZT = ((a)paramClass.newInstance());
        cgW();
        a locala = this.wZT;
        GMTrace.o(253000417280L, 1885);
        paramClass = locala;
      }
      catch (InstantiationException localInstantiationException)
      {
        for (;;) {}
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
    }
    throw new InternalError("Could not create interactor instance : " + paramClass.toString());
  }
  
  private void cgW()
  {
    GMTrace.i(253134635008L, 1886);
    if (this.wZS != null)
    {
      b localb = this.wZS;
      a locala = this.wZT;
      if (!localb.wZO.containsKey(this))
      {
        localb.wZO.put(this, locala);
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "presenter %s hash %s interactor %s looper %s", new Object[] { this, Integer.valueOf(hashCode()), locala, Looper.myLooper() });
        int i = localb.wZP.get(hashCode(), 0);
        if ((i > 0) && (i < 4))
        {
          if (i > 0) {
            localb.wZQ.sendMessage(localb.wZQ.obtainMessage(1, locala));
          }
          if (i >= 2) {
            localb.wZQ.sendMessage(localb.wZQ.obtainMessage(2, locala));
          }
          if (i >= 3) {
            localb.wZQ.sendMessage(localb.wZQ.obtainMessage(3, locala));
          }
          if (i >= 4) {
            localb.wZQ.sendMessage(localb.wZQ.obtainMessage(4, locala));
          }
        }
        GMTrace.o(253134635008L, 1886);
        return;
      }
      com.tencent.mm.vending.f.a.e("Vending.InteractorManager", "duplicate activity and interactor.", new Object[0]);
    }
    GMTrace.o(253134635008L, 1886);
  }
  
  public final void B(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(253805723648L, 1891);
    A(paramIntent, paramContext);
    DQ(1);
    GMTrace.o(253805723648L, 1891);
  }
  
  public final void DQ(int paramInt)
  {
    GMTrace.i(253671505920L, 1890);
    this.wZV = paramInt;
    b localb = this.wZS;
    a locala = (a)localb.wZO.get(this);
    if (locala != null) {
      switch (paramInt)
      {
      default: 
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "Unknow phase %s, interactor %s activity %s %s %s", new Object[] { Integer.valueOf(paramInt), locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
        GMTrace.o(253671505920L, 1890);
        return;
      case 1: 
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onCreate interactor %s presenter %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      }
    }
    for (;;)
    {
      localb.wZQ.sendMessage(localb.wZQ.obtainMessage(paramInt, locala));
      localb.wZP.put(hashCode(), paramInt);
      GMTrace.o(253671505920L, 1890);
      return;
      com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onDestroy interactor %s activity %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      localb.wZO.remove(this);
    }
  }
  
  public final <T extends com.tencent.mm.vending.c.b<? extends a>> T a(Activity paramActivity, Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    GMTrace.i(253537288192L, 1889);
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      GMTrace.o(253537288192L, 1889);
      return null;
    }
    paramActivity = E(paramClass);
    GMTrace.o(253537288192L, 1889);
    return paramActivity;
  }
  
  public final void a(com.tencent.mm.vending.e.a parama)
  {
    GMTrace.i(253939941376L, 1892);
    Assert.assertTrue("target must be a ILifeCycle", parama instanceof com.tencent.mm.vending.e.a);
    this.wZA.a(parama);
    GMTrace.o(253939941376L, 1892);
  }
  
  public final <T extends a> T b(Activity paramActivity, Class<? extends a> paramClass)
  {
    GMTrace.i(17854179049472L, 133024);
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      GMTrace.o(17854179049472L, 133024);
      return null;
    }
    paramActivity = F(paramClass);
    GMTrace.o(17854179049472L, 133024);
    return paramActivity;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(254074159104L, 1893);
    this.wZA.dead();
    DQ(4);
    GMTrace.o(254074159104L, 1893);
  }
  
  public final a xJ()
  {
    try
    {
      GMTrace.i(253403070464L, 1888);
      if ((this.wZT == null) && (this.wZS != null)) {
        this.wZT = ((a)this.wZS.wZO.get(this));
      }
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.wZT);
      a locala = this.wZT;
      GMTrace.o(253403070464L, 1888);
      return locala;
    }
    finally {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/vending/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */