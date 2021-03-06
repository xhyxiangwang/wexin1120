package com.tencent.mm.vending.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.f.a;

public final class c
{
  private Handler mVendingHandler;
  private Looper mVendingLooper;
  private Looper xap;
  private Handler xaq;
  public byte[] xar;
  public a xas;
  
  public c(Looper paramLooper1, Looper paramLooper2)
  {
    GMTrace.i(271656681472L, 2024);
    this.xar = new byte[0];
    this.xap = paramLooper1;
    this.mVendingLooper = paramLooper2;
    this.xaq = new Handler(this.xap)
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(270851375104L, 2018);
        c.this.i(paramAnonymousMessage.what, paramAnonymousMessage.obj);
        GMTrace.o(270851375104L, 2018);
      }
    };
    this.mVendingHandler = new Handler(this.mVendingLooper)
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(271119810560L, 2020);
        synchronized (c.this.xar)
        {
          if (c.this.xas != null) {
            c.this.xas.synchronizing(paramAnonymousMessage.what, paramAnonymousMessage.obj);
          }
          c.this.xar.notify();
          GMTrace.o(271119810560L, 2020);
          return;
        }
      }
    };
    GMTrace.o(271656681472L, 2024);
  }
  
  public final void i(int paramInt, Object paramObject)
  {
    GMTrace.i(271790899200L, 2025);
    if (Looper.myLooper() == this.xap)
    {
      if (this.xas == null)
      {
        a.w("Vending.VendingSync", "This call is pointless.", new Object[0]);
        GMTrace.o(271790899200L, 2025);
        return;
      }
      this.xas.cgY();
      synchronized (this.xar)
      {
        this.mVendingHandler.sendMessageAtFrontOfQueue(this.mVendingHandler.obtainMessage(paramInt, paramObject));
      }
    }
    try
    {
      this.xar.wait();
      this.xas.cgZ();
      GMTrace.o(271790899200L, 2025);
      return;
      paramObject = finally;
      throw ((Throwable)paramObject);
      if (Looper.myLooper() == this.mVendingLooper)
      {
        this.xaq.sendMessageAtFrontOfQueue(this.xaq.obtainMessage(paramInt, paramObject));
        GMTrace.o(271790899200L, 2025);
        return;
      }
      GMTrace.o(271790899200L, 2025);
      return;
    }
    catch (InterruptedException paramObject)
    {
      for (;;) {}
    }
  }
  
  public static abstract interface a
  {
    public abstract void cgY();
    
    public abstract void cgZ();
    
    public abstract void synchronizing(int paramInt, Object paramObject);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/vending/base/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */