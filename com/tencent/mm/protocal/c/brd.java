package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brd
  extends com.tencent.mm.bl.a
{
  public int tLr;
  public com.tencent.mm.bl.b twT;
  public String uFL;
  public boolean uGn;
  public boolean uGo;
  
  public brd()
  {
    GMTrace.i(3731923927040L, 27805);
    GMTrace.o(3731923927040L, 27805);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3732058144768L, 27806);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      paramVarArgs.fd(2, this.tLr);
      if (this.twT != null) {
        paramVarArgs.b(3, this.twT);
      }
      paramVarArgs.af(4, this.uGn);
      paramVarArgs.af(5, this.uGo);
      GMTrace.o(3732058144768L, 27806);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label473;
      }
    }
    label473:
    for (paramInt = b.a.a.b.b.a.f(1, this.uFL) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.tLr);
      paramInt = i;
      if (this.twT != null) {
        paramInt = i + b.a.a.a.a(3, this.twT);
      }
      i = b.a.a.b.b.a.cK(4);
      int j = b.a.a.b.b.a.cK(5);
      GMTrace.o(3732058144768L, 27806);
      return paramInt + (i + 1) + (j + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFL == null) {
          throw new b.a.a.b("Not all required fields were included: Talker");
        }
        GMTrace.o(3732058144768L, 27806);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brd localbrd = (brd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3732058144768L, 27806);
          return -1;
        case 1: 
          localbrd.uFL = locala.xSv.readString();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        case 2: 
          localbrd.tLr = locala.xSv.nm();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        case 3: 
          localbrd.twT = locala.cpI();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        case 4: 
          localbrd.uGn = locala.cpH();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        }
        localbrd.uGo = locala.cpH();
        GMTrace.o(3732058144768L, 27806);
        return 0;
      }
      GMTrace.o(3732058144768L, 27806);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */