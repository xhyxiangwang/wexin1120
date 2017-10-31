package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class iy
  extends axc
{
  public String tEg;
  public at tEh;
  public String txj;
  
  public iy()
  {
    GMTrace.i(3858088591360L, 28745);
    GMTrace.o(3858088591360L, 28745);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3858222809088L, 28746);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tEg != null) {
        paramVarArgs.e(2, this.tEg);
      }
      if (this.txj != null) {
        paramVarArgs.e(3, this.txj);
      }
      if (this.tEh != null)
      {
        paramVarArgs.ff(4, this.tEh.aWM());
        this.tEh.a(paramVarArgs);
      }
      GMTrace.o(3858222809088L, 28746);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.tEg != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tEg);
      }
      i = paramInt;
      if (this.txj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.txj);
      }
      paramInt = i;
      if (this.tEh != null) {
        paramInt = i + b.a.a.a.fc(4, this.tEh.aWM());
      }
      GMTrace.o(3858222809088L, 28746);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3858222809088L, 28746);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      iy localiy = (iy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3858222809088L, 28746);
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
          localiy.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3858222809088L, 28746);
        return 0;
      case 2: 
        localiy.tEg = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3858222809088L, 28746);
        return 0;
      case 3: 
        localiy.txj = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3858222809088L, 28746);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localiy.tEh = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3858222809088L, 28746);
      return 0;
    }
    GMTrace.o(3858222809088L, 28746);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/iy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */