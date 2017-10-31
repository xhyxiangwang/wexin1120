package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.ae;

public class FreeWifiStateView
  extends ImageView
{
  private int bottom;
  private Paint eI;
  private ae ham;
  private int left;
  int lva;
  private int lvb;
  private Runnable lvc;
  private Context mContext;
  private int right;
  private int state;
  private int top;
  
  public FreeWifiStateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7173400690688L, 53446);
    GMTrace.o(7173400690688L, 53446);
  }
  
  public FreeWifiStateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7173534908416L, 53447);
    this.lva = 2;
    this.left = -1;
    this.top = -1;
    this.right = -1;
    this.bottom = -1;
    this.lvb = -1;
    this.lvc = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7184272326656L, 53527);
        FreeWifiStateView.this.invalidate();
        GMTrace.o(7184272326656L, 53527);
      }
    };
    this.mContext = paramContext;
    this.eI = new Paint();
    this.eI.setAntiAlias(true);
    this.eI.setStyle(Paint.Style.STROKE);
    this.left = a.fromDPToPix(this.mContext, 2);
    this.top = this.left;
    this.lvb = a.fromDPToPix(this.mContext, 3);
    this.ham = new ae(Looper.getMainLooper());
    GMTrace.o(7173534908416L, 53447);
  }
  
  private void mU(int paramInt)
  {
    GMTrace.i(7173937561600L, 53450);
    this.ham.removeCallbacks(this.lvc);
    this.ham.postDelayed(this.lvc, paramInt);
    GMTrace.o(7173937561600L, 53450);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(7173803343872L, 53449);
    super.onDraw(paramCanvas);
    if (this.state == 1)
    {
      int i = getWidth() / 2;
      this.eI.setARGB(255, 103, 209, 79);
      this.eI.setStrokeWidth(this.lvb);
      if (this.right == -1) {
        this.right = (i * 2 - this.left);
      }
      if (this.bottom == -1) {
        this.bottom = this.right;
      }
      paramCanvas.drawArc(new RectF(this.left, this.top, this.right, this.bottom), 270.0F, this.lva, false, this.eI);
      this.lva += 5;
      if (this.lva > 365) {
        this.lva = 0;
      }
      mU(100);
    }
    GMTrace.o(7173803343872L, 53449);
  }
  
  public final void setState(int paramInt)
  {
    GMTrace.i(7173669126144L, 53448);
    this.state = paramInt;
    mU(10);
    GMTrace.o(7173669126144L, 53448);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiStateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */