package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ab
  extends axc
{
  public int tsI;
  public pf tsJ;
  public int tsK;
  public LinkedList<cj> tsq;
  
  public ab()
  {
    GMTrace.i(3798898573312L, 28304);
    this.tsq = new LinkedList();
    GMTrace.o(3798898573312L, 28304);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3799032791040L, 28305);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tsI);
      paramVarArgs.d(3, 8, this.tsq);
      if (this.tsJ != null)
      {
        paramVarArgs.ff(4, this.tsJ.aWM());
        this.tsJ.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.tsK);
      GMTrace.o(3799032791040L, 28305);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tsI) + b.a.a.a.c(3, 8, this.tsq);
      paramInt = i;
      if (this.tsJ != null) {
        paramInt = i + b.a.a.a.fc(4, this.tsJ.aWM());
      }
      i = b.a.a.a.fa(5, this.tsK);
      GMTrace.o(3799032791040L, 28305);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tsq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3799032791040L, 28305);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ab localab = (ab)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3799032791040L, 28305);
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
          localab.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3799032791040L, 28305);
        return 0;
      case 2: 
        localab.tsI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3799032791040L, 28305);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localab.tsq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3799032791040L, 28305);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localab.tsJ = ((pf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3799032791040L, 28305);
        return 0;
      }
      localab.tsK = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3799032791040L, 28305);
      return 0;
    }
    GMTrace.o(3799032791040L, 28305);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */