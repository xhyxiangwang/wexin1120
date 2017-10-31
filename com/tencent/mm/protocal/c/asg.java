package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class asg
  extends com.tencent.mm.bl.a
{
  public String unU;
  public String unV;
  
  public asg()
  {
    GMTrace.i(3987474481152L, 29709);
    GMTrace.o(3987474481152L, 29709);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3987608698880L, 29710);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.unU != null) {
        paramVarArgs.e(1, this.unU);
      }
      if (this.unV != null) {
        paramVarArgs.e(2, this.unV);
      }
      GMTrace.o(3987608698880L, 29710);
      return 0;
    }
    if (paramInt == 1) {
      if (this.unU == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.unU) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.unV != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.unV);
      }
      GMTrace.o(3987608698880L, 29710);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3987608698880L, 29710);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        asg localasg = (asg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3987608698880L, 29710);
          return -1;
        case 1: 
          localasg.unU = locala.xSv.readString();
          GMTrace.o(3987608698880L, 29710);
          return 0;
        }
        localasg.unV = locala.xSv.readString();
        GMTrace.o(3987608698880L, 29710);
        return 0;
      }
      GMTrace.o(3987608698880L, 29710);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/asg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */