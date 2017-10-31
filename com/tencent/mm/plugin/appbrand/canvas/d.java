package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import java.util.Stack;

public final class d
  implements a
{
  public String gQf;
  public com.tencent.mm.plugin.appbrand.canvas.b.a iFI;
  public com.tencent.mm.plugin.appbrand.canvas.b.a iFJ;
  public Stack<com.tencent.mm.plugin.appbrand.canvas.b.a> iFK;
  public Stack<com.tencent.mm.plugin.appbrand.canvas.b.a> iFL;
  public Paint iFM;
  public Paint iFN;
  public e iFO;
  private a iFP;
  
  public d(a parama)
  {
    GMTrace.i(20000454737920L, 149015);
    this.iFM = new Paint();
    this.iFP = parama;
    this.iFI = new com.tencent.mm.plugin.appbrand.canvas.b.a();
    this.iFJ = new com.tencent.mm.plugin.appbrand.canvas.b.a();
    this.iFI.setStyle(Paint.Style.STROKE);
    this.iFJ.setStyle(Paint.Style.FILL);
    this.iFI.setAntiAlias(true);
    this.iFJ.setAntiAlias(true);
    this.iFI.setStrokeWidth(c.jF(1));
    this.iFJ.setStrokeWidth(c.jF(1));
    this.iFK = new Stack();
    this.iFL = new Stack();
    this.iFM.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    GMTrace.o(20000454737920L, 149015);
  }
  
  public final void invalidate()
  {
    GMTrace.i(20000588955648L, 149016);
    this.iFP.invalidate();
    GMTrace.o(20000588955648L, 149016);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */