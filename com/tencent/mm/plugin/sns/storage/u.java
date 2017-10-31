package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class u
{
  public static boolean FN(String paramString)
  {
    GMTrace.i(8302842871808L, 61861);
    if ((paramString != null) && (paramString.startsWith("sns_table_")))
    {
      GMTrace.o(8302842871808L, 61861);
      return true;
    }
    GMTrace.o(8302842871808L, 61861);
    return false;
  }
  
  public static boolean HT(String paramString)
  {
    GMTrace.i(8302708654080L, 61860);
    if ((paramString != null) && (paramString.startsWith("ad_table_")))
    {
      GMTrace.o(8302708654080L, 61860);
      return true;
    }
    GMTrace.o(8302708654080L, 61860);
    return false;
  }
  
  public static long HU(String paramString)
  {
    GMTrace.i(8302977089536L, 61862);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8302977089536L, 61862);
      return 0L;
    }
    if (paramString.startsWith("ad_table_"))
    {
      l = bg.RG(paramString.substring(9));
      GMTrace.o(8302977089536L, 61862);
      return l;
    }
    if (paramString.startsWith("sns_table_"))
    {
      l = bg.RG(paramString.substring(10));
      GMTrace.o(8302977089536L, 61862);
      return l;
    }
    long l = bg.RG(paramString);
    GMTrace.o(8302977089536L, 61862);
    return l;
  }
  
  public static int HV(String paramString)
  {
    GMTrace.i(8303111307264L, 61863);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8303111307264L, 61863);
      return 0;
    }
    if (paramString.startsWith("ad_table_"))
    {
      i = bg.RF(paramString.substring(9));
      GMTrace.o(8303111307264L, 61863);
      return i;
    }
    int i = bg.RF(paramString.substring(10));
    GMTrace.o(8303111307264L, 61863);
    return i;
  }
  
  public static boolean HW(String paramString)
  {
    GMTrace.i(8303245524992L, 61864);
    if (paramString.startsWith("ad_table_"))
    {
      if (bg.RG(paramString.substring(9)) != 0L)
      {
        GMTrace.o(8303245524992L, 61864);
        return true;
      }
      GMTrace.o(8303245524992L, 61864);
      return false;
    }
    if (bg.RG(paramString.substring(10)) != 0L)
    {
      GMTrace.o(8303245524992L, 61864);
      return true;
    }
    GMTrace.o(8303245524992L, 61864);
    return false;
  }
  
  public static boolean HX(String paramString)
  {
    GMTrace.i(8303379742720L, 61865);
    if (!HW(paramString))
    {
      GMTrace.o(8303379742720L, 61865);
      return true;
    }
    GMTrace.o(8303379742720L, 61865);
    return false;
  }
  
  public static String V(String paramString, long paramLong)
  {
    GMTrace.i(8302440218624L, 61858);
    paramString = paramString + paramLong;
    GMTrace.o(8302440218624L, 61858);
    return paramString;
  }
  
  public static String W(String paramString, long paramLong)
  {
    GMTrace.i(8302574436352L, 61859);
    paramString = paramString + paramLong;
    GMTrace.o(8302574436352L, 61859);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */