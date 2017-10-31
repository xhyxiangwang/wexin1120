package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class agb
  extends com.tencent.mm.bl.a
{
  public long fRn;
  public b ubB;
  
  public agb()
  {
    GMTrace.i(3687632076800L, 27475);
    GMTrace.o(3687632076800L, 27475);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3687766294528L, 27476);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.fRn);
      if (this.ubB != null) {
        paramVarArgs.b(2, this.ubB);
      }
      GMTrace.o(3687766294528L, 27476);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.Q(1, this.fRn) + 0;
      paramInt = i;
      if (this.ubB != null) {
        paramInt = i + b.a.a.a.a(2, this.ubB);
      }
      GMTrace.o(3687766294528L, 27476);
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
      GMTrace.o(3687766294528L, 27476);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      agb localagb = (agb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3687766294528L, 27476);
        return -1;
      case 1: 
        localagb.fRn = locala.xSv.nn();
        GMTrace.o(3687766294528L, 27476);
        return 0;
      }
      localagb.ubB = locala.cpI();
      GMTrace.o(3687766294528L, 27476);
      return 0;
    }
    GMTrace.o(3687766294528L, 27476);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/agb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */