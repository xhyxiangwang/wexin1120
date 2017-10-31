package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mv
  extends axk
{
  public int kpr;
  public String kps;
  
  public mv()
  {
    GMTrace.i(17877264498688L, 133196);
    GMTrace.o(17877264498688L, 133196);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17877398716416L, 133197);
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
      if (this.kps != null) {
        paramVarArgs.e(3, this.kps);
      }
      GMTrace.o(17877398716416L, 133197);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kpr);
      paramInt = i;
      if (this.kps != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kps);
      }
      GMTrace.o(17877398716416L, 133197);
      return paramInt;
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
      GMTrace.o(17877398716416L, 133197);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mv localmv = (mv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17877398716416L, 133197);
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
          localmv.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17877398716416L, 133197);
        return 0;
      case 2: 
        localmv.kpr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17877398716416L, 133197);
        return 0;
      }
      localmv.kps = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17877398716416L, 133197);
      return 0;
    }
    GMTrace.o(17877398716416L, 133197);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/mv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */