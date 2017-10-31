package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdw
  extends axk
{
  public String uip;
  public bdk uuw;
  
  public bdw()
  {
    GMTrace.i(3754204069888L, 27971);
    GMTrace.o(3754204069888L, 27971);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3754338287616L, 27972);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuw == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.uuw != null)
      {
        paramVarArgs.ff(2, this.uuw.aWM());
        this.uuw.a(paramVarArgs);
      }
      if (this.uip != null) {
        paramVarArgs.e(3, this.uip);
      }
      GMTrace.o(3754338287616L, 27972);
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
      if (this.uuw != null) {
        paramInt = i + b.a.a.a.fc(2, this.uuw.aWM());
      }
      i = paramInt;
      if (this.uip != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uip);
      }
      GMTrace.o(3754338287616L, 27972);
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
      if (this.uuw == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      GMTrace.o(3754338287616L, 27972);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdw localbdw = (bdw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3754338287616L, 27972);
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
          localbdw.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3754338287616L, 27972);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbdw.uuw = ((bdk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3754338287616L, 27972);
        return 0;
      }
      localbdw.uip = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3754338287616L, 27972);
      return 0;
    }
    GMTrace.o(3754338287616L, 27972);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */