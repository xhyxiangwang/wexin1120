package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aeh
  extends axk
{
  public int tVJ;
  public LinkedList<bof> tVK;
  public String tZO;
  public String tZQ;
  public int tZR;
  public String tZS;
  public String tZT;
  public String tZU;
  
  public aeh()
  {
    GMTrace.i(3652735467520L, 27215);
    this.tVK = new LinkedList();
    GMTrace.o(3652735467520L, 27215);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3652869685248L, 27216);
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
      paramVarArgs.fd(2, this.tVJ);
      paramVarArgs.d(3, 8, this.tVK);
      if (this.tZQ != null) {
        paramVarArgs.e(4, this.tZQ);
      }
      if (this.tZO != null) {
        paramVarArgs.e(5, this.tZO);
      }
      paramVarArgs.fd(6, this.tZR);
      if (this.tZS != null) {
        paramVarArgs.e(7, this.tZS);
      }
      if (this.tZT != null) {
        paramVarArgs.e(8, this.tZT);
      }
      if (this.tZU != null) {
        paramVarArgs.e(9, this.tZU);
      }
      GMTrace.o(3652869685248L, 27216);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tVJ) + b.a.a.a.c(3, 8, this.tVK);
      paramInt = i;
      if (this.tZQ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tZQ);
      }
      i = paramInt;
      if (this.tZO != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tZO);
      }
      i += b.a.a.a.fa(6, this.tZR);
      paramInt = i;
      if (this.tZS != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tZS);
      }
      i = paramInt;
      if (this.tZT != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tZT);
      }
      paramInt = i;
      if (this.tZU != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tZU);
      }
      GMTrace.o(3652869685248L, 27216);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tVK.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3652869685248L, 27216);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aeh localaeh = (aeh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3652869685248L, 27216);
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
          localaeh.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 2: 
        localaeh.tVJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bof();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bof)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaeh.tVK.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 4: 
        localaeh.tZQ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 5: 
        localaeh.tZO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 6: 
        localaeh.tZR = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 7: 
        localaeh.tZS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      case 8: 
        localaeh.tZT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3652869685248L, 27216);
        return 0;
      }
      localaeh.tZU = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3652869685248L, 27216);
      return 0;
    }
    GMTrace.o(3652869685248L, 27216);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */