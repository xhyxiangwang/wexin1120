package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bkr
  extends com.tencent.mm.bl.a
{
  public String title;
  public LinkedList<bgn> uAR;
  public LinkedList<bgn> uAS;
  public LinkedList<nc> uAT;
  
  public bkr()
  {
    GMTrace.i(3921036705792L, 29214);
    this.uAR = new LinkedList();
    this.uAS = new LinkedList();
    this.uAT = new LinkedList();
    GMTrace.o(3921036705792L, 29214);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3921170923520L, 29215);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      paramVarArgs.d(2, 8, this.uAR);
      paramVarArgs.d(3, 8, this.uAS);
      paramVarArgs.d(4, 8, this.uAT);
      GMTrace.o(3921170923520L, 29215);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.title != null) {
        paramInt = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      i = b.a.a.a.c(2, 8, this.uAR);
      int j = b.a.a.a.c(3, 8, this.uAS);
      int k = b.a.a.a.c(4, 8, this.uAT);
      GMTrace.o(3921170923520L, 29215);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uAR.clear();
      this.uAS.clear();
      this.uAT.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3921170923520L, 29215);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bkr localbkr = (bkr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3921170923520L, 29215);
        return -1;
      case 1: 
        localbkr.title = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3921170923520L, 29215);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbkr.uAR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3921170923520L, 29215);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbkr.uAS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3921170923520L, 29215);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new nc();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbkr.uAT.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3921170923520L, 29215);
      return 0;
    }
    GMTrace.o(3921170923520L, 29215);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bkr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */