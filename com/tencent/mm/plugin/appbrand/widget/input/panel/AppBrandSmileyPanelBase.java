package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.mogic.WxViewPager;

public class AppBrandSmileyPanelBase
  extends LinearLayout
  implements ViewPager.e, AppBrandSmileyViewPager.b
{
  public View HB;
  private boolean jDe;
  public c jFc;
  public a jFo;
  public MMActivity jFp;
  private AppBrandSmileyViewPager jFq;
  private MMDotView jFr;
  private boolean jFs;
  
  public AppBrandSmileyPanelBase(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(19872276807680L, 148060);
    this.jDe = false;
    this.HB = null;
    this.jFq = null;
    this.jFs = true;
    init();
    GMTrace.o(19872276807680L, 148060);
  }
  
  public AppBrandSmileyPanelBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19872411025408L, 148061);
    this.jDe = false;
    this.HB = null;
    this.jFq = null;
    this.jFs = true;
    init();
    GMTrace.o(19872411025408L, 148061);
  }
  
  private void acX()
  {
    GMTrace.i(19873350549504L, 148068);
    if (this.jFr == null)
    {
      GMTrace.o(19873350549504L, 148068);
      return;
    }
    boolean bool = j.aM(getContext());
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool != this.jFs)
    {
      if (!bool) {
        break label117;
      }
      this.jFr.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(p.d.aRY));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jFr.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(p.d.aTO);
      this.jFr.setLayoutParams(localLayoutParams);
    }
    for (;;)
    {
      this.jFs = bool;
      GMTrace.o(19873350549504L, 148068);
      return;
      label117:
      this.jFr.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(p.d.aRW));
      localLayoutParams = (RelativeLayout.LayoutParams)this.jFr.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.jFr.setLayoutParams(localLayoutParams);
    }
  }
  
  private void init()
  {
    GMTrace.i(19872679460864L, 148063);
    this.jFp = ((MMActivity)getContext());
    this.jFc = aco();
    this.jFc.jFb = getContext();
    this.jFc.jFv = this.jFo;
    GMTrace.o(19872679460864L, 148063);
  }
  
  public final void MH()
  {
    GMTrace.i(19873216331776L, 148067);
    if ((this.HB != null) && (getChildCount() > 0))
    {
      this.HB.setVisibility(0);
      GMTrace.o(19873216331776L, 148067);
      return;
    }
    if (this.HB == null) {
      this.HB = View.inflate(ab.getContext(), p.g.ivF, null);
    }
    for (;;)
    {
      this.jFq = ((AppBrandSmileyViewPager)this.HB.findViewById(p.f.cyA));
      this.jFq.b(this);
      this.jFq.jFc = this.jFc;
      this.jFq.jFB = this;
      this.jFr = ((MMDotView)this.HB.findViewById(p.f.cyz));
      this.jFr.Bn(1);
      acX();
      addView(this.HB, new LinearLayout.LayoutParams(-1, -1));
      GMTrace.o(19873216331776L, 148067);
      return;
      if (this.HB.getParent() != null) {
        ((ViewGroup)this.HB.getParent()).removeView(this.HB);
      }
    }
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(19871471501312L, 148054);
    a locala = this.jFc.acY();
    int i = locala.getPageCount();
    int j = locala.jFd;
    if (i <= 1)
    {
      this.jFr.setVisibility(4);
      GMTrace.o(19871471501312L, 148054);
      return;
    }
    this.jFr.setVisibility(0);
    this.jFr.Bn(i);
    this.jFr.Bo(paramInt - j);
    GMTrace.o(19871471501312L, 148054);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(19871605719040L, 148055);
    GMTrace.o(19871605719040L, 148055);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(19871337283584L, 148053);
    GMTrace.o(19871337283584L, 148053);
  }
  
  public final void acV()
  {
    GMTrace.i(19871739936768L, 148056);
    if (this.jFq == null)
    {
      GMTrace.o(19871739936768L, 148056);
      return;
    }
    this.jFc.jFs = j.aM(getContext());
    AppBrandSmileyViewPager.a locala = (AppBrandSmileyViewPager.a)this.jFq.xM;
    if (locala != null)
    {
      locala.jFC.clear();
      locala.jFc = this.jFc;
      locala.notifyDataSetChanged();
    }
    for (;;)
    {
      this.jFq.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19874558509056L, 148077);
          AppBrandSmileyPanelBase.this.V(AppBrandSmileyPanelBase.a(AppBrandSmileyPanelBase.this).xN);
          GMTrace.o(19874558509056L, 148077);
        }
      });
      GMTrace.o(19871739936768L, 148056);
      return;
      locala = new AppBrandSmileyViewPager.a();
      locala.jFc = this.jFc;
      this.jFq.a(locala);
    }
  }
  
  public final void acW()
  {
    GMTrace.i(19872545243136L, 148062);
    if (this.HB != null) {
      this.HB.setVisibility(4);
    }
    GMTrace.o(19872545243136L, 148062);
  }
  
  public c aco()
  {
    GMTrace.i(19872813678592L, 148064);
    c localc = new c();
    GMTrace.o(19872813678592L, 148064);
    return localc;
  }
  
  @SuppressLint({"WrongCall"})
  public final void bD(int paramInt1, int paramInt2)
  {
    GMTrace.i(19872142589952L, 148059);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(19872142589952L, 148059);
  }
  
  public final void jW(int paramInt)
  {
    GMTrace.i(19873082114048L, 148066);
    super.setVisibility(paramInt);
    GMTrace.o(19873082114048L, 148066);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(19872008372224L, 148058);
    if (this.jDe)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(19872008372224L, 148058);
      return;
    }
    j.aM(getContext());
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(19872008372224L, 148058);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19871874154496L, 148057);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    acX();
    GMTrace.o(19871874154496L, 148057);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(19872947896320L, 148065);
    if (paramInt == 0) {}
    for (this.jDe = false;; this.jDe = true)
    {
      super.setVisibility(paramInt);
      if (!this.jDe)
      {
        this.jFp.aKl();
        MH();
      }
      GMTrace.o(19872947896320L, 148065);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void acx();
    
    public abstract void append(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/AppBrandSmileyPanelBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */