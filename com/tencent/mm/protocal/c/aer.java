package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aer
  extends axk
{
  public LinkedList<bru> uao;
  
  public aer()
  {
    GMTrace.i(17827067068416L, 132822);
    this.uao = new LinkedList();
    GMTrace.o(17827067068416L, 132822);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17827201286144L, 132823);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.uao);
      GMTrace.o(17827201286144L, 132823);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.uao);
      GMTrace.o(17827201286144L, 132823);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uao.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17827201286144L, 132823);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aer localaer = (aer)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17827201286144L, 132823);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaer.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17827201286144L, 132823);
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
        for (bool = true; bool; bool = ((bru)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localaer.uao.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(17827201286144L, 132823);
      return 0;
    }
    GMTrace.o(17827201286144L, 132823);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */