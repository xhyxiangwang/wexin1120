package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.game.c.cg;

public final class ag
  extends aa
{
  public cg mBT;
  
  public ag(a parama)
  {
    GMTrace.i(12607742279680L, 93935);
    if (parama == null)
    {
      this.mBT = new cg();
      GMTrace.o(12607742279680L, 93935);
      return;
    }
    this.mBT = ((cg)parama);
    GMTrace.o(12607742279680L, 93935);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */