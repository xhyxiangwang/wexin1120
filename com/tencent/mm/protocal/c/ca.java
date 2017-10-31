package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ca
  extends com.tencent.mm.bl.a
{
  public bcp tvF;
  public axt tvG;
  
  public ca()
  {
    GMTrace.i(4000359383040L, 29805);
    GMTrace.o(4000359383040L, 29805);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4000493600768L, 29806);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tvF == null) {
        throw new b("Not all required fields were included: SnsADObject");
      }
      if (this.tvF != null)
      {
        paramVarArgs.ff(1, this.tvF.aWM());
        this.tvF.a(paramVarArgs);
      }
      if (this.tvG != null)
      {
        paramVarArgs.ff(2, this.tvG.aWM());
        this.tvG.a(paramVarArgs);
      }
      GMTrace.o(4000493600768L, 29806);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tvF != null) {
        paramInt = b.a.a.a.fc(1, this.tvF.aWM()) + 0;
      }
      i = paramInt;
      if (this.tvG != null) {
        i = paramInt + b.a.a.a.fc(2, this.tvG.aWM());
      }
      GMTrace.o(4000493600768L, 29806);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tvF == null) {
        throw new b("Not all required fields were included: SnsADObject");
      }
      GMTrace.o(4000493600768L, 29806);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ca localca = (ca)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4000493600768L, 29806);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localca.tvF = ((bcp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4000493600768L, 29806);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localca.tvG = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4000493600768L, 29806);
      return 0;
    }
    GMTrace.o(4000493600768L, 29806);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */