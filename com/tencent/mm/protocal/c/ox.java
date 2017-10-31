package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ox
  extends com.tencent.mm.bl.a
{
  public String info;
  public int tKO;
  public int tKP;
  
  public ox()
  {
    GMTrace.i(3654077644800L, 27225);
    GMTrace.o(3654077644800L, 27225);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3654211862528L, 27226);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tKO);
      paramVarArgs.fd(2, this.tKP);
      if (this.info != null) {
        paramVarArgs.e(3, this.info);
      }
      GMTrace.o(3654211862528L, 27226);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tKO) + 0 + b.a.a.a.fa(2, this.tKP);
      paramInt = i;
      if (this.info != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.info);
      }
      GMTrace.o(3654211862528L, 27226);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3654211862528L, 27226);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ox localox = (ox)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3654211862528L, 27226);
        return -1;
      case 1: 
        localox.tKO = locala.xSv.nm();
        GMTrace.o(3654211862528L, 27226);
        return 0;
      case 2: 
        localox.tKP = locala.xSv.nm();
        GMTrace.o(3654211862528L, 27226);
        return 0;
      }
      localox.info = locala.xSv.readString();
      GMTrace.o(3654211862528L, 27226);
      return 0;
    }
    GMTrace.o(3654211862528L, 27226);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */