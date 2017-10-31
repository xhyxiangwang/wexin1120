package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ans
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public String mFu;
  public String paD;
  public String ujE;
  
  public ans()
  {
    GMTrace.i(3880637169664L, 28913);
    GMTrace.o(3880637169664L, 28913);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3880771387392L, 28914);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFu != null) {
        paramVarArgs.e(1, this.mFu);
      }
      if (this.ujE != null) {
        paramVarArgs.e(2, this.ujE);
      }
      if (this.paD != null) {
        paramVarArgs.e(3, this.paD);
      }
      paramVarArgs.fd(4, this.jXP);
      GMTrace.o(3880771387392L, 28914);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFu == null) {
        break label418;
      }
    }
    label418:
    for (int i = b.a.a.b.b.a.f(1, this.mFu) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ujE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ujE);
      }
      i = paramInt;
      if (this.paD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.paD);
      }
      paramInt = b.a.a.a.fa(4, this.jXP);
      GMTrace.o(3880771387392L, 28914);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3880771387392L, 28914);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ans localans = (ans)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3880771387392L, 28914);
          return -1;
        case 1: 
          localans.mFu = locala.xSv.readString();
          GMTrace.o(3880771387392L, 28914);
          return 0;
        case 2: 
          localans.ujE = locala.xSv.readString();
          GMTrace.o(3880771387392L, 28914);
          return 0;
        case 3: 
          localans.paD = locala.xSv.readString();
          GMTrace.o(3880771387392L, 28914);
          return 0;
        }
        localans.jXP = locala.xSv.nm();
        GMTrace.o(3880771387392L, 28914);
        return 0;
      }
      GMTrace.o(3880771387392L, 28914);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */