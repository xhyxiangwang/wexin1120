package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bl.a
{
  public int jXO;
  public int jXo;
  public String mCE;
  public String mCG;
  public String mCH;
  public String mCI;
  public String mCJ;
  public String mCK;
  public String mCL;
  public String mCM;
  public int mCN;
  public l mCO;
  public int mCP;
  public boolean mCQ;
  public LinkedList<String> mCR;
  public boolean mCS;
  public boolean mCT;
  public boolean mCU;
  public boolean mCV;
  public bn mCW;
  public int mCX;
  public bb mCY;
  
  public c()
  {
    GMTrace.i(12647470727168L, 94231);
    this.mCR = new LinkedList();
    GMTrace.o(12647470727168L, 94231);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12647604944896L, 94232);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.mCI == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      if (this.mCH != null) {
        paramVarArgs.e(1, this.mCH);
      }
      if (this.mCI != null) {
        paramVarArgs.e(2, this.mCI);
      }
      if (this.mCJ != null) {
        paramVarArgs.e(3, this.mCJ);
      }
      if (this.mCK != null) {
        paramVarArgs.e(4, this.mCK);
      }
      if (this.mCL != null) {
        paramVarArgs.e(5, this.mCL);
      }
      if (this.mCE != null) {
        paramVarArgs.e(6, this.mCE);
      }
      if (this.mCM != null) {
        paramVarArgs.e(7, this.mCM);
      }
      paramVarArgs.fd(8, this.mCN);
      if (this.mCO != null)
      {
        paramVarArgs.ff(9, this.mCO.aWM());
        this.mCO.a(paramVarArgs);
      }
      paramVarArgs.fd(10, this.jXo);
      paramVarArgs.fd(11, this.mCP);
      if (this.mCG != null) {
        paramVarArgs.e(12, this.mCG);
      }
      paramVarArgs.af(13, this.mCQ);
      paramVarArgs.d(14, 1, this.mCR);
      paramVarArgs.af(15, this.mCS);
      paramVarArgs.fd(16, this.jXO);
      paramVarArgs.af(17, this.mCT);
      paramVarArgs.af(18, this.mCU);
      paramVarArgs.af(19, this.mCV);
      if (this.mCW != null)
      {
        paramVarArgs.ff(20, this.mCW.aWM());
        this.mCW.a(paramVarArgs);
      }
      paramVarArgs.fd(21, this.mCX);
      if (this.mCY != null)
      {
        paramVarArgs.ff(22, this.mCY.aWM());
        this.mCY.a(paramVarArgs);
      }
      GMTrace.o(12647604944896L, 94232);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mCH != null) {
        i = b.a.a.b.b.a.f(1, this.mCH) + 0;
      }
      paramInt = i;
      if (this.mCI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCI);
      }
      i = paramInt;
      if (this.mCJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mCJ);
      }
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCK);
      }
      i = paramInt;
      if (this.mCL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mCL);
      }
      paramInt = i;
      if (this.mCE != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mCE);
      }
      i = paramInt;
      if (this.mCM != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.mCM);
      }
      i += b.a.a.a.fa(8, this.mCN);
      paramInt = i;
      if (this.mCO != null) {
        paramInt = i + b.a.a.a.fc(9, this.mCO.aWM());
      }
      i = paramInt + b.a.a.a.fa(10, this.jXo) + b.a.a.a.fa(11, this.mCP);
      paramInt = i;
      if (this.mCG != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.mCG);
      }
      i = paramInt + (b.a.a.b.b.a.cK(13) + 1) + b.a.a.a.c(14, 1, this.mCR) + (b.a.a.b.b.a.cK(15) + 1) + b.a.a.a.fa(16, this.jXO) + (b.a.a.b.b.a.cK(17) + 1) + (b.a.a.b.b.a.cK(18) + 1) + (b.a.a.b.b.a.cK(19) + 1);
      paramInt = i;
      if (this.mCW != null) {
        paramInt = i + b.a.a.a.fc(20, this.mCW.aWM());
      }
      i = paramInt + b.a.a.a.fa(21, this.mCX);
      paramInt = i;
      if (this.mCY != null) {
        paramInt = i + b.a.a.a.fc(22, this.mCY.aWM());
      }
      GMTrace.o(12647604944896L, 94232);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mCR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.mCI == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      GMTrace.o(12647604944896L, 94232);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12647604944896L, 94232);
        return -1;
      case 1: 
        localc.mCH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 2: 
        localc.mCI = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 3: 
        localc.mCJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 4: 
        localc.mCK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 5: 
        localc.mCL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 6: 
        localc.mCE = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 7: 
        localc.mCM = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 8: 
        localc.mCN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new l();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((l)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localc.mCO = ((l)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 10: 
        localc.jXo = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 11: 
        localc.mCP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 12: 
        localc.mCG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 13: 
        localc.mCQ = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 14: 
        localc.mCR.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 15: 
        localc.mCS = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 16: 
        localc.jXO = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 17: 
        localc.mCT = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 18: 
        localc.mCU = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 19: 
        localc.mCV = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localc.mCW = ((bn)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 21: 
        localc.mCX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localc.mCY = ((bb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12647604944896L, 94232);
      return 0;
    }
    GMTrace.o(12647604944896L, 94232);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */