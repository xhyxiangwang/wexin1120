package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lp
  extends axk
{
  public String tHT;
  public String tHU;
  public int tIb;
  public long tIc;
  
  public lp()
  {
    GMTrace.i(3779705438208L, 28161);
    GMTrace.o(3779705438208L, 28161);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3779839655936L, 28162);
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
      paramVarArgs.fd(2, this.tIb);
      if (this.tHT != null) {
        paramVarArgs.e(3, this.tHT);
      }
      if (this.tHU != null) {
        paramVarArgs.e(4, this.tHU);
      }
      paramVarArgs.R(5, this.tIc);
      GMTrace.o(3779839655936L, 28162);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tIb);
      paramInt = i;
      if (this.tHT != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tHT);
      }
      i = paramInt;
      if (this.tHU != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tHU);
      }
      paramInt = b.a.a.a.Q(5, this.tIc);
      GMTrace.o(3779839655936L, 28162);
      return i + paramInt;
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
      GMTrace.o(3779839655936L, 28162);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lp locallp = (lp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3779839655936L, 28162);
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
          locallp.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3779839655936L, 28162);
        return 0;
      case 2: 
        locallp.tIb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3779839655936L, 28162);
        return 0;
      case 3: 
        locallp.tHT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3779839655936L, 28162);
        return 0;
      case 4: 
        locallp.tHU = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3779839655936L, 28162);
        return 0;
      }
      locallp.tIc = ((b.a.a.a.a)localObject1).xSv.nn();
      GMTrace.o(3779839655936L, 28162);
      return 0;
    }
    GMTrace.o(3779839655936L, 28162);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */