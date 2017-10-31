package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class vd
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public String mDD;
  public int tTu;
  public int tvT;
  
  public vd()
  {
    GMTrace.i(3926136979456L, 29252);
    GMTrace.o(3926136979456L, 29252);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3926271197184L, 29253);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDD != null) {
        paramVarArgs.e(1, this.mDD);
      }
      paramVarArgs.fd(2, this.jXP);
      paramVarArgs.fd(3, this.tvT);
      paramVarArgs.fd(4, this.tTu);
      GMTrace.o(3926271197184L, 29253);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDD == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDD) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.jXP);
      int j = b.a.a.a.fa(3, this.tvT);
      int k = b.a.a.a.fa(4, this.tTu);
      GMTrace.o(3926271197184L, 29253);
      return paramInt + i + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3926271197184L, 29253);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        vd localvd = (vd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3926271197184L, 29253);
          return -1;
        case 1: 
          localvd.mDD = locala.xSv.readString();
          GMTrace.o(3926271197184L, 29253);
          return 0;
        case 2: 
          localvd.jXP = locala.xSv.nm();
          GMTrace.o(3926271197184L, 29253);
          return 0;
        case 3: 
          localvd.tvT = locala.xSv.nm();
          GMTrace.o(3926271197184L, 29253);
          return 0;
        }
        localvd.tTu = locala.xSv.nm();
        GMTrace.o(3926271197184L, 29253);
        return 0;
      }
      GMTrace.o(3926271197184L, 29253);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */