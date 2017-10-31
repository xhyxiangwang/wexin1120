package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awi
  extends axc
{
  public int nN;
  public axs uqX;
  public axs uqY;
  
  public awi()
  {
    GMTrace.i(3849230221312L, 28679);
    GMTrace.o(3849230221312L, 28679);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3849364439040L, 28680);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uqX != null)
      {
        paramVarArgs.ff(2, this.uqX.aWM());
        this.uqX.a(paramVarArgs);
      }
      if (this.uqY != null)
      {
        paramVarArgs.ff(3, this.uqY.aWM());
        this.uqY.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.nN);
      GMTrace.o(3849364439040L, 28680);
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
      if (this.uqX != null) {
        paramInt = i + b.a.a.a.fc(2, this.uqX.aWM());
      }
      i = paramInt;
      if (this.uqY != null) {
        i = paramInt + b.a.a.a.fc(3, this.uqY.aWM());
      }
      paramInt = b.a.a.a.fa(4, this.nN);
      GMTrace.o(3849364439040L, 28680);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3849364439040L, 28680);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awi localawi = (awi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3849364439040L, 28680);
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
          localawi.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849364439040L, 28680);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localawi.uqX = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849364439040L, 28680);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localawi.uqY = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849364439040L, 28680);
        return 0;
      }
      localawi.nN = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3849364439040L, 28680);
      return 0;
    }
    GMTrace.o(3849364439040L, 28680);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/awi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */