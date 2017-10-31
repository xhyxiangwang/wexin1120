package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.bl.a
{
  public double rFO;
  public double rFP;
  public double rFQ;
  public String rFR;
  public LinkedList<q> rFS;
  public g rFT;
  public int rFU;
  public String rFV;
  public String rFW;
  public double rFX;
  public double rFY;
  public int rFZ;
  public String rGa;
  public String rGb;
  public a rGc;
  
  public f()
  {
    GMTrace.i(7697655136256L, 57352);
    this.rFS = new LinkedList();
    GMTrace.o(7697655136256L, 57352);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7697789353984L, 57353);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.rFO);
      paramVarArgs.a(2, this.rFP);
      paramVarArgs.a(3, this.rFQ);
      if (this.rFR != null) {
        paramVarArgs.e(4, this.rFR);
      }
      paramVarArgs.d(5, 8, this.rFS);
      if (this.rFT != null)
      {
        paramVarArgs.ff(6, this.rFT.aWM());
        this.rFT.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.rFU);
      if (this.rFV != null) {
        paramVarArgs.e(8, this.rFV);
      }
      if (this.rFW != null) {
        paramVarArgs.e(9, this.rFW);
      }
      paramVarArgs.a(10, this.rFX);
      paramVarArgs.a(11, this.rFY);
      paramVarArgs.fd(12, this.rFZ);
      if (this.rGa != null) {
        paramVarArgs.e(13, this.rGa);
      }
      if (this.rGb != null) {
        paramVarArgs.e(14, this.rGb);
      }
      if (this.rGc != null)
      {
        paramVarArgs.ff(15, this.rGc.aWM());
        this.rGc.a(paramVarArgs);
      }
      GMTrace.o(7697789353984L, 57353);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.b.b.a.cK(1) + 8 + 0 + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8);
      paramInt = i;
      if (this.rFR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.rFR);
      }
      i = paramInt + b.a.a.a.c(5, 8, this.rFS);
      paramInt = i;
      if (this.rFT != null) {
        paramInt = i + b.a.a.a.fc(6, this.rFT.aWM());
      }
      i = paramInt + b.a.a.a.fa(7, this.rFU);
      paramInt = i;
      if (this.rFV != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.rFV);
      }
      i = paramInt;
      if (this.rFW != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.rFW);
      }
      i = i + (b.a.a.b.b.a.cK(10) + 8) + (b.a.a.b.b.a.cK(11) + 8) + b.a.a.a.fa(12, this.rFZ);
      paramInt = i;
      if (this.rGa != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.rGa);
      }
      i = paramInt;
      if (this.rGb != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.rGb);
      }
      paramInt = i;
      if (this.rGc != null) {
        paramInt = i + b.a.a.a.fc(15, this.rGc.aWM());
      }
      GMTrace.o(7697789353984L, 57353);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rFS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(7697789353984L, 57353);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(7697789353984L, 57353);
        return -1;
      case 1: 
        localf.rFO = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 2: 
        localf.rFP = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 3: 
        localf.rFQ = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 4: 
        localf.rFR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7697789353984L, 57353);
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
          localf.rFS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new g();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localf.rFT = ((g)localObject1);
          paramInt += 1;
        }
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 7: 
        localf.rFU = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 8: 
        localf.rFV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 9: 
        localf.rFW = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 10: 
        localf.rFX = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 11: 
        localf.rFY = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 12: 
        localf.rFZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 13: 
        localf.rGa = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 14: 
        localf.rGb = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new a();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localf.rGc = ((a)localObject1);
        paramInt += 1;
      }
      GMTrace.o(7697789353984L, 57353);
      return 0;
    }
    GMTrace.o(7697789353984L, 57353);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */