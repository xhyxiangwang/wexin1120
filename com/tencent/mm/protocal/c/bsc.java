package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsc
  extends com.tencent.mm.bl.a
{
  public int lpk;
  public String lpl;
  
  public bsc()
  {
    GMTrace.i(3869631315968L, 28831);
    GMTrace.o(3869631315968L, 28831);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3869765533696L, 28832);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.lpk);
      if (this.lpl != null) {
        paramVarArgs.e(2, this.lpl);
      }
      GMTrace.o(3869765533696L, 28832);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.lpk) + 0;
      paramInt = i;
      if (this.lpl != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lpl);
      }
      GMTrace.o(3869765533696L, 28832);
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
      GMTrace.o(3869765533696L, 28832);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsc localbsc = (bsc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3869765533696L, 28832);
        return -1;
      case 1: 
        localbsc.lpk = locala.xSv.nm();
        GMTrace.o(3869765533696L, 28832);
        return 0;
      }
      localbsc.lpl = locala.xSv.readString();
      GMTrace.o(3869765533696L, 28832);
      return 0;
    }
    GMTrace.o(3869765533696L, 28832);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */