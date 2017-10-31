package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cp
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public String mDD;
  public int tvT;
  public String tvU;
  
  public cp()
  {
    GMTrace.i(3684679286784L, 27453);
    GMTrace.o(3684679286784L, 27453);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3684813504512L, 27454);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDD != null) {
        paramVarArgs.e(1, this.mDD);
      }
      paramVarArgs.fd(2, this.jXP);
      paramVarArgs.fd(3, this.tvT);
      if (this.tvU != null) {
        paramVarArgs.e(4, this.tvU);
      }
      GMTrace.o(3684813504512L, 27454);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDD == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDD) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.jXP) + b.a.a.a.fa(3, this.tvT);
      paramInt = i;
      if (this.tvU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tvU);
      }
      GMTrace.o(3684813504512L, 27454);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3684813504512L, 27454);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cp localcp = (cp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3684813504512L, 27454);
          return -1;
        case 1: 
          localcp.mDD = locala.xSv.readString();
          GMTrace.o(3684813504512L, 27454);
          return 0;
        case 2: 
          localcp.jXP = locala.xSv.nm();
          GMTrace.o(3684813504512L, 27454);
          return 0;
        case 3: 
          localcp.tvT = locala.xSv.nm();
          GMTrace.o(3684813504512L, 27454);
          return 0;
        }
        localcp.tvU = locala.xSv.readString();
        GMTrace.o(3684813504512L, 27454);
        return 0;
      }
      GMTrace.o(3684813504512L, 27454);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */