package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bbs
  extends com.tencent.mm.bl.a
{
  public String fMv;
  public int kqG;
  public int tGt;
  public long utX;
  
  public bbs()
  {
    GMTrace.i(3758767472640L, 28005);
    GMTrace.o(3758767472640L, 28005);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3758901690368L, 28006);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv != null) {
        paramVarArgs.e(1, this.fMv);
      }
      paramVarArgs.fd(2, this.kqG);
      paramVarArgs.fd(3, this.tGt);
      paramVarArgs.R(4, this.utX);
      GMTrace.o(3758901690368L, 28006);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fMv == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.fMv) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.kqG);
      int j = b.a.a.a.fa(3, this.tGt);
      int k = b.a.a.a.Q(4, this.utX);
      GMTrace.o(3758901690368L, 28006);
      return paramInt + i + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3758901690368L, 28006);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bbs localbbs = (bbs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3758901690368L, 28006);
          return -1;
        case 1: 
          localbbs.fMv = locala.xSv.readString();
          GMTrace.o(3758901690368L, 28006);
          return 0;
        case 2: 
          localbbs.kqG = locala.xSv.nm();
          GMTrace.o(3758901690368L, 28006);
          return 0;
        case 3: 
          localbbs.tGt = locala.xSv.nm();
          GMTrace.o(3758901690368L, 28006);
          return 0;
        }
        localbbs.utX = locala.xSv.nn();
        GMTrace.o(3758901690368L, 28006);
        return 0;
      }
      GMTrace.o(3758901690368L, 28006);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */