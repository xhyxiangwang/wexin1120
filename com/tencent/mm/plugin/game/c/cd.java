package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class cd
  extends com.tencent.mm.bl.a
{
  public String mCJ;
  public int mFc;
  
  public cd()
  {
    GMTrace.i(12639954534400L, 94175);
    GMTrace.o(12639954534400L, 94175);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12640088752128L, 94176);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      paramVarArgs.fd(1, this.mFc);
      if (this.mCJ != null) {
        paramVarArgs.e(2, this.mCJ);
      }
      GMTrace.o(12640088752128L, 94176);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mFc) + 0;
      paramInt = i;
      if (this.mCJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCJ);
      }
      GMTrace.o(12640088752128L, 94176);
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
      if (this.mCJ == null) {
        throw new b("Not all required fields were included: Name");
      }
      GMTrace.o(12640088752128L, 94176);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cd localcd = (cd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12640088752128L, 94176);
        return -1;
      case 1: 
        localcd.mFc = locala.xSv.nm();
        GMTrace.o(12640088752128L, 94176);
        return 0;
      }
      localcd.mCJ = locala.xSv.readString();
      GMTrace.o(12640088752128L, 94176);
      return 0;
    }
    GMTrace.o(12640088752128L, 94176);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */