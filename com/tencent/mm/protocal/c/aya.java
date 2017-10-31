package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aya
  extends com.tencent.mm.bl.a
{
  public String ufP;
  public LinkedList<cj> uso;
  
  public aya()
  {
    GMTrace.i(3984790126592L, 29689);
    this.uso = new LinkedList();
    GMTrace.o(3984790126592L, 29689);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3984924344320L, 29690);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.uso);
      if (this.ufP != null) {
        paramVarArgs.e(2, this.ufP);
      }
      GMTrace.o(3984924344320L, 29690);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.uso) + 0;
      paramInt = i;
      if (this.ufP != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ufP);
      }
      GMTrace.o(3984924344320L, 29690);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uso.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3984924344320L, 29690);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aya localaya = (aya)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3984924344320L, 29690);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localaya.uso.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3984924344320L, 29690);
        return 0;
      }
      localaya.ufP = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3984924344320L, 29690);
      return 0;
    }
    GMTrace.o(3984924344320L, 29690);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */