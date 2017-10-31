package com.tencent.mm.plugin.appbrand.widget.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  extends Drawable
{
  public float Vt;
  public final Paint eI;
  private final RectF jGL;
  private float jGM;
  private final Path mj;
  
  public b()
  {
    GMTrace.i(18843632140288L, 140396);
    this.eI = new Paint(1);
    this.Vt = 0.0F;
    this.jGL = new RectF();
    this.mj = new Path();
    this.jGM = a.fromDPToPix(ab.getContext(), 3);
    GMTrace.o(18843632140288L, 140396);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(18843766358016L, 140397);
    float f5 = this.jGL.width();
    float f6 = this.jGL.height();
    float f1 = this.jGL.left;
    float f2 = this.jGL.top;
    float f3 = this.jGL.right;
    float f4 = this.jGL.bottom;
    f5 = Math.min(this.Vt, Math.min(f5, f6) * 0.5F);
    paramCanvas.drawRoundRect(new RectF(f1 + this.jGM, f2 + this.jGM, f3 - this.jGM, f4 - this.jGM), f5, f5, this.eI);
    paramCanvas.drawPath(this.mj, this.eI);
    GMTrace.o(18843766358016L, 140397);
  }
  
  public final int getOpacity()
  {
    GMTrace.i(18844303228928L, 140401);
    GMTrace.o(18844303228928L, 140401);
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(18844034793472L, 140399);
    this.eI.setAlpha(paramInt);
    GMTrace.o(18844034793472L, 140399);
  }
  
  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18843900575744L, 140398);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.jGL.set(paramInt1, paramInt2, paramInt3, paramInt4);
    float f = (paramInt1 + paramInt3) / 2.0F;
    this.mj.moveTo(f, paramInt4);
    this.mj.lineTo(f - this.jGM, paramInt4 - this.jGM);
    this.mj.lineTo(f + this.jGM, paramInt4 - this.jGM);
    this.mj.close();
    GMTrace.o(18843900575744L, 140398);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(18844169011200L, 140400);
    this.eI.setColorFilter(paramColorFilter);
    GMTrace.o(18844169011200L, 140400);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */