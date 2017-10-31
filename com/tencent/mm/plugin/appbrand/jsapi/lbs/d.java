package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 38;
  public static final String NAME = "openLocation";
  
  public d()
  {
    GMTrace.i(19708128526336L, 146837);
    GMTrace.o(19708128526336L, 146837);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19708262744064L, 146838);
    try
    {
      f1 = bg.getFloat(paramJSONObject.optString("latitude"), 0.0F);
      f2 = bg.getFloat(paramJSONObject.optString("longitude"), 0.0F);
      localObject = com.tencent.mm.plugin.appbrand.o.d.sd(paramJSONObject.optString("name"));
      str = com.tencent.mm.plugin.appbrand.o.d.sd(paramJSONObject.optString("address"));
      i = 0;
    }
    catch (Exception paramJSONObject)
    {
      float f1;
      float f2;
      Object localObject;
      String str;
      int i;
      int j;
      label73:
      paramk.v(paramInt, d("invalid_coordinate", null));
      GMTrace.o(19708262744064L, 146838);
      return;
    }
    try
    {
      j = bg.getInt(paramJSONObject.optString("scale"), 0);
      i = j;
    }
    catch (Exception paramJSONObject)
    {
      break label73;
    }
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("map_view_type", 7);
    paramJSONObject.putExtra("kwebmap_slat", f1);
    paramJSONObject.putExtra("kwebmap_lng", f2);
    if (i > 0) {
      paramJSONObject.putExtra("kwebmap_scale", i);
    }
    paramJSONObject.putExtra("kPoiName", (String)localObject);
    paramJSONObject.putExtra("Kwebmap_locaion", str);
    localObject = a(paramk);
    if (localObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19708262744064L, 146838);
      return;
    }
    com.tencent.mm.bi.d.b((Context)localObject, "location", ".ui.RedirectUI", paramJSONObject);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(19708262744064L, 146838);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */