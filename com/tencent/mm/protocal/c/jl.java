package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jl
  extends axc
{
  public int tEN;
  public axs tEO;
  public aka tEP;
  public int tEQ;
  
  public jl()
  {
    GMTrace.i(3621731172352L, 26984);
    GMTrace.o(3621731172352L, 26984);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3621865390080L, 26985);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tEN);
      if (this.tEO != null)
      {
        paramVarArgs.ff(3, this.tEO.aWM());
        this.tEO.a(paramVarArgs);
      }
      if (this.tEP != null)
      {
        paramVarArgs.ff(4, this.tEP.aWM());
        this.tEP.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.tEQ);
      GMTrace.o(3621865390080L, 26985);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tEN);
      paramInt = i;
      if (this.tEO != null) {
        paramInt = i + b.a.a.a.fc(3, this.tEO.aWM());
      }
      i = paramInt;
      if (this.tEP != null) {
        i = paramInt + b.a.a.a.fc(4, this.tEP.aWM());
      }
      paramInt = b.a.a.a.fa(5, this.tEQ);
      GMTrace.o(3621865390080L, 26985);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tEO == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3621865390080L, 26985);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jl localjl = (jl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3621865390080L, 26985);
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
          localjl.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621865390080L, 26985);
        return 0;
      case 2: 
        localjl.tEN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3621865390080L, 26985);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localjl.tEO = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621865390080L, 26985);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aka();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aka)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localjl.tEP = ((aka)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621865390080L, 26985);
        return 0;
      }
      localjl.tEQ = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3621865390080L, 26985);
      return 0;
    }
    GMTrace.o(3621865390080L, 26985);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */