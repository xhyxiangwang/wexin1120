package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.permission.c;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.AppBrandOptionButton;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.j.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public abstract class j
  extends SwipeBackLayout
  implements SwipeBackLayout.a, j.a
{
  private View HB;
  l iqR;
  private boolean jkg;
  public boolean jkh;
  
  public j(Context paramContext, l paraml)
  {
    super(paramContext);
    GMTrace.i(10250878976000L, 76375);
    this.jkh = false;
    this.iqR = paraml;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    init();
    this.wVG = false;
    mz(true);
    this.HB = new com.tencent.mm.plugin.appbrand.widget.j(getContext());
    paramContext = new ViewGroup.LayoutParams(-1, -1);
    ((ViewGroup)this.HB).addView(YI(), paramContext);
    addView(this.HB);
    this.HB = this.HB;
    this.wVL = this;
    GMTrace.o(10250878976000L, 76375);
  }
  
  private void a(String paramString, x paramx)
  {
    GMTrace.i(10252892241920L, 76390);
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", h.sa(YP()));
    localHashMap.put("query", h.sb(YP()));
    if (paramx != null) {
      localHashMap.put("openType", paramx.toString());
    }
    d.k(localHashMap);
    YO().a(paramString, new JSONObject(localHashMap).toString(), null);
    GMTrace.o(10252892241920L, 76390);
  }
  
  protected static boolean c(int[] paramArrayOfInt, int paramInt)
  {
    GMTrace.i(10253294895104L, 76393);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      GMTrace.o(10253294895104L, 76393);
      return true;
    }
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramArrayOfInt[i] == paramInt)
      {
        GMTrace.o(10253294895104L, 76393);
        return true;
      }
      i += 1;
    }
    GMTrace.o(10253294895104L, 76393);
    return false;
  }
  
  public final void U(float paramFloat)
  {
    GMTrace.i(10253429112832L, 76394);
    if (this.jkg)
    {
      if (paramFloat == 1.0F) {
        break label51;
      }
      setVisibility(0);
    }
    while (Float.compare(1.0F, paramFloat) <= 0)
    {
      com.tencent.mm.ui.tools.j.n(this.HB, 0.0F);
      GMTrace.o(10253429112832L, 76394);
      return;
      label51:
      hide();
    }
    float f = this.HB.getWidth() / 4;
    com.tencent.mm.ui.tools.j.n(this.HB, f * (1.0F - paramFloat) * -1.0F);
    GMTrace.o(10253429112832L, 76394);
  }
  
  protected abstract View YI();
  
  public void YL()
  {
    boolean bool2 = true;
    GMTrace.i(10251952717824L, 76383);
    w.d("MicroMsg.AppBrandPage", "onPageForeground: %s", new Object[] { YP() });
    com.tencent.mm.ui.widget.j.b(this);
    this.wSc = false;
    l locall = this.iqR;
    boolean bool1 = bool2;
    if (locall.irS.Ry() == null)
    {
      bool1 = bool2;
      if (locall.jkl.size() == 1) {
        bool1 = false;
      }
    }
    this.mEnable = bool1;
    U(1.0F);
    this.jkg = false;
    setVisibility(0);
    YS();
    GMTrace.o(10251952717824L, 76383);
  }
  
  public void YM()
  {
    GMTrace.i(10252086935552L, 76384);
    w.d("MicroMsg.AppBrandPage", "onPageBackground: %s", new Object[] { YP() });
    com.tencent.mm.ui.widget.j.a(this);
    this.jkg = true;
    GMTrace.o(10252086935552L, 76384);
  }
  
  protected void YN()
  {
    GMTrace.i(10252221153280L, 76385);
    w.d("MicroMsg.AppBrandPage", "onPageDestroy: %s", new Object[] { YP() });
    GMTrace.o(10252221153280L, 76385);
  }
  
  public abstract AppBrandPageView YO();
  
  public abstract String YP();
  
  public final a.c YR()
  {
    GMTrace.i(10252489588736L, 76387);
    a.c localc = this.iqR.irS.iqP.oN(h.sa(YP()));
    GMTrace.o(10252489588736L, 76387);
    return localc;
  }
  
  protected final void YS()
  {
    GMTrace.i(10252623806464L, 76388);
    a.c localc = YR();
    AppBrandPageView localAppBrandPageView = YO();
    String str1 = localc.iHP;
    String str2 = localc.iHO;
    if (!localAppBrandPageView.jlh) {
      localAppBrandPageView.jli = g.au(str1, localAppBrandPageView.jli);
    }
    if (!localAppBrandPageView.jlj) {
      localAppBrandPageView.jlk = str2;
    }
    localAppBrandPageView.B(localAppBrandPageView.jli, localAppBrandPageView.jlk);
    YO().setFullscreen(localc.iHT);
    GMTrace.o(10252623806464L, 76388);
  }
  
  protected final void YT()
  {
    GMTrace.i(10252758024192L, 76389);
    a.c localc = YR();
    YO().rw(localc.iHN);
    Object localObject1 = YO();
    ((AppBrandPageView)localObject1).runOnUiThread(new AppBrandPageView.8((AppBrandPageView)localObject1, localc.iHP));
    localObject1 = YO();
    ((AppBrandPageView)localObject1).runOnUiThread(new AppBrandPageView.13((AppBrandPageView)localObject1, localc.iHO));
    YO().cu(localc.iHU);
    localObject1 = YO();
    ((AppBrandPageView)localObject1).runOnUiThread(new AppBrandPageView.20((AppBrandPageView)localObject1, localc.iHV, localc.iHK));
    YO().jkY.cG(true);
    Object localObject2;
    String str;
    boolean bool;
    if (c.b(YO(), b.b.jjQ))
    {
      localObject1 = YO();
      localObject2 = localc.iHQ;
      str = localc.iHR;
      bool = localc.iHS;
      if (localObject1 != null)
      {
        if ((!bg.mZ((String)localObject2)) || (!bg.mZ(str)) || (bool)) {
          break label266;
        }
        localObject1 = ((AppBrandPageView)localObject1).jkY;
        localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a)localObject1).jyB;
        ((AppBrandOptionButton)localObject2).jyZ = true;
        ((AppBrandOptionButton)localObject2).jza.setVisibility(8);
        ((AppBrandOptionButton)localObject2).jzd.setVisibility(0);
        if (!(((AppBrandOptionButton)localObject2).jzd.getDrawable() instanceof com.tencent.mm.svg.a.b)) {
          ((AppBrandOptionButton)localObject2).jzd.setImageResource(p.h.ivN);
        }
        ((com.tencent.mm.plugin.appbrand.widget.a)localObject1).jyB.setColor(((com.tencent.mm.plugin.appbrand.widget.a)localObject1).jyE);
      }
    }
    for (;;)
    {
      YO().setFullscreen(localc.iHT);
      GMTrace.o(10252758024192L, 76389);
      return;
      label266:
      b.a((AppBrandPageView)localObject1, (String)localObject2, str, bool);
    }
  }
  
  public final void YU()
  {
    GMTrace.i(10253160677376L, 76392);
    a("onAppRouteDone", null);
    w.i("MicroMsg.AppBrandPage", "onAppRouteDone: %s", new Object[] { YP() });
    GMTrace.o(10253160677376L, 76392);
  }
  
  public final boolean YV()
  {
    GMTrace.i(10253697548288L, 76396);
    GMTrace.o(10253697548288L, 76396);
    return false;
  }
  
  public final void YW()
  {
    GMTrace.i(10253831766016L, 76397);
    if ((getContext() instanceof MMActivity)) {
      ((MMActivity)getContext()).aKl();
    }
    l locall = this.iqR;
    locall.runOnUiThread(new l.18(locall, this));
    GMTrace.o(10253831766016L, 76397);
  }
  
  public final void YX()
  {
    GMTrace.i(10253965983744L, 76398);
    this.jkh = true;
    GMTrace.o(10253965983744L, 76398);
  }
  
  public final void a(x paramx)
  {
    GMTrace.i(10253026459648L, 76391);
    a("onAppRoute", paramx);
    w.i("MicroMsg.AppBrandPage", "onAppRoute: %s, %s", new Object[] { paramx.toString(), YP() });
    GMTrace.o(10253026459648L, 76391);
  }
  
  public abstract void b(String paramString1, String paramString2, int[] paramArrayOfInt);
  
  public void cleanup()
  {
    GMTrace.i(10251818500096L, 76382);
    com.tencent.mm.ui.widget.j.b(this);
    GMTrace.o(10251818500096L, 76382);
  }
  
  public final void d(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(10253563330560L, 76395);
    if (paramBoolean)
    {
      localView = this.HB;
      if (paramInt > 0) {}
      for (;;)
      {
        com.tencent.mm.ui.tools.j.a(localView, l, 0.0F, null);
        GMTrace.o(10253563330560L, 76395);
        return;
        l = 240L;
      }
    }
    View localView = this.HB;
    if (paramInt > 0) {}
    for (;;)
    {
      com.tencent.mm.ui.tools.j.a(localView, l, this.HB.getWidth() * -1 / 4, null);
      GMTrace.o(10253563330560L, 76395);
      return;
      l = 240L;
    }
  }
  
  public final void hide()
  {
    GMTrace.i(10252355371008L, 76386);
    if (this.jkg) {
      setVisibility(4);
    }
    GMTrace.o(10252355371008L, 76386);
  }
  
  public abstract void loadUrl(String paramString);
  
  public final void onCancel()
  {
    GMTrace.i(10254100201472L, 76399);
    this.jkh = false;
    GMTrace.o(10254100201472L, 76399);
  }
  
  public abstract boolean rn(String paramString);
  
  public abstract boolean ro(String paramString);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */