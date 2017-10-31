package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ac
  extends axk
{
  public awf tsA;
  public int tsH;
  public ng tsL;
  public boolean tsM;
  public int tsN;
  public int tsx;
  public String tsy;
  public bcd tsz;
  
  public ac()
  {
    GMTrace.i(3967207604224L, 29558);
    GMTrace.o(3967207604224L, 29558);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3967341821952L, 29559);
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
      paramVarArgs.fd(2, this.tsx);
      if (this.tsy != null) {
        paramVarArgs.e(3, this.tsy);
      }
      if (this.tsz != null)
      {
        paramVarArgs.ff(4, this.tsz.aWM());
        this.tsz.a(paramVarArgs);
      }
      if (this.tsA != null)
      {
        paramVarArgs.ff(5, this.tsA.aWM());
        this.tsA.a(paramVarArgs);
      }
      paramVarArgs.fd(6, this.tsH);
      if (this.tsL != null)
      {
        paramVarArgs.ff(7, this.tsL.aWM());
        this.tsL.a(paramVarArgs);
      }
      paramVarArgs.af(8, this.tsM);
      paramVarArgs.fd(9, this.tsN);
      GMTrace.o(3967341821952L, 29559);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tsx);
      paramInt = i;
      if (this.tsy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tsy);
      }
      i = paramInt;
      if (this.tsz != null) {
        i = paramInt + b.a.a.a.fc(4, this.tsz.aWM());
      }
      paramInt = i;
      if (this.tsA != null) {
        paramInt = i + b.a.a.a.fc(5, this.tsA.aWM());
      }
      i = paramInt + b.a.a.a.fa(6, this.tsH);
      paramInt = i;
      if (this.tsL != null) {
        paramInt = i + b.a.a.a.fc(7, this.tsL.aWM());
      }
      i = b.a.a.b.b.a.cK(8);
      int j = b.a.a.a.fa(9, this.tsN);
      GMTrace.o(3967341821952L, 29559);
      return paramInt + (i + 1) + j;
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
      GMTrace.o(3967341821952L, 29559);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3967341821952L, 29559);
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
          localac.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 2: 
        localac.tsx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 3: 
        localac.tsy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bcd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localac.tsz = ((bcd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localac.tsA = ((awf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 6: 
        localac.tsH = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ng();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ng)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localac.tsL = ((ng)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3967341821952L, 29559);
        return 0;
      case 8: 
        localac.tsM = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3967341821952L, 29559);
        return 0;
      }
      localac.tsN = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3967341821952L, 29559);
      return 0;
    }
    GMTrace.o(3967341821952L, 29559);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */