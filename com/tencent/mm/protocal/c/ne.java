package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ne
  extends axc
{
  public String tJA;
  public String tJB;
  public int tJC;
  public axs tJz;
  public String tvh;
  public int twU;
  public int twV;
  public int twW;
  
  public ne()
  {
    GMTrace.i(3730850185216L, 27797);
    GMTrace.o(3730850185216L, 27797);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3730984402944L, 27798);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tJz == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.tvh != null) {
        paramVarArgs.e(2, this.tvh);
      }
      paramVarArgs.fd(3, this.twU);
      paramVarArgs.fd(4, this.twV);
      paramVarArgs.fd(5, this.twW);
      if (this.tJz != null)
      {
        paramVarArgs.ff(6, this.tJz.aWM());
        this.tJz.a(paramVarArgs);
      }
      if (this.tJA != null) {
        paramVarArgs.e(7, this.tJA);
      }
      if (this.tJB != null) {
        paramVarArgs.e(9, this.tJB);
      }
      paramVarArgs.fd(10, this.tJC);
      GMTrace.o(3730984402944L, 27798);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.tvh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tvh);
      }
      i = i + b.a.a.a.fa(3, this.twU) + b.a.a.a.fa(4, this.twV) + b.a.a.a.fa(5, this.twW);
      paramInt = i;
      if (this.tJz != null) {
        paramInt = i + b.a.a.a.fc(6, this.tJz.aWM());
      }
      i = paramInt;
      if (this.tJA != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tJA);
      }
      paramInt = i;
      if (this.tJB != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tJB);
      }
      i = b.a.a.a.fa(10, this.tJC);
      GMTrace.o(3730984402944L, 27798);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tJz == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3730984402944L, 27798);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ne localne = (ne)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 8: 
      default: 
        GMTrace.o(3730984402944L, 27798);
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
          localne.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 2: 
        localne.tvh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 3: 
        localne.twU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 4: 
        localne.twV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 5: 
        localne.twW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localne.tJz = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 7: 
        localne.tJA = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      case 9: 
        localne.tJB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3730984402944L, 27798);
        return 0;
      }
      localne.tJC = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3730984402944L, 27798);
      return 0;
    }
    GMTrace.o(3730984402944L, 27798);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */