package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.h.a;
import com.google.android.gms.common.internal.l.a;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.e;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class o
  implements c
{
  public final Lock ahN = new ReentrantLock();
  public final int ahg;
  private final int ahh;
  final Looper ahj;
  final b ahk;
  final a.a<? extends d, e> ahl;
  BroadcastReceiver aiA;
  final Map<a.c<?>, a.b> aiB = new HashMap();
  final Map<a.c<?>, ConnectionResult> aiC = new HashMap();
  Set<Scope> aiD = new HashSet();
  public volatile p aiE;
  private ConnectionResult aiF = null;
  private final Set<r<?>> aiG = Collections.newSetFromMap(new WeakHashMap());
  final Set<e<?>> aiH = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
  private final d aiI = new d()
  {
    public final void c(o.e<?> paramAnonymouse)
    {
      o.this.aiH.remove(paramAnonymouse);
    }
  };
  private final c.b aiJ = new c.b()
  {
    public final void bU(int paramAnonymousInt)
    {
      o.this.ahN.lock();
      try
      {
        o.this.aiE.bU(paramAnonymousInt);
        return;
      }
      finally
      {
        o.this.ahN.unlock();
      }
    }
    
    public final void g(Bundle paramAnonymousBundle)
    {
      o.this.ahN.lock();
      try
      {
        o.this.aiE.g(paramAnonymousBundle);
        return;
      }
      finally
      {
        o.this.ahN.unlock();
      }
    }
  };
  private final l.a aiK = new l.a()
  {
    public final boolean isConnected()
    {
      return o.this.aiE instanceof l;
    }
  };
  final h aic;
  final Map<a<?>, Integer> aid;
  final Condition ait;
  final com.google.android.gms.common.internal.l aiu;
  final Queue<e<?>> aiv = new LinkedList();
  volatile boolean aiw;
  long aix = 120000L;
  long aiy = 5000L;
  final a aiz;
  final Context mContext;
  
  public o(Context paramContext, Looper paramLooper, h paramh, b paramb, a.a<? extends d, e> parama, Map<a<?>, Object> paramMap, ArrayList<c.b> paramArrayList, ArrayList<c.c> paramArrayList1, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.aiu = new com.google.android.gms.common.internal.l(paramLooper, this.aiK);
    this.ahj = paramLooper;
    this.aiz = new a(paramLooper);
    this.ahk = paramb;
    this.ahg = paramInt1;
    this.ahh = paramInt2;
    this.aid = new HashMap();
    this.ait = this.ahN.newCondition();
    this.aiE = new n(this);
    paramb = paramArrayList.iterator();
    while (paramb.hasNext())
    {
      paramArrayList = (c.b)paramb.next();
      this.aiu.a(paramArrayList);
    }
    paramb = paramArrayList1.iterator();
    while (paramb.hasNext())
    {
      paramArrayList = (c.c)paramb.next();
      this.aiu.a(paramArrayList);
    }
    paramArrayList = paramh.akU;
    paramArrayList1 = paramMap.keySet().iterator();
    a locala;
    if (paramArrayList1.hasNext())
    {
      locala = (a)paramArrayList1.next();
      paramb = paramMap.get(locala);
      if (paramArrayList.get(locala) == null) {
        break label593;
      }
      if (((h.a)paramArrayList.get(locala)).akX) {
        paramInt1 = 1;
      }
    }
    for (;;)
    {
      label408:
      this.aid.put(locala, Integer.valueOf(paramInt1));
      label436:
      boolean bool;
      label452:
      c.b localb;
      c.c localc;
      if (locala.agX != null)
      {
        paramInt2 = 1;
        if (paramInt2 == 0) {
          break label551;
        }
        if (locala.agV == null) {
          break label545;
        }
        bool = true;
        w.b(bool, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        paramb = locala.agV;
        localb = this.aiJ;
        localc = a(locala, paramInt1);
      }
      label545:
      label551:
      for (paramb = new com.google.android.gms.common.internal.c(paramContext, paramLooper, paramb.jR(), localb, localc, paramh, paramb.jQ());; paramb = locala.jI().a(paramContext, paramLooper, paramh, paramb, this.aiJ, a(locala, paramInt1)))
      {
        this.aiB.put(locala.jJ(), paramb);
        break;
        paramInt1 = 2;
        break label408;
        paramInt2 = 0;
        break label436;
        bool = false;
        break label452;
      }
      this.aic = paramh;
      this.ahl = parama;
      return;
      label593:
      paramInt1 = 0;
    }
  }
  
  private final c.c a(final a<?> parama, final int paramInt)
  {
    new c.c()
    {
      public final void a(ConnectionResult paramAnonymousConnectionResult)
      {
        o.this.ahN.lock();
        try
        {
          o.this.aiE.a(paramAnonymousConnectionResult, parama, paramInt);
          return;
        }
        finally
        {
          o.this.ahN.unlock();
        }
      }
    };
  }
  
  public final ConnectionResult a(TimeUnit paramTimeUnit)
  {
    boolean bool;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool = true;
    }
    for (;;)
    {
      w.b(bool, "blockingConnect must not be called on the UI thread");
      this.ahN.lock();
      try
      {
        connect();
        long l1 = paramTimeUnit.toNanos(30L);
        for (;;)
        {
          bool = this.aiE instanceof m;
          if (!bool) {
            break;
          }
          try
          {
            long l2 = this.ait.awaitNanos(l1);
            l1 = l2;
            if (l2 <= 0L)
            {
              paramTimeUnit = new ConnectionResult(14, null);
              return paramTimeUnit;
            }
          }
          catch (InterruptedException paramTimeUnit)
          {
            Thread.currentThread().interrupt();
            paramTimeUnit = new ConnectionResult(15, null);
            return paramTimeUnit;
          }
        }
        bool = false;
        continue;
        if ((this.aiE instanceof l))
        {
          paramTimeUnit = ConnectionResult.agG;
          return paramTimeUnit;
        }
        if (this.aiF != null)
        {
          paramTimeUnit = this.aiF;
          return paramTimeUnit;
        }
        paramTimeUnit = new ConnectionResult(13, null);
        return paramTimeUnit;
      }
      finally
      {
        this.ahN.unlock();
      }
    }
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    if (paramT.agW != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.c(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      w.c(this.aiB.containsKey(paramT.agW), "GoogleApiClient is not configured to use the API required for this call.");
      this.ahN.lock();
      try
      {
        paramT = this.aiE.a(paramT);
        return paramT;
      }
      finally
      {
        this.ahN.unlock();
      }
    }
  }
  
  public final void a(c.b paramb)
  {
    this.aiu.a(paramb);
  }
  
  public final void a(c.c paramc)
  {
    this.aiu.a(paramc);
  }
  
  final void a(b paramb)
  {
    paramb = this.aiz.obtainMessage(3, paramb);
    this.aiz.sendMessage(paramb);
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.append(paramString).append("mState=").append(this.aiE.getName());
    paramPrintWriter.append(" mResuming=").print(this.aiw);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.aiv.size());
    paramPrintWriter.append(" mUnconsumedRunners.size()=").println(this.aiH.size());
    String str = paramString + "  ";
    Iterator localIterator = this.aid.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramPrintWriter.append(paramString).append(locala.mName).println(":");
      ((a.b)this.aiB.get(locala.jJ())).a(str, paramPrintWriter);
    }
  }
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    boolean bool;
    if (paramT.agW != null) {
      bool = true;
    }
    for (;;)
    {
      w.c(bool, "This task can not be executed (it's probably a Batch or malformed)");
      this.ahN.lock();
      try
      {
        if (!this.aiw) {
          break label113;
        }
        this.aiv.add(paramT);
        while (!this.aiv.isEmpty())
        {
          e locale = (e)this.aiv.remove();
          b(locale);
          locale.c(Status.ahw);
        }
        bool = false;
      }
      finally
      {
        this.ahN.unlock();
      }
    }
    this.ahN.unlock();
    return paramT;
    label113:
    paramT = this.aiE.b(paramT);
    this.ahN.unlock();
    return paramT;
  }
  
  public final void b(c.b paramb)
  {
    com.google.android.gms.common.internal.l locall = this.aiu;
    w.aa(paramb);
    synchronized (locall.alb)
    {
      if (!locall.alu.remove(paramb)) {
        new StringBuilder("unregisterConnectionCallbacks(): listener ").append(paramb).append(" not found");
      }
      while (!locall.alz) {
        return;
      }
      locall.alv.add(paramb);
    }
  }
  
  public final void b(c.c paramc)
  {
    com.google.android.gms.common.internal.l locall = this.aiu;
    w.aa(paramc);
    synchronized (locall.alb)
    {
      if (!locall.alw.remove(paramc)) {
        new StringBuilder("unregisterConnectionFailedListener(): listener ").append(paramc).append(" not found");
      }
      return;
    }
  }
  
  final <A extends a.b> void b(e<A> parame)
  {
    this.aiH.add(parame);
    parame.a(this.aiI);
  }
  
  public final void connect()
  {
    this.ahN.lock();
    try
    {
      this.aiE.connect();
      return;
    }
    finally
    {
      this.ahN.unlock();
    }
  }
  
  public final void disconnect()
  {
    this.ahN.lock();
    try
    {
      kk();
      this.aiE.disconnect();
      return;
    }
    finally
    {
      this.ahN.unlock();
    }
  }
  
  final void f(ConnectionResult paramConnectionResult)
  {
    this.ahN.lock();
    try
    {
      this.aiF = paramConnectionResult;
      this.aiE = new n(this);
      this.aiE.begin();
      this.ait.signalAll();
      return;
    }
    finally
    {
      this.ahN.unlock();
    }
  }
  
  public final Looper getLooper()
  {
    return this.ahj;
  }
  
  public final boolean isConnected()
  {
    return this.aiE instanceof l;
  }
  
  public final boolean isConnecting()
  {
    return this.aiE instanceof m;
  }
  
  final void kj()
  {
    Iterator localIterator = this.aiH.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      locale.a(null);
      locale.cancel();
    }
    this.aiH.clear();
    localIterator = this.aiG.iterator();
    while (localIterator.hasNext()) {
      ((r)localIterator.next()).aiR = null;
    }
    this.aiG.clear();
  }
  
  final boolean kk()
  {
    if (!this.aiw) {
      return false;
    }
    this.aiw = false;
    this.aiz.removeMessages(2);
    this.aiz.removeMessages(1);
    if (this.aiA != null)
    {
      this.mContext.getApplicationContext().unregisterReceiver(this.aiA);
      this.aiA = null;
    }
    return true;
  }
  
  public final void resume()
  {
    this.ahN.lock();
    try
    {
      if (this.aiw) {
        connect();
      }
      return;
    }
    finally
    {
      this.ahN.unlock();
    }
  }
  
  final class a
    extends Handler
  {
    a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        new StringBuilder("Unknown message id: ").append(paramMessage.what);
        return;
      case 1: 
        paramMessage = o.this;
        paramMessage.ahN.lock();
        try
        {
          if (paramMessage.kk()) {
            paramMessage.connect();
          }
          return;
        }
        finally
        {
          paramMessage.ahN.unlock();
        }
      case 2: 
        o.this.resume();
        return;
      case 3: 
        ((o.b)paramMessage.obj).a(o.this);
        return;
      }
      throw ((RuntimeException)paramMessage.obj);
    }
  }
  
  static abstract class b
  {
    private final p aiO;
    
    protected b(p paramp)
    {
      this.aiO = paramp;
    }
    
    public final void a(o paramo)
    {
      paramo.ahN.lock();
      try
      {
        p localp1 = paramo.aiE;
        p localp2 = this.aiO;
        if (localp1 != localp2) {
          return;
        }
        ka();
        return;
      }
      finally
      {
        paramo.ahN.unlock();
      }
    }
    
    protected abstract void ka();
  }
  
  private static final class c
    extends BroadcastReceiver
  {
    private WeakReference<o> aiP;
    
    c(o paramo)
    {
      this.aiP = new WeakReference(paramo);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      paramIntent = paramIntent.getData();
      paramContext = null;
      if (paramIntent != null) {
        paramContext = paramIntent.getSchemeSpecificPart();
      }
      if ((paramContext == null) || (!paramContext.equals("com.google.android.gms"))) {}
      do
      {
        return;
        paramContext = (o)this.aiP.get();
      } while (paramContext == null);
      paramContext.resume();
    }
  }
  
  static abstract interface d
  {
    public abstract void c(o.e<?> parame);
  }
  
  static abstract interface e<A extends a.b>
  {
    public abstract void a(Status paramStatus);
    
    public abstract void a(A paramA);
    
    public abstract void a(o.d paramd);
    
    public abstract void c(Status paramStatus);
    
    public abstract void cancel();
    
    public abstract a.c<A> jJ();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */