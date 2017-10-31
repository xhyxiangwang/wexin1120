package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bpj
  extends com.tencent.mm.bl.a
{
  public String nat;
  public String uFu;
  
  public bpj()
  {
    GMTrace.i(3801851363328L, 28326);
    GMTrace.o(3801851363328L, 28326);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3801985581056L, 28327);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nat != null) {
        paramVarArgs.e(1, this.nat);
      }
      if (this.uFu != null) {
        paramVarArgs.e(2, this.uFu);
      }
      GMTrace.o(3801985581056L, 28327);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nat == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.nat) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uFu != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uFu);
      }
      GMTrace.o(3801985581056L, 28327);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3801985581056L, 28327);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bpj localbpj = (bpj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3801985581056L, 28327);
          return -1;
        case 1: 
          localbpj.nat = locala.xSv.readString();
          GMTrace.o(3801985581056L, 28327);
          return 0;
        }
        localbpj.uFu = locala.xSv.readString();
        GMTrace.o(3801985581056L, 28327);
        return 0;
      }
      GMTrace.o(3801985581056L, 28327);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */