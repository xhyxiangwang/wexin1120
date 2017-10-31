package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ub
  extends axc
{
  public String mEm;
  public String tSc;
  public LinkedList<String> tSd;
  
  public ub()
  {
    GMTrace.i(3838761238528L, 28601);
    this.tSd = new LinkedList();
    GMTrace.o(3838761238528L, 28601);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3838895456256L, 28602);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tSc != null) {
        paramVarArgs.e(2, this.tSc);
      }
      paramVarArgs.d(3, 1, this.tSd);
      if (this.mEm != null) {
        paramVarArgs.e(4, this.mEm);
      }
      GMTrace.o(3838895456256L, 28602);
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
      if (this.tSc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tSc);
      }
      i += b.a.a.a.c(3, 1, this.tSd);
      paramInt = i;
      if (this.mEm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mEm);
      }
      GMTrace.o(3838895456256L, 28602);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3838895456256L, 28602);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ub localub = (ub)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3838895456256L, 28602);
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
          localub.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838895456256L, 28602);
        return 0;
      case 2: 
        localub.tSc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3838895456256L, 28602);
        return 0;
      case 3: 
        localub.tSd.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(3838895456256L, 28602);
        return 0;
      }
      localub.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3838895456256L, 28602);
      return 0;
    }
    GMTrace.o(3838895456256L, 28602);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */