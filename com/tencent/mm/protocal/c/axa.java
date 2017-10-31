package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axa
  extends axc
{
  public String tSf;
  public als urC;
  
  public axa()
  {
    GMTrace.i(16869826232320L, 125690);
    GMTrace.o(16869826232320L, 125690);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16869960450048L, 125691);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.urC != null)
      {
        paramVarArgs.ff(2, this.urC.aWM());
        this.urC.a(paramVarArgs);
      }
      if (this.tSf != null) {
        paramVarArgs.e(3, this.tSf);
      }
      GMTrace.o(16869960450048L, 125691);
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
      if (this.urC != null) {
        paramInt = i + b.a.a.a.fc(2, this.urC.aWM());
      }
      i = paramInt;
      if (this.tSf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSf);
      }
      GMTrace.o(16869960450048L, 125691);
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
      GMTrace.o(16869960450048L, 125691);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axa localaxa = (axa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(16869960450048L, 125691);
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
          localaxa.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16869960450048L, 125691);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new als();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((als)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localaxa.urC = ((als)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16869960450048L, 125691);
        return 0;
      }
      localaxa.tSf = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(16869960450048L, 125691);
      return 0;
    }
    GMTrace.o(16869960450048L, 125691);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */