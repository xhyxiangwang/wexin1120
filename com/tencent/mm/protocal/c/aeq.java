package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aeq
  extends axc
{
  public String fKY;
  public int uan;
  public LinkedList<bru> uao;
  
  public aeq()
  {
    GMTrace.i(17827335503872L, 132824);
    this.uao = new LinkedList();
    GMTrace.o(17827335503872L, 132824);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17827469721600L, 132825);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fKY != null) {
        paramVarArgs.e(2, this.fKY);
      }
      paramVarArgs.fd(3, this.uan);
      paramVarArgs.d(4, 8, this.uao);
      GMTrace.o(17827469721600L, 132825);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.fKY != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fKY);
      }
      paramInt = b.a.a.a.fa(3, this.uan);
      int j = b.a.a.a.c(4, 8, this.uao);
      GMTrace.o(17827469721600L, 132825);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uao.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17827469721600L, 132825);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aeq localaeq = (aeq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17827469721600L, 132825);
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
          localaeq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17827469721600L, 132825);
        return 0;
      case 2: 
        localaeq.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17827469721600L, 132825);
        return 0;
      case 3: 
        localaeq.uan = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17827469721600L, 132825);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bru();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bru)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localaeq.uao.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(17827469721600L, 132825);
      return 0;
    }
    GMTrace.o(17827469721600L, 132825);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */