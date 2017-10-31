package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class np
  extends com.tencent.mm.bl.a
{
  public int tvn;
  public long tvv;
  
  public np()
  {
    GMTrace.i(3953517395968L, 29456);
    GMTrace.o(3953517395968L, 29456);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3953651613696L, 29457);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tvn);
      paramVarArgs.R(2, this.tvv);
      GMTrace.o(3953651613696L, 29457);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tvn);
      int i = b.a.a.a.Q(2, this.tvv);
      GMTrace.o(3953651613696L, 29457);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3953651613696L, 29457);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      np localnp = (np)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3953651613696L, 29457);
        return -1;
      case 1: 
        localnp.tvn = locala.xSv.nm();
        GMTrace.o(3953651613696L, 29457);
        return 0;
      }
      localnp.tvv = locala.xSv.nn();
      GMTrace.o(3953651613696L, 29457);
      return 0;
    }
    GMTrace.o(3953651613696L, 29457);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/np.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */