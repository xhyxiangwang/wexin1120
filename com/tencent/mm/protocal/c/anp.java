package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anp
  extends com.tencent.mm.bl.a
{
  public int ujy;
  public int ujz;
  
  public anp()
  {
    GMTrace.i(3847619608576L, 28667);
    GMTrace.o(3847619608576L, 28667);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3847753826304L, 28668);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.ujy);
      paramVarArgs.fd(2, this.ujz);
      GMTrace.o(3847753826304L, 28668);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.ujy);
      int i = b.a.a.a.fa(2, this.ujz);
      GMTrace.o(3847753826304L, 28668);
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
      GMTrace.o(3847753826304L, 28668);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      anp localanp = (anp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3847753826304L, 28668);
        return -1;
      case 1: 
        localanp.ujy = locala.xSv.nm();
        GMTrace.o(3847753826304L, 28668);
        return 0;
      }
      localanp.ujz = locala.xSv.nm();
      GMTrace.o(3847753826304L, 28668);
      return 0;
    }
    GMTrace.o(3847753826304L, 28668);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/anp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */