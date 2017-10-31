package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class age
  extends axc
{
  public int ubF;
  public int ubG;
  public axs ubH;
  
  public age()
  {
    GMTrace.i(3888287580160L, 28970);
    GMTrace.o(3888287580160L, 28970);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3888421797888L, 28971);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ubH == null) {
        throw new b("Not all required fields were included: ReqText");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.ubF);
      paramVarArgs.fd(3, this.ubG);
      if (this.ubH != null)
      {
        paramVarArgs.ff(4, this.ubH.aWM());
        this.ubH.a(paramVarArgs);
      }
      GMTrace.o(3888421797888L, 28971);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.ubF) + b.a.a.a.fa(3, this.ubG);
      paramInt = i;
      if (this.ubH != null) {
        paramInt = i + b.a.a.a.fc(4, this.ubH.aWM());
      }
      GMTrace.o(3888421797888L, 28971);
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
      if (this.ubH == null) {
        throw new b("Not all required fields were included: ReqText");
      }
      GMTrace.o(3888421797888L, 28971);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      age localage = (age)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3888421797888L, 28971);
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
          localage.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3888421797888L, 28971);
        return 0;
      case 2: 
        localage.ubF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3888421797888L, 28971);
        return 0;
      case 3: 
        localage.ubG = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3888421797888L, 28971);
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
        localage.ubH = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3888421797888L, 28971);
      return 0;
    }
    GMTrace.o(3888421797888L, 28971);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/age.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */