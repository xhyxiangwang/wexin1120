package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axy
  extends axc
{
  public int cyK;
  public String fKY;
  public String tZc;
  
  public axy()
  {
    GMTrace.i(14997220491264L, 111738);
    GMTrace.o(14997220491264L, 111738);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14997354708992L, 111739);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fKY != null) {
        paramVarArgs.e(2, this.fKY);
      }
      if (this.tZc != null) {
        paramVarArgs.e(3, this.tZc);
      }
      paramVarArgs.fd(4, this.cyK);
      GMTrace.o(14997354708992L, 111739);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.fKY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fKY);
      }
      i = paramInt;
      if (this.tZc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tZc);
      }
      paramInt = b.a.a.a.fa(4, this.cyK);
      GMTrace.o(14997354708992L, 111739);
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
      GMTrace.o(14997354708992L, 111739);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axy localaxy = (axy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14997354708992L, 111739);
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
          localaxy.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14997354708992L, 111739);
        return 0;
      case 2: 
        localaxy.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14997354708992L, 111739);
        return 0;
      case 3: 
        localaxy.tZc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14997354708992L, 111739);
        return 0;
      }
      localaxy.cyK = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(14997354708992L, 111739);
      return 0;
    }
    GMTrace.o(14997354708992L, 111739);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */