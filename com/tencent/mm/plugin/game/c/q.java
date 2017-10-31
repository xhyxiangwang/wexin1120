package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class q
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String jWW;
  public String mCI;
  public String mDI;
  
  public q()
  {
    GMTrace.i(12648544468992L, 94239);
    GMTrace.o(12648544468992L, 94239);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12648678686720L, 94240);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mDI == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      if (this.mCI != null) {
        paramVarArgs.e(2, this.mCI);
      }
      if (this.fuw != null) {
        paramVarArgs.e(3, this.fuw);
      }
      if (this.mDI != null) {
        paramVarArgs.e(4, this.mDI);
      }
      GMTrace.o(12648678686720L, 94240);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWW == null) {
        break label492;
      }
    }
    label492:
    for (int i = b.a.a.b.b.a.f(1, this.jWW) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mCI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCI);
      }
      i = paramInt;
      if (this.fuw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fuw);
      }
      paramInt = i;
      if (this.mDI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDI);
      }
      GMTrace.o(12648678686720L, 94240);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.fuw == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.mDI == null) {
          throw new b("Not all required fields were included: Detail");
        }
        GMTrace.o(12648678686720L, 94240);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        q localq = (q)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12648678686720L, 94240);
          return -1;
        case 1: 
          localq.jWW = locala.xSv.readString();
          GMTrace.o(12648678686720L, 94240);
          return 0;
        case 2: 
          localq.mCI = locala.xSv.readString();
          GMTrace.o(12648678686720L, 94240);
          return 0;
        case 3: 
          localq.fuw = locala.xSv.readString();
          GMTrace.o(12648678686720L, 94240);
          return 0;
        }
        localq.mDI = locala.xSv.readString();
        GMTrace.o(12648678686720L, 94240);
        return 0;
      }
      GMTrace.o(12648678686720L, 94240);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */