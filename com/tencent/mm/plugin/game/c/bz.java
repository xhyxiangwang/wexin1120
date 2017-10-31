package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bz
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCK;
  public String mDg;
  public String mDh;
  public String mFy;
  public String mGn;
  
  public bz()
  {
    GMTrace.i(12656597532672L, 94299);
    GMTrace.o(12656597532672L, 94299);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12656731750400L, 94300);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mCK != null) {
        paramVarArgs.e(2, this.mCK);
      }
      if (this.mFy != null) {
        paramVarArgs.e(3, this.mFy);
      }
      if (this.mDg != null) {
        paramVarArgs.e(4, this.mDg);
      }
      if (this.mDh != null) {
        paramVarArgs.e(5, this.mDh);
      }
      if (this.mGn != null) {
        paramVarArgs.e(6, this.mGn);
      }
      GMTrace.o(12656731750400L, 94300);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label554;
      }
    }
    label554:
    for (int i = b.a.a.b.b.a.f(1, this.fuw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCK);
      }
      i = paramInt;
      if (this.mFy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mFy);
      }
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDg);
      }
      i = paramInt;
      if (this.mDh != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mDh);
      }
      paramInt = i;
      if (this.mGn != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mGn);
      }
      GMTrace.o(12656731750400L, 94300);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12656731750400L, 94300);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bz localbz = (bz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12656731750400L, 94300);
          return -1;
        case 1: 
          localbz.fuw = locala.xSv.readString();
          GMTrace.o(12656731750400L, 94300);
          return 0;
        case 2: 
          localbz.mCK = locala.xSv.readString();
          GMTrace.o(12656731750400L, 94300);
          return 0;
        case 3: 
          localbz.mFy = locala.xSv.readString();
          GMTrace.o(12656731750400L, 94300);
          return 0;
        case 4: 
          localbz.mDg = locala.xSv.readString();
          GMTrace.o(12656731750400L, 94300);
          return 0;
        case 5: 
          localbz.mDh = locala.xSv.readString();
          GMTrace.o(12656731750400L, 94300);
          return 0;
        }
        localbz.mGn = locala.xSv.readString();
        GMTrace.o(12656731750400L, 94300);
        return 0;
      }
      GMTrace.o(12656731750400L, 94300);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */