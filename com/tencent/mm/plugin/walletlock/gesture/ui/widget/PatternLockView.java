package com.tencent.mm.plugin.walletlock.gesture.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.a.c;
import com.tencent.mm.plugin.walletlock.a.h;
import com.tencent.mm.plugin.walletlock.gesture.a.f;
import com.tencent.mm.sdk.platformtools.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatternLockView
  extends View
{
  private static Bitmap sgm;
  private static Bitmap sgn;
  private static Bitmap sgo;
  private static Bitmap sgp;
  private int lys;
  private Paint sfW;
  private Paint sfX;
  private Path sfY;
  private Matrix sfZ;
  private Rect sga;
  private Rect sgb;
  private ArrayList<f> sgc;
  private boolean[][] sgd;
  private int sge;
  private int sgf;
  private int sgg;
  private float sgh;
  private boolean sgi;
  private boolean sgj;
  public boolean sgk;
  private b sgl;
  private float sgq;
  private float sgr;
  private boolean sgs;
  private long sgt;
  private float sgu;
  private float sgv;
  public a sgw;
  private int tx;
  private int ty;
  
  static
  {
    GMTrace.i(20226477391872L, 150699);
    sgm = null;
    sgn = null;
    sgo = null;
    sgp = null;
    GMTrace.o(20226477391872L, 150699);
  }
  
  public PatternLockView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20223658819584L, 150678);
    this.sfW = new Paint();
    this.sfX = new Paint();
    this.sfY = new Path();
    this.sfZ = new Matrix();
    this.sga = new Rect();
    this.sgb = new Rect();
    this.sgc = new ArrayList(9);
    this.sgd = ((boolean[][])Array.newInstance(Boolean.TYPE, new int[] { 3, 3 }));
    this.sge = c.sgE;
    this.sgf = 6;
    this.sgg = 200;
    this.sgh = 0.66F;
    this.sgi = false;
    this.sgj = true;
    this.sgk = false;
    int i;
    if (isInEditMode())
    {
      i = -1;
      this.lys = i;
      this.sgl = b.sgy;
      this.sgq = -1.0F;
      this.sgr = -1.0F;
      this.sgs = false;
      this.sgt = 0L;
      this.tx = 0;
      this.ty = 0;
      this.sgu = 0.0F;
      this.sgv = 0.0F;
      this.sgw = null;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.h.seM);
      this.sgj = paramContext.getBoolean(a.h.seR, this.sgj);
      this.sgg = paramContext.getInt(a.h.seO, this.sgg);
      this.sgf = paramContext.getInt(a.h.seP, this.sgf);
      this.sgi = paramContext.getBoolean(a.h.seN, this.sgi);
      switch (paramContext.getInt(a.h.seQ, this.sge - 1))
      {
      default: 
        this.sge = c.sgE;
      }
    }
    for (;;)
    {
      paramContext.recycle();
      setClickable(true);
      this.sfX.setStyle(Paint.Style.STROKE);
      this.sfX.setStrokeJoin(Paint.Join.ROUND);
      this.sfX.setStrokeCap(Paint.Cap.ROUND);
      this.sfX.setAntiAlias(true);
      this.sfX.setDither(false);
      this.sfX.setAlpha(this.sgg);
      this.sfW.setAntiAlias(true);
      this.sfW.setDither(true);
      if (isInEditMode()) {
        break label629;
      }
      if (sgm == null)
      {
        sgm = s(a.b(getContext(), a.c.sdC));
        paramContext = s(a.b(getContext(), a.c.sdD));
        sgn = paramContext;
        sgo = paramContext;
        sgp = s(a.b(getContext(), a.c.sdE));
      }
      this.sgf = ((int)(this.sgf * d.bMA().density));
      paramContext = sgm;
      paramAttributeSet = sgn;
      Bitmap localBitmap1 = sgo;
      Bitmap localBitmap2 = sgp;
      i = 0;
      while (i < 4)
      {
        Bitmap localBitmap3 = new Bitmap[] { paramContext, paramAttributeSet, localBitmap1, localBitmap2 }[i];
        this.tx = Math.max(localBitmap3.getWidth(), this.tx);
        this.ty = Math.max(localBitmap3.getHeight(), this.ty);
        i += 1;
      }
      i = getResources().getColor(a.b.sdy);
      break;
      this.sge = c.sgE;
      continue;
      this.sge = c.sgF;
    }
    label629:
    GMTrace.o(20223658819584L, 150678);
  }
  
  private f E(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(20225269432320L, 150690);
    Object localObject2 = null;
    float f1 = this.sgv;
    float f2 = f1 * this.sgh;
    float f3 = getPaddingTop();
    float f4 = (f1 - f2) / 2.0F;
    int i = 0;
    int j;
    label83:
    Object localObject1;
    if (i < 3)
    {
      float f5 = i * f1 + (f4 + f3);
      if ((paramFloat2 >= f5) && (paramFloat2 <= f5 + f2))
      {
        j = i;
        localObject1 = localObject2;
        if (j >= 0)
        {
          paramFloat2 = this.sgu;
          f1 = paramFloat2 * this.sgh;
          f2 = getPaddingLeft();
          f3 = (paramFloat2 - f1) / 2.0F;
          i = 0;
          label121:
          if (i >= 3) {
            break label292;
          }
          f4 = i * paramFloat2 + (f3 + f2);
          if ((paramFloat1 < f4) || (paramFloat1 > f4 + f1)) {
            break label283;
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (i >= 0)
      {
        localObject1 = localObject2;
        if (this.sgd[j][i] == 0) {
          localObject1 = f.dy(j, i);
        }
      }
      if (localObject1 == null) {
        break label298;
      }
      this.sgd[localObject1.sfr][localObject1.sfs] = 1;
      this.sgc.add(localObject1);
      if (this.sgw != null) {
        new ArrayList(this.sgc);
      }
      if (this.sgi) {
        performHapticFeedback(1, 3);
      }
      GMTrace.o(20225269432320L, 150690);
      return (f)localObject1;
      i += 1;
      break;
      j = -1;
      break label83;
      label283:
      i += 1;
      break label121;
      label292:
      i = -1;
    }
    label298:
    GMTrace.o(20225269432320L, 150690);
    return null;
  }
  
  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(20225135214592L, 150689);
    Bitmap localBitmap;
    if ((!paramBoolean) || ((!this.sgj) && (this.sgl != b.sgz))) {
      localBitmap = sgm;
    }
    for (;;)
    {
      int j = this.tx;
      int i = this.ty;
      float f1 = this.sgu;
      float f2 = this.sgv;
      j = (int)((f1 - j) * 0.5F);
      i = (int)((f2 - i) * 0.5F);
      f2 = getResources().getDisplayMetrics().density;
      f1 = Math.min((this.sgu - 33.0F * f2) / this.tx, 1.0F);
      f2 = Math.min((this.sgv - f2 * 33.0F) / this.ty, 1.0F);
      this.sfZ.setTranslate(j + paramInt1, i + paramInt2);
      this.sfZ.preTranslate(this.tx / 2, this.ty / 2);
      this.sfZ.preScale(f1, f2);
      this.sfZ.preTranslate(-this.tx / 2, -this.ty / 2);
      if (!isInEditMode()) {
        paramCanvas.drawBitmap(localBitmap, this.sfZ, this.sfW);
      }
      GMTrace.o(20225135214592L, 150689);
      return;
      if (this.sgs)
      {
        localBitmap = sgn;
      }
      else if (this.sgl == b.sgz)
      {
        localBitmap = sgp;
      }
      else
      {
        if ((this.sgl != b.sgy) && (this.sgl != b.sgA)) {
          break;
        }
        localBitmap = sgo;
      }
    }
    throw new IllegalStateException("unknown display mode " + this.sgl);
  }
  
  private void a(b paramb, List<f> paramList)
  {
    GMTrace.i(20225940520960L, 150695);
    this.sgc.clear();
    bza();
    this.sgc.addAll(paramList);
    paramList = this.sgc.iterator();
    while (paramList.hasNext())
    {
      f localf = (f)paramList.next();
      this.sgd[localf.sfr][localf.sfs] = 1;
    }
    a(paramb);
    GMTrace.o(20225940520960L, 150695);
  }
  
  private static String bL(List<f> paramList)
  {
    GMTrace.i(20223927255040L, 150680);
    if (paramList == null) {
      throw new IllegalArgumentException("pattern is null");
    }
    int j = paramList.size();
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    while (i < j)
    {
      f localf = (f)paramList.get(i);
      int k = localf.sfr;
      arrayOfByte[i] = ((byte)(localf.sfs + k * 3));
      i += 1;
    }
    paramList = new String(arrayOfByte);
    GMTrace.o(20223927255040L, 150680);
    return paramList;
  }
  
  private void bza()
  {
    GMTrace.i(20225537867776L, 150692);
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        this.sgd[i][j] = 0;
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(20225537867776L, 150692);
  }
  
  private void bzb()
  {
    GMTrace.i(20226074738688L, 150696);
    this.sgc.clear();
    bza();
    this.sgl = b.sgy;
    invalidate();
    GMTrace.o(20226074738688L, 150696);
  }
  
  private static int dz(int paramInt1, int paramInt2)
  {
    GMTrace.i(20224732561408L, 150686);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = paramInt2;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    }
    for (i = j;; i = Math.max(j, paramInt2))
    {
      GMTrace.o(20224732561408L, 150686);
      return i;
    }
  }
  
  private static Bitmap s(Drawable paramDrawable)
  {
    GMTrace.i(20223793037312L, 150679);
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1) {}
    for (Object localObject = Bitmap.Config.ARGB_8888;; localObject = Bitmap.Config.RGB_565)
    {
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new Canvas((Bitmap)localObject);
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.draw(localCanvas);
      GMTrace.o(20223793037312L, 150679);
      return (Bitmap)localObject;
    }
  }
  
  private float wN(int paramInt)
  {
    GMTrace.i(20225672085504L, 150693);
    float f1 = getPaddingLeft();
    float f2 = paramInt;
    float f3 = this.sgu;
    float f4 = this.sgu;
    GMTrace.o(20225672085504L, 150693);
    return f1 + f2 * f3 + f4 * 0.5F;
  }
  
  private float wO(int paramInt)
  {
    GMTrace.i(20225806303232L, 150694);
    float f1 = getPaddingTop();
    float f2 = paramInt;
    float f3 = this.sgv;
    float f4 = this.sgv;
    GMTrace.o(20225806303232L, 150694);
    return f1 + f2 * f3 + f4 * 0.5F;
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(20226343174144L, 150698);
    switch (1.sgx[paramb.ordinal()])
    {
    }
    for (;;)
    {
      this.sgl = paramb;
      invalidate();
      GMTrace.o(20226343174144L, 150698);
      return;
      this.lys = getResources().getColor(a.b.sdy);
      continue;
      this.lys = getResources().getColor(a.b.sdB);
      continue;
      if (this.sgc.size() == 0) {
        throw new IllegalStateException("You should set a pattern before animating.");
      }
      this.sgk = false;
      this.lys = getResources().getColor(a.b.sdy);
      f localf = (f)this.sgc.get(0);
      this.sgq = wN(localf.sfs);
      this.sgr = wO(localf.sfr);
      bza();
      this.sgt = SystemClock.elapsedRealtime();
    }
  }
  
  public final void bzc()
  {
    GMTrace.i(20226208956416L, 150697);
    bzb();
    if (this.sgw != null) {
      this.sgw.a(this);
    }
    GMTrace.o(20226208956416L, 150697);
  }
  
  protected int getSuggestedMinimumHeight()
  {
    GMTrace.i(20224464125952L, 150684);
    float f = getResources().getDisplayMetrics().density;
    int i = (int)(3.0D * this.ty / f);
    GMTrace.o(20224464125952L, 150684);
    return i;
  }
  
  protected int getSuggestedMinimumWidth()
  {
    GMTrace.i(20224329908224L, 150683);
    float f = getResources().getDisplayMetrics().density;
    int i = (int)(3.0D * this.tx / f);
    GMTrace.o(20224329908224L, 150683);
    return i;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(20225000996864L, 150688);
    ArrayList localArrayList = this.sgc;
    int m = localArrayList.size();
    boolean[][] arrayOfBoolean = this.sgd;
    int j;
    int k;
    Object localObject;
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    label301:
    int n;
    int i1;
    boolean bool;
    if (this.sgl == b.sgA)
    {
      j = (int)(SystemClock.elapsedRealtime() - this.sgt) % ((m + 1) * 700);
      k = j / 700;
      bza();
      i = 0;
      while (i < k)
      {
        localObject = (f)localArrayList.get(i);
        arrayOfBoolean[localObject.sfr][localObject.sfs] = 1;
        i += 1;
      }
      if ((k > 0) && (k < m))
      {
        i = 1;
        if (i != 0)
        {
          f1 = j % 700 / 700.0F;
          localObject = (f)localArrayList.get(k - 1);
          f2 = wN(((f)localObject).sfs);
          f3 = wO(((f)localObject).sfr);
          localObject = (f)localArrayList.get(k);
          f4 = wN(((f)localObject).sfs);
          f5 = wO(((f)localObject).sfr);
          this.sgq = (f2 + (f4 - f2) * f1);
          this.sgr = ((f5 - f3) * f1 + f3);
        }
        invalidate();
      }
    }
    else
    {
      this.sfX.setColor(this.lys);
      this.sfX.setStrokeWidth(this.sgf);
      localObject = this.sfY;
      ((Path)localObject).rewind();
      if ((!this.sgj) && (this.sgl != b.sgz)) {
        break label439;
      }
      i = 1;
      n = getPaddingTop();
      i1 = getPaddingLeft();
      f1 = this.sgu;
      f2 = this.sgv;
      if ((this.sfW.getFlags() & 0x2) == 0) {
        break label445;
      }
      bool = true;
      label338:
      this.sfW.setFilterBitmap(true);
      j = 0;
    }
    float f6;
    for (;;)
    {
      if (j >= 3) {
        break label460;
      }
      f3 = n;
      f4 = j;
      k = 0;
      for (;;)
      {
        if (k < 3)
        {
          f5 = i1;
          f6 = k;
          if (arrayOfBoolean[j][k] == 0) {
            a(paramCanvas, (int)(f5 + f6 * f1), (int)(f4 * f2 + f3), arrayOfBoolean[j][k]);
          }
          k += 1;
          continue;
          i = 0;
          break;
          label439:
          i = 0;
          break label301;
          label445:
          bool = false;
          break label338;
        }
      }
      j += 1;
    }
    label460:
    if (i != 0)
    {
      j = 0;
      i = 0;
      if (i < m)
      {
        f localf = (f)localArrayList.get(i);
        if (arrayOfBoolean[localf.sfr][localf.sfs] != 0)
        {
          j = 1;
          f3 = wN(localf.sfs);
          f4 = wO(localf.sfr);
          if (i == 0) {
            ((Path)localObject).moveTo(f3, f4);
          }
          for (;;)
          {
            i += 1;
            break;
            ((Path)localObject).lineTo(f3, f4);
          }
        }
      }
      if (((this.sgs) || (this.sgl == b.sgA)) && (j != 0)) {
        ((Path)localObject).lineTo(this.sgq, this.sgr);
      }
      paramCanvas.drawPath((Path)localObject, this.sfX);
    }
    int i = 0;
    while (i < 3)
    {
      f3 = n;
      f4 = i;
      j = 0;
      while (j < 3)
      {
        f5 = i1;
        f6 = j;
        if (arrayOfBoolean[i][j] != 0) {
          a(paramCanvas, (int)(f5 + f6 * f1), (int)(f4 * f2 + f3), arrayOfBoolean[i][j]);
        }
        j += 1;
      }
      i += 1;
    }
    this.sfW.setFilterBitmap(bool);
    GMTrace.o(20225000996864L, 150688);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(20224866779136L, 150687);
    int i = getSuggestedMinimumWidth();
    int j = getSuggestedMinimumHeight();
    i = dz(paramInt1, i);
    j = dz(paramInt2, j);
    paramInt2 = j;
    paramInt1 = i;
    if (this.sge == c.sgE)
    {
      paramInt2 = Math.min(i, j);
      paramInt1 = paramInt2;
    }
    setMeasuredDimension(paramInt1, paramInt2);
    GMTrace.o(20224866779136L, 150687);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(20224195690496L, 150682);
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    b localb = b.sgy;
    Object localObject = paramParcelable.sgC;
    if (localObject == null) {
      throw new IllegalArgumentException("Serialized pattern is null");
    }
    ArrayList localArrayList = new ArrayList();
    localObject = ((String)localObject).getBytes();
    int i = 0;
    while (i < localObject.length)
    {
      int j = localObject[i];
      localArrayList.add(f.dy(j / 3, j % 3));
      i += 1;
    }
    a(localb, localArrayList);
    this.sgl = b.values()[paramParcelable.sgD];
    this.sgj = paramParcelable.sgj;
    this.sgk = paramParcelable.sgk;
    this.sgi = paramParcelable.sgi;
    GMTrace.o(20224195690496L, 150682);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    GMTrace.i(20224061472768L, 150681);
    SavedState localSavedState = new SavedState(super.onSaveInstanceState(), bL(this.sgc), this.sgl.ordinal(), this.sgj, this.sgk, this.sgi);
    GMTrace.o(20224061472768L, 150681);
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20224598343680L, 150685);
    this.sgu = ((paramInt1 - getPaddingLeft() - getPaddingRight()) / 3.0F);
    this.sgv = ((paramInt2 - getPaddingTop() - getPaddingBottom()) / 3.0F);
    GMTrace.o(20224598343680L, 150685);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20225403650048L, 150691);
    if ((!this.sgk) || (!isEnabled()))
    {
      GMTrace.o(20225403650048L, 150691);
      return false;
    }
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    float f6;
    int j;
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
      GMTrace.o(20225403650048L, 150691);
      return false;
    case 0: 
      bzb();
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      paramMotionEvent = E(f1, f2);
      if (paramMotionEvent != null)
      {
        this.sgs = true;
        this.sgl = b.sgy;
        if (this.sgw == null) {}
      }
      for (;;)
      {
        if (paramMotionEvent != null)
        {
          f3 = wN(paramMotionEvent.sfs);
          f4 = wO(paramMotionEvent.sfr);
          f5 = this.sgu * 0.5F;
          f6 = this.sgv * 0.5F;
          invalidate((int)(f3 - f5), (int)(f4 - f6), (int)(f3 + f5), (int)(f4 + f6));
        }
        this.sgq = f1;
        this.sgr = f2;
        GMTrace.o(20225403650048L, 150691);
        return true;
        this.sgs = false;
      }
    case 1: 
      if (!this.sgc.isEmpty())
      {
        this.sgs = false;
        if (this.sgw != null) {
          this.sgw.a(this, new ArrayList(this.sgc));
        }
        invalidate();
      }
      GMTrace.o(20225403650048L, 150691);
      return true;
    case 2: 
      float f7 = this.sgf;
      int k = paramMotionEvent.getHistorySize();
      this.sga.setEmpty();
      j = 0;
      i = 0;
      if (i < k + 1) {
        if (i < k)
        {
          f1 = paramMotionEvent.getHistoricalX(i);
          label331:
          if (i >= k) {
            break label643;
          }
          f2 = paramMotionEvent.getHistoricalY(i);
          label345:
          f localf1 = E(f1, f2);
          int m = this.sgc.size();
          if ((localf1 != null) && (m == 1)) {
            this.sgs = true;
          }
          f3 = Math.abs(f1 - this.sgq);
          f4 = Math.abs(f2 - this.sgr);
          if ((f3 > 0.0F) || (f4 > 0.0F)) {
            j = 1;
          }
          if ((this.sgs) && (m > 0))
          {
            f localf2 = (f)this.sgc.get(m - 1);
            f3 = wN(localf2.sfs);
            f6 = wO(localf2.sfr);
            f5 = Math.min(f3, f1) - f7;
            f4 = Math.max(f3, f1) + f7;
            f3 = Math.min(f6, f2) - f7;
            f6 = Math.max(f6, f2) + f7;
            if (localf1 == null) {
              break label931;
            }
            f2 = this.sgu * 0.5F;
            float f8 = this.sgv * 0.5F;
            float f10 = wN(localf1.sfs);
            float f9 = wO(localf1.sfr);
            f1 = Math.min(f10 - f2, f5);
            f4 = Math.max(f2 + f10, f4);
            f2 = Math.min(f9 - f8, f3);
            f3 = Math.max(f9 + f8, f6);
          }
        }
      }
      break;
    }
    for (;;)
    {
      this.sga.union(Math.round(f1), Math.round(f2), Math.round(f4), Math.round(f3));
      i += 1;
      break;
      f1 = paramMotionEvent.getX();
      break label331;
      label643:
      f2 = paramMotionEvent.getY();
      break label345;
      this.sgq = paramMotionEvent.getX();
      if (this.sgq < getPaddingLeft() + this.sgf)
      {
        this.sgq = (getPaddingLeft() + this.sgf);
        this.sgr = paramMotionEvent.getY();
        if (this.sgr >= getPaddingTop() + this.sgf) {
          break label832;
        }
        this.sgr = (getPaddingTop() + this.sgf);
      }
      for (;;)
      {
        if (j != 0)
        {
          this.sgb.union(this.sga);
          invalidate(this.sgb);
          this.sgb.set(this.sga);
        }
        GMTrace.o(20225403650048L, 150691);
        return true;
        if (this.sgq <= getPaddingLeft() + getWidth() - getPaddingRight() - this.sgf) {
          break;
        }
        this.sgq = (getPaddingLeft() + getWidth() - getPaddingRight() - this.sgf);
        break;
        label832:
        if (this.sgr > getPaddingTop() + getHeight() - getPaddingRight() - this.sgf) {
          this.sgr = (getPaddingTop() + getHeight() - getPaddingBottom() - this.sgf);
        }
      }
      if (this.sgs)
      {
        this.sgs = false;
        bzb();
        if (this.sgw != null) {
          this.sgw.a(this);
        }
      }
      GMTrace.o(20225403650048L, 150691);
      return true;
      label931:
      f2 = f3;
      f3 = f6;
      f1 = f5;
    }
  }
  
  private static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    String sgC;
    int sgD;
    boolean sgi;
    boolean sgj;
    boolean sgk;
    
    static
    {
      GMTrace.i(20227685351424L, 150708);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20227685351424L, 150708);
    }
    
    public SavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(20227282698240L, 150705);
      this.sgC = paramParcel.readString();
      this.sgD = paramParcel.readInt();
      this.sgj = ((Boolean)paramParcel.readValue(null)).booleanValue();
      this.sgk = ((Boolean)paramParcel.readValue(null)).booleanValue();
      this.sgi = ((Boolean)paramParcel.readValue(null)).booleanValue();
      GMTrace.o(20227282698240L, 150705);
    }
    
    public SavedState(Parcelable paramParcelable, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      super();
      GMTrace.i(20227416915968L, 150706);
      this.sgC = paramString;
      this.sgD = paramInt;
      this.sgj = paramBoolean1;
      this.sgk = paramBoolean2;
      this.sgi = paramBoolean3;
      GMTrace.o(20227416915968L, 150706);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20227551133696L, 150707);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.sgC);
      paramParcel.writeInt(this.sgD);
      paramParcel.writeValue(Boolean.valueOf(this.sgj));
      paramParcel.writeValue(Boolean.valueOf(this.sgk));
      paramParcel.writeValue(Boolean.valueOf(this.sgi));
      GMTrace.o(20227551133696L, 150707);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(PatternLockView paramPatternLockView);
    
    public abstract void a(PatternLockView paramPatternLockView, List<f> paramList);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(20227148480512L, 150704);
      sgy = new b("Correct", 0);
      sgz = new b("Wrong", 1);
      sgA = new b("Animate", 2);
      sgB = new b[] { sgy, sgz, sgA };
      GMTrace.o(20227148480512L, 150704);
    }
    
    private b()
    {
      GMTrace.i(20227014262784L, 150703);
      GMTrace.o(20227014262784L, 150703);
    }
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(20226611609600L, 150700);
      sgE = 1;
      sgF = 2;
      sgG = new int[] { sgE, sgF };
      GMTrace.o(20226611609600L, 150700);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */