package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsq
  extends com.tencent.mm.bl.a
{
  public int fNV;
  public String fNW;
  public int jXP;
  public String jos;
  public int jox;
  public int lpw;
  public String mDD;
  public int pat;
  public int pau;
  public int sjB;
  public int uHi;
  public String uHt;
  public String uHu;
  public String uHv;
  public String uHw;
  public int uHx;
  public String uHy;
  
  public bsq()
  {
    GMTrace.i(4051227901952L, 30184);
    GMTrace.o(4051227901952L, 30184);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4051362119680L, 30185);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.jXP);
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      if (this.uHt != null) {
        paramVarArgs.e(3, this.uHt);
      }
      paramVarArgs.fd(4, this.pat);
      paramVarArgs.fd(5, this.lpw);
      paramVarArgs.fd(6, this.pau);
      if (this.uHu != null) {
        paramVarArgs.e(7, this.uHu);
      }
      paramVarArgs.fd(8, this.uHi);
      if (this.uHv != null) {
        paramVarArgs.e(9, this.uHv);
      }
      if (this.uHw != null) {
        paramVarArgs.e(10, this.uHw);
      }
      paramVarArgs.fd(11, this.sjB);
      paramVarArgs.fd(12, this.uHx);
      if (this.uHy != null) {
        paramVarArgs.e(13, this.uHy);
      }
      if (this.jos != null) {
        paramVarArgs.e(14, this.jos);
      }
      paramVarArgs.fd(15, this.fNV);
      if (this.fNW != null) {
        paramVarArgs.e(16, this.fNW);
      }
      paramVarArgs.fd(17, this.jox);
      GMTrace.o(4051362119680L, 30185);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.jXP) + 0;
      paramInt = i;
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDD);
      }
      i = paramInt;
      if (this.uHt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uHt);
      }
      i = i + b.a.a.a.fa(4, this.pat) + b.a.a.a.fa(5, this.lpw) + b.a.a.a.fa(6, this.pau);
      paramInt = i;
      if (this.uHu != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uHu);
      }
      i = paramInt + b.a.a.a.fa(8, this.uHi);
      paramInt = i;
      if (this.uHv != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uHv);
      }
      i = paramInt;
      if (this.uHw != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uHw);
      }
      i = i + b.a.a.a.fa(11, this.sjB) + b.a.a.a.fa(12, this.uHx);
      paramInt = i;
      if (this.uHy != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uHy);
      }
      i = paramInt;
      if (this.jos != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.jos);
      }
      i += b.a.a.a.fa(15, this.fNV);
      paramInt = i;
      if (this.fNW != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.fNW);
      }
      i = b.a.a.a.fa(17, this.jox);
      GMTrace.o(4051362119680L, 30185);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4051362119680L, 30185);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsq localbsq = (bsq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4051362119680L, 30185);
        return -1;
      case 1: 
        localbsq.jXP = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 2: 
        localbsq.mDD = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 3: 
        localbsq.uHt = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 4: 
        localbsq.pat = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 5: 
        localbsq.lpw = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 6: 
        localbsq.pau = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 7: 
        localbsq.uHu = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 8: 
        localbsq.uHi = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 9: 
        localbsq.uHv = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 10: 
        localbsq.uHw = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 11: 
        localbsq.sjB = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 12: 
        localbsq.uHx = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 13: 
        localbsq.uHy = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 14: 
        localbsq.jos = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 15: 
        localbsq.fNV = locala.xSv.nm();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 16: 
        localbsq.fNW = locala.xSv.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      }
      localbsq.jox = locala.xSv.nm();
      GMTrace.o(4051362119680L, 30185);
      return 0;
    }
    GMTrace.o(4051362119680L, 30185);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */