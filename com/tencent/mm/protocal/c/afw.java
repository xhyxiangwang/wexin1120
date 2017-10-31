package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;

public final class afw
  extends com.tencent.mm.bl.a
{
  public b tyP;
  public b tyR;
  public b ubs;
  
  public afw()
  {
    GMTrace.i(3894730031104L, 29018);
    GMTrace.o(3894730031104L, 29018);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3894864248832L, 29019);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tyR != null) {
        paramVarArgs.b(1, this.tyR);
      }
      if (this.tyP != null) {
        paramVarArgs.b(2, this.tyP);
      }
      if (this.ubs != null) {
        paramVarArgs.b(3, this.ubs);
      }
      GMTrace.o(3894864248832L, 29019);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tyR == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.a.a(1, this.tyR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tyP != null) {
        paramInt = i + b.a.a.a.a(2, this.tyP);
      }
      i = paramInt;
      if (this.ubs != null) {
        i = paramInt + b.a.a.a.a(3, this.ubs);
      }
      GMTrace.o(3894864248832L, 29019);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3894864248832L, 29019);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        afw localafw = (afw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3894864248832L, 29019);
          return -1;
        case 1: 
          localafw.tyR = locala.cpI();
          GMTrace.o(3894864248832L, 29019);
          return 0;
        case 2: 
          localafw.tyP = locala.cpI();
          GMTrace.o(3894864248832L, 29019);
          return 0;
        }
        localafw.ubs = locala.cpI();
        GMTrace.o(3894864248832L, 29019);
        return 0;
      }
      GMTrace.o(3894864248832L, 29019);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */