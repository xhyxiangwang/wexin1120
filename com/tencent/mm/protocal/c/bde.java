package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bde
  extends axk
{
  public int jXP;
  public int twU;
  public int twV;
  public axs tyt;
  public String uva;
  
  public bde()
  {
    GMTrace.i(3969086652416L, 29572);
    GMTrace.o(3969086652416L, 29572);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3969220870144L, 29573);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tyt == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.twV);
      paramVarArgs.fd(3, this.twU);
      if (this.tyt != null)
      {
        paramVarArgs.ff(4, this.tyt.aWM());
        this.tyt.a(paramVarArgs);
      }
      if (this.uva != null) {
        paramVarArgs.e(5, this.uva);
      }
      paramVarArgs.fd(6, this.jXP);
      GMTrace.o(3969220870144L, 29573);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.twV) + b.a.a.a.fa(3, this.twU);
      paramInt = i;
      if (this.tyt != null) {
        paramInt = i + b.a.a.a.fc(4, this.tyt.aWM());
      }
      i = paramInt;
      if (this.uva != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uva);
      }
      paramInt = b.a.a.a.fa(6, this.jXP);
      GMTrace.o(3969220870144L, 29573);
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
      if (this.tyt == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3969220870144L, 29573);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bde localbde = (bde)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3969220870144L, 29573);
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
          localbde.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 2: 
        localbde.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 3: 
        localbde.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbde.tyt = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3969220870144L, 29573);
        return 0;
      case 5: 
        localbde.uva = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3969220870144L, 29573);
        return 0;
      }
      localbde.jXP = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3969220870144L, 29573);
      return 0;
    }
    GMTrace.o(3969220870144L, 29573);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */