package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;

public final class e
{
  public String appId;
  public int fNP;
  public int ftx;
  public String fwy;
  public final f irL;
  public volatile long joR;
  public volatile boolean joS;
  public int joT;
  public int joU;
  public long joV;
  public long joW;
  public String jop;
  public int scene;
  
  public e(f paramf)
  {
    GMTrace.i(18868462419968L, 140581);
    this.joS = false;
    this.irL = paramf;
    GMTrace.o(18868462419968L, 140581);
  }
  
  public final String toString()
  {
    GMTrace.i(18868596637696L, 140582);
    String str = "kv_14576{, networkType='" + this.jop + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.fNP + ", appState=" + this.ftx + ", scene=" + this.scene + ", sessionId='" + this.fwy + '\'' + ", is_download_code=" + this.joT + ", is_load_x5=" + this.joU + ", cost_time=" + this.joV + ", event_time=" + this.joW + '}';
    GMTrace.o(18868596637696L, 140582);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */