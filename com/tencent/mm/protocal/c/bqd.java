package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqd
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String ovi;
  public String uFL;
  public long uFM;
  
  public bqd()
  {
    GMTrace.i(3665486151680L, 27310);
    GMTrace.o(3665486151680L, 27310);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3665620369408L, 27311);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFL == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.ovi == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.uFL != null) {
        paramVarArgs.e(1, this.uFL);
      }
      if (this.fuw != null) {
        paramVarArgs.e(2, this.fuw);
      }
      if (this.ovi != null) {
        paramVarArgs.e(3, this.ovi);
      }
      paramVarArgs.R(4, this.uFM);
      GMTrace.o(3665620369408L, 27311);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFL == null) {
        break label522;
      }
    }
    label522:
    for (int i = b.a.a.b.b.a.f(1, this.uFL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.fuw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fuw);
      }
      i = paramInt;
      if (this.ovi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ovi);
      }
      paramInt = b.a.a.a.Q(4, this.uFM);
      GMTrace.o(3665620369408L, 27311);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.uFL == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.fuw == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.ovi == null) {
          throw new b("Not all required fields were included: Content");
        }
        GMTrace.o(3665620369408L, 27311);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqd localbqd = (bqd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3665620369408L, 27311);
          return -1;
        case 1: 
          localbqd.uFL = locala.xSv.readString();
          GMTrace.o(3665620369408L, 27311);
          return 0;
        case 2: 
          localbqd.fuw = locala.xSv.readString();
          GMTrace.o(3665620369408L, 27311);
          return 0;
        case 3: 
          localbqd.ovi = locala.xSv.readString();
          GMTrace.o(3665620369408L, 27311);
          return 0;
        }
        localbqd.uFM = locala.xSv.nn();
        GMTrace.o(3665620369408L, 27311);
        return 0;
      }
      GMTrace.o(3665620369408L, 27311);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */