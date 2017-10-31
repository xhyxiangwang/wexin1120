package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aix
  extends com.tencent.mm.bl.a
{
  public ajk tuS;
  public LinkedList<ajl> tuT;
  
  public aix()
  {
    GMTrace.i(3819836538880L, 28460);
    this.tuT = new LinkedList();
    GMTrace.o(3819836538880L, 28460);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3819970756608L, 28461);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tuS == null) {
        throw new b("Not all required fields were included: LogHead");
      }
      if (this.tuS != null)
      {
        paramVarArgs.ff(1, this.tuS.aWM());
        this.tuS.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tuT);
      GMTrace.o(3819970756608L, 28461);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tuS != null) {
        paramInt = b.a.a.a.fc(1, this.tuS.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.tuT);
      GMTrace.o(3819970756608L, 28461);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tuT.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tuS == null) {
        throw new b("Not all required fields were included: LogHead");
      }
      GMTrace.o(3819970756608L, 28461);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aix localaix = (aix)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3819970756608L, 28461);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ajk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ajk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localaix.tuS = ((ajk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3819970756608L, 28461);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ajl();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ajl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localaix.tuT.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3819970756608L, 28461);
      return 0;
    }
    GMTrace.o(3819970756608L, 28461);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */