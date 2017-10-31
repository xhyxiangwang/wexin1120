package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uh
  extends com.tencent.mm.bl.a
{
  public ua tSu;
  public LinkedList<String> tSv;
  
  public uh()
  {
    GMTrace.i(3914594254848L, 29166);
    this.tSv = new LinkedList();
    GMTrace.o(3914594254848L, 29166);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3914728472576L, 29167);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSu == null) {
        throw new b("Not all required fields were included: GameItem");
      }
      if (this.tSu != null)
      {
        paramVarArgs.ff(1, this.tSu.aWM());
        this.tSu.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.tSv);
      GMTrace.o(3914728472576L, 29167);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tSu != null) {
        paramInt = b.a.a.a.fc(1, this.tSu.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 1, this.tSv);
      GMTrace.o(3914728472576L, 29167);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSv.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tSu == null) {
        throw new b("Not all required fields were included: GameItem");
      }
      GMTrace.o(3914728472576L, 29167);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uh localuh = (uh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3914728472576L, 29167);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ua();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((ua)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localuh.tSu = ((ua)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3914728472576L, 29167);
        return 0;
      }
      localuh.tSv.add(((b.a.a.a.a)localObject1).xSv.readString());
      GMTrace.o(3914728472576L, 29167);
      return 0;
    }
    GMTrace.o(3914728472576L, 29167);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */