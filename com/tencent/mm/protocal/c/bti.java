package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bti
  extends com.tencent.mm.bl.a
{
  public int tAS;
  public int ttY;
  public int uHV;
  public int uHW;
  public int ude;
  
  public bti()
  {
    GMTrace.i(17615271493632L, 131244);
    GMTrace.o(17615271493632L, 131244);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615405711360L, 131245);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.ude);
      paramVarArgs.fd(2, this.tAS);
      paramVarArgs.fd(3, this.uHV);
      paramVarArgs.fd(4, this.ttY);
      paramVarArgs.fd(10, this.uHW);
      GMTrace.o(17615405711360L, 131245);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.ude);
      int i = b.a.a.a.fa(2, this.tAS);
      int j = b.a.a.a.fa(3, this.uHV);
      int k = b.a.a.a.fa(4, this.ttY);
      int m = b.a.a.a.fa(10, this.uHW);
      GMTrace.o(17615405711360L, 131245);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17615405711360L, 131245);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bti localbti = (bti)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        GMTrace.o(17615405711360L, 131245);
        return -1;
      case 1: 
        localbti.ude = locala.xSv.nm();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      case 2: 
        localbti.tAS = locala.xSv.nm();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      case 3: 
        localbti.uHV = locala.xSv.nm();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      case 4: 
        localbti.ttY = locala.xSv.nm();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      }
      localbti.uHW = locala.xSv.nm();
      GMTrace.o(17615405711360L, 131245);
      return 0;
    }
    GMTrace.o(17615405711360L, 131245);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */