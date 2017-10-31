package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.bq.a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class FontChooserView
  extends View
{
  private static SoftReference<Bitmap> puO;
  private int hWK;
  private float kgp;
  private float mHQ;
  private int ofK;
  private List<b> puP;
  private int puQ;
  private int puR;
  private int puS;
  private int puT;
  public int puV;
  private boolean puY;
  private boolean puZ;
  public a sBM;
  private int topOffset;
  
  static
  {
    GMTrace.i(12097312260096L, 90132);
    puO = null;
    GMTrace.o(12097312260096L, 90132);
  }
  
  public FontChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12096372736000L, 90125);
    this.puP = new ArrayList(4);
    this.puQ = 0;
    this.topOffset = 0;
    this.ofK = 0;
    this.hWK = 0;
    this.mHQ = 0.0F;
    this.kgp = 0.0F;
    this.puR = 0;
    this.puS = 0;
    this.puT = 0;
    this.puV = 0;
    this.sBM = null;
    this.puY = false;
    this.puZ = false;
    GMTrace.o(12096372736000L, 90125);
  }
  
  public FontChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12096506953728L, 90126);
    this.puP = new ArrayList(4);
    this.puQ = 0;
    this.topOffset = 0;
    this.ofK = 0;
    this.hWK = 0;
    this.mHQ = 0.0F;
    this.kgp = 0.0F;
    this.puR = 0;
    this.puS = 0;
    this.puT = 0;
    this.puV = 0;
    this.sBM = null;
    this.puY = false;
    this.puZ = false;
    GMTrace.o(12096506953728L, 90126);
  }
  
  private void bdg()
  {
    GMTrace.i(12096775389184L, 90128);
    if ((puO == null) || (puO.get() == null)) {
      puO = new SoftReference(BitmapFactory.decodeResource(getResources(), R.g.aYO));
    }
    GMTrace.o(12096775389184L, 90128);
  }
  
  private static int xR(int paramInt)
  {
    GMTrace.i(12097178042368L, 90131);
    Paint localPaint = new Paint();
    localPaint.setTextSize(paramInt);
    localPaint.setAntiAlias(true);
    paramInt = (int)Math.ceil(localPaint.getFontMetrics().bottom);
    GMTrace.o(12097178042368L, 90131);
    return paramInt;
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(12096909606912L, 90129);
    super.onDraw(paramCanvas);
    bdg();
    Object localObject = new Paint();
    ((Paint)localObject).setARGB(255, 152, 152, 152);
    ((Paint)localObject).setStrokeWidth(2.0F);
    int i = getWidth();
    int j = a.fromDPToPix(getContext(), 5);
    paramCanvas.drawLine(this.puQ, this.ofK, i - this.puQ, this.ofK, (Paint)localObject);
    i = 0;
    while (i < 4)
    {
      paramCanvas.drawLine(this.puQ + this.hWK * i, this.ofK - j, this.puQ + this.hWK * i, this.ofK + j, (Paint)localObject);
      i += 1;
    }
    localObject = (Bitmap)puO.get();
    paramCanvas.drawBitmap((Bitmap)localObject, this.puS, this.puT, null);
    String str1 = getResources().getString(R.l.fbe);
    String str2 = getResources().getString(R.l.fbf);
    String str3 = getResources().getString(R.l.fbc);
    String str4 = getResources().getString(R.l.fbd);
    j = getResources().getDimensionPixelSize(R.f.aTT);
    Paint localPaint = new Paint();
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str1);
    j = xR(j);
    localPaint.setColor(getResources().getColor(R.e.aQP));
    localPaint.setAntiAlias(true);
    paramCanvas.drawText(str1, this.puQ - i / 2, this.ofK - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    j = getResources().getDimensionPixelSize(R.f.aTU);
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str2);
    j = xR(j);
    paramCanvas.drawText(str2, this.puQ + this.hWK * 1 - i / 2, this.ofK - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    j = getResources().getDimensionPixelSize(R.f.aTR);
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str3);
    j = xR(j);
    paramCanvas.drawText(str3, this.puQ + this.hWK * 2 - i / 2, this.ofK - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    j = getResources().getDimensionPixelSize(R.f.aTS);
    localPaint.setTextSize(j);
    i = (int)localPaint.measureText(str4);
    j = xR(j);
    paramCanvas.drawText(str4, this.puQ + this.hWK * 3 - i / 2, this.ofK - j - ((Bitmap)localObject).getHeight() / 3, localPaint);
    GMTrace.o(12096909606912L, 90129);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12096641171456L, 90127);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    bdg();
    this.puP.clear();
    setClickable(true);
    this.puQ = a.fromDPToPix(getContext(), 50);
    this.topOffset = a.fromDPToPix(getContext(), 10);
    paramInt1 = getWidth();
    paramInt2 = getHeight();
    paramInt3 = this.topOffset;
    this.ofK = (paramInt2 / 2 + paramInt3);
    this.hWK = ((paramInt1 - this.puQ * 2) / 3);
    Bitmap localBitmap = (Bitmap)puO.get();
    paramInt1 = 0;
    while (paramInt1 < 4)
    {
      b localb = new b();
      localb.left = (this.puQ + this.hWK * paramInt1 - localBitmap.getWidth() / 2);
      localb.top = (this.ofK - localBitmap.getHeight() / 2);
      localb.right = (this.puQ + this.hWK * paramInt1 + localBitmap.getWidth() / 2);
      localb.bottom = (this.ofK + localBitmap.getHeight() / 2);
      this.puP.add(localb);
      paramInt1 += 1;
    }
    this.puR = this.puV;
    this.puS = ((b)this.puP.get(this.puR)).left;
    this.puT = ((b)this.puP.get(this.puR)).top;
    invalidate();
    GMTrace.o(12096641171456L, 90127);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    GMTrace.i(12097043824640L, 90130);
    boolean bool;
    b localb;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
      for (bool = true;; bool = true)
      {
        GMTrace.o(12097043824640L, 90130);
        return bool;
        this.mHQ = paramMotionEvent.getX();
        this.kgp = paramMotionEvent.getY();
        localb = (b)this.puP.get(this.puR);
        i = j;
        if (this.mHQ >= localb.left)
        {
          i = j;
          if (this.mHQ <= localb.right)
          {
            i = j;
            if (this.kgp >= localb.top)
            {
              i = j;
              if (this.kgp <= localb.bottom) {
                i = 1;
              }
            }
          }
        }
        if (i == 0) {
          break;
        }
        this.puY = true;
      }
      this.puZ = true;
    }
    label559:
    label610:
    do
    {
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.puY)
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.puS += (int)(f1 - this.mHQ);
        this.mHQ = f1;
        this.kgp = f2;
        paramMotionEvent = (b)this.puP.get(0);
        localb = (b)this.puP.get(3);
        if (this.puS <= paramMotionEvent.left) {
          this.puS = paramMotionEvent.left;
        }
        for (;;)
        {
          invalidate();
          bool = true;
          break;
          if (this.puS >= localb.left)
          {
            this.puS = localb.left;
          }
          else
          {
            do
            {
              i += 1;
              if (i >= 4) {
                break;
              }
              paramMotionEvent = (b)this.puP.get(i);
            } while ((this.puS < paramMotionEvent.left - 5) || (this.puS > paramMotionEvent.right + 5));
            this.puR = i;
            this.puV = this.puR;
            if (this.sBM != null) {
              this.sBM.ts(this.puR);
            }
          }
        }
      }
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.puY)
      {
        i = 0;
        for (;;)
        {
          if (i < 3)
          {
            paramMotionEvent = (b)this.puP.get(i);
            localb = (b)this.puP.get(i + 1);
            if ((this.puS > paramMotionEvent.left + this.hWK / 2) || (this.puS < paramMotionEvent.left)) {
              break label559;
            }
            this.puR = i;
          }
          for (this.puS = paramMotionEvent.left;; this.puS = localb.left)
          {
            this.puV = this.puR;
            if (this.sBM != null) {
              this.sBM.ts(this.puR);
            }
            invalidate();
            this.puY = false;
            bool = true;
            break;
            if ((this.puS < localb.left - this.hWK / 2) || (this.puS > localb.left)) {
              break label610;
            }
            this.puR = (i + 1);
          }
          i += 1;
        }
      }
    } while (!this.puZ);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if ((Math.abs(f1 - this.mHQ) <= 10.0F) && (Math.abs(f2 - this.kgp) <= 10.0F)) {
      i = 0;
    }
    for (;;)
    {
      if (i < 4)
      {
        paramMotionEvent = (b)this.puP.get(i);
        if ((f1 < paramMotionEvent.left - 5) || (f1 > paramMotionEvent.right + 5)) {
          break label773;
        }
        this.puR = i;
        this.puV = this.puR;
        this.puS = paramMotionEvent.left;
        if (this.sBM != null) {
          this.sBM.ts(this.puR);
        }
      }
      this.puZ = false;
      invalidate();
      bool = true;
      break;
      label773:
      i += 1;
    }
  }
  
  public static abstract interface a
  {
    public abstract void ts(int paramInt);
  }
  
  private static final class b
  {
    public int bottom;
    public int left;
    public int right;
    public int top;
    
    public b()
    {
      GMTrace.i(12103083622400L, 90175);
      this.left = 0;
      this.top = 0;
      this.right = 0;
      this.bottom = 0;
      GMTrace.o(12103083622400L, 90175);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/FontChooserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */