package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hq
  extends axk
{
  public int lpk;
  public String lpl;
  public LinkedList<ck> tCe;
  
  public hq()
  {
    GMTrace.i(3759841214464L, 28013);
    this.tCe = new LinkedList();
    GMTrace.o(3759841214464L, 28013);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3759975432192L, 28014);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tCe);
      paramVarArgs.fd(3, this.lpk);
      if (this.lpl != null) {
        paramVarArgs.e(4, this.lpl);
      }
      GMTrace.o(3759975432192L, 28014);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tCe) + b.a.a.a.fa(3, this.lpk);
      paramInt = i;
      if (this.lpl != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lpl);
      }
      GMTrace.o(3759975432192L, 28014);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tCe.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3759975432192L, 28014);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hq localhq = (hq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3759975432192L, 28014);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localhq.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3759975432192L, 28014);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ck();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ck)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localhq.tCe.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3759975432192L, 28014);
        return 0;
      case 3: 
        localhq.lpk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3759975432192L, 28014);
        return 0;
      }
      localhq.lpl = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3759975432192L, 28014);
      return 0;
    }
    GMTrace.o(3759975432192L, 28014);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */