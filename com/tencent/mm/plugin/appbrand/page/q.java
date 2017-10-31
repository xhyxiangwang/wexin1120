package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;

public final class q
  extends p
{
  a jlK;
  b jlL;
  private boolean jlM;
  private LinearLayout jlN;
  TextView jlO;
  private View jlP;
  ImageView jlQ;
  ImageView jlR;
  ImageView jlS;
  private long jlT;
  
  public q(Context paramContext, s params)
  {
    super(paramContext);
    GMTrace.i(10257992515584L, 76428);
    this.jlM = false;
    this.jlT = 0L;
    params.wUU = this;
    params.cgk();
    this.jlN = ((LinearLayout)LayoutInflater.from(getContext()).inflate(p.g.ivo, this, false));
    paramContext = this.jlN;
    this.jlx = paramContext;
    this.jly = new FrameLayout(getContext());
    this.jly.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.jly.addView(paramContext);
    this.HB = params;
    this.jlz = new FrameLayout(getContext());
    this.jlz.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.jlz.addView(params);
    addView(this.jly);
    addView(this.jlz);
    this.jlO = ((TextView)findViewById(p.f.itw));
    this.jlP = findViewById(p.f.its);
    this.jlQ = ((ImageView)findViewById(p.f.itt));
    this.jlR = ((ImageView)findViewById(p.f.itu));
    this.jlS = ((ImageView)findViewById(p.f.itv));
    GMTrace.o(10257992515584L, 76428);
  }
  
  static AnimationDrawable a(int paramInt, float[] paramArrayOfFloat)
  {
    GMTrace.i(10258932039680L, 76435);
    AnimationDrawable localAnimationDrawable = new AnimationDrawable();
    localAnimationDrawable.setOneShot(false);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[0]), 0);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[1]), 300);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[2]), 300);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[3]), 300);
    GMTrace.o(10258932039680L, 76435);
    return localAnimationDrawable;
  }
  
  private static Drawable f(int paramInt, float paramFloat)
  {
    GMTrace.i(10259066257408L, 76436);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.setIntrinsicHeight(32);
    localShapeDrawable.setIntrinsicWidth(32);
    localShapeDrawable.getPaint().setColor(paramInt);
    localShapeDrawable.getPaint().setAlpha((int)(255.0F * paramFloat));
    GMTrace.o(10259066257408L, 76436);
    return localShapeDrawable;
  }
  
  protected final void Zj()
  {
    GMTrace.i(10258126733312L, 76429);
    ((AnimationDrawable)this.jlQ.getDrawable()).start();
    ((AnimationDrawable)this.jlR.getDrawable()).start();
    ((AnimationDrawable)this.jlS.getDrawable()).start();
    if (this.jlK != null) {
      this.jlK.Ze();
    }
    this.jlT = System.currentTimeMillis();
    GMTrace.o(10258126733312L, 76429);
  }
  
  protected final void Zk()
  {
    GMTrace.i(10258260951040L, 76430);
    Zo();
    GMTrace.o(10258260951040L, 76430);
  }
  
  protected final int Zm()
  {
    GMTrace.i(10258663604224L, 76433);
    int i = this.jlN.getHeight();
    GMTrace.o(10258663604224L, 76433);
    return i;
  }
  
  public final void Zn()
  {
    GMTrace.i(10258529386496L, 76432);
    long l = System.currentTimeMillis() - this.jlT;
    if (l < 1000L)
    {
      postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10222022164480L, 76160);
          q.this.Zi();
          GMTrace.o(10222022164480L, 76160);
        }
      }, 1000L - l);
      GMTrace.o(10258529386496L, 76432);
      return;
    }
    Zi();
    GMTrace.o(10258529386496L, 76432);
  }
  
  public final void Zo()
  {
    GMTrace.i(10258797821952L, 76434);
    ((AnimationDrawable)this.jlQ.getDrawable()).stop();
    ((AnimationDrawable)this.jlQ.getDrawable()).selectDrawable(0);
    ((AnimationDrawable)this.jlR.getDrawable()).stop();
    ((AnimationDrawable)this.jlR.getDrawable()).selectDrawable(0);
    ((AnimationDrawable)this.jlS.getDrawable()).stop();
    ((AnimationDrawable)this.jlS.getDrawable()).selectDrawable(0);
    GMTrace.o(10258797821952L, 76434);
  }
  
  public final void cu(boolean paramBoolean)
  {
    GMTrace.i(17659026472960L, 131570);
    this.jlM = paramBoolean;
    this.jlB = paramBoolean;
    View localView = this.jlP;
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      GMTrace.o(17659026472960L, 131570);
      return;
    }
  }
  
  protected final void jd(int paramInt)
  {
    GMTrace.i(10258395168768L, 76431);
    if (this.jlL != null) {
      this.jlL.jc(paramInt);
    }
    if (!this.jlM)
    {
      GMTrace.o(10258395168768L, 76431);
      return;
    }
    int i = paramInt;
    if (paramInt > this.jlN.getHeight()) {
      i = this.jlN.getHeight();
    }
    this.jlN.setTranslationY(i - this.jlN.getHeight());
    GMTrace.o(10258395168768L, 76431);
  }
  
  public static abstract interface a
  {
    public abstract void Ze();
  }
  
  public static abstract interface b
  {
    public abstract void jc(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */