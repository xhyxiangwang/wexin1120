package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqx
  extends com.tencent.mm.bl.a
{
  public String tXq;
  public int ttY;
  public String uFL;
  
  public bqx()
  {
    GMTrace.i(3757156859904L, 27993);
    GMTrace.o(3757156859904L, 27993);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3757291077632L, 27994);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.tXq == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      if (this.tXq != null) {
        paramVarArgs.e(2, this.tXq);
      }
      paramVarArgs.fd(3, this.ttY);
      GMTrace.o(3757291077632L, 27994);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.uFL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tXq != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tXq);
      }
      paramInt = b.a.a.a.fa(3, this.ttY);
      GMTrace.o(3757291077632L, 27994);
      return i + paramInt;
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
        if (this.tXq == null) {
          throw new b("Not all required fields were included: Text");
        }
        GMTrace.o(3757291077632L, 27994);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqx localbqx = (bqx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3757291077632L, 27994);
          return -1;
        case 1: 
          localbqx.uFL = locala.xSv.readString();
          GMTrace.o(3757291077632L, 27994);
          return 0;
        case 2: 
          localbqx.tXq = locala.xSv.readString();
          GMTrace.o(3757291077632L, 27994);
          return 0;
        }
        localbqx.ttY = locala.xSv.nm();
        GMTrace.o(3757291077632L, 27994);
        return 0;
      }
      GMTrace.o(3757291077632L, 27994);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */