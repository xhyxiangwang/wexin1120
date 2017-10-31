package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class z
  extends axc
{
  public String SSID;
  public String URL;
  public String tsm;
  public String tsn;
  public String tso;
  public int tsp;
  public LinkedList<cj> tsq;
  public int tsr;
  public String tss;
  public int tst;
  public String tsu;
  
  public z()
  {
    GMTrace.i(3980629377024L, 29658);
    this.tsq = new LinkedList();
    GMTrace.o(3980629377024L, 29658);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3980763594752L, 29659);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.e(2, this.URL);
      }
      if (this.SSID != null) {
        paramVarArgs.e(3, this.SSID);
      }
      if (this.tsm != null) {
        paramVarArgs.e(4, this.tsm);
      }
      if (this.tsn != null) {
        paramVarArgs.e(5, this.tsn);
      }
      if (this.tso != null) {
        paramVarArgs.e(6, this.tso);
      }
      paramVarArgs.fd(7, this.tsp);
      paramVarArgs.d(8, 8, this.tsq);
      paramVarArgs.fd(9, this.tsr);
      if (this.tss != null) {
        paramVarArgs.e(10, this.tss);
      }
      paramVarArgs.fd(11, this.tst);
      if (this.tsu != null) {
        paramVarArgs.e(12, this.tsu);
      }
      GMTrace.o(3980763594752L, 29659);
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
      if (this.URL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.URL);
      }
      i = paramInt;
      if (this.SSID != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.SSID);
      }
      paramInt = i;
      if (this.tsm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tsm);
      }
      i = paramInt;
      if (this.tsn != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tsn);
      }
      paramInt = i;
      if (this.tso != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tso);
      }
      i = paramInt + b.a.a.a.fa(7, this.tsp) + b.a.a.a.c(8, 8, this.tsq) + b.a.a.a.fa(9, this.tsr);
      paramInt = i;
      if (this.tss != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tss);
      }
      i = paramInt + b.a.a.a.fa(11, this.tst);
      paramInt = i;
      if (this.tsu != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tsu);
      }
      GMTrace.o(3980763594752L, 29659);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tsq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3980763594752L, 29659);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      z localz = (z)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3980763594752L, 29659);
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
          localz.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 2: 
        localz.URL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 3: 
        localz.SSID = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 4: 
        localz.tsm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 5: 
        localz.tsn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 6: 
        localz.tso = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 7: 
        localz.tsp = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localz.tsq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 9: 
        localz.tsr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 10: 
        localz.tss = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      case 11: 
        localz.tst = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3980763594752L, 29659);
        return 0;
      }
      localz.tsu = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3980763594752L, 29659);
      return 0;
    }
    GMTrace.o(3980763594752L, 29659);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */