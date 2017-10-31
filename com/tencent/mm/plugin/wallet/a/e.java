package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class e
  extends com.tencent.mm.bl.a
{
  public String rFL;
  public String rFM;
  public String rFN;
  
  public e()
  {
    GMTrace.i(7697386700800L, 57350);
    GMTrace.o(7697386700800L, 57350);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7697520918528L, 57351);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.rFL != null) {
        paramVarArgs.e(1, this.rFL);
      }
      if (this.rFM != null) {
        paramVarArgs.e(2, this.rFM);
      }
      if (this.rFN != null) {
        paramVarArgs.e(3, this.rFN);
      }
      GMTrace.o(7697520918528L, 57351);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rFL == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.rFL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rFM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.rFM);
      }
      i = paramInt;
      if (this.rFN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.rFN);
      }
      GMTrace.o(7697520918528L, 57351);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(7697520918528L, 57351);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        e locale = (e)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(7697520918528L, 57351);
          return -1;
        case 1: 
          locale.rFL = locala.xSv.readString();
          GMTrace.o(7697520918528L, 57351);
          return 0;
        case 2: 
          locale.rFM = locala.xSv.readString();
          GMTrace.o(7697520918528L, 57351);
          return 0;
        }
        locale.rFN = locala.xSv.readString();
        GMTrace.o(7697520918528L, 57351);
        return 0;
      }
      GMTrace.o(7697520918528L, 57351);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */