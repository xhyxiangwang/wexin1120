package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.f;
import java.io.Serializable;

public final class a
  extends Paint
  implements Serializable
{
  public int iFT;
  private float iFU;
  private int rE;
  
  public a()
  {
    GMTrace.i(10211418963968L, 76081);
    this.iFT = a.iFV;
    this.iFU = (getAlpha() / 255.0F);
    this.rE = getColor();
    GMTrace.o(10211418963968L, 76081);
  }
  
  public final void N(float paramFloat)
  {
    GMTrace.i(17401731088384L, 129653);
    this.iFU = paramFloat;
    setColor(this.rE);
    GMTrace.o(17401731088384L, 129653);
  }
  
  public final a TJ()
  {
    GMTrace.i(10211687399424L, 76083);
    a locala = new a();
    locala.setColor(getColor());
    locala.setFlags(getFlags());
    locala.setDither(isDither());
    Shader localShader2 = getShader();
    if (localShader2 != null)
    {
      Object localObject = f.a(Shader.class, "copy", localShader2, new Class[0], new Object[0], null);
      Shader localShader1 = localShader2;
      if (localObject != null)
      {
        localShader1 = localShader2;
        if ((localObject instanceof Shader)) {
          localShader1 = (Shader)localObject;
        }
      }
      locala.setShader(localShader1);
    }
    locala.setStrokeJoin(getStrokeJoin());
    locala.setStrokeMiter(getStrokeMiter());
    locala.setStrokeWidth(getStrokeWidth());
    locala.setStrokeCap(getStrokeCap());
    locala.setStyle(getStyle());
    locala.setTextSize(getTextSize());
    locala.setTextAlign(getTextAlign());
    locala.setTypeface(getTypeface());
    locala.iFT = this.iFT;
    GMTrace.o(10211687399424L, 76083);
    return locala;
  }
  
  protected final Object clone()
  {
    GMTrace.i(10211553181696L, 76082);
    Object localObject = super.clone();
    GMTrace.o(10211553181696L, 76082);
    return localObject;
  }
  
  public final void reset()
  {
    GMTrace.i(17401999523840L, 129655);
    this.iFT = a.iFV;
    super.reset();
    GMTrace.o(17401999523840L, 129655);
  }
  
  public final void setColor(int paramInt)
  {
    GMTrace.i(17401865306112L, 129654);
    this.rE = paramInt;
    super.setColor(((int)(Color.alpha(paramInt) * this.iFU) & 0xFF) << 24 | 0xFFFFFF & paramInt);
    GMTrace.o(17401865306112L, 129654);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(17402133741568L, 129656);
      iFV = 1;
      iFW = 2;
      iFX = 3;
      iFY = 4;
      iFZ = new int[] { iFV, iFW, iFX, iFY };
      GMTrace.o(17402133741568L, 129656);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */