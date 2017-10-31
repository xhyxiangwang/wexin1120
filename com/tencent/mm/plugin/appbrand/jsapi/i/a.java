package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 106;
  private static final String NAME = "hideToast";
  
  public a()
  {
    GMTrace.i(17678756478976L, 131717);
    GMTrace.o(17678756478976L, 131717);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17678890696704L, 131718);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17677816954880L, 131710);
        a locala = a.this;
        k localk = paramk;
        int i = paramInt;
        Object localObject = q.Aw().gh(localk.hashCode() + "toast_name");
        if (localObject != null)
        {
          localObject = (View)((q.b)localObject).get("toast_view", null);
          if (localObject != null)
          {
            ((View)localObject).setVisibility(8);
            localk.v(i, locala.d("ok", null));
            GMTrace.o(17677816954880L, 131710);
            return;
          }
        }
        localk.v(i, locala.d("fail", null));
        GMTrace.o(17677816954880L, 131710);
      }
    });
    GMTrace.o(17678890696704L, 131718);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */