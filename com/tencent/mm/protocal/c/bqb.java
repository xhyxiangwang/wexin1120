package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqb
  extends com.tencent.mm.bl.a
{
  public String gly;
  public String jXb;
  public String tJI;
  public int twe;
  public String uFE;
  public String uFF;
  public String uFG;
  public String uFH;
  public String uFI;
  public String uFJ;
  
  public bqb()
  {
    GMTrace.i(3755277811712L, 27979);
    GMTrace.o(3755277811712L, 27979);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3755412029440L, 27980);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFE == null) {
        throw new b("Not all required fields were included: LocalNodeId");
      }
      if (this.uFE != null) {
        paramVarArgs.e(1, this.uFE);
      }
      if (this.jXb != null) {
        paramVarArgs.e(2, this.jXb);
      }
      if (this.uFF != null) {
        paramVarArgs.e(3, this.uFF);
      }
      if (this.gly != null) {
        paramVarArgs.e(4, this.gly);
      }
      if (this.uFG != null) {
        paramVarArgs.e(5, this.uFG);
      }
      if (this.tJI != null) {
        paramVarArgs.e(6, this.tJI);
      }
      if (this.uFH != null) {
        paramVarArgs.e(7, this.uFH);
      }
      if (this.uFI != null) {
        paramVarArgs.e(8, this.uFI);
      }
      if (this.uFJ != null) {
        paramVarArgs.e(9, this.uFJ);
      }
      paramVarArgs.fd(10, this.twe);
      GMTrace.o(3755412029440L, 27980);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFE == null) {
        break label846;
      }
    }
    label846:
    for (int i = b.a.a.b.b.a.f(1, this.uFE) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jXb != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jXb);
      }
      i = paramInt;
      if (this.uFF != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uFF);
      }
      paramInt = i;
      if (this.gly != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gly);
      }
      i = paramInt;
      if (this.uFG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uFG);
      }
      paramInt = i;
      if (this.tJI != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tJI);
      }
      i = paramInt;
      if (this.uFH != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uFH);
      }
      paramInt = i;
      if (this.uFI != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uFI);
      }
      i = paramInt;
      if (this.uFJ != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uFJ);
      }
      paramInt = b.a.a.a.fa(10, this.twe);
      GMTrace.o(3755412029440L, 27980);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFE == null) {
          throw new b("Not all required fields were included: LocalNodeId");
        }
        GMTrace.o(3755412029440L, 27980);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqb localbqb = (bqb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3755412029440L, 27980);
          return -1;
        case 1: 
          localbqb.uFE = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 2: 
          localbqb.jXb = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 3: 
          localbqb.uFF = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 4: 
          localbqb.gly = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 5: 
          localbqb.uFG = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 6: 
          localbqb.tJI = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 7: 
          localbqb.uFH = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 8: 
          localbqb.uFI = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 9: 
          localbqb.uFJ = locala.xSv.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        }
        localbqb.twe = locala.xSv.nm();
        GMTrace.o(3755412029440L, 27980);
        return 0;
      }
      GMTrace.o(3755412029440L, 27980);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */