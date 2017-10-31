package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bss
  extends com.tencent.mm.bl.a
{
  public int tAS;
  public LinkedList<jq> tKz;
  public int uHB;
  public String uHC;
  public String uHD;
  public int uHE;
  public cv uHF;
  
  public bss()
  {
    GMTrace.i(3959154540544L, 29498);
    this.tKz = new LinkedList();
    GMTrace.o(3959154540544L, 29498);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3959288758272L, 29499);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tAS);
      paramVarArgs.fd(2, this.uHB);
      if (this.uHC != null) {
        paramVarArgs.e(3, this.uHC);
      }
      if (this.uHD != null) {
        paramVarArgs.e(4, this.uHD);
      }
      paramVarArgs.fd(5, this.uHE);
      paramVarArgs.d(6, 8, this.tKz);
      if (this.uHF != null)
      {
        paramVarArgs.ff(7, this.uHF.aWM());
        this.uHF.a(paramVarArgs);
      }
      GMTrace.o(3959288758272L, 29499);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.tAS) + 0 + b.a.a.a.fa(2, this.uHB);
      paramInt = i;
      if (this.uHC != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uHC);
      }
      i = paramInt;
      if (this.uHD != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uHD);
      }
      i = i + b.a.a.a.fa(5, this.uHE) + b.a.a.a.c(6, 8, this.tKz);
      paramInt = i;
      if (this.uHF != null) {
        paramInt = i + b.a.a.a.fc(7, this.uHF.aWM());
      }
      GMTrace.o(3959288758272L, 29499);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tKz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3959288758272L, 29499);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bss localbss = (bss)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3959288758272L, 29499);
        return -1;
      case 1: 
        localbss.tAS = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 2: 
        localbss.uHB = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 3: 
        localbss.uHC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 4: 
        localbss.uHD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 5: 
        localbss.uHE = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbss.tKz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3959288758272L, 29499);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cv();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbss.uHF = ((cv)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3959288758272L, 29499);
      return 0;
    }
    GMTrace.o(3959288758272L, 29499);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */