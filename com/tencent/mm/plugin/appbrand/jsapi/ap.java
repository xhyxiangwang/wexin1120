package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.k.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.widget.g;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ap
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 253;
  public static final String NAME = "insertTextView";
  
  public ap()
  {
    GMTrace.i(17683051446272L, 131749);
    GMTrace.o(17683051446272L, 131749);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(17683185664000L, 131750);
    paramAppBrandPageView = new g(paramAppBrandPageView.mContext);
    GMTrace.o(17683185664000L, 131750);
    return paramAppBrandPageView;
  }
  
  protected final void b(final AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, final JSONObject paramJSONObject)
  {
    GMTrace.i(17683454099456L, 131752);
    boolean bool1 = paramJSONObject.optBoolean("clickable");
    boolean bool2 = paramJSONObject.optBoolean("transEvt");
    String str1 = paramJSONObject.optString("sendTo", "appservice");
    String str2 = paramJSONObject.optString("data", "");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("label");
    com.tencent.mm.plugin.appbrand.jsapi.k.a.a((TextView)paramView, localJSONObject);
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    paramJSONObject = paramAppBrandPageView.jla.t(paramInt, true);
    paramJSONObject.k("data", str2);
    paramJSONObject.k("sendTo", str1);
    paramJSONObject.k("transEvt", Boolean.valueOf(bool2));
    paramJSONObject.k("clickable", Boolean.valueOf(bool1));
    paramView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17682917228544L, 131748);
        if (!paramJSONObject.gj("clickable"))
        {
          GMTrace.o(17682917228544L, 131748);
          return;
        }
        paramAnonymousView = new ap.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("data", paramJSONObject.getString("data", ""));
        paramAnonymousView.a(paramAppBrandPageView);
        paramAnonymousView.r(localHashMap);
        if ("webview".equals(paramJSONObject.getString("sendTo", null)))
        {
          paramAnonymousView.f(new int[] { paramAppBrandPageView.hashCode() });
          GMTrace.o(17682917228544L, 131748);
          return;
        }
        paramAnonymousView.VI();
        GMTrace.o(17682917228544L, 131748);
      }
    });
    paramView.setClickable(bool1);
    GMTrace.o(17683454099456L, 131752);
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17683319881728L, 131751);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17683319881728L, 131751);
    return i;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 256;
    private static final String NAME = "onTextViewClick";
    
    public a()
    {
      GMTrace.i(17669763891200L, 131650);
      GMTrace.o(17669763891200L, 131650);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */