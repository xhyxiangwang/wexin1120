package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajw
  extends axc
{
  public String mDD;
  public int tYq;
  public bsb ueR;
  public btc ueS;
  public bsy ueT;
  public bth ueU;
  public btb ueV;
  
  public ajw()
  {
    GMTrace.i(15344575971328L, 114326);
    GMTrace.o(15344575971328L, 114326);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344710189056L, 114327);
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
      if (this.ueR != null)
      {
        paramVarArgs.ff(3, this.ueR.aWM());
        this.ueR.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.tYq);
      if (this.ueS != null)
      {
        paramVarArgs.ff(5, this.ueS.aWM());
        this.ueS.a(paramVarArgs);
      }
      if (this.ueT != null)
      {
        paramVarArgs.ff(6, this.ueT.aWM());
        this.ueT.a(paramVarArgs);
      }
      if (this.ueU != null)
      {
        paramVarArgs.ff(7, this.ueU.aWM());
        this.ueU.a(paramVarArgs);
      }
      if (this.ueV != null)
      {
        paramVarArgs.ff(8, this.ueV.aWM());
        this.ueV.a(paramVarArgs);
      }
      GMTrace.o(15344710189056L, 114327);
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
      if (this.ueR != null) {
        i = paramInt + b.a.a.a.fc(3, this.ueR.aWM());
      }
      i += b.a.a.a.fa(4, this.tYq);
      paramInt = i;
      if (this.ueS != null) {
        paramInt = i + b.a.a.a.fc(5, this.ueS.aWM());
      }
      i = paramInt;
      if (this.ueT != null) {
        i = paramInt + b.a.a.a.fc(6, this.ueT.aWM());
      }
      paramInt = i;
      if (this.ueU != null) {
        paramInt = i + b.a.a.a.fc(7, this.ueU.aWM());
      }
      i = paramInt;
      if (this.ueV != null) {
        i = paramInt + b.a.a.a.fc(8, this.ueV.aWM());
      }
      GMTrace.o(15344710189056L, 114327);
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
      GMTrace.o(15344710189056L, 114327);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajw localajw = (ajw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15344710189056L, 114327);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localajw.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 2: 
        localajw.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bsb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bsb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localajw.ueR = ((bsb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 4: 
        localajw.tYq = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localajw.ueS = ((btc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bsy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bsy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localajw.ueT = ((bsy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bth();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bth)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localajw.ueU = ((bth)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((btb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localajw.ueV = ((btb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(15344710189056L, 114327);
      return 0;
    }
    GMTrace.o(15344710189056L, 114327);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */