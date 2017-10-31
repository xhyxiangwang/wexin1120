package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ay
  extends com.tencent.mm.bl.a
{
  public String desc;
  public String hNg;
  public String mFr;
  public String mFs;
  public String title;
  
  public ay()
  {
    GMTrace.i(12640491405312L, 94179);
    GMTrace.o(12640491405312L, 94179);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12640625623040L, 94180);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.hNg != null) {
        paramVarArgs.e(2, this.hNg);
      }
      if (this.mFr != null) {
        paramVarArgs.e(3, this.mFr);
      }
      if (this.desc != null) {
        paramVarArgs.e(4, this.desc);
      }
      if (this.mFs != null) {
        paramVarArgs.e(5, this.mFs);
      }
      GMTrace.o(12640625623040L, 94180);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label487;
      }
    }
    label487:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hNg != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.hNg);
      }
      i = paramInt;
      if (this.mFr != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mFr);
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.desc);
      }
      i = paramInt;
      if (this.mFs != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mFs);
      }
      GMTrace.o(12640625623040L, 94180);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12640625623040L, 94180);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ay localay = (ay)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12640625623040L, 94180);
          return -1;
        case 1: 
          localay.title = locala.xSv.readString();
          GMTrace.o(12640625623040L, 94180);
          return 0;
        case 2: 
          localay.hNg = locala.xSv.readString();
          GMTrace.o(12640625623040L, 94180);
          return 0;
        case 3: 
          localay.mFr = locala.xSv.readString();
          GMTrace.o(12640625623040L, 94180);
          return 0;
        case 4: 
          localay.desc = locala.xSv.readString();
          GMTrace.o(12640625623040L, 94180);
          return 0;
        }
        localay.mFs = locala.xSv.readString();
        GMTrace.o(12640625623040L, 94180);
        return 0;
      }
      GMTrace.o(12640625623040L, 94180);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */