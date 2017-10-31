package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beh
  extends axc
{
  public int jWQ;
  public LinkedList<axt> jWR;
  public String mFu;
  public int tsp;
  public int ttY;
  public long uwl;
  
  public beh()
  {
    GMTrace.i(4035927080960L, 30070);
    this.jWR = new LinkedList();
    GMTrace.o(4035927080960L, 30070);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4036061298688L, 30071);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tsp);
      paramVarArgs.R(3, this.uwl);
      if (this.mFu != null) {
        paramVarArgs.e(4, this.mFu);
      }
      paramVarArgs.fd(5, this.jWQ);
      paramVarArgs.d(6, 8, this.jWR);
      paramVarArgs.fd(7, this.ttY);
      GMTrace.o(4036061298688L, 30071);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tsp) + b.a.a.a.Q(3, this.uwl);
      paramInt = i;
      if (this.mFu != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mFu);
      }
      i = b.a.a.a.fa(5, this.jWQ);
      int j = b.a.a.a.c(6, 8, this.jWR);
      int k = b.a.a.a.fa(7, this.ttY);
      GMTrace.o(4036061298688L, 30071);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jWR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4036061298688L, 30071);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beh localbeh = (beh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4036061298688L, 30071);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbeh.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 2: 
        localbeh.tsp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 3: 
        localbeh.uwl = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 4: 
        localbeh.mFu = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 5: 
        localbeh.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4036061298688L, 30071);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbeh.jWR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4036061298688L, 30071);
        return 0;
      }
      localbeh.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(4036061298688L, 30071);
      return 0;
    }
    GMTrace.o(4036061298688L, 30071);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/beh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */