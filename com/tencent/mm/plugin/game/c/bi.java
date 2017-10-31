package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bi
  extends com.tencent.mm.bl.a
{
  public ch mFG;
  public bt mFH;
  public o mFI;
  
  public bi()
  {
    GMTrace.i(12653913178112L, 94279);
    GMTrace.o(12653913178112L, 94279);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12654047395840L, 94280);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFG != null)
      {
        paramVarArgs.ff(1, this.mFG.aWM());
        this.mFG.a(paramVarArgs);
      }
      if (this.mFH != null)
      {
        paramVarArgs.ff(2, this.mFH.aWM());
        this.mFH.a(paramVarArgs);
      }
      if (this.mFI != null)
      {
        paramVarArgs.ff(3, this.mFI.aWM());
        this.mFI.a(paramVarArgs);
      }
      GMTrace.o(12654047395840L, 94280);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mFG != null) {
        i = b.a.a.a.fc(1, this.mFG.aWM()) + 0;
      }
      paramInt = i;
      if (this.mFH != null) {
        paramInt = i + b.a.a.a.fc(2, this.mFH.aWM());
      }
      i = paramInt;
      if (this.mFI != null) {
        i = paramInt + b.a.a.a.fc(3, this.mFI.aWM());
      }
      GMTrace.o(12654047395840L, 94280);
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
      GMTrace.o(12654047395840L, 94280);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bi localbi = (bi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12654047395840L, 94280);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ch();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ch)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbi.mFG = ((ch)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12654047395840L, 94280);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbi.mFH = ((bt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12654047395840L, 94280);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new o();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbi.mFI = ((o)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12654047395840L, 94280);
      return 0;
    }
    GMTrace.o(12654047395840L, 94280);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */