package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bds
  extends com.tencent.mm.bl.a
{
  public int uvG;
  public bet uvH;
  public aur uvI;
  public ox uvJ;
  public asw uvK;
  
  public bds()
  {
    GMTrace.i(3854867365888L, 28721);
    GMTrace.o(3854867365888L, 28721);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3855001583616L, 28722);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uvG);
      if (this.uvH != null)
      {
        paramVarArgs.ff(2, this.uvH.aWM());
        this.uvH.a(paramVarArgs);
      }
      if (this.uvI != null)
      {
        paramVarArgs.ff(3, this.uvI.aWM());
        this.uvI.a(paramVarArgs);
      }
      if (this.uvJ != null)
      {
        paramVarArgs.ff(4, this.uvJ.aWM());
        this.uvJ.a(paramVarArgs);
      }
      if (this.uvK != null)
      {
        paramVarArgs.ff(5, this.uvK.aWM());
        this.uvK.a(paramVarArgs);
      }
      GMTrace.o(3855001583616L, 28722);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.uvG) + 0;
      paramInt = i;
      if (this.uvH != null) {
        paramInt = i + b.a.a.a.fc(2, this.uvH.aWM());
      }
      i = paramInt;
      if (this.uvI != null) {
        i = paramInt + b.a.a.a.fc(3, this.uvI.aWM());
      }
      paramInt = i;
      if (this.uvJ != null) {
        paramInt = i + b.a.a.a.fc(4, this.uvJ.aWM());
      }
      i = paramInt;
      if (this.uvK != null) {
        i = paramInt + b.a.a.a.fc(5, this.uvK.aWM());
      }
      GMTrace.o(3855001583616L, 28722);
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
      GMTrace.o(3855001583616L, 28722);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bds localbds = (bds)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3855001583616L, 28722);
        return -1;
      case 1: 
        localbds.uvG = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3855001583616L, 28722);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bet();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bet)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbds.uvH = ((bet)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855001583616L, 28722);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aur();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aur)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbds.uvI = ((aur)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855001583616L, 28722);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ox();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ox)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbds.uvJ = ((ox)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855001583616L, 28722);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new asw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((asw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbds.uvK = ((asw)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3855001583616L, 28722);
      return 0;
    }
    GMTrace.o(3855001583616L, 28722);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */