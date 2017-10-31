package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jp
  extends com.tencent.mm.bl.a
{
  public int jXo;
  public String tFF;
  public long tFG;
  public int tFH;
  public int tvf;
  
  public jp()
  {
    GMTrace.i(3860772945920L, 28765);
    GMTrace.o(3860772945920L, 28765);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3860907163648L, 28766);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tFF != null) {
        paramVarArgs.e(1, this.tFF);
      }
      paramVarArgs.R(2, this.tFG);
      paramVarArgs.fd(3, this.tFH);
      paramVarArgs.fd(4, this.tvf);
      paramVarArgs.fd(5, this.jXo);
      GMTrace.o(3860907163648L, 28766);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tFF == null) {
        break label442;
      }
    }
    label442:
    for (paramInt = b.a.a.b.b.a.f(1, this.tFF) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.Q(2, this.tFG);
      int j = b.a.a.a.fa(3, this.tFH);
      int k = b.a.a.a.fa(4, this.tvf);
      int m = b.a.a.a.fa(5, this.jXo);
      GMTrace.o(3860907163648L, 28766);
      return paramInt + i + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3860907163648L, 28766);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jp localjp = (jp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3860907163648L, 28766);
          return -1;
        case 1: 
          localjp.tFF = locala.xSv.readString();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        case 2: 
          localjp.tFG = locala.xSv.nn();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        case 3: 
          localjp.tFH = locala.xSv.nm();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        case 4: 
          localjp.tvf = locala.xSv.nm();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        }
        localjp.jXo = locala.xSv.nm();
        GMTrace.o(3860907163648L, 28766);
        return 0;
      }
      GMTrace.o(3860907163648L, 28766);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */