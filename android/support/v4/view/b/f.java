package android.support.v4.view.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

final class f
  implements Interpolator
{
  private final float[] zQ;
  private final float[] zR;
  
  public f(Path paramPath)
  {
    paramPath = new PathMeasure(paramPath, false);
    float f = paramPath.getLength();
    int j = (int)(f / 0.002F) + 1;
    this.zQ = new float[j];
    this.zR = new float[j];
    float[] arrayOfFloat = new float[2];
    int i = 0;
    while (i < j)
    {
      paramPath.getPosTan(i * f / (j - 1), arrayOfFloat, null);
      this.zQ[i] = arrayOfFloat[0];
      this.zR[i] = arrayOfFloat[1];
      i += 1;
    }
  }
  
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    int j = this.zQ.length - 1;
    int i = 0;
    while (j - i > 1)
    {
      int k = (i + j) / 2;
      if (paramFloat < this.zQ[k]) {
        j = k;
      } else {
        i = k;
      }
    }
    float f = this.zQ[j] - this.zQ[i];
    if (f == 0.0F) {
      return this.zR[i];
    }
    paramFloat = (paramFloat - this.zQ[i]) / f;
    f = this.zR[i];
    return paramFloat * (this.zR[j] - f) + f;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/android/support/v4/view/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */