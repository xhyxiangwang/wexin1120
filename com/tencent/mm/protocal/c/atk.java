package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atk
  extends axk
{
  public com.tencent.mm.bl.b mXA;
  public int mXC;
  public int mXF;
  public int mXm;
  public String mXn;
  public int mXr;
  public int mXx;
  public int mXy;
  public int mXz;
  public int tNa;
  public long tNb;
  public LinkedList<atc> tyd;
  public long uoM;
  public int uoV;
  public int uoW;
  public LinkedList<atc> uoX;
  public String uoY;
  public com.tencent.mm.bl.b uoZ;
  public int upa;
  
  public atk()
  {
    GMTrace.i(3687363641344L, 27473);
    this.tyd = new LinkedList();
    this.uoX = new LinkedList();
    GMTrace.o(3687363641344L, 27473);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3687497859072L, 27474);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tNa);
      paramVarArgs.R(3, this.tNb);
      paramVarArgs.fd(4, this.uoV);
      paramVarArgs.d(5, 8, this.tyd);
      paramVarArgs.fd(6, this.uoW);
      paramVarArgs.fd(7, this.mXx);
      paramVarArgs.fd(8, this.mXy);
      paramVarArgs.R(9, this.uoM);
      paramVarArgs.fd(10, this.mXz);
      if (this.mXA != null) {
        paramVarArgs.b(11, this.mXA);
      }
      paramVarArgs.fd(12, this.mXr);
      paramVarArgs.fd(13, this.mXm);
      if (this.mXn != null) {
        paramVarArgs.e(14, this.mXn);
      }
      paramVarArgs.fd(15, this.mXC);
      paramVarArgs.d(16, 8, this.uoX);
      paramVarArgs.fd(17, this.mXF);
      if (this.uoY != null) {
        paramVarArgs.e(18, this.uoY);
      }
      if (this.uoZ != null) {
        paramVarArgs.b(19, this.uoZ);
      }
      paramVarArgs.fd(20, this.upa);
      GMTrace.o(3687497859072L, 27474);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tNa) + b.a.a.a.Q(3, this.tNb) + b.a.a.a.fa(4, this.uoV) + b.a.a.a.c(5, 8, this.tyd) + b.a.a.a.fa(6, this.uoW) + b.a.a.a.fa(7, this.mXx) + b.a.a.a.fa(8, this.mXy) + b.a.a.a.Q(9, this.uoM) + b.a.a.a.fa(10, this.mXz);
      paramInt = i;
      if (this.mXA != null) {
        paramInt = i + b.a.a.a.a(11, this.mXA);
      }
      i = paramInt + b.a.a.a.fa(12, this.mXr) + b.a.a.a.fa(13, this.mXm);
      paramInt = i;
      if (this.mXn != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.mXn);
      }
      i = paramInt + b.a.a.a.fa(15, this.mXC) + b.a.a.a.c(16, 8, this.uoX) + b.a.a.a.fa(17, this.mXF);
      paramInt = i;
      if (this.uoY != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uoY);
      }
      i = paramInt;
      if (this.uoZ != null) {
        i = paramInt + b.a.a.a.a(19, this.uoZ);
      }
      paramInt = b.a.a.a.fa(20, this.upa);
      GMTrace.o(3687497859072L, 27474);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tyd.clear();
      this.uoX.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3687497859072L, 27474);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atk localatk = (atk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3687497859072L, 27474);
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
          localatk.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 2: 
        localatk.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 3: 
        localatk.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 4: 
        localatk.uoV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localatk.tyd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 6: 
        localatk.uoW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 7: 
        localatk.mXx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 8: 
        localatk.mXy = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 9: 
        localatk.uoM = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 10: 
        localatk.mXz = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 11: 
        localatk.mXA = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 12: 
        localatk.mXr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 13: 
        localatk.mXm = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 14: 
        localatk.mXn = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 15: 
        localatk.mXC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localatk.uoX.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 17: 
        localatk.mXF = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 18: 
        localatk.uoY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      case 19: 
        localatk.uoZ = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(3687497859072L, 27474);
        return 0;
      }
      localatk.upa = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3687497859072L, 27474);
      return 0;
    }
    GMTrace.o(3687497859072L, 27474);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */