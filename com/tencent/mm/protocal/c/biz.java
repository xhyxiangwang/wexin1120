package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class biz
  extends axc
{
  public int ttY;
  public axs tzY;
  public String uzB;
  public String uzC;
  
  public biz()
  {
    GMTrace.i(3792187686912L, 28254);
    GMTrace.o(3792187686912L, 28254);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3792321904640L, 28255);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uzB != null) {
        paramVarArgs.e(2, this.uzB);
      }
      if (this.uzC != null) {
        paramVarArgs.e(3, this.uzC);
      }
      paramVarArgs.fd(4, this.ttY);
      if (this.tzY != null)
      {
        paramVarArgs.ff(5, this.tzY.aWM());
        this.tzY.a(paramVarArgs);
      }
      GMTrace.o(3792321904640L, 28255);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.uzB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uzB);
      }
      i = paramInt;
      if (this.uzC != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uzC);
      }
      i += b.a.a.a.fa(4, this.ttY);
      paramInt = i;
      if (this.tzY != null) {
        paramInt = i + b.a.a.a.fc(5, this.tzY.aWM());
      }
      GMTrace.o(3792321904640L, 28255);
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
      GMTrace.o(3792321904640L, 28255);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      biz localbiz = (biz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3792321904640L, 28255);
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
          localbiz.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3792321904640L, 28255);
        return 0;
      case 2: 
        localbiz.uzB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3792321904640L, 28255);
        return 0;
      case 3: 
        localbiz.uzC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3792321904640L, 28255);
        return 0;
      case 4: 
        localbiz.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3792321904640L, 28255);
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
        localbiz.tzY = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3792321904640L, 28255);
      return 0;
    }
    GMTrace.o(3792321904640L, 28255);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/biz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */