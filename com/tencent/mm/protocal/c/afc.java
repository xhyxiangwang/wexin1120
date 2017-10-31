package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class afc
  extends com.tencent.mm.bl.a
{
  public int ttf;
  public String ttg;
  
  public afc()
  {
    GMTrace.i(3798093266944L, 28298);
    GMTrace.o(3798093266944L, 28298);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3798227484672L, 28299);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.ttf);
      if (this.ttg != null) {
        paramVarArgs.e(2, this.ttg);
      }
      GMTrace.o(3798227484672L, 28299);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.ttf) + 0;
      paramInt = i;
      if (this.ttg != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ttg);
      }
      GMTrace.o(3798227484672L, 28299);
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
      GMTrace.o(3798227484672L, 28299);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      afc localafc = (afc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3798227484672L, 28299);
        return -1;
      case 1: 
        localafc.ttf = locala.xSv.nm();
        GMTrace.o(3798227484672L, 28299);
        return 0;
      }
      localafc.ttg = locala.xSv.readString();
      GMTrace.o(3798227484672L, 28299);
      return 0;
    }
    GMTrace.o(3798227484672L, 28299);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */