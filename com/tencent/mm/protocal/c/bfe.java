package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bfe
  extends com.tencent.mm.bl.a
{
  public String koF;
  public String uxn;
  
  public bfe()
  {
    GMTrace.i(3858893897728L, 28751);
    GMTrace.o(3858893897728L, 28751);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3859028115456L, 28752);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uxn != null) {
        paramVarArgs.e(1, this.uxn);
      }
      if (this.koF != null) {
        paramVarArgs.e(2, this.koF);
      }
      GMTrace.o(3859028115456L, 28752);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uxn == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uxn) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.koF != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.koF);
      }
      GMTrace.o(3859028115456L, 28752);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3859028115456L, 28752);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bfe localbfe = (bfe)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3859028115456L, 28752);
          return -1;
        case 1: 
          localbfe.uxn = locala.xSv.readString();
          GMTrace.o(3859028115456L, 28752);
          return 0;
        }
        localbfe.koF = locala.xSv.readString();
        GMTrace.o(3859028115456L, 28752);
        return 0;
      }
      GMTrace.o(3859028115456L, 28752);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */