package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class j<R extends g>
  implements e<R>
{
  private final Object ahA = new Object();
  protected final a<R> ahB;
  private final CountDownLatch ahC = new CountDownLatch(1);
  private final ArrayList<Object> ahD = new ArrayList();
  private h<R> ahE;
  private volatile R ahF;
  private volatile boolean ahG;
  private boolean ahH;
  private boolean ahI;
  private q ahJ;
  
  protected j(Looper paramLooper)
  {
    this.ahB = new a(paramLooper);
  }
  
  private void b(R paramR)
  {
    this.ahF = paramR;
    this.ahJ = null;
    this.ahC.countDown();
    paramR = this.ahF;
    if (this.ahE != null)
    {
      this.ahB.removeMessages(2);
      if (!this.ahH)
      {
        paramR = this.ahB;
        paramR.sendMessage(paramR.obtainMessage(1, new Pair(this.ahE, jZ())));
      }
    }
    paramR = this.ahD.iterator();
    while (paramR.hasNext()) {
      paramR.next();
    }
    this.ahD.clear();
  }
  
  private static void c(g paramg)
  {
    if ((paramg instanceof f)) {}
    try
    {
      ((f)paramg).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      new StringBuilder("Unable to release ").append(paramg);
    }
  }
  
  private boolean jX()
  {
    return this.ahC.getCount() == 0L;
  }
  
  private R jZ()
  {
    boolean bool = true;
    synchronized (this.ahA)
    {
      if (!this.ahG)
      {
        w.b(bool, "Result has already been consumed.");
        w.b(jX(), "Result is not ready.");
        g localg = this.ahF;
        this.ahF = null;
        this.ahE = null;
        this.ahG = true;
        jY();
        return localg;
      }
      bool = false;
    }
  }
  
  public final void a(Status paramStatus)
  {
    synchronized (this.ahA)
    {
      if (!jX())
      {
        a(b(paramStatus));
        this.ahI = true;
      }
      return;
    }
  }
  
  public final void a(R paramR)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (this.ahA)
      {
        if ((this.ahI) || (this.ahH))
        {
          c(paramR);
          return;
        }
        if (!jX())
        {
          bool1 = true;
          w.b(bool1, "Results have already been set");
          if (this.ahG) {
            break label83;
          }
          bool1 = bool2;
          w.b(bool1, "Result has already been consumed");
          b(paramR);
          return;
        }
      }
      boolean bool1 = false;
      continue;
      label83:
      bool1 = false;
    }
  }
  
  public abstract R b(Status paramStatus);
  
  public final R b(TimeUnit paramTimeUnit)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((2L <= 0L) || (Looper.myLooper() != Looper.getMainLooper())) {
      bool1 = true;
    }
    for (;;)
    {
      w.b(bool1, "await must not be called on the UI thread when time is greater than zero.");
      if (!this.ahG)
      {
        bool1 = bool2;
        w.b(bool1, "Result has already been consumed.");
      }
      try
      {
        if (!this.ahC.await(2L, paramTimeUnit)) {
          a(Status.ahx);
        }
        w.b(jX(), "Result is not ready.");
        return jZ();
        bool1 = false;
        continue;
        bool1 = false;
      }
      catch (InterruptedException paramTimeUnit)
      {
        for (;;)
        {
          a(Status.ahv);
        }
      }
    }
  }
  
  public final void cancel()
  {
    synchronized (this.ahA)
    {
      if ((this.ahH) || (this.ahG)) {
        return;
      }
      c(this.ahF);
      this.ahE = null;
      this.ahH = true;
      b(b(Status.ahy));
      return;
    }
  }
  
  public final R jV()
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      w.b(bool1, "await must not be called on the UI thread");
      if (!this.ahG)
      {
        bool1 = bool2;
        w.b(bool1, "Result has already been consumed");
      }
      try
      {
        this.ahC.await();
        w.b(jX(), "Result is not ready.");
        return jZ();
        bool1 = false;
        continue;
        bool1 = false;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          a(Status.ahv);
        }
      }
    }
  }
  
  protected void jY() {}
  
  public static final class a<R extends g>
    extends Handler
  {
    public a()
    {
      this(Looper.getMainLooper());
    }
    
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
        return;
      case 1: 
        paramMessage = (Pair)paramMessage.obj;
        Object localObject = paramMessage.first;
        paramMessage = paramMessage.second;
        return;
      }
      ((j)paramMessage.obj).a(Status.ahx);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */