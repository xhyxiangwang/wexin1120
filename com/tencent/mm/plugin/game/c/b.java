package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public c mCC;
  public a mCF;
  public String mCG;
  
  public b()
  {
    GMTrace.i(12641833582592L, 94189);
    GMTrace.o(12641833582592L, 94189);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12641967800320L, 94190);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.jXP);
      if (this.mCC != null)
      {
        paramVarArgs.ff(2, this.mCC.aWM());
        this.mCC.a(paramVarArgs);
      }
      if (this.mCF != null)
      {
        paramVarArgs.ff(3, this.mCF.aWM());
        this.mCF.a(paramVarArgs);
      }
      if (this.mCG != null) {
        paramVarArgs.e(4, this.mCG);
      }
      GMTrace.o(12641967800320L, 94190);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.jXP) + 0;
      paramInt = i;
      if (this.mCC != null) {
        paramInt = i + b.a.a.a.fc(2, this.mCC.aWM());
      }
      i = paramInt;
      if (this.mCF != null) {
        i = paramInt + b.a.a.a.fc(3, this.mCF.aWM());
      }
      paramInt = i;
      if (this.mCG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCG);
      }
      GMTrace.o(12641967800320L, 94190);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12641967800320L, 94190);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12641967800320L, 94190);
        return -1;
      case 1: 
        localb.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12641967800320L, 94190);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localb.mCC = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641967800320L, 94190);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localb.mCF = ((a)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641967800320L, 94190);
        return 0;
      }
      localb.mCG = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12641967800320L, 94190);
      return 0;
    }
    GMTrace.o(12641967800320L, 94190);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */