package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  implements AppBrandPageView.c
{
  public AppBrandVideoView jdl;
  private AppBrandPageView jdm;
  aj jdn;
  public int jdo;
  
  public e(AppBrandVideoView paramAppBrandVideoView, AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17343346376704L, 129218);
    this.jdl = paramAppBrandVideoView;
    this.jdm = paramAppBrandPageView;
    this.jdm.a(this);
    GMTrace.o(17343346376704L, 129218);
  }
  
  public final JSONObject Xx()
  {
    GMTrace.i(17344017465344L, 129223);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.jdl.jcl);
    GMTrace.o(17344017465344L, 129223);
    return localJSONObject;
  }
  
  final void Xy()
  {
    GMTrace.i(17344151683072L, 129224);
    if (this.jdn != null) {
      this.jdn.MM();
    }
    GMTrace.o(17344151683072L, 129224);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.e parame, JSONObject paramJSONObject)
  {
    GMTrace.i(17343883247616L, 129222);
    if (!(parame instanceof f)) {
      w.i("MicroMsg.JsApiVideoCallback", "dispatchEvent event %s", new Object[] { parame.getName() });
    }
    parame = parame.aj(this.jdm.iqL, this.jdm.hashCode());
    parame.mData = paramJSONObject.toString();
    parame.VI();
    GMTrace.o(17343883247616L, 129222);
  }
  
  public final void clean()
  {
    GMTrace.i(17343614812160L, 129220);
    this.jdm.b(this);
    Xy();
    GMTrace.o(17343614812160L, 129220);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17343480594432L, 129219);
    w.d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
    clean();
    this.jdl.jcp = null;
    GMTrace.o(17343480594432L, 129219);
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 131;
    private static final String NAME = "onVideoClickDanmuBtn";
    
    public a()
    {
      GMTrace.i(17343212158976L, 129217);
      GMTrace.o(17343212158976L, 129217);
    }
  }
  
  private static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 138;
    private static final String NAME = "onVideoEnded";
    
    public b()
    {
      GMTrace.i(17376632373248L, 129466);
      GMTrace.o(17376632373248L, 129466);
    }
  }
  
  private static final class c
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 130;
    private static final String NAME = "onVideoFullScreenChange";
    
    public c()
    {
      GMTrace.i(17362807947264L, 129363);
      GMTrace.o(17362807947264L, 129363);
    }
  }
  
  private static final class d
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 128;
    private static final String NAME = "onVideoPause";
    
    public d()
    {
      GMTrace.i(17363479035904L, 129368);
      GMTrace.o(17363479035904L, 129368);
    }
  }
  
  private static final class e
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 127;
    private static final String NAME = "onVideoPlay";
    
    public e()
    {
      GMTrace.i(17343077941248L, 129216);
      GMTrace.o(17343077941248L, 129216);
    }
  }
  
  private static final class f
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 127;
    private static final String NAME = "onVideoTimeUpdate";
    
    public f()
    {
      GMTrace.i(17372874276864L, 129438);
      GMTrace.o(17372874276864L, 129438);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */