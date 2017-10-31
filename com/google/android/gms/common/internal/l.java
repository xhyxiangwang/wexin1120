package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class l
  implements Handler.Callback
{
  public final Object alb = new Object();
  public final a alt;
  public final ArrayList<c.b> alu = new ArrayList();
  public final ArrayList<c.b> alv = new ArrayList();
  public final ArrayList<c.c> alw = new ArrayList();
  public volatile boolean alx = false;
  public final AtomicInteger aly = new AtomicInteger(0);
  public boolean alz = false;
  public final Handler mHandler;
  
  public l(Looper paramLooper, a parama)
  {
    this.alt = parama;
    this.mHandler = new Handler(paramLooper, this);
  }
  
  public final void a(c.b paramb)
  {
    w.aa(paramb);
    synchronized (this.alb)
    {
      if (this.alu.contains(paramb))
      {
        new StringBuilder("registerConnectionCallbacks(): listener ").append(paramb).append(" is already registered");
        if (this.alt.isConnected()) {
          this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramb));
        }
        return;
      }
      this.alu.add(paramb);
    }
  }
  
  public final void a(c.c paramc)
  {
    w.aa(paramc);
    synchronized (this.alb)
    {
      if (this.alw.contains(paramc))
      {
        new StringBuilder("registerConnectionFailedListener(): listener ").append(paramc).append(" is already registered");
        return;
      }
      this.alw.add(paramc);
    }
  }
  
  public final void cb(int paramInt)
  {
    boolean bool = false;
    if (Looper.myLooper() == this.mHandler.getLooper()) {
      bool = true;
    }
    w.b(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.mHandler.removeMessages(1);
    synchronized (this.alb)
    {
      this.alz = true;
      Object localObject2 = new ArrayList(this.alu);
      int i = this.aly.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        c.b localb = (c.b)((Iterator)localObject2).next();
        if ((this.alx) && (this.aly.get() == i)) {
          if (this.alu.contains(localb)) {
            localb.bU(paramInt);
          }
        }
      }
    }
    this.alv.clear();
    this.alz = false;
  }
  
  public final boolean handleMessage(Message arg1)
  {
    if (???.what == 1)
    {
      c.b localb = (c.b)???.obj;
      synchronized (this.alb)
      {
        if ((this.alx) && (this.alt.isConnected()) && (this.alu.contains(localb))) {
          localb.g(null);
        }
        return true;
      }
    }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    return false;
  }
  
  public final void kD()
  {
    this.alx = false;
    this.aly.incrementAndGet();
  }
  
  public static abstract interface a
  {
    public abstract boolean isConnected();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */