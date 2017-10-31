package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aev
  extends axk
{
  public String fEM;
  public int jMS;
  public bsc tHK;
  public int uaA;
  public String uaB;
  public String uaC;
  public int uaD;
  public String uaE;
  public String uav;
  public String uax;
  public int uay;
  public LinkedList<aom> uaz;
  
  public aev()
  {
    GMTrace.i(4001969995776L, 29817);
    this.uaz = new LinkedList();
    GMTrace.o(4001969995776L, 29817);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4002104213504L, 29818);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      if (this.tHK != null)
      {
        paramVarArgs.ff(2, this.tHK.aWM());
        this.tHK.a(paramVarArgs);
      }
      if (this.uax != null) {
        paramVarArgs.e(3, this.uax);
      }
      paramVarArgs.fd(4, this.uay);
      paramVarArgs.fd(5, this.jMS);
      if (this.uav != null) {
        paramVarArgs.e(6, this.uav);
      }
      paramVarArgs.d(7, 8, this.uaz);
      paramVarArgs.fd(8, this.uaA);
      if (this.uaB != null) {
        paramVarArgs.e(9, this.uaB);
      }
      if (this.uaC != null) {
        paramVarArgs.e(10, this.uaC);
      }
      paramVarArgs.fd(11, this.uaD);
      if (this.fEM != null) {
        paramVarArgs.e(12, this.fEM);
      }
      if (this.uaE != null) {
        paramVarArgs.e(13, this.uaE);
      }
      GMTrace.o(4002104213504L, 29818);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urV != null) {
        i = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      paramInt = i;
      if (this.tHK != null) {
        paramInt = i + b.a.a.a.fc(2, this.tHK.aWM());
      }
      i = paramInt;
      if (this.uax != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uax);
      }
      i = i + b.a.a.a.fa(4, this.uay) + b.a.a.a.fa(5, this.jMS);
      paramInt = i;
      if (this.uav != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uav);
      }
      i = paramInt + b.a.a.a.c(7, 8, this.uaz) + b.a.a.a.fa(8, this.uaA);
      paramInt = i;
      if (this.uaB != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uaB);
      }
      i = paramInt;
      if (this.uaC != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uaC);
      }
      i += b.a.a.a.fa(11, this.uaD);
      paramInt = i;
      if (this.fEM != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.fEM);
      }
      i = paramInt;
      if (this.uaE != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uaE);
      }
      GMTrace.o(4002104213504L, 29818);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uaz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4002104213504L, 29818);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aev localaev = (aev)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4002104213504L, 29818);
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
          localaev.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bsc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bsc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaev.tHK = ((bsc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 3: 
        localaev.uax = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 4: 
        localaev.uay = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 5: 
        localaev.jMS = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 6: 
        localaev.uav = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aom();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aom)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaev.uaz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 8: 
        localaev.uaA = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 9: 
        localaev.uaB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 10: 
        localaev.uaC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 11: 
        localaev.uaD = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 12: 
        localaev.fEM = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      }
      localaev.uaE = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4002104213504L, 29818);
      return 0;
    }
    GMTrace.o(4002104213504L, 29818);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */