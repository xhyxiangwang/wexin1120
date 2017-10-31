package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kd
  extends com.tencent.mm.bl.a
{
  public kc tGA;
  public kc tGw;
  public kc tGx;
  public kc tGy;
  public kc tGz;
  
  public kd()
  {
    GMTrace.i(3807220072448L, 28366);
    GMTrace.o(3807220072448L, 28366);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3807354290176L, 28367);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tGw != null)
      {
        paramVarArgs.ff(1, this.tGw.aWM());
        this.tGw.a(paramVarArgs);
      }
      if (this.tGx != null)
      {
        paramVarArgs.ff(2, this.tGx.aWM());
        this.tGx.a(paramVarArgs);
      }
      if (this.tGy != null)
      {
        paramVarArgs.ff(3, this.tGy.aWM());
        this.tGy.a(paramVarArgs);
      }
      if (this.tGz != null)
      {
        paramVarArgs.ff(4, this.tGz.aWM());
        this.tGz.a(paramVarArgs);
      }
      if (this.tGA != null)
      {
        paramVarArgs.ff(5, this.tGA.aWM());
        this.tGA.a(paramVarArgs);
      }
      GMTrace.o(3807354290176L, 28367);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tGw != null) {
        i = b.a.a.a.fc(1, this.tGw.aWM()) + 0;
      }
      paramInt = i;
      if (this.tGx != null) {
        paramInt = i + b.a.a.a.fc(2, this.tGx.aWM());
      }
      i = paramInt;
      if (this.tGy != null) {
        i = paramInt + b.a.a.a.fc(3, this.tGy.aWM());
      }
      paramInt = i;
      if (this.tGz != null) {
        paramInt = i + b.a.a.a.fc(4, this.tGz.aWM());
      }
      i = paramInt;
      if (this.tGA != null) {
        i = paramInt + b.a.a.a.fc(5, this.tGA.aWM());
      }
      GMTrace.o(3807354290176L, 28367);
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
      GMTrace.o(3807354290176L, 28367);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kd localkd = (kd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3807354290176L, 28367);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localkd.tGw = ((kc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localkd.tGx = ((kc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localkd.tGy = ((kc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localkd.tGz = ((kc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new kc();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((kc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localkd.tGA = ((kc)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3807354290176L, 28367);
      return 0;
    }
    GMTrace.o(3807354290176L, 28367);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */