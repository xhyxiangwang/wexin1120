package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class n
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCE;
  
  public n()
  {
    GMTrace.i(12655523790848L, 94291);
    GMTrace.o(12655523790848L, 94291);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12655658008576L, 94292);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mCE == null) {
        throw new b("Not all required fields were included: WebURL");
      }
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mCE != null) {
        paramVarArgs.e(2, this.mCE);
      }
      GMTrace.o(12655658008576L, 94292);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mCE != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mCE);
      }
      GMTrace.o(12655658008576L, 94292);
      return i;
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
        if (this.mCE == null) {
          throw new b("Not all required fields were included: WebURL");
        }
        GMTrace.o(12655658008576L, 94292);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12655658008576L, 94292);
          return -1;
        case 1: 
          localn.fuw = locala.xSv.readString();
          GMTrace.o(12655658008576L, 94292);
          return 0;
        }
        localn.mCE = locala.xSv.readString();
        GMTrace.o(12655658008576L, 94292);
        return 0;
      }
      GMTrace.o(12655658008576L, 94292);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */