package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bkw
  extends com.tencent.mm.bl.a
{
  public int errCode;
  public String ftU;
  
  public bkw()
  {
    GMTrace.i(3758230601728L, 28001);
    GMTrace.o(3758230601728L, 28001);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3758364819456L, 28002);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.errCode);
      if (this.ftU != null) {
        paramVarArgs.e(2, this.ftU);
      }
      GMTrace.o(3758364819456L, 28002);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.errCode) + 0;
      paramInt = i;
      if (this.ftU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ftU);
      }
      GMTrace.o(3758364819456L, 28002);
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
      GMTrace.o(3758364819456L, 28002);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bkw localbkw = (bkw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3758364819456L, 28002);
        return -1;
      case 1: 
        localbkw.errCode = locala.xSv.nm();
        GMTrace.o(3758364819456L, 28002);
        return 0;
      }
      localbkw.ftU = locala.xSv.readString();
      GMTrace.o(3758364819456L, 28002);
      return 0;
    }
    GMTrace.o(3758364819456L, 28002);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bkw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */