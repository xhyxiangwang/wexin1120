package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aj
  extends axc
{
  public int fMx;
  public String tsZ;
  public String tta;
  public int ttb;
  public LinkedList<jg> tte;
  
  public aj()
  {
    GMTrace.i(3753667198976L, 27967);
    this.tte = new LinkedList();
    GMTrace.o(3753667198976L, 27967);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3753801416704L, 27968);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tte);
      paramVarArgs.fd(3, this.fMx);
      if (this.tsZ != null) {
        paramVarArgs.e(4, this.tsZ);
      }
      if (this.tta != null) {
        paramVarArgs.e(5, this.tta);
      }
      paramVarArgs.fd(6, this.ttb);
      GMTrace.o(3753801416704L, 27968);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tte) + b.a.a.a.fa(3, this.fMx);
      paramInt = i;
      if (this.tsZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tsZ);
      }
      i = paramInt;
      if (this.tta != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tta);
      }
      paramInt = b.a.a.a.fa(6, this.ttb);
      GMTrace.o(3753801416704L, 27968);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tte.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3753801416704L, 27968);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aj localaj = (aj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3753801416704L, 27968);
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
          localaj.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localaj.tte.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 3: 
        localaj.fMx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 4: 
        localaj.tsZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3753801416704L, 27968);
        return 0;
      case 5: 
        localaj.tta = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3753801416704L, 27968);
        return 0;
      }
      localaj.ttb = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3753801416704L, 27968);
      return 0;
    }
    GMTrace.o(3753801416704L, 27968);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */