package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class cb
  extends com.tencent.mm.bl.a
{
  public String mDg;
  public String mFy;
  public String mGr;
  
  public cb()
  {
    GMTrace.i(12639417663488L, 94171);
    GMTrace.o(12639417663488L, 94171);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12639551881216L, 94172);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGr != null) {
        paramVarArgs.e(1, this.mGr);
      }
      if (this.mFy != null) {
        paramVarArgs.e(2, this.mFy);
      }
      if (this.mDg != null) {
        paramVarArgs.e(3, this.mDg);
      }
      GMTrace.o(12639551881216L, 94172);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mGr == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.mGr) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mFy != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFy);
      }
      i = paramInt;
      if (this.mDg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDg);
      }
      GMTrace.o(12639551881216L, 94172);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12639551881216L, 94172);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cb localcb = (cb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12639551881216L, 94172);
          return -1;
        case 1: 
          localcb.mGr = locala.xSv.readString();
          GMTrace.o(12639551881216L, 94172);
          return 0;
        case 2: 
          localcb.mFy = locala.xSv.readString();
          GMTrace.o(12639551881216L, 94172);
          return 0;
        }
        localcb.mDg = locala.xSv.readString();
        GMTrace.o(12639551881216L, 94172);
        return 0;
      }
      GMTrace.o(12639551881216L, 94172);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */