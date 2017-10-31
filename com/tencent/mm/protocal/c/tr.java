package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tr
  extends com.tencent.mm.bl.a
{
  public int fzx;
  public String id;
  public int meC;
  public String tRM;
  public long tRN;
  
  public tr()
  {
    GMTrace.i(3954054266880L, 29460);
    GMTrace.o(3954054266880L, 29460);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3954188484608L, 29461);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.e(1, this.id);
      }
      paramVarArgs.fd(2, this.meC);
      if (this.tRM != null) {
        paramVarArgs.e(3, this.tRM);
      }
      paramVarArgs.R(4, this.tRN);
      paramVarArgs.fd(5, this.fzx);
      GMTrace.o(3954188484608L, 29461);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label454;
      }
    }
    label454:
    for (paramInt = b.a.a.b.b.a.f(1, this.id) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.meC);
      paramInt = i;
      if (this.tRM != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tRM);
      }
      i = b.a.a.a.Q(4, this.tRN);
      int j = b.a.a.a.fa(5, this.fzx);
      GMTrace.o(3954188484608L, 29461);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3954188484608L, 29461);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tr localtr = (tr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3954188484608L, 29461);
          return -1;
        case 1: 
          localtr.id = locala.xSv.readString();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        case 2: 
          localtr.meC = locala.xSv.nm();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        case 3: 
          localtr.tRM = locala.xSv.readString();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        case 4: 
          localtr.tRN = locala.xSv.nn();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        }
        localtr.fzx = locala.xSv.nm();
        GMTrace.o(3954188484608L, 29461);
        return 0;
      }
      GMTrace.o(3954188484608L, 29461);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */