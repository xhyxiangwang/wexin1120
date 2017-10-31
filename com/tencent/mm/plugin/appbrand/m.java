package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public enum m
{
  static
  {
    GMTrace.i(10193836441600L, 75950);
    irX = new m[0];
    GMTrace.o(10193836441600L, 75950);
  }
  
  public static String R(String paramString, int paramInt)
  {
    GMTrace.i(16148271726592L, 120314);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
      GMTrace.o(16148271726592L, 120314);
      return "";
    }
    paramString = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", new Object[] { paramString, Integer.valueOf(paramInt) });
    GMTrace.o(16148271726592L, 120314);
    return paramString;
  }
  
  public static String a(WxaExposedParams paramWxaExposedParams)
  {
    GMTrace.i(18185831055360L, 135495);
    if ((paramWxaExposedParams == null) || (bg.mZ(paramWxaExposedParams.appId)))
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
      GMTrace.o(18185831055360L, 135495);
      return "";
    }
    try
    {
      paramWxaExposedParams = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { paramWxaExposedParams.appId, p.encode(bg.mY(paramWxaExposedParams.iJY), "UTF-8"), Integer.valueOf(paramWxaExposedParams.fwk), Integer.valueOf(bg.m(Integer.valueOf(paramWxaExposedParams.iCx), -1)), Integer.valueOf(bg.m(Integer.valueOf(paramWxaExposedParams.iCy), -1)) });
      GMTrace.o(18185831055360L, 135495);
      return paramWxaExposedParams;
    }
    catch (UnsupportedEncodingException paramWxaExposedParams)
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
      GMTrace.o(18185831055360L, 135495);
    }
    return "";
  }
  
  public static String nS(String paramString)
  {
    GMTrace.i(10192896917504L, 75943);
    paramString = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=overseas#wechat_redirect", new Object[] { paramString });
    GMTrace.o(10192896917504L, 75943);
    return paramString;
  }
  
  public static String nT(String paramString)
  {
    GMTrace.i(10193568006144L, 75948);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.AppBrandUrlBuilders", "buildEntityUrl fail, null or nil appId");
      GMTrace.o(10193568006144L, 75948);
      return "";
    }
    paramString = String.format("https://mp.weixin.qq.com/mp/waverifyinfo?action=get&appid=%s#wechat_redirect", new Object[] { paramString });
    GMTrace.o(10193568006144L, 75948);
    return paramString;
  }
  
  public static String nU(String paramString)
  {
    GMTrace.i(10193702223872L, 75949);
    paramString = R(paramString, 3);
    GMTrace.o(10193702223872L, 75949);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */