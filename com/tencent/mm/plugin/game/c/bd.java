package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bd
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mDg;
  public String mFy;
  public String mFz;
  
  public bd()
  {
    GMTrace.i(12651765694464L, 94263);
    GMTrace.o(12651765694464L, 94263);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651899912192L, 94264);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mFy != null) {
        paramVarArgs.e(2, this.mFy);
      }
      if (this.mDg != null) {
        paramVarArgs.e(3, this.mDg);
      }
      if (this.mFz != null) {
        paramVarArgs.e(4, this.mFz);
      }
      GMTrace.o(12651899912192L, 94264);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fuw == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.fuw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mFy != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFy);
      }
      i = paramInt;
      if (this.mDg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDg);
      }
      paramInt = i;
      if (this.mFz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mFz);
      }
      GMTrace.o(12651899912192L, 94264);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12651899912192L, 94264);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bd localbd = (bd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12651899912192L, 94264);
          return -1;
        case 1: 
          localbd.fuw = locala.xSv.readString();
          GMTrace.o(12651899912192L, 94264);
          return 0;
        case 2: 
          localbd.mFy = locala.xSv.readString();
          GMTrace.o(12651899912192L, 94264);
          return 0;
        case 3: 
          localbd.mDg = locala.xSv.readString();
          GMTrace.o(12651899912192L, 94264);
          return 0;
        }
        localbd.mFz = locala.xSv.readString();
        GMTrace.o(12651899912192L, 94264);
        return 0;
      }
      GMTrace.o(12651899912192L, 94264);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */