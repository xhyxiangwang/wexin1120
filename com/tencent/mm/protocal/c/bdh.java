package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdh
  extends com.tencent.mm.bl.a
{
  public String fxT;
  public String nsQ;
  
  public bdh()
  {
    GMTrace.i(3948685557760L, 29420);
    GMTrace.o(3948685557760L, 29420);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3948819775488L, 29421);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nsQ != null) {
        paramVarArgs.e(1, this.nsQ);
      }
      if (this.fxT != null) {
        paramVarArgs.e(2, this.fxT);
      }
      GMTrace.o(3948819775488L, 29421);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nsQ == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.nsQ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.fxT != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fxT);
      }
      GMTrace.o(3948819775488L, 29421);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3948819775488L, 29421);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdh localbdh = (bdh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3948819775488L, 29421);
          return -1;
        case 1: 
          localbdh.nsQ = locala.xSv.readString();
          GMTrace.o(3948819775488L, 29421);
          return 0;
        }
        localbdh.fxT = locala.xSv.readString();
        GMTrace.o(3948819775488L, 29421);
        return 0;
      }
      GMTrace.o(3948819775488L, 29421);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */