package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajy
  extends axc
{
  public String mDD;
  public int tYq;
  public bti ufb;
  
  public ajy()
  {
    GMTrace.i(17615003058176L, 131242);
    GMTrace.o(17615003058176L, 131242);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615137275904L, 131243);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      paramVarArgs.fd(3, this.tYq);
      if (this.ufb != null)
      {
        paramVarArgs.ff(4, this.ufb.aWM());
        this.ufb.a(paramVarArgs);
      }
      GMTrace.o(17615137275904L, 131243);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.mDD != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDD);
      }
      i += b.a.a.a.fa(3, this.tYq);
      paramInt = i;
      if (this.ufb != null) {
        paramInt = i + b.a.a.a.fc(4, this.ufb.aWM());
      }
      GMTrace.o(17615137275904L, 131243);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17615137275904L, 131243);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajy localajy = (ajy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17615137275904L, 131243);
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
          localajy.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17615137275904L, 131243);
        return 0;
      case 2: 
        localajy.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17615137275904L, 131243);
        return 0;
      case 3: 
        localajy.tYq = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17615137275904L, 131243);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bti();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bti)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localajy.ufb = ((bti)localObject1);
        paramInt += 1;
      }
      GMTrace.o(17615137275904L, 131243);
      return 0;
    }
    GMTrace.o(17615137275904L, 131243);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */