package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bl.a
{
  public double rFQ;
  public LinkedList<q> rFS;
  public double rFX;
  public double rFY;
  public int rFZ;
  public String rGa;
  public String rGb;
  public b rGe;
  public String rGf;
  public double rGg;
  public LinkedList<e> rGh;
  
  public h()
  {
    GMTrace.i(7698728878080L, 57360);
    this.rGh = new LinkedList();
    this.rFS = new LinkedList();
    GMTrace.o(7698728878080L, 57360);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7698863095808L, 57361);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.rGf != null) {
        paramVarArgs.e(1, this.rGf);
      }
      paramVarArgs.a(2, this.rGg);
      paramVarArgs.a(3, this.rFQ);
      paramVarArgs.d(4, 8, this.rGh);
      paramVarArgs.d(5, 8, this.rFS);
      paramVarArgs.a(6, this.rFX);
      paramVarArgs.a(7, this.rFY);
      paramVarArgs.fd(8, this.rFZ);
      if (this.rGa != null) {
        paramVarArgs.e(9, this.rGa);
      }
      if (this.rGb != null) {
        paramVarArgs.e(10, this.rGb);
      }
      if (this.rGe != null) {
        paramVarArgs.b(11, this.rGe);
      }
      GMTrace.o(7698863095808L, 57361);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.rGf != null) {
        paramInt = b.a.a.b.b.a.f(1, this.rGf) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8) + b.a.a.a.c(4, 8, this.rGh) + b.a.a.a.c(5, 8, this.rFS) + (b.a.a.b.b.a.cK(6) + 8) + (b.a.a.b.b.a.cK(7) + 8) + b.a.a.a.fa(8, this.rFZ);
      paramInt = i;
      if (this.rGa != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.rGa);
      }
      i = paramInt;
      if (this.rGb != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.rGb);
      }
      paramInt = i;
      if (this.rGe != null) {
        paramInt = i + b.a.a.a.a(11, this.rGe);
      }
      GMTrace.o(7698863095808L, 57361);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rGh.clear();
      this.rFS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(7698863095808L, 57361);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      h localh = (h)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(7698863095808L, 57361);
        return -1;
      case 1: 
        localh.rGf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 2: 
        localh.rGg = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 3: 
        localh.rFQ = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localh.rGh.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localh.rFS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 6: 
        localh.rFX = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 7: 
        localh.rFY = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 8: 
        localh.rFZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 9: 
        localh.rGa = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 10: 
        localh.rGb = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      }
      localh.rGe = ((b.a.a.a.a)localObject1).cpI();
      GMTrace.o(7698863095808L, 57361);
      return 0;
    }
    GMTrace.o(7698863095808L, 57361);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */