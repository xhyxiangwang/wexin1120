package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcq
  extends axc
{
  public long tDg;
  public int ttY;
  public axs uuy;
  
  public bcq()
  {
    GMTrace.i(3665754587136L, 27312);
    GMTrace.o(3665754587136L, 27312);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3665888804864L, 27313);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.R(2, this.tDg);
      paramVarArgs.fd(3, this.ttY);
      if (this.uuy != null)
      {
        paramVarArgs.ff(4, this.uuy.aWM());
        this.uuy.a(paramVarArgs);
      }
      GMTrace.o(3665888804864L, 27313);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.Q(2, this.tDg) + b.a.a.a.fa(3, this.ttY);
      paramInt = i;
      if (this.uuy != null) {
        paramInt = i + b.a.a.a.fc(4, this.uuy.aWM());
      }
      GMTrace.o(3665888804864L, 27313);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3665888804864L, 27313);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcq localbcq = (bcq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3665888804864L, 27313);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbcq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3665888804864L, 27313);
        return 0;
      case 2: 
        localbcq.tDg = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3665888804864L, 27313);
        return 0;
      case 3: 
        localbcq.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3665888804864L, 27313);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localbcq.uuy = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3665888804864L, 27313);
      return 0;
    }
    GMTrace.o(3665888804864L, 27313);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */