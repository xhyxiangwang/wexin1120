package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqg
  extends com.tencent.mm.bl.a
{
  public long uFM;
  public boolean uFQ;
  
  public bqg()
  {
    GMTrace.i(3781852921856L, 28177);
    GMTrace.o(3781852921856L, 28177);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3781987139584L, 28178);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.uFM);
      paramVarArgs.af(2, this.uFQ);
      GMTrace.o(3781987139584L, 28178);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.Q(1, this.uFM);
      int i = b.a.a.b.b.a.cK(2);
      GMTrace.o(3781987139584L, 28178);
      return paramInt + 0 + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3781987139584L, 28178);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqg localbqg = (bqg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3781987139584L, 28178);
        return -1;
      case 1: 
        localbqg.uFM = locala.xSv.nn();
        GMTrace.o(3781987139584L, 28178);
        return 0;
      }
      localbqg.uFQ = locala.cpH();
      GMTrace.o(3781987139584L, 28178);
      return 0;
    }
    GMTrace.o(3781987139584L, 28178);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */