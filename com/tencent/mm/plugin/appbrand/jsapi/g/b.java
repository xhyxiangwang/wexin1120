package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 57;
  public static final String NAME = "requestPayment";
  
  public b()
  {
    GMTrace.i(14425855623168L, 107481);
    GMTrace.o(14425855623168L, 107481);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14425989840896L, 107482);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14425989840896L, 107482);
      return;
    }
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14425989840896L, 107482);
      return;
    }
    Object localObject;
    try
    {
      paramJSONObject.put("appId", paramk.iqL);
      localObject = new PString();
      if (!((com.tencent.mm.plugin.appbrand.compat.a.d)h.h(com.tencent.mm.plugin.appbrand.compat.a.d.class)).a(localMMActivity, paramk.irS.iqW, paramJSONObject, new d.a()
      {
        public final void f(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
        {
          GMTrace.i(19807583862784L, 147578);
          switch (paramAnonymousInt1)
          {
          }
          for (;;)
          {
            GMTrace.o(19807583862784L, 147578);
            return;
            paramk.v(paramInt, b.this.d("ok", null));
            GMTrace.o(19807583862784L, 147578);
            return;
            HashMap localHashMap = new HashMap();
            localHashMap.put("err_code", Integer.valueOf(paramAnonymousInt2));
            localHashMap.put("err_desc", paramAnonymousString);
            paramk.v(paramInt, b.this.d("fail", localHashMap));
            GMTrace.o(19807583862784L, 147578);
            return;
            paramk.v(paramInt, b.this.d("cancel", null));
          }
        }
      }, (PString)localObject))
      {
        paramk.v(paramInt, d("fail", null));
        GMTrace.o(14425989840896L, 107482);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiRequestPayment", paramJSONObject.getMessage());
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14425989840896L, 107482);
      return;
    }
    paramk = b(paramk);
    paramJSONObject = ((PString)localObject).value;
    if (paramk != null)
    {
      localObject = new ReportSubmitFormTask(paramk.iqL);
      ((ReportSubmitFormTask)localObject).type = 0;
      ((ReportSubmitFormTask)localObject).iUu = paramJSONObject.replace("prepay_id=", "");
      ((ReportSubmitFormTask)localObject).iJY = paramk.jlc.jlV;
      AppBrandMainProcessService.a((MainProcessTask)localObject);
    }
    GMTrace.o(14425989840896L, 107482);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */