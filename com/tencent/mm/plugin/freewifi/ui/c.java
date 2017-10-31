package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static String TAG;
  public boolean aDR;
  public a.a iWS;
  ae iWT;
  public a mhh;
  
  static
  {
    GMTrace.i(7207626211328L, 53701);
    TAG = "MicroMsg.FreeWifi.FreeWifiGetLocation";
    GMTrace.o(7207626211328L, 53701);
  }
  
  public c()
  {
    GMTrace.i(7206552469504L, 53693);
    this.mhh = null;
    this.iWS = null;
    this.iWT = null;
    this.aDR = false;
    GMTrace.o(7206552469504L, 53693);
  }
  
  public static c aAU()
  {
    GMTrace.i(7206686687232L, 53694);
    c localc = b.mhk;
    GMTrace.o(7206686687232L, 53694);
    return localc;
  }
  
  public static abstract interface a
  {
    public abstract void t(float paramFloat1, float paramFloat2);
  }
  
  private static final class b
  {
    public static c mhk;
    
    static
    {
      GMTrace.i(7160650006528L, 53351);
      mhk = new c();
      GMTrace.o(7160650006528L, 53351);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */