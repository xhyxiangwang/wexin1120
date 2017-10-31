package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class boi
  extends com.tencent.mm.bl.a
{
  public String huS;
  public String uEM;
  public int uEN;
  
  public boi()
  {
    GMTrace.i(14998562668544L, 111748);
    GMTrace.o(14998562668544L, 111748);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14998696886272L, 111749);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEM != null) {
        paramVarArgs.e(1, this.uEM);
      }
      if (this.huS != null) {
        paramVarArgs.e(2, this.huS);
      }
      paramVarArgs.fd(3, this.uEN);
      GMTrace.o(14998696886272L, 111749);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uEM == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.uEM) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.huS != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.huS);
      }
      paramInt = b.a.a.a.fa(3, this.uEN);
      GMTrace.o(14998696886272L, 111749);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(14998696886272L, 111749);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        boi localboi = (boi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14998696886272L, 111749);
          return -1;
        case 1: 
          localboi.uEM = locala.xSv.readString();
          GMTrace.o(14998696886272L, 111749);
          return 0;
        case 2: 
          localboi.huS = locala.xSv.readString();
          GMTrace.o(14998696886272L, 111749);
          return 0;
        }
        localboi.uEN = locala.xSv.nm();
        GMTrace.o(14998696886272L, 111749);
        return 0;
      }
      GMTrace.o(14998696886272L, 111749);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/boi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */