package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bn
  extends com.tencent.mm.bl.a
{
  public String mCJ;
  public String mFN;
  
  public bn()
  {
    GMTrace.i(12637807050752L, 94159);
    GMTrace.o(12637807050752L, 94159);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12637941268480L, 94160);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.mFN == null) {
        throw new b("Not all required fields were included: Color");
      }
      if (this.mCJ != null) {
        paramVarArgs.e(1, this.mCJ);
      }
      if (this.mFN != null) {
        paramVarArgs.e(2, this.mFN);
      }
      GMTrace.o(12637941268480L, 94160);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mCJ == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.mCJ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mFN != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mFN);
      }
      GMTrace.o(12637941268480L, 94160);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mCJ == null) {
          throw new b("Not all required fields were included: Name");
        }
        if (this.mFN == null) {
          throw new b("Not all required fields were included: Color");
        }
        GMTrace.o(12637941268480L, 94160);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bn localbn = (bn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12637941268480L, 94160);
          return -1;
        case 1: 
          localbn.mCJ = locala.xSv.readString();
          GMTrace.o(12637941268480L, 94160);
          return 0;
        }
        localbn.mFN = locala.xSv.readString();
        GMTrace.o(12637941268480L, 94160);
        return 0;
      }
      GMTrace.o(12637941268480L, 94160);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */