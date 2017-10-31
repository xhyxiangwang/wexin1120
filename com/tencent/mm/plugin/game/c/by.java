package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class by
  extends com.tencent.mm.bl.a
{
  public String jWW;
  public int mGh;
  public long mGi;
  public String mGj;
  public boolean mGk;
  public int mGl;
  public String mGm;
  
  public by()
  {
    GMTrace.i(12638075486208L, 94161);
    GMTrace.o(12638075486208L, 94161);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12638209703936L, 94162);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWW == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.jWW != null) {
        paramVarArgs.e(1, this.jWW);
      }
      paramVarArgs.fd(2, this.mGh);
      paramVarArgs.R(3, this.mGi);
      if (this.mGj != null) {
        paramVarArgs.e(4, this.mGj);
      }
      paramVarArgs.af(5, this.mGk);
      paramVarArgs.fd(6, this.mGl);
      if (this.mGm != null) {
        paramVarArgs.e(7, this.mGm);
      }
      GMTrace.o(12638209703936L, 94162);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jWW == null) {
        break label578;
      }
    }
    label578:
    for (paramInt = b.a.a.b.b.a.f(1, this.jWW) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.mGh) + b.a.a.a.Q(3, this.mGi);
      paramInt = i;
      if (this.mGj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mGj);
      }
      i = paramInt + (b.a.a.b.b.a.cK(5) + 1) + b.a.a.a.fa(6, this.mGl);
      paramInt = i;
      if (this.mGm != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mGm);
      }
      GMTrace.o(12638209703936L, 94162);
      return paramInt;
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
        GMTrace.o(12638209703936L, 94162);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        by localby = (by)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12638209703936L, 94162);
          return -1;
        case 1: 
          localby.jWW = locala.xSv.readString();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 2: 
          localby.mGh = locala.xSv.nm();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 3: 
          localby.mGi = locala.xSv.nn();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 4: 
          localby.mGj = locala.xSv.readString();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 5: 
          localby.mGk = locala.cpH();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 6: 
          localby.mGl = locala.xSv.nm();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        }
        localby.mGm = locala.xSv.readString();
        GMTrace.o(12638209703936L, 94162);
        return 0;
      }
      GMTrace.o(12638209703936L, 94162);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */