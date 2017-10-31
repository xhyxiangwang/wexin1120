package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class av
  extends a
{
  public static final int CTRL_INDEX = 59;
  public static final String NAME = "openCard";
  public int iPM;
  
  public av()
  {
    GMTrace.i(10428314812416L, 77697);
    GMTrace.o(10428314812416L, 77697);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10428449030144L, 77698);
    Intent localIntent = new Intent();
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiOpenCard", "mmActivity is null, invoke fail!");
      GMTrace.o(10428449030144L, 77698);
      return;
    }
    paramJSONObject = paramJSONObject.optString("cardList");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiOpenCard", "cardList is null, invoke fail!");
      GMTrace.o(10428449030144L, 77698);
      return;
    }
    this.iPM = paramInt;
    localMMActivity.vow = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(10301210624000L, 76750);
        if (paramAnonymousInt1 == 1)
        {
          if (paramAnonymousInt2 == -1)
          {
            paramk.v(av.this.iPM, av.this.d("ok", null));
            w.i("MicroMsg.JsApiOpenCard", "view card result is cancel!");
            GMTrace.o(10301210624000L, 76750);
            return;
          }
          if (paramAnonymousInt2 == 0)
          {
            paramk.v(av.this.iPM, av.this.d("cancel", null));
            w.e("MicroMsg.JsApiOpenCard", "view card result is cancel!");
            GMTrace.o(10301210624000L, 76750);
            return;
          }
          paramk.v(av.this.iPM, av.this.d("fail", null));
          w.e("MicroMsg.JsApiOpenCard", "view card result is fail!");
        }
        GMTrace.o(10301210624000L, 76750);
      }
    };
    localIntent.putExtra("card_list", paramJSONObject);
    localIntent.putExtra("key_from_scene", 26);
    paramk = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    if ((paramk != null) && (paramk.iJa != null)) {
      localIntent.putExtra("key_from_appbrand_type", paramk.iJa.iCx);
    }
    com.tencent.mm.bi.d.b(localMMActivity, "card", ".ui.CardViewEntranceUI", localIntent, 1);
    GMTrace.o(10428449030144L, 77698);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */