package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsr
  extends com.tencent.mm.bl.a
{
  public String uHA;
  public String uHz;
  
  public bsr()
  {
    GMTrace.i(14306536062976L, 106592);
    GMTrace.o(14306536062976L, 106592);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14306670280704L, 106593);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHz != null) {
        paramVarArgs.e(1, this.uHz);
      }
      if (this.uHA != null) {
        paramVarArgs.e(2, this.uHA);
      }
      GMTrace.o(14306670280704L, 106593);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uHz == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.uHz) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uHA != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uHA);
      }
      GMTrace.o(14306670280704L, 106593);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(14306670280704L, 106593);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsr localbsr = (bsr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14306670280704L, 106593);
          return -1;
        case 1: 
          localbsr.uHz = locala.xSv.readString();
          GMTrace.o(14306670280704L, 106593);
          return 0;
        }
        localbsr.uHA = locala.xSv.readString();
        GMTrace.o(14306670280704L, 106593);
        return 0;
      }
      GMTrace.o(14306670280704L, 106593);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */