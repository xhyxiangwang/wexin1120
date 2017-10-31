package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bel
  extends axc
{
  public String uuR;
  public long uuS;
  public axs uuy;
  public long uwo;
  public int uwp;
  public long uwq;
  public int uwr;
  
  public bel()
  {
    GMTrace.i(3898488127488L, 29046);
    GMTrace.o(3898488127488L, 29046);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3898622345216L, 29047);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uuR != null) {
        paramVarArgs.e(2, this.uuR);
      }
      paramVarArgs.R(3, this.uuS);
      paramVarArgs.R(4, this.uwo);
      paramVarArgs.fd(5, this.uwp);
      paramVarArgs.R(6, this.uwq);
      if (this.uuy != null)
      {
        paramVarArgs.ff(7, this.uuy.aWM());
        this.uuy.a(paramVarArgs);
      }
      paramVarArgs.fd(8, this.uwr);
      GMTrace.o(3898622345216L, 29047);
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
      if (this.uuR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uuR);
      }
      i = i + b.a.a.a.Q(3, this.uuS) + b.a.a.a.Q(4, this.uwo) + b.a.a.a.fa(5, this.uwp) + b.a.a.a.Q(6, this.uwq);
      paramInt = i;
      if (this.uuy != null) {
        paramInt = i + b.a.a.a.fc(7, this.uuy.aWM());
      }
      i = b.a.a.a.fa(8, this.uwr);
      GMTrace.o(3898622345216L, 29047);
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
      GMTrace.o(3898622345216L, 29047);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bel localbel = (bel)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3898622345216L, 29047);
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
          localbel.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 2: 
        localbel.uuR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 3: 
        localbel.uuS = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 4: 
        localbel.uwo = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 5: 
        localbel.uwp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 6: 
        localbel.uwq = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbel.uuy = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3898622345216L, 29047);
        return 0;
      }
      localbel.uwr = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3898622345216L, 29047);
      return 0;
    }
    GMTrace.o(3898622345216L, 29047);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */