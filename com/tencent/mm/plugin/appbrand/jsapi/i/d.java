package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 105;
  private static final String NAME = "showToast";
  public View jaM;
  public aj jaN;
  
  public d()
  {
    GMTrace.i(17678219608064L, 131713);
    GMTrace.o(17678219608064L, 131713);
  }
  
  public static void bF(View paramView)
  {
    GMTrace.i(17678488043520L, 131715);
    if (paramView == null)
    {
      GMTrace.o(17678488043520L, 131715);
      return;
    }
    paramView.setVisibility(8);
    if (!ViewGroup.class.isInstance(paramView.getParent()))
    {
      GMTrace.o(17678488043520L, 131715);
      return;
    }
    ((ViewGroup)paramView.getParent()).removeView(paramView);
    GMTrace.o(17678488043520L, 131715);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17678353825792L, 131714);
    final AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.JsApiShowToast", "invoke JsApi JsApiShowToast failed, current page view is null.");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17678353825792L, 131714);
      return;
    }
    m.k(localAppBrandPageView);
    final int i = paramJSONObject.optInt("duration", 1500);
    final String str1 = paramJSONObject.optString("title");
    final String str2 = paramJSONObject.optString("icon", "success");
    final String str3 = paramJSONObject.optString("image");
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17679964438528L, 131726);
        if (d.this.jaM != null)
        {
          d.bF(d.this.jaM);
          d.this.jaM = null;
          if (d.this.jaN != null) {
            d.this.jaN.MM();
          }
        }
        d.this.jaM = LayoutInflater.from(localAppBrandPageView.mContext).inflate(p.g.ivv, null);
        Object localObject1 = d.this.jaM.findViewById(p.f.iuH);
        q.Aw().n(paramk.hashCode() + "toast_name", true).k("toast_view", d.this.jaM);
        if (this.jaO)
        {
          localObject2 = new ViewGroup.LayoutParams(-1, -1);
          d.this.jaM.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          ((LinearLayout)d.this.jaM.findViewById(p.f.iuG)).setBackgroundColor(0);
          d.this.jaM.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
            {
              GMTrace.i(17680769744896L, 131732);
              GMTrace.o(17680769744896L, 131732);
              return true;
            }
          });
        }
        Object localObject2 = (TextView)d.this.jaM.findViewById(p.f.title);
        final int i = com.tencent.mm.bq.a.fromDPToPix(((TextView)localObject2).getContext(), 18);
        int j = com.tencent.mm.bq.a.fromDPToPix(((TextView)localObject2).getContext(), 27);
        if (!bg.mZ(str1))
        {
          ((TextView)localObject2).setLineSpacing(0.0F, 1.0F);
          ((TextView)localObject2).setSpannableFactory(new Spannable.Factory()
          {
            public final Spannable newSpannable(CharSequence paramAnonymous2CharSequence)
            {
              GMTrace.i(18242336718848L, 135916);
              paramAnonymous2CharSequence = super.newSpannable(paramAnonymous2CharSequence);
              if (!TextUtils.isEmpty(paramAnonymous2CharSequence)) {
                paramAnonymous2CharSequence.setSpan(new com.tencent.mm.plugin.appbrand.widget.f.a(i), 0, paramAnonymous2CharSequence.length(), 18);
              }
              GMTrace.o(18242336718848L, 135916);
              return paramAnonymous2CharSequence;
            }
          });
          ((TextView)localObject2).setText(str1, TextView.BufferType.SPANNABLE);
          ((TextView)localObject2).setVisibility(0);
          ((View)localObject1).setPadding(0, j, 0, 0);
          localObject2 = (ImageView)d.this.jaM.findViewById(p.f.iuc);
          localObject1 = (ProgressBar)d.this.jaM.findViewById(p.f.progress);
          if (!str2.equals("loading")) {
            break label470;
          }
          ((ImageView)localObject2).setVisibility(8);
          ((ProgressBar)localObject1).setVisibility(0);
        }
        label470:
        label577:
        label581:
        for (;;)
        {
          localAppBrandPageView.jjY.addView(d.this.jaM);
          d.this.jaN = new aj(new aj.a()
          {
            public final boolean pO()
            {
              GMTrace.i(18243007807488L, 135921);
              d.bF(d.this.jaM);
              d.this.jaM = null;
              q.Aw().gh(d.1.this.iPN.hashCode() + "toast_name");
              w.d("MicroMsg.JsApiShowToast", "on timer expired!");
              GMTrace.o(18243007807488L, 135921);
              return true;
            }
          }, false);
          localObject1 = d.this.jaN;
          long l = i;
          ((aj)localObject1).w(l, l);
          paramk.v(paramInt, d.this.d("ok", null));
          GMTrace.o(17679964438528L, 131726);
          return;
          ((TextView)localObject2).setVisibility(8);
          break;
          ((ImageView)localObject2).setVisibility(0);
          ((ProgressBar)localObject1).setVisibility(8);
          if (!bg.mZ(str3))
          {
            localObject1 = n.g(paramk.irS, str3);
            if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
              break label577;
            }
            localObject1 = new BitmapDrawable(((ImageView)localObject2).getResources(), (Bitmap)localObject1);
          }
          for (;;)
          {
            if (localObject1 == null) {
              break label581;
            }
            ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
            ((ImageView)localObject2).setScaleType(ImageView.ScaleType.FIT_CENTER);
            break;
            localObject1 = com.tencent.mm.svg.a.a.c(((ImageView)localObject2).getResources(), p.h.ivR);
            continue;
            localObject1 = null;
          }
        }
      }
    });
    GMTrace.o(17678353825792L, 131714);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */