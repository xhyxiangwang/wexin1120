package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.widget.a;
import com.tencent.mm.plugin.appbrand.widget.j;

@SuppressLint({"ViewConstructor"})
public final class c
  extends j
  implements i
{
  private f irS;
  private a jkY;
  private Runnable jqQ;
  
  public c(Context paramContext, f paramf)
  {
    super(paramContext);
    GMTrace.i(17303752146944L, 128923);
    this.irS = paramf;
    paramContext = new a(paramContext);
    this.jkY = paramContext;
    addView(paramContext);
    this.jkY.cG(false);
    paramContext = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17307510243328L, 128951);
        d.a(c.a(c.this).iqL, d.c.iqA);
        c.a(c.this).finish();
        GMTrace.o(17307510243328L, 128951);
      }
    };
    this.jkY.jyH = paramContext;
    this.jkY.jyG = paramContext;
    h(this.irS.iqN.fxq, -1, "black");
    setBackgroundColor(-1);
    GMTrace.o(17303752146944L, 128923);
  }
  
  private void h(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(17303886364672L, 128924);
    this.jkY.so(paramString1);
    this.jkY.setBackgroundColor(paramInt);
    this.jkY.sq(paramString2);
    this.jkY.cI(true);
    u(paramInt, "black".equals(paramString2));
    GMTrace.o(17303886364672L, 128924);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(17304691671040L, 128930);
    h(paramc.iHN, g.au(paramc.iHP, -1), paramc.iHO);
    setBackgroundColor(g.au(paramc.iHK, -1));
    GMTrace.o(17304691671040L, 128930);
  }
  
  public final void aag()
  {
    GMTrace.i(17304423235584L, 128928);
    removeCallbacks(this.jqQ);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17309255073792L, 128964);
        c.this.setVisibility(8);
        if (c.this.getParent() != null) {
          ((ViewGroup)c.this.getParent()).removeView(c.this);
        }
        GMTrace.o(17309255073792L, 128964);
      }
    });
    GMTrace.o(17304423235584L, 128928);
  }
  
  public final void aah()
  {
    GMTrace.i(17304557453312L, 128929);
    this.jkY.cJ(true);
    GMTrace.o(17304557453312L, 128929);
  }
  
  public final void bh(String paramString1, String paramString2)
  {
    GMTrace.i(17304020582400L, 128925);
    this.jkY.so(paramString2);
    GMTrace.o(17304020582400L, 128925);
  }
  
  public final View getView()
  {
    GMTrace.i(17304825888768L, 128931);
    GMTrace.o(17304825888768L, 128931);
    return this;
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(17304154800128L, 128926);
    super.onAttachedToWindow();
    if (this.jqQ == null)
    {
      this.jqQ = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17306168066048L, 128941);
          if (c.b(c.this) != null) {
            c.b(c.this).cK(true);
          }
          GMTrace.o(17306168066048L, 128941);
        }
      };
      postDelayed(this.jqQ, 1500L);
    }
    GMTrace.o(17304154800128L, 128926);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(17304289017856L, 128927);
    super.onDetachedFromWindow();
    removeCallbacks(this.jqQ);
    GMTrace.o(17304289017856L, 128927);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */