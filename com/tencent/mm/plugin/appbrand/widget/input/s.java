package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.widget.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class s
  implements a
{
  private int jCC;
  private final Rect jCD;
  private boolean jCE;
  private View jCF;
  a jCG;
  
  s()
  {
    GMTrace.i(10076530147328L, 75076);
    this.jCC = 0;
    this.jCD = new Rect();
    this.jCE = false;
    GMTrace.o(10076530147328L, 75076);
  }
  
  private int acm()
  {
    GMTrace.i(10076932800512L, 75079);
    if (this.jCF == null) {}
    for (Object localObject = null; localObject == null; localObject = this.jCF.getRootView())
    {
      GMTrace.o(10076932800512L, 75079);
      return 0;
    }
    localObject = this.jCD;
    getWindowVisibleDisplayFrame((Rect)localObject);
    int i = getContext().getResources().getDisplayMetrics().heightPixels;
    int j = ((Rect)localObject).top;
    GMTrace.o(10076932800512L, 75079);
    return i - j;
  }
  
  private Context getContext()
  {
    GMTrace.i(10076798582784L, 75078);
    if (this.jCF == null)
    {
      localContext = ab.getContext();
      GMTrace.o(10076798582784L, 75078);
      return localContext;
    }
    Context localContext = this.jCF.getContext();
    GMTrace.o(10076798582784L, 75078);
    return localContext;
  }
  
  private void getWindowVisibleDisplayFrame(Rect paramRect)
  {
    GMTrace.i(10076664365056L, 75077);
    if (this.jCF != null) {
      this.jCF.getWindowVisibleDisplayFrame(paramRect);
    }
    GMTrace.o(10076664365056L, 75077);
  }
  
  public final void bT(View paramView)
  {
    int i = 1;
    GMTrace.i(10077067018240L, 75080);
    this.jCF = paramView;
    paramView = this.jCD;
    getWindowVisibleDisplayFrame(paramView);
    int j = paramView.height();
    if (this.jCC == 0) {
      this.jCC = j;
    }
    label53:
    label62:
    label191:
    label196:
    label200:
    for (;;)
    {
      int k;
      if (acm() > j)
      {
        bool = true;
        if (this.jCE == bool) {
          break label191;
        }
        if ((i != 0) && (this.jCG != null)) {
          this.jCG.cT(bool);
        }
        this.jCE = bool;
        this.jCC = j;
        this.jCF = null;
        GMTrace.o(10077067018240L, 75080);
        return;
        k = acm() - j;
        if (k <= 0) {
          continue;
        }
        if (j.aK(getContext()) == k) {
          break label196;
        }
      }
      for (boolean bool = j.p(getContext(), k);; bool = false)
      {
        if ((!bool) || (this.jCG == null) || (this.jCG.getHeight() == k)) {
          break label200;
        }
        this.jCG.jT(k);
        break;
        bool = false;
        break label53;
        i = 0;
        break label62;
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void cT(boolean paramBoolean);
    
    public abstract int getHeight();
    
    public abstract void jT(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */