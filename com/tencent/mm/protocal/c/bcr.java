package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcr
  extends axk
{
  public bdy uqI;
  public axs uuy;
  public bcp uuz;
  
  public bcr()
  {
    GMTrace.i(3715012493312L, 27679);
    GMTrace.o(3715012493312L, 27679);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3715146711040L, 27680);
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
      if (this.uuz != null)
      {
        paramVarArgs.ff(2, this.uuz.aWM());
        this.uuz.a(paramVarArgs);
      }
      if (this.uuy != null)
      {
        paramVarArgs.ff(3, this.uuy.aWM());
        this.uuy.a(paramVarArgs);
      }
      if (this.uqI != null)
      {
        paramVarArgs.ff(4, this.uqI.aWM());
        this.uqI.a(paramVarArgs);
      }
      GMTrace.o(3715146711040L, 27680);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urV != null) {
        i = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      paramInt = i;
      if (this.uuz != null) {
        paramInt = i + b.a.a.a.fc(2, this.uuz.aWM());
      }
      i = paramInt;
      if (this.uuy != null) {
        i = paramInt + b.a.a.a.fc(3, this.uuy.aWM());
      }
      paramInt = i;
      if (this.uqI != null) {
        paramInt = i + b.a.a.a.fc(4, this.uqI.aWM());
      }
      GMTrace.o(3715146711040L, 27680);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3715146711040L, 27680);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcr localbcr = (bcr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3715146711040L, 27680);
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
          localbcr.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715146711040L, 27680);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbcr.uuz = ((bcp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715146711040L, 27680);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbcr.uuy = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715146711040L, 27680);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bdy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bdy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localbcr.uqI = ((bdy)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3715146711040L, 27680);
      return 0;
    }
    GMTrace.o(3715146711040L, 27680);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */