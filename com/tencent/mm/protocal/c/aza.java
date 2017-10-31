package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aza
  extends com.tencent.mm.bl.a
{
  public String lph;
  public int ttY;
  public ake ugD;
  public String usI;
  
  public aza()
  {
    GMTrace.i(19140790190080L, 142610);
    GMTrace.o(19140790190080L, 142610);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19140924407808L, 142611);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.usI != null) {
        paramVarArgs.e(1, this.usI);
      }
      paramVarArgs.fd(2, this.ttY);
      if (this.lph != null) {
        paramVarArgs.e(3, this.lph);
      }
      if (this.ugD != null)
      {
        paramVarArgs.ff(4, this.ugD.aWM());
        this.ugD.a(paramVarArgs);
      }
      GMTrace.o(19140924407808L, 142611);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.usI != null) {
        paramInt = b.a.a.b.b.a.f(1, this.usI) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.ttY);
      paramInt = i;
      if (this.lph != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lph);
      }
      i = paramInt;
      if (this.ugD != null) {
        i = paramInt + b.a.a.a.fc(4, this.ugD.aWM());
      }
      GMTrace.o(19140924407808L, 142611);
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
      GMTrace.o(19140924407808L, 142611);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aza localaza = (aza)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19140924407808L, 142611);
        return -1;
      case 1: 
        localaza.usI = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140924407808L, 142611);
        return 0;
      case 2: 
        localaza.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(19140924407808L, 142611);
        return 0;
      case 3: 
        localaza.lph = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19140924407808L, 142611);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ake();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ake)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localaza.ugD = ((ake)localObject1);
        paramInt += 1;
      }
      GMTrace.o(19140924407808L, 142611);
      return 0;
    }
    GMTrace.o(19140924407808L, 142611);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */