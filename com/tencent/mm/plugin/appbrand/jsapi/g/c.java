package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 149;
  public static final String NAME = "requestPaymentToBank";
  
  public c()
  {
    GMTrace.i(14427197800448L, 107491);
    GMTrace.o(14427197800448L, 107491);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14427332018176L, 107492);
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427332018176L, 107492);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramk.iqL);
      ((com.tencent.mm.plugin.appbrand.compat.a.d)h.h(com.tencent.mm.plugin.appbrand.compat.a.d.class)).a(localMMActivity, paramk.irS.iqW, paramJSONObject, new d.a()
      {
        public final void f(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
        {
          GMTrace.i(19807449645056L, 147577);
          switch (paramAnonymousInt1)
          {
          default: 
            paramk.v(paramInt, c.this.d("fail", null));
            GMTrace.o(19807449645056L, 147577);
            return;
          }
          paramk.v(paramInt, c.this.d("ok", null));
          GMTrace.o(19807449645056L, 147577);
        }
      });
      GMTrace.o(14427332018176L, 107492);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiRequestPaymentToBank", paramJSONObject.getMessage());
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427332018176L, 107492);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */