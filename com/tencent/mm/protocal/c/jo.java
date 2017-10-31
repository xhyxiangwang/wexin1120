package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jo
  extends com.tencent.mm.bl.a
{
  public String code;
  public String knp;
  
  public jo()
  {
    GMTrace.i(3897682821120L, 29040);
    GMTrace.o(3897682821120L, 29040);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3897817038848L, 29041);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.knp != null) {
        paramVarArgs.e(1, this.knp);
      }
      if (this.code != null) {
        paramVarArgs.e(2, this.code);
      }
      GMTrace.o(3897817038848L, 29041);
      return 0;
    }
    if (paramInt == 1) {
      if (this.knp == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.knp) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.code != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.code);
      }
      GMTrace.o(3897817038848L, 29041);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3897817038848L, 29041);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jo localjo = (jo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3897817038848L, 29041);
          return -1;
        case 1: 
          localjo.knp = locala.xSv.readString();
          GMTrace.o(3897817038848L, 29041);
          return 0;
        }
        localjo.code = locala.xSv.readString();
        GMTrace.o(3897817038848L, 29041);
        return 0;
      }
      GMTrace.o(3897817038848L, 29041);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */