package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 86;
  public static final String NAME = "bindPaymentCard";
  
  public a()
  {
    GMTrace.i(14427466235904L, 107493);
    GMTrace.o(14427466235904L, 107493);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14427600453632L, 107494);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427600453632L, 107494);
      return;
    }
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427600453632L, 107494);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramk.iqL);
      ((com.tencent.mm.plugin.appbrand.compat.a.d)h.h(com.tencent.mm.plugin.appbrand.compat.a.d.class)).a(localMMActivity, paramJSONObject, new d.a()
      {
        public final void f(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
        {
          GMTrace.i(19807718080512L, 147579);
          switch (paramAnonymousInt1)
          {
          default: 
            paramk.v(paramInt, a.this.d("fail", null));
            GMTrace.o(19807718080512L, 147579);
            return;
          }
          paramk.v(paramInt, a.this.d("ok", null));
          GMTrace.o(19807718080512L, 147579);
        }
      });
      GMTrace.o(14427600453632L, 107494);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiBindPaymentCard", paramJSONObject.getMessage());
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427600453632L, 107494);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */