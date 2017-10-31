package com.tencent.mm.plugin.game.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;

public class TextProgressBar
  extends ProgressBar
{
  private Paint eI;
  private int jdL;
  private String jzo;
  private Context mContext;
  private int rw;
  
  public TextProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12583448870912L, 93754);
    this.mContext = paramContext;
    GMTrace.o(12583448870912L, 93754);
  }
  
  public final void oN(int paramInt)
  {
    GMTrace.i(12583851524096L, 93757);
    this.jdL = a.fromDPToPix(this.mContext, paramInt);
    GMTrace.o(12583851524096L, 93757);
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      GMTrace.i(12583717306368L, 93756);
      super.onDraw(paramCanvas);
      this.eI = new Paint();
      this.eI.setAntiAlias(true);
      this.eI.setColor(Color.rgb(69, 192, 26));
      this.eI.setTextSize(this.jdL);
      Object localObject = new Rect();
      this.eI.getTextBounds(this.jzo, 0, this.jzo.length(), (Rect)localObject);
      float f1 = getWidth() / 2 - ((Rect)localObject).centerX();
      float f2 = getHeight() / 2 - ((Rect)localObject).centerY();
      paramCanvas.drawText(this.jzo, f1, f2, this.eI);
      float f3 = this.rw / 100.0F * getWidth();
      if (f3 > f1)
      {
        localObject = new Paint();
        ((Paint)localObject).setColor(-1);
        ((Paint)localObject).setAntiAlias(true);
        ((Paint)localObject).setTextSize(this.jdL);
        RectF localRectF = new RectF(0.0F, 0.0F, f3, getHeight());
        paramCanvas.save();
        paramCanvas.clipRect(localRectF);
        paramCanvas.drawText(this.jzo, f1, f2, (Paint)localObject);
        paramCanvas.restore();
      }
      GMTrace.o(12583717306368L, 93756);
      return;
    }
    finally {}
  }
  
  public void setProgress(int paramInt)
  {
    GMTrace.i(12583583088640L, 93755);
    this.rw = paramInt;
    this.jzo = (String.valueOf(paramInt) + "%");
    super.setProgress(paramInt);
    GMTrace.o(12583583088640L, 93755);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/widget/TextProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */