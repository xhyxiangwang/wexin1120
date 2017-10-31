package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  public static void a(View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17677548519424L, 131708);
    if ((paramView == null) || (paramJSONObject == null))
    {
      GMTrace.o(17677548519424L, 131708);
      return;
    }
    int i = c.rZ(paramJSONObject.optString("bgColor"));
    int j = c.jF(paramJSONObject.optInt("borderRadius"));
    int k = c.jF(paramJSONObject.optInt("borderWidth"));
    int m = c.rZ(paramJSONObject.optString("borderColor"));
    try
    {
      f1 = (float)paramJSONObject.getDouble("opacity");
      if ((f1 >= 0.0F) && (f1 <= 1.0F)) {
        paramView.setAlpha(f1);
      }
    }
    catch (JSONException localJSONException)
    {
      float f1;
      int n;
      int i1;
      int i2;
      float f2;
      for (;;) {}
    }
    paramJSONObject = paramJSONObject.optJSONArray("padding");
    if ((paramJSONObject != null) && (paramJSONObject.length() == 4))
    {
      n = c.jF(paramJSONObject.optInt(0));
      i1 = c.jF(paramJSONObject.optInt(1));
      i2 = c.jF(paramJSONObject.optInt(2));
      paramView.setPadding(c.jF(paramJSONObject.optInt(3)), n, i1, i2);
    }
    paramJSONObject = null;
    if (k > 0)
    {
      f1 = j;
      f2 = k;
      paramJSONObject = new RectF(f2, f2, f2, f2);
      paramJSONObject = new ShapeDrawable(new RoundRectShape(new float[] { f1, f1, f1, f1, f1, f1, f1, f1 }, paramJSONObject, new float[] { f1, f1, f1, f1, f1, f1, f1, f1 }));
      paramJSONObject.getPaint().setColor(m);
    }
    if (paramJSONObject == null)
    {
      paramView.setBackground(m.g(i, j));
      GMTrace.o(17677548519424L, 131708);
      return;
    }
    paramView.setBackground(new LayerDrawable(new Drawable[] { m.g(i, j), paramJSONObject }));
    GMTrace.o(17677548519424L, 131708);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */