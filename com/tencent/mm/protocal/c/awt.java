package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awt
  extends axk
{
  public awt()
  {
    GMTrace.i(18814104240128L, 140176);
    GMTrace.o(18814104240128L, 140176);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18814238457856L, 140177);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      GMTrace.o(18814238457856L, 140177);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      GMTrace.o(18814238457856L, 140177);
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
      GMTrace.o(18814238457856L, 140177);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awt localawt = (awt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(18814238457856L, 140177);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new eo();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localawt.urV = ((eo)localObject1);
        paramInt += 1;
      }
      GMTrace.o(18814238457856L, 140177);
      return 0;
    }
    GMTrace.o(18814238457856L, 140177);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/awt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */