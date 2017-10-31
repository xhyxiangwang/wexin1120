package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lo
  extends axc
{
  public String tHT;
  public String tHU;
  public String tHV;
  public String tHW;
  public String tHX;
  public long tHY;
  public String tHZ;
  public String tIa;
  
  public lo()
  {
    GMTrace.i(3773531422720L, 28115);
    GMTrace.o(3773531422720L, 28115);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3773665640448L, 28116);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tHT != null) {
        paramVarArgs.e(2, this.tHT);
      }
      if (this.tHU != null) {
        paramVarArgs.e(3, this.tHU);
      }
      if (this.tHV != null) {
        paramVarArgs.e(4, this.tHV);
      }
      if (this.tHW != null) {
        paramVarArgs.e(5, this.tHW);
      }
      if (this.tHX != null) {
        paramVarArgs.e(6, this.tHX);
      }
      paramVarArgs.R(7, this.tHY);
      if (this.tHZ != null) {
        paramVarArgs.e(8, this.tHZ);
      }
      if (this.tIa != null) {
        paramVarArgs.e(9, this.tIa);
      }
      GMTrace.o(3773665640448L, 28116);
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
      if (this.tHT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tHT);
      }
      i = paramInt;
      if (this.tHU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tHU);
      }
      paramInt = i;
      if (this.tHV != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tHV);
      }
      i = paramInt;
      if (this.tHW != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tHW);
      }
      paramInt = i;
      if (this.tHX != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tHX);
      }
      i = paramInt + b.a.a.a.Q(7, this.tHY);
      paramInt = i;
      if (this.tHZ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tHZ);
      }
      i = paramInt;
      if (this.tIa != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tIa);
      }
      GMTrace.o(3773665640448L, 28116);
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
      GMTrace.o(3773665640448L, 28116);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lo locallo = (lo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3773665640448L, 28116);
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
          locallo.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 2: 
        locallo.tHT = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 3: 
        locallo.tHU = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 4: 
        locallo.tHV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 5: 
        locallo.tHW = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 6: 
        locallo.tHX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 7: 
        locallo.tHY = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 8: 
        locallo.tHZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      }
      locallo.tIa = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3773665640448L, 28116);
      return 0;
    }
    GMTrace.o(3773665640448L, 28116);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */