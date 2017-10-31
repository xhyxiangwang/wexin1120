package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 218;
  public static final String NAME = "sendBizRedPacket";
  
  public d()
  {
    GMTrace.i(15487786287104L, 115393);
    GMTrace.o(15487786287104L, 115393);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(15487920504832L, 115394);
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(15487920504832L, 115394);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramk.iqL);
      ((com.tencent.mm.plugin.appbrand.compat.a.d)h.h(com.tencent.mm.plugin.appbrand.compat.a.d.class)).b(localMMActivity, paramJSONObject, new d.a()
      {
        public final void f(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
        {
          GMTrace.i(19807315427328L, 147576);
          switch (paramAnonymousInt1)
          {
          default: 
            paramk.v(paramInt, d.this.d("fail", null));
            GMTrace.o(19807315427328L, 147576);
            return;
          }
          paramk.v(paramInt, d.this.d("ok", null));
          GMTrace.o(19807315427328L, 147576);
        }
      });
      GMTrace.o(15487920504832L, 115394);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiSendBizRedPacket", paramJSONObject.getMessage());
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(15487920504832L, 115394);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */