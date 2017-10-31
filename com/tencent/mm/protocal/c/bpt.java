package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bpt
  extends com.tencent.mm.bl.a
{
  public String tCS;
  
  public bpt()
  {
    GMTrace.i(3702127591424L, 27583);
    GMTrace.o(3702127591424L, 27583);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3702261809152L, 27584);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tCS == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.tCS != null) {
        paramVarArgs.e(1, this.tCS);
      }
      GMTrace.o(3702261809152L, 27584);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tCS == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.tCS) + 0;; paramInt = 0)
    {
      GMTrace.o(3702261809152L, 27584);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        if (this.tCS == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        GMTrace.o(3702261809152L, 27584);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bpt localbpt = (bpt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3702261809152L, 27584);
          return -1;
        }
        localbpt.tCS = locala.xSv.readString();
        GMTrace.o(3702261809152L, 27584);
        return 0;
      }
      GMTrace.o(3702261809152L, 27584);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */