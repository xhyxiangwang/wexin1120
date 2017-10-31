package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nk
  extends com.tencent.mm.bl.a
{
  public int huJ;
  public String huO;
  public String jWW;
  public String jYc;
  public String mGM;
  public String tJK;
  public String tJL;
  public int tJM;
  public int tJN;
  public String tJO;
  public int tJP;
  public String tJQ;
  public String tJR;
  public int tJS;
  public int tJT;
  public LinkedList<axr> tJU;
  public String tJV;
  public int tJW;
  public int tJX;
  public int tJY;
  public int tJZ;
  public axs tvs;
  
  public nk()
  {
    GMTrace.i(3977139716096L, 29632);
    this.tJU = new LinkedList();
    GMTrace.o(3977139716096L, 29632);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977273933824L, 29633);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tvs == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      if (this.tJK != null) {
        paramVarArgs.e(3, this.tJK);
      }
      if (this.tJL != null) {
        paramVarArgs.e(4, this.tJL);
      }
      paramVarArgs.fd(5, this.huJ);
      if (this.tvs != null)
      {
        paramVarArgs.ff(6, this.tvs.aWM());
        this.tvs.a(paramVarArgs);
      }
      paramVarArgs.fd(7, this.tJM);
      paramVarArgs.fd(8, this.tJN);
      if (this.tJO != null) {
        paramVarArgs.e(9, this.tJO);
      }
      paramVarArgs.fd(10, this.tJP);
      if (this.tJQ != null) {
        paramVarArgs.e(11, this.tJQ);
      }
      if (this.tJR != null) {
        paramVarArgs.e(12, this.tJR);
      }
      paramVarArgs.fd(13, this.tJS);
      paramVarArgs.fd(14, this.tJT);
      paramVarArgs.d(15, 8, this.tJU);
      if (this.tJV != null) {
        paramVarArgs.e(16, this.tJV);
      }
      paramVarArgs.fd(17, this.tJW);
      paramVarArgs.fd(18, this.tJX);
      if (this.mGM != null) {
        paramVarArgs.e(19, this.mGM);
      }
      paramVarArgs.fd(20, this.tJY);
      paramVarArgs.fd(21, this.tJZ);
      if (this.huO != null) {
        paramVarArgs.e(22, this.huO);
      }
      GMTrace.o(3977273933824L, 29633);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.jWW != null) {
        i = b.a.a.b.b.a.f(1, this.jWW) + 0;
      }
      paramInt = i;
      if (this.jYc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jYc);
      }
      i = paramInt;
      if (this.tJK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tJK);
      }
      paramInt = i;
      if (this.tJL != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tJL);
      }
      i = paramInt + b.a.a.a.fa(5, this.huJ);
      paramInt = i;
      if (this.tvs != null) {
        paramInt = i + b.a.a.a.fc(6, this.tvs.aWM());
      }
      i = paramInt + b.a.a.a.fa(7, this.tJM) + b.a.a.a.fa(8, this.tJN);
      paramInt = i;
      if (this.tJO != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tJO);
      }
      i = paramInt + b.a.a.a.fa(10, this.tJP);
      paramInt = i;
      if (this.tJQ != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tJQ);
      }
      i = paramInt;
      if (this.tJR != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.tJR);
      }
      i = i + b.a.a.a.fa(13, this.tJS) + b.a.a.a.fa(14, this.tJT) + b.a.a.a.c(15, 8, this.tJU);
      paramInt = i;
      if (this.tJV != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tJV);
      }
      i = paramInt + b.a.a.a.fa(17, this.tJW) + b.a.a.a.fa(18, this.tJX);
      paramInt = i;
      if (this.mGM != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.mGM);
      }
      i = paramInt + b.a.a.a.fa(20, this.tJY) + b.a.a.a.fa(21, this.tJZ);
      paramInt = i;
      if (this.huO != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.huO);
      }
      GMTrace.o(3977273933824L, 29633);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tJU.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tvs == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(3977273933824L, 29633);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nk localnk = (nk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977273933824L, 29633);
        return -1;
      case 1: 
        localnk.jWW = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 2: 
        localnk.jYc = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 3: 
        localnk.tJK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 4: 
        localnk.tJL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 5: 
        localnk.huJ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localnk.tvs = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 7: 
        localnk.tJM = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 8: 
        localnk.tJN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 9: 
        localnk.tJO = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 10: 
        localnk.tJP = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 11: 
        localnk.tJQ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 12: 
        localnk.tJR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 13: 
        localnk.tJS = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 14: 
        localnk.tJT = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localnk.tJU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 16: 
        localnk.tJV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 17: 
        localnk.tJW = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 18: 
        localnk.tJX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 19: 
        localnk.mGM = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 20: 
        localnk.tJY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      case 21: 
        localnk.tJZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977273933824L, 29633);
        return 0;
      }
      localnk.huO = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3977273933824L, 29633);
      return 0;
    }
    GMTrace.o(3977273933824L, 29633);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/nk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */