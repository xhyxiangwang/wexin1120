package com.tencent.mm.plugin.appbrand.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.sdk.platformtools.d;
import junit.framework.Assert;

public final class b
  implements b.f
{
  private int LM;
  private int Uo;
  
  public b(int paramInt1, int paramInt2)
  {
    GMTrace.i(18351589949440L, 136730);
    if (paramInt1 == 0)
    {
      bool1 = true;
      Assert.assertFalse(bool1);
      if (paramInt2 != 0) {
        break label60;
      }
    }
    label60:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertFalse(bool1);
      this.Uo = paramInt1;
      this.LM = paramInt2;
      GMTrace.o(18351589949440L, 136730);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final String CX()
  {
    GMTrace.i(18351858384896L, 136732);
    String str = getClass().getName();
    GMTrace.o(18351858384896L, 136732);
    return str;
  }
  
  public final Bitmap k(Bitmap paramBitmap)
  {
    GMTrace.i(18351724167168L, 136731);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(18351724167168L, 136731);
      return paramBitmap;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f = this.LM / this.Uo;
    Bitmap localBitmap = d.createBitmap(this.Uo, this.LM, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Rect localRect1 = new Rect();
    localRect1.left = 0;
    localRect1.top = 0;
    if (f <= j / i) {
      localRect1.right = i;
    }
    for (localRect1.bottom = ((int)(i * f));; localRect1.bottom = j)
    {
      Rect localRect2 = new Rect();
      localRect2.left = 0;
      localRect2.top = 0;
      localRect2.right = this.Uo;
      localRect2.bottom = this.LM;
      localCanvas.drawBitmap(paramBitmap, localRect1, localRect2, null);
      GMTrace.o(18351724167168L, 136731);
      return localBitmap;
      localRect1.right = ((int)(j / f));
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/share/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */