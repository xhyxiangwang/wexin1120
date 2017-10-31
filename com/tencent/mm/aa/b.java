package com.tencent.mm.aa;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static String Dg()
  {
    GMTrace.i(20069845303296L, 149532);
    String str = "audio" + aa.QW(new StringBuilder().append(System.currentTimeMillis()).toString());
    GMTrace.o(20069845303296L, 149532);
    return str;
  }
  
  public static boolean hq(String paramString)
  {
    GMTrace.i(20069979521024L, 149533);
    w.i("MicroMsg.AudioPlayerHelper", "resumeAudio, audioId:%s", new Object[] { paramString });
    t localt = new t();
    localt.ftM.action = 1;
    localt.ftM.ftO = paramString;
    a.uLm.m(localt);
    boolean bool = localt.ftN.ftR;
    GMTrace.o(20069979521024L, 149533);
    return bool;
  }
  
  public static boolean hr(String paramString)
  {
    GMTrace.i(20070113738752L, 149534);
    t localt = new t();
    localt.ftM.action = 7;
    localt.ftM.ftO = paramString;
    a.uLm.m(localt);
    boolean bool = localt.ftN.ftR;
    GMTrace.o(20070113738752L, 149534);
    return bool;
  }
  
  public static boolean hs(String paramString)
  {
    GMTrace.i(20070247956480L, 149535);
    t localt = new t();
    localt.ftM.action = 8;
    localt.ftM.ftO = paramString;
    a.uLm.m(localt);
    boolean bool = localt.ftN.ftR;
    GMTrace.o(20070247956480L, 149535);
    return bool;
  }
  
  public static int ht(String paramString)
  {
    GMTrace.i(20070382174208L, 149536);
    w.i("MicroMsg.AudioPlayerHelper", "getAudioPlayerCount, appId:%s", new Object[] { paramString });
    t localt = new t();
    localt.ftM.action = 11;
    localt.ftM.appId = paramString;
    a.uLm.m(localt);
    int i = localt.ftN.count;
    GMTrace.o(20070382174208L, 149536);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/aa/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */