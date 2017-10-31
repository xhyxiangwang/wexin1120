package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amq
  extends com.tencent.mm.bl.a
{
  public String fKY;
  public String fML;
  public String fwU;
  public int fzG;
  public int hkI;
  public int jOR;
  public String mCK;
  public String token;
  public int uhC;
  public String uhV;
  public int uhW;
  public int uhX;
  public String uiA;
  public String uiB;
  public aly uiC;
  public int uiD;
  public int uig;
  public String uih;
  public amk uiv;
  public int uiw;
  public LinkedList<amk> uix;
  public int uiy;
  public String uiz;
  
  public amq()
  {
    GMTrace.i(3974186926080L, 29610);
    this.uix = new LinkedList();
    GMTrace.o(3974186926080L, 29610);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3974321143808L, 29611);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uhW);
      paramVarArgs.fd(2, this.uhX);
      paramVarArgs.fd(3, this.uhC);
      if (this.uiv != null)
      {
        paramVarArgs.ff(4, this.uiv.aWM());
        this.uiv.a(paramVarArgs);
      }
      paramVarArgs.fd(5, this.uiw);
      paramVarArgs.d(6, 8, this.uix);
      paramVarArgs.fd(7, this.hkI);
      paramVarArgs.fd(8, this.uiy);
      if (this.mCK != null) {
        paramVarArgs.e(9, this.mCK);
      }
      if (this.uiz != null) {
        paramVarArgs.e(10, this.uiz);
      }
      if (this.token != null) {
        paramVarArgs.e(11, this.token);
      }
      if (this.uih != null) {
        paramVarArgs.e(12, this.uih);
      }
      paramVarArgs.fd(13, this.uig);
      if (this.fML != null) {
        paramVarArgs.e(14, this.fML);
      }
      if (this.uiA != null) {
        paramVarArgs.e(15, this.uiA);
      }
      if (this.uiB != null) {
        paramVarArgs.e(16, this.uiB);
      }
      if (this.fwU != null) {
        paramVarArgs.e(17, this.fwU);
      }
      if (this.fKY != null) {
        paramVarArgs.e(18, this.fKY);
      }
      paramVarArgs.fd(19, this.jOR);
      paramVarArgs.fd(20, this.fzG);
      if (this.uhV != null) {
        paramVarArgs.e(21, this.uhV);
      }
      if (this.uiC != null)
      {
        paramVarArgs.ff(22, this.uiC.aWM());
        this.uiC.a(paramVarArgs);
      }
      paramVarArgs.fd(23, this.uiD);
      GMTrace.o(3974321143808L, 29611);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.uhW) + 0 + b.a.a.a.fa(2, this.uhX) + b.a.a.a.fa(3, this.uhC);
      paramInt = i;
      if (this.uiv != null) {
        paramInt = i + b.a.a.a.fc(4, this.uiv.aWM());
      }
      i = paramInt + b.a.a.a.fa(5, this.uiw) + b.a.a.a.c(6, 8, this.uix) + b.a.a.a.fa(7, this.hkI) + b.a.a.a.fa(8, this.uiy);
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.mCK);
      }
      i = paramInt;
      if (this.uiz != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uiz);
      }
      paramInt = i;
      if (this.token != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.token);
      }
      i = paramInt;
      if (this.uih != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uih);
      }
      i += b.a.a.a.fa(13, this.uig);
      paramInt = i;
      if (this.fML != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.fML);
      }
      i = paramInt;
      if (this.uiA != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uiA);
      }
      paramInt = i;
      if (this.uiB != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.uiB);
      }
      i = paramInt;
      if (this.fwU != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.fwU);
      }
      paramInt = i;
      if (this.fKY != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.fKY);
      }
      i = paramInt + b.a.a.a.fa(19, this.jOR) + b.a.a.a.fa(20, this.fzG);
      paramInt = i;
      if (this.uhV != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.uhV);
      }
      i = paramInt;
      if (this.uiC != null) {
        i = paramInt + b.a.a.a.fc(22, this.uiC.aWM());
      }
      paramInt = b.a.a.a.fa(23, this.uiD);
      GMTrace.o(3974321143808L, 29611);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uix.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3974321143808L, 29611);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amq localamq = (amq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3974321143808L, 29611);
        return -1;
      case 1: 
        localamq.uhW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 2: 
        localamq.uhX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 3: 
        localamq.uhC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamq.uiv = ((amk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 5: 
        localamq.uiw = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamq.uix.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 7: 
        localamq.hkI = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 8: 
        localamq.uiy = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 9: 
        localamq.mCK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 10: 
        localamq.uiz = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 11: 
        localamq.token = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 12: 
        localamq.uih = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 13: 
        localamq.uig = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 14: 
        localamq.fML = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 15: 
        localamq.uiA = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 16: 
        localamq.uiB = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 17: 
        localamq.fwU = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 18: 
        localamq.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 19: 
        localamq.jOR = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 20: 
        localamq.fzG = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 21: 
        localamq.uhV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3974321143808L, 29611);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aly();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aly)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localamq.uiC = ((aly)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3974321143808L, 29611);
        return 0;
      }
      localamq.uiD = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3974321143808L, 29611);
      return 0;
    }
    GMTrace.o(3974321143808L, 29611);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */