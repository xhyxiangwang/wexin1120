package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdu
  extends com.tencent.mm.bl.a
{
  public int qAx;
  public int qAy;
  public String twj;
  public String twk;
  public String twl;
  
  public bdu()
  {
    GMTrace.i(3639179476992L, 27114);
    GMTrace.o(3639179476992L, 27114);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3639313694720L, 27115);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.twj != null) {
        paramVarArgs.e(1, this.twj);
      }
      if (this.twk != null) {
        paramVarArgs.e(2, this.twk);
      }
      if (this.twl != null) {
        paramVarArgs.e(3, this.twl);
      }
      paramVarArgs.fd(4, this.qAx);
      paramVarArgs.fd(5, this.qAy);
      GMTrace.o(3639313694720L, 27115);
      return 0;
    }
    if (paramInt == 1) {
      if (this.twj == null) {
        break label470;
      }
    }
    label470:
    for (int i = b.a.a.b.b.a.f(1, this.twj) + 0;; i = 0)
    {
      paramInt = i;
      if (this.twk != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.twk);
      }
      i = paramInt;
      if (this.twl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.twl);
      }
      paramInt = b.a.a.a.fa(4, this.qAx);
      int j = b.a.a.a.fa(5, this.qAy);
      GMTrace.o(3639313694720L, 27115);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3639313694720L, 27115);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdu localbdu = (bdu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3639313694720L, 27115);
          return -1;
        case 1: 
          localbdu.twj = locala.xSv.readString();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        case 2: 
          localbdu.twk = locala.xSv.readString();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        case 3: 
          localbdu.twl = locala.xSv.readString();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        case 4: 
          localbdu.qAx = locala.xSv.nm();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        }
        localbdu.qAy = locala.xSv.nm();
        GMTrace.o(3639313694720L, 27115);
        return 0;
      }
      GMTrace.o(3639313694720L, 27115);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */