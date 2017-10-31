package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.base.c.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.widget.e.a;
import com.tencent.mm.plugin.appbrand.widget.e.a.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends a
{
  public static final int CTRL_INDEX = 200;
  public static final String NAME = "translateMapMarker";
  public static final LinkedList<JSONObject> iXy;
  private AppBrandPageView iVf;
  b.h iXA;
  double iXB;
  double iXC;
  private int iXD;
  public c.a iXE;
  public a iXF;
  b iXg;
  public a.a iXz;
  
  static
  {
    GMTrace.i(15492618125312L, 115429);
    iXy = new LinkedList();
    GMTrace.o(15492618125312L, 115429);
  }
  
  public m()
  {
    GMTrace.i(15491275948032L, 115419);
    this.iXF = new a()
    {
      public final void WJ()
      {
        GMTrace.i(15497986834432L, 115469);
        com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
        {
          /* Error */
          public final void run()
          {
            // Byte code:
            //   0: ldc2_w 36
            //   3: ldc 38
            //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
            //   8: aload_0
            //   9: monitorenter
            //   10: getstatic 44	com/tencent/mm/plugin/appbrand/jsapi/map/m:iXy	Ljava/util/LinkedList;
            //   13: invokevirtual 50	java/util/LinkedList:pollFirst	()Ljava/lang/Object;
            //   16: checkcast 52	org/json/JSONObject
            //   19: astore_1
            //   20: aload_1
            //   21: ifnull +33 -> 54
            //   24: ldc 54
            //   26: ldc 56
            //   28: invokestatic 62	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
            //   31: new 13	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1$1
            //   34: dup
            //   35: aload_0
            //   36: aload_1
            //   37: invokespecial 65	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1$1:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1$1;Lorg/json/JSONObject;)V
            //   40: invokestatic 71	com/tencent/mm/plugin/appbrand/o/d:runOnUiThread	(Ljava/lang/Runnable;)V
            //   43: aload_0
            //   44: monitorexit
            //   45: ldc2_w 36
            //   48: ldc 38
            //   50: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
            //   53: return
            //   54: ldc 54
            //   56: ldc 73
            //   58: invokestatic 62	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
            //   61: aload_0
            //   62: getfield 19	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1:iXH	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1;
            //   65: getfield 77	com/tencent/mm/plugin/appbrand/jsapi/map/m$1:iXG	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m;
            //   68: getfield 81	com/tencent/mm/plugin/appbrand/jsapi/map/m:iXE	Lcom/tencent/mm/plugin/appbrand/jsapi/base/c$a;
            //   71: aload_0
            //   72: getfield 19	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1:iXH	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1;
            //   75: getfield 77	com/tencent/mm/plugin/appbrand/jsapi/map/m$1:iXG	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m;
            //   78: ldc 83
            //   80: aconst_null
            //   81: invokevirtual 88	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
            //   84: invokevirtual 94	com/tencent/mm/plugin/appbrand/jsapi/base/c$a:qb	(Ljava/lang/String;)V
            //   87: aload_0
            //   88: getfield 19	com/tencent/mm/plugin/appbrand/jsapi/map/m$1$1:iXH	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m$1;
            //   91: getfield 77	com/tencent/mm/plugin/appbrand/jsapi/map/m$1:iXG	Lcom/tencent/mm/plugin/appbrand/jsapi/map/m;
            //   94: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/map/m:iXz	Lcom/tencent/mm/plugin/appbrand/widget/e/a$a;
            //   97: invokeinterface 103 1 0
            //   102: goto -59 -> 43
            //   105: astore_1
            //   106: aload_0
            //   107: monitorexit
            //   108: aload_1
            //   109: athrow
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	110	0	this	1
            //   19	18	1	localJSONObject	JSONObject
            //   105	4	1	localObject	Object
            // Exception table:
            //   from	to	target	type
            //   10	20	105	finally
            //   24	43	105	finally
            //   43	45	105	finally
            //   54	102	105	finally
            //   106	108	105	finally
          }
        });
        GMTrace.o(15497986834432L, 115469);
      }
    };
    GMTrace.o(15491275948032L, 115419);
  }
  
  protected final boolean VJ()
  {
    GMTrace.i(15491678601216L, 115422);
    GMTrace.o(15491678601216L, 115422);
    return true;
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, a.a parama, c.a parama1)
  {
    GMTrace.i(15491544383488L, 115421);
    this.iXz = parama;
    this.iVf = paramAppBrandPageView;
    this.iXD = paramInt;
    this.iXE = parama1;
    paramAppBrandPageView = paramAppBrandPageView.jla.t(paramInt, true);
    if (paramAppBrandPageView == null)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      parama1.qb(d("fail", null));
      GMTrace.o(15491544383488L, 115421);
      return false;
    }
    paramInt = paramJSONObject.optInt("markerId");
    paramAppBrandPageView = (Map)paramAppBrandPageView.get("marker", null);
    if ((paramAppBrandPageView == null) || (paramAppBrandPageView.size() < 0))
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "markerMap is empty!");
      parama1.qb(d("fail", null));
      GMTrace.o(15491544383488L, 115421);
      return false;
    }
    this.iXA = ((b.h)paramAppBrandPageView.get(Integer.valueOf(paramInt)));
    if (this.iXA == null)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "get marker failed!");
      parama1.qb(d("fail", null));
      GMTrace.o(15491544383488L, 115421);
      return false;
    }
    this.iXg = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(paramView);
    try
    {
      this.iXB = this.iXA.TY().TW();
      this.iXC = this.iXA.TY().TX();
      paramAppBrandPageView = new JSONArray(paramJSONObject.optString("keyFrames"));
      w.d("MicroMsg.JsApiTranslateMapMarker", "keyFramesArray size :%d", new Object[] { Integer.valueOf(paramAppBrandPageView.length()) });
      paramInt = 0;
      while (paramInt < paramAppBrandPageView.length())
      {
        paramView = (JSONObject)paramAppBrandPageView.get(paramInt);
        iXy.add(paramView);
        paramInt += 1;
      }
      this.iXF.WJ();
      GMTrace.o(15491544383488L, 115421);
      return true;
    }
    catch (JSONException paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", new Object[] { paramAppBrandPageView });
      parama1.qb(d("fail", null));
      GMTrace.o(15491544383488L, 115421);
    }
    return false;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(15491410165760L, 115420);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(15491410165760L, 115420);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiTranslateMapMarker", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(15491410165760L, 115420);
    }
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void WJ();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */