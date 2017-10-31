package com.tencent.mm.plugin.favorite.b;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class aj
  implements w.a
{
  public static w lQh;
  private static aj lQi;
  public int duration;
  public int fBu;
  public String path;
  
  static
  {
    GMTrace.i(6279376404480L, 46785);
    lQh = null;
    lQi = null;
    GMTrace.o(6279376404480L, 46785);
  }
  
  public aj()
  {
    GMTrace.i(6278436880384L, 46778);
    GMTrace.o(6278436880384L, 46778);
  }
  
  public static aj axw()
  {
    GMTrace.i(6278571098112L, 46779);
    if (lQi == null) {
      lQi = new aj();
    }
    aj localaj = lQi;
    GMTrace.o(6278571098112L, 46779);
    return localaj;
  }
  
  public static w axx()
  {
    GMTrace.i(6278705315840L, 46780);
    if (lQh == null) {
      lQh = new w();
    }
    w localw = lQh;
    GMTrace.o(6278705315840L, 46780);
    return localw;
  }
  
  public static w axy()
  {
    GMTrace.i(6278839533568L, 46781);
    w localw = lQh;
    GMTrace.o(6278839533568L, 46781);
    return localw;
  }
  
  public final void aX(String paramString, int paramInt)
  {
    GMTrace.i(6278973751296L, 46782);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.WNNoteVoicePlayLogic", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 1);
    if (!bg.ap(paramString, "").equals(this.path)) {
      localBundle.putBoolean("result", true);
    }
    for (;;)
    {
      localBundle.putInt("position", paramInt);
      paramString = new kf();
      paramString.fHF.fHA = localBundle;
      paramString.fHF.type = 4;
      a.uLm.m(paramString);
      GMTrace.o(6278973751296L, 46782);
      return;
      localBundle.putBoolean("result", false);
    }
  }
  
  public final void onFinish()
  {
    GMTrace.i(6279107969024L, 46783);
    lQh.ahm();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 2);
    kf localkf = new kf();
    localkf.fHF.fHA = localBundle;
    localkf.fHF.type = 4;
    a.uLm.m(localkf);
    GMTrace.o(6279107969024L, 46783);
  }
  
  public final void onPause()
  {
    GMTrace.i(6279242186752L, 46784);
    lQh.awY();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 3);
    kf localkf = new kf();
    localkf.fHF.fHA = localBundle;
    localkf.fHF.type = 4;
    a.uLm.m(localkf);
    GMTrace.o(6279242186752L, 46784);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */