package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bpo
  extends com.tencent.mm.bl.a
{
  public String twR;
  public long uFB;
  
  public bpo()
  {
    GMTrace.i(3765746794496L, 28057);
    GMTrace.o(3765746794496L, 28057);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3765881012224L, 28058);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.twR == null) {
        throw new b("Not all required fields were included: Username");
      }
      paramVarArgs.R(1, this.uFB);
      if (this.twR != null) {
        paramVarArgs.e(2, this.twR);
      }
      GMTrace.o(3765881012224L, 28058);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.Q(1, this.uFB) + 0;
      paramInt = i;
      if (this.twR != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.twR);
      }
      GMTrace.o(3765881012224L, 28058);
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
      if (this.twR == null) {
        throw new b("Not all required fields were included: Username");
      }
      GMTrace.o(3765881012224L, 28058);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpo localbpo = (bpo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3765881012224L, 28058);
        return -1;
      case 1: 
        localbpo.uFB = locala.xSv.nn();
        GMTrace.o(3765881012224L, 28058);
        return 0;
      }
      localbpo.twR = locala.xSv.readString();
      GMTrace.o(3765881012224L, 28058);
      return 0;
    }
    GMTrace.o(3765881012224L, 28058);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */