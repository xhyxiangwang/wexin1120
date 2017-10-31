package com.tencent.d.a.c;

public final class f
{
  public static long fn(long paramLong)
  {
    return (System.nanoTime() - paramLong) / 1000L / 1000L;
  }
  
  public static String mY(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean mZ(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */