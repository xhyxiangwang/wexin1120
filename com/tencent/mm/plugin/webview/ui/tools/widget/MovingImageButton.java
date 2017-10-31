package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.w;

public class MovingImageButton
  extends ImageView
{
  private int jlF;
  private int jlG;
  private int kic;
  private int kid;
  private Context mContext;
  private int mIu;
  private int sCf;
  private int sCg;
  private int sCh;
  private int sCi;
  private ViewGroup.MarginLayoutParams sCj;
  private final int sCk;
  private int sCl;
  private boolean sCm;
  public boolean sCn;
  private int x;
  private int y;
  
  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12068723884032L, 89919);
    this.sCh = 0;
    this.sCi = 0;
    this.sCk = 100;
    this.sCm = false;
    this.sCn = true;
    this.mContext = paramContext;
    GMTrace.o(12068723884032L, 89919);
  }
  
  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12068858101760L, 89920);
    this.sCh = 0;
    this.sCi = 0;
    this.sCk = 100;
    this.sCm = false;
    this.sCn = true;
    this.mContext = paramContext;
    GMTrace.o(12068858101760L, 89920);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12068992319488L, 89921);
    super.onFinishInflate();
    this.sCl = a.fromDPToPix(this.mContext, 100);
    this.kic = a.ef(this.mContext);
    this.kid = a.eg(this.mContext);
    this.mIu = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    GMTrace.o(12068992319488L, 89921);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12069126537216L, 89922);
    if (!this.sCn)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(12069126537216L, 89922);
      return bool;
    }
    if ((this.sCh == 0) || (this.sCi == 0))
    {
      Rect localRect = new Rect();
      getWindowVisibleDisplayFrame(localRect);
      this.sCh = (localRect.right - localRect.left);
      this.sCi = (localRect.bottom - localRect.top);
      w.d("MicroMsg.MovingImageButton", "right = %d, top = %d, left = %d, bottom = %d, screenX = %d, screenY = %d", new Object[] { Integer.valueOf(localRect.right), Integer.valueOf(localRect.top), Integer.valueOf(localRect.left), Integer.valueOf(localRect.bottom), Integer.valueOf(this.sCh), Integer.valueOf(this.sCi) });
    }
    this.x = ((int)paramMotionEvent.getRawX());
    this.y = ((int)paramMotionEvent.getRawY());
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      this.jlF = this.x;
      this.jlG = this.y;
      GMTrace.o(12069126537216L, 89922);
      return true;
      this.sCf = this.x;
      this.sCg = this.y;
      continue;
      int i = this.x - this.jlF;
      int j = this.y - this.jlG;
      if ((i != 0) || (j != 0))
      {
        this.sCj = ((ViewGroup.MarginLayoutParams)getLayoutParams());
        paramMotionEvent = this.sCj;
        int k = paramMotionEvent.rightMargin;
        paramMotionEvent.rightMargin = (-i + k);
        paramMotionEvent = this.sCj;
        paramMotionEvent.topMargin += j;
        if (this.sCj.rightMargin < 0)
        {
          this.sCj.rightMargin = 0;
          label353:
          if (this.sCj.topMargin >= 0) {
            break label416;
          }
          this.sCj.topMargin = 0;
        }
        for (;;)
        {
          requestLayout();
          break;
          if (this.sCj.rightMargin <= this.sCh - getWidth()) {
            break label353;
          }
          this.sCj.rightMargin = (this.sCh - getWidth());
          break label353;
          label416:
          if (this.sCj.topMargin > this.sCi - getHeight()) {
            this.sCj.topMargin = (this.sCi - getHeight());
          }
        }
        if (Math.abs(this.sCf - this.x) + Math.abs(this.sCg - this.y) > this.mIu)
        {
          if (this.y < this.sCl) {
            this.sCj.topMargin = 0;
          }
          for (;;)
          {
            requestLayout();
            break;
            if (this.y > this.sCi - this.sCl) {
              this.sCj.topMargin = (this.sCi - getHeight());
            } else if (this.x > this.sCh / 2) {
              this.sCj.rightMargin = 0;
            } else {
              this.sCj.rightMargin = (this.sCh - getWidth());
            }
          }
        }
        performClick();
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/MovingImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */