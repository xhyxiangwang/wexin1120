package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Looper;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.k.b.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.t.2;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a
  extends d
{
  public a()
  {
    GMTrace.i(10459587543040L, 77930);
    GMTrace.o(10459587543040L, 77930);
  }
  
  private void a(final c paramc, final int paramInt, final AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject)
  {
    GMTrace.i(15499329011712L, 115479);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10465493123072L, 77974);
        if (paramAppBrandPageView == null)
        {
          w.w("MicroMsg.BaseInsertViewJsApi", "page view has been release.");
          paramc.v(paramInt, a.this.d("fail:page is null", null));
          GMTrace.o(10465493123072L, 77974);
          return;
        }
        View localView = a.this.a(paramAppBrandPageView, paramJSONObject);
        if (localView == null)
        {
          w.w("MicroMsg.BaseInsertViewJsApi", "inflate view return null.");
          paramc.v(paramInt, a.this.d("inflate view failed", null));
          GMTrace.o(10465493123072L, 77974);
          return;
        }
        int i;
        try
        {
          i = a.this.i(paramJSONObject);
          if (paramAppBrandPageView.jla.jk(i))
          {
            w.w("MicroMsg.BaseInsertViewJsApi", "insert view(%d) failed, it has been inserted before.", new Object[] { Integer.valueOf(i) });
            paramc.v(paramInt, a.this.d("fail:the view has already exist", null));
            GMTrace.o(10465493123072L, 77974);
            return;
          }
        }
        catch (JSONException localJSONException1)
        {
          paramc.v(paramInt, a.this.d("fail:invalid view id", null));
          GMTrace.o(10465493123072L, 77974);
          return;
        }
        int j = paramJSONObject.optInt("parentId", 0);
        try
        {
          localObject2 = a.j(paramJSONObject);
          int k = a.k(paramJSONObject);
          Object localObject1 = paramAppBrandPageView.jla;
          localObject2 = new t.2((t)localObject1, Boolean.valueOf(false), localJSONException1, i, j, (float[])localObject2, k);
          if (Thread.currentThread() == Looper.getMainLooper().getThread()) {}
          for (bool = ((Boolean)((bb)localObject2).b(null)).booleanValue();; bool = ((Boolean)((bb)localObject2).b(((t)localObject1).mHandler)).booleanValue())
          {
            if (bool)
            {
              localObject1 = a.this;
              localObject2 = paramAppBrandPageView;
              localObject3 = paramJSONObject;
              if (((a)localObject1).VK())
              {
                localb = ((AppBrandPageView)localObject2).jla.t(i, true);
                localb.o("disableScroll", ((JSONObject)localObject3).optBoolean("disableScroll", false));
                localb.o("enableLongClick", ((a)localObject1).VL());
                localb.H("data", ((JSONObject)localObject3).optString("data"));
                if (((JSONObject)localObject3).optBoolean("gesture", false))
                {
                  if ((localObject2 != null) && (localJSONException1 != null) && (localb != null)) {
                    break;
                  }
                  w.i("MicroMsg.ViewMotionHelper", "setOnTouchListener failed, page or view or keyValueSet is null.");
                }
              }
              a.this.b(paramAppBrandPageView, i, localJSONException1, paramJSONObject);
            }
            Object localObject3 = a.this;
            localObject1 = paramAppBrandPageView;
            localObject2 = ((AppBrandPageView)localObject1).jla.t(i, true);
            if ((AppBrandPageView.c)((q.b)localObject2).get("baseViewDestroyListener", null) == null)
            {
              localObject3 = new a.2((a)localObject3, (AppBrandPageView)localObject1, i, (q.b)localObject2);
              ((q.b)localObject2).k("baseViewDestroyListener", localObject3);
              ((AppBrandPageView)localObject1).a((AppBrandPageView.c)localObject3);
            }
            w.i("MicroMsg.BaseInsertViewJsApi", "insert view(parentId : %s, viewId : %s, view : %s, r : %s)", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localJSONException1.hashCode()), Boolean.valueOf(bool) });
            localObject1 = paramc;
            i = paramInt;
            localObject2 = a.this;
            if (!bool) {
              break label668;
            }
            str = "ok";
            ((c)localObject1).v(i, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject2).d(str, null));
            GMTrace.o(10465493123072L, 77974);
            return;
          }
        }
        catch (JSONException localJSONException2)
        {
          for (;;)
          {
            Object localObject2;
            q.b localb;
            w.e("MicroMsg.BaseInsertViewJsApi", "parse position error. Exception :%s", new Object[] { localJSONException2 });
            boolean bool = false;
            continue;
            str.setOnTouchListener(new b.a((AppBrandPageView)localObject2, localb));
            continue;
            label668:
            String str = "fail:insert view fail";
          }
        }
      }
    });
    GMTrace.o(15499329011712L, 115479);
  }
  
  public boolean VK()
  {
    GMTrace.i(10460258631680L, 77935);
    GMTrace.o(10460258631680L, 77935);
    return false;
  }
  
  public boolean VL()
  {
    GMTrace.i(10460392849408L, 77936);
    GMTrace.o(10460392849408L, 77936);
    return false;
  }
  
  public abstract View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject);
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10459721760768L, 77931);
    super.a(paramk, paramJSONObject, paramInt);
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.BaseInsertViewJsApi", "invoke JsApi insertView failed, current page view is null.");
      paramk.v(paramInt, d("fail:page is null", null));
      GMTrace.o(10459721760768L, 77931);
      return;
    }
    a(paramk, paramInt, localAppBrandPageView, paramJSONObject);
    GMTrace.o(10459721760768L, 77931);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10459855978496L, 77932);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    a(paramAppBrandPageView, paramInt, paramAppBrandPageView, paramJSONObject);
    GMTrace.o(10459855978496L, 77932);
  }
  
  public void b(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10460124413952L, 77934);
    GMTrace.o(10460124413952L, 77934);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */