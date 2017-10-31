package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jc
  extends com.tencent.mm.bl.a
{
  public String tEi;
  
  public jc()
  {
    GMTrace.i(3744540393472L, 27899);
    GMTrace.o(3744540393472L, 27899);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3744674611200L, 27900);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tEi != null) {
        paramVarArgs.e(1, this.tEi);
      }
      GMTrace.o(3744674611200L, 27900);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tEi == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.tEi) + 0;; paramInt = 0)
    {
      GMTrace.o(3744674611200L, 27900);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3744674611200L, 27900);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jc localjc = (jc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3744674611200L, 27900);
          return -1;
        }
        localjc.tEi = locala.xSv.readString();
        GMTrace.o(3744674611200L, 27900);
        return 0;
      }
      GMTrace.o(3744674611200L, 27900);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */