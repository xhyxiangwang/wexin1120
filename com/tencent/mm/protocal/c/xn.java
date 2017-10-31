package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xn
  extends axk
{
  public String kpq;
  public String kqI;
  
  public xn()
  {
    GMTrace.i(3624147091456L, 27002);
    GMTrace.o(3624147091456L, 27002);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3624281309184L, 27003);
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
      if (this.kpq != null) {
        paramVarArgs.e(2, this.kpq);
      }
      if (this.kqI != null) {
        paramVarArgs.e(3, this.kqI);
      }
      GMTrace.o(3624281309184L, 27003);
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
      if (this.kpq != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kpq);
      }
      i = paramInt;
      if (this.kqI != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.kqI);
      }
      GMTrace.o(3624281309184L, 27003);
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
      GMTrace.o(3624281309184L, 27003);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xn localxn = (xn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3624281309184L, 27003);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localxn.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3624281309184L, 27003);
        return 0;
      case 2: 
        localxn.kpq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3624281309184L, 27003);
        return 0;
      }
      localxn.kqI = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3624281309184L, 27003);
      return 0;
    }
    GMTrace.o(3624281309184L, 27003);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */