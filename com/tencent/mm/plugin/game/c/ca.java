package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ca
  extends com.tencent.mm.bl.a
{
  public g mGo;
  public bz mGp;
  public bz mGq;
  
  public ca()
  {
    GMTrace.i(12651497259008L, 94261);
    GMTrace.o(12651497259008L, 94261);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651631476736L, 94262);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGo != null)
      {
        paramVarArgs.ff(1, this.mGo.aWM());
        this.mGo.a(paramVarArgs);
      }
      if (this.mGp != null)
      {
        paramVarArgs.ff(2, this.mGp.aWM());
        this.mGp.a(paramVarArgs);
      }
      if (this.mGq != null)
      {
        paramVarArgs.ff(3, this.mGq.aWM());
        this.mGq.a(paramVarArgs);
      }
      GMTrace.o(12651631476736L, 94262);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mGo != null) {
        i = b.a.a.a.fc(1, this.mGo.aWM()) + 0;
      }
      paramInt = i;
      if (this.mGp != null) {
        paramInt = i + b.a.a.a.fc(2, this.mGp.aWM());
      }
      i = paramInt;
      if (this.mGq != null) {
        i = paramInt + b.a.a.a.fc(3, this.mGq.aWM());
      }
      GMTrace.o(12651631476736L, 94262);
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
      GMTrace.o(12651631476736L, 94262);
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
        GMTrace.o(12651631476736L, 94262);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new g();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localca.mGo = ((g)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12651631476736L, 94262);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localca.mGp = ((bz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12651631476736L, 94262);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localca.mGq = ((bz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12651631476736L, 94262);
      return 0;
    }
    GMTrace.o(12651631476736L, 94262);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */