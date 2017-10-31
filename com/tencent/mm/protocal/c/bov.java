package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bov
  extends com.tencent.mm.bl.a
{
  public b uER;
  public b uEW;
  
  public bov()
  {
    GMTrace.i(3995795980288L, 29771);
    GMTrace.o(3995795980288L, 29771);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3995930198016L, 29772);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uER != null) {
        paramVarArgs.b(1, this.uER);
      }
      if (this.uEW != null) {
        paramVarArgs.b(2, this.uEW);
      }
      GMTrace.o(3995930198016L, 29772);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uER == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.uER) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uEW != null) {
        i = paramInt + b.a.a.a.a(2, this.uEW);
      }
      GMTrace.o(3995930198016L, 29772);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3995930198016L, 29772);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bov localbov = (bov)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3995930198016L, 29772);
          return -1;
        case 1: 
          localbov.uER = locala.cpI();
          GMTrace.o(3995930198016L, 29772);
          return 0;
        }
        localbov.uEW = locala.cpI();
        GMTrace.o(3995930198016L, 29772);
        return 0;
      }
      GMTrace.o(3995930198016L, 29772);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */