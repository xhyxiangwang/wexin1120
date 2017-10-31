package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anq
  extends axc
{
  public int tvd;
  public LinkedList<ans> tze;
  public int ujA;
  public LinkedList<anp> ujB;
  public int ujC;
  public String ujD;
  
  public anq()
  {
    GMTrace.i(4006533398528L, 29851);
    this.ujB = new LinkedList();
    this.tze = new LinkedList();
    GMTrace.o(4006533398528L, 29851);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4006667616256L, 29852);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tvd);
      paramVarArgs.fd(3, this.ujA);
      paramVarArgs.d(4, 8, this.ujB);
      paramVarArgs.fd(5, this.ujC);
      paramVarArgs.d(6, 8, this.tze);
      if (this.ujD != null) {
        paramVarArgs.e(7, this.ujD);
      }
      GMTrace.o(4006667616256L, 29852);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tvd) + b.a.a.a.fa(3, this.ujA) + b.a.a.a.c(4, 8, this.ujB) + b.a.a.a.fa(5, this.ujC) + b.a.a.a.c(6, 8, this.tze);
      paramInt = i;
      if (this.ujD != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ujD);
      }
      GMTrace.o(4006667616256L, 29852);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ujB.clear();
      this.tze.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4006667616256L, 29852);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anq localanq = (anq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4006667616256L, 29852);
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
          localanq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 2: 
        localanq.tvd = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 3: 
        localanq.ujA = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((anp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localanq.ujB.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 5: 
        localanq.ujC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4006667616256L, 29852);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ans();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ans)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localanq.tze.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4006667616256L, 29852);
        return 0;
      }
      localanq.ujD = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4006667616256L, 29852);
      return 0;
    }
    GMTrace.o(4006667616256L, 29852);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/anq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */