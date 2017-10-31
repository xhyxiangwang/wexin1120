package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class cc
  extends com.tencent.mm.bl.a
{
  public String mCE;
  public String mCI;
  public String mGs;
  public String mGt;
  public String mGu;
  public boolean mGv;
  public boolean mGw;
  
  public cc()
  {
    GMTrace.i(12652034129920L, 94265);
    GMTrace.o(12652034129920L, 94265);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12652168347648L, 94266);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCI != null) {
        paramVarArgs.e(1, this.mCI);
      }
      if (this.mGs != null) {
        paramVarArgs.e(2, this.mGs);
      }
      if (this.mGt != null) {
        paramVarArgs.e(3, this.mGt);
      }
      if (this.mGu != null) {
        paramVarArgs.e(4, this.mGu);
      }
      if (this.mCE != null) {
        paramVarArgs.e(5, this.mCE);
      }
      paramVarArgs.af(6, this.mGv);
      paramVarArgs.af(7, this.mGw);
      GMTrace.o(12652168347648L, 94266);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mCI == null) {
        break label579;
      }
    }
    label579:
    for (int i = b.a.a.b.b.a.f(1, this.mCI) + 0;; i = 0)
    {
      paramInt = i;
      if (this.mGs != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mGs);
      }
      i = paramInt;
      if (this.mGt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mGt);
      }
      paramInt = i;
      if (this.mGu != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mGu);
      }
      i = paramInt;
      if (this.mCE != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mCE);
      }
      paramInt = b.a.a.b.b.a.cK(6);
      int j = b.a.a.b.b.a.cK(7);
      GMTrace.o(12652168347648L, 94266);
      return i + (paramInt + 1) + (j + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(12652168347648L, 94266);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cc localcc = (cc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12652168347648L, 94266);
          return -1;
        case 1: 
          localcc.mCI = locala.xSv.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 2: 
          localcc.mGs = locala.xSv.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 3: 
          localcc.mGt = locala.xSv.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 4: 
          localcc.mGu = locala.xSv.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 5: 
          localcc.mCE = locala.xSv.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 6: 
          localcc.mGv = locala.cpH();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        }
        localcc.mGw = locala.cpH();
        GMTrace.o(12652168347648L, 94266);
        return 0;
      }
      GMTrace.o(12652168347648L, 94266);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */