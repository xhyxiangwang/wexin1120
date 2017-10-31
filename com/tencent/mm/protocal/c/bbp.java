package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbp
  extends axc
{
  public int fMx;
  public LinkedList<bbr> hdL;
  public String tUq;
  public bfe ttd;
  public int utT;
  public String utU;
  public bbz utV;
  
  public bbp()
  {
    GMTrace.i(3730044878848L, 27791);
    this.hdL = new LinkedList();
    GMTrace.o(3730044878848L, 27791);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3730179096576L, 27792);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.utT);
      paramVarArgs.d(3, 8, this.hdL);
      if (this.utU != null) {
        paramVarArgs.e(4, this.utU);
      }
      if (this.tUq != null) {
        paramVarArgs.e(5, this.tUq);
      }
      if (this.utV != null)
      {
        paramVarArgs.ff(6, this.utV.aWM());
        this.utV.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.fMx);
      if (this.ttd != null)
      {
        paramVarArgs.ff(8, this.ttd.aWM());
        this.ttd.a(paramVarArgs);
      }
      GMTrace.o(3730179096576L, 27792);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.utT) + b.a.a.a.c(3, 8, this.hdL);
      paramInt = i;
      if (this.utU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.utU);
      }
      i = paramInt;
      if (this.tUq != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tUq);
      }
      paramInt = i;
      if (this.utV != null) {
        paramInt = i + b.a.a.a.fc(6, this.utV.aWM());
      }
      i = paramInt + b.a.a.a.fa(7, this.fMx);
      paramInt = i;
      if (this.ttd != null) {
        paramInt = i + b.a.a.a.fc(8, this.ttd.aWM());
      }
      GMTrace.o(3730179096576L, 27792);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.hdL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3730179096576L, 27792);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbp localbbp = (bbp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3730179096576L, 27792);
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
          localbbp.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 2: 
        localbbp.utT = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbbp.hdL.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 4: 
        localbbp.utU = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 5: 
        localbbp.tUq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localbbp.utV = ((bbz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730179096576L, 27792);
        return 0;
      case 7: 
        localbbp.fMx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3730179096576L, 27792);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bfe();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bfe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localbbp.ttd = ((bfe)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3730179096576L, 27792);
      return 0;
    }
    GMTrace.o(3730179096576L, 27792);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */