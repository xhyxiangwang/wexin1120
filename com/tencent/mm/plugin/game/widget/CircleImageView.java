package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.n;

public class CircleImageView
  extends ImageView
{
  private static final Bitmap.Config hah;
  private static final ImageView.ScaleType mRS;
  private int hc;
  private ColorFilter lC;
  private Bitmap mBitmap;
  private final RectF mRT;
  private final RectF mRU;
  private final Paint mRV;
  private final Paint mRW;
  private int mRX;
  private float mRY;
  private float mRZ;
  private boolean mSa;
  private boolean mSb;
  private boolean mSc;
  private BitmapShader tr;
  private final Matrix ts;
  private int tx;
  private int ty;
  
  static
  {
    GMTrace.i(12582240911360L, 93745);
    mRS = ImageView.ScaleType.CENTER_CROP;
    hah = Bitmap.Config.ARGB_8888;
    GMTrace.o(12582240911360L, 93745);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12580361863168L, 93731);
    GMTrace.o(12580361863168L, 93731);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12580496080896L, 93732);
    this.mRT = new RectF();
    this.mRU = new RectF();
    this.ts = new Matrix();
    this.mRV = new Paint();
    this.mRW = new Paint();
    this.mRX = -16777216;
    this.hc = 0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.fdV, paramInt, 0);
    this.hc = paramContext.getDimensionPixelSize(R.n.fdY, 0);
    this.mRX = paramContext.getColor(R.n.fdW, -16777216);
    this.mSc = paramContext.getBoolean(R.n.fdX, false);
    paramContext.recycle();
    super.setScaleType(mRS);
    this.mSa = true;
    if (this.mSb)
    {
      setup();
      this.mSb = false;
    }
    GMTrace.o(12580496080896L, 93732);
  }
  
  private static Bitmap p(Drawable paramDrawable)
  {
    GMTrace.i(12581972475904L, 93743);
    if (paramDrawable == null)
    {
      GMTrace.o(12581972475904L, 93743);
      return null;
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      GMTrace.o(12581972475904L, 93743);
      return paramDrawable;
    }
    try
    {
      if ((paramDrawable instanceof ColorDrawable)) {}
      for (Bitmap localBitmap = Bitmap.createBitmap(2, 2, hah);; localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), hah))
      {
        Canvas localCanvas = new Canvas(localBitmap);
        paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
        paramDrawable.draw(localCanvas);
        GMTrace.o(12581972475904L, 93743);
        return localBitmap;
      }
      return null;
    }
    catch (OutOfMemoryError paramDrawable)
    {
      GMTrace.o(12581972475904L, 93743);
    }
  }
  
  private void setup()
  {
    float f2 = 0.0F;
    GMTrace.i(12582106693632L, 93744);
    if (!this.mSa)
    {
      this.mSb = true;
      GMTrace.o(12582106693632L, 93744);
      return;
    }
    if (this.mBitmap == null)
    {
      GMTrace.o(12582106693632L, 93744);
      return;
    }
    this.tr = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.mRV.setAntiAlias(true);
    this.mRV.setShader(this.tr);
    this.mRW.setStyle(Paint.Style.STROKE);
    this.mRW.setAntiAlias(true);
    this.mRW.setColor(this.mRX);
    this.mRW.setStrokeWidth(this.hc);
    this.ty = this.mBitmap.getHeight();
    this.tx = this.mBitmap.getWidth();
    this.mRU.set(0.0F, 0.0F, getWidth(), getHeight());
    this.mRZ = Math.min((this.mRU.height() - this.hc) / 2.0F, (this.mRU.width() - this.hc) / 2.0F);
    this.mRT.set(this.mRU);
    if (!this.mSc) {
      this.mRT.inset(this.hc, this.hc);
    }
    this.mRY = Math.min(this.mRT.height() / 2.0F, this.mRT.width() / 2.0F);
    this.ts.set(null);
    float f1;
    float f3;
    if (this.tx * this.mRT.height() > this.mRT.width() * this.ty)
    {
      f1 = this.mRT.height() / this.ty;
      f3 = (this.mRT.width() - this.tx * f1) * 0.5F;
    }
    for (;;)
    {
      this.ts.setScale(f1, f1);
      this.ts.postTranslate((int)(f3 + 0.5F) + this.mRT.left, (int)(f2 + 0.5F) + this.mRT.top);
      this.tr.setLocalMatrix(this.ts);
      invalidate();
      GMTrace.o(12582106693632L, 93744);
      return;
      f1 = this.mRT.width() / this.tx;
      f2 = this.mRT.height();
      float f4 = this.ty;
      f3 = 0.0F;
      f2 = (f2 - f4 * f1) * 0.5F;
    }
  }
  
  public ImageView.ScaleType getScaleType()
  {
    GMTrace.i(12580630298624L, 93733);
    ImageView.ScaleType localScaleType = mRS;
    GMTrace.o(12580630298624L, 93733);
    return localScaleType;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(12581032951808L, 93736);
    if (getDrawable() == null)
    {
      GMTrace.o(12581032951808L, 93736);
      return;
    }
    paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mRY, this.mRV);
    if (this.hc != 0) {
      paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mRZ, this.mRW);
    }
    GMTrace.o(12581032951808L, 93736);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12581167169536L, 93737);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    setup();
    GMTrace.o(12581167169536L, 93737);
  }
  
  public void setAdjustViewBounds(boolean paramBoolean)
  {
    GMTrace.i(12580898734080L, 93735);
    if (paramBoolean) {
      throw new IllegalArgumentException("adjustViewBounds not supported.");
    }
    GMTrace.o(12580898734080L, 93735);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(12581838258176L, 93742);
    if (paramColorFilter == this.lC)
    {
      GMTrace.o(12581838258176L, 93742);
      return;
    }
    this.lC = paramColorFilter;
    this.mRV.setColorFilter(this.lC);
    invalidate();
    GMTrace.o(12581838258176L, 93742);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(12581301387264L, 93738);
    super.setImageBitmap(paramBitmap);
    this.mBitmap = paramBitmap;
    setup();
    GMTrace.o(12581301387264L, 93738);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(12581435604992L, 93739);
    super.setImageDrawable(paramDrawable);
    this.mBitmap = p(paramDrawable);
    setup();
    GMTrace.o(12581435604992L, 93739);
  }
  
  public void setImageResource(int paramInt)
  {
    GMTrace.i(12581569822720L, 93740);
    super.setImageResource(paramInt);
    this.mBitmap = p(getDrawable());
    setup();
    GMTrace.o(12581569822720L, 93740);
  }
  
  public void setImageURI(Uri paramUri)
  {
    GMTrace.i(12581704040448L, 93741);
    super.setImageURI(paramUri);
    this.mBitmap = p(getDrawable());
    setup();
    GMTrace.o(12581704040448L, 93741);
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    GMTrace.i(12580764516352L, 93734);
    if (paramScaleType != mRS) {
      throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] { paramScaleType }));
    }
    GMTrace.o(12580764516352L, 93734);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/widget/CircleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */