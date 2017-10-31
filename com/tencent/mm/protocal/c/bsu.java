package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsu
  extends com.tencent.mm.bl.a
{
  public String paD;
  public String tBb;
  
  public bsu()
  {
    GMTrace.i(15352897470464L, 114388);
    GMTrace.o(15352897470464L, 114388);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15353031688192L, 114389);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tBb != null) {
        paramVarArgs.e(1, this.tBb);
      }
      if (this.paD != null) {
        paramVarArgs.e(2, this.paD);
      }
      GMTrace.o(15353031688192L, 114389);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tBb == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.tBb) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.paD != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.paD);
      }
      GMTrace.o(15353031688192L, 114389);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(15353031688192L, 114389);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsu localbsu = (bsu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15353031688192L, 114389);
          return -1;
        case 1: 
          localbsu.tBb = locala.xSv.readString();
          GMTrace.o(15353031688192L, 114389);
          return 0;
        }
        localbsu.paD = locala.xSv.readString();
        GMTrace.o(15353031688192L, 114389);
        return 0;
      }
      GMTrace.o(15353031688192L, 114389);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */