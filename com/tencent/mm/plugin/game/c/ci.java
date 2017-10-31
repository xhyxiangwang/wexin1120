package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ci
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mDg;
  public String mDh;
  public String mFy;
  
  public ci()
  {
    GMTrace.i(12649886646272L, 94249);
    GMTrace.o(12649886646272L, 94249);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12650020864000L, 94250);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFy != null) {
        paramVarArgs.e(1, this.mFy);
      }
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      if (this.mDg != null) {
        paramVarArgs.e(3, this.mDg);
      }
      if (this.mDh != null) {
        paramVarArgs.e(4, this.mDh);
      }
      GMTrace.o(12650020864000L, 94250);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFy == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.mFy) + 0;; i = 0)
    {
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = paramInt;
      if (this.mDg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDg);
      }
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDh);
      }
      GMTrace.o(12650020864000L, 94250);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12650020864000L, 94250);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ci localci = (ci)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12650020864000L, 94250);
          return -1;
        case 1: 
          localci.mFy = locala.xSv.readString();
          GMTrace.o(12650020864000L, 94250);
          return 0;
        case 2: 
          localci.fuw = locala.xSv.readString();
          GMTrace.o(12650020864000L, 94250);
          return 0;
        case 3: 
          localci.mDg = locala.xSv.readString();
          GMTrace.o(12650020864000L, 94250);
          return 0;
        }
        localci.mDh = locala.xSv.readString();
        GMTrace.o(12650020864000L, 94250);
        return 0;
      }
      GMTrace.o(12650020864000L, 94250);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */