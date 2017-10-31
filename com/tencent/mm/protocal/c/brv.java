package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brv
  extends com.tencent.mm.bl.a
{
  public int tsx;
  public String ueQ;
  
  public brv()
  {
    GMTrace.i(17615539929088L, 131246);
    GMTrace.o(17615539929088L, 131246);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615674146816L, 131247);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tsx);
      if (this.ueQ != null) {
        paramVarArgs.e(2, this.ueQ);
      }
      GMTrace.o(17615674146816L, 131247);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tsx) + 0;
      paramInt = i;
      if (this.ueQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ueQ);
      }
      GMTrace.o(17615674146816L, 131247);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17615674146816L, 131247);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brv localbrv = (brv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17615674146816L, 131247);
        return -1;
      case 1: 
        localbrv.tsx = locala.xSv.nm();
        GMTrace.o(17615674146816L, 131247);
        return 0;
      }
      localbrv.ueQ = locala.xSv.readString();
      GMTrace.o(17615674146816L, 131247);
      return 0;
    }
    GMTrace.o(17615674146816L, 131247);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */