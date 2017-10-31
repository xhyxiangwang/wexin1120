package com.tencent.pb.b.a;

import com.tencent.pb.common.c.h;

public final class a
{
  private static String TAG = "AccountEngine";
  private static int xrg = 0;
  private static String xrh = "";
  
  public static void El(int paramInt)
  {
    xrg = paramInt;
  }
  
  public static void WP(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    xrh = str;
  }
  
  public static String cjV()
  {
    return xrh;
  }
  
  public static boolean cjW()
  {
    return !h.xJ(xrh);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */