package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.compat.a.b.e;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;
import com.tencent.mm.plugin.appbrand.compat.a.b.j;
import com.tencent.mm.plugin.appbrand.compat.a.b.l;
import com.tencent.mm.plugin.appbrand.compat.a.b.n;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 133;
  public static final String NAME = "addMapMarkers";
  public AppBrandPageView iVf;
  private com.tencent.mm.plugin.appbrand.compat.a.b iXg;
  private a iXh;
  public Map<String, String> iXi;
  
  public d()
  {
    GMTrace.i(10446299987968L, 77831);
    this.iXi = new HashMap();
    GMTrace.o(10446299987968L, 77831);
  }
  
  protected final boolean a(final AppBrandPageView paramAppBrandPageView, final int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10446702641152L, 77834);
    q.b localb = paramAppBrandPageView.jla.t(paramInt, true);
    if (localb == null)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "data is null");
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    w.i("MicroMsg.JsApiAddMapMarkers", "onUpdateView, data:%s", new Object[] { paramJSONObject.toString() });
    this.iVf = paramAppBrandPageView;
    this.iXg = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(paramView);
    final Map localMap = (Map)localb.get("marker", new HashMap());
    try
    {
      if (!paramJSONObject.has("markers")) {
        break label1664;
      }
      if (paramJSONObject.optBoolean("clear", true))
      {
        paramView = localMap.values().iterator();
        while (paramView.hasNext()) {
          ((b.h)paramView.next()).remove();
        }
        localMap.clear();
      }
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "parse markers error, exception : %s", new Object[] { paramAppBrandPageView });
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    final HashMap localHashMap = new HashMap();
    paramJSONObject = new JSONArray(paramJSONObject.optString("markers"));
    int i = 0;
    Object localObject1;
    float f1;
    float f2;
    Object localObject4;
    Object localObject2;
    FrameLayout localFrameLayout;
    Object localObject3;
    TextView localTextView;
    label438:
    int k;
    int j;
    if (i < paramJSONObject.length())
    {
      localObject1 = (JSONObject)paramJSONObject.get(i);
      f1 = bg.getFloat(((JSONObject)localObject1).optString("latitude"), 0.0F);
      f2 = bg.getFloat(((JSONObject)localObject1).optString("longitude"), 0.0F);
      localObject4 = ((JSONObject)localObject1).optString("iconPath");
      localObject2 = this.iXg.TQ();
      ((b.i)localObject2).f(f1, f2);
      localFrameLayout = (FrameLayout)((LayoutInflater)paramAppBrandPageView.mContext.getSystemService("layout_inflater")).inflate(p.g.ivh, null);
      localObject3 = (ImageView)localFrameLayout.findViewById(p.f.iuf);
      localTextView = (TextView)localFrameLayout.findViewById(p.f.iug);
      localFrameLayout.setVisibility(8);
      paramView = null;
      if ((localObject4 != null) && (((String)localObject4).startsWith("wxfile://")))
      {
        localObject4 = com.tencent.mm.plugin.appbrand.appstorage.c.aI(paramAppBrandPageView.iqL, (String)localObject4);
        if (localObject4 != null) {
          paramView = com.tencent.mm.sdk.platformtools.d.decodeFile(((AppBrandLocalMediaObject)localObject4).hhT, null);
        }
        if (paramView != null)
        {
          k = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject1, "width");
          j = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject1, "height");
          if ((k != 0) || (j != 0)) {
            break label1690;
          }
          k = com.tencent.mm.plugin.appbrand.n.c.jF(paramView.getWidth());
          j = com.tencent.mm.plugin.appbrand.n.c.jF(paramView.getHeight());
        }
      }
    }
    label607:
    label969:
    label1097:
    label1203:
    label1440:
    label1492:
    label1503:
    label1540:
    label1664:
    label1675:
    label1690:
    for (;;)
    {
      Object localObject5;
      float f3;
      if ((k > 0) && (j > 0) && ((k != paramView.getWidth()) || (j != paramView.getHeight())))
      {
        f1 = k / paramView.getWidth();
        f2 = j / paramView.getHeight();
        localObject4 = new Matrix();
        ((Matrix)localObject4).postScale(f1, f2);
        localObject4 = Bitmap.createBitmap(paramView, 0, 0, paramView.getWidth(), paramView.getHeight(), (Matrix)localObject4, true);
        if ((k != paramView.getWidth()) || (j != paramView.getHeight())) {
          paramView.recycle();
        }
        ((ImageView)localObject3).setImageBitmap((Bitmap)localObject4);
        ((ImageView)localObject3).measure(0, 0);
        k = ((ImageView)localObject3).getMeasuredWidth();
        j = ((ImageView)localObject3).getMeasuredHeight();
        f1 = 0.5F;
        f2 = 1.0F;
        if (((JSONObject)localObject1).has("anchor"))
        {
          localObject3 = new JSONObject(((JSONObject)localObject1).optString("anchor"));
          f1 = (float)((JSONObject)localObject3).optDouble("x");
          f2 = (float)((JSONObject)localObject3).optDouble("y");
          w.i("MicroMsg.JsApiAddMapMarkers", "anchorObj:%s", new Object[] { ((JSONObject)localObject3).toString() });
        }
        k = (int)(k * f1);
        int m = (int)(j * f2);
        localObject3 = ((JSONObject)localObject1).optString("label");
        if (!bg.mZ((String)localObject3))
        {
          localObject4 = new JSONObject((String)localObject3);
          String str = ((JSONObject)localObject4).optString("color");
          j = Color.parseColor("#000000");
          if (!TextUtils.isEmpty(str)) {
            j = com.tencent.mm.plugin.appbrand.n.c.aA(str, Color.parseColor("#000000"));
          }
          n = ((JSONObject)localObject4).optInt("fontSize", 0);
          str = ((JSONObject)localObject4).optString("content");
          localObject5 = new GradientDrawable();
          if (((JSONObject)localObject4).has("borderRadius")) {
            ((GradientDrawable)localObject5).setCornerRadius(((JSONObject)localObject4).optInt("borderRadius"));
          }
          if ((((JSONObject)localObject4).has("borderWidth")) && (((JSONObject)localObject4).has("borderColor"))) {
            ((GradientDrawable)localObject5).setStroke(com.tencent.mm.plugin.appbrand.n.c.jF(((JSONObject)localObject4).optInt("borderWidth")), com.tencent.mm.plugin.appbrand.n.c.rZ(((JSONObject)localObject4).optString("borderColor")));
          }
          ((GradientDrawable)localObject5).setColor(com.tencent.mm.plugin.appbrand.n.c.aA(((JSONObject)localObject4).optString("bgColor", ""), Color.parseColor("#000000")));
          localTextView.setBackgroundDrawable((Drawable)localObject5);
          if (!((JSONObject)localObject4).has("textAlign")) {
            break label1492;
          }
          localObject5 = ((JSONObject)localObject4).optString("textAlign", "");
          if (!((String)localObject5).equals("left")) {
            break label1440;
          }
          localTextView.setGravity(3);
          if (((JSONObject)localObject4).has("padding"))
          {
            i1 = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "padding");
            localTextView.setPadding(i1, i1, i1, i1);
          }
          int i1 = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "x");
          int i2 = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "y");
          localTextView.setText(str);
          localTextView.setTextColor(j);
          if (n > 0) {
            localTextView.setTextSize(n);
          }
          ((ViewGroup.MarginLayoutParams)localTextView.getLayoutParams()).setMargins(k + i1, i2 + m, 0, 0);
          localTextView.requestLayout();
        }
        if (paramView == null) {
          break label1503;
        }
        localFrameLayout.setVisibility(0);
        ((b.i)localObject2).bD(localFrameLayout);
        f3 = (float)((JSONObject)localObject1).optDouble("alpha", 1.0D);
        ((b.i)localObject2).O((float)((JSONObject)localObject1).optDouble("rotate", 0.0D));
        ((b.i)localObject2).P(f3);
        if (bg.mZ((String)localObject3)) {
          break label1540;
        }
        localFrameLayout.measure(0, 0);
        j = localFrameLayout.getMeasuredWidth();
        int n = localFrameLayout.getMeasuredHeight();
        if ((j <= 0) || (n <= 0)) {
          break label1675;
        }
        f2 = k / j;
        f1 = m / n;
      }
      for (;;)
      {
        ((b.i)localObject2).o(f2, f1);
        paramView = ((JSONObject)localObject1).optString("title");
        if (!bg.mZ(paramView)) {
          ((b.i)localObject2).oK(paramView);
        }
        ((b.i)localObject2).f(new Animation() {});
        ((b.i)localObject2).e(new Animation() {});
        paramView = this.iXg.a((b.i)localObject2);
        if (((JSONObject)localObject1).has("id")) {
          localMap.put(Integer.valueOf(((JSONObject)localObject1).optInt("id")), paramView);
        }
        for (;;)
        {
          localObject2 = ((JSONObject)localObject1).optString("callout");
          if (!bg.mZ((String)localObject2))
          {
            this.iXi.put(paramView.getId(), localObject2);
            this.iXh = new a();
            this.iXg.a(this.iXh);
            if (d(paramView)) {
              paramView.showInfoWindow();
            }
          }
          localObject1 = ((JSONObject)localObject1).optString("data");
          localHashMap.put(paramView.getId(), localObject1);
          i += 1;
          break;
          paramView = n.g(paramAppBrandPageView.irS, (String)localObject4);
          break label438;
          ((ImageView)localObject3).setImageBitmap(paramView);
          ((ImageView)localObject3).setScaleType(ImageView.ScaleType.CENTER);
          break label607;
          if (((String)localObject5).equals("right"))
          {
            localTextView.setGravity(5);
            break label969;
          }
          if (((String)localObject5).equals("center"))
          {
            localTextView.setGravity(17);
            break label969;
          }
          localTextView.setGravity(8388659);
          break label969;
          localTextView.setGravity(8388659);
          break label969;
          if (!bg.mZ((String)localObject3))
          {
            localFrameLayout.setVisibility(0);
            ((b.i)localObject2).bD(localFrameLayout);
            break label1097;
          }
          w.e("MicroMsg.JsApiAddMapMarkers", "bitmap is null");
          break label1097;
          ((b.i)localObject2).o(f1, f2);
          break label1203;
          localMap.put(Integer.valueOf(paramView.hashCode()), paramView);
        }
        if (localMap.size() > 0) {
          localb.k("marker", localMap);
        }
        this.iXg.a(new b.j()
        {
          public final void b(b.h paramAnonymoush)
          {
            GMTrace.i(19770539769856L, 147302);
            Object localObject = new d.b();
            String str = bg.mY((String)localHashMap.get(paramAnonymoush.getId()));
            paramAnonymoush = new JSONObject();
            try
            {
              paramAnonymoush.put("mapId", paramInt);
              paramAnonymoush.put("data", str);
              localObject = ((d.b)localObject).aj(paramAppBrandPageView.iqL, paramAppBrandPageView.hashCode());
              ((e)localObject).mData = paramAnonymoush.toString();
              ((e)localObject).VI();
              GMTrace.o(19770539769856L, 147302);
              return;
            }
            catch (JSONException localJSONException)
            {
              for (;;)
              {
                w.e("MicroMsg.JsApiAddMapMarkers", "put JSON data error : %s", new Object[] { localJSONException });
              }
            }
          }
        });
        this.iXg.a(new b.l()
        {
          public final void Ud()
          {
            GMTrace.i(19770271334400L, 147300);
            if (localMap == null)
            {
              w.e("MicroMsg.JsApiAddMapMarkers", "markerMap is null, return");
              GMTrace.o(19770271334400L, 147300);
              return;
            }
            Iterator localIterator = localMap.values().iterator();
            while (localIterator.hasNext())
            {
              b.h localh = (b.h)localIterator.next();
              if ((!d.this.d(localh)) && (localh.isInfoWindowShown())) {
                localh.hideInfoWindow();
              }
            }
            GMTrace.o(19770271334400L, 147300);
          }
        });
        this.iXg.a(new b.n()
        {
          public final boolean c(b.h paramAnonymoush)
          {
            GMTrace.i(19769063374848L, 147291);
            Object localObject2 = new d.c();
            String str = bg.mY((String)localHashMap.get(paramAnonymoush.getId()));
            Object localObject1 = new JSONObject();
            try
            {
              ((JSONObject)localObject1).put("mapId", paramInt);
              ((JSONObject)localObject1).put("data", str);
              localObject2 = ((d.c)localObject2).aj(paramAppBrandPageView.iqL, paramAppBrandPageView.hashCode());
              ((e)localObject2).mData = ((JSONObject)localObject1).toString();
              ((e)localObject2).VI();
              localObject1 = (String)d.this.iXi.get(paramAnonymoush.getId());
              if ((bg.mZ((String)localObject1)) && (bg.mZ(paramAnonymoush.getTitle())) && (bg.mZ(paramAnonymoush.getSnippet())))
              {
                w.e("MicroMsg.JsApiAddMapMarkers", "callout and title and snippet is empty, don't show info window");
                GMTrace.o(19769063374848L, 147291);
                return true;
              }
            }
            catch (JSONException localJSONException)
            {
              for (;;)
              {
                w.e("MicroMsg.JsApiAddMapMarkers", "put JSON data error : %s", new Object[] { localJSONException });
              }
              if (!bg.mZ((String)localObject1))
              {
                if (!d.this.d(paramAnonymoush))
                {
                  if (!paramAnonymoush.isInfoWindowShown()) {
                    paramAnonymoush.showInfoWindow();
                  }
                  GMTrace.o(19769063374848L, 147291);
                  return true;
                }
              }
              else
              {
                if (paramAnonymoush.isInfoWindowShown()) {
                  paramAnonymoush.hideInfoWindow();
                }
                for (;;)
                {
                  GMTrace.o(19769063374848L, 147291);
                  return true;
                  paramAnonymoush.showInfoWindow();
                }
              }
              GMTrace.o(19769063374848L, 147291);
            }
            return false;
          }
        });
        for (;;)
        {
          GMTrace.o(10446702641152L, 77834);
          return true;
          w.e("MicroMsg.JsApiAddMapMarkers", "data has not markers");
        }
        f3 = f1;
        f1 = f2;
        f2 = f3;
      }
    }
  }
  
  public final boolean d(b.h paramh)
  {
    GMTrace.i(19770002898944L, 147298);
    paramh = (String)this.iXi.get(paramh.getId());
    try
    {
      if (TextUtils.isEmpty(paramh))
      {
        w.e("MicroMsg.JsApiAddMapMarkers", "isShowInfoWindow, callout is empty");
        GMTrace.o(19770002898944L, 147298);
        return false;
      }
      int i = new JSONObject(paramh).optInt("display");
      if (i == 1)
      {
        GMTrace.o(19770002898944L, 147298);
        return true;
      }
    }
    catch (Exception paramh)
    {
      w.printErrStackTrace("MicroMsg.JsApiAddMapMarkers", paramh, "isShowInfoWindow", new Object[0]);
      GMTrace.o(19770002898944L, 147298);
    }
    return false;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10446434205696L, 77832);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10446434205696L, 77832);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10446434205696L, 77832);
    }
    return 0;
  }
  
  final class a
    implements b.e
  {
    a()
    {
      GMTrace.i(15496242003968L, 115456);
      GMTrace.o(15496242003968L, 115456);
    }
    
    public final View a(b.h paramh)
    {
      GMTrace.i(19768123850752L, 147284);
      paramh = (String)d.this.iXi.get(paramh.getId());
      if (!bg.mZ(paramh)) {}
      for (;;)
      {
        Object localObject;
        String str;
        try
        {
          paramh = new JSONObject(paramh);
          com.tencent.mm.plugin.appbrand.n.c.aA(paramh.optString("shadowColor", ""), Color.parseColor("#000000"));
          paramh.optInt("shadowOpacity");
          paramh.optInt("shadowOffsetX");
          paramh.optInt("shadowOffsetY");
          LinearLayout localLinearLayout = new LinearLayout(d.this.iVf.mContext);
          localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          localLinearLayout.setOrientation(1);
          localLinearLayout.setGravity(17);
          int i = com.tencent.mm.plugin.appbrand.n.c.jF(3);
          localLinearLayout.setPadding(i, i, i, i);
          localObject = new TextView(d.this.iVf.mContext);
          str = paramh.optString("color");
          i = Color.parseColor("#000000");
          if (!TextUtils.isEmpty(str)) {
            i = com.tencent.mm.plugin.appbrand.n.c.aA(str, Color.parseColor("#000000"));
          }
          if (paramh.has("padding"))
          {
            int j = com.tencent.mm.plugin.appbrand.n.c.b(paramh, "padding");
            ((TextView)localObject).setPadding(j, j, j, j);
          }
          ((TextView)localObject).setTextColor(i);
          if (paramh.has("fontSize")) {
            ((TextView)localObject).setTextSize(paramh.optInt("fontSize"));
          }
          if (paramh.has("content")) {
            ((TextView)localObject).setText(paramh.optString("content"));
          }
          ((TextView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          if (paramh.has("textAlign"))
          {
            str = paramh.optString("textAlign", "");
            if (str.equals("left")) {
              ((TextView)localObject).setGravity(3);
            }
          }
          else
          {
            localLinearLayout.addView((View)localObject);
            localObject = new com.tencent.mm.plugin.appbrand.widget.e.b();
            if (paramh.has("borderRadius")) {
              ((com.tencent.mm.plugin.appbrand.widget.e.b)localObject).Vt = paramh.optInt("borderRadius");
            }
            i = com.tencent.mm.plugin.appbrand.n.c.aA(paramh.optString("bgColor", ""), Color.parseColor("#000000"));
            ((com.tencent.mm.plugin.appbrand.widget.e.b)localObject).eI.setColor(i);
            localLinearLayout.setBackgroundDrawable((Drawable)localObject);
            GMTrace.o(19768123850752L, 147284);
            return localLinearLayout;
          }
          if (!str.equals("right")) {
            break label444;
          }
          ((TextView)localObject).setGravity(5);
          continue;
          GMTrace.o(19768123850752L, 147284);
        }
        catch (Exception paramh)
        {
          w.printErrStackTrace("MicroMsg.JsApiAddMapMarkers", paramh, "getInfoWindow", new Object[0]);
        }
        return null;
        label444:
        if (str.equals("center")) {
          ((TextView)localObject).setGravity(17);
        }
      }
    }
  }
  
  private static final class b
    extends e
  {
    private static final int CTRL_INDEX = 199;
    private static final String NAME = "onMapCalloutClick";
    
    public b()
    {
      GMTrace.i(15492752343040L, 115430);
      GMTrace.o(15492752343040L, 115430);
    }
  }
  
  private static final class c
    extends e
  {
    private static final int CTRL_INDEX = 142;
    private static final String NAME = "onMapMarkerClick";
    
    public c()
    {
      GMTrace.i(10445360463872L, 77824);
      GMTrace.o(10445360463872L, 77824);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */