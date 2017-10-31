package com.tencent.mm.plugin.appbrand;

import android.support.v4.app.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final Map<String, f> iqf;
  private static Map<String, a.a> iqg;
  private static Map<String, AppBrandStatObject> iqh;
  private static Map<String, e> iqi;
  
  static
  {
    GMTrace.i(10669369851904L, 79493);
    iqf = new HashMap();
    iqg = new HashMap();
    iqh = new HashMap();
    iqi = new HashMap();
    GMTrace.o(10669369851904L, 79493);
  }
  
  public static void a(String paramString, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(10668161892352L, 79484);
    if (!iqg.containsKey(paramString))
    {
      GMTrace.o(10668161892352L, 79484);
      return;
    }
    ((a.a)iqg.remove(paramString)).onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    GMTrace.o(10668161892352L, 79484);
  }
  
  public static void a(String paramString, a.a parama)
  {
    GMTrace.i(10668027674624L, 79483);
    iqg.put(paramString, parama);
    GMTrace.o(10668027674624L, 79483);
  }
  
  public static void a(String paramString, f paramf)
  {
    GMTrace.i(15562679779328L, 115951);
    if (bg.mZ(paramString))
    {
      GMTrace.o(15562679779328L, 115951);
      return;
    }
    synchronized (iqf)
    {
      iqf.put(paramString, paramf);
      GMTrace.o(15562679779328L, 115951);
      return;
    }
  }
  
  public static void a(String paramString, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(19685043077120L, 146665);
    iqh.put(paramString, paramAppBrandStatObject);
    GMTrace.o(19685043077120L, 146665);
  }
  
  public static void a(String paramString, e parame)
  {
    GMTrace.i(15562813997056L, 115952);
    iqi.put(paramString, parame);
    GMTrace.o(15562813997056L, 115952);
  }
  
  public static void nA(String paramString)
  {
    GMTrace.i(17402267959296L, 129657);
    iqi.remove(paramString);
    GMTrace.o(17402267959296L, 129657);
  }
  
  public static f nv(String paramString)
  {
    GMTrace.i(16168404385792L, 120464);
    if (bg.mZ(paramString))
    {
      GMTrace.o(16168404385792L, 120464);
      return null;
    }
    synchronized (iqf)
    {
      paramString = (f)iqf.get(paramString);
      GMTrace.o(16168404385792L, 120464);
      return paramString;
    }
  }
  
  public static void nw(String paramString)
  {
    GMTrace.i(10668296110080L, 79485);
    iqg.remove(paramString);
    GMTrace.o(10668296110080L, 79485);
  }
  
  public static AppBrandSysConfig nx(String paramString)
  {
    GMTrace.i(10668564545536L, 79487);
    if (nv(paramString) == null)
    {
      GMTrace.o(10668564545536L, 79487);
      return null;
    }
    paramString = nv(paramString).iqO;
    GMTrace.o(10668564545536L, 79487);
    return paramString;
  }
  
  public static AppBrandStatObject ny(String paramString)
  {
    GMTrace.i(10668832980992L, 79489);
    paramString = (AppBrandStatObject)iqh.get(paramString);
    GMTrace.o(10668832980992L, 79489);
    return paramString;
  }
  
  public static e nz(String paramString)
  {
    GMTrace.i(15562948214784L, 115953);
    paramString = (e)iqi.get(paramString);
    GMTrace.o(15562948214784L, 115953);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */