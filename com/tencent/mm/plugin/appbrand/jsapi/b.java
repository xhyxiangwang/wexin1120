package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public abstract class b
{
  private String iPg;
  private Integer iPh;
  
  public b()
  {
    GMTrace.i(10427777941504L, 77693);
    Assert.assertTrue("Must declare NAME and CTRL_INDEX in subclasses", true);
    GMTrace.o(10427777941504L, 77693);
  }
  
  private Integer VG()
  {
    GMTrace.i(10428180594688L, 77696);
    Object localObject;
    if (this.iPh == null) {
      localObject = new c(this, "CTRL_INDEX", null);
    }
    try
    {
      this.iPh = ((Integer)((c)localObject).get());
      localObject = this.iPh;
      GMTrace.o(10428180594688L, 77696);
      return (Integer)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrand.BaseJsApi", "getCtrlIndex exp = %s", new Object[] { bg.f(localException) });
      }
    }
  }
  
  public final int VF()
  {
    GMTrace.i(10428046376960L, 77695);
    int i = bg.a(VG(), -1);
    GMTrace.o(10428046376960L, 77695);
    return i;
  }
  
  public final String getName()
  {
    GMTrace.i(10427912159232L, 77694);
    Object localObject;
    if (bg.mZ(this.iPg)) {
      localObject = new c(this, "NAME", null);
    }
    try
    {
      this.iPg = ((String)((c)localObject).get());
      localObject = this.iPg;
      GMTrace.o(10427912159232L, 77694);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrand.BaseJsApi", "getName exp = %s", new Object[] { bg.f(localException) });
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */