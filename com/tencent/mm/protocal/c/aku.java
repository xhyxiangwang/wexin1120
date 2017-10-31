package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aku
  extends com.tencent.mm.bl.a
{
  public int ufH;
  
  public aku()
  {
    GMTrace.i(3644279750656L, 27152);
    GMTrace.o(3644279750656L, 27152);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3644413968384L, 27153);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fd(1, this.ufH);
      GMTrace.o(3644413968384L, 27153);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.ufH);
      GMTrace.o(3644413968384L, 27153);
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
      GMTrace.o(3644413968384L, 27153);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aku localaku = (aku)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3644413968384L, 27153);
        return -1;
      }
      localaku.ufH = locala.xSv.nm();
      GMTrace.o(3644413968384L, 27153);
      return 0;
    }
    GMTrace.o(3644413968384L, 27153);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */