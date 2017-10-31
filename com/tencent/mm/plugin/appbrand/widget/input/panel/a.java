package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  Context jFb;
  protected c jFc;
  int jFd;
  
  a()
  {
    GMTrace.i(19880195653632L, 148119);
    this.jFd = 0;
    GMTrace.o(19880195653632L, 148119);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(19880061435904L, 148118);
    this.jFc = paramc;
    GMTrace.o(19880061435904L, 148118);
  }
  
  public abstract int acR();
  
  public abstract int acS();
  
  public abstract int acT();
  
  public abstract int acU();
  
  public abstract int getPageCount();
  
  public abstract int getRowCount();
  
  public abstract View kd(int paramInt);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */