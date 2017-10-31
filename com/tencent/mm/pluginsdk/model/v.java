package com.tencent.mm.pluginsdk.model;

import android.os.FileObserver;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class v
  extends FileObserver
{
  private String pqo;
  private a sSK;
  
  public v(String paramString, a parama)
  {
    super(paramString);
    GMTrace.i(770812411904L, 5743);
    w.i("MicroMsg.ScreenshotObserver", "observer  " + paramString);
    this.sSK = parama;
    GMTrace.o(770812411904L, 5743);
  }
  
  public final void onEvent(int paramInt, String paramString)
  {
    GMTrace.i(770946629632L, 5744);
    if ((paramString != null) && (paramInt == 8) && ((this.pqo == null) || (!paramString.equalsIgnoreCase(this.pqo))))
    {
      this.pqo = paramString;
      this.sSK.bmC();
      w.i("MicroMsg.ScreenshotObserver", "Send event to listener. " + paramString);
    }
    GMTrace.o(770946629632L, 5744);
  }
  
  public final void start()
  {
    GMTrace.i(771080847360L, 5745);
    super.startWatching();
    GMTrace.o(771080847360L, 5745);
  }
  
  public final void stop()
  {
    GMTrace.i(771215065088L, 5746);
    super.stopWatching();
    GMTrace.o(771215065088L, 5746);
  }
  
  public static abstract interface a
  {
    public abstract void bmC();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */