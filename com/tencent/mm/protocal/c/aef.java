package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aef
  extends axk
{
  public int tZK;
  public LinkedList<boj> tZL;
  
  public aef()
  {
    GMTrace.i(15000173281280L, 111760);
    this.tZL = new LinkedList();
    GMTrace.o(15000173281280L, 111760);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15000307499008L, 111761);
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
      paramVarArgs.fd(2, this.tZK);
      paramVarArgs.d(3, 8, this.tZL);
      GMTrace.o(15000307499008L, 111761);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.tZK);
      int j = b.a.a.a.c(3, 8, this.tZL);
      GMTrace.o(15000307499008L, 111761);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tZL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(15000307499008L, 111761);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aef localaef = (aef)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15000307499008L, 111761);
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
          localaef.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15000307499008L, 111761);
        return 0;
      case 2: 
        localaef.tZK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(15000307499008L, 111761);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new boj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((boj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localaef.tZL.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(15000307499008L, 111761);
      return 0;
    }
    GMTrace.o(15000307499008L, 111761);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */