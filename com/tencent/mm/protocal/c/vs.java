package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vs
  extends axc
{
  public String appId;
  public String fwH;
  public String meQ;
  public String meR;
  public String meS;
  public String sign;
  public cj tTH;
  public String tss;
  public int tst;
  
  public vs()
  {
    GMTrace.i(3863188865024L, 28783);
    GMTrace.o(3863188865024L, 28783);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3863323082752L, 28784);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.appId != null) {
        paramVarArgs.e(2, this.appId);
      }
      if (this.meQ != null) {
        paramVarArgs.e(3, this.meQ);
      }
      if (this.meR != null) {
        paramVarArgs.e(4, this.meR);
      }
      if (this.meS != null) {
        paramVarArgs.e(5, this.meS);
      }
      if (this.fwH != null) {
        paramVarArgs.e(6, this.fwH);
      }
      if (this.sign != null) {
        paramVarArgs.e(7, this.sign);
      }
      if (this.tTH != null)
      {
        paramVarArgs.ff(8, this.tTH.aWM());
        this.tTH.a(paramVarArgs);
      }
      if (this.tss != null) {
        paramVarArgs.e(9, this.tss);
      }
      paramVarArgs.fd(10, this.tst);
      GMTrace.o(3863323082752L, 28784);
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
      if (this.appId != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.appId);
      }
      i = paramInt;
      if (this.meQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.meQ);
      }
      paramInt = i;
      if (this.meR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.meR);
      }
      i = paramInt;
      if (this.meS != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.meS);
      }
      paramInt = i;
      if (this.fwH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.fwH);
      }
      i = paramInt;
      if (this.sign != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.sign);
      }
      paramInt = i;
      if (this.tTH != null) {
        paramInt = i + b.a.a.a.fc(8, this.tTH.aWM());
      }
      i = paramInt;
      if (this.tss != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tss);
      }
      paramInt = b.a.a.a.fa(10, this.tst);
      GMTrace.o(3863323082752L, 28784);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3863323082752L, 28784);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vs localvs = (vs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3863323082752L, 28784);
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
          localvs.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 2: 
        localvs.appId = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 3: 
        localvs.meQ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 4: 
        localvs.meR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 5: 
        localvs.meS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 6: 
        localvs.fwH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 7: 
        localvs.sign = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
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
          localvs.tTH = ((cj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3863323082752L, 28784);
        return 0;
      case 9: 
        localvs.tss = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3863323082752L, 28784);
        return 0;
      }
      localvs.tst = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3863323082752L, 28784);
      return 0;
    }
    GMTrace.o(3863323082752L, 28784);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */