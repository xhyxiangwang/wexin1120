package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class t
  extends com.tencent.mm.bl.a
{
  public long trB;
  public String trO;
  public long trP;
  public int trQ;
  
  public t()
  {
    GMTrace.i(3741050732544L, 27873);
    GMTrace.o(3741050732544L, 27873);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3741184950272L, 27874);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.trO != null) {
        paramVarArgs.e(1, this.trO);
      }
      paramVarArgs.R(2, this.trB);
      paramVarArgs.R(3, this.trP);
      paramVarArgs.fd(4, this.trQ);
      GMTrace.o(3741184950272L, 27874);
      return 0;
    }
    if (paramInt == 1) {
      if (this.trO == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.trO) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.Q(2, this.trB);
      int j = b.a.a.a.Q(3, this.trP);
      int k = b.a.a.a.fa(4, this.trQ);
      GMTrace.o(3741184950272L, 27874);
      return paramInt + i + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3741184950272L, 27874);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        t localt = (t)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3741184950272L, 27874);
          return -1;
        case 1: 
          localt.trO = locala.xSv.readString();
          GMTrace.o(3741184950272L, 27874);
          return 0;
        case 2: 
          localt.trB = locala.xSv.nn();
          GMTrace.o(3741184950272L, 27874);
          return 0;
        case 3: 
          localt.trP = locala.xSv.nn();
          GMTrace.o(3741184950272L, 27874);
          return 0;
        }
        localt.trQ = locala.xSv.nm();
        GMTrace.o(3741184950272L, 27874);
        return 0;
      }
      GMTrace.o(3741184950272L, 27874);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */