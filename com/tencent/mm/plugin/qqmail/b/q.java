package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class q
  extends com.tencent.mm.bl.a
{
  public String oET;
  
  public q()
  {
    GMTrace.i(5477425479680L, 40810);
    GMTrace.o(5477425479680L, 40810);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5477559697408L, 40811);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.oET == null) {
        throw new b("Not all required fields were included: subject");
      }
      if (this.oET != null) {
        paramVarArgs.e(1, this.oET);
      }
      GMTrace.o(5477559697408L, 40811);
      return 0;
    }
    if (paramInt == 1) {
      if (this.oET == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = b.a.a.b.b.a.f(1, this.oET) + 0;; paramInt = 0)
    {
      GMTrace.o(5477559697408L, 40811);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.oET == null) {
          throw new b("Not all required fields were included: subject");
        }
        GMTrace.o(5477559697408L, 40811);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        q localq = (q)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(5477559697408L, 40811);
          return -1;
        }
        localq.oET = locala.xSv.readString();
        GMTrace.o(5477559697408L, 40811);
        return 0;
      }
      GMTrace.o(5477559697408L, 40811);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */