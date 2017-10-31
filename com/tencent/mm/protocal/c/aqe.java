package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqe
  extends axc
{
  public String fEf;
  public String rKT;
  public String signature;
  public String umx;
  
  public aqe()
  {
    GMTrace.i(20214397796352L, 150609);
    GMTrace.o(20214397796352L, 150609);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20214532014080L, 150610);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.umx != null) {
        paramVarArgs.e(2, this.umx);
      }
      if (this.signature != null) {
        paramVarArgs.e(3, this.signature);
      }
      if (this.rKT != null) {
        paramVarArgs.e(4, this.rKT);
      }
      if (this.fEf != null) {
        paramVarArgs.e(5, this.fEf);
      }
      GMTrace.o(20214532014080L, 150610);
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
      if (this.umx != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umx);
      }
      i = paramInt;
      if (this.signature != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.signature);
      }
      paramInt = i;
      if (this.rKT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.rKT);
      }
      i = paramInt;
      if (this.fEf != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.fEf);
      }
      GMTrace.o(20214532014080L, 150610);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(20214532014080L, 150610);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqe localaqe = (aqe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20214532014080L, 150610);
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
          localaqe.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20214532014080L, 150610);
        return 0;
      case 2: 
        localaqe.umx = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20214532014080L, 150610);
        return 0;
      case 3: 
        localaqe.signature = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20214532014080L, 150610);
        return 0;
      case 4: 
        localaqe.rKT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20214532014080L, 150610);
        return 0;
      }
      localaqe.fEf = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(20214532014080L, 150610);
      return 0;
    }
    GMTrace.o(20214532014080L, 150610);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */