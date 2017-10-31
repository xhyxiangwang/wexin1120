package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bt
  extends com.tencent.mm.bl.a
{
  public String mDG;
  public bu mFY;
  public bu mFZ;
  public bu mGa;
  public bu mGb;
  
  public bt()
  {
    GMTrace.i(12647202291712L, 94229);
    GMTrace.o(12647202291712L, 94229);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12647336509440L, 94230);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFY != null)
      {
        paramVarArgs.ff(1, this.mFY.aWM());
        this.mFY.a(paramVarArgs);
      }
      if (this.mFZ != null)
      {
        paramVarArgs.ff(2, this.mFZ.aWM());
        this.mFZ.a(paramVarArgs);
      }
      if (this.mGa != null)
      {
        paramVarArgs.ff(3, this.mGa.aWM());
        this.mGa.a(paramVarArgs);
      }
      if (this.mGb != null)
      {
        paramVarArgs.ff(4, this.mGb.aWM());
        this.mGb.a(paramVarArgs);
      }
      if (this.mDG != null) {
        paramVarArgs.e(5, this.mDG);
      }
      GMTrace.o(12647336509440L, 94230);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mFY != null) {
        i = b.a.a.a.fc(1, this.mFY.aWM()) + 0;
      }
      paramInt = i;
      if (this.mFZ != null) {
        paramInt = i + b.a.a.a.fc(2, this.mFZ.aWM());
      }
      i = paramInt;
      if (this.mGa != null) {
        i = paramInt + b.a.a.a.fc(3, this.mGa.aWM());
      }
      paramInt = i;
      if (this.mGb != null) {
        paramInt = i + b.a.a.a.fc(4, this.mGb.aWM());
      }
      i = paramInt;
      if (this.mDG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mDG);
      }
      GMTrace.o(12647336509440L, 94230);
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
      GMTrace.o(12647336509440L, 94230);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bt localbt = (bt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12647336509440L, 94230);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbt.mFY = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbt.mFZ = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbt.mGa = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbt.mGb = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      }
      localbt.mDG = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12647336509440L, 94230);
      return 0;
    }
    GMTrace.o(12647336509440L, 94230);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */