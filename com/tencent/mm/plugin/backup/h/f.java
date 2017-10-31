package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class f
  extends com.tencent.mm.bl.a
{
  public long jRD;
  
  public f()
  {
    GMTrace.i(14837635612672L, 110549);
    GMTrace.o(14837635612672L, 110549);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14837769830400L, 110550);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).R(1, this.jRD);
      GMTrace.o(14837769830400L, 110550);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.Q(1, this.jRD);
      GMTrace.o(14837769830400L, 110550);
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
      GMTrace.o(14837769830400L, 110550);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14837769830400L, 110550);
        return -1;
      }
      localf.jRD = locala.xSv.nn();
      GMTrace.o(14837769830400L, 110550);
      return 0;
    }
    GMTrace.o(14837769830400L, 110550);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */