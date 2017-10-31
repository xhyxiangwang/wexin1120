package com.tencent.e;

public abstract class d<T extends e>
{
  public final Object mLock = new Object();
  public int pCe;
  public T[] xLh = Fx(20);
  
  public d(int paramInt) {}
  
  public abstract T[] Fx(int paramInt);
  
  public abstract T cnI();
  
  public T cnJ()
  {
    e locale = null;
    synchronized (this.mLock)
    {
      if (this.pCe > 0)
      {
        this.pCe -= 1;
        locale = this.xLh[this.pCe];
        this.xLh[this.pCe] = null;
      }
      return locale;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */