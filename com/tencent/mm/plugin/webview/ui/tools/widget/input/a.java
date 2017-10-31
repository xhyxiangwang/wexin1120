package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  Context jFb;
  int jFd;
  protected c sCN;
  
  public a()
  {
    GMTrace.i(12074226810880L, 89960);
    this.jFd = 0;
    GMTrace.o(12074226810880L, 89960);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(12074092593152L, 89959);
    this.sCN = paramc;
    GMTrace.o(12074092593152L, 89959);
  }
  
  public abstract int acR();
  
  public abstract int acS();
  
  public abstract int acT();
  
  public abstract int acU();
  
  public abstract int getPageCount();
  
  public abstract int getRowCount();
  
  public abstract View kd(int paramInt);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */