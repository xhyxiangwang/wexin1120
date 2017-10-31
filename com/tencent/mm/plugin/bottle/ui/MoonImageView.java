package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;

public class MoonImageView
  extends ImageView
{
  ImageView kfx;
  private final int[] kgQ;
  private final double[] kgR;
  
  public MoonImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7647591923712L, 56979);
    this.kgQ = new int[] { 0, R.g.aWs, R.g.aWt, R.g.aWu, R.g.aWv, R.g.aWw, R.g.aWx, R.g.aWy };
    this.kgR = new double[] { 0.0D, 20.0D, 35.0D, 50.0D, 60.0D, 50.0D, 35.0D, 20.0D };
    GMTrace.o(7647591923712L, 56979);
  }
  
  public MoonImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7647726141440L, 56980);
    this.kgQ = new int[] { 0, R.g.aWs, R.g.aWt, R.g.aWu, R.g.aWv, R.g.aWw, R.g.aWx, R.g.aWy };
    this.kgR = new double[] { 0.0D, 20.0D, 35.0D, 50.0D, 60.0D, 50.0D, 35.0D, 20.0D };
    GMTrace.o(7647726141440L, 56980);
  }
  
  public void setVisibility(int paramInt)
  {
    int i = 2;
    int j = 0;
    GMTrace.i(7647860359168L, 56981);
    Object localObject = new f();
    if (((f)localObject).kgN <= 2)
    {
      i = 0;
      setBackgroundResource(this.kgQ[i]);
      localObject = this.kfx;
      switch (i)
      {
      default: 
        j = 170;
      }
    }
    for (;;)
    {
      ((ImageView)localObject).setAlpha(j);
      if (i > 0)
      {
        j = getContext().getResources().getDisplayMetrics().heightPixels / 8;
        double d = this.kgR[i] * 3.141592653589793D / 180.0D;
        i = (int)((1.0D - Math.cos(d)) * j);
        int k = (int)((1.0D - Math.sin(d)) * j);
        localObject = (ViewGroup.MarginLayoutParams)getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).setMargins(j + i, j + k, ((ViewGroup.MarginLayoutParams)localObject).rightMargin, ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
        setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      this.kfx.setVisibility(paramInt);
      super.setVisibility(paramInt);
      GMTrace.o(7647860359168L, 56981);
      return;
      if (((f)localObject).kgN <= 6)
      {
        i = 1;
        break;
      }
      if (((f)localObject).kgN <= 10) {
        break;
      }
      if (((f)localObject).kgN <= 14)
      {
        i = 3;
        break;
      }
      if (((f)localObject).kgN <= 17)
      {
        i = 4;
        break;
      }
      if (((f)localObject).kgN <= 21)
      {
        i = 5;
        break;
      }
      if (((f)localObject).kgN <= 26)
      {
        i = 6;
        break;
      }
      i = 7;
      break;
      j = 255;
      continue;
      j = 170;
      continue;
      j = 127;
      continue;
      j = 85;
      continue;
      j = 85;
      continue;
      j = 127;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/MoonImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */