package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdt
  extends com.tencent.mm.bl.a
{
  public int tve;
  public int uvL;
  
  public bdt()
  {
    GMTrace.i(3930700382208L, 29286);
    GMTrace.o(3930700382208L, 29286);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3930834599936L, 29287);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tve);
      paramVarArgs.fd(2, this.uvL);
      GMTrace.o(3930834599936L, 29287);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tve);
      int i = b.a.a.a.fa(2, this.uvL);
      GMTrace.o(3930834599936L, 29287);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3930834599936L, 29287);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bdt localbdt = (bdt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3930834599936L, 29287);
        return -1;
      case 1: 
        localbdt.tve = locala.xSv.nm();
        GMTrace.o(3930834599936L, 29287);
        return 0;
      }
      localbdt.uvL = locala.xSv.nm();
      GMTrace.o(3930834599936L, 29287);
      return 0;
    }
    GMTrace.o(3930834599936L, 29287);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */