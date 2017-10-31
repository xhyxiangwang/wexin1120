package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhd
  extends com.tencent.mm.bl.a
{
  public long uyC;
  public long uyD;
  public int uyE;
  
  public bhd()
  {
    GMTrace.i(3901440917504L, 29068);
    GMTrace.o(3901440917504L, 29068);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3901575135232L, 29069);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.uyC);
      paramVarArgs.R(2, this.uyD);
      paramVarArgs.fd(3, this.uyE);
      GMTrace.o(3901575135232L, 29069);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.Q(1, this.uyC);
      int i = b.a.a.a.Q(2, this.uyD);
      int j = b.a.a.a.fa(3, this.uyE);
      GMTrace.o(3901575135232L, 29069);
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
      GMTrace.o(3901575135232L, 29069);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bhd localbhd = (bhd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3901575135232L, 29069);
        return -1;
      case 1: 
        localbhd.uyC = locala.xSv.nn();
        GMTrace.o(3901575135232L, 29069);
        return 0;
      case 2: 
        localbhd.uyD = locala.xSv.nn();
        GMTrace.o(3901575135232L, 29069);
        return 0;
      }
      localbhd.uyE = locala.xSv.nm();
      GMTrace.o(3901575135232L, 29069);
      return 0;
    }
    GMTrace.o(3901575135232L, 29069);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */