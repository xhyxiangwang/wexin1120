package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public abstract class a
  implements e
{
  protected int errCode;
  protected int errType;
  public c mWy;
  public a mXc;
  
  public a()
  {
    GMTrace.i(11614128439296L, 86532);
    this.errType = 0;
    this.errCode = 0;
    GMTrace.o(11614128439296L, 86532);
  }
  
  public abstract int Fb();
  
  public void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11615336398848L, 86541);
    w.d("MicroMsg.BaseIPCallService", "onSceneEnd, errType: %d, errCode: %d, scene.getType: %d, serviceType: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.getType()), Integer.valueOf(Fb()) });
    this.errType = paramInt1;
    this.errCode = paramInt2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.mXc != null) {
        this.mXc.a(Fb(), paramk, paramInt1, paramInt2);
      }
      GMTrace.o(11615336398848L, 86541);
      return;
    }
    if (this.mXc != null) {
      this.mXc.b(Fb(), paramk, paramInt1, paramInt2);
    }
    GMTrace.o(11615336398848L, 86541);
  }
  
  public void a(c paramc)
  {
    GMTrace.i(11615067963392L, 86539);
    w.d("MicroMsg.BaseIPCallService", "start service, type: %d", new Object[] { Integer.valueOf(Fb()) });
    this.mWy = paramc;
    b(this.mWy);
    GMTrace.o(11615067963392L, 86539);
  }
  
  public abstract int[] aHx();
  
  public abstract void aHy();
  
  public abstract void b(c paramc);
  
  public void destroy()
  {
    GMTrace.i(11614396874752L, 86534);
    int[] arrayOfInt = aHx();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      ap.wT().b(k, this);
      i += 1;
    }
    this.mXc = null;
    onDestroy();
    GMTrace.o(11614396874752L, 86534);
  }
  
  public void init()
  {
    GMTrace.i(11614262657024L, 86533);
    int[] arrayOfInt = aHx();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      ap.wT().a(k, this);
      i += 1;
    }
    aHy();
    GMTrace.o(11614262657024L, 86533);
  }
  
  public abstract void onDestroy();
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3);
    
    public abstract void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */