package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 85;
  public static final String NAME = "verifyPaymentPassword";
  
  public e()
  {
    GMTrace.i(14427734671360L, 107495);
    GMTrace.o(14427734671360L, 107495);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14427868889088L, 107496);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427868889088L, 107496);
      return;
    }
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427868889088L, 107496);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramk.iqL);
      ((com.tencent.mm.plugin.appbrand.compat.a.d)h.h(com.tencent.mm.plugin.appbrand.compat.a.d.class)).a(localMMActivity, paramJSONObject, new d.b()
      {
        public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
        {
          GMTrace.i(19807181209600L, 147575);
          if (paramAnonymousBoolean)
          {
            HashMap localHashMap = new HashMap(1);
            localHashMap.put("token", paramAnonymousString);
            paramk.v(paramInt, e.this.d("ok", localHashMap));
            GMTrace.o(19807181209600L, 147575);
            return;
          }
          paramk.v(paramInt, e.this.d("fail", null));
          GMTrace.o(19807181209600L, 147575);
        }
      });
      GMTrace.o(14427868889088L, 107496);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiVerifyPaymentPassword", paramJSONObject.getMessage());
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14427868889088L, 107496);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */