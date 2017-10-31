package com.tencent.mm.plugin.appbrand.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;

public final class AppBrandInToolsUI
  extends AppBrandUI
{
  public AppBrandInToolsUI()
  {
    GMTrace.i(19703565123584L, 146803);
    GMTrace.o(19703565123584L, 146803);
  }
  
  protected final boolean ZX()
  {
    GMTrace.i(19703967776768L, 146806);
    try
    {
      KVCommCrossProcessReceiver.bag();
      GMTrace.o(19703967776768L, 146806);
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AppBrandInToolsUI", localException, "sendKV", new Object[0]);
      }
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19703699341312L, 146804);
    super.onCreate(paramBundle);
    if (!isFinishing()) {
      o.lock();
    }
    GMTrace.o(19703699341312L, 146804);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19703833559040L, 146805);
    super.onDestroy();
    o.unlock();
    GMTrace.o(19703833559040L, 146805);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandInToolsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */