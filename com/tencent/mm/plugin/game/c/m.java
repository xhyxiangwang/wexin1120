package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class m
  extends com.tencent.mm.bl.a
{
  public String mCG;
  public int mDC;
  public String mDD;
  public int mDE;
  public int mDF;
  
  public m()
  {
    GMTrace.i(12636733308928L, 94151);
    GMTrace.o(12636733308928L, 94151);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12636867526656L, 94152);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.mDC);
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      paramVarArgs.fd(3, this.mDE);
      if (this.mCG != null) {
        paramVarArgs.e(4, this.mCG);
      }
      paramVarArgs.fd(5, this.mDF);
      GMTrace.o(12636867526656L, 94152);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mDC) + 0;
      paramInt = i;
      if (this.mDD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDD);
      }
      i = paramInt + b.a.a.a.fa(3, this.mDE);
      paramInt = i;
      if (this.mCG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mCG);
      }
      i = b.a.a.a.fa(5, this.mDF);
      GMTrace.o(12636867526656L, 94152);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12636867526656L, 94152);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12636867526656L, 94152);
        return -1;
      case 1: 
        localm.mDC = locala.xSv.nm();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      case 2: 
        localm.mDD = locala.xSv.readString();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      case 3: 
        localm.mDE = locala.xSv.nm();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      case 4: 
        localm.mCG = locala.xSv.readString();
        GMTrace.o(12636867526656L, 94152);
        return 0;
      }
      localm.mDF = locala.xSv.nm();
      GMTrace.o(12636867526656L, 94152);
      return 0;
    }
    GMTrace.o(12636867526656L, 94152);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */