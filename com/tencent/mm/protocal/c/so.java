package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class so
  extends com.tencent.mm.bl.a
{
  public int jXo;
  public String tDT;
  public int tDU;
  public String tHs;
  public String tHt;
  public String tHu;
  public int tHv;
  public String tOn;
  public String tOo;
  public int tOp;
  
  public so()
  {
    GMTrace.i(3816346877952L, 28434);
    GMTrace.o(3816346877952L, 28434);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3816481095680L, 28435);
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
      if (this.tOn != null) {
        paramVarArgs.e(5, this.tOn);
      }
      if (this.tDT != null) {
        paramVarArgs.e(6, this.tDT);
      }
      paramVarArgs.fd(7, this.tDU);
      if (this.tOo != null) {
        paramVarArgs.e(8, this.tOo);
      }
      paramVarArgs.fd(9, this.jXo);
      paramVarArgs.fd(10, this.tOp);
      GMTrace.o(3816481095680L, 28435);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tHs == null) {
        break label766;
      }
    }
    label766:
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
      i += b.a.a.a.fa(4, this.tHv);
      paramInt = i;
      if (this.tOn != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tOn);
      }
      i = paramInt;
      if (this.tDT != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tDT);
      }
      i += b.a.a.a.fa(7, this.tDU);
      paramInt = i;
      if (this.tOo != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tOo);
      }
      i = b.a.a.a.fa(9, this.jXo);
      int j = b.a.a.a.fa(10, this.tOp);
      GMTrace.o(3816481095680L, 28435);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3816481095680L, 28435);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        so localso = (so)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3816481095680L, 28435);
          return -1;
        case 1: 
          localso.tHs = locala.xSv.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 2: 
          localso.tHt = locala.xSv.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 3: 
          localso.tHu = locala.xSv.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 4: 
          localso.tHv = locala.xSv.nm();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 5: 
          localso.tOn = locala.xSv.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 6: 
          localso.tDT = locala.xSv.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 7: 
          localso.tDU = locala.xSv.nm();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 8: 
          localso.tOo = locala.xSv.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 9: 
          localso.jXo = locala.xSv.nm();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        }
        localso.tOp = locala.xSv.nm();
        GMTrace.o(3816481095680L, 28435);
        return 0;
      }
      GMTrace.o(3816481095680L, 28435);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */