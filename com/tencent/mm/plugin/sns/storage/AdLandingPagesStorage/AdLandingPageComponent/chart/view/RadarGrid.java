package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView;
import java.util.ArrayList;
import java.util.List;

public class RadarGrid
  extends ChartGridView
{
  public static final Point qoP;
  private Rect eJ;
  private Path mj;
  private int qoK;
  private int qoL;
  private float qoN;
  public c qoO;
  private int qoV;
  private Point qoW;
  private Spannable[] qoY;
  private List<PointF> qoZ;
  
  static
  {
    GMTrace.i(8213185429504L, 61193);
    qoP = new Point(0, 0);
    GMTrace.o(8213185429504L, 61193);
  }
  
  public RadarGrid(Context paramContext, int paramInt1, int paramInt2, float paramFloat, Spannable[] paramArrayOfSpannable, c paramc)
  {
    super(paramContext);
    GMTrace.i(8211843252224L, 61183);
    this.qoK = 4;
    this.qoL = 4;
    this.qoN = 1.0F;
    this.qoV = 80;
    this.qoW = qoP;
    this.mj = new Path();
    this.eJ = new Rect();
    this.qoN = paramFloat;
    this.qoK = paramInt1;
    this.qoL = paramInt2;
    this.qoN = paramFloat;
    this.qoY = paramArrayOfSpannable;
    this.qoO = paramc;
    GMTrace.o(8211843252224L, 61183);
  }
  
  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8211574816768L, 61181);
    this.qoK = 4;
    this.qoL = 4;
    this.qoN = 1.0F;
    this.qoV = 80;
    this.qoW = qoP;
    this.mj = new Path();
    this.eJ = new Rect();
    biE();
    GMTrace.o(8211574816768L, 61181);
  }
  
  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8211709034496L, 61182);
    this.qoK = 4;
    this.qoL = 4;
    this.qoN = 1.0F;
    this.qoV = 80;
    this.qoW = qoP;
    this.mj = new Path();
    this.eJ = new Rect();
    biE();
    GMTrace.o(8211709034496L, 61182);
  }
  
  private List<PointF> ap(float paramFloat)
  {
    GMTrace.i(8212380123136L, 61187);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.qoK)
    {
      PointF localPointF = new PointF();
      localPointF.set((float)(this.qoW.x - this.qoV * paramFloat * Math.sin(i * 2 * 3.141592653589793D / this.qoK)), (float)(this.qoW.y - this.qoV * paramFloat * Math.cos(i * 2 * 3.141592653589793D / this.qoK)));
      localArrayList.add(localPointF);
      i += 1;
    }
    GMTrace.o(8212380123136L, 61187);
    return localArrayList;
  }
  
  private void biE()
  {
    GMTrace.i(8211977469952L, 61184);
    setMinimumHeight(160);
    setMinimumWidth(160);
    GMTrace.o(8211977469952L, 61184);
  }
  
  private Paint biF()
  {
    GMTrace.i(8212648558592L, 61189);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qoO.backgroundColor);
    localPaint.setAntiAlias(true);
    GMTrace.o(8212648558592L, 61189);
    return localPaint;
  }
  
  private Paint biG()
  {
    GMTrace.i(8212782776320L, 61190);
    Paint localPaint = new Paint();
    c localc = this.qoO;
    int i;
    if (localc.qol == -1)
    {
      i = localc.qom;
      localPaint.setColor(i);
      localPaint.setStyle(Paint.Style.STROKE);
      localc = this.qoO;
      if (localc.qop != -1.0F) {
        break label101;
      }
    }
    label101:
    for (float f = localc.qoo;; f = localc.qop)
    {
      localPaint.setStrokeWidth(f);
      localPaint.setAntiAlias(true);
      GMTrace.o(8212782776320L, 61190);
      return localPaint;
      i = localc.qol;
      break;
    }
  }
  
  private Paint biH()
  {
    GMTrace.i(8212916994048L, 61191);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qoO.qom);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(this.qoO.qoo);
    localPaint.setAntiAlias(true);
    GMTrace.o(8212916994048L, 61191);
    return localPaint;
  }
  
  protected final int biB()
  {
    GMTrace.i(8212111687680L, 61185);
    int i = this.qoV;
    GMTrace.o(8212111687680L, 61185);
    return i * 2;
  }
  
  protected final int biC()
  {
    GMTrace.i(8212245905408L, 61186);
    int i = this.qoV;
    GMTrace.o(8212245905408L, 61186);
    return i * 2;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8212514340864L, 61188);
    super.onDraw(paramCanvas);
    int j = getHeight();
    int i = getWidth();
    this.qoV = ((int)(Math.min(j, i) / 2.0F * 0.8D));
    this.qoW.set((int)(i / 2.0F), (int)(j / 2.0F));
    if (this.qoO.qoA != null)
    {
      i = (int)(i / 2.0F);
      j = (int)(j / 2.0F);
      int k = (int)(this.qoV * 2 + this.qoO.qox * 2.0F);
      int m = this.qoO.qoA.getWidth() * k / this.qoO.qoA.getHeight();
      if (this.qoO.qoA != null) {
        paramCanvas.drawBitmap(Bitmap.createScaledBitmap(this.qoO.qoA, m, k, false), i - (m >>> 1), j - (k >>> 1), null);
      }
    }
    if (this.qoO.qoh) {
      switch (this.qoO.qog)
      {
      }
    }
    Object localObject;
    float f1;
    float f2;
    float f3;
    while (this.qoO.qoi)
    {
      this.qoZ = ap(1.0F);
      i = 0;
      while (i < this.qoK)
      {
        localObject = (PointF)this.qoZ.get(i);
        f1 = this.qoW.x;
        f2 = this.qoW.y;
        f3 = ((PointF)localObject).x;
        float f4 = ((PointF)localObject).y;
        localObject = new Paint();
        ((Paint)localObject).setColor(this.qoO.qon);
        ((Paint)localObject).setStrokeWidth(this.qoO.qoo);
        paramCanvas.drawLine(f1, f2, f3, f4, (Paint)localObject);
        i += 1;
      }
      paramCanvas.drawCircle(this.qoW.x, this.qoW.y, this.qoV, biF());
      continue;
      this.qoZ = ap(1.0F);
      i = 0;
      if (i < this.qoK)
      {
        localObject = (PointF)this.qoZ.get(i);
        if (i == 0) {
          this.mj.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
        for (;;)
        {
          i += 1;
          break;
          this.mj.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
      }
      this.mj.close();
      if ((this.qoO.backgroundColor != 0) && (this.qoO.qoA == null)) {
        paramCanvas.drawPath(this.mj, biF());
      }
    }
    if (this.qoO.qoh) {
      switch (this.qoO.qog)
      {
      }
    }
    for (;;)
    {
      if ((this.qoY != null) && (this.qoO.qok)) {
        if (this.qoY.length != this.qoK)
        {
          throw new RuntimeException("Labels array length not matches longitude lines number.");
          paramCanvas.drawCircle(this.qoW.x, this.qoW.y, this.qoV, biG());
          i = 1;
          while (i < this.qoL)
          {
            paramCanvas.drawCircle(this.qoW.x, this.qoW.y, this.qoV * (i * 1.0F / this.qoL), biH());
            i += 1;
          }
          paramCanvas.drawPath(this.mj, biG());
          this.mj.reset();
          i = 1;
          while (i < this.qoL)
          {
            this.qoZ = ap(i * 1.0F / this.qoL);
            j = 0;
            if (j < this.qoK)
            {
              localObject = (PointF)this.qoZ.get(j);
              if (j == 0) {
                this.mj.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
              for (;;)
              {
                f1 = ((PointF)localObject).x;
                f2 = ((PointF)localObject).y;
                f3 = this.qoO.qoz;
                localObject = new Paint();
                ((Paint)localObject).setColor(this.qoO.qoy);
                ((Paint)localObject).setStyle(Paint.Style.FILL);
                ((Paint)localObject).setAntiAlias(true);
                paramCanvas.drawCircle(f1, f2, f3, (Paint)localObject);
                j += 1;
                break;
                this.mj.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
            }
            this.mj.close();
            paramCanvas.drawPath(this.mj, biH());
            this.mj.reset();
            i += 1;
          }
        }
        else
        {
          i = 0;
          if (i < this.qoK)
          {
            localObject = this.qoY[i];
            if (!localObject.equals(null))
            {
              if ((i != 0) && (i != this.qoK >>> 1)) {
                break label1183;
              }
              f1 = 0.5F;
              label968:
              if (i != 0) {
                break label1209;
              }
              f2 = this.qoO.qos;
            }
          }
        }
      }
    }
    for (;;)
    {
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.setColor(this.qoO.qoq);
      localTextPaint.setTextSize(this.qoO.qor);
      localObject = new StaticLayout((CharSequence)localObject, localTextPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 0.0F, 0.0F, false);
      f1 = (float)(this.qoW.x - ((StaticLayout)localObject).getLineWidth(0) * f1 - (this.qoV + this.qoO.qos) * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.qoK));
      f2 = (float)(this.qoW.y - ((StaticLayout)localObject).getHeight() / 2 - (this.qoV + this.qoO.qos) * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.qoK) - f2);
      paramCanvas.save();
      paramCanvas.translate(f1, f2);
      ((StaticLayout)localObject).draw(paramCanvas);
      paramCanvas.restore();
      i += 1;
      break;
      label1183:
      if ((i > 0) && (i < this.qoK >>> 1))
      {
        f1 = 0.0F;
        break label968;
      }
      f1 = 1.0F;
      break label968;
      label1209:
      if (i == this.qoK >>> 1)
      {
        f2 = -this.qoO.qos;
        continue;
        GMTrace.o(8212514340864L, 61188);
      }
      else
      {
        f2 = 0.0F;
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    GMTrace.i(8213051211776L, 61192);
    this.qoO.backgroundColor = paramInt;
    invalidate();
    GMTrace.o(8213051211776L, 61192);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/RadarGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */