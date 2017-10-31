package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class i
  extends com.tencent.mm.bl.a
{
  public String mDl;
  public String mDm;
  public String mDn;
  public String mDo;
  
  public i()
  {
    GMTrace.i(12651228823552L, 94259);
    GMTrace.o(12651228823552L, 94259);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651363041280L, 94260);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDl == null) {
        throw new b("Not all required fields were included: Message");
      }
      if (this.mDm == null) {
        throw new b("Not all required fields were included: GotoBtn");
      }
      if (this.mDn == null) {
        throw new b("Not all required fields were included: CancelBtn");
      }
      if (this.mDo == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.mDl != null) {
        paramVarArgs.e(1, this.mDl);
      }
      if (this.mDm != null) {
        paramVarArgs.e(2, this.mDm);
      }
      if (this.mDn != null) {
        paramVarArgs.e(3, this.mDn);
      }
      if (this.mDo != null) {
        paramVarArgs.e(4, this.mDo);
      }
      GMTrace.o(12651363041280L, 94260);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mDl == null) {
        break label560;
      }
    }
    label560:
    for (int i = b.a.a.b.b.a.f(1, this.mDl) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mDm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDm);
      }
      i = paramInt;
      if (this.mDn != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDn);
      }
      paramInt = i;
      if (this.mDo != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDo);
      }
      GMTrace.o(12651363041280L, 94260);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mDl == null) {
          throw new b("Not all required fields were included: Message");
        }
        if (this.mDm == null) {
          throw new b("Not all required fields were included: GotoBtn");
        }
        if (this.mDn == null) {
          throw new b("Not all required fields were included: CancelBtn");
        }
        if (this.mDo == null) {
          throw new b("Not all required fields were included: Url");
        }
        GMTrace.o(12651363041280L, 94260);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        i locali = (i)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12651363041280L, 94260);
          return -1;
        case 1: 
          locali.mDl = locala.xSv.readString();
          GMTrace.o(12651363041280L, 94260);
          return 0;
        case 2: 
          locali.mDm = locala.xSv.readString();
          GMTrace.o(12651363041280L, 94260);
          return 0;
        case 3: 
          locali.mDn = locala.xSv.readString();
          GMTrace.o(12651363041280L, 94260);
          return 0;
        }
        locali.mDo = locala.xSv.readString();
        GMTrace.o(12651363041280L, 94260);
        return 0;
      }
      GMTrace.o(12651363041280L, 94260);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */