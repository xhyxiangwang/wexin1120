package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aej
  extends axk
{
  public String fuw;
  public String mCK;
  public String nat;
  public int tZK;
  public LinkedList<boi> tZL;
  public String tZX;
  public String tZY;
  public String tZZ;
  public String uaa;
  public String uab;
  public String uac;
  public boo uad;
  public String uae;
  public String uaf;
  public String uag;
  public String uah;
  public String uai;
  
  public aej()
  {
    GMTrace.i(3995259109376L, 29767);
    this.tZL = new LinkedList();
    GMTrace.o(3995259109376L, 29767);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3995393327104L, 29768);
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
      if (this.tZX != null) {
        paramVarArgs.e(2, this.tZX);
      }
      if (this.nat != null) {
        paramVarArgs.e(3, this.nat);
      }
      if (this.fuw != null) {
        paramVarArgs.e(4, this.fuw);
      }
      if (this.mCK != null) {
        paramVarArgs.e(5, this.mCK);
      }
      if (this.tZY != null) {
        paramVarArgs.e(6, this.tZY);
      }
      if (this.tZZ != null) {
        paramVarArgs.e(7, this.tZZ);
      }
      if (this.uaa != null) {
        paramVarArgs.e(8, this.uaa);
      }
      if (this.uab != null) {
        paramVarArgs.e(9, this.uab);
      }
      if (this.uac != null) {
        paramVarArgs.e(10, this.uac);
      }
      if (this.uad != null)
      {
        paramVarArgs.ff(11, this.uad.aWM());
        this.uad.a(paramVarArgs);
      }
      if (this.uae != null) {
        paramVarArgs.e(12, this.uae);
      }
      if (this.uaf != null) {
        paramVarArgs.e(13, this.uaf);
      }
      if (this.uag != null) {
        paramVarArgs.e(14, this.uag);
      }
      if (this.uah != null) {
        paramVarArgs.e(15, this.uah);
      }
      if (this.uai != null) {
        paramVarArgs.e(16, this.uai);
      }
      paramVarArgs.fd(17, this.tZK);
      paramVarArgs.d(18, 8, this.tZL);
      GMTrace.o(3995393327104L, 29768);
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
      if (this.tZX != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tZX);
      }
      i = paramInt;
      if (this.nat != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nat);
      }
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fuw);
      }
      i = paramInt;
      if (this.mCK != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mCK);
      }
      paramInt = i;
      if (this.tZY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tZY);
      }
      i = paramInt;
      if (this.tZZ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tZZ);
      }
      paramInt = i;
      if (this.uaa != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uaa);
      }
      i = paramInt;
      if (this.uab != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uab);
      }
      paramInt = i;
      if (this.uac != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uac);
      }
      i = paramInt;
      if (this.uad != null) {
        i = paramInt + b.a.a.a.fc(11, this.uad.aWM());
      }
      paramInt = i;
      if (this.uae != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uae);
      }
      i = paramInt;
      if (this.uaf != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uaf);
      }
      paramInt = i;
      if (this.uag != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.uag);
      }
      i = paramInt;
      if (this.uah != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uah);
      }
      paramInt = i;
      if (this.uai != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.uai);
      }
      i = b.a.a.a.fa(17, this.tZK);
      int j = b.a.a.a.c(18, 8, this.tZL);
      GMTrace.o(3995393327104L, 29768);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tZL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3995393327104L, 29768);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aej localaej = (aej)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3995393327104L, 29768);
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
          localaej.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 2: 
        localaej.tZX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 3: 
        localaej.nat = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 4: 
        localaej.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 5: 
        localaej.mCK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 6: 
        localaej.tZY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 7: 
        localaej.tZZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 8: 
        localaej.uaa = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 9: 
        localaej.uab = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 10: 
        localaej.uac = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localaej.uad = ((boo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 12: 
        localaej.uae = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 13: 
        localaej.uaf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 14: 
        localaej.uag = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 15: 
        localaej.uah = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 16: 
        localaej.uai = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      case 17: 
        localaej.tZK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3995393327104L, 29768);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new boi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((boi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localaej.tZL.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3995393327104L, 29768);
      return 0;
    }
    GMTrace.o(3995393327104L, 29768);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */