package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anv
  extends com.tencent.mm.bl.a
{
  public int pau;
  
  public anv()
  {
    GMTrace.i(16871436845056L, 125702);
    GMTrace.o(16871436845056L, 125702);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16871571062784L, 125703);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fd(1, this.pau);
      GMTrace.o(16871571062784L, 125703);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.pau);
      GMTrace.o(16871571062784L, 125703);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16871571062784L, 125703);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      anv localanv = (anv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16871571062784L, 125703);
        return -1;
      }
      localanv.pau = locala.xSv.nm();
      GMTrace.o(16871571062784L, 125703);
      return 0;
    }
    GMTrace.o(16871571062784L, 125703);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/anv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */