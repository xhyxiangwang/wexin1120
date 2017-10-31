package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class an
  extends com.tencent.mm.bl.a
{
  public String kor;
  public String kos;
  
  public an()
  {
    GMTrace.i(16867410313216L, 125672);
    GMTrace.o(16867410313216L, 125672);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16867544530944L, 125673);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kor != null) {
        paramVarArgs.e(1, this.kor);
      }
      if (this.kos != null) {
        paramVarArgs.e(2, this.kos);
      }
      GMTrace.o(16867544530944L, 125673);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kor == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.kor) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.kos != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.kos);
      }
      GMTrace.o(16867544530944L, 125673);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(16867544530944L, 125673);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        an localan = (an)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16867544530944L, 125673);
          return -1;
        case 1: 
          localan.kor = locala.xSv.readString();
          GMTrace.o(16867544530944L, 125673);
          return 0;
        }
        localan.kos = locala.xSv.readString();
        GMTrace.o(16867544530944L, 125673);
        return 0;
      }
      GMTrace.o(16867544530944L, 125673);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */