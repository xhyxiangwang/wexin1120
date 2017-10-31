package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import java.util.HashMap;
import java.util.Map;

public final class ah
  extends a
{
  int alpha;
  long msU;
  boolean msV;
  private Map<String, Boolean> qeo;
  
  public ah(String paramString, n paramn, long paramLong)
  {
    super(paramString, paramn);
    GMTrace.i(8091852603392L, 60289);
    this.msV = false;
    this.alpha = 255;
    this.qeo = new HashMap();
    if (paramLong != 0L)
    {
      this.msU = paramLong;
      this.qeo.put(paramString, Boolean.valueOf(true));
      this.msV = true;
      GMTrace.o(8091852603392L, 60289);
      return;
    }
    if (!this.qeo.containsKey(paramString))
    {
      this.msU = SystemClock.uptimeMillis();
      this.qeo.put(paramString, Boolean.valueOf(true));
      this.msV = true;
    }
    GMTrace.o(8091852603392L, 60289);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(8091986821120L, 60290);
    Rect localRect = getBounds();
    Bitmap localBitmap = this.haz.yr();
    if (!i.m(localBitmap))
    {
      paramCanvas.drawColor(-1118482);
      this.msU = 0L;
      GMTrace.o(8091986821120L, 60290);
      return;
    }
    float f;
    if (this.msV)
    {
      f = (float)(SystemClock.uptimeMillis() - this.msU) / 150.0F;
      if (this.msU == 0L) {
        f = 0.0F;
      }
      if (f >= 1.0F) {
        this.msV = false;
      }
    }
    else
    {
      hax.setAlpha(this.alpha);
      paramCanvas.drawBitmap(localBitmap, null, localRect, hax);
      GMTrace.o(8091986821120L, 60290);
      return;
    }
    int i = (int)(f * this.alpha);
    hax.setAlpha(i);
    paramCanvas.drawBitmap(localBitmap, null, localRect, hax);
    invalidateSelf();
    GMTrace.o(8091986821120L, 60290);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */