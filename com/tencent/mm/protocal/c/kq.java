package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kq
  extends axc
{
  public String desc;
  public boolean tGO;
  public boolean tGP;
  public LinkedList<Integer> tGp;
  
  public kq()
  {
    GMTrace.i(19141058625536L, 142612);
    this.tGp = new LinkedList();
    GMTrace.o(19141058625536L, 142612);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19141192843264L, 142613);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 2, this.tGp);
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      paramVarArgs.af(4, this.tGO);
      paramVarArgs.af(5, this.tGP);
      GMTrace.o(19141192843264L, 142613);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 2, this.tGp);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.desc);
      }
      i = b.a.a.b.b.a.cK(4);
      int j = b.a.a.b.b.a.cK(5);
      GMTrace.o(19141192843264L, 142613);
      return paramInt + (i + 1) + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tGp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(19141192843264L, 142613);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kq localkq = (kq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19141192843264L, 142613);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localkq.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19141192843264L, 142613);
        return 0;
      case 2: 
        localkq.tGp.add(Integer.valueOf(((b.a.a.a.a)localObject1).xSv.nm()));
        GMTrace.o(19141192843264L, 142613);
        return 0;
      case 3: 
        localkq.desc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19141192843264L, 142613);
        return 0;
      case 4: 
        localkq.tGO = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(19141192843264L, 142613);
        return 0;
      }
      localkq.tGP = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(19141192843264L, 142613);
      return 0;
    }
    GMTrace.o(19141192843264L, 142613);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */