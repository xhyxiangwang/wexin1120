package com.tencent.mm.plugin.walletlock.a;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.kernel.c.a;

public abstract interface b
  extends a
{
  public abstract void J(Activity paramActivity);
  
  public abstract void a(Activity paramActivity, b paramb);
  
  public abstract void a(Activity paramActivity, b paramb, a parama);
  
  public abstract void b(Activity paramActivity, int paramInt1, int paramInt2);
  
  public abstract void b(Activity paramActivity, Intent paramIntent, int paramInt);
  
  public abstract b byv();
  
  public abstract boolean byw();
  
  public abstract boolean byx();
  
  public abstract void c(Activity paramActivity, Intent paramIntent);
  
  public abstract void h(Activity paramActivity, int paramInt);
  
  public abstract void i(Activity paramActivity, int paramInt);
  
  public abstract void init();
  
  public abstract void wK(int paramInt);
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract boolean K(Activity paramActivity);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */