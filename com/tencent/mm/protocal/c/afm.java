package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class afm
  extends com.tencent.mm.bl.a
{
  public String mVA;
  public String tKT;
  public int tKU;
  
  public afm()
  {
    GMTrace.i(14997488926720L, 111740);
    GMTrace.o(14997488926720L, 111740);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14997623144448L, 111741);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tKT != null) {
        paramVarArgs.e(1, this.tKT);
      }
      paramVarArgs.fd(2, this.tKU);
      if (this.mVA != null) {
        paramVarArgs.e(3, this.mVA);
      }
      GMTrace.o(14997623144448L, 111741);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tKT == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.tKT) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.tKU);
      paramInt = i;
      if (this.mVA != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mVA);
      }
      GMTrace.o(14997623144448L, 111741);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(14997623144448L, 111741);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        afm localafm = (afm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14997623144448L, 111741);
          return -1;
        case 1: 
          localafm.tKT = locala.xSv.readString();
          GMTrace.o(14997623144448L, 111741);
          return 0;
        case 2: 
          localafm.tKU = locala.xSv.nm();
          GMTrace.o(14997623144448L, 111741);
          return 0;
        }
        localafm.mVA = locala.xSv.readString();
        GMTrace.o(14997623144448L, 111741);
        return 0;
      }
      GMTrace.o(14997623144448L, 111741);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */