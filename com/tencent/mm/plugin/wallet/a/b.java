package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bl.a
{
  public String oqm;
  public LinkedList<c> rFI;
  
  public b()
  {
    GMTrace.i(18427154530304L, 137293);
    this.rFI = new LinkedList();
    GMTrace.o(18427154530304L, 137293);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18427288748032L, 137294);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.oqm != null) {
        paramVarArgs.e(1, this.oqm);
      }
      paramVarArgs.d(2, 8, this.rFI);
      GMTrace.o(18427288748032L, 137294);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.oqm != null) {
        paramInt = b.a.a.b.b.a.f(1, this.oqm) + 0;
      }
      i = b.a.a.a.c(2, 8, this.rFI);
      GMTrace.o(18427288748032L, 137294);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rFI.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(18427288748032L, 137294);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(18427288748032L, 137294);
        return -1;
      case 1: 
        localb.oqm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(18427288748032L, 137294);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new c();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localb.rFI.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(18427288748032L, 137294);
      return 0;
    }
    GMTrace.o(18427288748032L, 137294);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */