package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class beb
  extends com.tencent.mm.bl.a
{
  public int uwj;
  public int uwk;
  
  public beb()
  {
    GMTrace.i(3680652754944L, 27423);
    GMTrace.o(3680652754944L, 27423);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3680786972672L, 27424);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uwj);
      paramVarArgs.fd(2, this.uwk);
      GMTrace.o(3680786972672L, 27424);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.uwj);
      int i = b.a.a.a.fa(2, this.uwk);
      GMTrace.o(3680786972672L, 27424);
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
      GMTrace.o(3680786972672L, 27424);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      beb localbeb = (beb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3680786972672L, 27424);
        return -1;
      case 1: 
        localbeb.uwj = locala.xSv.nm();
        GMTrace.o(3680786972672L, 27424);
        return 0;
      }
      localbeb.uwk = locala.xSv.nm();
      GMTrace.o(3680786972672L, 27424);
      return 0;
    }
    GMTrace.o(3680786972672L, 27424);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/beb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */