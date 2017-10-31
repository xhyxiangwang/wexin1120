package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.l;

public class CircularImageView
  extends ImageView
{
  private static final String TAG;
  private Paint khx;
  private boolean mPc;
  private int nSB;
  private boolean qtG;
  private boolean qtH;
  private int qtI;
  private int qtJ;
  private boolean qtK;
  private float qtL;
  private float qtM;
  private float qtN;
  private BitmapShader qtO;
  private Bitmap qtP;
  private Paint qtQ;
  private Paint qtR;
  private ColorFilter qtS;
  private int shadowColor;
  
  static
  {
    GMTrace.i(8217480396800L, 61225);
    TAG = CircularImageView.class.getSimpleName();
    GMTrace.o(8217480396800L, 61225);
  }
  
  public CircularImageView(Context paramContext)
  {
    this(paramContext, null, i.l.pUy);
    GMTrace.i(8215735566336L, 61212);
    GMTrace.o(8215735566336L, 61212);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i.l.pUy);
    GMTrace.i(8215869784064L, 61213);
    GMTrace.o(8215869784064L, 61213);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8216004001792L, 61214);
    this.khx = new Paint();
    this.khx.setAntiAlias(true);
    this.qtQ = new Paint();
    this.qtQ.setAntiAlias(true);
    this.qtQ.setStyle(Paint.Style.STROKE);
    this.qtR = new Paint();
    this.qtR.setAntiAlias(true);
    if (Build.VERSION.SDK_INT >= 11) {
      setLayerType(1, null);
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.l.pUw, paramInt, 0);
    this.qtG = paramAttributeSet.getBoolean(i.l.pUz, false);
    this.qtH = paramAttributeSet.getBoolean(i.l.pUC, false);
    this.qtK = paramAttributeSet.getBoolean(i.l.pUG, false);
    if (this.qtG)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      paramInt = paramAttributeSet.getDimensionPixelOffset(i.l.pUB, paramInt);
      this.nSB = paramInt;
      if (this.qtQ != null) {
        this.qtQ.setStrokeWidth(paramInt);
      }
      requestLayout();
      invalidate();
      paramInt = paramAttributeSet.getColor(i.l.pUA, -1);
      if (this.qtQ != null) {
        this.qtQ.setColor(paramInt);
      }
      invalidate();
    }
    if (this.qtH)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      this.qtS = new PorterDuffColorFilter(paramAttributeSet.getColor(i.l.pUD, 0), PorterDuff.Mode.SRC_ATOP);
      invalidate();
      this.qtJ = paramAttributeSet.getDimensionPixelOffset(i.l.pUF, paramInt);
      requestLayout();
      invalidate();
      paramInt = paramAttributeSet.getColor(i.l.pUE, -16776961);
      if (this.qtR != null) {
        this.qtR.setColor(paramInt);
      }
      invalidate();
    }
    if (this.qtK)
    {
      this.qtL = paramAttributeSet.getFloat(i.l.pUK, 4.0F);
      this.qtM = paramAttributeSet.getFloat(i.l.pUI, 0.0F);
      this.qtN = paramAttributeSet.getFloat(i.l.pUJ, 2.0F);
      this.shadowColor = paramAttributeSet.getColor(i.l.pUH, -16777216);
      this.qtK = true;
      if (this.qtK) {
        f = this.qtL;
      }
      this.qtQ.setShadowLayer(f, this.qtM, this.qtN, this.shadowColor);
      this.qtR.setShadowLayer(f, this.qtM, this.qtN, this.shadowColor);
    }
    paramAttributeSet.recycle();
    GMTrace.o(8216004001792L, 61214);
  }
  
  private void bjB()
  {
    GMTrace.i(8217211961344L, 61223);
    if (this.qtP == null)
    {
      GMTrace.o(8217211961344L, 61223);
      return;
    }
    this.qtO = new BitmapShader(this.qtP, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    if ((this.qtI != this.qtP.getWidth()) || (this.qtI != this.qtP.getHeight()))
    {
      Matrix localMatrix = new Matrix();
      float f = this.qtI / this.qtP.getWidth();
      localMatrix.setScale(f, f);
      this.qtO.setLocalMatrix(localMatrix);
    }
    GMTrace.o(8217211961344L, 61223);
  }
  
  private static Bitmap r(Drawable paramDrawable)
  {
    GMTrace.i(8217077743616L, 61222);
    if (paramDrawable == null)
    {
      GMTrace.o(8217077743616L, 61222);
      return null;
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      GMTrace.o(8217077743616L, 61222);
      return paramDrawable;
    }
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if ((i <= 0) || (j <= 0))
    {
      GMTrace.o(8217077743616L, 61222);
      return null;
    }
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      paramDrawable.draw(localCanvas);
      GMTrace.o(8217077743616L, 61222);
      return localBitmap;
    }
    catch (OutOfMemoryError paramDrawable)
    {
      GMTrace.o(8217077743616L, 61222);
    }
    return null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8216272437248L, 61216);
    boolean bool;
    if (!isClickable())
    {
      this.mPc = false;
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(8216272437248L, 61216);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      invalidate();
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(8216272437248L, 61216);
      return bool;
      this.mPc = true;
      continue;
      this.mPc = false;
    }
  }
  
  public boolean isSelected()
  {
    GMTrace.i(8217346179072L, 61224);
    boolean bool = this.mPc;
    GMTrace.o(8217346179072L, 61224);
    return bool;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int j = 0;
    GMTrace.i(8216138219520L, 61215);
    if (this.qtP == null)
    {
      GMTrace.o(8216138219520L, 61215);
      return;
    }
    if ((this.qtP.getHeight() == 0) || (this.qtP.getWidth() == 0))
    {
      GMTrace.o(8216138219520L, 61215);
      return;
    }
    int k = this.qtI;
    int i;
    if (getWidth() < getHeight())
    {
      i = getWidth();
      this.qtI = i;
      if (k != this.qtI) {
        bjB();
      }
      this.khx.setShader(this.qtO);
      i = this.qtI / 2;
      if ((!this.qtH) || (!this.mPc)) {
        break label236;
      }
      j = this.qtJ;
      i = (this.qtI - j * 2) / 2;
      this.khx.setColorFilter(this.qtS);
      paramCanvas.drawCircle(i + j, i + j, (this.qtI - j * 2) / 2 + j - 4.0F, this.qtR);
    }
    for (;;)
    {
      paramCanvas.drawCircle(i + j, i + j, (this.qtI - j * 2) / 2, this.khx);
      GMTrace.o(8216138219520L, 61215);
      return;
      i = getHeight();
      break;
      label236:
      if (this.qtG)
      {
        j = this.nSB;
        i = (this.qtI - j * 2) / 2;
        this.khx.setColorFilter(null);
        paramCanvas.drawArc(new RectF(j / 2 + 0, j / 2 + 0, this.qtI - j / 2, this.qtI - j / 2), 360.0F, 360.0F, false, this.qtQ);
      }
      else
      {
        this.khx.setColorFilter(null);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8216943525888L, 61221);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824)
    {
      i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (i != 1073741824) {
        break label76;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2 + 2);
      GMTrace.o(8216943525888L, 61221);
      return;
      if (i == Integer.MIN_VALUE) {
        break;
      }
      paramInt1 = this.qtI;
      break;
      label76:
      if (i != Integer.MIN_VALUE) {
        paramInt2 = this.qtI;
      }
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(8216809308160L, 61220);
    super.setImageBitmap(paramBitmap);
    this.qtP = paramBitmap;
    if (this.qtI > 0) {
      bjB();
    }
    GMTrace.o(8216809308160L, 61220);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(8216675090432L, 61219);
    super.setImageDrawable(paramDrawable);
    this.qtP = r(getDrawable());
    if (this.qtI > 0) {
      bjB();
    }
    GMTrace.o(8216675090432L, 61219);
  }
  
  public void setImageResource(int paramInt)
  {
    GMTrace.i(8216540872704L, 61218);
    super.setImageResource(paramInt);
    this.qtP = r(getDrawable());
    if (this.qtI > 0) {
      bjB();
    }
    GMTrace.o(8216540872704L, 61218);
  }
  
  public void setImageURI(Uri paramUri)
  {
    GMTrace.i(8216406654976L, 61217);
    super.setImageURI(paramUri);
    this.qtP = r(getDrawable());
    if (this.qtI > 0) {
      bjB();
    }
    GMTrace.o(8216406654976L, 61217);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/CircularImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */