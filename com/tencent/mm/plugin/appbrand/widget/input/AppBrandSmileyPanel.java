package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;

final class AppBrandSmileyPanel
  extends AppBrandSmileyPanelBase
{
  private int jCL;
  int jCM;
  private boolean oy;
  
  public AppBrandSmileyPanel(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10104715870208L, 75286);
    this.jCL = 0;
    this.jCM = -1;
    this.oy = false;
    GMTrace.o(10104715870208L, 75286);
  }
  
  public AppBrandSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10104850087936L, 75287);
    this.jCL = 0;
    this.jCM = -1;
    this.oy = false;
    GMTrace.o(10104850087936L, 75287);
  }
  
  protected final c aco()
  {
    GMTrace.i(19868116058112L, 148029);
    ad localad = new ad();
    GMTrace.o(19868116058112L, 148029);
    return localad;
  }
  
  final boolean acp()
  {
    GMTrace.i(10105521176576L, 75292);
    if (d.et(18))
    {
      bool = super.isInLayout();
      GMTrace.o(10105521176576L, 75292);
      return bool;
    }
    boolean bool = this.oy;
    GMTrace.o(10105521176576L, 75292);
    return bool;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10105386958848L, 75291);
    this.oy = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.oy = false;
    GMTrace.o(10105386958848L, 75291);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10105118523392L, 75289);
    if (!isShown())
    {
      bD(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(10105118523392L, 75289);
      return;
    }
    int[] arrayOfInt;
    if (!j.aM(getContext()))
    {
      arrayOfInt = c.aat();
      paramInt2 = Math.min(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(p.d.isn);
    }
    for (;;)
    {
      bD(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      GMTrace.o(10105118523392L, 75289);
      return;
      if (this.jCM > 0)
      {
        paramInt2 = this.jCM;
      }
      else if (this.jCL > 0)
      {
        paramInt2 = this.jCL;
      }
      else
      {
        arrayOfInt = c.aat();
        paramInt2 = Math.max(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(p.d.isn);
        this.jCL = paramInt2;
      }
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(10105252741120L, 75290);
    jW(paramInt);
    if (paramInt == 0) {
      MH();
    }
    GMTrace.o(10105252741120L, 75290);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/AppBrandSmileyPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */