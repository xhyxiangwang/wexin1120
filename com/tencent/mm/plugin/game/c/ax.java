package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ax
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCE;
  public String mDI;
  public String mFq;
  
  public ax()
  {
    GMTrace.i(12640759840768L, 94181);
    GMTrace.o(12640759840768L, 94181);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12640894058496L, 94182);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFq == null) {
        throw new b("Not all required fields were included: LogoURL");
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mDI == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.mCE == null) {
        throw new b("Not all required fields were included: WebURL");
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
      GMTrace.o(12640894058496L, 94182);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFq == null) {
        break label560;
      }
    }
    label560:
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
      GMTrace.o(12640894058496L, 94182);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mFq == null) {
          throw new b("Not all required fields were included: LogoURL");
        }
        if (this.fuw == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.mDI == null) {
          throw new b("Not all required fields were included: Detail");
        }
        if (this.mCE == null) {
          throw new b("Not all required fields were included: WebURL");
        }
        GMTrace.o(12640894058496L, 94182);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ax localax = (ax)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12640894058496L, 94182);
          return -1;
        case 1: 
          localax.mFq = locala.xSv.readString();
          GMTrace.o(12640894058496L, 94182);
          return 0;
        case 2: 
          localax.fuw = locala.xSv.readString();
          GMTrace.o(12640894058496L, 94182);
          return 0;
        case 3: 
          localax.mDI = locala.xSv.readString();
          GMTrace.o(12640894058496L, 94182);
          return 0;
        }
        localax.mCE = locala.xSv.readString();
        GMTrace.o(12640894058496L, 94182);
        return 0;
      }
      GMTrace.o(12640894058496L, 94182);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */