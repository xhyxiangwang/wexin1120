package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bq
  extends com.tencent.mm.bl.a
{
  public int mFT;
  public String mFU;
  public String mFV;
  public boolean mFW;
  
  public bq()
  {
    GMTrace.i(12648007598080L, 94235);
    GMTrace.o(12648007598080L, 94235);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12648141815808L, 94236);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFV == null) {
        throw new b("Not all required fields were included: MediaURL");
      }
      paramVarArgs.fd(1, this.mFT);
      if (this.mFU != null) {
        paramVarArgs.e(2, this.mFU);
      }
      if (this.mFV != null) {
        paramVarArgs.e(3, this.mFV);
      }
      paramVarArgs.af(4, this.mFW);
      GMTrace.o(12648141815808L, 94236);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.mFT) + 0;
      paramInt = i;
      if (this.mFU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFU);
      }
      i = paramInt;
      if (this.mFV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mFV);
      }
      paramInt = b.a.a.b.b.a.cK(4);
      GMTrace.o(12648141815808L, 94236);
      return i + (paramInt + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mFV == null) {
        throw new b("Not all required fields were included: MediaURL");
      }
      GMTrace.o(12648141815808L, 94236);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bq localbq = (bq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12648141815808L, 94236);
        return -1;
      case 1: 
        localbq.mFT = locala.xSv.nm();
        GMTrace.o(12648141815808L, 94236);
        return 0;
      case 2: 
        localbq.mFU = locala.xSv.readString();
        GMTrace.o(12648141815808L, 94236);
        return 0;
      case 3: 
        localbq.mFV = locala.xSv.readString();
        GMTrace.o(12648141815808L, 94236);
        return 0;
      }
      localbq.mFW = locala.cpH();
      GMTrace.o(12648141815808L, 94236);
      return 0;
    }
    GMTrace.o(12648141815808L, 94236);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */