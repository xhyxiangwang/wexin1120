package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ae
  extends com.tencent.mm.bl.a
{
  public String mDg;
  
  public ae()
  {
    GMTrace.i(12646933856256L, 94227);
    GMTrace.o(12646933856256L, 94227);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12647068073984L, 94228);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDg != null) {
        paramVarArgs.e(1, this.mDg);
      }
      GMTrace.o(12647068073984L, 94228);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDg == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDg) + 0;; paramInt = 0)
    {
      GMTrace.o(12647068073984L, 94228);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12647068073984L, 94228);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ae localae = (ae)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12647068073984L, 94228);
          return -1;
        }
        localae.mDg = locala.xSv.readString();
        GMTrace.o(12647068073984L, 94228);
        return 0;
      }
      GMTrace.o(12647068073984L, 94228);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */