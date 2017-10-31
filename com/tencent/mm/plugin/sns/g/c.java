package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bl.a
{
  public LinkedList<Long> qhX;
  
  public c()
  {
    GMTrace.i(8865886240768L, 66056);
    this.qhX = new LinkedList();
    GMTrace.o(8865886240768L, 66056);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8866020458496L, 66057);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 3, this.qhX);
      GMTrace.o(8866020458496L, 66057);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 3, this.qhX);
      GMTrace.o(8866020458496L, 66057);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qhX.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(8866020458496L, 66057);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(8866020458496L, 66057);
        return -1;
      }
      localc.qhX.add(Long.valueOf(locala.xSv.nn()));
      GMTrace.o(8866020458496L, 66057);
      return 0;
    }
    GMTrace.o(8866020458496L, 66057);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */