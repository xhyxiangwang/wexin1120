package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lk
  extends axk
{
  public bsc tHK;
  public boolean tHL;
  public String tHM;
  public String tHN;
  public boolean tHO;
  public String tHP;
  public String tHQ;
  
  public lk()
  {
    GMTrace.i(3747493183488L, 27921);
    GMTrace.o(3747493183488L, 27921);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3747627401216L, 27922);
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
      paramVarArgs.af(3, this.tHL);
      if (this.tHM != null) {
        paramVarArgs.e(4, this.tHM);
      }
      if (this.tHN != null) {
        paramVarArgs.e(5, this.tHN);
      }
      paramVarArgs.af(6, this.tHO);
      if (this.tHP != null) {
        paramVarArgs.e(7, this.tHP);
      }
      if (this.tHQ != null) {
        paramVarArgs.e(8, this.tHQ);
      }
      GMTrace.o(3747627401216L, 27922);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt;
      if (this.tHK != null) {
        i = paramInt + b.a.a.a.fc(2, this.tHK.aWM());
      }
      i += b.a.a.b.b.a.cK(3) + 1;
      paramInt = i;
      if (this.tHM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tHM);
      }
      i = paramInt;
      if (this.tHN != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tHN);
      }
      i += b.a.a.b.b.a.cK(6) + 1;
      paramInt = i;
      if (this.tHP != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tHP);
      }
      i = paramInt;
      if (this.tHQ != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tHQ);
      }
      GMTrace.o(3747627401216L, 27922);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3747627401216L, 27922);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lk locallk = (lk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3747627401216L, 27922);
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
          locallk.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3747627401216L, 27922);
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
          locallk.tHK = ((bsc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 3: 
        locallk.tHL = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 4: 
        locallk.tHM = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 5: 
        locallk.tHN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 6: 
        locallk.tHO = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      case 7: 
        locallk.tHP = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3747627401216L, 27922);
        return 0;
      }
      locallk.tHQ = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3747627401216L, 27922);
      return 0;
    }
    GMTrace.o(3747627401216L, 27922);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */