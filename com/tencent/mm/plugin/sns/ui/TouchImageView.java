package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public class TouchImageView
  extends ImageView
{
  private int a;
  private int b;
  private boolean fwS;
  private int g;
  private Rect qSW;
  private Paint qSX;
  ae qxq;
  Runnable qxr;
  private int r;
  
  public TouchImageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8425920528384L, 62778);
    this.qSW = new Rect();
    this.qSX = new Paint();
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.fwS = true;
    init();
    GMTrace.o(8425920528384L, 62778);
  }
  
  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8426054746112L, 62779);
    this.qSW = new Rect();
    this.qSX = new Paint();
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.fwS = true;
    init();
    GMTrace.o(8426054746112L, 62779);
  }
  
  private void init()
  {
    GMTrace.i(8426188963840L, 62780);
    this.qxq = new ae();
    this.qxr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8316130426880L, 61960);
        TouchImageView.this.setPressed(false);
        TouchImageView.this.invalidate();
        GMTrace.o(8316130426880L, 61960);
      }
    };
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8372233437184L, 62378);
        if (!TouchImageView.a(TouchImageView.this))
        {
          GMTrace.o(8372233437184L, 62378);
          return false;
        }
        TouchImageView localTouchImageView = TouchImageView.this;
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        while ((!localTouchImageView.isClickable()) && (!localTouchImageView.isLongClickable()))
        {
          GMTrace.o(8372233437184L, 62378);
          return true;
          paramAnonymousView.setPressed(true);
          paramAnonymousView.invalidate();
          localTouchImageView.qxq.removeCallbacks(localTouchImageView.qxr);
          continue;
          localTouchImageView.qxq.post(localTouchImageView.qxr);
        }
        GMTrace.o(8372233437184L, 62378);
        return false;
      }
    });
    GMTrace.o(8426188963840L, 62780);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(8426591617024L, 62783);
    super.onAttachedToWindow();
    w.d("MicroMsg.MaskImageView", "onAttachedToWindow");
    GMTrace.o(8426591617024L, 62783);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(8426725834752L, 62784);
    super.onDetachedFromWindow();
    w.d("MicroMsg.MaskImageView", "onDetachedFromWindow");
    GMTrace.o(8426725834752L, 62784);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8426323181568L, 62781);
    super.onDraw(paramCanvas);
    if (isPressed())
    {
      this.qSW.left = getPaddingLeft();
      this.qSW.top = getPaddingTop();
      this.qSW.right = (getWidth() - getPaddingRight());
      this.qSW.bottom = (getHeight() - getPaddingBottom());
      this.qSX.setARGB(this.a, this.r, this.g, this.b);
      paramCanvas.drawRect(this.qSW, this.qSX);
    }
    GMTrace.o(8426323181568L, 62781);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(8426457399296L, 62782);
    Assert.assertTrue(false);
    GMTrace.o(8426457399296L, 62782);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/TouchImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */