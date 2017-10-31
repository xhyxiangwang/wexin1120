package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.a;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Set;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  public static final int CTRL_INDEX = 298;
  public static final String NAME = "insertHTMLWebView";
  
  public f()
  {
    GMTrace.i(19752823029760L, 147170);
    GMTrace.o(19752823029760L, 147170);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject)
  {
    GMTrace.i(19752957247488L, 147171);
    if (paramAppBrandPageView.Zd() != null)
    {
      GMTrace.o(19752957247488L, 147171);
      return null;
    }
    paramJSONObject = new a(paramAppBrandPageView.mContext, paramAppBrandPageView.irS, paramAppBrandPageView);
    AppBrandPageView.a local1 = new AppBrandPageView.a()
    {
      public final boolean XO()
      {
        GMTrace.i(19750943981568L, 147156);
        if (paramJSONObject.jeA.canGoBack())
        {
          paramJSONObject.jeA.goBack();
          GMTrace.o(19750943981568L, 147156);
          return true;
        }
        GMTrace.o(19750943981568L, 147156);
        return false;
      }
    };
    paramAppBrandPageView.jkX.add(local1);
    GMTrace.o(19752957247488L, 147171);
    return paramJSONObject;
  }
  
  protected final void b(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19753225682944L, 147173);
    GMTrace.o(19753225682944L, 147173);
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(19753091465216L, 147172);
    int i = paramJSONObject.getInt("htmlId");
    GMTrace.o(19753091465216L, 147172);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */