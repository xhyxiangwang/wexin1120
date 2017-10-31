package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class brb
  extends com.tencent.mm.bl.a
{
  public String uGi;
  public String uGj;
  public String uGk;
  
  public brb()
  {
    GMTrace.i(3814467829760L, 28420);
    GMTrace.o(3814467829760L, 28420);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3814602047488L, 28421);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uGi == null) {
        throw new b("Not all required fields were included: Plugin");
      }
      if (this.uGj == null) {
        throw new b("Not all required fields were included: ActivityPath");
      }
      if (this.uGi != null) {
        paramVarArgs.e(1, this.uGi);
      }
      if (this.uGj != null) {
        paramVarArgs.e(2, this.uGj);
      }
      if (this.uGk != null) {
        paramVarArgs.e(3, this.uGk);
      }
      GMTrace.o(3814602047488L, 28421);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uGi == null) {
        break label438;
      }
    }
    label438:
    for (int i = b.a.a.b.b.a.f(1, this.uGi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uGj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uGj);
      }
      i = paramInt;
      if (this.uGk != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uGk);
      }
      GMTrace.o(3814602047488L, 28421);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uGi == null) {
          throw new b("Not all required fields were included: Plugin");
        }
        if (this.uGj == null) {
          throw new b("Not all required fields were included: ActivityPath");
        }
        GMTrace.o(3814602047488L, 28421);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brb localbrb = (brb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3814602047488L, 28421);
          return -1;
        case 1: 
          localbrb.uGi = locala.xSv.readString();
          GMTrace.o(3814602047488L, 28421);
          return 0;
        case 2: 
          localbrb.uGj = locala.xSv.readString();
          GMTrace.o(3814602047488L, 28421);
          return 0;
        }
        localbrb.uGk = locala.xSv.readString();
        GMTrace.o(3814602047488L, 28421);
        return 0;
      }
      GMTrace.o(3814602047488L, 28421);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */