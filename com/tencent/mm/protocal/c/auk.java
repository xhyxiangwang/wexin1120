package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auk
  extends axk
{
  public int bkk;
  public int fQw;
  public int kpr;
  public String kps;
  public String upL;
  public String upM;
  public String upN;
  public String upO;
  public int upP;
  public LinkedList<pj> upQ;
  public int upR;
  public LinkedList<pj> upS;
  public pj upT;
  public LinkedList<pj> upU;
  public pj upV;
  public amz upW;
  public int upX;
  public String upY;
  public String upo;
  public String upr;
  
  public auk()
  {
    GMTrace.i(17871090483200L, 133150);
    this.upQ = new LinkedList();
    this.upS = new LinkedList();
    this.upU = new LinkedList();
    GMTrace.o(17871090483200L, 133150);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17871224700928L, 133151);
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
      paramVarArgs.fd(2, this.kpr);
      if (this.kps != null) {
        paramVarArgs.e(3, this.kps);
      }
      paramVarArgs.fd(4, this.bkk);
      if (this.upM != null) {
        paramVarArgs.e(5, this.upM);
      }
      if (this.upN != null) {
        paramVarArgs.e(6, this.upN);
      }
      if (this.upO != null) {
        paramVarArgs.e(7, this.upO);
      }
      paramVarArgs.fd(8, this.upP);
      paramVarArgs.d(9, 8, this.upQ);
      paramVarArgs.fd(10, this.fQw);
      paramVarArgs.fd(11, this.upR);
      paramVarArgs.d(12, 8, this.upS);
      if (this.upo != null) {
        paramVarArgs.e(13, this.upo);
      }
      if (this.upT != null)
      {
        paramVarArgs.ff(14, this.upT.aWM());
        this.upT.a(paramVarArgs);
      }
      paramVarArgs.d(15, 8, this.upU);
      if (this.upV != null)
      {
        paramVarArgs.ff(16, this.upV.aWM());
        this.upV.a(paramVarArgs);
      }
      if (this.upW != null)
      {
        paramVarArgs.ff(17, this.upW.aWM());
        this.upW.a(paramVarArgs);
      }
      if (this.upr != null) {
        paramVarArgs.e(18, this.upr);
      }
      paramVarArgs.fd(19, this.upX);
      if (this.upY != null) {
        paramVarArgs.e(20, this.upY);
      }
      if (this.upL != null) {
        paramVarArgs.e(21, this.upL);
      }
      GMTrace.o(17871224700928L, 133151);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.kpr);
      paramInt = i;
      if (this.kps != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kps);
      }
      i = paramInt + b.a.a.a.fa(4, this.bkk);
      paramInt = i;
      if (this.upM != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.upM);
      }
      i = paramInt;
      if (this.upN != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.upN);
      }
      paramInt = i;
      if (this.upO != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.upO);
      }
      i = paramInt + b.a.a.a.fa(8, this.upP) + b.a.a.a.c(9, 8, this.upQ) + b.a.a.a.fa(10, this.fQw) + b.a.a.a.fa(11, this.upR) + b.a.a.a.c(12, 8, this.upS);
      paramInt = i;
      if (this.upo != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.upo);
      }
      i = paramInt;
      if (this.upT != null) {
        i = paramInt + b.a.a.a.fc(14, this.upT.aWM());
      }
      i += b.a.a.a.c(15, 8, this.upU);
      paramInt = i;
      if (this.upV != null) {
        paramInt = i + b.a.a.a.fc(16, this.upV.aWM());
      }
      i = paramInt;
      if (this.upW != null) {
        i = paramInt + b.a.a.a.fc(17, this.upW.aWM());
      }
      paramInt = i;
      if (this.upr != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.upr);
      }
      i = paramInt + b.a.a.a.fa(19, this.upX);
      paramInt = i;
      if (this.upY != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.upY);
      }
      i = paramInt;
      if (this.upL != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.upL);
      }
      GMTrace.o(17871224700928L, 133151);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.upQ.clear();
      this.upS.clear();
      this.upU.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17871224700928L, 133151);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auk localauk = (auk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17871224700928L, 133151);
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
          localauk.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 2: 
        localauk.kpr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 3: 
        localauk.kps = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 4: 
        localauk.bkk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 5: 
        localauk.upM = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 6: 
        localauk.upN = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 7: 
        localauk.upO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 8: 
        localauk.upP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localauk.upQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 10: 
        localauk.fQw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 11: 
        localauk.upR = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localauk.upS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 13: 
        localauk.upo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localauk.upT = ((pj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localauk.upU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localauk.upV = ((pj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localauk.upW = ((amz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 18: 
        localauk.upr = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 19: 
        localauk.upX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      case 20: 
        localauk.upY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17871224700928L, 133151);
        return 0;
      }
      localauk.upL = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(17871224700928L, 133151);
      return 0;
    }
    GMTrace.o(17871224700928L, 133151);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/auk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */