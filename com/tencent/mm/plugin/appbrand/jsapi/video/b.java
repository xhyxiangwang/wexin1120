package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends c
{
  private static final int CTRL_INDEX = 114;
  public static final String NAME = "operateVideoPlayer";
  
  public b()
  {
    GMTrace.i(17372471623680L, 129435);
    GMTrace.o(17372471623680L, 129435);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17372740059136L, 129437);
    w.i("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView : videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof AppBrandVideoView))
    {
      w.e("MicroMsg.JsApiOperateVideoPlayer", "view not AppBrandVideoView");
      GMTrace.o(17372740059136L, 129437);
      return false;
    }
    String str = paramJSONObject.optString("type");
    w.i("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView operateType=%s", new Object[] { str });
    paramAppBrandPageView = (AppBrandVideoView)paramView;
    switch (str.hashCode())
    {
    default: 
      label160:
      paramInt = -1;
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        w.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView operateType not supported: %s", new Object[] { str });
        GMTrace.o(17372740059136L, 129437);
        return false;
        if (!str.equals("play")) {
          break label160;
        }
        paramInt = 0;
        continue;
        if (!str.equals("pause")) {
          break label160;
        }
        paramInt = 1;
        continue;
        if (!str.equals("stop")) {
          break label160;
        }
        paramInt = 2;
        continue;
        if (!str.equals("requestFullScreen")) {
          break label160;
        }
        paramInt = 3;
        continue;
        if (!str.equals("exitFullScreen")) {
          break label160;
        }
        paramInt = 4;
        continue;
        if (!str.equals("playbackRate")) {
          break label160;
        }
        paramInt = 5;
        continue;
        if (!str.equals("seek")) {
          break label160;
        }
        paramInt = 6;
        continue;
        if (!str.equals("sendDanmu")) {
          break label160;
        }
        paramInt = 7;
      }
    }
    paramAppBrandPageView.start();
    for (;;)
    {
      GMTrace.o(17372740059136L, 129437);
      return true;
      paramAppBrandPageView.pause();
      continue;
      paramAppBrandPageView.stop();
      continue;
      paramAppBrandPageView.cn(true);
      continue;
      paramAppBrandPageView.cn(false);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        w.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        GMTrace.o(17372740059136L, 129437);
        return false;
      }
      double d = paramView.optDouble(0, -1.0D);
      if (d < 0.0D)
      {
        w.i("MicroMsg.JsApiOperateVideoPlayer", "rate invalid %f", new Object[] { Double.valueOf(d) });
        GMTrace.o(17372740059136L, 129437);
        return false;
      }
      float f = (float)d;
      w.i("MicroMsg.AppBrandVideoView", "setPlaybackRate %s", new Object[] { Float.valueOf(f) });
      paramAppBrandPageView.jbZ.T(f);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        w.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        GMTrace.o(17372740059136L, 129437);
        return false;
      }
      paramInt = paramView.optInt(0, -1);
      if (paramInt < 0)
      {
        w.i("MicroMsg.JsApiOperateVideoPlayer", "pos invalid %d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(17372740059136L, 129437);
        return false;
      }
      paramAppBrandPageView.r(paramInt, false);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        w.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        GMTrace.o(17372740059136L, 129437);
        return false;
      }
      if (paramView.length() == 1) {
        paramAppBrandPageView.aZ(paramView.optString(0, ""), "");
      } else {
        paramAppBrandPageView.aZ(paramView.optString(0, ""), paramView.optString(1, ""));
      }
    }
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17372605841408L, 129436);
    int i = paramJSONObject.optInt("videoPlayerId");
    GMTrace.o(17372605841408L, 129436);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */