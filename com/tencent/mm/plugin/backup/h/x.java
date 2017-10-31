package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class x
  extends com.tencent.mm.bl.a
{
  public com.tencent.mm.bl.b jWD;
  public String jXS;
  public int jXT;
  public int jXU;
  public int jXV;
  public int jXW;
  public int jXX;
  public int jXY;
  
  public x()
  {
    GMTrace.i(14837904048128L, 110551);
    GMTrace.o(14837904048128L, 110551);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838038265856L, 110552);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jXS == null) {
        throw new b.a.a.b("Not all required fields were included: DataID");
      }
      if (this.jXS != null) {
        paramVarArgs.e(1, this.jXS);
      }
      paramVarArgs.fd(2, this.jXT);
      paramVarArgs.fd(3, this.jXU);
      paramVarArgs.fd(4, this.jXV);
      paramVarArgs.fd(5, this.jXW);
      paramVarArgs.fd(6, this.jXX);
      if (this.jWD != null) {
        paramVarArgs.b(7, this.jWD);
      }
      paramVarArgs.fd(8, this.jXY);
      GMTrace.o(14838038265856L, 110552);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jXS == null) {
        break label609;
      }
    }
    label609:
    for (paramInt = b.a.a.b.b.a.f(1, this.jXS) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.jXT) + b.a.a.a.fa(3, this.jXU) + b.a.a.a.fa(4, this.jXV) + b.a.a.a.fa(5, this.jXW) + b.a.a.a.fa(6, this.jXX);
      paramInt = i;
      if (this.jWD != null) {
        paramInt = i + b.a.a.a.a(7, this.jWD);
      }
      i = b.a.a.a.fa(8, this.jXY);
      GMTrace.o(14838038265856L, 110552);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.jXS == null) {
          throw new b.a.a.b("Not all required fields were included: DataID");
        }
        GMTrace.o(14838038265856L, 110552);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        x localx = (x)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14838038265856L, 110552);
          return -1;
        case 1: 
          localx.jXS = locala.xSv.readString();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 2: 
          localx.jXT = locala.xSv.nm();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 3: 
          localx.jXU = locala.xSv.nm();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 4: 
          localx.jXV = locala.xSv.nm();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 5: 
          localx.jXW = locala.xSv.nm();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 6: 
          localx.jXX = locala.xSv.nm();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 7: 
          localx.jWD = locala.cpI();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        }
        localx.jXY = locala.xSv.nm();
        GMTrace.o(14838038265856L, 110552);
        return 0;
      }
      GMTrace.o(14838038265856L, 110552);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */