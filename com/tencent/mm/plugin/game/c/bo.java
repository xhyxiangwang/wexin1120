package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bo
  extends com.tencent.mm.bl.a
{
  public LinkedList<a> mFO;
  public bv mFP;
  public LinkedList<j> mFQ;
  public bs mFR;
  public LinkedList<cd> mFS;
  
  public bo()
  {
    GMTrace.i(12655792226304L, 94293);
    this.mFO = new LinkedList();
    this.mFQ = new LinkedList();
    this.mFS = new LinkedList();
    GMTrace.o(12655792226304L, 94293);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12655926444032L, 94294);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.mFO);
      if (this.mFP != null)
      {
        paramVarArgs.ff(2, this.mFP.aWM());
        this.mFP.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.mFQ);
      if (this.mFR != null)
      {
        paramVarArgs.ff(4, this.mFR.aWM());
        this.mFR.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.mFS);
      GMTrace.o(12655926444032L, 94294);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.mFO) + 0;
      paramInt = i;
      if (this.mFP != null) {
        paramInt = i + b.a.a.a.fc(2, this.mFP.aWM());
      }
      i = paramInt + b.a.a.a.c(3, 8, this.mFQ);
      paramInt = i;
      if (this.mFR != null) {
        paramInt = i + b.a.a.a.fc(4, this.mFR.aWM());
      }
      i = b.a.a.a.c(5, 8, this.mFS);
      GMTrace.o(12655926444032L, 94294);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mFO.clear();
      this.mFQ.clear();
      this.mFS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12655926444032L, 94294);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bo localbo = (bo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12655926444032L, 94294);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbo.mFO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbo.mFP = ((bv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new j();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((j)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbo.mFQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbo.mFR = ((bs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbo.mFS.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(12655926444032L, 94294);
      return 0;
    }
    GMTrace.o(12655926444032L, 94294);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */