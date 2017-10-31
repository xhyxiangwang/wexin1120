package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ce
  extends com.tencent.mm.bl.a
{
  public String hbA;
  public String mGx;
  
  public ce()
  {
    GMTrace.i(19276618530816L, 143622);
    GMTrace.o(19276618530816L, 143622);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19276752748544L, 143623);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.hbA != null) {
        paramVarArgs.e(1, this.hbA);
      }
      if (this.mGx != null) {
        paramVarArgs.e(2, this.mGx);
      }
      GMTrace.o(19276752748544L, 143623);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbA == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.hbA) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mGx != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mGx);
      }
      GMTrace.o(19276752748544L, 143623);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(19276752748544L, 143623);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ce localce = (ce)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19276752748544L, 143623);
          return -1;
        case 1: 
          localce.hbA = locala.xSv.readString();
          GMTrace.o(19276752748544L, 143623);
          return 0;
        }
        localce.mGx = locala.xSv.readString();
        GMTrace.o(19276752748544L, 143623);
        return 0;
      }
      GMTrace.o(19276752748544L, 143623);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */