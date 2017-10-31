package com.tencent.mm.plugin.game.gamewebview.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.plugin.game.model.ah.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;

public final class c
{
  public static void z(Context paramContext, int paramInt)
  {
    GMTrace.i(16938545709056L, 126202);
    paramContext = ah.a.h(12909, new Object[] { Integer.valueOf(5), Integer.valueOf(5), Integer.valueOf(1), Integer.valueOf(6), Integer.valueOf(0), null, Integer.valueOf(paramInt), Integer.valueOf(0), null, Integer.valueOf(bg.getInt(null, 0)), Integer.valueOf(ai.cB(paramContext)), null });
    b.a locala = new b.a();
    locala.uri = "/cgi-bin/micromsg-bin/gamereportkv";
    locala.hlW = 427;
    locala.hlZ = 0;
    locala.hma = 0;
    uk localuk = new uk();
    localuk.tBR = d.toR;
    localuk.tBS = d.toQ;
    localuk.tBT = d.toT;
    localuk.tBU = d.toU;
    localuk.tBV = v.bMQ();
    localuk.paC = paramContext.hPv;
    localuk.tBW = paramContext.mBW;
    locala.hlX = localuk;
    GMTrace.o(16938545709056L, 126202);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */