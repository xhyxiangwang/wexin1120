package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tp
  extends com.tencent.mm.bl.a
{
  public int tRK;
  public String text;
  
  public tp()
  {
    GMTrace.i(3752056586240L, 27955);
    GMTrace.o(3752056586240L, 27955);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3752190803968L, 27956);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.text != null) {
        paramVarArgs.e(1, this.text);
      }
      paramVarArgs.fd(2, this.tRK);
      GMTrace.o(3752190803968L, 27956);
      return 0;
    }
    if (paramInt == 1) {
      if (this.text == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.text) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.tRK);
      GMTrace.o(3752190803968L, 27956);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3752190803968L, 27956);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tp localtp = (tp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3752190803968L, 27956);
          return -1;
        case 1: 
          localtp.text = locala.xSv.readString();
          GMTrace.o(3752190803968L, 27956);
          return 0;
        }
        localtp.tRK = locala.xSv.nm();
        GMTrace.o(3752190803968L, 27956);
        return 0;
      }
      GMTrace.o(3752190803968L, 27956);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */