package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bf
  extends com.tencent.mm.bl.a
{
  public int tuP;
  public b tuQ;
  public long tuR;
  
  public bf()
  {
    GMTrace.i(3705617252352L, 27609);
    GMTrace.o(3705617252352L, 27609);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3705751470080L, 27610);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tuP);
      if (this.tuQ != null) {
        paramVarArgs.b(2, this.tuQ);
      }
      paramVarArgs.R(3, this.tuR);
      GMTrace.o(3705751470080L, 27610);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.tuP) + 0;
      paramInt = i;
      if (this.tuQ != null) {
        paramInt = i + b.a.a.a.a(2, this.tuQ);
      }
      i = b.a.a.a.Q(3, this.tuR);
      GMTrace.o(3705751470080L, 27610);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3705751470080L, 27610);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bf localbf = (bf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3705751470080L, 27610);
        return -1;
      case 1: 
        localbf.tuP = locala.xSv.nm();
        GMTrace.o(3705751470080L, 27610);
        return 0;
      case 2: 
        localbf.tuQ = locala.cpI();
        GMTrace.o(3705751470080L, 27610);
        return 0;
      }
      localbf.tuR = locala.xSv.nn();
      GMTrace.o(3705751470080L, 27610);
      return 0;
    }
    GMTrace.o(3705751470080L, 27610);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */