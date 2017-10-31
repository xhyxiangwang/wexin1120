package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class cm
  extends com.tencent.mm.bl.a
{
  public String mGB;
  public String mGC;
  
  public cm()
  {
    GMTrace.i(12637001744384L, 94153);
    GMTrace.o(12637001744384L, 94153);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12637135962112L, 94154);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGB == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.mGC == null) {
        throw new b("Not all required fields were included: TimeDesc");
      }
      if (this.mGB != null) {
        paramVarArgs.e(1, this.mGB);
      }
      if (this.mGC != null) {
        paramVarArgs.e(2, this.mGC);
      }
      GMTrace.o(12637135962112L, 94154);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mGB == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.mGB) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mGC != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mGC);
      }
      GMTrace.o(12637135962112L, 94154);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.mGB == null) {
          throw new b("Not all required fields were included: FromUserName");
        }
        if (this.mGC == null) {
          throw new b("Not all required fields were included: TimeDesc");
        }
        GMTrace.o(12637135962112L, 94154);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cm localcm = (cm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12637135962112L, 94154);
          return -1;
        case 1: 
          localcm.mGB = locala.xSv.readString();
          GMTrace.o(12637135962112L, 94154);
          return 0;
        }
        localcm.mGC = locala.xSv.readString();
        GMTrace.o(12637135962112L, 94154);
        return 0;
      }
      GMTrace.o(12637135962112L, 94154);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */