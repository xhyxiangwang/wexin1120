package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cv
  extends com.tencent.mm.bl.a
{
  public int twm;
  public String twn;
  
  public cv()
  {
    GMTrace.i(4011633672192L, 29889);
    GMTrace.o(4011633672192L, 29889);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4011767889920L, 29890);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.twm);
      if (this.twn != null) {
        paramVarArgs.e(2, this.twn);
      }
      GMTrace.o(4011767889920L, 29890);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.twm) + 0;
      paramInt = i;
      if (this.twn != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.twn);
      }
      GMTrace.o(4011767889920L, 29890);
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
      GMTrace.o(4011767889920L, 29890);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cv localcv = (cv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4011767889920L, 29890);
        return -1;
      case 1: 
        localcv.twm = locala.xSv.nm();
        GMTrace.o(4011767889920L, 29890);
        return 0;
      }
      localcv.twn = locala.xSv.readString();
      GMTrace.o(4011767889920L, 29890);
      return 0;
    }
    GMTrace.o(4011767889920L, 29890);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */