package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class e
  extends com.tencent.mm.bl.a
{
  public long jRD;
  
  public e()
  {
    GMTrace.i(14836561870848L, 110541);
    GMTrace.o(14836561870848L, 110541);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14836696088576L, 110542);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).R(1, this.jRD);
      GMTrace.o(14836696088576L, 110542);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.Q(1, this.jRD);
      GMTrace.o(14836696088576L, 110542);
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
      GMTrace.o(14836696088576L, 110542);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14836696088576L, 110542);
        return -1;
      }
      locale.jRD = locala.xSv.nn();
      GMTrace.o(14836696088576L, 110542);
      return 0;
    }
    GMTrace.o(14836696088576L, 110542);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */