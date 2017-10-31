package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

public class GameCenterListView
  extends ListView
{
  static boolean mIw;
  static int mIy;
  private View Kx;
  private Context mContext;
  private ImageView mIA;
  private boolean mIs;
  private float mIt;
  private int mIu;
  private boolean mIv;
  private boolean mIx;
  private ImageView mIz;
  private Scroller xR;
  
  public GameCenterListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12762361102336L, 95087);
    this.mContext = paramContext;
    GMTrace.o(12762361102336L, 95087);
  }
  
  public static void fc(boolean paramBoolean)
  {
    GMTrace.i(12762629537792L, 95089);
    mIw = paramBoolean;
    GMTrace.o(12762629537792L, 95089);
  }
  
  public static void oE(int paramInt)
  {
    GMTrace.i(12762763755520L, 95090);
    mIy = paramInt;
    GMTrace.o(12762763755520L, 95090);
  }
  
  public void computeScroll()
  {
    GMTrace.i(12763166408704L, 95093);
    if (this.Kx == null)
    {
      GMTrace.o(12763166408704L, 95093);
      return;
    }
    if (this.xR.computeScrollOffset())
    {
      int i = this.xR.getCurrY();
      this.Kx.setPadding(0, i, 0, 0);
      float f = (mIy - i) / mIy * 255.0F;
      i = (int)f;
      int j = (int)f;
      this.mIA.setAlpha(255 - i);
      this.mIz.setAlpha(j);
      invalidate();
    }
    GMTrace.o(12763166408704L, 95093);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12763032190976L, 95092);
    boolean bool;
    if ((!mIw) || (this.Kx == null))
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(12763032190976L, 95092);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    int i;
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            bool = super.dispatchTouchEvent(paramMotionEvent);
            GMTrace.o(12763032190976L, 95092);
            return bool;
            this.mIx = false;
            this.mIt = paramMotionEvent.getRawY();
          }
        } while (!this.mIv);
        if (this.mIx)
        {
          GMTrace.o(12763032190976L, 95092);
          return true;
        }
        i = (int)(paramMotionEvent.getRawY() - this.mIt);
        if (this.Kx.getPaddingTop() > mIy + this.mIu) {
          break;
        }
      } while ((i <= 0) || (Math.abs(i) < this.mIu));
      this.mIx = true;
      this.xR.startScroll(0, this.Kx.getPaddingTop(), 0, -this.Kx.getPaddingTop(), 500);
      this.mIz.setClickable(true);
      invalidate();
      paramMotionEvent.setAction(3);
      super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(12763032190976L, 95092);
      return true;
    } while ((this.Kx.getPaddingTop() < -this.mIu) || (i >= 0) || (Math.abs(i) < this.mIu));
    this.mIx = true;
    this.xR.startScroll(0, 0, 0, mIy, 500);
    invalidate();
    paramMotionEvent.setAction(3);
    super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(12763032190976L, 95092);
    return true;
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12762495320064L, 95088);
    super.onFinishInflate();
    this.mIu = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    this.xR = new Scroller(this.mContext);
    super.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12691091488768L, 94556);
        if ((paramAnonymousInt1 == 0) && (GameCenterListView.a(GameCenterListView.this) != null) && (GameCenterListView.a(GameCenterListView.this).getTop() == 0))
        {
          GameCenterListView.a(GameCenterListView.this, true);
          GMTrace.o(12691091488768L, 94556);
          return;
        }
        GameCenterListView.a(GameCenterListView.this, false);
        GMTrace.o(12691091488768L, 94556);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(12690957271040L, 94555);
        GMTrace.o(12690957271040L, 94555);
      }
    });
    GMTrace.o(12762495320064L, 95088);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12762897973248L, 95091);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!this.mIs))
    {
      this.Kx = getChildAt(0);
      this.mIA = ((ImageView)this.Kx.findViewById(R.h.cyy));
      this.mIz = ((ImageView)this.Kx.findViewById(R.h.blv));
      this.mIs = true;
    }
    GMTrace.o(12762897973248L, 95091);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */