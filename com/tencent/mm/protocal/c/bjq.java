package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjq
  extends axc
{
  public axs tJz;
  public String tvh;
  public int twU;
  public int twV;
  public int twW;
  
  public bjq()
  {
    GMTrace.i(3641058525184L, 27128);
    GMTrace.o(3641058525184L, 27128);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3641192742912L, 27129);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tJz == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tvh != null) {
        paramVarArgs.e(2, this.tvh);
      }
      paramVarArgs.fd(3, this.twU);
      paramVarArgs.fd(4, this.twV);
      paramVarArgs.fd(5, this.twW);
      if (this.tJz != null)
      {
        paramVarArgs.ff(6, this.tJz.aWM());
        this.tJz.a(paramVarArgs);
      }
      GMTrace.o(3641192742912L, 27129);
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
      if (this.tvh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tvh);
      }
      i = i + b.a.a.a.fa(3, this.twU) + b.a.a.a.fa(4, this.twV) + b.a.a.a.fa(5, this.twW);
      paramInt = i;
      if (this.tJz != null) {
        paramInt = i + b.a.a.a.fc(6, this.tJz.aWM());
      }
      GMTrace.o(3641192742912L, 27129);
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
      if (this.tJz == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3641192742912L, 27129);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjq localbjq = (bjq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3641192742912L, 27129);
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
          localbjq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3641192742912L, 27129);
        return 0;
      case 2: 
        localbjq.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3641192742912L, 27129);
        return 0;
      case 3: 
        localbjq.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3641192742912L, 27129);
        return 0;
      case 4: 
        localbjq.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3641192742912L, 27129);
        return 0;
      case 5: 
        localbjq.twW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3641192742912L, 27129);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localbjq.tJz = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3641192742912L, 27129);
      return 0;
    }
    GMTrace.o(3641192742912L, 27129);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */