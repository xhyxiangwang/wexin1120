package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aml
  extends com.tencent.mm.bl.a
{
  public int mFT;
  public int twh;
  public int uhw;
  
  public aml()
  {
    GMTrace.i(16872644804608L, 125711);
    GMTrace.o(16872644804608L, 125711);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16872779022336L, 125712);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.twh);
      paramVarArgs.fd(2, this.mFT);
      paramVarArgs.fd(3, this.uhw);
      GMTrace.o(16872779022336L, 125712);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.twh);
      int i = b.a.a.a.fa(2, this.mFT);
      int j = b.a.a.a.fa(3, this.uhw);
      GMTrace.o(16872779022336L, 125712);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16872779022336L, 125712);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aml localaml = (aml)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16872779022336L, 125712);
        return -1;
      case 1: 
        localaml.twh = locala.xSv.nm();
        GMTrace.o(16872779022336L, 125712);
        return 0;
      case 2: 
        localaml.mFT = locala.xSv.nm();
        GMTrace.o(16872779022336L, 125712);
        return 0;
      }
      localaml.uhw = locala.xSv.nm();
      GMTrace.o(16872779022336L, 125712);
      return 0;
    }
    GMTrace.o(16872779022336L, 125712);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */