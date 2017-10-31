package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import org.json.JSONObject;

public final class f
  extends a
{
  public static final int CTRL_INDEX = 202;
  public static final String NAME = "showShareMenuWithShareTicket";
  
  public f()
  {
    GMTrace.i(18232404606976L, 135842);
    GMTrace.o(18232404606976L, 135842);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18232538824704L, 135843);
    w.i("MicroMsg.JsApiShowShareMenuWithShareTicket", "invoke");
    paramJSONObject = b(paramk);
    if (paramJSONObject != null)
    {
      paramJSONObject.s(l.jii, false);
      paramJSONObject = paramJSONObject.jb(l.jii);
      if (paramJSONObject == null)
      {
        paramk.v(paramInt, d("fail:menu item do not exist", null));
        GMTrace.o(18232538824704L, 135843);
        return;
      }
      paramJSONObject.iLn.k("enable_share_with_share_ticket", Boolean.valueOf(true));
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(18232538824704L, 135843);
      return;
    }
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(18232538824704L, 135843);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */