package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ag
  extends com.tencent.mm.bl.a
{
  public String jWW;
  
  public ag()
  {
    GMTrace.i(3781584486400L, 28175);
    GMTrace.o(3781584486400L, 28175);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3781718704128L, 28176);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      GMTrace.o(3781718704128L, 28176);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWW == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWW) + 0;; paramInt = 0)
    {
      GMTrace.o(3781718704128L, 28176);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3781718704128L, 28176);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ag localag = (ag)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3781718704128L, 28176);
          return -1;
        }
        localag.jWW = locala.xSv.readString();
        GMTrace.o(3781718704128L, 28176);
        return 0;
      }
      GMTrace.o(3781718704128L, 28176);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */