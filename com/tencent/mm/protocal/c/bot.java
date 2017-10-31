package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class bot
  extends com.tencent.mm.bl.a
{
  public b uEV;
  public b uEW;
  
  public bot()
  {
    GMTrace.i(3823863070720L, 28490);
    GMTrace.o(3823863070720L, 28490);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3823997288448L, 28491);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEV != null) {
        paramVarArgs.b(1, this.uEV);
      }
      if (this.uEW != null) {
        paramVarArgs.b(2, this.uEW);
      }
      GMTrace.o(3823997288448L, 28491);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uEV == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.uEV) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uEW != null) {
        i = paramInt + b.a.a.a.a(2, this.uEW);
      }
      GMTrace.o(3823997288448L, 28491);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3823997288448L, 28491);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bot localbot = (bot)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3823997288448L, 28491);
          return -1;
        case 1: 
          localbot.uEV = locala.cpI();
          GMTrace.o(3823997288448L, 28491);
          return 0;
        }
        localbot.uEW = locala.cpI();
        GMTrace.o(3823997288448L, 28491);
        return 0;
      }
      GMTrace.o(3823997288448L, 28491);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */