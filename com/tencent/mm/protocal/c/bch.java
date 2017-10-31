package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bch
  extends com.tencent.mm.bl.a
{
  public String nat;
  public String tMi;
  
  public bch()
  {
    GMTrace.i(3973650055168L, 29606);
    GMTrace.o(3973650055168L, 29606);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3973784272896L, 29607);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tMi != null) {
        paramVarArgs.e(1, this.tMi);
      }
      if (this.nat != null) {
        paramVarArgs.e(2, this.nat);
      }
      GMTrace.o(3973784272896L, 29607);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tMi == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tMi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.nat != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nat);
      }
      GMTrace.o(3973784272896L, 29607);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3973784272896L, 29607);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bch localbch = (bch)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3973784272896L, 29607);
          return -1;
        case 1: 
          localbch.tMi = locala.xSv.readString();
          GMTrace.o(3973784272896L, 29607);
          return 0;
        }
        localbch.nat = locala.xSv.readString();
        GMTrace.o(3973784272896L, 29607);
        return 0;
      }
      GMTrace.o(3973784272896L, 29607);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */