package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sn
  extends com.tencent.mm.bl.a
{
  public long tOk;
  public long tOl;
  public LinkedList<bhd> tOm;
  
  public sn()
  {
    GMTrace.i(3711522832384L, 27653);
    this.tOm = new LinkedList();
    GMTrace.o(3711522832384L, 27653);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3711657050112L, 27654);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.tOk);
      paramVarArgs.R(2, this.tOl);
      paramVarArgs.d(3, 8, this.tOm);
      GMTrace.o(3711657050112L, 27654);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.Q(1, this.tOk);
      i = b.a.a.a.Q(2, this.tOl);
      int j = b.a.a.a.c(3, 8, this.tOm);
      GMTrace.o(3711657050112L, 27654);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tOm.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3711657050112L, 27654);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sn localsn = (sn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3711657050112L, 27654);
        return -1;
      case 1: 
        localsn.tOk = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3711657050112L, 27654);
        return 0;
      case 2: 
        localsn.tOl = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3711657050112L, 27654);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bhd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localsn.tOm.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3711657050112L, 27654);
      return 0;
    }
    GMTrace.o(3711657050112L, 27654);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/sn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */