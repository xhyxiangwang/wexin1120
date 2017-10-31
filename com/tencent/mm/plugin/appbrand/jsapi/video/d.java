package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends c
{
  private static final int CTRL_INDEX = 87;
  public static final String NAME = "updateVideoPlayer";
  
  public d()
  {
    GMTrace.i(17346030731264L, 129238);
    GMTrace.o(17346030731264L, 129238);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17346299166720L, 129240);
    w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView : videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof AppBrandVideoView))
    {
      w.e("MicroMsg.JsApiUpdateVideoPlayer", "view not AppBrandVideoView");
      GMTrace.o(17346299166720L, 129240);
      return false;
    }
    paramView = (AppBrandVideoView)paramView;
    try
    {
      if (paramJSONObject.has("showDanmuBtn")) {
        paramView.cj(paramJSONObject.getBoolean("showDanmuBtn"));
      }
    }
    catch (JSONException paramAppBrandPageView)
    {
      try
      {
        if (paramJSONObject.has("danmuList")) {
          paramView.j(paramJSONObject.getJSONArray("danmuList"));
        }
      }
      catch (JSONException paramAppBrandPageView)
      {
        try
        {
          if (paramJSONObject.has("objectFit")) {
            paramView.qw(paramJSONObject.getString("objectFit"));
          }
        }
        catch (JSONException paramAppBrandPageView)
        {
          try
          {
            if (paramJSONObject.has("autoplay"))
            {
              boolean bool = paramJSONObject.getBoolean("autoplay");
              w.i("MicroMsg.AppBrandVideoView", "setAutoPlay =%b", new Object[] { Boolean.valueOf(bool) });
              paramView.jcn = bool;
            }
          }
          catch (JSONException paramAppBrandPageView)
          {
            try
            {
              if (paramJSONObject.has("showBasicControls")) {
                paramView.ci(paramJSONObject.getBoolean("showBasicControls"));
              }
            }
            catch (JSONException paramAppBrandPageView)
            {
              try
              {
                if (paramJSONObject.has("poster")) {
                  paramView.qv(paramJSONObject.getString("poster"));
                }
              }
              catch (JSONException paramAppBrandPageView)
              {
                try
                {
                  if (paramJSONObject.has("direction")) {
                    paramView.qx(paramJSONObject.getString("direction"));
                  }
                }
                catch (JSONException paramAppBrandPageView)
                {
                  try
                  {
                    if (paramJSONObject.has("muted")) {
                      paramView.ck(paramJSONObject.getBoolean("muted"));
                    }
                  }
                  catch (JSONException paramAppBrandPageView)
                  {
                    try
                    {
                      if (paramJSONObject.has("loop")) {
                        paramView.ch(paramJSONObject.getBoolean("loop"));
                      }
                    }
                    catch (JSONException paramAppBrandPageView)
                    {
                      try
                      {
                        if (paramJSONObject.has("data")) {
                          paramView.jcl = paramJSONObject.getString("data");
                        }
                      }
                      catch (JSONException paramAppBrandPageView)
                      {
                        try
                        {
                          if (paramJSONObject.has("disableScroll")) {
                            paramView.cl(paramJSONObject.getBoolean("disableScroll"));
                          }
                        }
                        catch (JSONException paramAppBrandPageView)
                        {
                          try
                          {
                            if (paramJSONObject.has("pageGesture")) {
                              paramView.cm(paramJSONObject.getBoolean("pageGesture"));
                            }
                          }
                          catch (JSONException paramAppBrandPageView)
                          {
                            try
                            {
                              if (paramJSONObject.has("duration"))
                              {
                                paramInt = paramJSONObject.getInt("duration");
                                if (paramInt > 0) {
                                  break label840;
                                }
                                w.i("MicroMsg.AppBrandVideoView", "setDuration error duration=%d", new Object[] { Integer.valueOf(paramInt) });
                              }
                            }
                            catch (JSONException paramAppBrandPageView)
                            {
                              try
                              {
                                if ((paramJSONObject.has("hide")) && (paramJSONObject.getBoolean("hide")))
                                {
                                  w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView hide stop");
                                  paramView.stop();
                                }
                              }
                              catch (JSONException paramAppBrandPageView)
                              {
                                try
                                {
                                  if (paramJSONObject.has("initialTime")) {
                                    paramView.iE(paramJSONObject.getInt("initialTime"));
                                  }
                                }
                                catch (JSONException paramAppBrandPageView)
                                {
                                  try
                                  {
                                    if (paramJSONObject.has("needEvent"))
                                    {
                                      if (paramJSONObject.getBoolean("needEvent")) {
                                        break label955;
                                      }
                                      paramView.jcp = null;
                                    }
                                  }
                                  catch (JSONException paramAppBrandPageView)
                                  {
                                    try
                                    {
                                      for (;;)
                                      {
                                        if (paramJSONObject.has("filePath")) {
                                          paramView.e(paramJSONObject.getString("filePath"), paramJSONObject.optBoolean("live"), paramJSONObject.optInt("duration"));
                                        }
                                        GMTrace.o(17346299166720L, 129240);
                                        return true;
                                        localJSONException1 = localJSONException1;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showDanmuBtn", localJSONException1.getLocalizedMessage() });
                                        continue;
                                        localJSONException2 = localJSONException2;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "danmuList", localJSONException2.getLocalizedMessage() });
                                        continue;
                                        localJSONException3 = localJSONException3;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "objectFit", localJSONException3.getLocalizedMessage() });
                                        continue;
                                        localJSONException4 = localJSONException4;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoplay", localJSONException4.getLocalizedMessage() });
                                        continue;
                                        localJSONException5 = localJSONException5;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showBasicControls", localJSONException5.getLocalizedMessage() });
                                        continue;
                                        localJSONException6 = localJSONException6;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "poster", localJSONException6.getLocalizedMessage() });
                                        continue;
                                        localJSONException7 = localJSONException7;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "direction", localJSONException7.getLocalizedMessage() });
                                        continue;
                                        localJSONException8 = localJSONException8;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException8.getLocalizedMessage() });
                                        continue;
                                        localJSONException9 = localJSONException9;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "loop", localJSONException9.getLocalizedMessage() });
                                        continue;
                                        localJSONException10 = localJSONException10;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "data", localJSONException10.getLocalizedMessage() });
                                        continue;
                                        localJSONException11 = localJSONException11;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "disableScroll", localJSONException11.getLocalizedMessage() });
                                        continue;
                                        localJSONException12 = localJSONException12;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "pageGesture", localJSONException12.getLocalizedMessage() });
                                        continue;
                                        label840:
                                        paramView.jcf.setText(AppBrandVideoView.iF(paramInt));
                                        paramView.jcf.setTag(new Object());
                                        continue;
                                        localJSONException13 = localJSONException13;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "disableScroll", localJSONException13.getLocalizedMessage() });
                                        continue;
                                        localJSONException14 = localJSONException14;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "hide", localJSONException14.getLocalizedMessage() });
                                        continue;
                                        localJSONException15 = localJSONException15;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "initialTime", localJSONException15.getLocalizedMessage() });
                                      }
                                      label955:
                                      if (paramView.jcp != null) {}
                                      for (paramInt = 1; paramInt == 0; paramInt = 0)
                                      {
                                        paramView.jcp = new e(paramView, paramAppBrandPageView);
                                        break;
                                        paramAppBrandPageView = paramAppBrandPageView;
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "needEvent", paramAppBrandPageView.getLocalizedMessage() });
                                        break;
                                      }
                                    }
                                    catch (JSONException paramAppBrandPageView)
                                    {
                                      for (;;)
                                      {
                                        w.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "filePath", paramAppBrandPageView.getLocalizedMessage() });
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17346164948992L, 129239);
    int i = paramJSONObject.optInt("videoPlayerId");
    GMTrace.o(17346164948992L, 129239);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */