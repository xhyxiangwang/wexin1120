package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hp
  extends axc
{
  public String tAY;
  public akw tCc;
  public aya tCd;
  public int tsr;
  public String tss;
  
  public hp()
  {
    GMTrace.i(3756619988992L, 27989);
    GMTrace.o(3756619988992L, 27989);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3756754206720L, 27990);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tAY != null) {
        paramVarArgs.e(2, this.tAY);
      }
      if (this.tCc != null)
      {
        paramVarArgs.ff(3, this.tCc.aWM());
        this.tCc.a(paramVarArgs);
      }
      if (this.tCd != null)
      {
        paramVarArgs.ff(4, this.tCd.aWM());
        this.tCd.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.tsr);
      if (this.tss != null) {
        paramVarArgs.e(6, this.tss);
      }
      GMTrace.o(3756754206720L, 27990);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.tAY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tAY);
      }
      i = paramInt;
      if (this.tCc != null) {
        i = paramInt + b.a.a.a.fc(3, this.tCc.aWM());
      }
      paramInt = i;
      if (this.tCd != null) {
        paramInt = i + b.a.a.a.fc(4, this.tCd.aWM());
      }
      i = paramInt + b.a.a.a.fa(5, this.tsr);
      paramInt = i;
      if (this.tss != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tss);
      }
      GMTrace.o(3756754206720L, 27990);
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
      GMTrace.o(3756754206720L, 27990);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hp localhp = (hp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3756754206720L, 27990);
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
          localhp.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 2: 
        localhp.tAY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new akw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((akw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localhp.tCc = ((akw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aya();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aya)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localhp.tCd = ((aya)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3756754206720L, 27990);
        return 0;
      case 5: 
        localhp.tsr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3756754206720L, 27990);
        return 0;
      }
      localhp.tss = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3756754206720L, 27990);
      return 0;
    }
    GMTrace.o(3756754206720L, 27990);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */