package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.a.a;
import android.support.v4.view.b.e;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class h
  extends Drawable
{
  private static final RectF jzD;
  private static final RectF jzE;
  private Paint eI;
  private int jzF;
  private int jzG;
  private boolean jzH;
  private int jzI;
  b jzJ;
  c jzK;
  int lK;
  ArrayList<Animator> lr;
  
  static
  {
    GMTrace.i(10108742402048L, 75316);
    jzD = new RectF(-21.0F, -21.0F, 21.0F, 21.0F);
    jzE = new RectF(-19.0F, -19.0F, 19.0F, 19.0F);
    GMTrace.o(10108742402048L, 75316);
  }
  
  public h()
  {
    GMTrace.i(10107400224768L, 75306);
    this.jzG = 4;
    this.lK = -16777216;
    this.jzH = false;
    this.jzI = 0;
    this.jzJ = new b();
    this.jzK = new c();
    this.jzF = Math.round(ab.getResources().getDisplayMetrics().density * 48.0F);
    this.lr = new ArrayList();
    GMTrace.o(10107400224768L, 75306);
  }
  
  static Animator a(b paramb)
  {
    GMTrace.i(10108473966592L, 75314);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramb, "trimPathStart", new float[] { 0.0F, 0.75F });
    localObjectAnimator1.setDuration(1333L);
    localObjectAnimator1.setInterpolator(e.jzL);
    localObjectAnimator1.setRepeatCount(-1);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramb, "trimPathEnd", new float[] { 0.0F, 0.75F });
    localObjectAnimator2.setDuration(1333L);
    localObjectAnimator2.setInterpolator(d.jzL);
    localObjectAnimator2.setRepeatCount(-1);
    paramb = ObjectAnimator.ofFloat(paramb, "trimPathOffset", new float[] { 0.0F, 0.25F });
    paramb.setDuration(1333L);
    paramb.setInterpolator(a.jzL);
    paramb.setRepeatCount(-1);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, paramb });
    GMTrace.o(10108473966592L, 75314);
    return localAnimatorSet;
  }
  
  static Animator a(c paramc)
  {
    GMTrace.i(10108608184320L, 75315);
    paramc = ObjectAnimator.ofFloat(paramc, "rotation", new float[] { 0.0F, 720.0F });
    paramc.setDuration(6665L);
    paramc.setInterpolator(a.jzL);
    paramc.setRepeatCount(-1);
    GMTrace.o(10108608184320L, 75315);
    return paramc;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(10107937095680L, 75310);
    Object localObject = getBounds();
    if ((((Rect)localObject).width() == 0) || (((Rect)localObject).height() == 0))
    {
      GMTrace.o(10107937095680L, 75310);
      return;
    }
    if (this.eI == null)
    {
      this.eI = new Paint();
      this.eI.setAntiAlias(true);
      this.eI.setStyle(Paint.Style.STROKE);
      this.eI.setStrokeWidth(this.jzG);
      this.eI.setStrokeCap(Paint.Cap.SQUARE);
      this.eI.setStrokeJoin(Paint.Join.MITER);
    }
    int i = paramCanvas.save();
    paramCanvas.translate(((Rect)localObject).left, ((Rect)localObject).top);
    int j = ((Rect)localObject).width();
    int k = ((Rect)localObject).height();
    localObject = this.eI;
    paramCanvas.scale(j / jzD.width(), k / jzD.height());
    paramCanvas.translate(jzD.width() / 2.0F, jzD.height() / 2.0F);
    if (this.jzH)
    {
      j = paramCanvas.save();
      ((Paint)localObject).setColor(this.jzI);
      paramCanvas.drawArc(jzE, 0.0F, 360.0F, false, (Paint)localObject);
      paramCanvas.restoreToCount(j);
    }
    j = paramCanvas.save();
    ((Paint)localObject).setColor(this.lK);
    paramCanvas.rotate(this.jzK.eT);
    float f1 = this.jzJ.lS;
    float f2 = this.jzJ.lQ;
    float f3 = this.jzJ.lR;
    float f4 = this.jzJ.lQ;
    paramCanvas.drawArc(jzE, -90.0F + (f1 + f2) * 360.0F, 360.0F * (f3 - f4), false, (Paint)localObject);
    paramCanvas.restoreToCount(j);
    paramCanvas.restoreToCount(i);
    GMTrace.o(10107937095680L, 75310);
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(10107802877952L, 75309);
    int i = this.jzF;
    GMTrace.o(10107802877952L, 75309);
    return i;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(10107668660224L, 75308);
    int i = this.jzF;
    GMTrace.o(10107668660224L, 75308);
    return i;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(10108339748864L, 75313);
    GMTrace.o(10108339748864L, 75313);
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(10108071313408L, 75311);
    GMTrace.o(10108071313408L, 75311);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(10108205531136L, 75312);
    GMTrace.o(10108205531136L, 75312);
  }
  
  private static final class a
  {
    public static final Interpolator jzL;
    
    static
    {
      GMTrace.i(10045257416704L, 74843);
      jzL = new LinearInterpolator();
      GMTrace.o(10045257416704L, 74843);
    }
  }
  
  private static final class b
  {
    public float lQ;
    public float lR;
    public float lS;
    
    public b()
    {
      GMTrace.i(10042036191232L, 74819);
      this.lQ = 0.0F;
      this.lR = 0.0F;
      this.lS = 0.0F;
      GMTrace.o(10042036191232L, 74819);
    }
    
    @a
    public final void setTrimPathEnd(float paramFloat)
    {
      GMTrace.i(10042304626688L, 74821);
      this.lR = paramFloat;
      GMTrace.o(10042304626688L, 74821);
    }
    
    @a
    public final void setTrimPathOffset(float paramFloat)
    {
      GMTrace.i(10042438844416L, 74822);
      this.lS = paramFloat;
      GMTrace.o(10042438844416L, 74822);
    }
    
    @a
    public final void setTrimPathStart(float paramFloat)
    {
      GMTrace.i(10042170408960L, 74820);
      this.lQ = paramFloat;
      GMTrace.o(10042170408960L, 74820);
    }
  }
  
  private static final class c
  {
    public float eT;
    
    public c()
    {
      GMTrace.i(10030359248896L, 74732);
      GMTrace.o(10030359248896L, 74732);
    }
    
    @a
    public final void setRotation(float paramFloat)
    {
      GMTrace.i(10030493466624L, 74733);
      this.eT = paramFloat;
      GMTrace.o(10030493466624L, 74733);
    }
  }
  
  private static final class d
  {
    public static final Interpolator jzL;
    private static final Path jzM;
    
    static
    {
      GMTrace.i(10046868029440L, 74855);
      Path localPath = new Path();
      jzM = localPath;
      localPath.cubicTo(0.2F, 0.0F, 0.1F, 1.0F, 0.5F, 1.0F);
      jzM.lineTo(1.0F, 1.0F);
      jzL = e.b(jzM);
      GMTrace.o(10046868029440L, 74855);
    }
  }
  
  private static final class e
  {
    public static final Interpolator jzL;
    private static final Path jzN;
    
    static
    {
      GMTrace.i(10138001866752L, 75534);
      Path localPath = new Path();
      jzN = localPath;
      localPath.lineTo(0.5F, 0.0F);
      jzN.cubicTo(0.7F, 0.0F, 0.6F, 1.0F, 1.0F, 1.0F);
      jzL = e.b(jzN);
      GMTrace.o(10138001866752L, 75534);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */