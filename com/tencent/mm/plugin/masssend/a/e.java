package com.tencent.mm.plugin.masssend.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bl.a
{
  public int count;
  public LinkedList<d> nGw;
  
  public e()
  {
    GMTrace.i(11215636004864L, 83563);
    this.nGw = new LinkedList();
    GMTrace.o(11215636004864L, 83563);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11215770222592L, 83564);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.count);
      paramVarArgs.d(2, 8, this.nGw);
      GMTrace.o(11215770222592L, 83564);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.count);
      i = b.a.a.a.c(2, 8, this.nGw);
      GMTrace.o(11215770222592L, 83564);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nGw.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(11215770222592L, 83564);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(11215770222592L, 83564);
        return -1;
      case 1: 
        locale.count = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(11215770222592L, 83564);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new d();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        locale.nGw.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(11215770222592L, 83564);
      return 0;
    }
    GMTrace.o(11215770222592L, 83564);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */