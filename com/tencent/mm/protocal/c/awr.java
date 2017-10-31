package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class awr
  extends com.tencent.mm.bl.a
{
  public String jXB;
  public int pFt;
  public String tBR;
  public String tBS;
  public String tBT;
  public String tBU;
  public int urk;
  public int urm;
  public String urn;
  
  public awr()
  {
    GMTrace.i(3805072588800L, 28350);
    GMTrace.o(3805072588800L, 28350);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3805206806528L, 28351);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jXB != null) {
        paramVarArgs.e(1, this.jXB);
      }
      paramVarArgs.fd(2, this.urk);
      if (this.tBR != null) {
        paramVarArgs.e(3, this.tBR);
      }
      if (this.tBS != null) {
        paramVarArgs.e(4, this.tBS);
      }
      paramVarArgs.fd(5, this.pFt);
      paramVarArgs.fd(6, this.urm);
      if (this.tBT != null) {
        paramVarArgs.e(7, this.tBT);
      }
      if (this.tBU != null) {
        paramVarArgs.e(8, this.tBU);
      }
      if (this.urn != null) {
        paramVarArgs.e(9, this.urn);
      }
      GMTrace.o(3805206806528L, 28351);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jXB == null) {
        break label714;
      }
    }
    label714:
    for (paramInt = b.a.a.b.b.a.f(1, this.jXB) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.urk);
      paramInt = i;
      if (this.tBR != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tBR);
      }
      i = paramInt;
      if (this.tBS != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tBS);
      }
      i = i + b.a.a.a.fa(5, this.pFt) + b.a.a.a.fa(6, this.urm);
      paramInt = i;
      if (this.tBT != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tBT);
      }
      i = paramInt;
      if (this.tBU != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tBU);
      }
      paramInt = i;
      if (this.urn != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.urn);
      }
      GMTrace.o(3805206806528L, 28351);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3805206806528L, 28351);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        awr localawr = (awr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3805206806528L, 28351);
          return -1;
        case 1: 
          localawr.jXB = locala.xSv.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 2: 
          localawr.urk = locala.xSv.nm();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 3: 
          localawr.tBR = locala.xSv.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 4: 
          localawr.tBS = locala.xSv.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 5: 
          localawr.pFt = locala.xSv.nm();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 6: 
          localawr.urm = locala.xSv.nm();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 7: 
          localawr.tBT = locala.xSv.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 8: 
          localawr.tBU = locala.xSv.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        }
        localawr.urn = locala.xSv.readString();
        GMTrace.o(3805206806528L, 28351);
        return 0;
      }
      GMTrace.o(3805206806528L, 28351);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/awr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */