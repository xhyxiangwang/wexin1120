package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amk
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public String mDo;
  
  public amk()
  {
    GMTrace.i(3647500976128L, 27176);
    GMTrace.o(3647500976128L, 27176);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3647635193856L, 27177);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDo != null) {
        paramVarArgs.e(1, this.mDo);
      }
      paramVarArgs.fd(2, this.jXP);
      GMTrace.o(3647635193856L, 27177);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDo == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDo) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.jXP);
      GMTrace.o(3647635193856L, 27177);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3647635193856L, 27177);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amk localamk = (amk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3647635193856L, 27177);
          return -1;
        case 1: 
          localamk.mDo = locala.xSv.readString();
          GMTrace.o(3647635193856L, 27177);
          return 0;
        }
        localamk.jXP = locala.xSv.nm();
        GMTrace.o(3647635193856L, 27177);
        return 0;
      }
      GMTrace.o(3647635193856L, 27177);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */