package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brf
  extends com.tencent.mm.bl.a
{
  public String jYc;
  public com.tencent.mm.bl.b uFD;
  public String uFL;
  
  public brf()
  {
    GMTrace.i(3855672672256L, 28727);
    GMTrace.o(3855672672256L, 28727);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3855806889984L, 28728);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.jYc == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      if (this.jYc != null) {
        paramVarArgs.e(2, this.jYc);
      }
      if (this.uFD != null) {
        paramVarArgs.b(3, this.uFD);
      }
      GMTrace.o(3855806889984L, 28728);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label435;
      }
    }
    label435:
    for (int i = b.a.a.b.b.a.f(1, this.uFL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jYc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jYc);
      }
      i = paramInt;
      if (this.uFD != null) {
        i = paramInt + b.a.a.a.a(3, this.uFD);
      }
      GMTrace.o(3855806889984L, 28728);
      return i;
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
        if (this.jYc == null) {
          throw new b.a.a.b("Not all required fields were included: NickName");
        }
        GMTrace.o(3855806889984L, 28728);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brf localbrf = (brf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3855806889984L, 28728);
          return -1;
        case 1: 
          localbrf.uFL = locala.xSv.readString();
          GMTrace.o(3855806889984L, 28728);
          return 0;
        case 2: 
          localbrf.jYc = locala.xSv.readString();
          GMTrace.o(3855806889984L, 28728);
          return 0;
        }
        localbrf.uFD = locala.cpI();
        GMTrace.o(3855806889984L, 28728);
        return 0;
      }
      GMTrace.o(3855806889984L, 28728);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/brf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */