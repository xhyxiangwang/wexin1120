package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jq
  extends com.tencent.mm.bl.a
{
  public String tFI;
  public String tFJ;
  public int tFK;
  public int tFL;
  public int tFM;
  public int tFN;
  
  public jq()
  {
    GMTrace.i(3962644201472L, 29524);
    GMTrace.o(3962644201472L, 29524);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3962778419200L, 29525);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tFI != null) {
        paramVarArgs.e(1, this.tFI);
      }
      if (this.tFJ != null) {
        paramVarArgs.e(2, this.tFJ);
      }
      paramVarArgs.fd(3, this.tFK);
      paramVarArgs.fd(4, this.tFL);
      paramVarArgs.fd(5, this.tFM);
      paramVarArgs.fd(6, this.tFN);
      GMTrace.o(3962778419200L, 29525);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tFI == null) {
        break label506;
      }
    }
    label506:
    for (paramInt = b.a.a.b.b.a.f(1, this.tFI) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tFJ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tFJ);
      }
      paramInt = b.a.a.a.fa(3, this.tFK);
      int j = b.a.a.a.fa(4, this.tFL);
      int k = b.a.a.a.fa(5, this.tFM);
      int m = b.a.a.a.fa(6, this.tFN);
      GMTrace.o(3962778419200L, 29525);
      return i + paramInt + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3962778419200L, 29525);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jq localjq = (jq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3962778419200L, 29525);
          return -1;
        case 1: 
          localjq.tFI = locala.xSv.readString();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 2: 
          localjq.tFJ = locala.xSv.readString();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 3: 
          localjq.tFK = locala.xSv.nm();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 4: 
          localjq.tFL = locala.xSv.nm();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 5: 
          localjq.tFM = locala.xSv.nm();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        }
        localjq.tFN = locala.xSv.nm();
        GMTrace.o(3962778419200L, 29525);
        return 0;
      }
      GMTrace.o(3962778419200L, 29525);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/jq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */