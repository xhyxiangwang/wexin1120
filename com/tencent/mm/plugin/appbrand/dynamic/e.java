package com.tencent.mm.plugin.appbrand.dynamic;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static volatile e iKE;
  public Map<String, WeakReference<View>> iKF;
  
  private e()
  {
    GMTrace.i(17729759215616L, 132097);
    this.iKF = new ConcurrentHashMap();
    GMTrace.o(17729759215616L, 132097);
  }
  
  public static e UC()
  {
    GMTrace.i(17729893433344L, 132098);
    if (iKE == null) {}
    try
    {
      if (iKE == null) {
        iKE = new e();
      }
      e locale = iKE;
      GMTrace.o(17729893433344L, 132098);
      return locale;
    }
    finally {}
  }
  
  public final View po(String paramString)
  {
    GMTrace.i(18941476864000L, 141125);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.DynamicPageViewMgr", "get view from manager failed, key is null or nil.");
      GMTrace.o(18941476864000L, 141125);
      return null;
    }
    paramString = (WeakReference)this.iKF.get(paramString);
    if (paramString != null)
    {
      paramString = (View)paramString.get();
      GMTrace.o(18941476864000L, 141125);
      return paramString;
    }
    GMTrace.o(18941476864000L, 141125);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */