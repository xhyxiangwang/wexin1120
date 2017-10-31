package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class no
  extends com.tencent.mm.bl.a
{
  public int jXo;
  public String tKf;
  public int tKg;
  public int tvn;
  public long tvv;
  
  public no()
  {
    GMTrace.i(3950027735040L, 29430);
    GMTrace.o(3950027735040L, 29430);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3950161952768L, 29431);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tvn);
      if (this.tKf != null) {
        paramVarArgs.e(2, this.tKf);
      }
      paramVarArgs.fd(3, this.jXo);
      paramVarArgs.fd(4, this.tKg);
      paramVarArgs.R(5, this.tvv);
      GMTrace.o(3950161952768L, 29431);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tvn) + 0;
      paramInt = i;
      if (this.tKf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tKf);
      }
      i = b.a.a.a.fa(3, this.jXo);
      int j = b.a.a.a.fa(4, this.tKg);
      int k = b.a.a.a.Q(5, this.tvv);
      GMTrace.o(3950161952768L, 29431);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3950161952768L, 29431);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      no localno = (no)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3950161952768L, 29431);
        return -1;
      case 1: 
        localno.tvn = locala.xSv.nm();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      case 2: 
        localno.tKf = locala.xSv.readString();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      case 3: 
        localno.jXo = locala.xSv.nm();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      case 4: 
        localno.tKg = locala.xSv.nm();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      }
      localno.tvv = locala.xSv.nn();
      GMTrace.o(3950161952768L, 29431);
      return 0;
    }
    GMTrace.o(3950161952768L, 29431);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */