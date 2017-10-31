package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class r
  extends com.tencent.mm.bl.a
{
  public String jWW;
  public String mDI;
  
  public r()
  {
    GMTrace.i(12646128549888L, 94221);
    GMTrace.o(12646128549888L, 94221);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12646262767616L, 94222);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWW == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.mDI == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      if (this.mDI != null) {
        paramVarArgs.e(2, this.mDI);
      }
      GMTrace.o(12646262767616L, 94222);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWW == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWW) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mDI != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDI);
      }
      GMTrace.o(12646262767616L, 94222);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jWW == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.mDI == null) {
          throw new b("Not all required fields were included: Detail");
        }
        GMTrace.o(12646262767616L, 94222);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        r localr = (r)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12646262767616L, 94222);
          return -1;
        case 1: 
          localr.jWW = locala.xSv.readString();
          GMTrace.o(12646262767616L, 94222);
          return 0;
        }
        localr.mDI = locala.xSv.readString();
        GMTrace.o(12646262767616L, 94222);
        return 0;
      }
      GMTrace.o(12646262767616L, 94222);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */