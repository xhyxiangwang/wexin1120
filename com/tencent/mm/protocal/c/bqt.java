package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqt
  extends com.tencent.mm.bl.a
{
  public int tBI;
  
  public bqt()
  {
    GMTrace.i(3777557954560L, 28145);
    GMTrace.o(3777557954560L, 28145);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3777692172288L, 28146);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fd(1, this.tBI);
      GMTrace.o(3777692172288L, 28146);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tBI);
      GMTrace.o(3777692172288L, 28146);
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
      GMTrace.o(3777692172288L, 28146);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqt localbqt = (bqt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3777692172288L, 28146);
        return -1;
      }
      localbqt.tBI = locala.xSv.nm();
      GMTrace.o(3777692172288L, 28146);
      return 0;
    }
    GMTrace.o(3777692172288L, 28146);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */