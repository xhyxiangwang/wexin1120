package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ej
  extends com.tencent.mm.bl.a
{
  public String mVv;
  public String oql;
  public String oqm;
  public String rKI;
  public String tyA;
  public String tyB;
  public String tyC;
  public String tyz;
  
  public ej()
  {
    GMTrace.i(3809635991552L, 28384);
    GMTrace.o(3809635991552L, 28384);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3809770209280L, 28385);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tyz != null) {
        paramVarArgs.e(1, this.tyz);
      }
      if (this.rKI != null) {
        paramVarArgs.e(2, this.rKI);
      }
      if (this.oql != null) {
        paramVarArgs.e(3, this.oql);
      }
      if (this.oqm != null) {
        paramVarArgs.e(4, this.oqm);
      }
      if (this.mVv != null) {
        paramVarArgs.e(5, this.mVv);
      }
      if (this.tyA != null) {
        paramVarArgs.e(6, this.tyA);
      }
      if (this.tyB != null) {
        paramVarArgs.e(7, this.tyB);
      }
      if (this.tyC != null) {
        paramVarArgs.e(8, this.tyC);
      }
      GMTrace.o(3809770209280L, 28385);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tyz == null) {
        break label698;
      }
    }
    label698:
    for (int i = b.a.a.b.b.a.f(1, this.tyz) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rKI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.rKI);
      }
      i = paramInt;
      if (this.oql != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.oql);
      }
      paramInt = i;
      if (this.oqm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.oqm);
      }
      i = paramInt;
      if (this.mVv != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mVv);
      }
      paramInt = i;
      if (this.tyA != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tyA);
      }
      i = paramInt;
      if (this.tyB != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tyB);
      }
      paramInt = i;
      if (this.tyC != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tyC);
      }
      GMTrace.o(3809770209280L, 28385);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3809770209280L, 28385);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ej localej = (ej)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3809770209280L, 28385);
          return -1;
        case 1: 
          localej.tyz = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 2: 
          localej.rKI = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 3: 
          localej.oql = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 4: 
          localej.oqm = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 5: 
          localej.mVv = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 6: 
          localej.tyA = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 7: 
          localej.tyB = locala.xSv.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        }
        localej.tyC = locala.xSv.readString();
        GMTrace.o(3809770209280L, 28385);
        return 0;
      }
      GMTrace.o(3809770209280L, 28385);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */