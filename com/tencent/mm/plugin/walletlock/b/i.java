package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public enum i
{
  private boolean sgT;
  private boolean sgU;
  private Object sgV;
  public HashSet<WeakReference<Activity>> sgW;
  
  static
  {
    GMTrace.i(20246341615616L, 150847);
    sgS = new i("INSTANCE");
    sgX = new i[] { sgS };
    GMTrace.o(20246341615616L, 150847);
  }
  
  private i()
  {
    GMTrace.i(20245267873792L, 150839);
    this.sgT = false;
    this.sgU = false;
    this.sgV = new Object();
    this.sgW = new HashSet();
    GMTrace.o(20245267873792L, 150839);
  }
  
  public final void a(WeakReference<Activity> paramWeakReference)
  {
    GMTrace.i(20246073180160L, 150845);
    if (this.sgW != null)
    {
      if (paramWeakReference.get() != null) {
        w.v("MicroMsg.WalletLockStatusManager", "alvinluo addProtectActivity %s", new Object[] { ((Activity)paramWeakReference.get()).getClass().getName() });
      }
      this.sgW.add(paramWeakReference);
    }
    GMTrace.o(20246073180160L, 150845);
  }
  
  public final boolean bzi()
  {
    GMTrace.i(20245536309248L, 150841);
    synchronized (this.sgV)
    {
      boolean bool = this.sgT;
      GMTrace.o(20245536309248L, 150841);
      return bool;
    }
  }
  
  public final boolean bzj()
  {
    GMTrace.i(20245804744704L, 150843);
    synchronized (this.sgV)
    {
      boolean bool = this.sgU;
      GMTrace.o(20245804744704L, 150843);
      return bool;
    }
  }
  
  public final void bzk()
  {
    GMTrace.i(20245938962432L, 150844);
    synchronized (this.sgV)
    {
      this.sgU = true;
      GMTrace.o(20245938962432L, 150844);
      return;
    }
  }
  
  public final void bzl()
  {
    GMTrace.i(20246207397888L, 150846);
    Iterator localIterator = this.sgW.iterator();
    while (localIterator.hasNext())
    {
      Activity localActivity = (Activity)((WeakReference)localIterator.next()).get();
      if ((localActivity != null) && (!localActivity.isFinishing()))
      {
        w.v("MicroMsg.WalletLockStatusManager", "alvinluo finish %s", new Object[] { localActivity.getClass().getName() });
        localActivity.finish();
      }
      localIterator.remove();
    }
    GMTrace.o(20246207397888L, 150846);
  }
  
  public final void jj(boolean paramBoolean)
  {
    GMTrace.i(20245402091520L, 150840);
    synchronized (this.sgV)
    {
      this.sgT = paramBoolean;
      GMTrace.o(20245402091520L, 150840);
      return;
    }
  }
  
  public final void jk(boolean paramBoolean)
  {
    GMTrace.i(20245670526976L, 150842);
    synchronized (this.sgV)
    {
      this.sgU = paramBoolean;
      GMTrace.o(20245670526976L, 150842);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */