package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class ae
  extends com.tencent.mm.bl.a
{
  public com.tencent.mm.bl.b jWD;
  public String jXS;
  public int jXT;
  public int jXV;
  public int jXW;
  public int jXX;
  public int jXo;
  
  public ae()
  {
    GMTrace.i(14838440919040L, 110555);
    GMTrace.o(14838440919040L, 110555);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838575136768L, 110556);
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
      paramVarArgs.fd(3, this.jXV);
      paramVarArgs.fd(4, this.jXW);
      paramVarArgs.fd(5, this.jXo);
      paramVarArgs.fd(6, this.jXX);
      if (this.jWD != null) {
        paramVarArgs.b(7, this.jWD);
      }
      GMTrace.o(14838575136768L, 110556);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jXS == null) {
        break label562;
      }
    }
    label562:
    for (paramInt = b.a.a.b.b.a.f(1, this.jXS) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.jXT) + b.a.a.a.fa(3, this.jXV) + b.a.a.a.fa(4, this.jXW) + b.a.a.a.fa(5, this.jXo) + b.a.a.a.fa(6, this.jXX);
      paramInt = i;
      if (this.jWD != null) {
        paramInt = i + b.a.a.a.a(7, this.jWD);
      }
      GMTrace.o(14838575136768L, 110556);
      return paramInt;
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
        GMTrace.o(14838575136768L, 110556);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ae localae = (ae)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14838575136768L, 110556);
          return -1;
        case 1: 
          localae.jXS = locala.xSv.readString();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 2: 
          localae.jXT = locala.xSv.nm();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 3: 
          localae.jXV = locala.xSv.nm();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 4: 
          localae.jXW = locala.xSv.nm();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 5: 
          localae.jXo = locala.xSv.nm();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 6: 
          localae.jXX = locala.xSv.nm();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        }
        localae.jWD = locala.cpI();
        GMTrace.o(14838575136768L, 110556);
        return 0;
      }
      GMTrace.o(14838575136768L, 110556);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/h/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */