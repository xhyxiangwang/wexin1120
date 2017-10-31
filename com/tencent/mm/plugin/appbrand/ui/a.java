package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;

public final class a
  extends i.a
{
  private boolean jqb;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10505892659200L, 78275);
    this.jqb = false;
    if ((paramContext instanceof Activity)) {
      this.jqb = g.c(((Activity)paramContext).getWindow());
    }
    GMTrace.o(10505892659200L, 78275);
  }
  
  public final i ZT()
  {
    GMTrace.i(10506026876928L, 78276);
    i locali = super.ZT();
    g.a(locali.getWindow(), this.jqb);
    GMTrace.o(10506026876928L, 78276);
    return locali;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */