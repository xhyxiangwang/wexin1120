package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class v
  extends axk
{
  public int kKx;
  public String kKy;
  public int state;
  public String title;
  public int trD;
  public String trN;
  public String trR;
  public long trS;
  public int trT;
  public long trU;
  public int trV;
  public int trW;
  public int trX;
  public int trY;
  public long trZ;
  public String trs;
  public LinkedList<t> trx;
  public long tsa;
  public long tsb;
  public int tsc;
  public String tsd;
  public int tse;
  public int type;
  
  public v()
  {
    GMTrace.i(3696087793664L, 27538);
    this.kKx = 268513600;
    this.kKy = "请求不成功，请稍候再试";
    this.trx = new LinkedList();
    GMTrace.o(3696087793664L, 27538);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3696222011392L, 27539);
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
      if (this.trs != null) {
        paramVarArgs.e(4, this.trs);
      }
      if (this.title != null) {
        paramVarArgs.e(5, this.title);
      }
      paramVarArgs.fd(6, this.type);
      if (this.trR != null) {
        paramVarArgs.e(7, this.trR);
      }
      paramVarArgs.R(8, this.trS);
      paramVarArgs.fd(9, this.trT);
      paramVarArgs.R(10, this.trU);
      paramVarArgs.fd(11, this.trV);
      paramVarArgs.fd(12, this.state);
      paramVarArgs.fd(13, this.trW);
      paramVarArgs.fd(14, this.trX);
      paramVarArgs.fd(15, this.trD);
      paramVarArgs.fd(16, this.trY);
      paramVarArgs.R(17, this.trZ);
      paramVarArgs.R(18, this.tsa);
      paramVarArgs.R(19, this.tsb);
      paramVarArgs.fd(20, this.tsc);
      if (this.trN != null) {
        paramVarArgs.e(21, this.trN);
      }
      paramVarArgs.d(22, 8, this.trx);
      if (this.tsd != null) {
        paramVarArgs.e(23, this.tsd);
      }
      paramVarArgs.fd(24, this.tse);
      GMTrace.o(3696222011392L, 27539);
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
      if (this.trs != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.trs);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.title);
      }
      i = paramInt + b.a.a.a.fa(6, this.type);
      paramInt = i;
      if (this.trR != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.trR);
      }
      i = paramInt + b.a.a.a.Q(8, this.trS) + b.a.a.a.fa(9, this.trT) + b.a.a.a.Q(10, this.trU) + b.a.a.a.fa(11, this.trV) + b.a.a.a.fa(12, this.state) + b.a.a.a.fa(13, this.trW) + b.a.a.a.fa(14, this.trX) + b.a.a.a.fa(15, this.trD) + b.a.a.a.fa(16, this.trY) + b.a.a.a.Q(17, this.trZ) + b.a.a.a.Q(18, this.tsa) + b.a.a.a.Q(19, this.tsb) + b.a.a.a.fa(20, this.tsc);
      paramInt = i;
      if (this.trN != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.trN);
      }
      i = paramInt + b.a.a.a.c(22, 8, this.trx);
      paramInt = i;
      if (this.tsd != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.tsd);
      }
      i = b.a.a.a.fa(24, this.tse);
      GMTrace.o(3696222011392L, 27539);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.trx.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3696222011392L, 27539);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      v localv = (v)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3696222011392L, 27539);
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
          localv.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 2: 
        localv.kKx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 3: 
        localv.kKy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 4: 
        localv.trs = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 5: 
        localv.title = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 6: 
        localv.type = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 7: 
        localv.trR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 8: 
        localv.trS = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 9: 
        localv.trT = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 10: 
        localv.trU = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 11: 
        localv.trV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 12: 
        localv.state = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 13: 
        localv.trW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 14: 
        localv.trX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 15: 
        localv.trD = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 16: 
        localv.trY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 17: 
        localv.trZ = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 18: 
        localv.tsa = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 19: 
        localv.tsb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 20: 
        localv.tsc = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 21: 
        localv.trN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new t();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((t)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localv.trx.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3696222011392L, 27539);
        return 0;
      case 23: 
        localv.tsd = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3696222011392L, 27539);
        return 0;
      }
      localv.tse = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3696222011392L, 27539);
      return 0;
    }
    GMTrace.o(3696222011392L, 27539);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */