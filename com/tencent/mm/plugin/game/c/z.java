package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class z
  extends com.tencent.mm.bl.a
{
  public int mDO;
  public String mDg;
  
  public z()
  {
    GMTrace.i(16561259675648L, 123391);
    GMTrace.o(16561259675648L, 123391);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16561393893376L, 123392);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.mDO);
      if (this.mDg != null) {
        paramVarArgs.e(2, this.mDg);
      }
      GMTrace.o(16561393893376L, 123392);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mDO) + 0;
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDg);
      }
      GMTrace.o(16561393893376L, 123392);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16561393893376L, 123392);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      z localz = (z)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16561393893376L, 123392);
        return -1;
      case 1: 
        localz.mDO = locala.xSv.nm();
        GMTrace.o(16561393893376L, 123392);
        return 0;
      }
      localz.mDg = locala.xSv.readString();
      GMTrace.o(16561393893376L, 123392);
      return 0;
    }
    GMTrace.o(16561393893376L, 123392);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */