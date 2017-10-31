package com.tencent.mm.plugin.appbrand.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Set;

public final class b
{
  public final String TAG;
  public final c iCL;
  public final android.support.v4.e.a<a, b> iCM;
  public final e iCN;
  private final f irS;
  
  public b(f paramf)
  {
    GMTrace.i(18879065620480L, 140660);
    this.iCM = new android.support.v4.e.a();
    this.iCN = new e()
    {
      public final void onTrimMemory(int paramAnonymousInt)
      {
        GMTrace.i(18872086298624L, 140608);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(18872086298624L, 140608);
          return;
          if ((b.this.iCL.SR() == a.iCI) && (d.tpa))
          {
            w.i(b.this.TAG, "onTrimMemory level %d, finishRuntime", new Object[] { Integer.valueOf(paramAnonymousInt) });
            b.this.SP();
          }
        }
      }
    };
    this.TAG = String.format("MicroMsg.AppBrand.AppRunningStateController[%s]", new Object[] { paramf.iqL });
    this.irS = paramf;
    this.iCL = new c(paramf)
    {
      final void SQ()
      {
        GMTrace.i(18879468273664L, 140663);
        b.this.SP();
        GMTrace.o(18879468273664L, 140663);
      }
      
      final void b(a paramAnonymousa)
      {
        GMTrace.i(18879602491392L, 140664);
        Object localObject = b.this;
        synchronized (((b)localObject).iCM)
        {
          b.a[] arrayOfa = new b.a[((b)localObject).iCM.size()];
          localObject = (b.a[])((b)localObject).iCM.keySet().toArray(arrayOfa);
          int j = localObject.length;
          int i = 0;
          if (i < j)
          {
            localObject[i].a(paramAnonymousa);
            i += 1;
          }
        }
        GMTrace.o(18879602491392L, 140664);
      }
    };
    GMTrace.o(18879065620480L, 140660);
  }
  
  public final void SP()
  {
    GMTrace.i(18878931402752L, 140659);
    if (!this.irS.mFinished) {
      this.irS.finish();
    }
    GMTrace.o(18878931402752L, 140659);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(18879199838208L, 140661);
    if ((parama == null) || (a.iCJ == this.iCL.SR()))
    {
      GMTrace.o(18879199838208L, 140661);
      return;
    }
    synchronized (this.iCM)
    {
      this.iCM.put(parama, this);
      GMTrace.o(18879199838208L, 140661);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */