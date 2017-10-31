package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class atu
  extends com.tencent.mm.bl.a
{
  public int lpk;
  public String lpl;
  public int mXm;
  public String mXn;
  public int unP;
  public int upk;
  public int upl;
  
  public atu()
  {
    GMTrace.i(4019149864960L, 29945);
    GMTrace.o(4019149864960L, 29945);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4019284082688L, 29946);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.unP);
      paramVarArgs.fd(2, this.upl);
      paramVarArgs.fd(3, this.upk);
      paramVarArgs.fd(4, this.lpk);
      if (this.lpl != null) {
        paramVarArgs.e(5, this.lpl);
      }
      paramVarArgs.fd(6, this.mXm);
      if (this.mXn != null) {
        paramVarArgs.e(7, this.mXn);
      }
      GMTrace.o(4019284082688L, 29946);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.unP) + 0 + b.a.a.a.fa(2, this.upl) + b.a.a.a.fa(3, this.upk) + b.a.a.a.fa(4, this.lpk);
      paramInt = i;
      if (this.lpl != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lpl);
      }
      i = paramInt + b.a.a.a.fa(6, this.mXm);
      paramInt = i;
      if (this.mXn != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mXn);
      }
      GMTrace.o(4019284082688L, 29946);
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
      GMTrace.o(4019284082688L, 29946);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      atu localatu = (atu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4019284082688L, 29946);
        return -1;
      case 1: 
        localatu.unP = locala.xSv.nm();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 2: 
        localatu.upl = locala.xSv.nm();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 3: 
        localatu.upk = locala.xSv.nm();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 4: 
        localatu.lpk = locala.xSv.nm();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 5: 
        localatu.lpl = locala.xSv.readString();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 6: 
        localatu.mXm = locala.xSv.nm();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      }
      localatu.mXn = locala.xSv.readString();
      GMTrace.o(4019284082688L, 29946);
      return 0;
    }
    GMTrace.o(4019284082688L, 29946);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */