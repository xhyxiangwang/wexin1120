package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class c
  extends b
{
  private static final int CTRL_INDEX = 7;
  public static final String NAME = "removeVideoPlayer";
  
  public c()
  {
    GMTrace.i(17340796239872L, 129199);
    GMTrace.o(17340796239872L, 129199);
  }
  
  protected final boolean c(final AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17341064675328L, 129201);
    super.c(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    w.i("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof AppBrandVideoView))
    {
      w.w("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView not AppBrandVideoView");
      GMTrace.o(17341064675328L, 129201);
      return false;
    }
    paramAppBrandPageView = (AppBrandVideoView)paramView;
    paramAppBrandPageView.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17671106068480L, 131660);
        paramAppBrandPageView.clean();
        GMTrace.o(17671106068480L, 131660);
      }
    });
    GMTrace.o(17341064675328L, 129201);
    return true;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17340930457600L, 129200);
    int i = paramJSONObject.optInt("videoPlayerId", 0);
    GMTrace.o(17340930457600L, 129200);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */