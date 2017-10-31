package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class y
  extends com.tencent.mm.bl.a
{
  public String jXS;
  public int jXT;
  public int jXV;
  public int jXW;
  public int jXo;
  
  public y()
  {
    GMTrace.i(14832266903552L, 110509);
    GMTrace.o(14832266903552L, 110509);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14832401121280L, 110510);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jXS == null) {
        throw new b("Not all required fields were included: DataID");
      }
      if (this.jXS != null) {
        paramVarArgs.e(1, this.jXS);
      }
      paramVarArgs.fd(2, this.jXT);
      paramVarArgs.fd(3, this.jXV);
      paramVarArgs.fd(4, this.jXW);
      paramVarArgs.fd(5, this.jXo);
      GMTrace.o(14832401121280L, 110510);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jXS == null) {
        break label463;
      }
    }
    label463:
    for (paramInt = b.a.a.b.b.a.f(1, this.jXS) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fa(2, this.jXT);
      int j = b.a.a.a.fa(3, this.jXV);
      int k = b.a.a.a.fa(4, this.jXW);
      int m = b.a.a.a.fa(5, this.jXo);
      GMTrace.o(14832401121280L, 110510);
      return paramInt + i + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jXS == null) {
          throw new b("Not all required fields were included: DataID");
        }
        GMTrace.o(14832401121280L, 110510);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        y localy = (y)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14832401121280L, 110510);
          return -1;
        case 1: 
          localy.jXS = locala.xSv.readString();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        case 2: 
          localy.jXT = locala.xSv.nm();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        case 3: 
          localy.jXV = locala.xSv.nm();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        case 4: 
          localy.jXW = locala.xSv.nm();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        }
        localy.jXo = locala.xSv.nm();
        GMTrace.o(14832401121280L, 110510);
        return 0;
      }
      GMTrace.o(14832401121280L, 110510);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */