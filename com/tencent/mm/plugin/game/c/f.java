package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class f
  extends com.tencent.mm.bl.a
{
  public String mDe;
  
  public f()
  {
    GMTrace.i(16562333417472L, 123399);
    GMTrace.o(16562333417472L, 123399);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16562467635200L, 123400);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDe == null) {
        throw new b("Not all required fields were included: AppStoreUrl");
      }
      if (this.mDe != null) {
        paramVarArgs.e(1, this.mDe);
      }
      GMTrace.o(16562467635200L, 123400);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDe == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDe) + 0;; paramInt = 0)
    {
      GMTrace.o(16562467635200L, 123400);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mDe == null) {
          throw new b("Not all required fields were included: AppStoreUrl");
        }
        GMTrace.o(16562467635200L, 123400);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        f localf = (f)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16562467635200L, 123400);
          return -1;
        }
        localf.mDe = locala.xSv.readString();
        GMTrace.o(16562467635200L, 123400);
        return 0;
      }
      GMTrace.o(16562467635200L, 123400);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */