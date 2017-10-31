package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;

public final class AppBrandOptionButton
  extends FrameLayout
{
  public boolean jyZ;
  public View jza;
  private View jzb;
  public TextView jzc;
  public ImageButton jzd;
  
  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17275163770880L, 128710);
    this.jyZ = true;
    init(paramContext);
    GMTrace.o(17275163770880L, 128710);
  }
  
  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17275297988608L, 128711);
    this.jyZ = true;
    init(paramContext);
    GMTrace.o(17275297988608L, 128711);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17275432206336L, 128712);
    setBackgroundResource(p.e.aVx);
    this.jza = LayoutInflater.from(paramContext).inflate(p.g.gXb, this, false);
    this.jzb = this.jza.findViewById(p.f.divider);
    this.jzc = ((TextView)this.jza.findViewById(p.f.bgp));
    this.jzc.setMaxLines(1);
    this.jzc.setClickable(false);
    this.jzc.setBackground(null);
    View localView = this.jza.findViewById(p.f.gVr);
    if (localView != null) {
      localView.setVisibility(8);
    }
    addView(this.jza, new FrameLayout.LayoutParams(-2, -1, 17));
    this.jza.setVisibility(8);
    this.jzd = new ImageButton(paramContext);
    this.jzd.setClickable(false);
    this.jzd.setBackground(null);
    addView(this.jzd, new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(p.d.aVp), -1, 17));
    GMTrace.o(17275432206336L, 128712);
  }
  
  public final void setColor(int paramInt)
  {
    GMTrace.i(18247436992512L, 135954);
    this.jzc.setTextColor(paramInt);
    this.jzb.setBackgroundColor(android.support.v4.b.b.i(paramInt, 77));
    if ((this.jzd.getDrawable() == null) || ((this.jzd.getDrawable() instanceof com.tencent.mm.svg.a.b)))
    {
      this.jzd.setImageResource(p.h.ivN);
      this.jzd.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    }
    GMTrace.o(18247436992512L, 135954);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/AppBrandOptionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */