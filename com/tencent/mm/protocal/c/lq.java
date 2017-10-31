package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class lq
  extends com.tencent.mm.bl.a
{
  public b tId;
  public LinkedList<b> tIe;
  
  public lq()
  {
    GMTrace.i(15346186584064L, 114338);
    this.tIe = new LinkedList();
    GMTrace.o(15346186584064L, 114338);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15346320801792L, 114339);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tId != null) {
        paramVarArgs.b(1, this.tId);
      }
      paramVarArgs.d(2, 6, this.tIe);
      GMTrace.o(15346320801792L, 114339);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tId == null) {
        break label292;
      }
    }
    label292:
    for (paramInt = b.a.a.a.a(1, this.tId) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.c(2, 6, this.tIe);
      GMTrace.o(15346320801792L, 114339);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.tIe.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(15346320801792L, 114339);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        lq locallq = (lq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15346320801792L, 114339);
          return -1;
        case 1: 
          locallq.tId = locala.cpI();
          GMTrace.o(15346320801792L, 114339);
          return 0;
        }
        locallq.tIe.add(locala.cpI());
        GMTrace.o(15346320801792L, 114339);
        return 0;
      }
      GMTrace.o(15346320801792L, 114339);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */