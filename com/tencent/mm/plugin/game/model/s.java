package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;
import java.util.Map;

public final class s
{
  static void a(Map<String, String> paramMap, q paramq)
  {
    GMTrace.i(12626398543872L, 94074);
    paramq.mAo.clear();
    int i = 0;
    if (i == 0) {}
    for (String str = ".sysmsg.gamecenter.userinfo";; str = ".sysmsg.gamecenter.userinfo" + i)
    {
      if (!paramMap.containsKey(str)) {
        break label273;
      }
      q.h localh = new q.h();
      localh.userName = bg.ap((String)paramMap.get(str + ".username"), "");
      localh.aDw = bg.ap((String)paramMap.get(str + ".nickname"), "");
      localh.mBm = bg.ap((String)paramMap.get(str + ".usericon"), "");
      localh.mBo = bg.ap((String)paramMap.get(str + ".badge_icon"), "");
      localh.mBp = bg.ap((String)paramMap.get(str + ".$jump_id"), "");
      paramq.mAo.add(localh);
      i += 1;
      break;
    }
    label273:
    GMTrace.o(12626398543872L, 94074);
  }
  
  static void b(Map<String, String> paramMap, q paramq)
  {
    boolean bool2 = true;
    GMTrace.i(15199083954176L, 113242);
    paramq.mAF.url = bg.ap((String)paramMap.get(".sysmsg.gamecenter.floatlayer.open_url"), "");
    q.a locala = paramq.mAF;
    if (bg.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.full_screen"), 0) == 1)
    {
      bool1 = true;
      locala.mAa = bool1;
      paramq.mAF.orientation = bg.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.orientation"), 0);
      paramq = paramq.mAF;
      if (bg.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.is_transparent"), 0) != 1) {
        break label133;
      }
    }
    label133:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramq.mBc = bool1;
      GMTrace.o(15199083954176L, 113242);
      return;
      bool1 = false;
      break;
    }
  }
  
  static String s(Map<String, String> paramMap)
  {
    GMTrace.i(12626264326144L, 94073);
    paramMap = bg.ap((String)paramMap.get(".sysmsg.gamecenter.formatcontent"), "");
    GMTrace.o(12626264326144L, 94073);
    return paramMap;
  }
  
  static long t(Map<String, String> paramMap)
  {
    GMTrace.i(12626532761600L, 94075);
    long l = bg.getLong((String)paramMap.get(".sysmsg.game_control_info.control_flag"), 0L);
    GMTrace.o(12626532761600L, 94075);
    return l;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */