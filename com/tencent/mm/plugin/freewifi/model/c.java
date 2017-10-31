package com.tencent.mm.plugin.freewifi.model;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;

public final class c
{
  private HandlerThread mdC;
  private ae mdD;
  
  public c()
  {
    GMTrace.i(7131256324096L, 53132);
    GMTrace.o(7131256324096L, 53132);
  }
  
  public final ae azR()
  {
    GMTrace.i(7131390541824L, 53133);
    if (this.mdC == null)
    {
      this.mdC = e.Sc("FreeWifiHandlerThread_handlerThread");
      this.mdC.start();
    }
    if (this.mdD == null) {
      this.mdD = new ae(this.mdC.getLooper());
    }
    ae localae = this.mdD;
    GMTrace.o(7131390541824L, 53133);
    return localae;
  }
  
  public final void release()
  {
    GMTrace.i(7131524759552L, 53134);
    if (this.mdC != null)
    {
      this.mdC.quit();
      this.mdC = null;
    }
    this.mdD = null;
    GMTrace.o(7131524759552L, 53134);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */