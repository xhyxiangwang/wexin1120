package com.google.android.gms.c;

import android.os.Binder;

public abstract class j<T>
{
  private static final Object abA = new Object();
  private static int auA = 0;
  private static String auB = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  public static a auz = null;
  private T afp = null;
  protected final String auC;
  protected final T auD;
  
  protected j(String paramString, T paramT)
  {
    this.auC = paramString;
    this.auD = paramT;
  }
  
  public static j<Float> a(String paramString, Float paramFloat)
  {
    new j(paramString, paramFloat) {};
  }
  
  public static j<Integer> a(String paramString, Integer paramInteger)
  {
    new j(paramString, paramInteger) {};
  }
  
  public static j<Long> a(String paramString, Long paramLong)
  {
    new j(paramString, paramLong) {};
  }
  
  public static j<Boolean> e(String paramString, boolean paramBoolean)
  {
    new j(paramString, Boolean.valueOf(paramBoolean)) {};
  }
  
  public static boolean isInitialized()
  {
    return auz != null;
  }
  
  public static j<String> j(String paramString1, String paramString2)
  {
    new j(paramString1, paramString2) {};
  }
  
  public static int lm()
  {
    return auA;
  }
  
  public final T get()
  {
    if (this.afp != null) {
      return (T)this.afp;
    }
    return (T)ln();
  }
  
  protected abstract T ln();
  
  public final T lo()
  {
    long l = Binder.clearCallingIdentity();
    try
    {
      Object localObject1 = get();
      return (T)localObject1;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  private static abstract interface a
  {
    public abstract Boolean lp();
    
    public abstract Long lq();
    
    public abstract Integer lr();
    
    public abstract Float ls();
    
    public abstract String lt();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */