package com.tencent.mm.plugin.backup.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
{
  public static int jMN;
  public static int jMO;
  public static int jMP;
  public static int jMQ;
  public static int jMR;
  public static int jMS;
  public static int jMT;
  public static long jMU;
  public static long jMV;
  public static long jMW;
  
  public static void adX()
  {
    GMTrace.i(14730798301184L, 109753);
    w.d("MicroMsg.TestInfo", "total_count: " + jMT + "text_count: " + jMP + "normal_count : " + jMO + " image_count: " + jMN + " voice_count : " + jMR + " video_count " + jMQ + " app_count : " + jMS + " time: " + (bg.Pp() - jMU) + " net: " + jMW);
    GMTrace.o(14730798301184L, 109753);
  }
  
  public static void adY()
  {
    GMTrace.i(14730932518912L, 109754);
    w.d("MicroMsg.TestInfo", "netTime" + (bg.Pp() - jMV));
    GMTrace.o(14730932518912L, 109754);
  }
  
  public static void kn(int paramInt)
  {
    GMTrace.i(14730664083456L, 109752);
    switch (paramInt)
    {
    }
    for (;;)
    {
      jMT += 1;
      GMTrace.o(14730664083456L, 109752);
      return;
      jMP += 1;
      continue;
      jMS += 1;
      continue;
      jMR += 1;
      continue;
      jMQ += 1;
      continue;
      jMN += 1;
      continue;
      jMO += 1;
    }
  }
  
  public static void reset()
  {
    GMTrace.i(14730529865728L, 109751);
    jMN = 0;
    jMO = 0;
    jMP = 0;
    jMQ = 0;
    jMR = 0;
    jMS = 0;
    jMT = 0;
    long l = bg.Pp();
    jMU = l;
    jMW = l - jMV;
    GMTrace.o(14730529865728L, 109751);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */