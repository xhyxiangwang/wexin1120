package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ei
  extends com.tencent.mm.bl.a
{
  public int jWQ;
  public LinkedList<eh> jWR;
  
  public ei()
  {
    GMTrace.i(3636226686976L, 27092);
    this.jWR = new LinkedList();
    GMTrace.o(3636226686976L, 27092);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3636360904704L, 27093);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.jWQ);
      paramVarArgs.d(2, 8, this.jWR);
      GMTrace.o(3636360904704L, 27093);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.jWQ);
      i = b.a.a.a.c(2, 8, this.jWR);
      GMTrace.o(3636360904704L, 27093);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jWR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3636360904704L, 27093);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ei localei = (ei)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3636360904704L, 27093);
        return -1;
      case 1: 
        localei.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3636360904704L, 27093);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new eh();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((eh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localei.jWR.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3636360904704L, 27093);
      return 0;
    }
    GMTrace.o(3636360904704L, 27093);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */