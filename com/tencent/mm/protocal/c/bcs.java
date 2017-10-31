package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcs
  extends com.tencent.mm.bl.a
{
  public long uuA;
  public axt uus;
  
  public bcs()
  {
    GMTrace.i(3974455361536L, 29612);
    GMTrace.o(3974455361536L, 29612);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3974589579264L, 29613);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.uuA);
      if (this.uus != null)
      {
        paramVarArgs.ff(2, this.uus.aWM());
        this.uus.a(paramVarArgs);
      }
      GMTrace.o(3974589579264L, 29613);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.Q(1, this.uuA) + 0;
      paramInt = i;
      if (this.uus != null) {
        paramInt = i + b.a.a.a.fc(2, this.uus.aWM());
      }
      GMTrace.o(3974589579264L, 29613);
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
      GMTrace.o(3974589579264L, 29613);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcs localbcs = (bcs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3974589579264L, 29613);
        return -1;
      case 1: 
        localbcs.uuA = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3974589579264L, 29613);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbcs.uus = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3974589579264L, 29613);
      return 0;
    }
    GMTrace.o(3974589579264L, 29613);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */