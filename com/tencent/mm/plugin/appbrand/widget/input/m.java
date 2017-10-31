package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.support.v4.e.a;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum m
{
  public static final Map<String, Integer> jCf;
  public static final Set<String> jCg;
  private static final Map<String, WeakReference<w>> jCh;
  private static final a<AppBrandPageView, x> jCi;
  
  static
  {
    GMTrace.i(10070087696384L, 75028);
    jCj = new m[0];
    Object localObject = new HashSet();
    ((Set)localObject).add("text");
    ((Set)localObject).add("emoji");
    ((Set)localObject).add("number");
    ((Set)localObject).add("digit");
    ((Set)localObject).add("idcard");
    jCg = Collections.unmodifiableSet((Set)localObject);
    localObject = new HashMap(3);
    ((Map)localObject).put("digit", Integer.valueOf(2));
    ((Map)localObject).put("number", Integer.valueOf(0));
    ((Map)localObject).put("idcard", Integer.valueOf(1));
    jCf = Collections.unmodifiableMap((Map)localObject);
    jCh = new HashMap();
    jCi = new a();
    GMTrace.o(10070087696384L, 75028);
  }
  
  public static void a(AppBrandPageView paramAppBrandPageView, final x paramx)
  {
    GMTrace.i(18280588771328L, 136201);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(18280588771328L, 136201);
      return;
    }
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10052639391744L, 74898);
        m.acf().put(this.iRh, paramx);
        GMTrace.o(10052639391744L, 74898);
      }
    });
    GMTrace.o(18280588771328L, 136201);
  }
  
  public static void a(AppBrandPageView paramAppBrandPageView, final String paramString, final Integer paramInteger)
  {
    GMTrace.i(18280320335872L, 136199);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(18280320335872L, 136199);
      return;
    }
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10075993276416L, 75072);
        Object localObject = (x)m.acf().get(this.iQw);
        if (localObject != null)
        {
          localObject = m.sw(((x)localObject).abA());
          if (localObject != null) {
            ((w)localObject).b(paramString, paramInteger);
          }
        }
        GMTrace.o(10075993276416L, 75072);
      }
    });
    GMTrace.o(18280320335872L, 136199);
  }
  
  @TargetApi(20)
  public static void a(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(10068342865920L, 75015);
    if ((paramMMActivity == null) || (paramMMActivity.getWindow() == null))
    {
      GMTrace.o(10068342865920L, 75015);
      return;
    }
    if ((paramView.getParent() == null) || (!(paramView.getParent() instanceof ViewGroup)))
    {
      GMTrace.o(10068342865920L, 75015);
      return;
    }
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    localViewGroup.removeView(paramView);
    paramMMActivity.getWindow().getDecorView();
    paramView = new l(paramMMActivity, paramView);
    localViewGroup.addView(paramView, new ViewGroup.LayoutParams(-1, -1));
    if (Build.VERSION.SDK_INT < 20)
    {
      Point localPoint = new Point();
      paramMMActivity.getWindowManager().getDefaultDisplay().getSize(localPoint);
      int i = com.tencent.mm.pluginsdk.e.dH(paramMMActivity);
      paramView.jBX = (localPoint.y - i);
    }
    ac.a.a(paramMMActivity, localViewGroup);
    GMTrace.o(10068342865920L, 75015);
  }
  
  public static void a(String paramString, final w paramw)
  {
    GMTrace.i(17635538370560L, 131395);
    if ((bg.mZ(paramString)) || (paramw == null))
    {
      GMTrace.o(17635538370560L, 131395);
      return;
    }
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18255221620736L, 136012);
        m.ace().put(this.iWo, new WeakReference(paramw));
        GMTrace.o(18255221620736L, 136012);
      }
    });
    GMTrace.o(17635538370560L, 131395);
  }
  
  public static boolean a(AppBrandPageView paramAppBrandPageView, String paramString, int paramInt)
  {
    GMTrace.i(18280454553600L, 136200);
    paramString = sw(paramString);
    if ((paramString != null) && (paramString.g(paramAppBrandPageView)) && (paramString.jP(paramInt)))
    {
      GMTrace.o(18280454553600L, 136200);
      return true;
    }
    GMTrace.o(18280454553600L, 136200);
    return false;
  }
  
  @Deprecated
  public static boolean a(h paramh, String paramString)
  {
    GMTrace.i(17278787649536L, 128737);
    if (bg.mZ(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandInputService", "updateInputStyle, inputId is Null Or Nil");
      GMTrace.o(17278787649536L, 128737);
      return false;
    }
    paramString = (WeakReference)jCh.get(paramString);
    label63:
    int i;
    if (paramString == null)
    {
      paramString = null;
      if (!(paramString instanceof g)) {
        break label108;
      }
      paramString = (g)paramString;
      if (paramString == null) {
        break label192;
      }
      if ((paramString.jBl != null) && (paramString.jBn != null)) {
        break label113;
      }
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label192;
      }
      GMTrace.o(17278787649536L, 128737);
      return true;
      paramString = (w)paramString.get();
      break;
      label108:
      paramString = null;
      break label63;
      label113:
      paramString.jBl.a(paramh);
      if ((!paramString.jBl.jFV) && ((paramString.jBl.jFZ == null) || (paramString.jBl.jFZ.intValue() <= 0)))
      {
        i = 0;
      }
      else
      {
        paramString.jBn.setWillNotDraw(true);
        paramString.cN(false);
        paramString.jBn.setWillNotDraw(false);
        paramString.jBn.invalidate();
        i = 1;
      }
    }
    label192:
    GMTrace.o(17278787649536L, 128737);
    return false;
  }
  
  public static void b(MMActivity paramMMActivity)
  {
    GMTrace.i(10068208648192L, 75014);
    if ((paramMMActivity == null) || (paramMMActivity.getWindow() == null))
    {
      GMTrace.o(10068208648192L, 75014);
      return;
    }
    paramMMActivity.getWindow().setSoftInputMode(16);
    GMTrace.o(10068208648192L, 75014);
  }
  
  public static boolean c(AppBrandPageView paramAppBrandPageView, String paramString)
  {
    GMTrace.i(15424703954944L, 114923);
    String str = paramString;
    if (bg.mZ(paramString))
    {
      paramAppBrandPageView = (x)jCi.get(paramAppBrandPageView);
      if (paramAppBrandPageView == null)
      {
        GMTrace.o(15424703954944L, 114923);
        return false;
      }
      str = paramAppBrandPageView.abA();
    }
    if (bg.mZ(str))
    {
      GMTrace.o(15424703954944L, 114923);
      return false;
    }
    paramAppBrandPageView = sw(str);
    if ((paramAppBrandPageView != null) && (paramAppBrandPageView.abK()))
    {
      GMTrace.o(15424703954944L, 114923);
      return true;
    }
    GMTrace.o(15424703954944L, 114923);
    return false;
  }
  
  public static void i(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(14318615658496L, 106682);
    if (paramAppBrandPageView != null) {
      new j(paramAppBrandPageView);
    }
    GMTrace.o(14318615658496L, 106682);
  }
  
  public static boolean j(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10069013954560L, 75020);
    boolean bool = c(paramAppBrandPageView, null);
    GMTrace.o(10069013954560L, 75020);
    return bool;
  }
  
  public static void k(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10069282390016L, 75022);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10095857500160L, 75220);
        m.j(this.iQw);
        GMTrace.o(10095857500160L, 75220);
      }
    });
    GMTrace.o(10069282390016L, 75022);
  }
  
  static void l(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(14318884093952L, 106684);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(14318884093952L, 106684);
      return;
    }
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10096260153344L, 75223);
        m.acf().remove(this.iRh);
        GMTrace.o(10096260153344L, 75223);
      }
    });
    GMTrace.o(14318884093952L, 106684);
  }
  
  static w m(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17635806806016L, 131397);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(17635806806016L, 131397);
      return null;
    }
    paramAppBrandPageView = (x)jCi.get(paramAppBrandPageView);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(17635806806016L, 131397);
      return null;
    }
    if (bg.mZ(paramAppBrandPageView.abA()))
    {
      GMTrace.o(17635806806016L, 131397);
      return null;
    }
    paramAppBrandPageView = sw(paramAppBrandPageView.abA());
    GMTrace.o(17635806806016L, 131397);
    return paramAppBrandPageView;
  }
  
  static w sw(String paramString)
  {
    GMTrace.i(17635672588288L, 131396);
    paramString = (WeakReference)jCh.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(17635672588288L, 131396);
      return null;
    }
    paramString = (w)paramString.get();
    GMTrace.o(17635672588288L, 131396);
    return paramString;
  }
  
  public static boolean sx(String paramString)
  {
    GMTrace.i(10069416607744L, 75023);
    if (bg.mZ(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandInputService", "removeInput, inputId is Null Or Nil");
      GMTrace.o(10069416607744L, 75023);
      return false;
    }
    paramString = sw(paramString);
    if ((paramString != null) && (paramString.abD()))
    {
      GMTrace.o(10069416607744L, 75023);
      return true;
    }
    GMTrace.o(10069416607744L, 75023);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */