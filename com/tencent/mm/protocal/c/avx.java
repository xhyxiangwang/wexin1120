package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avx
  extends com.tencent.mm.bl.a
{
  public bdy uqI;
  public axt uqJ;
  
  public avx()
  {
    GMTrace.i(3668707377152L, 27334);
    GMTrace.o(3668707377152L, 27334);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3668841594880L, 27335);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uqI == null) {
        throw new b("Not all required fields were included: SnsRecommendObject");
      }
      if (this.uqI != null)
      {
        paramVarArgs.ff(1, this.uqI.aWM());
        this.uqI.a(paramVarArgs);
      }
      if (this.uqJ != null)
      {
        paramVarArgs.ff(2, this.uqJ.aWM());
        this.uqJ.a(paramVarArgs);
      }
      GMTrace.o(3668841594880L, 27335);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uqI != null) {
        paramInt = b.a.a.a.fc(1, this.uqI.aWM()) + 0;
      }
      i = paramInt;
      if (this.uqJ != null) {
        i = paramInt + b.a.a.a.fc(2, this.uqJ.aWM());
      }
      GMTrace.o(3668841594880L, 27335);
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
      if (this.uqI == null) {
        throw new b("Not all required fields were included: SnsRecommendObject");
      }
      GMTrace.o(3668841594880L, 27335);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avx localavx = (avx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3668841594880L, 27335);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localavx.uqI = ((bdy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3668841594880L, 27335);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localavx.uqJ = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3668841594880L, 27335);
      return 0;
    }
    GMTrace.o(3668841594880L, 27335);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/avx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */