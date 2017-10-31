package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xg
  extends axc
{
  public String fMv;
  public String fMw;
  public int fMx;
  public String koB;
  public String tUq;
  public String tsZ;
  public String tta;
  public int ttb;
  public bfe ttd;
  
  public xg()
  {
    GMTrace.i(3864531042304L, 28793);
    GMTrace.o(3864531042304L, 28793);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3864665260032L, 28794);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fMv != null) {
        paramVarArgs.e(2, this.fMv);
      }
      paramVarArgs.fd(3, this.fMx);
      if (this.koB != null) {
        paramVarArgs.e(4, this.koB);
      }
      if (this.fMw != null) {
        paramVarArgs.e(5, this.fMw);
      }
      if (this.tsZ != null) {
        paramVarArgs.e(6, this.tsZ);
      }
      if (this.tta != null) {
        paramVarArgs.e(7, this.tta);
      }
      paramVarArgs.fd(8, this.ttb);
      if (this.tUq != null) {
        paramVarArgs.e(9, this.tUq);
      }
      if (this.ttd != null)
      {
        paramVarArgs.ff(10, this.ttd.aWM());
        this.ttd.a(paramVarArgs);
      }
      GMTrace.o(3864665260032L, 28794);
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
      if (this.fMv != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fMv);
      }
      i += b.a.a.a.fa(3, this.fMx);
      paramInt = i;
      if (this.koB != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.koB);
      }
      i = paramInt;
      if (this.fMw != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.fMw);
      }
      paramInt = i;
      if (this.tsZ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tsZ);
      }
      i = paramInt;
      if (this.tta != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tta);
      }
      i += b.a.a.a.fa(8, this.ttb);
      paramInt = i;
      if (this.tUq != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tUq);
      }
      i = paramInt;
      if (this.ttd != null) {
        i = paramInt + b.a.a.a.fc(10, this.ttd.aWM());
      }
      GMTrace.o(3864665260032L, 28794);
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
      if (this.fMv == null) {
        throw new b("Not all required fields were included: card_id");
      }
      GMTrace.o(3864665260032L, 28794);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xg localxg = (xg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3864665260032L, 28794);
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
          localxg.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 2: 
        localxg.fMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 3: 
        localxg.fMx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 4: 
        localxg.koB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 5: 
        localxg.fMw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 6: 
        localxg.tsZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 7: 
        localxg.tta = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 8: 
        localxg.ttb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3864665260032L, 28794);
        return 0;
      case 9: 
        localxg.tUq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3864665260032L, 28794);
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
        localxg.ttd = ((bfe)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3864665260032L, 28794);
      return 0;
    }
    GMTrace.o(3864665260032L, 28794);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */