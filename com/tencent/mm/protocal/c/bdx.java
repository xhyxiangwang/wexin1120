package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdx
  extends com.tencent.mm.bl.a
{
  public axs uvW;
  
  public bdx()
  {
    GMTrace.i(3718233718784L, 27703);
    GMTrace.o(3718233718784L, 27703);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3718367936512L, 27704);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uvW != null)
      {
        paramVarArgs.ff(1, this.uvW.aWM());
        this.uvW.a(paramVarArgs);
      }
      GMTrace.o(3718367936512L, 27704);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uvW != null) {
        paramInt = b.a.a.a.fc(1, this.uvW.aWM()) + 0;
      }
      GMTrace.o(3718367936512L, 27704);
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
      GMTrace.o(3718367936512L, 27704);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdx localbdx = (bdx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3718367936512L, 27704);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbdx.uvW = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3718367936512L, 27704);
      return 0;
    }
    GMTrace.o(3718367936512L, 27704);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */