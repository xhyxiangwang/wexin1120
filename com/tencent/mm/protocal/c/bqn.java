package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqn
  extends com.tencent.mm.bl.a
{
  public String uFL;
  public int uFX;
  
  public bqn()
  {
    GMTrace.i(3710180655104L, 27643);
    GMTrace.o(3710180655104L, 27643);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3710314872832L, 27644);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      paramVarArgs.fd(2, this.uFX);
      GMTrace.o(3710314872832L, 27644);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.uFL) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.uFX);
      GMTrace.o(3710314872832L, 27644);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFL == null) {
          throw new b("Not all required fields were included: Talker");
        }
        GMTrace.o(3710314872832L, 27644);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqn localbqn = (bqn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3710314872832L, 27644);
          return -1;
        case 1: 
          localbqn.uFL = locala.xSv.readString();
          GMTrace.o(3710314872832L, 27644);
          return 0;
        }
        localbqn.uFX = locala.xSv.nm();
        GMTrace.o(3710314872832L, 27644);
        return 0;
      }
      GMTrace.o(3710314872832L, 27644);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */