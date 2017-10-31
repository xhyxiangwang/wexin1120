package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bqc
  extends com.tencent.mm.bl.a
{
  public String lph;
  public String twR;
  public boolean uFK;
  
  public bqc()
  {
    GMTrace.i(3735413587968L, 27831);
    GMTrace.o(3735413587968L, 27831);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3735547805696L, 27832);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.twR == null) {
        throw new b("Not all required fields were included: Username");
      }
      if (this.lph == null) {
        throw new b("Not all required fields were included: Language");
      }
      if (this.twR != null) {
        paramVarArgs.e(1, this.twR);
      }
      if (this.lph != null) {
        paramVarArgs.e(2, this.lph);
      }
      paramVarArgs.af(3, this.uFK);
      GMTrace.o(3735547805696L, 27832);
      return 0;
    }
    if (paramInt == 1) {
      if (this.twR == null) {
        break label419;
      }
    }
    label419:
    for (paramInt = b.a.a.b.b.a.f(1, this.twR) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lph != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lph);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      GMTrace.o(3735547805696L, 27832);
      return i + (paramInt + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.twR == null) {
          throw new b("Not all required fields were included: Username");
        }
        if (this.lph == null) {
          throw new b("Not all required fields were included: Language");
        }
        GMTrace.o(3735547805696L, 27832);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqc localbqc = (bqc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3735547805696L, 27832);
          return -1;
        case 1: 
          localbqc.twR = locala.xSv.readString();
          GMTrace.o(3735547805696L, 27832);
          return 0;
        case 2: 
          localbqc.lph = locala.xSv.readString();
          GMTrace.o(3735547805696L, 27832);
          return 0;
        }
        localbqc.uFK = locala.cpH();
        GMTrace.o(3735547805696L, 27832);
        return 0;
      }
      GMTrace.o(3735547805696L, 27832);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */