package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  Context jFb;
  boolean jFs;
  int jFw;
  int jFx;
  b sCT;
  WebViewSmileyPanel.a sCU;
  
  public c()
  {
    GMTrace.i(12076911165440L, 89980);
    this.jFs = false;
    GMTrace.o(12076911165440L, 89980);
  }
  
  public final a bDO()
  {
    GMTrace.i(12077045383168L, 89981);
    if (this.sCT == null)
    {
      this.sCT = new b();
      this.sCT.jFb = this.jFb;
      this.sCT.a(this);
    }
    b localb = this.sCT;
    GMTrace.o(12077045383168L, 89981);
    return localb;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */