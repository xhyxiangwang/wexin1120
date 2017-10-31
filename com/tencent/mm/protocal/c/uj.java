package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class uj
  extends com.tencent.mm.bl.a
{
  public String tSy;
  
  public uj()
  {
    GMTrace.i(3683337109504L, 27443);
    GMTrace.o(3683337109504L, 27443);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3683471327232L, 27444);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSy != null) {
        paramVarArgs.e(1, this.tSy);
      }
      GMTrace.o(3683471327232L, 27444);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tSy == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.tSy) + 0;; paramInt = 0)
    {
      GMTrace.o(3683471327232L, 27444);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3683471327232L, 27444);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        uj localuj = (uj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3683471327232L, 27444);
          return -1;
        }
        localuj.tSy = locala.xSv.readString();
        GMTrace.o(3683471327232L, 27444);
        return 0;
      }
      GMTrace.o(3683471327232L, 27444);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */