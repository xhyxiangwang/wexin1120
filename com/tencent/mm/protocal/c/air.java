package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class air
  extends axk
{
  public String tBZ;
  public ahr udg;
  public String udt;
  
  public air()
  {
    GMTrace.i(3759304343552L, 28009);
    GMTrace.o(3759304343552L, 28009);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3759438561280L, 28010);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.udg != null)
      {
        paramVarArgs.ff(2, this.udg.aWM());
        this.udg.a(paramVarArgs);
      }
      if (this.udt != null) {
        paramVarArgs.e(3, this.udt);
      }
      if (this.tBZ != null) {
        paramVarArgs.e(4, this.tBZ);
      }
      GMTrace.o(3759438561280L, 28010);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urV != null) {
        i = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      paramInt = i;
      if (this.udg != null) {
        paramInt = i + b.a.a.a.fc(2, this.udg.aWM());
      }
      i = paramInt;
      if (this.udt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.udt);
      }
      paramInt = i;
      if (this.tBZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tBZ);
      }
      GMTrace.o(3759438561280L, 28010);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3759438561280L, 28010);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      air localair = (air)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3759438561280L, 28010);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localair.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3759438561280L, 28010);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localair.udg = ((ahr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3759438561280L, 28010);
        return 0;
      case 3: 
        localair.udt = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3759438561280L, 28010);
        return 0;
      }
      localair.tBZ = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3759438561280L, 28010);
      return 0;
    }
    GMTrace.o(3759438561280L, 28010);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/air.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */