package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ou
  extends axk
{
  public int kpr;
  
  public ou()
  {
    GMTrace.i(4027068710912L, 30004);
    GMTrace.o(4027068710912L, 30004);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4027202928640L, 30005);
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
      paramVarArgs.fd(2, this.kpr);
      GMTrace.o(4027202928640L, 30005);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.kpr);
      GMTrace.o(4027202928640L, 30005);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4027202928640L, 30005);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ou localou = (ou)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4027202928640L, 30005);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localou.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4027202928640L, 30005);
        return 0;
      }
      localou.kpr = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(4027202928640L, 30005);
      return 0;
    }
    GMTrace.o(4027202928640L, 30005);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */