package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.tencent.gmtrace.GMTrace;

public final class a
  implements d
{
  private static int jdF;
  private static int jdG;
  private int Lm;
  private int Lw;
  private StaticLayout gTY;
  private SpannableString jdH;
  private int jdI;
  private int jdJ;
  private int jdK;
  private int jdL;
  private int jdM;
  private float jdN;
  private Context mContext;
  private int xo;
  
  public a(Context paramContext, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17354754883584L, 129303);
    this.jdK = -1;
    this.xo = -1;
    this.mContext = paramContext;
    this.jdH = paramSpannableString;
    this.jdL = b.u(this.mContext, b.jdO);
    this.xo = paramInt1;
    this.jdN = 3.0F;
    this.jdM = paramInt2;
    paramContext = new TextPaint();
    paramContext.setAntiAlias(true);
    paramContext.setColor(this.xo);
    paramContext.setTextSize(this.jdL);
    paramSpannableString = paramContext.getFontMetrics();
    this.Lw = ((int)Math.ceil(paramSpannableString.descent - paramSpannableString.top) + 2);
    this.gTY = new StaticLayout(this.jdH, paramContext, (int)Layout.getDesiredWidth(this.jdH, 0, this.jdH.length(), paramContext) + 1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    this.Lm = this.gTY.getWidth();
    GMTrace.o(17354754883584L, 129303);
  }
  
  public final boolean XA()
  {
    GMTrace.i(17355291754496L, 129307);
    if ((this.jdI < 0) && (Math.abs(this.jdI) > this.Lm))
    {
      GMTrace.o(17355291754496L, 129307);
      return true;
    }
    GMTrace.o(17355291754496L, 129307);
    return false;
  }
  
  public final int XB()
  {
    GMTrace.i(17355694407680L, 129310);
    int i = this.jdM;
    GMTrace.o(17355694407680L, 129310);
    return i;
  }
  
  public final float Xz()
  {
    GMTrace.i(17355157536768L, 129306);
    float f = this.jdN;
    GMTrace.o(17355157536768L, 129306);
    return f;
  }
  
  public final boolean a(d paramd)
  {
    GMTrace.i(17356097060864L, 129313);
    if (paramd.getWidth() + paramd.getCurrX() > jdF)
    {
      GMTrace.o(17356097060864L, 129313);
      return true;
    }
    if (this.jdK < 0) {
      this.jdK = b.u(this.mContext, 20);
    }
    if (paramd.Xz() >= this.jdN)
    {
      if ((paramd.Xz() == this.jdN) && (jdF - (paramd.getCurrX() + paramd.getWidth()) < this.jdK))
      {
        GMTrace.o(17356097060864L, 129313);
        return true;
      }
      GMTrace.o(17356097060864L, 129313);
      return false;
    }
    if ((paramd.getCurrX() + paramd.getWidth()) / (paramd.Xz() * b.XC()) * this.jdN * b.XC() > jdF - this.jdK * 1.5D)
    {
      GMTrace.o(17356097060864L, 129313);
      return true;
    }
    GMTrace.o(17356097060864L, 129313);
    return false;
  }
  
  public final void b(Canvas paramCanvas, boolean paramBoolean)
  {
    GMTrace.i(17354889101312L, 129304);
    int i = paramCanvas.getWidth();
    int j = paramCanvas.getHeight();
    if ((i != jdF) || (j != jdG))
    {
      jdF = i;
      jdG = j;
    }
    paramCanvas.save();
    paramCanvas.translate(this.jdI, this.jdJ);
    this.gTY.draw(paramCanvas);
    paramCanvas.restore();
    if (!paramBoolean) {
      this.jdI = ((int)(this.jdI - b.XC() * this.jdN));
    }
    GMTrace.o(17354889101312L, 129304);
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(17355023319040L, 129305);
    this.jdI = paramInt1;
    this.jdJ = paramInt2;
    GMTrace.o(17355023319040L, 129305);
  }
  
  public final int getCurrX()
  {
    GMTrace.i(17355560189952L, 129309);
    int i = this.jdI;
    GMTrace.o(17355560189952L, 129309);
    return i;
  }
  
  public final int getWidth()
  {
    GMTrace.i(17355425972224L, 129308);
    int i = this.Lm;
    GMTrace.o(17355425972224L, 129308);
    return i;
  }
  
  public final boolean iJ(int paramInt)
  {
    GMTrace.i(17355828625408L, 129311);
    if (paramInt < this.jdM)
    {
      GMTrace.o(17355828625408L, 129311);
      return false;
    }
    if (paramInt - this.jdM <= b.jdP)
    {
      GMTrace.o(17355828625408L, 129311);
      return true;
    }
    GMTrace.o(17355828625408L, 129311);
    return false;
  }
  
  public final boolean iK(int paramInt)
  {
    GMTrace.i(17355962843136L, 129312);
    if (paramInt - this.jdM > b.jdP)
    {
      GMTrace.o(17355962843136L, 129312);
      return true;
    }
    GMTrace.o(17355962843136L, 129312);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/danmu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */