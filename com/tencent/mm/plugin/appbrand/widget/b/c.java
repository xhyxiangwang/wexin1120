package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;

public final class c
  implements Iterator<View>
{
  private final ViewGroup jAm;
  private int jsh;
  
  public c(ViewGroup paramViewGroup)
  {
    GMTrace.i(19882880008192L, 148139);
    this.jsh = 0;
    this.jAm = paramViewGroup;
    GMTrace.o(19882880008192L, 148139);
  }
  
  public final boolean hasNext()
  {
    GMTrace.i(19883014225920L, 148140);
    if (this.jsh < this.jAm.getChildCount())
    {
      GMTrace.o(19883014225920L, 148140);
      return true;
    }
    GMTrace.o(19883014225920L, 148140);
    return false;
  }
  
  public final void remove()
  {
    GMTrace.i(19883148443648L, 148141);
    this.jAm.removeViewAt(this.jsh - 1);
    GMTrace.o(19883148443648L, 148141);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */