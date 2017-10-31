package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class PLTextView
  extends StaticTextView
{
  private static long gTA;
  private static long gTB;
  private static int gTC;
  private static long gTD;
  private static boolean gTE;
  private static long gTv;
  private static int gTw;
  private static long gTx;
  private static long gTy;
  private static int gTz;
  
  static
  {
    GMTrace.i(435804962816L, 3247);
    gTv = 0L;
    gTw = 0;
    gTx = -2147483648L;
    gTy = 0L;
    gTz = 0;
    gTA = -2147483648L;
    gTB = 0L;
    gTC = 0;
    gTD = -2147483648L;
    gTE = false;
    GMTrace.o(435804962816L, 3247);
  }
  
  public PLTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(434597003264L, 3238);
    GMTrace.o(434597003264L, 3238);
  }
  
  public PLTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(434731220992L, 3239);
    GMTrace.o(434731220992L, 3239);
  }
  
  public PLTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(434865438720L, 3240);
    GMTrace.o(434865438720L, 3240);
  }
  
  public void o(CharSequence paramCharSequence)
  {
    GMTrace.i(435402309632L, 3244);
    super.setText(paramCharSequence, false);
    GMTrace.o(435402309632L, 3244);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(435670745088L, 3246);
    super.onConfigurationChanged(paramConfiguration);
    if (xV() != null) {
      xV().gTV = false;
    }
    GMTrace.o(435670745088L, 3246);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(435268091904L, 3243);
    long l = 0L;
    if (gTE) {
      l = System.currentTimeMillis();
    }
    super.onDraw(paramCanvas);
    if (gTE)
    {
      l = System.currentTimeMillis() - l;
      gTB += l;
      gTC += 1;
      if (l > gTD) {
        gTD = l;
      }
    }
    GMTrace.o(435268091904L, 3243);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(435133874176L, 3242);
    long l = 0L;
    if (gTE) {
      l = System.currentTimeMillis();
    }
    super.onMeasure(paramInt1, paramInt2);
    if (gTE)
    {
      l = System.currentTimeMillis() - l;
      gTy += l;
      gTz += 1;
      if (l > gTA) {
        gTA = l;
      }
    }
    GMTrace.o(435133874176L, 3242);
  }
  
  public void p(CharSequence paramCharSequence)
  {
    GMTrace.i(435536527360L, 3245);
    GMTrace.o(435536527360L, 3245);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    GMTrace.i(434999656448L, 3241);
    if (bg.L(paramCharSequence))
    {
      if (h.DEBUG) {
        w.d("MicroMsg.PLTextView", "set null text");
      }
      GMTrace.o(434999656448L, 3241);
      return;
    }
    long l1 = 0L;
    long l2 = 0L;
    if (h.DEBUG) {
      l1 = System.currentTimeMillis();
    }
    if ((xV() != null) && (xV().gTV)) {
      c.gTt.a(xR(), xV());
    }
    f localf = c.gTt.a(xR(), paramCharSequence);
    boolean bool;
    if (localf != null)
    {
      bool = true;
      p(paramCharSequence);
      b(localf);
    }
    for (;;)
    {
      if (h.DEBUG)
      {
        l2 = System.currentTimeMillis();
        w.d("MicroMsg.PLTextView", "setText used %fms, hitCache: %b, hashCode: %d, text: %s hitCache %s", new Object[] { Double.valueOf((l2 - l1) / 1000000.0D), Boolean.valueOf(bool), Integer.valueOf(hashCode()), paramCharSequence, Boolean.valueOf(bool) });
      }
      if (gTE)
      {
        l1 = l2 - l1;
        gTv += l1;
        gTw += 1;
        if (l1 > gTx) {
          gTx = l1;
        }
      }
      GMTrace.o(434999656448L, 3241);
      return;
      bool = false;
      o(paramCharSequence);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/PLTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */