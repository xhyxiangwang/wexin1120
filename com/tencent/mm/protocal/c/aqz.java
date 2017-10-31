package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqz
  extends axc
{
  public String mDD;
  public String tHE;
  public String tIo;
  public String tIp;
  public String tIq;
  public String tIr;
  public String tzN;
  
  public aqz()
  {
    GMTrace.i(19144816721920L, 142640);
    GMTrace.o(19144816721920L, 142640);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19144950939648L, 142641);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      if (this.tIo != null) {
        paramVarArgs.e(3, this.tIo);
      }
      if (this.tzN != null) {
        paramVarArgs.e(4, this.tzN);
      }
      if (this.tIp != null) {
        paramVarArgs.e(5, this.tIp);
      }
      if (this.tIq != null) {
        paramVarArgs.e(6, this.tIq);
      }
      if (this.tIr != null) {
        paramVarArgs.e(7, this.tIr);
      }
      if (this.tHE != null) {
        paramVarArgs.e(8, this.tHE);
      }
      GMTrace.o(19144950939648L, 142641);
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
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDD);
      }
      i = paramInt;
      if (this.tIo != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tIo);
      }
      paramInt = i;
      if (this.tzN != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tzN);
      }
      i = paramInt;
      if (this.tIp != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tIp);
      }
      paramInt = i;
      if (this.tIq != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tIq);
      }
      i = paramInt;
      if (this.tIr != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tIr);
      }
      paramInt = i;
      if (this.tHE != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tHE);
      }
      GMTrace.o(19144950939648L, 142641);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(19144950939648L, 142641);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqz localaqz = (aqz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19144950939648L, 142641);
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
          localaqz.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19144950939648L, 142641);
        return 0;
      case 2: 
        localaqz.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19144950939648L, 142641);
        return 0;
      case 3: 
        localaqz.tIo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19144950939648L, 142641);
        return 0;
      case 4: 
        localaqz.tzN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19144950939648L, 142641);
        return 0;
      case 5: 
        localaqz.tIp = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19144950939648L, 142641);
        return 0;
      case 6: 
        localaqz.tIq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19144950939648L, 142641);
        return 0;
      case 7: 
        localaqz.tIr = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19144950939648L, 142641);
        return 0;
      }
      localaqz.tHE = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(19144950939648L, 142641);
      return 0;
    }
    GMTrace.o(19144950939648L, 142641);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */