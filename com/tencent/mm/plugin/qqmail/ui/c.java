package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.jh;
import com.tencent.mm.g.a.jh.b;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bb;
import com.tencent.mm.x.bb.a;

public final class c
  implements com.tencent.mm.ac.e
{
  static long oKC;
  private Activity fGo;
  public a oKD;
  
  static
  {
    GMTrace.i(5566009180160L, 41470);
    oKC = 0L;
    GMTrace.o(5566009180160L, 41470);
  }
  
  public c(Activity paramActivity)
  {
    GMTrace.i(5565069656064L, 41463);
    ap.wT().a(138, this);
    this.fGo = paramActivity;
    GMTrace.o(5565069656064L, 41463);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5565606526976L, 41467);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (this.oKD != null)
      {
        this.oKD.aXd();
        this.oKD = null;
      }
    }
    for (;;)
    {
      oKC = System.currentTimeMillis();
      GMTrace.o(5565606526976L, 41467);
      return;
      if (this.oKD != null)
      {
        this.oKD.aXe();
        this.oKD = null;
      }
    }
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(5565203873792L, 41464);
    this.oKD = parama;
    parama = new jh();
    parama.fGm.fGo = this.fGo;
    parama.fGm.fGp = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5542386860032L, 41294);
        if (parama.fGn.fwc)
        {
          c localc = c.this;
          if (System.currentTimeMillis() - c.oKC > 600000L)
          {
            if (ap.AV())
            {
              ap.wT().a(new bb(new c.2(localc)), 0);
              GMTrace.o(5542386860032L, 41294);
            }
          }
          else if (localc.oKD != null) {
            localc.oKD.aXe();
          }
          GMTrace.o(5542386860032L, 41294);
          return;
        }
        if (c.this.oKD != null) {
          c.this.oKD.aXe();
        }
        GMTrace.o(5542386860032L, 41294);
      }
    };
    com.tencent.mm.sdk.b.a.uLm.a(parama, Looper.myLooper());
    GMTrace.o(5565203873792L, 41464);
  }
  
  protected final void finalize()
  {
    GMTrace.i(5565472309248L, 41466);
    release();
    super.finalize();
    GMTrace.o(5565472309248L, 41466);
  }
  
  public final void release()
  {
    GMTrace.i(5565338091520L, 41465);
    ap.wT().b(138, this);
    GMTrace.o(5565338091520L, 41465);
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(5545876520960L, 41320);
      GMTrace.o(5545876520960L, 41320);
    }
    
    public abstract void aXd();
    
    public abstract void aXe();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */