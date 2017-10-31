package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brw
  extends com.tencent.mm.bl.a
{
  public int tAS;
  public String uGT;
  public String uGU;
  
  public brw()
  {
    GMTrace.i(17616345235456L, 131252);
    GMTrace.o(17616345235456L, 131252);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17616479453184L, 131253);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tAS);
      if (this.uGT != null) {
        paramVarArgs.e(2, this.uGT);
      }
      if (this.uGU != null) {
        paramVarArgs.e(3, this.uGU);
      }
      GMTrace.o(17616479453184L, 131253);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tAS) + 0;
      paramInt = i;
      if (this.uGT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uGT);
      }
      i = paramInt;
      if (this.uGU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uGU);
      }
      GMTrace.o(17616479453184L, 131253);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17616479453184L, 131253);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brw localbrw = (brw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17616479453184L, 131253);
        return -1;
      case 1: 
        localbrw.tAS = locala.xSv.nm();
        GMTrace.o(17616479453184L, 131253);
        return 0;
      case 2: 
        localbrw.uGT = locala.xSv.readString();
        GMTrace.o(17616479453184L, 131253);
        return 0;
      }
      localbrw.uGU = locala.xSv.readString();
      GMTrace.o(17616479453184L, 131253);
      return 0;
    }
    GMTrace.o(17616479453184L, 131253);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */