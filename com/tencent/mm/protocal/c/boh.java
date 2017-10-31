package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class boh
  extends com.tencent.mm.bl.a
{
  public String mDH;
  public String mGB;
  public String uEK;
  public String uEL;
  public String uoq;
  
  public boh()
  {
    GMTrace.i(3942511542272L, 29374);
    GMTrace.o(3942511542272L, 29374);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3942645760000L, 29375);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uoq != null) {
        paramVarArgs.e(1, this.uoq);
      }
      if (this.uEK != null) {
        paramVarArgs.e(2, this.uEK);
      }
      if (this.mGB != null) {
        paramVarArgs.e(3, this.mGB);
      }
      if (this.mDH != null) {
        paramVarArgs.e(4, this.mDH);
      }
      if (this.uEL != null) {
        paramVarArgs.e(5, this.uEL);
      }
      GMTrace.o(3942645760000L, 29375);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uoq == null) {
        break label498;
      }
    }
    label498:
    for (int i = b.a.a.b.b.a.f(1, this.uoq) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uEK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uEK);
      }
      i = paramInt;
      if (this.mGB != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mGB);
      }
      paramInt = i;
      if (this.mDH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDH);
      }
      i = paramInt;
      if (this.uEL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uEL);
      }
      GMTrace.o(3942645760000L, 29375);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3942645760000L, 29375);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        boh localboh = (boh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3942645760000L, 29375);
          return -1;
        case 1: 
          localboh.uoq = locala.xSv.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        case 2: 
          localboh.uEK = locala.xSv.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        case 3: 
          localboh.mGB = locala.xSv.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        case 4: 
          localboh.mDH = locala.xSv.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        }
        localboh.uEL = locala.xSv.readString();
        GMTrace.o(3942645760000L, 29375);
        return 0;
      }
      GMTrace.o(3942645760000L, 29375);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/boh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */