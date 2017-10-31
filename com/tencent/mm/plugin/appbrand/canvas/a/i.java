package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.b.a.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class i
  implements d
{
  public i()
  {
    GMTrace.i(17710431862784L, 131953);
    GMTrace.o(17710431862784L, 131953);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17710700298240L, 131955);
    if (paramJSONArray.length() < 3)
    {
      GMTrace.o(17710700298240L, 131955);
      return false;
    }
    String str = paramJSONArray.optString(0);
    float f3 = c.b(paramJSONArray, 1);
    float f2 = c.b(paramJSONArray, 2);
    paramJSONArray = paramd.iFI.getFontMetrics();
    float f1;
    if (paramd.iFI.iFT == a.a.iFW) {
      f1 = f2 + Math.abs(paramJSONArray.ascent);
    }
    for (;;)
    {
      paramCanvas.drawText(str, f3, f1, paramd.iFI);
      GMTrace.o(17710700298240L, 131955);
      return true;
      if (paramd.iFI.iFT == a.a.iFY)
      {
        f1 = f2 + Math.abs((-paramJSONArray.ascent + paramJSONArray.descent) / 2.0F - paramJSONArray.descent);
      }
      else
      {
        f1 = f2;
        if (paramd.iFI.iFT == a.a.iFX) {
          f1 = f2 - Math.abs(paramJSONArray.descent);
        }
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17710566080512L, 131954);
    GMTrace.o(17710566080512L, 131954);
    return "strokeText";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */