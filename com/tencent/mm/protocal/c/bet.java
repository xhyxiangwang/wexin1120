package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bet
  extends com.tencent.mm.bl.a
{
  public int tKO;
  public int ueM;
  public int uwD;
  public int uwE;
  
  public bet()
  {
    GMTrace.i(4008144011264L, 29863);
    GMTrace.o(4008144011264L, 29863);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4008278228992L, 29864);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tKO);
      paramVarArgs.fd(2, this.ueM);
      paramVarArgs.fd(3, this.uwD);
      paramVarArgs.fd(4, this.uwE);
      GMTrace.o(4008278228992L, 29864);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tKO);
      int i = b.a.a.a.fa(2, this.ueM);
      int j = b.a.a.a.fa(3, this.uwD);
      int k = b.a.a.a.fa(4, this.uwE);
      GMTrace.o(4008278228992L, 29864);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4008278228992L, 29864);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bet localbet = (bet)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4008278228992L, 29864);
        return -1;
      case 1: 
        localbet.tKO = locala.xSv.nm();
        GMTrace.o(4008278228992L, 29864);
        return 0;
      case 2: 
        localbet.ueM = locala.xSv.nm();
        GMTrace.o(4008278228992L, 29864);
        return 0;
      case 3: 
        localbet.uwD = locala.xSv.nm();
        GMTrace.o(4008278228992L, 29864);
        return 0;
      }
      localbet.uwE = locala.xSv.nm();
      GMTrace.o(4008278228992L, 29864);
      return 0;
    }
    GMTrace.o(4008278228992L, 29864);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */