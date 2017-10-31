package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gc
  extends axc
{
  public int tzG;
  public String tzn;
  
  public gc()
  {
    GMTrace.i(3923721060352L, 29234);
    GMTrace.o(3923721060352L, 29234);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3923855278080L, 29235);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tzn != null) {
        paramVarArgs.e(4, this.tzn);
      }
      paramVarArgs.fd(5, this.tzG);
      GMTrace.o(3923855278080L, 29235);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.tzn != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tzn);
      }
      paramInt = b.a.a.a.fa(5, this.tzG);
      GMTrace.o(3923855278080L, 29235);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3923855278080L, 29235);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gc localgc = (gc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      case 3: 
      default: 
        GMTrace.o(3923855278080L, 29235);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localgc.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923855278080L, 29235);
        return 0;
      case 4: 
        localgc.tzn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3923855278080L, 29235);
        return 0;
      }
      localgc.tzG = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3923855278080L, 29235);
      return 0;
    }
    GMTrace.o(3923855278080L, 29235);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */