package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqz
  extends com.tencent.mm.bl.a
{
  public int jWQ;
  public int jXP;
  public String mGA;
  public int orU;
  public String tvt;
  public int uGh;
  public int uiS;
  
  public bqz()
  {
    GMTrace.i(3914325819392L, 29164);
    GMTrace.o(3914325819392L, 29164);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3914460037120L, 29165);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mGA != null) {
        paramVarArgs.e(1, this.mGA);
      }
      paramVarArgs.fd(2, this.jXP);
      paramVarArgs.fd(3, this.jWQ);
      paramVarArgs.fd(4, this.orU);
      paramVarArgs.fd(5, this.uiS);
      if (this.tvt != null) {
        paramVarArgs.e(6, this.tvt);
      }
      paramVarArgs.fd(7, this.uGh);
      GMTrace.o(3914460037120L, 29165);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mGA == null) {
        break label546;
      }
    }
    label546:
    for (paramInt = b.a.a.b.b.a.f(1, this.mGA) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fa(2, this.jXP) + b.a.a.a.fa(3, this.jWQ) + b.a.a.a.fa(4, this.orU) + b.a.a.a.fa(5, this.uiS);
      paramInt = i;
      if (this.tvt != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tvt);
      }
      i = b.a.a.a.fa(7, this.uGh);
      GMTrace.o(3914460037120L, 29165);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3914460037120L, 29165);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqz localbqz = (bqz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3914460037120L, 29165);
          return -1;
        case 1: 
          localbqz.mGA = locala.xSv.readString();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 2: 
          localbqz.jXP = locala.xSv.nm();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 3: 
          localbqz.jWQ = locala.xSv.nm();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 4: 
          localbqz.orU = locala.xSv.nm();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 5: 
          localbqz.uiS = locala.xSv.nm();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 6: 
          localbqz.tvt = locala.xSv.readString();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        }
        localbqz.uGh = locala.xSv.nm();
        GMTrace.o(3914460037120L, 29165);
        return 0;
      }
      GMTrace.o(3914460037120L, 29165);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */