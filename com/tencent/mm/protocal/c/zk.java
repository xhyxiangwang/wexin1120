package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zk
  extends axk
{
  public long jXn;
  public int tVX;
  public int tVY;
  public int tVZ;
  public long tvl;
  
  public zk()
  {
    GMTrace.i(3873389412352L, 28859);
    GMTrace.o(3873389412352L, 28859);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3873523630080L, 28860);
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
      paramVarArgs.R(2, this.tvl);
      paramVarArgs.R(3, this.jXn);
      paramVarArgs.fd(4, this.tVX);
      paramVarArgs.fd(5, this.tVY);
      paramVarArgs.fd(6, this.tVZ);
      GMTrace.o(3873523630080L, 28860);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.Q(2, this.tvl);
      int j = b.a.a.a.Q(3, this.jXn);
      int k = b.a.a.a.fa(4, this.tVX);
      int m = b.a.a.a.fa(5, this.tVY);
      int n = b.a.a.a.fa(6, this.tVZ);
      GMTrace.o(3873523630080L, 28860);
      return paramInt + i + j + k + m + n;
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
      GMTrace.o(3873523630080L, 28860);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zk localzk = (zk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3873523630080L, 28860);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localzk.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 2: 
        localzk.tvl = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 3: 
        localzk.jXn = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 4: 
        localzk.tVX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      case 5: 
        localzk.tVY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3873523630080L, 28860);
        return 0;
      }
      localzk.tVZ = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3873523630080L, 28860);
      return 0;
    }
    GMTrace.o(3873523630080L, 28860);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */