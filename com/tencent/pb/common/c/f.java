package com.tencent.pb.common.c;

public abstract class f<T>
{
  private T mInstance;
  
  public abstract T cjT();
  
  public final T get()
  {
    try
    {
      if (this.mInstance == null) {
        this.mInstance = cjT();
      }
      Object localObject1 = this.mInstance;
      return (T)localObject1;
    }
    finally {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */