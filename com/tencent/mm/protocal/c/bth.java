package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bth
  extends com.tencent.mm.bl.a
{
  public String mDo;
  public String mGI;
  
  public bth()
  {
    GMTrace.i(15344039100416L, 114322);
    GMTrace.o(15344039100416L, 114322);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344173318144L, 114323);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGI != null) {
        paramVarArgs.e(1, this.mGI);
      }
      if (this.mDo != null) {
        paramVarArgs.e(2, this.mDo);
      }
      GMTrace.o(15344173318144L, 114323);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mGI == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.mGI) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mDo != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDo);
      }
      GMTrace.o(15344173318144L, 114323);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(15344173318144L, 114323);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bth localbth = (bth)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15344173318144L, 114323);
          return -1;
        case 1: 
          localbth.mGI = locala.xSv.readString();
          GMTrace.o(15344173318144L, 114323);
          return 0;
        }
        localbth.mDo = locala.xSv.readString();
        GMTrace.o(15344173318144L, 114323);
        return 0;
      }
      GMTrace.o(15344173318144L, 114323);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */