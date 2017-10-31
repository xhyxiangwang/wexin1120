package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bib
  extends com.tencent.mm.bl.a
{
  public String uzi;
  public String uzj;
  
  public bib()
  {
    GMTrace.i(3723065556992L, 27739);
    GMTrace.o(3723065556992L, 27739);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3723199774720L, 27740);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uzi != null) {
        paramVarArgs.e(1, this.uzi);
      }
      if (this.uzj != null) {
        paramVarArgs.e(2, this.uzj);
      }
      GMTrace.o(3723199774720L, 27740);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uzi == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uzi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uzj != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uzj);
      }
      GMTrace.o(3723199774720L, 27740);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3723199774720L, 27740);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bib localbib = (bib)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3723199774720L, 27740);
          return -1;
        case 1: 
          localbib.uzi = locala.xSv.readString();
          GMTrace.o(3723199774720L, 27740);
          return 0;
        }
        localbib.uzj = locala.xSv.readString();
        GMTrace.o(3723199774720L, 27740);
        return 0;
      }
      GMTrace.o(3723199774720L, 27740);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */