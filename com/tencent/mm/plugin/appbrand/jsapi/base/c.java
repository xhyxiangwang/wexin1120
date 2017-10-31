package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Looper;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.t.5;
import com.tencent.mm.plugin.appbrand.page.t.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c
  extends d
{
  public c()
  {
    GMTrace.i(10465627340800L, 77975);
    GMTrace.o(10465627340800L, 77975);
  }
  
  private void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, final int paramInt, final AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject)
  {
    GMTrace.i(15499731664896L, 115482);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10459453325312L, 77929);
        if (paramAppBrandPageView == null)
        {
          w.w("MicroMsg.BaseUpdateViewJsApi", "page view has been release.");
          paramc.v(paramInt, c.this.d("fail:page is null", null));
          GMTrace.o(10459453325312L, 77929);
          return;
        }
        try
        {
          j = c.this.i(paramJSONObject);
          View localView = paramAppBrandPageView.jla.jl(j);
          if (localView == null)
          {
            w.w("MicroMsg.BaseUpdateViewJsApi", "get view by viewId(%s) return null.", new Object[] { Integer.valueOf(j) });
            paramc.v(paramInt, c.this.d("fail:got 'null' when get view by the given viewId", null));
            GMTrace.o(10459453325312L, 77929);
            return;
          }
        }
        catch (JSONException localJSONException1)
        {
          paramc.v(paramInt, c.this.d("fail:view id do not exist", null));
          GMTrace.o(10459453325312L, 77929);
          return;
        }
        localObject2 = c.this;
        AppBrandPageView localAppBrandPageView = paramAppBrandPageView;
        Object localObject1 = paramJSONObject;
        if (((c)localObject2).VK()) {}
        for (;;)
        {
          try
          {
            localObject2 = localAppBrandPageView.jla.t(j, false);
            if (localObject2 != null)
            {
              ((JSONObject)localObject1).getBoolean("disableScroll");
              if (!((q.b)localObject2).gj("isTouching")) {
                continue;
              }
              if (((q.b)localObject2).getBoolean("disableScroll", false) != true) {
                ((q.b)localObject2).o("disableScroll-nextState", true);
              }
            }
          }
          catch (JSONException localJSONException2)
          {
            continue;
            bool1 = ((Boolean)((bb)localObject2).b(localJSONException2.mHandler)).booleanValue();
            continue;
            int i = localJSONException2.jmy;
            continue;
          }
          try
          {
            localObject2 = c.j(paramJSONObject);
            i = c.k(paramJSONObject);
            localObject1 = paramAppBrandPageView.jla;
            localObject2 = new t.5((t)localObject1, Boolean.valueOf(false), j, (float[])localObject2, i);
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
              continue;
            }
            bool1 = ((Boolean)((bb)localObject2).b(null)).booleanValue();
            localObject1 = paramAppBrandPageView.jla.jj(j);
            if (localObject1 != null) {
              continue;
            }
            i = 0;
            w.i("MicroMsg.BaseUpdateViewJsApi", "update view(parentId : %s, viewId : %d), ret : %b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localJSONException1.hashCode()), Boolean.valueOf(bool1) });
          }
          catch (JSONException localJSONException3)
          {
            bool1 = true;
            continue;
            bool2 = c.this.a(paramAppBrandPageView, j, str, paramJSONObject);
            continue;
            str = "fail";
            continue;
          }
          bool2 = bool1;
          if (bool1)
          {
            if (!c.this.VJ()) {
              break label541;
            }
            bool2 = c.this.a(paramAppBrandPageView, j, localJSONException1, paramJSONObject, new c.a(paramc, paramInt));
          }
          if (!c.this.VJ())
          {
            localObject1 = paramc;
            i = paramInt;
            localObject2 = c.this;
            if (!bool2) {
              break label564;
            }
            str = "ok";
            ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject1).v(i, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject2).d(str, null));
          }
          GMTrace.o(10459453325312L, 77929);
          return;
          ((q.b)localObject2).o("disableScroll", true);
        }
      }
    });
    GMTrace.o(15499731664896L, 115482);
  }
  
  public boolean VJ()
  {
    GMTrace.i(15500000100352L, 115484);
    GMTrace.o(15500000100352L, 115484);
    return false;
  }
  
  public boolean VK()
  {
    GMTrace.i(10466298429440L, 77980);
    GMTrace.o(10466298429440L, 77980);
    return false;
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10465761558528L, 77976);
    super.a(paramk, paramJSONObject, paramInt);
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.BaseUpdateViewJsApi", "invoke JsApi updateView failed, current page view is null.");
      paramk.v(paramInt, d("fail:page is null", null));
      GMTrace.o(10465761558528L, 77976);
      return;
    }
    a(paramk, paramInt, localAppBrandPageView, paramJSONObject);
    GMTrace.o(10465761558528L, 77976);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10465895776256L, 77977);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    a(paramAppBrandPageView, paramInt, paramAppBrandPageView, paramJSONObject);
    GMTrace.o(10465895776256L, 77977);
  }
  
  public boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10466029993984L, 77978);
    GMTrace.o(10466029993984L, 77978);
    return true;
  }
  
  public boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(15499865882624L, 115483);
    GMTrace.o(15499865882624L, 115483);
    return true;
  }
  
  protected static final class a
  {
    int iQC;
    com.tencent.mm.plugin.appbrand.jsapi.c iUt;
    
    a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
    {
      GMTrace.i(15500536971264L, 115488);
      this.iUt = paramc;
      this.iQC = paramInt;
      GMTrace.o(15500536971264L, 115488);
    }
    
    public final void qb(String paramString)
    {
      GMTrace.i(15500671188992L, 115489);
      this.iUt.v(this.iQC, paramString);
      GMTrace.o(15500671188992L, 115489);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */