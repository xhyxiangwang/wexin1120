package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btb
  extends com.tencent.mm.bl.a
{
  public String ucY;
  
  public btb()
  {
    GMTrace.i(15346455019520L, 114340);
    GMTrace.o(15346455019520L, 114340);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15346589237248L, 114341);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ucY != null) {
        paramVarArgs.e(1, this.ucY);
      }
      GMTrace.o(15346589237248L, 114341);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ucY == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = b.a.a.b.b.a.f(1, this.ucY) + 0;; paramInt = 0)
    {
      GMTrace.o(15346589237248L, 114341);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(15346589237248L, 114341);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btb localbtb = (btb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15346589237248L, 114341);
          return -1;
        }
        localbtb.ucY = locala.xSv.readString();
        GMTrace.o(15346589237248L, 114341);
        return 0;
      }
      GMTrace.o(15346589237248L, 114341);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/btb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */