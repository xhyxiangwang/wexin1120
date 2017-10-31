package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.canvas.f;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class p
  extends a
{
  public static final int CTRL_INDEX = 100;
  public static final String NAME = "canvasToTempFilePath";
  
  public p()
  {
    GMTrace.i(10408047935488L, 77546);
    GMTrace.o(10408047935488L, 77546);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10408182153216L, 77547);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10294231302144L, 76698);
        com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10431938691072L, 77724);
            p.this.b(p.1.this.iPN, p.1.this.iPR, p.1.this.gQa);
            GMTrace.o(10431938691072L, 77724);
          }
        });
        GMTrace.o(10294231302144L, 76698);
      }
    }, 100L);
    GMTrace.o(10408182153216L, 77547);
  }
  
  public final void b(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16055661494272L, 119624);
    super.a(paramk, paramJSONObject, paramInt);
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(16055661494272L, 119624);
      return;
    }
    int i;
    View localView;
    try
    {
      i = paramJSONObject.getInt("canvasId");
      localView = localAppBrandPageView.jla.jl(i);
      if (localView == null)
      {
        w.w("MicroMsg.JsApiCanvasToTempFilePath", "get view by viewId(%s) return null.", new Object[] { Integer.valueOf(i) });
        paramk.v(paramInt, d("fail:get canvas by canvasId failed", null));
        GMTrace.o(16055661494272L, 119624);
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      w.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", new Object[] { paramJSONObject });
      paramk.v(paramInt, d("fail:canvasId do not exist", null));
      GMTrace.o(16055661494272L, 119624);
      return;
    }
    int j = localView.getMeasuredWidth();
    int k = localView.getMeasuredHeight();
    label809:
    label812:
    for (;;)
    {
      float f3;
      float f4;
      float f1;
      float f2;
      float f5;
      float f6;
      try
      {
        localObject = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
        f3 = com.tencent.mm.plugin.appbrand.n.c.c(paramJSONObject, "x");
        f4 = com.tencent.mm.plugin.appbrand.n.c.c(paramJSONObject, "y");
        f1 = com.tencent.mm.plugin.appbrand.n.c.a(paramJSONObject, "width", j);
        f2 = com.tencent.mm.plugin.appbrand.n.c.a(paramJSONObject, "height", k);
        if (f3 + f1 <= j) {
          break label812;
        }
        f1 = j - f3;
        if (f4 + f2 <= k) {
          break label809;
        }
        f2 = k - f4;
        f5 = (float)paramJSONObject.optDouble("destWidth", f1);
        f6 = (float)paramJSONObject.optDouble("destHeight", f2);
        if ((f3 < 0.0F) || (f4 < 0.0F) || (f1 <= 0.0F) || (f2 <= 0.0F) || (f3 + f1 > j) || (f4 + f2 > k) || (f5 <= 0.0F) || (f6 <= 0.0F))
        {
          w.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, viewId(%s).", new Object[] { Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i) });
          paramk.v(paramInt, d("fail:illegal arguments", null));
          GMTrace.o(16055661494272L, 119624);
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        w.w("MicroMsg.JsApiCanvasToTempFilePath", "create bitmap failed, viewId(%s). Exception : %s", new Object[] { Integer.valueOf(i), paramJSONObject });
        paramk.v(paramInt, d("fail:create bitmap failed", null));
        GMTrace.o(16055661494272L, 119624);
        return;
      }
      if ((localView instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a)) {
        ((com.tencent.mm.plugin.appbrand.canvas.widget.a)localView).d(new f((Bitmap)localObject));
      }
      for (;;)
      {
        if (f1 == j)
        {
          paramJSONObject = (JSONObject)localObject;
          if (f2 == k) {}
        }
        else
        {
          paramJSONObject = Bitmap.createBitmap((Bitmap)localObject, (int)f3, (int)f4, (int)f1, (int)f2, null, false);
          ((Bitmap)localObject).recycle();
        }
        if (f1 == f5)
        {
          localObject = paramJSONObject;
          if (f2 == f6) {}
        }
        else
        {
          localObject = Bitmap.createScaledBitmap(paramJSONObject, (int)f5, (int)f6, false);
          paramJSONObject.recycle();
        }
        paramJSONObject = com.tencent.mm.plugin.appbrand.appstorage.c.aD(localAppBrandPageView.iqL, "canvas_" + i);
        try
        {
          com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, 100, Bitmap.CompressFormat.PNG, paramJSONObject, true);
          paramJSONObject = com.tencent.mm.plugin.appbrand.appstorage.c.b(localAppBrandPageView.iqL, paramJSONObject, "png", true);
          if (paramJSONObject != null) {
            break;
          }
          w.w("MicroMsg.JsApiCanvasToTempFilePath", "gen temp file failed, canvasId : %s.", new Object[] { Integer.valueOf(i) });
          paramk.v(paramInt, d("fail:gen temp file failed", null));
          GMTrace.o(16055661494272L, 119624);
          return;
        }
        catch (IOException paramJSONObject)
        {
          w.w("MicroMsg.JsApiCanvasToTempFilePath", "save bitmap to file failed, viewId(%s). exception : %s", new Object[] { Integer.valueOf(i), paramJSONObject });
          paramk.v(paramInt, d("fail:write file failed", null));
          GMTrace.o(16055661494272L, 119624);
          return;
        }
        localView.draw(new f((Bitmap)localObject));
      }
      Object localObject = new HashMap();
      ((Map)localObject).put("tempFilePath", paramJSONObject.fAx);
      paramk.v(paramInt, d("ok", (Map)localObject));
      w.v("MicroMsg.JsApiCanvasToTempFilePath", "save file(id : %s) to path : %s", new Object[] { paramJSONObject.fAx, paramJSONObject.hhT });
      GMTrace.o(16055661494272L, 119624);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */