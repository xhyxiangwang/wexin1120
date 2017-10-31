package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ng
  extends com.tencent.mm.bl.a
{
  public String fvD;
  public String fvE;
  public int tJD;
  public int tJE;
  public String tJF;
  public int version;
  
  public ng()
  {
    GMTrace.i(3891777241088L, 28996);
    GMTrace.o(3891777241088L, 28996);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3891911458816L, 28997);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.version);
      paramVarArgs.fd(2, this.tJD);
      paramVarArgs.fd(3, this.tJE);
      if (this.fvE != null) {
        paramVarArgs.e(4, this.fvE);
      }
      if (this.tJF != null) {
        paramVarArgs.e(5, this.tJF);
      }
      if (this.fvD != null) {
        paramVarArgs.e(6, this.fvD);
      }
      GMTrace.o(3891911458816L, 28997);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.version) + 0 + b.a.a.a.fa(2, this.tJD) + b.a.a.a.fa(3, this.tJE);
      paramInt = i;
      if (this.fvE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fvE);
      }
      i = paramInt;
      if (this.tJF != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tJF);
      }
      paramInt = i;
      if (this.fvD != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.fvD);
      }
      GMTrace.o(3891911458816L, 28997);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3891911458816L, 28997);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ng localng = (ng)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3891911458816L, 28997);
        return -1;
      case 1: 
        localng.version = locala.xSv.nm();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 2: 
        localng.tJD = locala.xSv.nm();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 3: 
        localng.tJE = locala.xSv.nm();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 4: 
        localng.fvE = locala.xSv.readString();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 5: 
        localng.tJF = locala.xSv.readString();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      }
      localng.fvD = locala.xSv.readString();
      GMTrace.o(3891911458816L, 28997);
      return 0;
    }
    GMTrace.o(3891911458816L, 28997);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */