package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atl
  extends com.tencent.mm.bl.a
{
  public int mXB;
  public int tNa;
  public long tNb;
  public LinkedList<atu> upb;
  
  public atl()
  {
    GMTrace.i(3667633635328L, 27326);
    this.upb = new LinkedList();
    GMTrace.o(3667633635328L, 27326);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3667767853056L, 27327);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tNa);
      paramVarArgs.R(2, this.tNb);
      paramVarArgs.d(3, 8, this.upb);
      paramVarArgs.fd(4, this.mXB);
      GMTrace.o(3667767853056L, 27327);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tNa);
      i = b.a.a.a.Q(2, this.tNb);
      int j = b.a.a.a.c(3, 8, this.upb);
      int k = b.a.a.a.fa(4, this.mXB);
      GMTrace.o(3667767853056L, 27327);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.upb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3667767853056L, 27327);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atl localatl = (atl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3667767853056L, 27327);
        return -1;
      case 1: 
        localatl.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3667767853056L, 27327);
        return 0;
      case 2: 
        localatl.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3667767853056L, 27327);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((atu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localatl.upb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3667767853056L, 27327);
        return 0;
      }
      localatl.mXB = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3667767853056L, 27327);
      return 0;
    }
    GMTrace.o(3667767853056L, 27327);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */