package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class bs
  extends a
{
  public static final int CTRL_INDEX = 229;
  public static final String NAME = "setScreenBrightness";
  public float iRj;
  public float iRk;
  
  public bs()
  {
    GMTrace.i(15482686013440L, 115355);
    this.iRj = NaN.0F;
    GMTrace.o(15482686013440L, 115355);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(15482820231168L, 115356);
    w.d("MicroMsg.JsApiSetScreenBrightness", "JsApiSetScreenBrightness!");
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiSetScreenBrightness", "data is null");
      GMTrace.o(15482820231168L, 115356);
      return;
    }
    af.u(new Runnable()
    {
      public final void run()
      {
        float f = 0.01F;
        GMTrace.i(15503758196736L, 115512);
        bs.this.iRk = ((float)paramJSONObject.optDouble("value"));
        if ((Float.isNaN(bs.this.iRk)) || (bs.this.iRk < 0.0F) || (bs.this.iRk > 1.0F))
        {
          paramk.v(paramInt, bs.this.d("fail:value invalid", null));
          w.e("MicroMsg.JsApiSetScreenBrightness", "value invalid");
          GMTrace.o(15503758196736L, 115512);
          return;
        }
        final MMActivity localMMActivity = bs.this.a(paramk);
        if (localMMActivity == null)
        {
          paramk.v(paramInt, bs.this.d("fail", null));
          w.e("MicroMsg.JsApiSetScreenBrightness", "context is null, invoke fail!");
          GMTrace.o(15503758196736L, 115512);
          return;
        }
        final WindowManager.LayoutParams localLayoutParams = localMMActivity.getWindow().getAttributes();
        if (Float.isNaN(bs.this.iRj))
        {
          bs.this.iRj = localLayoutParams.screenBrightness;
          com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, new d.b()
          {
            public final void a(d.c paramAnonymous2c)
            {
              GMTrace.i(15485638803456L, 115377);
              localLayoutParams.screenBrightness = bs.this.iRj;
              localMMActivity.getWindow().setAttributes(localLayoutParams);
              GMTrace.o(15485638803456L, 115377);
            }
            
            public final void onResume()
            {
              GMTrace.i(15485773021184L, 115378);
              localLayoutParams.screenBrightness = bs.this.iRk;
              localMMActivity.getWindow().setAttributes(localLayoutParams);
              GMTrace.o(15485773021184L, 115378);
            }
          });
        }
        if (bs.this.iRk < 0.01F) {}
        for (;;)
        {
          localLayoutParams.screenBrightness = f;
          localMMActivity.getWindow().setAttributes(localLayoutParams);
          paramk.v(paramInt, bs.this.d("ok", null));
          GMTrace.o(15503758196736L, 115512);
          return;
          f = bs.this.iRk;
        }
      }
    });
    GMTrace.o(15482820231168L, 115356);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */