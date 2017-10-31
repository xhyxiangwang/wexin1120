package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqe
  extends com.tencent.mm.bl.a
{
  public long uFM;
  public long uFN;
  public String uFO;
  public LinkedList<bqf> uFP;
  
  public bqe()
  {
    GMTrace.i(4038879870976L, 30092);
    this.uFP = new LinkedList();
    GMTrace.o(4038879870976L, 30092);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4039014088704L, 30093);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFO == null) {
        throw new b("Not all required fields were included: TotalMsg");
      }
      paramVarArgs.R(1, this.uFN);
      paramVarArgs.R(2, this.uFM);
      if (this.uFO != null) {
        paramVarArgs.e(3, this.uFO);
      }
      paramVarArgs.d(4, 8, this.uFP);
      GMTrace.o(4039014088704L, 30093);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.Q(1, this.uFN) + 0 + b.a.a.a.Q(2, this.uFM);
      paramInt = i;
      if (this.uFO != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uFO);
      }
      i = b.a.a.a.c(4, 8, this.uFP);
      GMTrace.o(4039014088704L, 30093);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uFP.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.uFO == null) {
        throw new b("Not all required fields were included: TotalMsg");
      }
      GMTrace.o(4039014088704L, 30093);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqe localbqe = (bqe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4039014088704L, 30093);
        return -1;
      case 1: 
        localbqe.uFN = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(4039014088704L, 30093);
        return 0;
      case 2: 
        localbqe.uFM = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(4039014088704L, 30093);
        return 0;
      case 3: 
        localbqe.uFO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4039014088704L, 30093);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bqf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bqf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbqe.uFP.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4039014088704L, 30093);
      return 0;
    }
    GMTrace.o(4039014088704L, 30093);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */