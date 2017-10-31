package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apr
  extends axc
{
  public int nN;
  public axs uma;
  public axs umb;
  
  public apr()
  {
    GMTrace.i(3824131506176L, 28492);
    GMTrace.o(3824131506176L, 28492);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3824265723904L, 28493);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.nN);
      if (this.uma != null)
      {
        paramVarArgs.ff(3, this.uma.aWM());
        this.uma.a(paramVarArgs);
      }
      if (this.umb != null)
      {
        paramVarArgs.ff(4, this.umb.aWM());
        this.umb.a(paramVarArgs);
      }
      GMTrace.o(3824265723904L, 28493);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.nN);
      paramInt = i;
      if (this.uma != null) {
        paramInt = i + b.a.a.a.fc(3, this.uma.aWM());
      }
      i = paramInt;
      if (this.umb != null) {
        i = paramInt + b.a.a.a.fc(4, this.umb.aWM());
      }
      GMTrace.o(3824265723904L, 28493);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3824265723904L, 28493);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apr localapr = (apr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3824265723904L, 28493);
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
          localapr.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3824265723904L, 28493);
        return 0;
      case 2: 
        localapr.nN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3824265723904L, 28493);
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
          localapr.uma = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3824265723904L, 28493);
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
        localapr.umb = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3824265723904L, 28493);
      return 0;
    }
    GMTrace.o(3824265723904L, 28493);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */