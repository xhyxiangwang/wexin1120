package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aud
  extends com.tencent.mm.bl.a
{
  public String data;
  public String kpf;
  
  public aud()
  {
    GMTrace.i(18813298933760L, 140170);
    GMTrace.o(18813298933760L, 140170);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18813433151488L, 140171);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kpf != null) {
        paramVarArgs.e(1, this.kpf);
      }
      if (this.data != null) {
        paramVarArgs.e(2, this.data);
      }
      GMTrace.o(18813433151488L, 140171);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kpf == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.kpf) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.data != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.data);
      }
      GMTrace.o(18813433151488L, 140171);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(18813433151488L, 140171);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aud localaud = (aud)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18813433151488L, 140171);
          return -1;
        case 1: 
          localaud.kpf = locala.xSv.readString();
          GMTrace.o(18813433151488L, 140171);
          return 0;
        }
        localaud.data = locala.xSv.readString();
        GMTrace.o(18813433151488L, 140171);
        return 0;
      }
      GMTrace.o(18813433151488L, 140171);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */