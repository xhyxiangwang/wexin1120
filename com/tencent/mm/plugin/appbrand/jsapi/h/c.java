package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

abstract class c
  extends b
{
  private int iPM;
  WeakReference<AppBrandPageView> iWI;
  private d jae;
  
  c()
  {
    GMTrace.i(10381070172160L, 77345);
    GMTrace.o(10381070172160L, 77345);
  }
  
  protected final View WR()
  {
    GMTrace.i(10381472825344L, 77348);
    if (this.iWI == null)
    {
      GMTrace.o(10381472825344L, 77348);
      return null;
    }
    LinearLayout localLinearLayout = ((AppBrandPageView)this.iWI.get()).jjV;
    GMTrace.o(10381472825344L, 77348);
    return localLinearLayout;
  }
  
  final void a(d paramd, AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10381338607616L, 77347);
    this.jae = paramd;
    this.iWI = new WeakReference(paramAppBrandPageView);
    this.iPM = paramInt;
    l(paramJSONObject);
    GMTrace.o(10381338607616L, 77347);
  }
  
  final void e(String paramString, Map<String, Object> paramMap)
  {
    GMTrace.i(10381607043072L, 77349);
    if ((this.iWI != null) && (this.iWI.get() != null) && (this.jae != null)) {
      ((AppBrandPageView)this.iWI.get()).v(this.iPM, this.jae.d(paramString, paramMap));
    }
    GMTrace.o(10381607043072L, 77349);
  }
  
  abstract void l(JSONObject paramJSONObject);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */