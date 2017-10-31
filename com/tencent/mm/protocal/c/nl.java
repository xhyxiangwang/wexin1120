package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nl
  extends com.tencent.mm.bl.a
{
  public int tKa;
  public axs tKb;
  public int twV;
  
  public nl()
  {
    GMTrace.i(3761451827200L, 28025);
    GMTrace.o(3761451827200L, 28025);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3761586044928L, 28026);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tKb == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fd(1, this.twV);
      paramVarArgs.fd(2, this.tKa);
      if (this.tKb != null)
      {
        paramVarArgs.ff(3, this.tKb.aWM());
        this.tKb.a(paramVarArgs);
      }
      GMTrace.o(3761586044928L, 28026);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.twV) + 0 + b.a.a.a.fa(2, this.tKa);
      paramInt = i;
      if (this.tKb != null) {
        paramInt = i + b.a.a.a.fc(3, this.tKb.aWM());
      }
      GMTrace.o(3761586044928L, 28026);
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
      if (this.tKb == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3761586044928L, 28026);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nl localnl = (nl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3761586044928L, 28026);
        return -1;
      case 1: 
        localnl.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3761586044928L, 28026);
        return 0;
      case 2: 
        localnl.tKa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3761586044928L, 28026);
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
        localnl.tKb = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3761586044928L, 28026);
      return 0;
    }
    GMTrace.o(3761586044928L, 28026);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/nl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */