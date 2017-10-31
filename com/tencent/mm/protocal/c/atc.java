package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class atc
  extends com.tencent.mm.bl.a
{
  public String ufP;
  public int uoI;
  
  public atc()
  {
    GMTrace.i(3736218894336L, 27837);
    GMTrace.o(3736218894336L, 27837);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3736353112064L, 27838);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufP == null) {
        throw new b("Not all required fields were included: Ip");
      }
      if (this.ufP != null) {
        paramVarArgs.e(1, this.ufP);
      }
      paramVarArgs.fd(2, this.uoI);
      GMTrace.o(3736353112064L, 27838);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ufP == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.ufP) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.uoI);
      GMTrace.o(3736353112064L, 27838);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.ufP == null) {
          throw new b("Not all required fields were included: Ip");
        }
        GMTrace.o(3736353112064L, 27838);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        atc localatc = (atc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3736353112064L, 27838);
          return -1;
        case 1: 
          localatc.ufP = locala.xSv.readString();
          GMTrace.o(3736353112064L, 27838);
          return 0;
        }
        localatc.uoI = locala.xSv.nm();
        GMTrace.o(3736353112064L, 27838);
        return 0;
      }
      GMTrace.o(3736353112064L, 27838);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */