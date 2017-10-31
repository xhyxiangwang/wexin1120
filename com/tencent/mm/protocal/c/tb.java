package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tb
  extends com.tencent.mm.bl.a
{
  public int tEN;
  public axs tEO;
  
  public tb()
  {
    GMTrace.i(3771920809984L, 28103);
    GMTrace.o(3771920809984L, 28103);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3772055027712L, 28104);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      paramVarArgs.fd(1, this.tEN);
      if (this.tEO != null)
      {
        paramVarArgs.ff(3, this.tEO.aWM());
        this.tEO.a(paramVarArgs);
      }
      GMTrace.o(3772055027712L, 28104);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.tEN) + 0;
      paramInt = i;
      if (this.tEO != null) {
        paramInt = i + b.a.a.a.fc(3, this.tEO.aWM());
      }
      GMTrace.o(3772055027712L, 28104);
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
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3772055027712L, 28104);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tb localtb = (tb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      default: 
        GMTrace.o(3772055027712L, 28104);
        return -1;
      case 1: 
        localtb.tEN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3772055027712L, 28104);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localtb.tEO = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3772055027712L, 28104);
      return 0;
    }
    GMTrace.o(3772055027712L, 28104);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */