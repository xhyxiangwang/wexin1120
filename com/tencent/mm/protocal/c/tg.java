package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tg
  extends com.tencent.mm.bl.a
{
  public LinkedList<tf> tQK;
  
  public tg()
  {
    GMTrace.i(3793798299648L, 28266);
    this.tQK = new LinkedList();
    GMTrace.o(3793798299648L, 28266);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3793932517376L, 28267);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 8, this.tQK);
      GMTrace.o(3793932517376L, 28267);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.tQK);
      GMTrace.o(3793932517376L, 28267);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tQK.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3793932517376L, 28267);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tg localtg = (tg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3793932517376L, 28267);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new tf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((tf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localtg.tQK.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3793932517376L, 28267);
      return 0;
    }
    GMTrace.o(3793932517376L, 28267);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */