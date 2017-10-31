package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xi
  extends axc
{
  public int fMx;
  public String sign;
  public String tUq;
  public String tUr;
  public String tsZ;
  public String tta;
  public int ttb;
  public LinkedList<jg> tte;
  public String tvL;
  
  public xi()
  {
    GMTrace.i(3984253255680L, 29685);
    this.tte = new LinkedList();
    GMTrace.o(3984253255680L, 29685);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3984387473408L, 29686);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tte);
      paramVarArgs.fd(3, this.fMx);
      if (this.tUr != null) {
        paramVarArgs.e(4, this.tUr);
      }
      if (this.tvL != null) {
        paramVarArgs.e(5, this.tvL);
      }
      if (this.sign != null) {
        paramVarArgs.e(6, this.sign);
      }
      if (this.tsZ != null) {
        paramVarArgs.e(7, this.tsZ);
      }
      if (this.tta != null) {
        paramVarArgs.e(8, this.tta);
      }
      if (this.tUq != null) {
        paramVarArgs.e(9, this.tUq);
      }
      paramVarArgs.fd(10, this.ttb);
      GMTrace.o(3984387473408L, 29686);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tte) + b.a.a.a.fa(3, this.fMx);
      paramInt = i;
      if (this.tUr != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUr);
      }
      i = paramInt;
      if (this.tvL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tvL);
      }
      paramInt = i;
      if (this.sign != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.sign);
      }
      i = paramInt;
      if (this.tsZ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tsZ);
      }
      paramInt = i;
      if (this.tta != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tta);
      }
      i = paramInt;
      if (this.tUq != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tUq);
      }
      paramInt = b.a.a.a.fa(10, this.ttb);
      GMTrace.o(3984387473408L, 29686);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tte.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3984387473408L, 29686);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xi localxi = (xi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3984387473408L, 29686);
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
          localxi.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localxi.tte.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 3: 
        localxi.fMx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 4: 
        localxi.tUr = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 5: 
        localxi.tvL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 6: 
        localxi.sign = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 7: 
        localxi.tsZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 8: 
        localxi.tta = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      case 9: 
        localxi.tUq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3984387473408L, 29686);
        return 0;
      }
      localxi.ttb = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3984387473408L, 29686);
      return 0;
    }
    GMTrace.o(3984387473408L, 29686);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */