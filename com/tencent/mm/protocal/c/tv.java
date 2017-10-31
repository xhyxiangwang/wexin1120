package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tv
  extends com.tencent.mm.bl.a
{
  public String jWW;
  public String jYc;
  public String mDH;
  public String mDi;
  public String mGI;
  public String tIq;
  public String tRR;
  public String tRS;
  public int tst;
  public String tzN;
  
  public tv()
  {
    GMTrace.i(3867483832320L, 28815);
    GMTrace.o(3867483832320L, 28815);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3867618050048L, 28816);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGI != null) {
        paramVarArgs.e(1, this.mGI);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      if (this.jWW != null) {
        paramVarArgs.e(3, this.jWW);
      }
      if (this.mDH != null) {
        paramVarArgs.e(4, this.mDH);
      }
      if (this.tRR != null) {
        paramVarArgs.e(5, this.tRR);
      }
      if (this.tRS != null) {
        paramVarArgs.e(6, this.tRS);
      }
      if (this.tzN != null) {
        paramVarArgs.e(7, this.tzN);
      }
      if (this.tIq != null) {
        paramVarArgs.e(8, this.tIq);
      }
      if (this.mDi != null) {
        paramVarArgs.e(9, this.mDi);
      }
      paramVarArgs.fd(10, this.tst);
      GMTrace.o(3867618050048L, 28816);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mGI == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.mGI) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jYc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jYc);
      }
      i = paramInt;
      if (this.jWW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jWW);
      }
      paramInt = i;
      if (this.mDH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDH);
      }
      i = paramInt;
      if (this.tRR != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tRR);
      }
      paramInt = i;
      if (this.tRS != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tRS);
      }
      i = paramInt;
      if (this.tzN != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tzN);
      }
      paramInt = i;
      if (this.tIq != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tIq);
      }
      i = paramInt;
      if (this.mDi != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.mDi);
      }
      paramInt = b.a.a.a.fa(10, this.tst);
      GMTrace.o(3867618050048L, 28816);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3867618050048L, 28816);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tv localtv = (tv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3867618050048L, 28816);
          return -1;
        case 1: 
          localtv.mGI = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 2: 
          localtv.jYc = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 3: 
          localtv.jWW = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 4: 
          localtv.mDH = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 5: 
          localtv.tRR = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 6: 
          localtv.tRS = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 7: 
          localtv.tzN = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 8: 
          localtv.tIq = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        case 9: 
          localtv.mDi = locala.xSv.readString();
          GMTrace.o(3867618050048L, 28816);
          return 0;
        }
        localtv.tst = locala.xSv.nm();
        GMTrace.o(3867618050048L, 28816);
        return 0;
      }
      GMTrace.o(3867618050048L, 28816);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/tv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */