package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class p
  extends com.tencent.mm.bl.a
{
  public String jYc;
  public String mDH;
  
  public p()
  {
    GMTrace.i(12656060661760L, 94295);
    GMTrace.o(12656060661760L, 94295);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12656194879488L, 94296);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDH != null) {
        paramVarArgs.e(1, this.mDH);
      }
      if (this.jYc != null) {
        paramVarArgs.e(3, this.jYc);
      }
      GMTrace.o(12656194879488L, 94296);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDH == null) {
        break label302;
      }
    }
    label302:
    for (paramInt = b.a.a.b.b.a.f(1, this.mDH) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jYc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jYc);
      }
      GMTrace.o(12656194879488L, 94296);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12656194879488L, 94296);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        p localp = (p)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 2: 
        default: 
          GMTrace.o(12656194879488L, 94296);
          return -1;
        case 1: 
          localp.mDH = locala.xSv.readString();
          GMTrace.o(12656194879488L, 94296);
          return 0;
        }
        localp.jYc = locala.xSv.readString();
        GMTrace.o(12656194879488L, 94296);
        return 0;
      }
      GMTrace.o(12656194879488L, 94296);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */