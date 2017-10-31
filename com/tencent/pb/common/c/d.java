package com.tencent.pb.common.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import java.lang.reflect.Field;

public final class d
{
  private static boolean DEBUG = false;
  private static int SDK_VERSION;
  public static int pWz;
  public static Context rwf = null;
  private static final Uri rwh = Uri.parse("content://com.lbe.security.miui.permmgr/active");
  private static String sImei;
  private static String toU;
  public static boolean xra = false;
  public static long xrb = 0L;
  public static String xrc = null;
  public static int xrd;
  
  static
  {
    SDK_VERSION = -1;
    toU = null;
    pWz = 320;
    xrd = 480;
    sImei = null;
  }
  
  public static int cjO()
  {
    if (SDK_VERSION < 0) {
      SDK_VERSION = Build.VERSION.SDK_INT;
    }
    return SDK_VERSION;
  }
  
  public static String cjP()
  {
    if (toU == null) {
      toU = Build.VERSION.RELEASE;
    }
    return toU;
  }
  
  public static String cjQ()
  {
    return Build.VERSION.INCREMENTAL;
  }
  
  public static String cjR()
  {
    if (cjO() > 8) {}
    for (;;)
    {
      try
      {
        String str1 = (String)((Build)Class.forName("android.os.Build").newInstance()).getClass().getField("HARDWARE").get("UNKNOW");
        c.d("", new Object[] { "hardware:" + str1 });
        return str1;
      }
      catch (SecurityException localSecurityException)
      {
        String str2 = "UNKNOW";
        continue;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        String str3 = "UNKNOW";
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        String str4 = "UNKNOW";
        continue;
      }
      catch (InstantiationException localInstantiationException)
      {
        String str5 = "UNKNOW";
        continue;
      }
      catch (NoSuchFieldException localNoSuchFieldException) {}
      String str6 = "UNKNOW";
    }
  }
  
  public static String cjS()
  {
    String str2 = Build.MANUFACTURER;
    String str1 = str2;
    if (str2 == null) {
      str1 = "UNKNOWN";
    }
    return str1;
  }
  
  public static String getModel()
  {
    return Build.MODEL;
  }
  
  public static boolean isApkExist(String paramString)
  {
    if ("".equals(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        paramString = rwf.getPackageManager().getApplicationInfo(paramString, 128);
        if (paramString != null) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException paramString) {}
    }
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */