package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arx
  extends axk
{
  public axs ubI;
  public int ubJ;
  public String ubK;
  public int ubL;
  public int unI;
  public String unJ;
  
  public arx()
  {
    GMTrace.i(3620388995072L, 26974);
    GMTrace.o(3620388995072L, 26974);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3620523212800L, 26975);
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
      if (this.ubI != null)
      {
        paramVarArgs.ff(2, this.ubI.aWM());
        this.ubI.a(paramVarArgs);
      }
      paramVarArgs.fd(3, this.ubJ);
      if (this.ubK != null) {
        paramVarArgs.e(4, this.ubK);
      }
      paramVarArgs.fd(5, this.ubL);
      paramVarArgs.fd(6, this.unI);
      if (this.unJ != null) {
        paramVarArgs.e(7, this.unJ);
      }
      GMTrace.o(3620523212800L, 26975);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.ubI != null) {
        i = paramInt + b.a.a.a.fc(2, this.ubI.aWM());
      }
      i += b.a.a.a.fa(3, this.ubJ);
      paramInt = i;
      if (this.ubK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubK);
      }
      i = paramInt + b.a.a.a.fa(5, this.ubL) + b.a.a.a.fa(6, this.unI);
      paramInt = i;
      if (this.unJ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.unJ);
      }
      GMTrace.o(3620523212800L, 26975);
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
      GMTrace.o(3620523212800L, 26975);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arx localarx = (arx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3620523212800L, 26975);
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
          localarx.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3620523212800L, 26975);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localarx.ubI = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3620523212800L, 26975);
        return 0;
      case 3: 
        localarx.ubJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3620523212800L, 26975);
        return 0;
      case 4: 
        localarx.ubK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3620523212800L, 26975);
        return 0;
      case 5: 
        localarx.ubL = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3620523212800L, 26975);
        return 0;
      case 6: 
        localarx.unI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3620523212800L, 26975);
        return 0;
      }
      localarx.unJ = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3620523212800L, 26975);
      return 0;
    }
    GMTrace.o(3620523212800L, 26975);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/arx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */