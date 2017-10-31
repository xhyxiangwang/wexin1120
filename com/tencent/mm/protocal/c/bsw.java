package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bsw
  extends com.tencent.mm.bl.a
{
  public b tAZ;
  public String uHG;
  
  public bsw()
  {
    GMTrace.i(15352629035008L, 114386);
    GMTrace.o(15352629035008L, 114386);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15352763252736L, 114387);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHG != null) {
        paramVarArgs.e(1, this.uHG);
      }
      if (this.tAZ != null) {
        paramVarArgs.b(2, this.tAZ);
      }
      GMTrace.o(15352763252736L, 114387);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uHG == null) {
        break label295;
      }
    }
    label295:
    for (paramInt = b.a.a.b.b.a.f(1, this.uHG) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tAZ != null) {
        i = paramInt + b.a.a.a.a(2, this.tAZ);
      }
      GMTrace.o(15352763252736L, 114387);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(15352763252736L, 114387);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsw localbsw = (bsw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15352763252736L, 114387);
          return -1;
        case 1: 
          localbsw.uHG = locala.xSv.readString();
          GMTrace.o(15352763252736L, 114387);
          return 0;
        }
        localbsw.tAZ = locala.cpI();
        GMTrace.o(15352763252736L, 114387);
        return 0;
      }
      GMTrace.o(15352763252736L, 114387);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */