package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ex
  extends axc
{
  public int fMx;
  public LinkedList<jo> hdL;
  public bfe ttd;
  
  public ex()
  {
    GMTrace.i(4028679323648L, 30016);
    this.hdL = new LinkedList();
    GMTrace.o(4028679323648L, 30016);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4028813541376L, 30017);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.hdL);
      if (this.ttd != null)
      {
        paramVarArgs.ff(3, this.ttd.aWM());
        this.ttd.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.fMx);
      GMTrace.o(4028813541376L, 30017);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.hdL);
      paramInt = i;
      if (this.ttd != null) {
        paramInt = i + b.a.a.a.fc(3, this.ttd.aWM());
      }
      i = b.a.a.a.fa(4, this.fMx);
      GMTrace.o(4028813541376L, 30017);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.hdL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4028813541376L, 30017);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ex localex = (ex)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4028813541376L, 30017);
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
          localex.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4028813541376L, 30017);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localex.hdL.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4028813541376L, 30017);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localex.ttd = ((bfe)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4028813541376L, 30017);
        return 0;
      }
      localex.fMx = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(4028813541376L, 30017);
      return 0;
    }
    GMTrace.o(4028813541376L, 30017);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */