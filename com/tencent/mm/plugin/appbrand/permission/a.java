package com.tencent.mm.plugin.appbrand.permission;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.b;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.j;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.widget.f.2;
import com.tencent.mm.plugin.appbrand.widget.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;

final class a
{
  private static final SparseIntArray jng;
  private static final Set<String> jnh;
  
  static
  {
    GMTrace.i(17322811064320L, 129065);
    jng = new SparseIntArray()
    {
      public final int get(int paramAnonymousInt)
      {
        GMTrace.i(17323616370688L, 129071);
        paramAnonymousInt = super.get(paramAnonymousInt, p.i.ixq);
        GMTrace.o(17323616370688L, 129071);
        return paramAnonymousInt;
      }
    };
    jnh = new HashSet();
    jng.put("requestPayment".hashCode(), p.i.ixm);
    jng.put("playVoice".hashCode(), p.i.ixn);
    jng.put("operateMusicPlayer".hashCode(), p.i.ixn);
    jng.put("shareAppMessage".hashCode(), p.i.ixo);
    jng.put("onShareAppMessage".hashCode(), p.i.ixo);
    jng.put("shareAppMessageDirectly".hashCode(), p.i.ixo);
    jng.put("shareTimeline".hashCode(), p.i.ixo);
    jng.put("onMenuShareTimeline".hashCode(), p.i.ixo);
    jng.put("launchMiniProgram".hashCode(), p.i.ixl);
    jnh.add("requestPayment");
    jnh.add("playVoice");
    jnh.add("operateMusicPlayer");
    jnh.add("shareAppMessage");
    jnh.add("onShareAppMessage");
    jnh.add("shareAppMessageDirectly");
    jnh.add("shareTimeline");
    jnh.add("onMenuShareTimeline");
    jnh.add("launchMiniProgram");
    jnh.add("makeVoIPCall");
    jnh.add("addCard");
    jnh.add("chooseContact");
    jnh.add("openCard");
    GMTrace.o(17322811064320L, 129065);
  }
  
  static void a(com.tencent.mm.plugin.appbrand.f paramf, b paramb)
  {
    GMTrace.i(17322676846592L, 129064);
    if ((paramf == null) || (paramb == null))
    {
      GMTrace.o(17322676846592L, 129064);
      return;
    }
    if (!jnh.contains(paramb.getName()))
    {
      GMTrace.o(17322676846592L, 129064);
      return;
    }
    paramb = ab.getResources().getString(jng.get(paramb.getName().hashCode()));
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17323884806144L, 129073);
        Object localObject1 = this.irE.iqR;
        if (localObject1 != null)
        {
          localObject1 = ((l)localObject1).YZ();
          if (localObject1 != null)
          {
            Object localObject2 = ((j)localObject1).YO();
            if (localObject2 != null)
            {
              localObject1 = this.jni;
              if (((AppBrandPageView)localObject2).jle != null)
              {
                localObject2 = ((AppBrandPageView)localObject2).jle;
                ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).jzc.setText((CharSequence)localObject1);
                if ((((com.tencent.mm.plugin.appbrand.widget.f)localObject2).getTranslationY() == 0.0F) || (((com.tencent.mm.plugin.appbrand.widget.f)localObject2).jzt != null))
                {
                  GMTrace.o(17323884806144L, 129073);
                  return;
                }
                ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).jzp = f.a.jzy;
                ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).setVisibility(0);
                ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).jzt = ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).animate().translationY(0.0F);
                ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).jzt.setListener(new f.2((com.tencent.mm.plugin.appbrand.widget.f)localObject2));
                ((com.tencent.mm.plugin.appbrand.widget.f)localObject2).jzt.start();
              }
            }
          }
        }
        GMTrace.o(17323884806144L, 129073);
      }
    });
    GMTrace.o(17322676846592L, 129064);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/permission/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */