package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class oo
  extends com.tencent.mm.bl.a
{
  public axt tKK;
  
  public oo()
  {
    GMTrace.i(4024652791808L, 29986);
    GMTrace.o(4024652791808L, 29986);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4024787009536L, 29987);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tKK == null) {
        throw new b("Not all required fields were included: MemberName");
      }
      if (this.tKK != null)
      {
        paramVarArgs.ff(1, this.tKK.aWM());
        this.tKK.a(paramVarArgs);
      }
      GMTrace.o(4024787009536L, 29987);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tKK != null) {
        paramInt = b.a.a.a.fc(1, this.tKK.aWM()) + 0;
      }
      GMTrace.o(4024787009536L, 29987);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tKK == null) {
        throw new b("Not all required fields were included: MemberName");
      }
      GMTrace.o(4024787009536L, 29987);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      oo localoo = (oo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4024787009536L, 29987);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localoo.tKK = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4024787009536L, 29987);
      return 0;
    }
    GMTrace.o(4024787009536L, 29987);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */