package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bos
  extends com.tencent.mm.bl.a
{
  public b uER;
  public b uES;
  public b uET;
  public b uEU;
  
  public bos()
  {
    GMTrace.i(3835808448512L, 28579);
    GMTrace.o(3835808448512L, 28579);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3835942666240L, 28580);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uER != null) {
        paramVarArgs.b(1, this.uER);
      }
      if (this.uES != null) {
        paramVarArgs.b(2, this.uES);
      }
      if (this.uET != null) {
        paramVarArgs.b(3, this.uET);
      }
      if (this.uEU != null) {
        paramVarArgs.b(4, this.uEU);
      }
      GMTrace.o(3835942666240L, 28580);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uER == null) {
        break label422;
      }
    }
    label422:
    for (int i = b.a.a.a.a(1, this.uER) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uES != null) {
        paramInt = i + b.a.a.a.a(2, this.uES);
      }
      i = paramInt;
      if (this.uET != null) {
        i = paramInt + b.a.a.a.a(3, this.uET);
      }
      paramInt = i;
      if (this.uEU != null) {
        paramInt = i + b.a.a.a.a(4, this.uEU);
      }
      GMTrace.o(3835942666240L, 28580);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3835942666240L, 28580);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bos localbos = (bos)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3835942666240L, 28580);
          return -1;
        case 1: 
          localbos.uER = locala.cpI();
          GMTrace.o(3835942666240L, 28580);
          return 0;
        case 2: 
          localbos.uES = locala.cpI();
          GMTrace.o(3835942666240L, 28580);
          return 0;
        case 3: 
          localbos.uET = locala.cpI();
          GMTrace.o(3835942666240L, 28580);
          return 0;
        }
        localbos.uEU = locala.cpI();
        GMTrace.o(3835942666240L, 28580);
        return 0;
      }
      GMTrace.o(3835942666240L, 28580);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */