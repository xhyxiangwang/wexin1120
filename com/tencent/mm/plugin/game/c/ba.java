package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ba
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCE;
  public String mDI;
  public String mFq;
  public String mFu;
  
  public ba()
  {
    GMTrace.i(12642638888960L, 94195);
    GMTrace.o(12642638888960L, 94195);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12642773106688L, 94196);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mFq != null) {
        paramVarArgs.e(1, this.mFq);
      }
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      if (this.mDI != null) {
        paramVarArgs.e(3, this.mDI);
      }
      if (this.mCE != null) {
        paramVarArgs.e(4, this.mCE);
      }
      if (this.mFu != null) {
        paramVarArgs.e(5, this.mFu);
      }
      GMTrace.o(12642773106688L, 94196);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFq == null) {
        break label523;
      }
    }
    label523:
    for (int i = b.a.a.b.b.a.f(1, this.mFq) + 0;; i = 0)
    {
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = paramInt;
      if (this.mDI != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDI);
      }
      paramInt = i;
      if (this.mCE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCE);
      }
      i = paramInt;
      if (this.mFu != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mFu);
      }
      GMTrace.o(12642773106688L, 94196);
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
        GMTrace.o(12642773106688L, 94196);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ba localba = (ba)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12642773106688L, 94196);
          return -1;
        case 1: 
          localba.mFq = locala.xSv.readString();
          GMTrace.o(12642773106688L, 94196);
          return 0;
        case 2: 
          localba.fuw = locala.xSv.readString();
          GMTrace.o(12642773106688L, 94196);
          return 0;
        case 3: 
          localba.mDI = locala.xSv.readString();
          GMTrace.o(12642773106688L, 94196);
          return 0;
        case 4: 
          localba.mCE = locala.xSv.readString();
          GMTrace.o(12642773106688L, 94196);
          return 0;
        }
        localba.mFu = locala.xSv.readString();
        GMTrace.o(12642773106688L, 94196);
        return 0;
      }
      GMTrace.o(12642773106688L, 94196);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */