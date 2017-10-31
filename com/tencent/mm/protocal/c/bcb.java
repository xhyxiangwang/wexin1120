package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bcb
  extends com.tencent.mm.bl.a
{
  public int tAS;
  public int ude;
  public String username;
  
  public bcb()
  {
    GMTrace.i(20072932311040L, 149555);
    GMTrace.o(20072932311040L, 149555);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20073066528768L, 149556);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.fd(2, this.ude);
      paramVarArgs.fd(3, this.tAS);
      GMTrace.o(20073066528768L, 149556);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label333;
      }
    }
    label333:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.ude);
      int j = b.a.a.a.fa(3, this.tAS);
      GMTrace.o(20073066528768L, 149556);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(20073066528768L, 149556);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bcb localbcb = (bcb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20073066528768L, 149556);
          return -1;
        case 1: 
          localbcb.username = locala.xSv.readString();
          GMTrace.o(20073066528768L, 149556);
          return 0;
        case 2: 
          localbcb.ude = locala.xSv.nm();
          GMTrace.o(20073066528768L, 149556);
          return 0;
        }
        localbcb.tAS = locala.xSv.nm();
        GMTrace.o(20073066528768L, 149556);
        return 0;
      }
      GMTrace.o(20073066528768L, 149556);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */