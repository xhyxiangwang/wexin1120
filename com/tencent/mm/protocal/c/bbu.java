package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbu
  extends axk
{
  public LinkedList<bbs> hdL;
  public int kqy;
  public long utX;
  public int utZ;
  
  public bbu()
  {
    GMTrace.i(3766283665408L, 28061);
    this.hdL = new LinkedList();
    GMTrace.o(3766283665408L, 28061);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3766417883136L, 28062);
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
      paramVarArgs.d(2, 8, this.hdL);
      paramVarArgs.fd(3, this.utZ);
      paramVarArgs.R(4, this.utX);
      paramVarArgs.fd(5, this.kqy);
      GMTrace.o(3766417883136L, 28062);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.hdL);
      int j = b.a.a.a.fa(3, this.utZ);
      int k = b.a.a.a.Q(4, this.utX);
      int m = b.a.a.a.fa(5, this.kqy);
      GMTrace.o(3766417883136L, 28062);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.hdL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3766417883136L, 28062);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbu localbbu = (bbu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3766417883136L, 28062);
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
          localbbu.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3766417883136L, 28062);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbbu.hdL.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3766417883136L, 28062);
        return 0;
      case 3: 
        localbbu.utZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3766417883136L, 28062);
        return 0;
      case 4: 
        localbbu.utX = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3766417883136L, 28062);
        return 0;
      }
      localbbu.kqy = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3766417883136L, 28062);
      return 0;
    }
    GMTrace.o(3766417883136L, 28062);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */