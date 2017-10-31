package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.bl.a
{
  public LinkedList<h> rGd;
  public b rGe;
  
  public g()
  {
    GMTrace.i(7698460442624L, 57358);
    this.rGd = new LinkedList();
    GMTrace.o(7698460442624L, 57358);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7698594660352L, 57359);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.rGd);
      if (this.rGe != null) {
        paramVarArgs.b(2, this.rGe);
      }
      GMTrace.o(7698594660352L, 57359);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.rGd) + 0;
      paramInt = i;
      if (this.rGe != null) {
        paramInt = i + b.a.a.a.a(2, this.rGe);
      }
      GMTrace.o(7698594660352L, 57359);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rGd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(7698594660352L, 57359);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(7698594660352L, 57359);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localg.rGd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7698594660352L, 57359);
        return 0;
      }
      localg.rGe = ((b.a.a.a.a)localObject1).cpI();
      GMTrace.o(7698594660352L, 57359);
      return 0;
    }
    GMTrace.o(7698594660352L, 57359);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */