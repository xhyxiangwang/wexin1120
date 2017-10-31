package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cw
  extends com.tencent.mm.bl.a
{
  public long two;
  public int twp;
  public int twq;
  public int twr;
  public int tws;
  public int twt;
  public int twu;
  public String twv;
  
  public cw()
  {
    GMTrace.i(3962107330560L, 29520);
    GMTrace.o(3962107330560L, 29520);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3962241548288L, 29521);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.two);
      paramVarArgs.fd(2, this.twp);
      paramVarArgs.fd(3, this.twq);
      paramVarArgs.fd(4, this.twr);
      paramVarArgs.fd(5, this.tws);
      paramVarArgs.fd(6, this.twt);
      paramVarArgs.fd(7, this.twu);
      if (this.twv != null) {
        paramVarArgs.e(8, this.twv);
      }
      GMTrace.o(3962241548288L, 29521);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.Q(1, this.two) + 0 + b.a.a.a.fa(2, this.twp) + b.a.a.a.fa(3, this.twq) + b.a.a.a.fa(4, this.twr) + b.a.a.a.fa(5, this.tws) + b.a.a.a.fa(6, this.twt) + b.a.a.a.fa(7, this.twu);
      paramInt = i;
      if (this.twv != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.twv);
      }
      GMTrace.o(3962241548288L, 29521);
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
      GMTrace.o(3962241548288L, 29521);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cw localcw = (cw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3962241548288L, 29521);
        return -1;
      case 1: 
        localcw.two = locala.xSv.nn();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 2: 
        localcw.twp = locala.xSv.nm();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 3: 
        localcw.twq = locala.xSv.nm();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 4: 
        localcw.twr = locala.xSv.nm();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 5: 
        localcw.tws = locala.xSv.nm();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 6: 
        localcw.twt = locala.xSv.nm();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 7: 
        localcw.twu = locala.xSv.nm();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      }
      localcw.twv = locala.xSv.readString();
      GMTrace.o(3962241548288L, 29521);
      return 0;
    }
    GMTrace.o(3962241548288L, 29521);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */