package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ajb
  extends com.tencent.mm.bl.a
{
  public String uer;
  public String ues;
  
  public ajb()
  {
    GMTrace.i(3979018764288L, 29646);
    GMTrace.o(3979018764288L, 29646);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3979152982016L, 29647);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uer != null) {
        paramVarArgs.e(1, this.uer);
      }
      if (this.ues != null) {
        paramVarArgs.e(2, this.ues);
      }
      GMTrace.o(3979152982016L, 29647);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uer == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uer) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ues != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ues);
      }
      GMTrace.o(3979152982016L, 29647);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3979152982016L, 29647);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ajb localajb = (ajb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3979152982016L, 29647);
          return -1;
        case 1: 
          localajb.uer = locala.xSv.readString();
          GMTrace.o(3979152982016L, 29647);
          return 0;
        }
        localajb.ues = locala.xSv.readString();
        GMTrace.o(3979152982016L, 29647);
        return 0;
      }
      GMTrace.o(3979152982016L, 29647);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ajb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */