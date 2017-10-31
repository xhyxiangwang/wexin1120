package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface;
import com.tencent.mm.plugin.appbrand.o.h.a;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.f.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.plugin.appbrand.jsapi.c
{
  public boolean UF;
  public String iqL;
  public final f irS;
  AppBrandJSInterface irT;
  public c irU;
  private LinkedList<a> irV;
  public Context mContext;
  
  public k(Context paramContext, f paramf)
  {
    GMTrace.i(15561606037504L, 115943);
    this.UF = true;
    this.irV = new LinkedList();
    this.mContext = paramContext;
    this.irS = paramf;
    this.iqL = paramf.iqL;
    this.irT = new AppBrandJSInterface(this);
    paramContext = ab.getContext();
    paramf = this.irT;
    Object localObject = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    String str = ((SharedPreferences)localObject).getString("tbs_webview_disable", "0");
    if ((!((SharedPreferences)localObject).getBoolean("switch_x5_jscore", true)) || ("1".equals(str)))
    {
      paramContext = new n(paramContext, paramf, "WeixinJSCore");
      this.irU = paramContext;
      if (!this.irU.wv()) {
        break label222;
      }
      g.paX.a(434L, 1L, 1L, false);
      w.i("MicroMsg.AppBrandService", "Using WebView Based Javascript Engine");
    }
    for (;;)
    {
      g.paX.a(434L, 0L, 1L, false);
      GMTrace.o(15561606037504L, 115943);
      return;
      localObject = com.tencent.xweb.f.a(f.a.xOF, paramContext);
      if (localObject != null)
      {
        paramContext = new AppBrandIndV8JsEngine(paramf, "WeixinJSCore", (com.tencent.xweb.f)localObject);
        break;
      }
      paramContext = new n(paramContext, paramf, "WeixinJSCore");
      break;
      label222:
      g.paX.a(434L, 2L, 1L, false);
      w.i("MicroMsg.AppBrandService", "Using v8 Javascript Engine");
    }
  }
  
  static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    GMTrace.i(10662658965504L, 79443);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      GMTrace.o(10662658965504L, 79443);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.AppBrandService", paramJSONObject.getMessage());
      GMTrace.o(10662658965504L, 79443);
    }
  }
  
  final void RP()
  {
    try
    {
      GMTrace.i(17842904760320L, 132940);
      Iterator localIterator = this.irV.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        super.h(locala.fut, locala.data, locala.src);
      }
      this.irV = null;
    }
    finally {}
    GMTrace.o(17842904760320L, 132940);
  }
  
  public final f RQ()
  {
    GMTrace.i(17401059999744L, 129648);
    f localf = this.irS;
    GMTrace.o(17401059999744L, 129648);
    return localf;
  }
  
  public final c RR()
  {
    GMTrace.i(17401194217472L, 129649);
    c localc = this.irU;
    GMTrace.o(17401194217472L, 129649);
    return localc;
  }
  
  public final boolean Rv()
  {
    GMTrace.i(19861270953984L, 147978);
    boolean bool = this.irU.Rv();
    GMTrace.o(19861270953984L, 147978);
    return bool;
  }
  
  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10661719441408L, 79436);
    this.irS.iqR.c(paramString1, paramString2, paramArrayOfInt);
    GMTrace.o(10661719441408L, 79436);
  }
  
  public final String getAppId()
  {
    GMTrace.i(10662390530048L, 79441);
    String str = this.iqL;
    GMTrace.o(10662390530048L, 79441);
    return str;
  }
  
  public final void h(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(17843038978048L, 132941);
    try
    {
      if (this.irV != null)
      {
        this.irV.add(new a(paramString1, paramString2, paramInt));
        GMTrace.o(17843038978048L, 132941);
        return;
      }
      super.h(paramString1, paramString2, paramInt);
      GMTrace.o(17843038978048L, 132941);
      return;
    }
    finally {}
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(10661987876864L, 79438);
    boolean bool = this.UF;
    GMTrace.o(10661987876864L, 79438);
    return bool;
  }
  
  private static final class a
  {
    String data;
    String fut;
    int src;
    
    a(String paramString1, String paramString2, int paramInt)
    {
      GMTrace.i(17848944558080L, 132985);
      this.fut = paramString1;
      this.data = paramString2;
      this.src = paramInt;
      GMTrace.o(17848944558080L, 132985);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */