package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 152;
  public static final String NAME = "getContactMessageCount";
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18205561061376L, 135642);
    paramJSONObject = "";
    final Object localObject = com.tencent.mm.plugin.appbrand.a.nx(paramAppBrandPageView.iqL);
    if (localObject != null) {
      paramJSONObject = ((AppBrandSysConfig)localObject).ftu;
    }
    if (bg.mZ(paramJSONObject)) {
      w.e("MicroMsg.JsApiGetAppConfig", "getContactMessageCount username is empty!!!");
    }
    localObject = new JsApiGetContactMessageCountTask();
    ((JsApiGetContactMessageCountTask)localObject).username = paramJSONObject;
    ((JsApiGetContactMessageCountTask)localObject).iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18205829496832L, 135644);
        HashMap localHashMap = new HashMap();
        localHashMap.put("count", localObject.ftv);
        w.i("MicroMsg.JsApiGetAppConfig", "JsApiGetContactMessageCountTask unreadCount:%d", new Object[] { Integer.valueOf(localObject.ftv) });
        if (localObject.ftv == -1) {
          paramAppBrandPageView.v(paramInt, d.this.d("fail", null));
        }
        for (;;)
        {
          localObject.VE();
          GMTrace.o(18205829496832L, 135644);
          return;
          paramAppBrandPageView.v(paramInt, d.this.d("ok", localHashMap));
        }
      }
    };
    ((JsApiGetContactMessageCountTask)localObject).VD();
    AppBrandMainProcessService.a((MainProcessTask)localObject);
    GMTrace.o(18205561061376L, 135642);
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 152;
    private static final String NAME = "onContactMessageCountChange";
    
    public a()
    {
      GMTrace.i(18207171674112L, 135654);
      GMTrace.o(18207171674112L, 135654);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */