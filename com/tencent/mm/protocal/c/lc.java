package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class lc
  extends com.tencent.mm.bl.a
{
  public String tHs;
  public String tHt;
  public String tHu;
  public int tHv;
  public int tHw;
  public String tHx;
  public int tHy;
  
  public lc()
  {
    GMTrace.i(3775142035456L, 28127);
    GMTrace.o(3775142035456L, 28127);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3775276253184L, 28128);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tHs != null) {
        paramVarArgs.e(1, this.tHs);
      }
      if (this.tHt != null) {
        paramVarArgs.e(2, this.tHt);
      }
      if (this.tHu != null) {
        paramVarArgs.e(3, this.tHu);
      }
      paramVarArgs.fd(4, this.tHv);
      paramVarArgs.fd(5, this.tHw);
      if (this.tHx != null) {
        paramVarArgs.e(6, this.tHx);
      }
      paramVarArgs.fd(7, this.tHy);
      GMTrace.o(3775276253184L, 28128);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tHs == null) {
        break label582;
      }
    }
    label582:
    for (int i = b.a.a.b.b.a.f(1, this.tHs) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tHt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tHt);
      }
      i = paramInt;
      if (this.tHu != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tHu);
      }
      i = i + b.a.a.a.fa(4, this.tHv) + b.a.a.a.fa(5, this.tHw);
      paramInt = i;
      if (this.tHx != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tHx);
      }
      i = b.a.a.a.fa(7, this.tHy);
      GMTrace.o(3775276253184L, 28128);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3775276253184L, 28128);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        lc locallc = (lc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3775276253184L, 28128);
          return -1;
        case 1: 
          locallc.tHs = locala.xSv.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 2: 
          locallc.tHt = locala.xSv.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 3: 
          locallc.tHu = locala.xSv.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 4: 
          locallc.tHv = locala.xSv.nm();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 5: 
          locallc.tHw = locala.xSv.nm();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 6: 
          locallc.tHx = locala.xSv.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        }
        locallc.tHy = locala.xSv.nm();
        GMTrace.o(3775276253184L, 28128);
        return 0;
      }
      GMTrace.o(3775276253184L, 28128);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */