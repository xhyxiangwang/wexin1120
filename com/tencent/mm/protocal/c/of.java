package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class of
  extends axc
{
  public int kCJ;
  public String tKF;
  public int ttY;
  public LinkedList<oo> tuW;
  
  public of()
  {
    GMTrace.i(3727092088832L, 27769);
    this.tuW = new LinkedList();
    GMTrace.o(3727092088832L, 27769);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3727226306560L, 27770);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.kCJ);
      paramVarArgs.d(3, 8, this.tuW);
      if (this.tKF != null) {
        paramVarArgs.e(4, this.tKF);
      }
      paramVarArgs.fd(5, this.ttY);
      GMTrace.o(3727226306560L, 27770);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kCJ) + b.a.a.a.c(3, 8, this.tuW);
      paramInt = i;
      if (this.tKF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tKF);
      }
      i = b.a.a.a.fa(5, this.ttY);
      GMTrace.o(3727226306560L, 27770);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tuW.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3727226306560L, 27770);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      of localof = (of)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3727226306560L, 27770);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localof.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3727226306560L, 27770);
        return 0;
      case 2: 
        localof.kCJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3727226306560L, 27770);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localof.tuW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3727226306560L, 27770);
        return 0;
      case 4: 
        localof.tKF = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3727226306560L, 27770);
        return 0;
      }
      localof.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3727226306560L, 27770);
      return 0;
    }
    GMTrace.o(3727226306560L, 27770);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */