package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.k.c;
import com.tencent.mm.plugin.appbrand.jsapi.k.c.f;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Locale;

final class z<Input extends EditText,  extends x>
{
  public final String TAG;
  final float jBb;
  final Input jDH;
  public c.f jDI;
  public MotionEvent jDJ;
  public boolean jDK;
  public final Runnable jDL;
  public final Runnable jDM;
  
  z(Input paramInput)
  {
    GMTrace.i(18845779623936L, 140412);
    this.jDK = false;
    this.jDL = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18847256018944L, 140423);
        z.this.jDK = true;
        w.v(z.this.TAG, "[apptouch] pendingCheckForTap run, pointerDown TRUE");
        z.this.jDH.postDelayed(z.this.jDM, ViewConfiguration.getLongPressTimeout());
        GMTrace.o(18847256018944L, 140423);
      }
    };
    this.jDM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18844840099840L, 140405);
        if (!z.this.jDK)
        {
          GMTrace.o(18844840099840L, 140405);
          return;
        }
        c.f localf = c.bG(z.this.jDH);
        if ((z.this.jDI == null) || (Math.abs(z.this.jDI.x - localf.x) > 1.0F) || (Math.abs(z.this.jDI.y - localf.y) > 1.0F))
        {
          w.v(z.this.TAG, "check long press timeout, but view has moved.");
          GMTrace.o(18844840099840L, 140405);
          return;
        }
        if (z.this.jDJ == null)
        {
          GMTrace.o(18844840099840L, 140405);
          return;
        }
        z.this.jDK = false;
        z.this.jDH.removeCallbacks(z.this.jDL);
        GMTrace.o(18844840099840L, 140405);
      }
    };
    this.jDH = paramInput;
    this.TAG = ("MicroMsg.AppBrand.InputFakeTapEventEmitter" + String.format(Locale.US, "[%s]", new Object[] { paramInput.toString() }));
    this.jBb = ViewConfiguration.get(paramInput.getContext()).getScaledTouchSlop();
    GMTrace.o(18845779623936L, 140412);
  }
  
  final boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    GMTrace.i(18846048059392L, 140414);
    float f1 = paramMotionEvent1.getX(paramMotionEvent1.getActionIndex());
    float f2 = paramMotionEvent1.getY(paramMotionEvent1.getActionIndex());
    float f3 = paramMotionEvent2.getX(paramMotionEvent2.getActionIndex());
    float f4 = paramMotionEvent2.getY(paramMotionEvent2.getActionIndex());
    w.v(this.TAG, "[apptouch] checkTapArea touchSlop %f, X[%f:%f], Y[%f:%f], [%s : %s]", new Object[] { Float.valueOf(this.jBb), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f4), b.B(paramMotionEvent1), b.B(paramMotionEvent2) });
    if ((Math.abs(f4 - f2) <= this.jBb) && (Math.abs(f3 - f1) <= this.jBb))
    {
      GMTrace.o(18846048059392L, 140414);
      return true;
    }
    GMTrace.o(18846048059392L, 140414);
    return false;
  }
  
  final void acH()
  {
    GMTrace.i(18845913841664L, 140413);
    this.jDK = false;
    this.jDH.removeCallbacks(this.jDL);
    this.jDH.removeCallbacks(this.jDM);
    this.jDI = null;
    if (this.jDJ != null)
    {
      this.jDJ.recycle();
      this.jDJ = null;
    }
    GMTrace.o(18845913841664L, 140413);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */