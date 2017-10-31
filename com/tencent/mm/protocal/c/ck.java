package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ck
  extends com.tencent.mm.bl.a
{
  public String tvN;
  public String tvO;
  
  public ck()
  {
    GMTrace.i(3666291458048L, 27316);
    GMTrace.o(3666291458048L, 27316);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3666425675776L, 27317);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tvN != null) {
        paramVarArgs.e(1, this.tvN);
      }
      if (this.tvO != null) {
        paramVarArgs.e(2, this.tvO);
      }
      GMTrace.o(3666425675776L, 27317);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tvN == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tvN) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tvO != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tvO);
      }
      GMTrace.o(3666425675776L, 27317);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3666425675776L, 27317);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ck localck = (ck)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3666425675776L, 27317);
          return -1;
        case 1: 
          localck.tvN = locala.xSv.readString();
          GMTrace.o(3666425675776L, 27317);
          return 0;
        }
        localck.tvO = locala.xSv.readString();
        GMTrace.o(3666425675776L, 27317);
        return 0;
      }
      GMTrace.o(3666425675776L, 27317);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */