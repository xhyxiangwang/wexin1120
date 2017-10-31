package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bru
  extends com.tencent.mm.bl.a
{
  public String fwU;
  public int tCf;
  public int uGS;
  public String url;
  
  public bru()
  {
    GMTrace.i(17826530197504L, 132818);
    GMTrace.o(17826530197504L, 132818);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17826664415232L, 132819);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uGS);
      paramVarArgs.fd(2, this.tCf);
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      if (this.fwU != null) {
        paramVarArgs.e(4, this.fwU);
      }
      GMTrace.o(17826664415232L, 132819);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.uGS) + 0 + b.a.a.a.fa(2, this.tCf);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.url);
      }
      i = paramInt;
      if (this.fwU != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.fwU);
      }
      GMTrace.o(17826664415232L, 132819);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17826664415232L, 132819);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bru localbru = (bru)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17826664415232L, 132819);
        return -1;
      case 1: 
        localbru.uGS = locala.xSv.nm();
        GMTrace.o(17826664415232L, 132819);
        return 0;
      case 2: 
        localbru.tCf = locala.xSv.nm();
        GMTrace.o(17826664415232L, 132819);
        return 0;
      case 3: 
        localbru.url = locala.xSv.readString();
        GMTrace.o(17826664415232L, 132819);
        return 0;
      }
      localbru.fwU = locala.xSv.readString();
      GMTrace.o(17826664415232L, 132819);
      return 0;
    }
    GMTrace.o(17826664415232L, 132819);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */