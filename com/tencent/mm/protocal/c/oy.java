package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class oy
  extends com.tencent.mm.bl.a
{
  public String tKQ;
  public int tKR;
  
  public oy()
  {
    GMTrace.i(3800240750592L, 28314);
    GMTrace.o(3800240750592L, 28314);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3800374968320L, 28315);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tKQ != null) {
        paramVarArgs.e(1, this.tKQ);
      }
      paramVarArgs.fd(2, this.tKR);
      GMTrace.o(3800374968320L, 28315);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tKQ == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.tKQ) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.tKR);
      GMTrace.o(3800374968320L, 28315);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3800374968320L, 28315);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        oy localoy = (oy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3800374968320L, 28315);
          return -1;
        case 1: 
          localoy.tKQ = locala.xSv.readString();
          GMTrace.o(3800374968320L, 28315);
          return 0;
        }
        localoy.tKR = locala.xSv.nm();
        GMTrace.o(3800374968320L, 28315);
        return 0;
      }
      GMTrace.o(3800374968320L, 28315);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */