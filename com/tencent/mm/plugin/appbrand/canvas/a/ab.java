package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;

public final class ab
  implements d
{
  public ab()
  {
    GMTrace.i(17712042475520L, 131965);
    GMTrace.o(17712042475520L, 131965);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17712310910976L, 131967);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17712310910976L, 131967);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    w.i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", new Object[] { paramCanvas });
    if ("top".equalsIgnoreCase(paramCanvas))
    {
      paramd.iFI.iFT = a.a.iFW;
      paramd.iFJ.iFT = a.a.iFW;
    }
    for (;;)
    {
      GMTrace.o(17712310910976L, 131967);
      return true;
      if ("middle".equalsIgnoreCase(paramCanvas))
      {
        paramd.iFI.iFT = a.a.iFY;
        paramd.iFJ.iFT = a.a.iFY;
      }
      else if ("bottom".equalsIgnoreCase(paramCanvas))
      {
        paramd.iFI.iFT = a.a.iFX;
        paramd.iFJ.iFT = a.a.iFX;
      }
      else if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramd.iFI.iFT = a.a.iFV;
        paramd.iFJ.iFT = a.a.iFV;
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17712176693248L, 131966);
    GMTrace.o(17712176693248L, 131966);
    return "setTextBaseline";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */