package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class aa
  implements d
{
  public aa()
  {
    GMTrace.i(17718350708736L, 132012);
    GMTrace.o(17718350708736L, 132012);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17718619144192L, 132014);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17718619144192L, 132014);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    if ("left".equalsIgnoreCase(paramCanvas))
    {
      paramd.iFI.setTextAlign(Paint.Align.LEFT);
      paramd.iFJ.setTextAlign(Paint.Align.LEFT);
    }
    for (;;)
    {
      GMTrace.o(17718619144192L, 132014);
      return true;
      if ("right".equalsIgnoreCase(paramCanvas))
      {
        paramd.iFI.setTextAlign(Paint.Align.RIGHT);
        paramd.iFJ.setTextAlign(Paint.Align.RIGHT);
      }
      else if ("center".equalsIgnoreCase(paramCanvas))
      {
        paramd.iFI.setTextAlign(Paint.Align.CENTER);
        paramd.iFJ.setTextAlign(Paint.Align.CENTER);
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17718484926464L, 132013);
    GMTrace.o(17718484926464L, 132013);
    return "setTextAlign";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */