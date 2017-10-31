package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bh
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCK;
  public String mDf;
  public String mDg;
  public String mDh;
  public String mFE;
  public String mFF;
  public String mFu;
  
  public bh()
  {
    GMTrace.i(12649349775360L, 94245);
    GMTrace.o(12649349775360L, 94245);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12649483993088L, 94246);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFu != null) {
        paramVarArgs.e(1, this.mFu);
      }
      if (this.mFE != null) {
        paramVarArgs.e(2, this.mFE);
      }
      if (this.fuw != null) {
        paramVarArgs.e(3, this.fuw);
      }
      if (this.mCK != null) {
        paramVarArgs.e(4, this.mCK);
      }
      if (this.mFF != null) {
        paramVarArgs.e(5, this.mFF);
      }
      if (this.mDg != null) {
        paramVarArgs.e(6, this.mDg);
      }
      if (this.mDf != null) {
        paramVarArgs.e(7, this.mDf);
      }
      if (this.mDh != null) {
        paramVarArgs.e(8, this.mDh);
      }
      GMTrace.o(12649483993088L, 94246);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFu == null) {
        break label684;
      }
    }
    label684:
    for (int i = b.a.a.b.b.a.f(1, this.mFu) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mFE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFE);
      }
      i = paramInt;
      if (this.fuw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fuw);
      }
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCK);
      }
      i = paramInt;
      if (this.mFF != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mFF);
      }
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mDg);
      }
      i = paramInt;
      if (this.mDf != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.mDf);
      }
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.mDh);
      }
      GMTrace.o(12649483993088L, 94246);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12649483993088L, 94246);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bh localbh = (bh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12649483993088L, 94246);
          return -1;
        case 1: 
          localbh.mFu = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 2: 
          localbh.mFE = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 3: 
          localbh.fuw = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 4: 
          localbh.mCK = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 5: 
          localbh.mFF = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 6: 
          localbh.mDg = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 7: 
          localbh.mDf = locala.xSv.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        }
        localbh.mDh = locala.xSv.readString();
        GMTrace.o(12649483993088L, 94246);
        return 0;
      }
      GMTrace.o(12649483993088L, 94246);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */