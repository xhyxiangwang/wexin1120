package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class c
  extends com.tencent.mm.bl.a
{
  public String rFJ;
  public int rFK;
  
  public c()
  {
    GMTrace.i(18427959836672L, 137299);
    GMTrace.o(18427959836672L, 137299);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18428094054400L, 137300);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.rFJ != null) {
        paramVarArgs.e(1, this.rFJ);
      }
      paramVarArgs.fd(2, this.rFK);
      GMTrace.o(18428094054400L, 137300);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rFJ == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.rFJ) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.rFK);
      GMTrace.o(18428094054400L, 137300);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(18428094054400L, 137300);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        c localc = (c)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18428094054400L, 137300);
          return -1;
        case 1: 
          localc.rFJ = locala.xSv.readString();
          GMTrace.o(18428094054400L, 137300);
          return 0;
        }
        localc.rFK = locala.xSv.nm();
        GMTrace.o(18428094054400L, 137300);
        return 0;
      }
      GMTrace.o(18428094054400L, 137300);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */