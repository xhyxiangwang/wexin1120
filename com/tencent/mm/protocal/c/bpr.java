package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bpr
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public String tLN;
  
  public bpr()
  {
    GMTrace.i(3715817799680L, 27685);
    GMTrace.o(3715817799680L, 27685);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3715952017408L, 27686);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tLN == null) {
        throw new b("Not all required fields were included: MD5");
      }
      paramVarArgs.fd(1, this.jXP);
      if (this.tLN != null) {
        paramVarArgs.e(2, this.tLN);
      }
      GMTrace.o(3715952017408L, 27686);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.jXP) + 0;
      paramInt = i;
      if (this.tLN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tLN);
      }
      GMTrace.o(3715952017408L, 27686);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.tLN == null) {
        throw new b("Not all required fields were included: MD5");
      }
      GMTrace.o(3715952017408L, 27686);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpr localbpr = (bpr)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3715952017408L, 27686);
        return -1;
      case 1: 
        localbpr.jXP = locala.xSv.nm();
        GMTrace.o(3715952017408L, 27686);
        return 0;
      }
      localbpr.tLN = locala.xSv.readString();
      GMTrace.o(3715952017408L, 27686);
      return 0;
    }
    GMTrace.o(3715952017408L, 27686);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */