package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ath
  extends axc
{
  public int tNa;
  public long tNb;
  public long uoJ;
  public long uoM;
  
  public ath()
  {
    GMTrace.i(3965865426944L, 29548);
    GMTrace.o(3965865426944L, 29548);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3965999644672L, 29549);
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
      paramVarArgs.R(4, this.uoJ);
      paramVarArgs.R(5, this.uoM);
      GMTrace.o(3965999644672L, 29549);
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
      int k = b.a.a.a.Q(4, this.uoJ);
      int m = b.a.a.a.Q(5, this.uoM);
      GMTrace.o(3965999644672L, 29549);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3965999644672L, 29549);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ath localath = (ath)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3965999644672L, 29549);
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
          localath.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3965999644672L, 29549);
        return 0;
      case 2: 
        localath.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3965999644672L, 29549);
        return 0;
      case 3: 
        localath.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3965999644672L, 29549);
        return 0;
      case 4: 
        localath.uoJ = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3965999644672L, 29549);
        return 0;
      }
      localath.uoM = ((b.a.a.a.a)localObject1).xSv.nn();
      GMTrace.o(3965999644672L, 29549);
      return 0;
    }
    GMTrace.o(3965999644672L, 29549);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */