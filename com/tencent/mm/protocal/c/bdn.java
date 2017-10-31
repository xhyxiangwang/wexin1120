package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdn
  extends com.tencent.mm.bl.a
{
  public int mEi;
  public long tDg;
  public axs umJ;
  
  public bdn()
  {
    GMTrace.i(3681994932224L, 27433);
    GMTrace.o(3681994932224L, 27433);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3682129149952L, 27434);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.tDg);
      paramVarArgs.fd(2, this.mEi);
      if (this.umJ != null)
      {
        paramVarArgs.ff(3, this.umJ.aWM());
        this.umJ.a(paramVarArgs);
      }
      GMTrace.o(3682129149952L, 27434);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.Q(1, this.tDg) + 0 + b.a.a.a.fa(2, this.mEi);
      paramInt = i;
      if (this.umJ != null) {
        paramInt = i + b.a.a.a.fc(3, this.umJ.aWM());
      }
      GMTrace.o(3682129149952L, 27434);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3682129149952L, 27434);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdn localbdn = (bdn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3682129149952L, 27434);
        return -1;
      case 1: 
        localbdn.tDg = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3682129149952L, 27434);
        return 0;
      case 2: 
        localbdn.mEi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3682129149952L, 27434);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbdn.umJ = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3682129149952L, 27434);
      return 0;
    }
    GMTrace.o(3682129149952L, 27434);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */