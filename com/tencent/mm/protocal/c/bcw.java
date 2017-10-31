package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bcw
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public String mDo;
  
  public bcw()
  {
    GMTrace.i(4022773743616L, 29972);
    GMTrace.o(4022773743616L, 29972);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4022907961344L, 29973);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDo != null) {
        paramVarArgs.e(1, this.mDo);
      }
      paramVarArgs.fd(2, this.jXP);
      GMTrace.o(4022907961344L, 29973);
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
      GMTrace.o(4022907961344L, 29973);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(4022907961344L, 29973);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bcw localbcw = (bcw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4022907961344L, 29973);
          return -1;
        case 1: 
          localbcw.mDo = locala.xSv.readString();
          GMTrace.o(4022907961344L, 29973);
          return 0;
        }
        localbcw.jXP = locala.xSv.nm();
        GMTrace.o(4022907961344L, 29973);
        return 0;
      }
      GMTrace.o(4022907961344L, 29973);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */