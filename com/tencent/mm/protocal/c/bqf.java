package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqf
  extends com.tencent.mm.bl.a
{
  public String jYc;
  public String uFL;
  public long uFN;
  
  public bqf()
  {
    GMTrace.i(3884529483776L, 28942);
    GMTrace.o(3884529483776L, 28942);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3884663701504L, 28943);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.jYc == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      paramVarArgs.R(3, this.uFN);
      GMTrace.o(3884663701504L, 28943);
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
      if (this.jYc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jYc);
      }
      paramInt = b.a.a.a.Q(3, this.uFN);
      GMTrace.o(3884663701504L, 28943);
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
        if (this.jYc == null) {
          throw new b("Not all required fields were included: NickName");
        }
        GMTrace.o(3884663701504L, 28943);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqf localbqf = (bqf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3884663701504L, 28943);
          return -1;
        case 1: 
          localbqf.uFL = locala.xSv.readString();
          GMTrace.o(3884663701504L, 28943);
          return 0;
        case 2: 
          localbqf.jYc = locala.xSv.readString();
          GMTrace.o(3884663701504L, 28943);
          return 0;
        }
        localbqf.uFN = locala.xSv.nn();
        GMTrace.o(3884663701504L, 28943);
        return 0;
      }
      GMTrace.o(3884663701504L, 28943);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */