package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bof
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String txh;
  public int uEE;
  public String uEF;
  public String uEG;
  public String uEH;
  public String uEI;
  public String uEJ;
  public String uoq;
  
  public bof()
  {
    GMTrace.i(3777826390016L, 28147);
    GMTrace.o(3777826390016L, 28147);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3777960607744L, 28148);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.txh != null) {
        paramVarArgs.e(2, this.txh);
      }
      paramVarArgs.fd(3, this.uEE);
      if (this.uEF != null) {
        paramVarArgs.e(4, this.uEF);
      }
      if (this.uoq != null) {
        paramVarArgs.e(5, this.uoq);
      }
      if (this.uEG != null) {
        paramVarArgs.e(6, this.uEG);
      }
      if (this.uEH != null) {
        paramVarArgs.e(7, this.uEH);
      }
      if (this.uEI != null) {
        paramVarArgs.e(8, this.uEI);
      }
      if (this.uEJ != null) {
        paramVarArgs.e(9, this.uEJ);
      }
      GMTrace.o(3777960607744L, 28148);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label746;
      }
    }
    label746:
    for (paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.txh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.txh);
      }
      i += b.a.a.a.fa(3, this.uEE);
      paramInt = i;
      if (this.uEF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uEF);
      }
      i = paramInt;
      if (this.uoq != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uoq);
      }
      paramInt = i;
      if (this.uEG != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uEG);
      }
      i = paramInt;
      if (this.uEH != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uEH);
      }
      paramInt = i;
      if (this.uEI != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uEI);
      }
      i = paramInt;
      if (this.uEJ != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uEJ);
      }
      GMTrace.o(3777960607744L, 28148);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3777960607744L, 28148);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bof localbof = (bof)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3777960607744L, 28148);
          return -1;
        case 1: 
          localbof.fuw = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 2: 
          localbof.txh = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 3: 
          localbof.uEE = locala.xSv.nm();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 4: 
          localbof.uEF = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 5: 
          localbof.uoq = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 6: 
          localbof.uEG = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 7: 
          localbof.uEH = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 8: 
          localbof.uEI = locala.xSv.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        }
        localbof.uEJ = locala.xSv.readString();
        GMTrace.o(3777960607744L, 28148);
        return 0;
      }
      GMTrace.o(3777960607744L, 28148);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */