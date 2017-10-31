package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcy
  extends axk
{
  public String txe;
  public LinkedList<bdk> tze;
  public int ujC;
  public String uuR;
  public int uuV;
  public int uuW;
  public beb uuX;
  
  public bcy()
  {
    GMTrace.i(4007070269440L, 29855);
    this.tze = new LinkedList();
    GMTrace.o(4007070269440L, 29855);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4007204487168L, 29856);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuX == null) {
        throw new b("Not all required fields were included: ServerConfig");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.uuR != null) {
        paramVarArgs.e(2, this.uuR);
      }
      paramVarArgs.fd(3, this.ujC);
      paramVarArgs.d(4, 8, this.tze);
      paramVarArgs.fd(5, this.uuV);
      if (this.txe != null) {
        paramVarArgs.e(6, this.txe);
      }
      paramVarArgs.fd(7, this.uuW);
      if (this.uuX != null)
      {
        paramVarArgs.ff(8, this.uuX.aWM());
        this.uuX.a(paramVarArgs);
      }
      GMTrace.o(4007204487168L, 29856);
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
      if (this.uuR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uuR);
      }
      i = i + b.a.a.a.fa(3, this.ujC) + b.a.a.a.c(4, 8, this.tze) + b.a.a.a.fa(5, this.uuV);
      paramInt = i;
      if (this.txe != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.txe);
      }
      i = paramInt + b.a.a.a.fa(7, this.uuW);
      paramInt = i;
      if (this.uuX != null) {
        paramInt = i + b.a.a.a.fc(8, this.uuX.aWM());
      }
      GMTrace.o(4007204487168L, 29856);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tze.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuX == null) {
        throw new b("Not all required fields were included: ServerConfig");
      }
      GMTrace.o(4007204487168L, 29856);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcy localbcy = (bcy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4007204487168L, 29856);
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
          localbcy.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 2: 
        localbcy.uuR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 3: 
        localbcy.ujC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbcy.tze.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 5: 
        localbcy.uuV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 6: 
        localbcy.txe = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 7: 
        localbcy.uuW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new beb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((beb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localbcy.uuX = ((beb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4007204487168L, 29856);
      return 0;
    }
    GMTrace.o(4007204487168L, 29856);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */