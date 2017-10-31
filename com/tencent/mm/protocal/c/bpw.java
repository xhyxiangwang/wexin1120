package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bpw
  extends com.tencent.mm.bl.a
{
  public int tBI;
  
  public bpw()
  {
    GMTrace.i(4025189662720L, 29990);
    GMTrace.o(4025189662720L, 29990);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4025323880448L, 29991);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fd(1, this.tBI);
      GMTrace.o(4025323880448L, 29991);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tBI);
      GMTrace.o(4025323880448L, 29991);
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
      GMTrace.o(4025323880448L, 29991);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpw localbpw = (bpw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4025323880448L, 29991);
        return -1;
      }
      localbpw.tBI = locala.xSv.nm();
      GMTrace.o(4025323880448L, 29991);
      return 0;
    }
    GMTrace.o(4025323880448L, 29991);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */