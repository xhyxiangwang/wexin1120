package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbe
  extends axc
{
  public float fFh;
  public float fGL;
  public int scene;
  public String utx;
  
  public bbe()
  {
    GMTrace.i(3735145152512L, 27829);
    GMTrace.o(3735145152512L, 27829);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3735279370240L, 27830);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.n(2, this.fGL);
      paramVarArgs.n(3, this.fFh);
      paramVarArgs.fd(4, this.scene);
      if (this.utx != null) {
        paramVarArgs.e(5, this.utx);
      }
      GMTrace.o(3735279370240L, 27830);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 4) + (b.a.a.b.b.a.cK(3) + 4) + b.a.a.a.fa(4, this.scene);
      paramInt = i;
      if (this.utx != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.utx);
      }
      GMTrace.o(3735279370240L, 27830);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3735279370240L, 27830);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbe localbbe = (bbe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3735279370240L, 27830);
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
          localbbe.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3735279370240L, 27830);
        return 0;
      case 2: 
        localbbe.fGL = ((b.a.a.a.a)localObject1).xSv.readFloat();
        GMTrace.o(3735279370240L, 27830);
        return 0;
      case 3: 
        localbbe.fFh = ((b.a.a.a.a)localObject1).xSv.readFloat();
        GMTrace.o(3735279370240L, 27830);
        return 0;
      case 4: 
        localbbe.scene = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3735279370240L, 27830);
        return 0;
      }
      localbbe.utx = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3735279370240L, 27830);
      return 0;
    }
    GMTrace.o(3735279370240L, 27830);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */