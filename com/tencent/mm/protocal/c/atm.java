package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atm
  extends axc
{
  public int tNa;
  public long tNb;
  public long uoM;
  
  public atm()
  {
    GMTrace.i(3866141655040L, 28805);
    GMTrace.o(3866141655040L, 28805);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3866275872768L, 28806);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tNa);
      paramVarArgs.R(3, this.tNb);
      paramVarArgs.R(4, this.uoM);
      GMTrace.o(3866275872768L, 28806);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.tNa);
      int j = b.a.a.a.Q(3, this.tNb);
      int k = b.a.a.a.Q(4, this.uoM);
      GMTrace.o(3866275872768L, 28806);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3866275872768L, 28806);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atm localatm = (atm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3866275872768L, 28806);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localatm.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3866275872768L, 28806);
        return 0;
      case 2: 
        localatm.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3866275872768L, 28806);
        return 0;
      case 3: 
        localatm.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3866275872768L, 28806);
        return 0;
      }
      localatm.uoM = ((b.a.a.a.a)localObject1).xSv.nn();
      GMTrace.o(3866275872768L, 28806);
      return 0;
    }
    GMTrace.o(3866275872768L, 28806);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */