package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import java.util.Stack;
import org.json.JSONArray;

public final class o
  implements d
{
  public o()
  {
    GMTrace.i(17715532136448L, 131991);
    GMTrace.o(17715532136448L, 131991);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17715800571904L, 131993);
    paramCanvas.save();
    paramCanvas = paramd.iFI;
    paramd.iFK.push(paramd.iFI);
    paramd.iFI = paramd.iFI.TJ();
    if (paramd.iFI == null) {
      paramd.iFI = paramCanvas;
    }
    paramCanvas = paramd.iFJ;
    paramd.iFL.push(paramd.iFJ);
    paramd.iFJ = paramd.iFJ.TJ();
    if (paramd.iFJ == null) {
      paramd.iFJ = paramCanvas;
    }
    GMTrace.o(17715800571904L, 131993);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17715666354176L, 131992);
    GMTrace.o(17715666354176L, 131992);
    return "save";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */