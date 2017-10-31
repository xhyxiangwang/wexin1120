package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bcd
  extends com.tencent.mm.bl.a
{
  public String uuj;
  public String uuk;
  public String uul;
  
  public bcd()
  {
    GMTrace.i(3745077264384L, 27903);
    GMTrace.o(3745077264384L, 27903);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3745211482112L, 27904);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uuj != null) {
        paramVarArgs.e(1, this.uuj);
      }
      if (this.uuk != null) {
        paramVarArgs.e(2, this.uuk);
      }
      if (this.uul != null) {
        paramVarArgs.e(3, this.uul);
      }
      GMTrace.o(3745211482112L, 27904);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uuj == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.uuj) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uuk != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uuk);
      }
      i = paramInt;
      if (this.uul != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uul);
      }
      GMTrace.o(3745211482112L, 27904);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3745211482112L, 27904);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bcd localbcd = (bcd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3745211482112L, 27904);
          return -1;
        case 1: 
          localbcd.uuj = locala.xSv.readString();
          GMTrace.o(3745211482112L, 27904);
          return 0;
        case 2: 
          localbcd.uuk = locala.xSv.readString();
          GMTrace.o(3745211482112L, 27904);
          return 0;
        }
        localbcd.uul = locala.xSv.readString();
        GMTrace.o(3745211482112L, 27904);
        return 0;
      }
      GMTrace.o(3745211482112L, 27904);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */