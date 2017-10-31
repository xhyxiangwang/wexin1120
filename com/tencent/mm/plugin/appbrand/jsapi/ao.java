package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ao
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 253;
  public static final String NAME = "insertImageView";
  
  public ao()
  {
    GMTrace.i(17670166544384L, 131653);
    GMTrace.o(17670166544384L, 131653);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(17670300762112L, 131654);
    paramAppBrandPageView = new com.tencent.mm.plugin.appbrand.widget.d(paramAppBrandPageView.mContext);
    paramAppBrandPageView.setScaleType(ImageView.ScaleType.FIT_XY);
    GMTrace.o(17670300762112L, 131654);
    return paramAppBrandPageView;
  }
  
  protected final void b(final AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, final JSONObject paramJSONObject)
  {
    GMTrace.i(17670569197568L, 131656);
    boolean bool1 = paramJSONObject.optBoolean("clickable");
    boolean bool2 = paramJSONObject.optBoolean("transEvt");
    String str1 = paramJSONObject.optString("sendTo", "appservice");
    String str2 = paramJSONObject.optString("data", "");
    com.tencent.mm.plugin.appbrand.jsapi.k.d.a(paramView, paramJSONObject.optJSONObject("style"));
    com.tencent.mm.plugin.appbrand.jsapi.k.a.a(paramAppBrandPageView, (ImageView)paramView, paramJSONObject);
    paramJSONObject = paramAppBrandPageView.jla.t(paramInt, true);
    paramJSONObject.k("data", str2);
    paramJSONObject.k("sendTo", str1);
    paramJSONObject.k("transEvt", Boolean.valueOf(bool2));
    paramJSONObject.k("clickable", Boolean.valueOf(bool1));
    paramView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17672179810304L, 131668);
        if (!paramJSONObject.gj("clickable"))
        {
          GMTrace.o(17672179810304L, 131668);
          return;
        }
        paramAnonymousView = new ao.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("data", paramJSONObject.getString("data", ""));
        paramAnonymousView.a(paramAppBrandPageView);
        paramAnonymousView.r(localHashMap);
        if ("webview".equals(paramJSONObject.getString("sendTo", null)))
        {
          paramAnonymousView.f(new int[] { paramAppBrandPageView.hashCode() });
          GMTrace.o(17672179810304L, 131668);
          return;
        }
        paramAnonymousView.VI();
        GMTrace.o(17672179810304L, 131668);
      }
    });
    paramView.setClickable(bool1);
    GMTrace.o(17670569197568L, 131656);
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17670434979840L, 131655);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17670434979840L, 131655);
    return i;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 256;
    private static final String NAME = "onImageViewClick";
    
    public a()
    {
      GMTrace.i(17669898108928L, 131651);
      GMTrace.o(17669898108928L, 131651);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */