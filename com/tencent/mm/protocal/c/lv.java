package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class lv
  extends axc
{
  public String mDD;
  public at tEh;
  public String tHE;
  public String tIo;
  public String tIp;
  public String tIq;
  public String tIr;
  public int tIs;
  public String tIt;
  public String tzN;
  
  public lv()
  {
    GMTrace.i(3684947722240L, 27455);
    GMTrace.o(3684947722240L, 27455);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3685081939968L, 27456);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      if (this.tIo != null) {
        paramVarArgs.e(3, this.tIo);
      }
      if (this.tzN != null) {
        paramVarArgs.e(4, this.tzN);
      }
      if (this.tIp != null) {
        paramVarArgs.e(5, this.tIp);
      }
      if (this.tIq != null) {
        paramVarArgs.e(6, this.tIq);
      }
      if (this.tIr != null) {
        paramVarArgs.e(7, this.tIr);
      }
      if (this.tHE != null) {
        paramVarArgs.e(8, this.tHE);
      }
      paramVarArgs.fd(9, this.tIs);
      if (this.tEh != null)
      {
        paramVarArgs.ff(10, this.tEh.aWM());
        this.tEh.a(paramVarArgs);
      }
      if (this.tIt != null) {
        paramVarArgs.e(11, this.tIt);
      }
      GMTrace.o(3685081939968L, 27456);
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
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDD);
      }
      i = paramInt;
      if (this.tIo != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tIo);
      }
      paramInt = i;
      if (this.tzN != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tzN);
      }
      i = paramInt;
      if (this.tIp != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tIp);
      }
      paramInt = i;
      if (this.tIq != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tIq);
      }
      i = paramInt;
      if (this.tIr != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tIr);
      }
      paramInt = i;
      if (this.tHE != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tHE);
      }
      i = paramInt + b.a.a.a.fa(9, this.tIs);
      paramInt = i;
      if (this.tEh != null) {
        paramInt = i + b.a.a.a.fc(10, this.tEh.aWM());
      }
      i = paramInt;
      if (this.tIt != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tIt);
      }
      GMTrace.o(3685081939968L, 27456);
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
      GMTrace.o(3685081939968L, 27456);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      lv locallv = (lv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3685081939968L, 27456);
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
          locallv.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 2: 
        locallv.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 3: 
        locallv.tIo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 4: 
        locallv.tzN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 5: 
        locallv.tIp = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 6: 
        locallv.tIq = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 7: 
        locallv.tIr = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 8: 
        locallv.tHE = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 9: 
        locallv.tIs = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3685081939968L, 27456);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          locallv.tEh = ((at)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3685081939968L, 27456);
        return 0;
      }
      locallv.tIt = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3685081939968L, 27456);
      return 0;
    }
    GMTrace.o(3685081939968L, 27456);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */