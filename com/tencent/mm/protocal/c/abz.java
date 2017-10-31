package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abz
  extends axk
{
  public int kKx;
  public String kKy;
  public String tXW;
  public String tXX;
  public String tXY;
  public String tXZ;
  public String tYa;
  public boolean tYb;
  public String tYc;
  public long tYd;
  public boolean tYe;
  public boolean tYf;
  public boolean tYg;
  public String tYh;
  public String tYi;
  public String tYj;
  public String tYk;
  public boolean tYl;
  public LinkedList<String> tYm;
  
  public abz()
  {
    GMTrace.i(3861041381376L, 28767);
    this.tYm = new LinkedList();
    GMTrace.o(3861041381376L, 28767);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3861175599104L, 28768);
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
      paramVarArgs.fd(2, this.kKx);
      if (this.kKy != null) {
        paramVarArgs.e(3, this.kKy);
      }
      if (this.tXW != null) {
        paramVarArgs.e(4, this.tXW);
      }
      if (this.tXX != null) {
        paramVarArgs.e(5, this.tXX);
      }
      if (this.tXY != null) {
        paramVarArgs.e(6, this.tXY);
      }
      if (this.tXZ != null) {
        paramVarArgs.e(7, this.tXZ);
      }
      if (this.tYa != null) {
        paramVarArgs.e(8, this.tYa);
      }
      paramVarArgs.af(9, this.tYb);
      if (this.tYc != null) {
        paramVarArgs.e(10, this.tYc);
      }
      paramVarArgs.R(11, this.tYd);
      paramVarArgs.af(12, this.tYe);
      paramVarArgs.af(13, this.tYf);
      paramVarArgs.af(14, this.tYg);
      if (this.tYh != null) {
        paramVarArgs.e(15, this.tYh);
      }
      if (this.tYi != null) {
        paramVarArgs.e(16, this.tYi);
      }
      if (this.tYj != null) {
        paramVarArgs.e(17, this.tYj);
      }
      if (this.tYk != null) {
        paramVarArgs.e(18, this.tYk);
      }
      paramVarArgs.af(19, this.tYl);
      paramVarArgs.d(20, 1, this.tYm);
      GMTrace.o(3861175599104L, 28768);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kKx);
      paramInt = i;
      if (this.kKy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kKy);
      }
      i = paramInt;
      if (this.tXW != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tXW);
      }
      paramInt = i;
      if (this.tXX != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tXX);
      }
      i = paramInt;
      if (this.tXY != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tXY);
      }
      paramInt = i;
      if (this.tXZ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tXZ);
      }
      i = paramInt;
      if (this.tYa != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tYa);
      }
      i += b.a.a.b.b.a.cK(9) + 1;
      paramInt = i;
      if (this.tYc != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tYc);
      }
      i = paramInt + b.a.a.a.Q(11, this.tYd) + (b.a.a.b.b.a.cK(12) + 1) + (b.a.a.b.b.a.cK(13) + 1) + (b.a.a.b.b.a.cK(14) + 1);
      paramInt = i;
      if (this.tYh != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tYh);
      }
      i = paramInt;
      if (this.tYi != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.tYi);
      }
      paramInt = i;
      if (this.tYj != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.tYj);
      }
      i = paramInt;
      if (this.tYk != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.tYk);
      }
      paramInt = b.a.a.b.b.a.cK(19);
      int j = b.a.a.a.c(20, 1, this.tYm);
      GMTrace.o(3861175599104L, 28768);
      return i + (paramInt + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tYm.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3861175599104L, 28768);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abz localabz = (abz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3861175599104L, 28768);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localabz.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 2: 
        localabz.kKx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 3: 
        localabz.kKy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 4: 
        localabz.tXW = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 5: 
        localabz.tXX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 6: 
        localabz.tXY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 7: 
        localabz.tXZ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 8: 
        localabz.tYa = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 9: 
        localabz.tYb = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 10: 
        localabz.tYc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 11: 
        localabz.tYd = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 12: 
        localabz.tYe = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 13: 
        localabz.tYf = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 14: 
        localabz.tYg = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 15: 
        localabz.tYh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 16: 
        localabz.tYi = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 17: 
        localabz.tYj = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 18: 
        localabz.tYk = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 19: 
        localabz.tYl = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      }
      localabz.tYm.add(((b.a.a.a.a)localObject1).xSv.readString());
      GMTrace.o(3861175599104L, 28768);
      return 0;
    }
    GMTrace.o(3861175599104L, 28768);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/abz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */