package com.tencent.mm.plugin.appbrand.appcache;

import android.content.res.Resources;
import android.util.Pair;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.e.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class a
{
  private static final SparseIntArray iAA;
  
  static
  {
    GMTrace.i(10620380381184L, 79128);
    SparseIntArray localSparseIntArray = new SparseIntArray(3);
    iAA = localSparseIntArray;
    localSparseIntArray.put(0, a.a.dvl);
    iAA.put(1, a.a.iOc);
    iAA.put(2, a.a.iOb);
    GMTrace.o(10620380381184L, 79128);
  }
  
  public static boolean az(String paramString1, String paramString2)
  {
    boolean bool = false;
    GMTrace.i(19996696641536L, 148987);
    if ((bg.mZ(paramString1)) || (!e.aZ(paramString1)))
    {
      GMTrace.o(19996696641536L, 148987);
      return false;
    }
    paramString1 = new n(new File(paramString1));
    if (!paramString1.Sx())
    {
      paramString1.close();
      GMTrace.o(19996696641536L, 148987);
      return false;
    }
    if (bg.mZ(paramString2))
    {
      paramString1.close();
      GMTrace.o(19996696641536L, 148987);
      return false;
    }
    paramString2 = paramString1.oa(com.tencent.mm.plugin.appbrand.n.h.sa(paramString2));
    if (paramString2 != null)
    {
      bool = true;
      bg.g(paramString2);
    }
    paramString1.close();
    GMTrace.o(19996696641536L, 148987);
    return bool;
  }
  
  public static String hJ(int paramInt)
  {
    GMTrace.i(10619977728000L, 79125);
    paramInt = iAA.get(paramInt, a.a.dvl);
    String str = ab.getResources().getString(paramInt);
    GMTrace.o(10619977728000L, 79125);
    return str;
  }
  
  static int n(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(10619709292544L, 79123);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(10619709292544L, 79123);
      return 0;
    }
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte, paramInt, 4);
    paramArrayOfByte.order(ByteOrder.BIG_ENDIAN);
    paramInt = paramArrayOfByte.getInt();
    GMTrace.o(10619709292544L, 79123);
    return paramInt;
  }
  
  public static String nW(String paramString)
  {
    GMTrace.i(10620111945728L, 79126);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10620111945728L, 79126);
      return paramString;
    }
    int i = 0;
    while ((i < paramString.length()) && ('/' == paramString.charAt(i))) {
      i += 1;
    }
    paramString = paramString.substring(i);
    GMTrace.o(10620111945728L, 79126);
    return paramString;
  }
  
  public static String nX(String paramString)
  {
    int i = 0;
    GMTrace.i(10620246163456L, 79127);
    w.d("MicroMsg.AppBrandAppCacheUtil", "eliminateDuplicateSlashForPkgFile, original file name = %s", new Object[] { paramString });
    if (!paramString.startsWith("/"))
    {
      paramString = "/" + paramString;
      GMTrace.o(10620246163456L, 79127);
      return paramString;
    }
    while ((i < paramString.length()) && ('/' == paramString.charAt(i))) {
      i += 1;
    }
    paramString = "/" + paramString.substring(i);
    GMTrace.o(10620246163456L, 79127);
    return paramString;
  }
  
  public static WxaPkgWrappingInfo nY(String paramString)
  {
    GMTrace.i(19996830859264L, 148988);
    int[] arrayOfInt = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().od(paramString);
    if ((arrayOfInt != null) && (arrayOfInt.length > 1)) {}
    int j;
    for (int i = 1;; i = j)
    {
      j = i + 1;
      Pair localPair = q.p(paramString, 0, arrayOfInt[i]);
      if ((localPair != null) && (localPair.first == q.a.iBG) && (localPair.second != null))
      {
        paramString = (WxaPkgWrappingInfo)localPair.second;
        GMTrace.o(19996830859264L, 148988);
        return paramString;
      }
      if (j >= arrayOfInt.length)
      {
        GMTrace.o(19996830859264L, 148988);
        return null;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */