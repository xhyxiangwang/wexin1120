package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amc
  extends axc
{
  public LinkedList<ame> ugV;
  public int ugW;
  public String ugX;
  
  public amc()
  {
    GMTrace.i(4015391768576L, 29917);
    this.ugV = new LinkedList();
    GMTrace.o(4015391768576L, 29917);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4015525986304L, 29918);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.ugV);
      paramVarArgs.fd(3, this.ugW);
      if (this.ugX != null) {
        paramVarArgs.e(4, this.ugX);
      }
      GMTrace.o(4015525986304L, 29918);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.ugV) + b.a.a.a.fa(3, this.ugW);
      paramInt = i;
      if (this.ugX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugX);
      }
      GMTrace.o(4015525986304L, 29918);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ugV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4015525986304L, 29918);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amc localamc = (amc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4015525986304L, 29918);
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
          localamc.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4015525986304L, 29918);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ame();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ame)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localamc.ugV.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4015525986304L, 29918);
        return 0;
      case 3: 
        localamc.ugW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4015525986304L, 29918);
        return 0;
      }
      localamc.ugX = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4015525986304L, 29918);
      return 0;
    }
    GMTrace.o(4015525986304L, 29918);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */