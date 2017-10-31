package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;

public final class f
  extends com.tencent.mm.bl.a
{
  public int qif;
  public long qih;
  
  public f()
  {
    GMTrace.i(8865080934400L, 66050);
    GMTrace.o(8865080934400L, 66050);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8865215152128L, 66051);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.qih);
      paramVarArgs.fd(2, this.qif);
      GMTrace.o(8865215152128L, 66051);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.Q(1, this.qih);
      int i = b.a.a.a.fa(2, this.qif);
      GMTrace.o(8865215152128L, 66051);
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
      GMTrace.o(8865215152128L, 66051);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(8865215152128L, 66051);
        return -1;
      case 1: 
        localf.qih = locala.xSv.nn();
        GMTrace.o(8865215152128L, 66051);
        return 0;
      }
      localf.qif = locala.xSv.nm();
      GMTrace.o(8865215152128L, 66051);
      return 0;
    }
    GMTrace.o(8865215152128L, 66051);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */