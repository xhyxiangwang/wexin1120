package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class o
  extends com.tencent.mm.bl.a
{
  public String mDG;
  
  public o()
  {
    GMTrace.i(12644249501696L, 94207);
    GMTrace.o(12644249501696L, 94207);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12644383719424L, 94208);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDG != null) {
        paramVarArgs.e(1, this.mDG);
      }
      GMTrace.o(12644383719424L, 94208);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDG == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDG) + 0;; paramInt = 0)
    {
      GMTrace.o(12644383719424L, 94208);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12644383719424L, 94208);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        o localo = (o)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12644383719424L, 94208);
          return -1;
        }
        localo.mDG = locala.xSv.readString();
        GMTrace.o(12644383719424L, 94208);
        return 0;
      }
      GMTrace.o(12644383719424L, 94208);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */