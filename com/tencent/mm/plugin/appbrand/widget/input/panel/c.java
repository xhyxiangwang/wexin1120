package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bs.e;
import com.tencent.mm.sdk.platformtools.ab;

public class c
{
  public Context jFb;
  boolean jFs;
  public b jFu;
  public AppBrandSmileyPanelBase.a jFv;
  int jFw;
  int jFx;
  
  public c()
  {
    GMTrace.i(19877511299072L, 148099);
    this.jFs = false;
    GMTrace.o(19877511299072L, 148099);
  }
  
  public static int[] aat()
  {
    GMTrace.i(19877779734528L, 148101);
    Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    GMTrace.o(19877779734528L, 148101);
    return new int[] { i, j };
  }
  
  public e acJ()
  {
    GMTrace.i(19877913952256L, 148102);
    e locale = e.bOH();
    GMTrace.o(19877913952256L, 148102);
    return locale;
  }
  
  public final a acY()
  {
    GMTrace.i(19877645516800L, 148100);
    if (this.jFu == null)
    {
      this.jFu = new b();
      this.jFu.jFb = this.jFb;
      this.jFu.a(this);
    }
    b localb = this.jFu;
    GMTrace.o(19877645516800L, 148100);
    return localb;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */