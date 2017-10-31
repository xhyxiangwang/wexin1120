package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bpq
  extends com.tencent.mm.bl.a
{
  public String jWW;
  public int jXP;
  public String jYc;
  
  public bpq()
  {
    GMTrace.i(3849767092224L, 28683);
    GMTrace.o(3849767092224L, 28683);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3849901309952L, 28684);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWW == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.jYc == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      paramVarArgs.fd(3, this.jXP);
      GMTrace.o(3849901309952L, 28684);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWW == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWW) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jYc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jYc);
      }
      paramInt = b.a.a.a.fa(3, this.jXP);
      GMTrace.o(3849901309952L, 28684);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jWW == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.jYc == null) {
          throw new b("Not all required fields were included: NickName");
        }
        GMTrace.o(3849901309952L, 28684);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bpq localbpq = (bpq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3849901309952L, 28684);
          return -1;
        case 1: 
          localbpq.jWW = locala.xSv.readString();
          GMTrace.o(3849901309952L, 28684);
          return 0;
        case 2: 
          localbpq.jYc = locala.xSv.readString();
          GMTrace.o(3849901309952L, 28684);
          return 0;
        }
        localbpq.jXP = locala.xSv.nm();
        GMTrace.o(3849901309952L, 28684);
        return 0;
      }
      GMTrace.o(3849901309952L, 28684);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */