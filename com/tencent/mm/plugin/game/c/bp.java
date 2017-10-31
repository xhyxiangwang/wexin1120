package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bp
  extends com.tencent.mm.bl.a
{
  public String mCK;
  public String mDg;
  
  public bp()
  {
    GMTrace.i(12640222969856L, 94177);
    GMTrace.o(12640222969856L, 94177);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12640357187584L, 94178);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCK == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.mCK != null) {
        paramVarArgs.e(1, this.mCK);
      }
      if (this.mDg != null) {
        paramVarArgs.e(2, this.mDg);
      }
      GMTrace.o(12640357187584L, 94178);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mCK == null) {
        break label334;
      }
    }
    label334:
    for (paramInt = b.a.a.b.b.a.f(1, this.mCK) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mDg != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDg);
      }
      GMTrace.o(12640357187584L, 94178);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mCK == null) {
          throw new b("Not all required fields were included: Desc");
        }
        GMTrace.o(12640357187584L, 94178);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bp localbp = (bp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12640357187584L, 94178);
          return -1;
        case 1: 
          localbp.mCK = locala.xSv.readString();
          GMTrace.o(12640357187584L, 94178);
          return 0;
        }
        localbp.mDg = locala.xSv.readString();
        GMTrace.o(12640357187584L, 94178);
        return 0;
      }
      GMTrace.o(12640357187584L, 94178);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */