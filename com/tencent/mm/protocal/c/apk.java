package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apk
  extends axc
{
  public String nas;
  public String rQC;
  public at tEh;
  public int ulM;
  
  public apk()
  {
    GMTrace.i(3854598930432L, 28719);
    GMTrace.o(3854598930432L, 28719);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3854733148160L, 28720);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.ulM);
      if (this.nas != null) {
        paramVarArgs.e(3, this.nas);
      }
      if (this.rQC != null) {
        paramVarArgs.e(4, this.rQC);
      }
      if (this.tEh != null)
      {
        paramVarArgs.ff(5, this.tEh.aWM());
        this.tEh.a(paramVarArgs);
      }
      GMTrace.o(3854733148160L, 28720);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.ulM);
      paramInt = i;
      if (this.nas != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.nas);
      }
      i = paramInt;
      if (this.rQC != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.rQC);
      }
      paramInt = i;
      if (this.tEh != null) {
        paramInt = i + b.a.a.a.fc(5, this.tEh.aWM());
      }
      GMTrace.o(3854733148160L, 28720);
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
      GMTrace.o(3854733148160L, 28720);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apk localapk = (apk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3854733148160L, 28720);
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
          localapk.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3854733148160L, 28720);
        return 0;
      case 2: 
        localapk.ulM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3854733148160L, 28720);
        return 0;
      case 3: 
        localapk.nas = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3854733148160L, 28720);
        return 0;
      case 4: 
        localapk.rQC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3854733148160L, 28720);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localapk.tEh = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3854733148160L, 28720);
      return 0;
    }
    GMTrace.o(3854733148160L, 28720);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */