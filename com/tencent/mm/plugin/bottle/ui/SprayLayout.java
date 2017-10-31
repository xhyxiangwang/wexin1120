package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.ae;

public class SprayLayout
  extends FrameLayout
{
  private ae handler;
  private ImageView khD;
  private ImageView khE;
  private ImageView khF;
  Animation khG;
  Animation khH;
  Animation khI;
  Animation khJ;
  Animation khK;
  AnimationSet khL;
  AnimationSet khM;
  AnimationSet khN;
  private int khO;
  private int khP;
  private int khQ;
  private int khR;
  private int khS;
  private int khT;
  private Runnable khU;
  private int repeatCount;
  
  public SprayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7645444440064L, 56963);
    GMTrace.o(7645444440064L, 56963);
  }
  
  public SprayLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7645578657792L, 56964);
    this.khG = new ScaleAnimation(0.6F, 0.8F, 0.6F, 0.8F, 1, 0.5F, 1, 1.0F);
    this.khH = new AlphaAnimation(0.2F, 1.0F);
    this.khI = new ScaleAnimation(0.8F, 1.27F, 0.8F, 1.27F, 1, 0.5F, 1, 1.0F);
    this.khJ = new AlphaAnimation(1.0F, 0.5F);
    this.khK = new ScaleAnimation(0.8F, 1.0F, 0.8F, 1.0F, 1, 0.5F, 1, 1.0F);
    this.khL = new AnimationSet(true);
    this.khM = new AnimationSet(true);
    this.khN = new AnimationSet(true);
    this.khG.setDuration(280L);
    this.khH.setDuration(280L);
    this.khI.setDuration(280L);
    this.khJ.setDuration(280L);
    this.khL.addAnimation(this.khG);
    this.khL.addAnimation(this.khH);
    this.khL.setRepeatCount(1);
    this.khL.setDuration(280L);
    this.khM.addAnimation(this.khI);
    this.khM.setRepeatCount(1);
    this.khM.setDuration(280L);
    this.khN.addAnimation(this.khK);
    this.khN.setRepeatCount(1);
    this.khN.setDuration(280L);
    this.khO = 0;
    this.repeatCount = 1;
    this.khQ = -1;
    this.khR = -1;
    this.handler = new ae();
    this.khU = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7613769056256L, 56727);
        if (SprayLayout.a(SprayLayout.this) == 0)
        {
          SprayLayout.b(SprayLayout.this);
          SprayLayout.c(SprayLayout.this).clearAnimation();
          SprayLayout.c(SprayLayout.this).setVisibility(8);
          SprayLayout.d(SprayLayout.this);
        }
        while (SprayLayout.g(SprayLayout.this) > SprayLayout.h(SprayLayout.this))
        {
          SprayLayout.this.stop();
          GMTrace.o(7613769056256L, 56727);
          return;
          if (SprayLayout.a(SprayLayout.this) == 1)
          {
            SprayLayout.e(SprayLayout.this).startAnimation(SprayLayout.this.khL);
            SprayLayout.e(SprayLayout.this).setVisibility(0);
            SprayLayout.f(SprayLayout.this).setVisibility(8);
            SprayLayout.c(SprayLayout.this).setVisibility(8);
          }
          else if (SprayLayout.a(SprayLayout.this) == 2)
          {
            SprayLayout.e(SprayLayout.this).startAnimation(SprayLayout.this.khM);
            SprayLayout.f(SprayLayout.this).startAnimation(SprayLayout.this.khL);
            SprayLayout.f(SprayLayout.this).setVisibility(0);
          }
          else if (SprayLayout.a(SprayLayout.this) == 3)
          {
            SprayLayout.e(SprayLayout.this).clearAnimation();
            SprayLayout.e(SprayLayout.this).setVisibility(8);
            SprayLayout.f(SprayLayout.this).startAnimation(SprayLayout.this.khM);
            SprayLayout.c(SprayLayout.this).startAnimation(SprayLayout.this.khL);
            SprayLayout.c(SprayLayout.this).setVisibility(0);
          }
          else if (SprayLayout.a(SprayLayout.this) == 4)
          {
            SprayLayout.c(SprayLayout.this).startAnimation(SprayLayout.this.khN);
            SprayLayout.f(SprayLayout.this).clearAnimation();
            SprayLayout.f(SprayLayout.this).setVisibility(8);
          }
        }
        SprayLayout.j(SprayLayout.this).postDelayed(SprayLayout.i(SprayLayout.this), 280L);
        SprayLayout.a(SprayLayout.this, SprayLayout.k(SprayLayout.this) % 5);
        GMTrace.o(7613769056256L, 56727);
      }
    };
    GMTrace.o(7645578657792L, 56964);
  }
  
  public final void stop()
  {
    GMTrace.i(7645847093248L, 56966);
    this.handler.removeCallbacks(this.khU);
    setVisibility(8);
    GMTrace.o(7645847093248L, 56966);
  }
  
  public final void z(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7645712875520L, 56965);
    this.khO = 0;
    this.repeatCount = paramInt1;
    this.khP = 0;
    this.khQ = paramInt2;
    this.khR = paramInt3;
    if (this.khD == null)
    {
      this.khD = ((ImageView)findViewById(R.h.bnh));
      this.khE = ((ImageView)findViewById(R.h.bnj));
      this.khF = ((ImageView)findViewById(R.h.bni));
      DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
      this.khS = (localDisplayMetrics.widthPixels * 35 / 96);
      this.khT = (localDisplayMetrics.heightPixels / 16);
    }
    this.khD.setVisibility(8);
    this.khE.setVisibility(8);
    this.khF.setVisibility(8);
    setVisibility(0);
    this.handler.removeCallbacks(this.khU);
    this.handler.postDelayed(this.khU, 0L);
    GMTrace.o(7645712875520L, 56965);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/SprayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */