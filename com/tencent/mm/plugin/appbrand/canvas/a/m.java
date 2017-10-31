package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import java.util.Stack;
import org.json.JSONArray;

public final class m
  implements d
{
  public m()
  {
    GMTrace.i(17717545402368L, 132006);
    GMTrace.o(17717545402368L, 132006);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17717813837824L, 132008);
    paramCanvas.restore();
    if (!paramd.iFK.isEmpty())
    {
      paramd.iFI = ((a)paramd.iFK.pop());
      paramd.iFJ = ((a)paramd.iFL.pop());
    }
    GMTrace.o(17717813837824L, 132008);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17717679620096L, 132007);
    GMTrace.o(17717679620096L, 132007);
    return "restore";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */