package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bgn
  extends com.tencent.mm.bl.a
{
  public String hbA;
  public String tag;
  
  public bgn()
  {
    GMTrace.i(3708033171456L, 27627);
    GMTrace.o(3708033171456L, 27627);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3708167389184L, 27628);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tag != null) {
        paramVarArgs.e(1, this.tag);
      }
      if (this.hbA != null) {
        paramVarArgs.e(2, this.hbA);
      }
      GMTrace.o(3708167389184L, 27628);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tag == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tag) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbA != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.hbA);
      }
      GMTrace.o(3708167389184L, 27628);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3708167389184L, 27628);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bgn localbgn = (bgn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3708167389184L, 27628);
          return -1;
        case 1: 
          localbgn.tag = locala.xSv.readString();
          GMTrace.o(3708167389184L, 27628);
          return 0;
        }
        localbgn.hbA = locala.xSv.readString();
        GMTrace.o(3708167389184L, 27628);
        return 0;
      }
      GMTrace.o(3708167389184L, 27628);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */