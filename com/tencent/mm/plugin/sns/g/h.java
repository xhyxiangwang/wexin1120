package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;

public final class h
  extends com.tencent.mm.bl.a
{
  public String pwi;
  public int state;
  
  public h()
  {
    GMTrace.i(8865617805312L, 66054);
    GMTrace.o(8865617805312L, 66054);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8865752023040L, 66055);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.pwi != null) {
        paramVarArgs.e(1, this.pwi);
      }
      paramVarArgs.fd(2, this.state);
      GMTrace.o(8865752023040L, 66055);
      return 0;
    }
    if (paramInt == 1) {
      if (this.pwi == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.pwi) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.state);
      GMTrace.o(8865752023040L, 66055);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(8865752023040L, 66055);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        h localh = (h)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(8865752023040L, 66055);
          return -1;
        case 1: 
          localh.pwi = locala.xSv.readString();
          GMTrace.o(8865752023040L, 66055);
          return 0;
        }
        localh.state = locala.xSv.nm();
        GMTrace.o(8865752023040L, 66055);
        return 0;
      }
      GMTrace.o(8865752023040L, 66055);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */