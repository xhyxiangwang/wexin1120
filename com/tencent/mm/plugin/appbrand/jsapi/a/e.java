package com.tencent.mm.plugin.appbrand.jsapi.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.protocal.c.axy;
import com.tencent.mm.protocal.c.axz;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 205;
  public static final String NAME = "setUserAutoFillData";
  
  public e()
  {
    GMTrace.i(19756581126144L, 147198);
    GMTrace.o(19756581126144L, 147198);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19756715343872L, 147199);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData data is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:data is invalid", null));
      GMTrace.o(19756715343872L, 147199);
      return;
    }
    paramJSONObject = paramJSONObject.optString("dataList");
    String str = paramAppBrandPageView.iqL;
    w.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData appId:%s, dataList:%s", new Object[] { str, paramJSONObject });
    Object localObject = new com.tencent.mm.ac.b.a();
    ((com.tencent.mm.ac.b.a)localObject).hlX = new axy();
    ((com.tencent.mm.ac.b.a)localObject).hlY = new axz();
    ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
    ((com.tencent.mm.ac.b.a)localObject).hlW = 1180;
    ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
    ((com.tencent.mm.ac.b.a)localObject).hma = 0;
    localObject = ((com.tencent.mm.ac.b.a)localObject).DA();
    axy localaxy = (axy)((com.tencent.mm.ac.b)localObject).hlU.hmc;
    localaxy.fKY = str;
    localaxy.tZc = paramJSONObject;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ac.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(19767452762112L, 147279);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
        {
          w.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
          paramAppBrandPageView.v(paramInt, e.this.d("fail:cgi fail", null));
          GMTrace.o(19767452762112L, 147279);
          return;
        }
        w.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData success");
        paramAppBrandPageView.v(paramInt, e.this.d("ok", null));
        GMTrace.o(19767452762112L, 147279);
      }
    });
    GMTrace.o(19756715343872L, 147199);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */