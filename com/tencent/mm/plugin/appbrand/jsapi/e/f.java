package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.graphics.Rect;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b;
import com.tencent.mm.plugin.appbrand.widget.input.e;
import com.tencent.mm.plugin.appbrand.widget.input.h.a;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends a<com.tencent.mm.plugin.appbrand.widget.input.b.h>
{
  private static final int CTRL_INDEX = 112;
  private static final String NAME = "updateInput";
  
  public f()
  {
    GMTrace.i(10368319488000L, 77250);
    GMTrace.o(10368319488000L, 77250);
  }
  
  protected final boolean WA()
  {
    GMTrace.i(10368587923456L, 77252);
    GMTrace.o(10368587923456L, 77252);
    return true;
  }
  
  public void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10368453705728L, 77251);
    final com.tencent.mm.plugin.appbrand.widget.input.b.h localh = new com.tencent.mm.plugin.appbrand.widget.input.b.h();
    if (!a(localh, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(10368453705728L, 77251);
      return;
    }
    final String str = paramJSONObject.optString("inputId", "");
    if (bg.mZ(str))
    {
      paramAppBrandPageView.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10368453705728L, 77251);
      return;
    }
    if ((localh.jFY != null) && (localh.jFY.intValue() < 0)) {
      localh.jFY = Integer.valueOf(0);
    }
    if ((localh.jFZ != null) && (localh.jFZ.intValue() < 0)) {
      localh.jFZ = Integer.valueOf(0);
    }
    paramJSONObject = paramJSONObject.optString("data", null);
    if (paramJSONObject != null) {
      aY(str, paramJSONObject);
    }
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10364695609344L, 77223);
        Object localObject1 = h.a.jBI;
        Object localObject3 = str;
        Object localObject2 = localh;
        if (bg.mZ((String)localObject3))
        {
          localObject1 = null;
          if (localObject1 == null) {
            break label195;
          }
          if (((com.tencent.mm.plugin.appbrand.widget.input.b.h)localObject2).jFX != null) {
            ((b)localObject1).su(((com.tencent.mm.plugin.appbrand.widget.input.b.h)localObject2).jFX);
          }
          ((b)localObject1).a((com.tencent.mm.plugin.appbrand.widget.input.b.h)localObject2);
          localObject2 = ((b)localObject1).abB();
          if (localObject2 != null)
          {
            localObject3 = (AppBrandPageView)((b)localObject1).jAL.get();
            if ((localObject3 != null) && (((AppBrandPageView)localObject3).jlc != null)) {
              break label147;
            }
          }
        }
        label93:
        label147:
        label195:
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label200;
          }
          paramAppBrandPageView.v(paramInt, f.this.d("ok", null));
          GMTrace.o(10364695609344L, 77223);
          return;
          localObject1 = (b)((com.tencent.mm.plugin.appbrand.widget.input.h)localObject1).jBD.get(localObject3);
          break;
          e locale = ((AppBrandPageView)localObject3).jlb;
          if (locale == null) {
            break label93;
          }
          localObject1 = ((b)localObject1).abC();
          locale.b(((AppBrandPageView)localObject3).jlc, (View)localObject2, ((Rect)localObject1).width(), ((Rect)localObject1).height(), ((Rect)localObject1).left, ((Rect)localObject1).top);
          break label93;
        }
        label200:
        if (m.a(localh, str))
        {
          paramAppBrandPageView.v(paramInt, f.this.d("ok", null));
          GMTrace.o(10364695609344L, 77223);
          return;
        }
        paramAppBrandPageView.v(paramInt, f.this.d("fail", null));
        GMTrace.o(10364695609344L, 77223);
      }
    });
    GMTrace.o(10368453705728L, 77251);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */