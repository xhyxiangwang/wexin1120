package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.os.Looper;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.d;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.t.6;
import com.tencent.mm.plugin.appbrand.page.t.7;
import com.tencent.mm.sdk.platformtools.bb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 6;
  public static final String NAME = "insertVideoPlayer";
  
  public a()
  {
    GMTrace.i(17356499714048L, 129316);
    GMTrace.o(17356499714048L, 129316);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(17356633931776L, 129317);
    boolean bool1 = paramJSONObject.optBoolean("showDanmuBtn", false);
    boolean bool2 = paramJSONObject.optBoolean("enableDanmu", false);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("danmuList");
    String str1 = paramJSONObject.optString("objectFit");
    String str2 = paramJSONObject.optString("poster");
    boolean bool3 = paramJSONObject.optBoolean("showBasicControls", true);
    String str3 = paramJSONObject.optString("data");
    String str4 = paramJSONObject.optString("direction");
    boolean bool4 = paramJSONObject.optBoolean("disableScroll", false);
    boolean bool5 = paramJSONObject.optBoolean("loop", false);
    boolean bool6 = paramJSONObject.optBoolean("pageGesture", false);
    int i = paramJSONObject.optInt("initialTime", 0);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiInsertVideoPlayer", "inflateView enableDanmu=%b showDanmuBtn=%b disableScroll=%b direction=%s objectFit=%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool4), str4, str1 });
    AppBrandVideoView localAppBrandVideoView = new AppBrandVideoView(paramAppBrandPageView.mContext);
    paramAppBrandPageView = paramAppBrandPageView.iqL;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandVideoView", "setAppId appid=%s", new Object[] { paramAppBrandPageView });
    localAppBrandVideoView.iqL = paramAppBrandPageView;
    localAppBrandVideoView.jcl = str3;
    localAppBrandVideoView.ci(bool3);
    localAppBrandVideoView.qv(str2);
    localAppBrandVideoView.qx(str4);
    localAppBrandVideoView.cl(bool4);
    localAppBrandVideoView.qw(str1);
    localAppBrandVideoView.ch(bool5);
    localAppBrandVideoView.cm(bool6);
    try
    {
      localAppBrandVideoView.jcm = i(paramJSONObject);
      localAppBrandVideoView.cj(bool1);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandVideoView", "setDanmakuEnable isEnable=%b", new Object[] { Boolean.valueOf(bool2) });
      paramAppBrandPageView = localAppBrandVideoView.jcc;
      paramAppBrandPageView.jcQ = bool2;
      paramAppBrandPageView.Xk();
      localAppBrandVideoView.j(localJSONArray);
      localAppBrandVideoView.iE(i);
      GMTrace.o(17356633931776L, 129317);
      return localAppBrandVideoView;
    }
    catch (JSONException paramAppBrandPageView)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.JsApiInsertVideoPlayer", "inflateView setVideoPlayerId exp=%s", new Object[] { paramAppBrandPageView });
      }
    }
  }
  
  protected final void b(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17356902367232L, 129319);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    paramView = (AppBrandVideoView)paramView;
    final com.tencent.mm.plugin.appbrand.page.w local1 = new com.tencent.mm.plugin.appbrand.page.w()
    {
      public final void Xw()
      {
        GMTrace.i(17344956989440L, 129230);
        AppBrandVideoView localAppBrandVideoView = paramView;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandVideoView", "onExitFullScreen");
        if (localAppBrandVideoView.jcc.jcP) {
          localAppBrandVideoView.jcc.Xi();
        }
        localAppBrandVideoView.co(false);
        GMTrace.o(17344956989440L, 129230);
      }
    };
    final AppBrandPageView.d local2 = new AppBrandPageView.d()
    {
      public final void Wq()
      {
        GMTrace.i(17342675288064L, 129213);
        AppBrandVideoView localAppBrandVideoView = paramView;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandVideoView", "onUIResume");
        localAppBrandVideoView.jbZ.MK();
        GMTrace.o(17342675288064L, 129213);
      }
    };
    final AppBrandPageView.b local3 = new AppBrandPageView.b()
    {
      public final void VS()
      {
        GMTrace.i(17376498155520L, 129465);
        AppBrandVideoView localAppBrandVideoView = paramView;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandVideoView", "onUIPause");
        localAppBrandVideoView.jbZ.MJ();
        GMTrace.o(17376498155520L, 129465);
      }
    };
    final AppBrandPageView.c local4 = new AppBrandPageView.c()
    {
      public final void onDestroy()
      {
        GMTrace.i(17346567602176L, 129242);
        AppBrandVideoView localAppBrandVideoView = paramView;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandVideoView", "onUIDestroy");
        localAppBrandVideoView.clean();
        GMTrace.o(17346567602176L, 129242);
      }
    };
    paramView.jct = new AppBrandVideoView.a()
    {
      public final void Xi()
      {
        GMTrace.i(17345359642624L, 129233);
        t localt = paramAppBrandPageView.jla;
        t.7 local7 = new t.7(localt, Boolean.valueOf(false), paramInt);
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
        {
          ((Boolean)local7.b(null)).booleanValue();
          GMTrace.o(17345359642624L, 129233);
          return;
        }
        ((Boolean)local7.b(localt.mHandler)).booleanValue();
        GMTrace.o(17345359642624L, 129233);
      }
      
      public final void cq(boolean paramAnonymousBoolean)
      {
        GMTrace.i(17345225424896L, 129232);
        t localt = paramAppBrandPageView.jla;
        t.6 local6 = new t.6(localt, Boolean.valueOf(false), paramInt, local1, paramAnonymousBoolean);
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
        {
          ((Boolean)local6.b(null)).booleanValue();
          GMTrace.o(17345225424896L, 129232);
          return;
        }
        ((Boolean)local6.b(localt.mHandler)).booleanValue();
        GMTrace.o(17345225424896L, 129232);
      }
      
      public final boolean isFullScreen()
      {
        GMTrace.i(17345493860352L, 129234);
        boolean bool = paramAppBrandPageView.jla.jn(paramInt);
        GMTrace.o(17345493860352L, 129234);
        return bool;
      }
    };
    paramAppBrandPageView.a(local2);
    paramAppBrandPageView.a(local3);
    paramAppBrandPageView.a(local4);
    d.a(paramAppBrandPageView.iqL, new d.b()
    {
      public final void a(d.c paramAnonymousc)
      {
        GMTrace.i(17370458357760L, 129420);
        GMTrace.o(17370458357760L, 129420);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(17370592575488L, 129421);
        paramAppBrandPageView.b(local2);
        paramAppBrandPageView.b(local3);
        paramAppBrandPageView.b(local4);
        GMTrace.o(17370592575488L, 129421);
      }
      
      public final void onResume()
      {
        GMTrace.i(17370324140032L, 129419);
        GMTrace.o(17370324140032L, 129419);
      }
    });
    paramView.ck(paramJSONObject.optBoolean("muted", false));
    boolean bool = paramJSONObject.optBoolean("needEvent", false);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView autoPlay=%b needEvent=%b", new Object[] { Boolean.valueOf(paramJSONObject.optBoolean("autoplay", false)), Boolean.valueOf(bool) });
    if (bool) {
      paramView.jcp = new e(paramView, paramAppBrandPageView);
    }
    paramInt = paramJSONObject.optInt("duration", -1);
    paramAppBrandPageView = paramJSONObject.optString("filePath");
    bool = paramJSONObject.optBoolean("live", false);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView filePath=%s live=%b", new Object[] { paramAppBrandPageView, Boolean.valueOf(bool) });
    paramView.e(paramAppBrandPageView, bool, paramInt);
    GMTrace.o(17356902367232L, 129319);
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17356768149504L, 129318);
    int i = paramJSONObject.getInt("videoPlayerId");
    GMTrace.o(17356768149504L, 129318);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */