package com.tencent.mm.plugin.appbrand.widget.picker;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class j
{
  public static boolean kh(int paramInt)
  {
    GMTrace.i(10124177440768L, 75431);
    if ((paramInt >= 0) && (paramInt <= 59))
    {
      GMTrace.o(10124177440768L, 75431);
      return true;
    }
    GMTrace.o(10124177440768L, 75431);
    return false;
  }
  
  public static boolean ki(int paramInt)
  {
    GMTrace.i(10124311658496L, 75432);
    if ((paramInt >= 0) && (paramInt <= 23))
    {
      GMTrace.o(10124311658496L, 75432);
      return true;
    }
    GMTrace.o(10124311658496L, 75432);
    return false;
  }
  
  public static int[] sG(String paramString)
  {
    GMTrace.i(10124445876224L, 75433);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10124445876224L, 75433);
      return null;
    }
    paramString = paramString.split(":");
    if ((paramString == null) || (paramString.length != 2))
    {
      GMTrace.o(10124445876224L, 75433);
      return null;
    }
    int i = sH(paramString[0]);
    int j = sH(paramString[1]);
    if ((!ki(i)) || (!kh(j)))
    {
      GMTrace.o(10124445876224L, 75433);
      return null;
    }
    GMTrace.o(10124445876224L, 75433);
    return new int[] { i, j };
  }
  
  private static int sH(String paramString)
  {
    GMTrace.i(10124580093952L, 75434);
    try
    {
      int i = Integer.parseInt(paramString, 10);
      GMTrace.o(10124580093952L, 75434);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(10124580093952L, 75434);
    }
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */