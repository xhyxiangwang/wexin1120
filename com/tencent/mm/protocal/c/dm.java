package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dm
  extends com.tencent.mm.bl.a
{
  public amn txg;
  
  public dm()
  {
    GMTrace.i(3871241928704L, 28843);
    GMTrace.o(3871241928704L, 28843);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3871376146432L, 28844);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.txg == null) {
        throw new b("Not all required fields were included: MediaObj");
      }
      if (this.txg != null)
      {
        paramVarArgs.ff(1, this.txg.aWM());
        this.txg.a(paramVarArgs);
      }
      GMTrace.o(3871376146432L, 28844);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.txg != null) {
        paramInt = b.a.a.a.fc(1, this.txg.aWM()) + 0;
      }
      GMTrace.o(3871376146432L, 28844);
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
      if (this.txg == null) {
        throw new b("Not all required fields were included: MediaObj");
      }
      GMTrace.o(3871376146432L, 28844);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dm localdm = (dm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3871376146432L, 28844);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new amn();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((amn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localdm.txg = ((amn)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3871376146432L, 28844);
      return 0;
    }
    GMTrace.o(3871376146432L, 28844);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */