package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class x
  extends com.tencent.mm.bl.a
{
  public String mDQ;
  public String mDR;
  public int mDS;
  public int mDT;
  public bf mDU;
  public be mDV;
  public bg mDW;
  public cn mDX;
  public String mDh;
  
  public x()
  {
    GMTrace.i(12642907324416L, 94197);
    GMTrace.o(12642907324416L, 94197);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12643041542144L, 94198);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDQ != null) {
        paramVarArgs.e(1, this.mDQ);
      }
      if (this.mDR != null) {
        paramVarArgs.e(2, this.mDR);
      }
      paramVarArgs.fd(3, this.mDS);
      if (this.mDh != null) {
        paramVarArgs.e(4, this.mDh);
      }
      paramVarArgs.fd(5, this.mDT);
      if (this.mDU != null)
      {
        paramVarArgs.ff(6, this.mDU.aWM());
        this.mDU.a(paramVarArgs);
      }
      if (this.mDV != null)
      {
        paramVarArgs.ff(7, this.mDV.aWM());
        this.mDV.a(paramVarArgs);
      }
      if (this.mDW != null)
      {
        paramVarArgs.ff(9, this.mDW.aWM());
        this.mDW.a(paramVarArgs);
      }
      if (this.mDX != null)
      {
        paramVarArgs.ff(10, this.mDX.aWM());
        this.mDX.a(paramVarArgs);
      }
      GMTrace.o(12643041542144L, 94198);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.mDQ != null) {
        paramInt = b.a.a.b.b.a.f(1, this.mDQ) + 0;
      }
      i = paramInt;
      if (this.mDR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDR);
      }
      i += b.a.a.a.fa(3, this.mDS);
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDh);
      }
      i = paramInt + b.a.a.a.fa(5, this.mDT);
      paramInt = i;
      if (this.mDU != null) {
        paramInt = i + b.a.a.a.fc(6, this.mDU.aWM());
      }
      i = paramInt;
      if (this.mDV != null) {
        i = paramInt + b.a.a.a.fc(7, this.mDV.aWM());
      }
      paramInt = i;
      if (this.mDW != null) {
        paramInt = i + b.a.a.a.fc(9, this.mDW.aWM());
      }
      i = paramInt;
      if (this.mDX != null) {
        i = paramInt + b.a.a.a.fc(10, this.mDX.aWM());
      }
      GMTrace.o(12643041542144L, 94198);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12643041542144L, 94198);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      x localx = (x)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 8: 
      default: 
        GMTrace.o(12643041542144L, 94198);
        return -1;
      case 1: 
        localx.mDQ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 2: 
        localx.mDR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 3: 
        localx.mDS = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 4: 
        localx.mDh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 5: 
        localx.mDT = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localx.mDU = ((bf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new be();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((be)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localx.mDV = ((be)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localx.mDW = ((bg)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643041542144L, 94198);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cn();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localx.mDX = ((cn)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12643041542144L, 94198);
      return 0;
    }
    GMTrace.o(12643041542144L, 94198);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */