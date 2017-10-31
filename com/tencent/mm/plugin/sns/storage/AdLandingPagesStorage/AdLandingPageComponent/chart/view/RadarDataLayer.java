package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RadarDataLayer
  extends DataLayerView
{
  public static final Point qoP;
  private Path mj;
  private int qoK;
  private float qoN;
  private a qoQ;
  private a qoR;
  private b qoS;
  private ValueAnimator qoT;
  private boolean qoU;
  private int qoV;
  private Point qoW;
  
  static
  {
    GMTrace.i(8214527606784L, 61203);
    qoP = new Point(0, 0);
    GMTrace.o(8214527606784L, 61203);
  }
  
  public RadarDataLayer(Context paramContext, float paramFloat, a parama)
  {
    super(paramContext);
    GMTrace.i(8213588082688L, 61196);
    this.qoS = new b();
    this.qoU = true;
    this.qoK = 4;
    this.qoV = 80;
    this.qoW = qoP;
    this.qoN = 1.0F;
    this.mj = new Path();
    this.qoN = paramFloat;
    this.qoS = parama.qnX;
    this.qoK = parama.size();
    this.qoQ = parama;
    paramContext = parama.qnY;
    long l = parama.duration;
    if (l > 0L)
    {
      this.qoT = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.qoR = new a();
      this.qoT.setDuration(l);
      this.qoT.setInterpolator(paramContext);
      this.qoT.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(8210635292672L, 61174);
          float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
          paramAnonymousValueAnimator = RadarDataLayer.a(RadarDataLayer.this).entrySet().iterator();
          while (paramAnonymousValueAnimator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)paramAnonymousValueAnimator.next();
            RadarDataLayer.b(RadarDataLayer.this).put(localEntry.getKey(), Float.valueOf(((Float)localEntry.getValue()).floatValue() * f));
            RadarDataLayer.this.invalidate();
          }
          GMTrace.o(8210635292672L, 61174);
        }
      });
    }
    GMTrace.o(8213588082688L, 61196);
  }
  
  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8213319647232L, 61194);
    this.qoS = new b();
    this.qoU = true;
    this.qoK = 4;
    this.qoV = 80;
    this.qoW = qoP;
    this.qoN = 1.0F;
    this.mj = new Path();
    biE();
    GMTrace.o(8213319647232L, 61194);
  }
  
  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8213453864960L, 61195);
    this.qoS = new b();
    this.qoU = true;
    this.qoK = 4;
    this.qoV = 80;
    this.qoW = qoP;
    this.qoN = 1.0F;
    this.mj = new Path();
    biE();
    GMTrace.o(8213453864960L, 61195);
  }
  
  private void biE()
  {
    GMTrace.i(8213722300416L, 61197);
    setMinimumHeight(160);
    setMinimumWidth(160);
    GMTrace.o(8213722300416L, 61197);
  }
  
  protected final int biB()
  {
    GMTrace.i(8213856518144L, 61198);
    int i = this.qoV;
    GMTrace.o(8213856518144L, 61198);
    return i * 2;
  }
  
  protected final int biC()
  {
    GMTrace.i(8213990735872L, 61199);
    int i = this.qoV;
    GMTrace.o(8213990735872L, 61199);
    return i * 2;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8214124953600L, 61200);
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    this.qoV = ((int)(Math.min(i, j) / 2.0F * 0.8D));
    this.qoW.set((int)(j / 2.0F), (int)(i / 2.0F));
    if (this.qoQ == null) {
      throw new RuntimeException("Error: NullPointerException at data.");
    }
    Object localObject1;
    label116:
    Object localObject2;
    label339:
    label351:
    b localb;
    if (this.qoQ != null)
    {
      float f1;
      float f2;
      if (this.qoR == null)
      {
        localObject1 = this.qoQ.entrySet();
        localObject1 = ((Set)localObject1).iterator();
        i = 0;
        if (!((Iterator)localObject1).hasNext()) {
          break label351;
        }
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        f1 = (float)(this.qoW.x - ((Float)((Map.Entry)localObject2).getValue()).floatValue() / this.qoN * this.qoV * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.qoK));
        f2 = (float)(this.qoW.y - ((Float)((Map.Entry)localObject2).getValue()).floatValue() / this.qoN * this.qoV * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.qoK));
        if (i != 0) {
          break label339;
        }
        this.mj.moveTo(f1, f2);
      }
      for (;;)
      {
        if (this.qoU)
        {
          float f3 = this.qoS.qof;
          localObject2 = new Paint();
          ((Paint)localObject2).setColor(this.qoS.qoe);
          paramCanvas.drawCircle(f1, f2, f3, (Paint)localObject2);
        }
        i += 1;
        break label116;
        localObject1 = this.qoR.entrySet();
        break;
        this.mj.lineTo(f1, f2);
      }
      this.mj.close();
      localObject1 = this.mj;
      localObject2 = new Paint();
      localb = this.qoS;
      if (localb.qoc != -1) {
        break label513;
      }
    }
    label513:
    for (i = localb.qoa;; i = localb.qoc)
    {
      ((Paint)localObject2).setColor(i);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      ((Paint)localObject2).setAntiAlias(true);
      ((Paint)localObject2).setAlpha(this.qoS.qod);
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localObject1 = this.mj;
      localObject2 = new Paint();
      ((Paint)localObject2).setColor(this.qoS.qoa);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setStrokeWidth(this.qoS.qob);
      ((Paint)localObject2).setAntiAlias(true);
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      this.mj.reset();
      GMTrace.o(8214124953600L, 61200);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/RadarDataLayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */