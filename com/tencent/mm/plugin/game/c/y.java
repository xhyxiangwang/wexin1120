package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class y
  extends com.tencent.mm.bl.a
{
  public bd mDY;
  public bd mDZ;
  public bd mEa;
  public cb mEb;
  
  public y()
  {
    GMTrace.i(12653376307200L, 94275);
    GMTrace.o(12653376307200L, 94275);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12653510524928L, 94276);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDY != null)
      {
        paramVarArgs.ff(1, this.mDY.aWM());
        this.mDY.a(paramVarArgs);
      }
      if (this.mDZ != null)
      {
        paramVarArgs.ff(2, this.mDZ.aWM());
        this.mDZ.a(paramVarArgs);
      }
      if (this.mEa != null)
      {
        paramVarArgs.ff(3, this.mEa.aWM());
        this.mEa.a(paramVarArgs);
      }
      if (this.mEb != null)
      {
        paramVarArgs.ff(4, this.mEb.aWM());
        this.mEb.a(paramVarArgs);
      }
      GMTrace.o(12653510524928L, 94276);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mDY != null) {
        i = b.a.a.a.fc(1, this.mDY.aWM()) + 0;
      }
      paramInt = i;
      if (this.mDZ != null) {
        paramInt = i + b.a.a.a.fc(2, this.mDZ.aWM());
      }
      i = paramInt;
      if (this.mEa != null) {
        i = paramInt + b.a.a.a.fc(3, this.mEa.aWM());
      }
      paramInt = i;
      if (this.mEb != null) {
        paramInt = i + b.a.a.a.fc(4, this.mEb.aWM());
      }
      GMTrace.o(12653510524928L, 94276);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12653510524928L, 94276);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      y localy = (y)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12653510524928L, 94276);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localy.mDY = ((bd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653510524928L, 94276);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localy.mDZ = ((bd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653510524928L, 94276);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localy.mEa = ((bd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653510524928L, 94276);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localy.mEb = ((cb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12653510524928L, 94276);
      return 0;
    }
    GMTrace.o(12653510524928L, 94276);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */