package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class bry
  extends com.tencent.mm.bl.a
{
  public LinkedList<bfp> uGW;
  public b uGX;
  
  public bry()
  {
    GMTrace.i(3837150625792L, 28589);
    this.uGW = new LinkedList();
    GMTrace.o(3837150625792L, 28589);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3837284843520L, 28590);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.uGW);
      if (this.uGX != null) {
        paramVarArgs.b(2, this.uGX);
      }
      GMTrace.o(3837284843520L, 28590);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.uGW) + 0;
      paramInt = i;
      if (this.uGX != null) {
        paramInt = i + b.a.a.a.a(2, this.uGX);
      }
      GMTrace.o(3837284843520L, 28590);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uGW.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3837284843520L, 28590);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bry localbry = (bry)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3837284843520L, 28590);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bfp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbry.uGW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3837284843520L, 28590);
        return 0;
      }
      localbry.uGX = ((b.a.a.a.a)localObject1).cpI();
      GMTrace.o(3837284843520L, 28590);
      return 0;
    }
    GMTrace.o(3837284843520L, 28590);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */