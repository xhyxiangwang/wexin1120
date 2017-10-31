package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ku
  extends axk
{
  public ks tHc;
  public String tHd;
  
  public ku()
  {
    GMTrace.i(3628173623296L, 27032);
    GMTrace.o(3628173623296L, 27032);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3628307841024L, 27033);
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
      if (this.tHc != null)
      {
        paramVarArgs.ff(2, this.tHc.aWM());
        this.tHc.a(paramVarArgs);
      }
      if (this.tHd != null) {
        paramVarArgs.e(3, this.tHd);
      }
      GMTrace.o(3628307841024L, 27033);
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
      if (this.tHc != null) {
        paramInt = i + b.a.a.a.fc(2, this.tHc.aWM());
      }
      i = paramInt;
      if (this.tHd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tHd);
      }
      GMTrace.o(3628307841024L, 27033);
      return i;
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
      GMTrace.o(3628307841024L, 27033);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ku localku = (ku)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3628307841024L, 27033);
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
          localku.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3628307841024L, 27033);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ks();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ks)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localku.tHc = ((ks)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3628307841024L, 27033);
        return 0;
      }
      localku.tHd = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3628307841024L, 27033);
      return 0;
    }
    GMTrace.o(3628307841024L, 27033);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */