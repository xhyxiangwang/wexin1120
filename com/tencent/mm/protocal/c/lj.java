package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lj
  extends axc
{
  public String fKY;
  public String tHI;
  public String tHJ;
  
  public lj()
  {
    GMTrace.i(3727897395200L, 27775);
    GMTrace.o(3727897395200L, 27775);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3728031612928L, 27776);
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
      if (this.tHI != null) {
        paramVarArgs.e(3, this.tHI);
      }
      if (this.tHJ != null) {
        paramVarArgs.e(4, this.tHJ);
      }
      GMTrace.o(3728031612928L, 27776);
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
      if (this.tHI != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tHI);
      }
      paramInt = i;
      if (this.tHJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tHJ);
      }
      GMTrace.o(3728031612928L, 27776);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3728031612928L, 27776);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lj locallj = (lj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3728031612928L, 27776);
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
          locallj.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3728031612928L, 27776);
        return 0;
      case 2: 
        locallj.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3728031612928L, 27776);
        return 0;
      case 3: 
        locallj.tHI = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3728031612928L, 27776);
        return 0;
      }
      locallj.tHJ = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3728031612928L, 27776);
      return 0;
    }
    GMTrace.o(3728031612928L, 27776);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */