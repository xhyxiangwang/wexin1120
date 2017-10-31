package com.tencent.mm.plugin.ipcall.a.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b
  extends a
  implements a.a
{
  private ae mHandler;
  protected boolean mXd;
  public a mXe;
  
  public b()
  {
    GMTrace.i(11615470616576L, 86542);
    this.mXd = false;
    this.mHandler = new ae(Looper.getMainLooper());
    this.mXe = null;
    GMTrace.o(11615470616576L, 86542);
  }
  
  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11616812793856L, 86552);
    w.i("MicroMsg.BaseIPCallTimerService", "timer request success!, type: %d, isLoop: %b, interval: %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(this.mXd), Integer.valueOf(aHz()) });
    aHA();
    if (this.mXe != null) {
      this.mXe.a(paramInt1, (k)paramObject, paramInt2, paramInt3);
    }
    if (this.mXd) {
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11618289188864L, 86563);
          b.this.b(b.this.mWy);
          GMTrace.o(11618289188864L, 86563);
        }
      }, aHz());
    }
    GMTrace.o(11616812793856L, 86552);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(11615873269760L, 86545);
    super.a(paramc);
    this.mXd = true;
    w.d("MicroMsg.BaseIPCallTimerService", "start service, type: %d", new Object[] { Integer.valueOf(Fb()) });
    GMTrace.o(11615873269760L, 86545);
  }
  
  public abstract void aHA();
  
  public abstract void aHB();
  
  public abstract int aHz();
  
  public final void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11616947011584L, 86553);
    w.i("MicroMsg.BaseIPCallTimerService", "timer request failed, type: %d, isLoop: %b, interval: %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(this.mXd), Integer.valueOf(aHz()) });
    aHB();
    if (this.mXe != null) {
      this.mXe.b(paramInt1, (k)paramObject, paramInt2, paramInt3);
    }
    if (this.mXd) {
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11617215447040L, 86555);
          b.this.b(b.this.mWy);
          GMTrace.o(11617215447040L, 86555);
        }
      }, aHz());
    }
    GMTrace.o(11616947011584L, 86553);
  }
  
  public abstract void b(c paramc);
  
  public final void destroy()
  {
    GMTrace.i(11615739052032L, 86544);
    super.destroy();
    GMTrace.o(11615739052032L, 86544);
  }
  
  public final void init()
  {
    GMTrace.i(11615604834304L, 86543);
    this.mXc = this;
    super.init();
    GMTrace.o(11615604834304L, 86543);
  }
  
  public abstract void onStop();
  
  public final void stop()
  {
    GMTrace.i(11616007487488L, 86546);
    this.mXd = false;
    onStop();
    w.d("MicroMsg.BaseIPCallTimerService", "stop service, type: %d", new Object[] { Integer.valueOf(Fb()) });
    GMTrace.o(11616007487488L, 86546);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, k paramk, int paramInt2, int paramInt3);
    
    public abstract void b(int paramInt1, k paramk, int paramInt2, int paramInt3);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */