package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acp
  extends axc
{
  public String tYt;
  public String username;
  
  public acp()
  {
    GMTrace.i(17877801369600L, 133200);
    GMTrace.o(17877801369600L, 133200);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17877935587328L, 133201);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      if (this.tYt != null) {
        paramVarArgs.e(3, this.tYt);
      }
      GMTrace.o(17877935587328L, 133201);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.username);
      }
      i = paramInt;
      if (this.tYt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tYt);
      }
      GMTrace.o(17877935587328L, 133201);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17877935587328L, 133201);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acp localacp = (acp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17877935587328L, 133201);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localacp.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17877935587328L, 133201);
        return 0;
      case 2: 
        localacp.username = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17877935587328L, 133201);
        return 0;
      }
      localacp.tYt = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17877935587328L, 133201);
      return 0;
    }
    GMTrace.o(17877935587328L, 133201);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/acp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */