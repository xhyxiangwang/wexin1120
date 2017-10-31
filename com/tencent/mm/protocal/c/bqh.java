package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bqh
  extends com.tencent.mm.bl.a
{
  public b jWD;
  public long uFB;
  
  public bqh()
  {
    GMTrace.i(3929895075840L, 29280);
    GMTrace.o(3929895075840L, 29280);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3930029293568L, 29281);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.uFB);
      if (this.jWD != null) {
        paramVarArgs.b(2, this.jWD);
      }
      GMTrace.o(3930029293568L, 29281);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.Q(1, this.uFB) + 0;
      paramInt = i;
      if (this.jWD != null) {
        paramInt = i + b.a.a.a.a(2, this.jWD);
      }
      GMTrace.o(3930029293568L, 29281);
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
      GMTrace.o(3930029293568L, 29281);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqh localbqh = (bqh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3930029293568L, 29281);
        return -1;
      case 1: 
        localbqh.uFB = locala.xSv.nn();
        GMTrace.o(3930029293568L, 29281);
        return 0;
      }
      localbqh.jWD = locala.cpI();
      GMTrace.o(3930029293568L, 29281);
      return 0;
    }
    GMTrace.o(3930029293568L, 29281);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */