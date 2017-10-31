package com.tencent.mm.plugin.game.gamewebview.a;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static final Map<String, Integer> mtI;
  
  static
  {
    GMTrace.i(16938277273600L, 126200);
    HashMap localHashMap = new HashMap();
    mtI = localHashMap;
    localHashMap.put("addDownloadTaskStraight", Integer.valueOf(1));
    mtI.put("cancelDownloadTask", Integer.valueOf(2));
    mtI.put("pauseDownloadTask", Integer.valueOf(3));
    mtI.put("resumeDownloadTask", Integer.valueOf(4));
    mtI.put("openCustomWebview", Integer.valueOf(5));
    mtI.put("openUrlWithExtraWebview", Integer.valueOf(6));
    mtI.put("sendAppMessage", Integer.valueOf(7));
    GMTrace.o(16938277273600L, 126200);
  }
  
  public static int yE(String paramString)
  {
    GMTrace.i(16938143055872L, 126199);
    if (!mtI.containsKey(paramString))
    {
      GMTrace.o(16938143055872L, 126199);
      return 0;
    }
    int i = ((Integer)mtI.get(paramString)).intValue();
    GMTrace.o(16938143055872L, 126199);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */