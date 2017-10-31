package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class be
  extends com.tencent.mm.bl.a
{
  public int bTH;
  public int tuO;
  
  public be()
  {
    GMTrace.i(4007607140352L, 29859);
    GMTrace.o(4007607140352L, 29859);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4007741358080L, 29860);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.bTH);
      paramVarArgs.fd(2, this.tuO);
      GMTrace.o(4007741358080L, 29860);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.bTH);
      int i = b.a.a.a.fa(2, this.tuO);
      GMTrace.o(4007741358080L, 29860);
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
      GMTrace.o(4007741358080L, 29860);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      be localbe = (be)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4007741358080L, 29860);
        return -1;
      case 1: 
        localbe.bTH = locala.xSv.nm();
        GMTrace.o(4007741358080L, 29860);
        return 0;
      }
      localbe.tuO = locala.xSv.nm();
      GMTrace.o(4007741358080L, 29860);
      return 0;
    }
    GMTrace.o(4007741358080L, 29860);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */