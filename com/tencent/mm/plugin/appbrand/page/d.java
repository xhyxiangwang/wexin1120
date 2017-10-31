package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.e;
import com.tencent.mm.plugin.appbrand.widget.e.1;
import com.tencent.mm.plugin.appbrand.widget.e.a;
import com.tencent.mm.plugin.appbrand.widget.e.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class d
  extends j
{
  private String jjU;
  private LinearLayout jjV;
  private FrameLayout jjW;
  private e jjX;
  private FrameLayout jjY;
  private AppBrandPageView jjZ;
  private Map<String, AppBrandPageView> jka;
  private LinkedList<a> jkb;
  
  public d(Context paramContext, l paraml)
  {
    super(paramContext, paraml);
    GMTrace.i(10218264068096L, 76132);
    this.jka = new HashMap();
    this.jkb = new LinkedList();
    this.jjZ = this.iqR.Za();
    GMTrace.o(10218264068096L, 76132);
  }
  
  private e YJ()
  {
    GMTrace.i(10218532503552L, 76134);
    e locale = new e(getContext());
    Object localObject1 = this.iqR.irS.iqP.iHB;
    locale.jzg = ((a.d)localObject1).iHI;
    Object localObject4 = ((a.d)localObject1).hbA;
    String str1 = ((a.d)localObject1).iHJ;
    Object localObject3 = ((a.d)localObject1).iHK;
    Object localObject2 = ((a.d)localObject1).iHL;
    locale.jzh = g.au((String)localObject4, locale.getResources().getColor(p.c.aPH));
    locale.jzi = g.au(str1, locale.getResources().getColor(p.c.aQR));
    float f = com.tencent.mm.bq.a.fromDPToPix(locale.getContext(), 1);
    if (f / 2.0F > 1.0F) {}
    for (int i = (int)(f / 2.0F);; i = 1)
    {
      localObject4 = new GradientDrawable();
      ((GradientDrawable)localObject4).setColor(g.au((String)localObject3, -1));
      localObject3 = new GradientDrawable();
      ((GradientDrawable)localObject3).setShape(0);
      ((GradientDrawable)localObject3).setColor(0);
      if ("white".equals(localObject2))
      {
        ((GradientDrawable)localObject3).setStroke(i, Color.parseColor("#33ffffff"));
        localObject2 = new LayerDrawable(new Drawable[] { localObject4, localObject3 });
        if (!"top".equals(locale.jzg)) {
          break label407;
        }
        ((LayerDrawable)localObject2).setLayerInset(1, -i, -i, -i, -i);
        locale.jzf.setImageDrawable((Drawable)localObject2);
        localObject1 = ((a.d)localObject1).fHD.iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label506;
        }
        localObject4 = (a.e)((Iterator)localObject1).next();
        localObject2 = ((a.e)localObject4).url;
        localObject3 = ((a.e)localObject4).text;
        str1 = ((a.e)localObject4).fJv;
        String str2 = ((a.e)localObject4).iHM;
        localObject4 = new e.a();
        try
        {
          ((e.a)localObject4).uf = e.sr(str1);
          ((e.a)localObject4).jzn = e.sr(str2);
          ((e.a)localObject4).jzo = ((String)localObject3);
          ((e.a)localObject4).mUrl = ((String)localObject2);
          if ((((e.a)localObject4).jzo == null) && ((((e.a)localObject4).uf == null) || (((e.a)localObject4).jzn == null)))
          {
            w.e("MicroMsg.AppBrandPageTabBar", "illegal data");
            continue;
            ((GradientDrawable)localObject3).setStroke(i, Color.parseColor("#33000000"));
            break;
            label407:
            ((LayerDrawable)localObject2).setLayerInset(1, -i, 0, -i, -i);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.AppBrandPageTabBar", localException.getMessage());
          }
          localObject2 = (LinearLayout)LayoutInflater.from(locale.getContext()).inflate(p.g.ivz, locale.jze, false);
          locale.a((View)localObject2, (e.a)localObject4, false);
          ((LinearLayout)localObject2).setOnClickListener(new e.1(locale));
          locale.jzj.add(localObject4);
          locale.jze.addView((View)localObject2);
        }
      }
      label506:
      locale.jzl = new e.b()
      {
        public final void rp(String paramAnonymousString)
        {
          GMTrace.i(10264703401984L, 76478);
          d.this.iqR.rr(paramAnonymousString);
          GMTrace.o(10264703401984L, 76478);
        }
      };
      GMTrace.o(10218532503552L, 76134);
      return locale;
    }
  }
  
  private void YK()
  {
    GMTrace.i(17295296430080L, 128860);
    Iterator localIterator = this.jkb.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      removeCallbacks(locala);
      locala.LA = true;
    }
    this.jkb.clear();
    GMTrace.o(17295296430080L, 128860);
  }
  
  /* Error */
  private AppBrandPageView rl(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 360
    //   5: ldc_w 362
    //   8: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 67	com/tencent/mm/plugin/appbrand/page/d:jjZ	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   15: ifnull +61 -> 76
    //   18: aload_0
    //   19: getfield 67	com/tencent/mm/plugin/appbrand/page/d:jjZ	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   22: astore_2
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 67	com/tencent/mm/plugin/appbrand/page/d:jjZ	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   28: aload_0
    //   29: getfield 50	com/tencent/mm/plugin/appbrand/page/d:jka	Ljava/util/Map;
    //   32: aload_1
    //   33: aload_2
    //   34: invokeinterface 368 3 0
    //   39: pop
    //   40: aload_2
    //   41: getfield 372	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jjV	Landroid/widget/LinearLayout;
    //   44: aload_2
    //   45: getfield 376	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jkY	Lcom/tencent/mm/plugin/appbrand/widget/a;
    //   48: invokevirtual 379	android/widget/LinearLayout:removeView	(Landroid/view/View;)V
    //   51: aload_0
    //   52: getfield 381	com/tencent/mm/plugin/appbrand/page/d:jjY	Landroid/widget/FrameLayout;
    //   55: aload_2
    //   56: getfield 372	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jjV	Landroid/widget/LinearLayout;
    //   59: iconst_0
    //   60: invokevirtual 386	android/widget/FrameLayout:addView	(Landroid/view/View;I)V
    //   63: ldc2_w 360
    //   66: ldc_w 362
    //   69: invokestatic 70	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_2
    //   75: areturn
    //   76: aload_0
    //   77: getfield 59	com/tencent/mm/plugin/appbrand/page/j:iqR	Lcom/tencent/mm/plugin/appbrand/page/l;
    //   80: invokevirtual 65	com/tencent/mm/plugin/appbrand/page/l:Za	()Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   83: astore_2
    //   84: goto -56 -> 28
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	d
    //   0	92	1	paramString	String
    //   22	62	2	localAppBrandPageView	AppBrandPageView
    // Exception table:
    //   from	to	target	type
    //   2	28	87	finally
    //   28	72	87	finally
    //   76	84	87	finally
  }
  
  private void rm(String paramString)
  {
    GMTrace.i(10218935156736L, 76137);
    AppBrandPageView localAppBrandPageView2 = (AppBrandPageView)this.jka.get(h.sa(paramString));
    localAppBrandPageView2.jjV.setVisibility(4);
    paramString = null;
    Iterator localIterator = this.jka.values().iterator();
    if (localIterator.hasNext())
    {
      AppBrandPageView localAppBrandPageView1 = (AppBrandPageView)localIterator.next();
      if (localAppBrandPageView1.jjV.getVisibility() != 0) {
        break label172;
      }
      paramString = localAppBrandPageView1;
    }
    label172:
    for (;;)
    {
      break;
      localAppBrandPageView2.jjV.setVisibility(0);
      if (this.jjW.indexOfChild(localAppBrandPageView2.jkY) == -1) {
        this.jjW.addView(localAppBrandPageView2.jkY, 0);
      }
      if (paramString != null)
      {
        paramString.jjV.setVisibility(4);
        this.jjW.removeView(paramString.jkY);
      }
      localAppBrandPageView2.Wq();
      if (paramString != null) {
        paramString.VS();
      }
      YS();
      GMTrace.o(10218935156736L, 76137);
      return;
    }
  }
  
  protected final View YI()
  {
    GMTrace.i(18355482263552L, 136759);
    LinearLayout localLinearLayout;
    if (this.jjV == null)
    {
      localLinearLayout = new LinearLayout(getContext());
      localLinearLayout.setOrientation(1);
      localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.jjW = new FrameLayout(getContext());
      this.jjW.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
      this.jjY = new FrameLayout(getContext());
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
      localLayoutParams.weight = 1.0F;
      this.jjY.setLayoutParams(localLayoutParams);
      this.jjX = YJ();
      if (!"top".equals(this.iqR.irS.iqP.iHB.iHI)) {
        break label193;
      }
      localLinearLayout.addView(this.jjW);
      localLinearLayout.addView(this.jjX);
      localLinearLayout.addView(this.jjY);
    }
    for (;;)
    {
      this.jjV = localLinearLayout;
      localLinearLayout = this.jjV;
      GMTrace.o(18355482263552L, 136759);
      return localLinearLayout;
      label193:
      localLinearLayout.addView(this.jjW);
      localLinearLayout.addView(this.jjY);
      localLinearLayout.addView(this.jjX);
    }
  }
  
  public final void YL()
  {
    GMTrace.i(10219203592192L, 76139);
    super.YL();
    YO().Wq();
    GMTrace.o(10219203592192L, 76139);
  }
  
  public final void YM()
  {
    GMTrace.i(10219337809920L, 76140);
    super.YM();
    YO().VS();
    GMTrace.o(10219337809920L, 76140);
  }
  
  protected final void YN()
  {
    GMTrace.i(10219472027648L, 76141);
    super.YN();
    if (this.jjZ != null) {
      this.jjZ.onDestroy();
    }
    Iterator localIterator = this.jka.values().iterator();
    while (localIterator.hasNext()) {
      ((AppBrandPageView)localIterator.next()).onDestroy();
    }
    GMTrace.o(10219472027648L, 76141);
  }
  
  /* Error */
  public final AppBrandPageView YO()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 490
    //   5: ldc_w 492
    //   8: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 67	com/tencent/mm/plugin/appbrand/page/d:jjZ	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   15: ifnull +21 -> 36
    //   18: aload_0
    //   19: getfield 67	com/tencent/mm/plugin/appbrand/page/d:jjZ	Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   22: astore_1
    //   23: ldc2_w 490
    //   26: ldc_w 492
    //   29: invokestatic 70	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: aload_0
    //   37: getfield 50	com/tencent/mm/plugin/appbrand/page/d:jka	Ljava/util/Map;
    //   40: aload_0
    //   41: getfield 494	com/tencent/mm/plugin/appbrand/page/d:jjU	Ljava/lang/String;
    //   44: invokestatic 395	com/tencent/mm/plugin/appbrand/n/h:sa	(Ljava/lang/String;)Ljava/lang/String;
    //   47: invokeinterface 399 2 0
    //   52: checkcast 370	com/tencent/mm/plugin/appbrand/page/AppBrandPageView
    //   55: astore_1
    //   56: ldc2_w 490
    //   59: ldc_w 492
    //   62: invokestatic 70	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: goto -33 -> 32
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	d
    //   22	34	1	localAppBrandPageView	AppBrandPageView
    //   68	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	32	68	finally
    //   36	65	68	finally
  }
  
  public final String YP()
  {
    GMTrace.i(10220008898560L, 76145);
    String str = this.jjU;
    GMTrace.o(10220008898560L, 76145);
    return str;
  }
  
  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10219606245376L, 76142);
    if ((this.jjZ != null) && (c(paramArrayOfInt, this.jjZ.hashCode()))) {
      this.jjZ.h(paramString1, paramString2, 0);
    }
    Iterator localIterator = this.jka.values().iterator();
    while (localIterator.hasNext())
    {
      AppBrandPageView localAppBrandPageView = (AppBrandPageView)localIterator.next();
      if (c(paramArrayOfInt, localAppBrandPageView.hashCode())) {
        localAppBrandPageView.h(paramString1, paramString2, 0);
      }
    }
    GMTrace.o(10219606245376L, 76142);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10219740463104L, 76143);
    super.cleanup();
    if (this.jjZ != null) {
      this.jjZ.cleanup();
    }
    Iterator localIterator = this.jka.values().iterator();
    while (localIterator.hasNext()) {
      ((AppBrandPageView)localIterator.next()).cleanup();
    }
    YK();
    GMTrace.o(10219740463104L, 76143);
  }
  
  public final void loadUrl(final String paramString)
  {
    GMTrace.i(10218666721280L, 76135);
    if (paramString.equals(this.jjU))
    {
      GMTrace.o(10218666721280L, 76135);
      return;
    }
    int i = this.jjX.ss(paramString);
    if (i < 0)
    {
      GMTrace.o(10218666721280L, 76135);
      return;
    }
    this.jjU = paramString;
    this.jjX.jO(i);
    if (this.jka.get(h.sa(paramString)) == null)
    {
      final AppBrandPageView localAppBrandPageView = rl(h.sa(paramString));
      YT();
      final a local2 = new a()
      {
        public final void YQ()
        {
          GMTrace.i(10224035430400L, 76175);
          d.a(d.this, paramString);
          d.this.iqR.Zb();
          GMTrace.o(10224035430400L, 76175);
        }
      };
      localAppBrandPageView.a(new AppBrandPageView.e()
      {
        public final void onReady()
        {
          GMTrace.i(10234907066368L, 76256);
          localAppBrandPageView.b(this);
          local2.run();
          w.i("MicroMsg.AppBrandMultiplePage", "Tab page onReady received, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.gBN) });
          GMTrace.o(10234907066368L, 76256);
        }
      });
      if (this.jka.size() > 1)
      {
        this.jkb.add(local2);
        postDelayed(local2, 500L);
      }
      localAppBrandPageView.rv(paramString);
      GMTrace.o(10218666721280L, 76135);
      return;
    }
    YK();
    rm(paramString);
    GMTrace.o(10218666721280L, 76135);
  }
  
  public final boolean rn(String paramString)
  {
    GMTrace.i(18355616481280L, 136760);
    if (this.jjX.ss(paramString) != -1)
    {
      GMTrace.o(18355616481280L, 136760);
      return true;
    }
    GMTrace.o(18355616481280L, 136760);
    return false;
  }
  
  public final boolean ro(String paramString)
  {
    GMTrace.i(20370090360832L, 151769);
    Object localObject1 = this.jka.values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (AppBrandPageView)((Iterator)localObject1).next();
      if ((((AppBrandPageView)localObject2).jlc.jlW != null) && (((AppBrandPageView)localObject2).jlc.jlW.equals(paramString)))
      {
        GMTrace.o(20370090360832L, 151769);
        return true;
      }
    }
    localObject1 = this.jjX;
    Object localObject2 = ((e)localObject1).jzj;
    Iterator localIterator = ((e)localObject1).jzj.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localObject1 = (e.a)localIterator.next();
    } while ((((e.a)localObject1).mUrl == null) || (!((e.a)localObject1).mUrl.equals(paramString)));
    for (paramString = (String)localObject1; ((LinkedList)localObject2).indexOf(paramString) != -1; paramString = null)
    {
      GMTrace.o(20370090360832L, 151769);
      return true;
    }
    GMTrace.o(20370090360832L, 151769);
    return false;
  }
  
  private static abstract class a
    implements Runnable
  {
    boolean LA;
    private boolean jke;
    
    public a()
    {
      GMTrace.i(10239470469120L, 76290);
      this.jke = false;
      this.LA = false;
      GMTrace.o(10239470469120L, 76290);
    }
    
    public abstract void YQ();
    
    public void run()
    {
      GMTrace.i(10239738904576L, 76292);
      if ((!this.jke) && (!this.LA)) {}
      for (int i = 1; i == 0; i = 0)
      {
        GMTrace.o(10239738904576L, 76292);
        return;
      }
      this.jke = true;
      YQ();
      GMTrace.o(10239738904576L, 76292);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */