package com.tencent.mm.plugin.game.b;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  public a()
  {
    GMTrace.i(17978062012416L, 133947);
    GMTrace.o(17978062012416L, 133947);
  }
  
  public final String getName()
  {
    GMTrace.i(17978464665600L, 133950);
    GMTrace.o(17978464665600L, 133950);
    return "FTS5GameStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(17978733101056L, 133952);
    GMTrace.o(17978733101056L, 133952);
    return 16;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(17978330447872L, 133949);
    GMTrace.o(17978330447872L, 133949);
    return "Game";
  }
  
  public final int getType()
  {
    GMTrace.i(17978598883328L, 133951);
    GMTrace.o(17978598883328L, 133951);
    return 16;
  }
  
  protected final void vw()
  {
    GMTrace.i(17978196230144L, 133948);
    if (vx()) {
      j(-103L, 1L);
    }
    GMTrace.o(17978196230144L, 133948);
  }
  
  protected final boolean vx()
  {
    GMTrace.i(17978867318784L, 133953);
    if (!ce(-103, 1))
    {
      GMTrace.o(17978867318784L, 133953);
      return true;
    }
    GMTrace.o(17978867318784L, 133953);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */