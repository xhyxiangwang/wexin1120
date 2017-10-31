package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;

public class CardTagTextView
  extends TextView
{
  public int fillColor;
  private RectF kBb;
  private Paint kBc;
  private int kBd;
  private int kBe;
  private int ksU;
  
  public CardTagTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4886330605568L, 36406);
    this.kBb = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.kBc = new Paint();
    this.ksU = 3;
    this.kBd = 9;
    this.kBe = 0;
    this.fillColor = 0;
    init();
    GMTrace.o(4886330605568L, 36406);
  }
  
  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4886464823296L, 36407);
    this.kBb = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.kBc = new Paint();
    this.ksU = 3;
    this.kBd = 9;
    this.kBe = 0;
    this.fillColor = 0;
    init();
    GMTrace.o(4886464823296L, 36407);
  }
  
  public CardTagTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4886599041024L, 36408);
    this.kBb = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.kBc = new Paint();
    this.ksU = 3;
    this.kBd = 9;
    this.kBe = 0;
    this.fillColor = 0;
    init();
    GMTrace.o(4886599041024L, 36408);
  }
  
  private void init()
  {
    GMTrace.i(4886733258752L, 36409);
    this.ksU = Math.round(a.getDensity(getContext()) * 0.5F);
    this.kBd = a.fromDPToPix(getContext(), 3);
    this.kBe = getCurrentTextColor();
    GMTrace.o(4886733258752L, 36409);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4887001694208L, 36411);
    this.kBb.left = this.kBd;
    this.kBb.top = this.ksU;
    this.kBb.right = (getWidth() - this.kBd);
    this.kBb.bottom = (getHeight() - this.ksU);
    if (this.fillColor != 0)
    {
      this.kBc.setColor(this.fillColor);
      this.kBc.setStyle(Paint.Style.FILL);
      paramCanvas.drawRoundRect(this.kBb, getHeight() / 2 - this.ksU, getHeight() / 2 - this.ksU, this.kBc);
    }
    this.kBc.setColor(this.kBe);
    this.kBc.setStrokeWidth(this.ksU);
    this.kBc.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRoundRect(this.kBb, getHeight() / 2 - this.ksU, getHeight() / 2 - this.ksU, this.kBc);
    super.onDraw(paramCanvas);
    GMTrace.o(4887001694208L, 36411);
  }
  
  public void setTextColor(int paramInt)
  {
    GMTrace.i(4886867476480L, 36410);
    this.kBe = paramInt;
    super.setTextColor(paramInt);
    GMTrace.o(4886867476480L, 36410);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/CardTagTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */