package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 119;
  private static final String NAME = "removeTextArea";
  
  public d()
  {
    GMTrace.i(10365366697984L, 77228);
    GMTrace.o(10365366697984L, 77228);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10365500915712L, 77229);
    paramJSONObject = paramJSONObject.optString("inputId", "");
    if (bg.mZ(paramJSONObject))
    {
      paramAppBrandPageView.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10365500915712L, 77229);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10364964044800L, 77225);
        if ((((AppBrandPageView)this.iWs.get()).mContext instanceof MMActivity)) {
          ((MMActivity)((AppBrandPageView)this.iWs.get()).mContext).aKl();
        }
        if (m.sx(paramJSONObject)) {}
        for (String str = "ok";; str = "fail")
        {
          if (this.iWs.get() != null) {
            ((AppBrandPageView)this.iWs.get()).v(paramInt, d.this.d(str, null));
          }
          GMTrace.o(10364964044800L, 77225);
          return;
        }
      }
    });
    GMTrace.o(10365500915712L, 77229);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */