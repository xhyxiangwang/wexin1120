package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.protocal.c.pb;
import com.tencent.mm.protocal.c.pc;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 206;
  public static final String NAME = "deleteUserAutoFillData";
  
  public a()
  {
    GMTrace.i(19761278746624L, 147233);
    GMTrace.o(19761278746624L, 147233);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19761412964352L, 147234);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData data is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:data is invalid", null));
      GMTrace.o(19761412964352L, 147234);
      return;
    }
    String str = paramJSONObject.optString("groupKey");
    int i = paramJSONObject.optInt("groupId", 0);
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData groupKey is invalid");
      paramAppBrandPageView.v(paramInt, d("fail:groupKey is invalid", null));
      GMTrace.o(19761412964352L, 147234);
      return;
    }
    paramJSONObject = paramAppBrandPageView.iqL;
    w.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData appId:%s, groupId:%d, groupKey:%s", new Object[] { paramJSONObject, Integer.valueOf(i), str });
    Object localObject = new com.tencent.mm.ac.b.a();
    ((com.tencent.mm.ac.b.a)localObject).hlX = new pb();
    ((com.tencent.mm.ac.b.a)localObject).hlY = new pc();
    ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
    ((com.tencent.mm.ac.b.a)localObject).hlW = 1194;
    ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
    ((com.tencent.mm.ac.b.a)localObject).hma = 0;
    localObject = ((com.tencent.mm.ac.b.a)localObject).DA();
    pb localpb = (pb)((com.tencent.mm.ac.b)localObject).hlU.hmc;
    localpb.tKT = str;
    localpb.fKY = paramJSONObject;
    localpb.tKU = i;
    localpb.cyK = 1;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ac.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(19765171060736L, 147262);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.hlV.hmc == null))
        {
          w.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.hlV.hmc });
          paramAppBrandPageView.v(paramInt, a.this.d("fail:cgi fail", null));
          GMTrace.o(19765171060736L, 147262);
          return;
        }
        w.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData success");
        paramAppBrandPageView.v(paramInt, a.this.d("ok", null));
        GMTrace.o(19765171060736L, 147262);
      }
    });
    GMTrace.o(19761412964352L, 147234);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */