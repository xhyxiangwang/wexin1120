package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.e.a;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.s;

public final class f
{
  private static final f jBe;
  private final a<s, Integer> jBd;
  
  static
  {
    GMTrace.i(15421214294016L, 114897);
    jBe = new f();
    GMTrace.o(15421214294016L, 114897);
  }
  
  public f()
  {
    GMTrace.i(15420543205376L, 114892);
    this.jBd = new a();
    GMTrace.o(15420543205376L, 114892);
  }
  
  public static f abN()
  {
    GMTrace.i(15420677423104L, 114893);
    f localf = jBe;
    GMTrace.o(15420677423104L, 114893);
    return localf;
  }
  
  final void o(s params)
  {
    GMTrace.i(15420811640832L, 114894);
    if (params == null)
    {
      GMTrace.o(15420811640832L, 114894);
      return;
    }
    this.jBd.remove(params);
    params.getView().setFocusable(true);
    params.getView().setFocusableInTouchMode(true);
    GMTrace.o(15420811640832L, 114894);
  }
  
  public final void p(s params)
  {
    GMTrace.i(15420945858560L, 114895);
    if (params == null)
    {
      GMTrace.o(15420945858560L, 114895);
      return;
    }
    Integer localInteger2 = (Integer)this.jBd.get(params);
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    int i = localInteger1.intValue();
    this.jBd.put(params, Integer.valueOf(i + 1));
    params.getView().setFocusable(false);
    params.getView().setFocusableInTouchMode(false);
    GMTrace.o(15420945858560L, 114895);
  }
  
  public final void q(s params)
  {
    GMTrace.i(15421080076288L, 114896);
    if (params == null)
    {
      GMTrace.o(15421080076288L, 114896);
      return;
    }
    Integer localInteger = (Integer)this.jBd.get(params);
    if (localInteger != null)
    {
      localInteger = Integer.valueOf(localInteger.intValue() - 1);
      if (localInteger.intValue() > 0) {}
    }
    else
    {
      o(params);
      GMTrace.o(15421080076288L, 114896);
      return;
    }
    this.jBd.put(params, localInteger);
    GMTrace.o(15421080076288L, 114896);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */