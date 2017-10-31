package com.tencent.smtt.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

public final class l
{
  private static Class xAm;
  private static Method xAn;
  
  static
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      xAm = localClass;
      xAn = localClass.getDeclaredMethod("get", new Class[] { String.class, String.class });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static String fp(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return paramString2;
    }
    return fq(paramString1, paramString2);
  }
  
  private static String fq(String paramString1, String paramString2)
  {
    if ((xAm == null) || (xAn == null)) {
      return paramString2;
    }
    try
    {
      paramString1 = (String)xAn.invoke(xAm, new Object[] { paramString1, paramString2 });
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/utils/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */