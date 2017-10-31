package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btj
  extends com.tencent.mm.bl.a
{
  public int uHX;
  public boolean uHY;
  public boolean uHZ;
  
  public btj()
  {
    GMTrace.i(20073200746496L, 149557);
    GMTrace.o(20073200746496L, 149557);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20073334964224L, 149558);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uHX);
      paramVarArgs.af(2, this.uHY);
      paramVarArgs.af(3, this.uHZ);
      GMTrace.o(20073334964224L, 149558);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.uHX);
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(20073334964224L, 149558);
      return paramInt + 0 + (i + 1) + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(20073334964224L, 149558);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      btj localbtj = (btj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(20073334964224L, 149558);
        return -1;
      case 1: 
        localbtj.uHX = locala.xSv.nm();
        GMTrace.o(20073334964224L, 149558);
        return 0;
      case 2: 
        localbtj.uHY = locala.cpH();
        GMTrace.o(20073334964224L, 149558);
        return 0;
      }
      localbtj.uHZ = locala.cpH();
      GMTrace.o(20073334964224L, 149558);
      return 0;
    }
    GMTrace.o(20073334964224L, 149558);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/btj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */