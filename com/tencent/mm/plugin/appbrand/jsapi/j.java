package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends e
{
  private static final int CTRL_INDEX = 248;
  private static final String NAME = "onUserCaptureScreen";
  private static j iPH;
  
  static
  {
    GMTrace.i(17395691290624L, 129608);
    iPH = new j();
    GMTrace.o(17395691290624L, 129608);
  }
  
  public j()
  {
    GMTrace.i(17395422855168L, 129606);
    GMTrace.o(17395422855168L, 129606);
  }
  
  public static void pS(String paramString)
  {
    GMTrace.i(17395557072896L, 129607);
    w.i("MicroMsg.AppBrandOnUserCaptureScreenEvent", "user capture screen event dispatch, appId:%s", new Object[] { paramString });
    iPH.aj(paramString, 0).VI();
    GMTrace.o(17395557072896L, 129607);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */