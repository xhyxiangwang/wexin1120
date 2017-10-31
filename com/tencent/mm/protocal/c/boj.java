package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class boj
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCK;
  public String nat;
  public int tve;
  public String txh;
  public String uEO;
  public String uoq;
  
  public boj()
  {
    GMTrace.i(15000441716736L, 111762);
    GMTrace.o(15000441716736L, 111762);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15000575934464L, 111763);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.uoq != null) {
        paramVarArgs.e(2, this.uoq);
      }
      if (this.nat != null) {
        paramVarArgs.e(3, this.nat);
      }
      if (this.mCK != null) {
        paramVarArgs.e(4, this.mCK);
      }
      if (this.uEO != null) {
        paramVarArgs.e(5, this.uEO);
      }
      paramVarArgs.fd(6, this.tve);
      if (this.txh != null) {
        paramVarArgs.e(7, this.txh);
      }
      GMTrace.o(15000575934464L, 111763);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label601;
      }
    }
    label601:
    for (int i = b.a.a.b.b.a.f(1, this.fuw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uoq != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uoq);
      }
      i = paramInt;
      if (this.nat != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nat);
      }
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCK);
      }
      i = paramInt;
      if (this.uEO != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uEO);
      }
      i += b.a.a.a.fa(6, this.tve);
      paramInt = i;
      if (this.txh != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.txh);
      }
      GMTrace.o(15000575934464L, 111763);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(15000575934464L, 111763);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        boj localboj = (boj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15000575934464L, 111763);
          return -1;
        case 1: 
          localboj.fuw = locala.xSv.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 2: 
          localboj.uoq = locala.xSv.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 3: 
          localboj.nat = locala.xSv.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 4: 
          localboj.mCK = locala.xSv.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 5: 
          localboj.uEO = locala.xSv.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 6: 
          localboj.tve = locala.xSv.nm();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        }
        localboj.txh = locala.xSv.readString();
        GMTrace.o(15000575934464L, 111763);
        return 0;
      }
      GMTrace.o(15000575934464L, 111763);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/boj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */