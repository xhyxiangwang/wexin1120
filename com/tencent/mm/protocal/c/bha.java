package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bha
  extends axc
{
  public int mDF;
  public axs tKb;
  public int tLt;
  public int twU;
  public int twV;
  public String uhf;
  public int unO;
  
  public bha()
  {
    GMTrace.i(3838224367616L, 28597);
    GMTrace.o(3838224367616L, 28597);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3838358585344L, 28598);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tKb == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.mDF);
      paramVarArgs.fd(3, this.unO);
      if (this.tKb != null)
      {
        paramVarArgs.ff(4, this.tKb.aWM());
        this.tKb.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.twV);
      paramVarArgs.fd(6, this.twU);
      if (this.uhf != null) {
        paramVarArgs.e(7, this.uhf);
      }
      paramVarArgs.fd(8, this.tLt);
      GMTrace.o(3838358585344L, 28598);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.mDF) + b.a.a.a.fa(3, this.unO);
      paramInt = i;
      if (this.tKb != null) {
        paramInt = i + b.a.a.a.fc(4, this.tKb.aWM());
      }
      i = paramInt + b.a.a.a.fa(5, this.twV) + b.a.a.a.fa(6, this.twU);
      paramInt = i;
      if (this.uhf != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uhf);
      }
      i = b.a.a.a.fa(8, this.tLt);
      GMTrace.o(3838358585344L, 28598);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tKb == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3838358585344L, 28598);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bha localbha = (bha)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3838358585344L, 28598);
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
          localbha.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 2: 
        localbha.mDF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 3: 
        localbha.unO = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbha.tKb = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 5: 
        localbha.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 6: 
        localbha.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      case 7: 
        localbha.uhf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3838358585344L, 28598);
        return 0;
      }
      localbha.tLt = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3838358585344L, 28598);
      return 0;
    }
    GMTrace.o(3838358585344L, 28598);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */