package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class kb
  extends com.tencent.mm.bl.a
{
  public String fMv;
  public int knw;
  public String kqX;
  public int tGt;
  public String tGu;
  
  public kb()
  {
    GMTrace.i(3900904046592L, 29064);
    GMTrace.o(3900904046592L, 29064);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3901038264320L, 29065);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv != null) {
        paramVarArgs.e(1, this.fMv);
      }
      if (this.kqX != null) {
        paramVarArgs.e(2, this.kqX);
      }
      paramVarArgs.fd(3, this.knw);
      paramVarArgs.fd(4, this.tGt);
      if (this.tGu != null) {
        paramVarArgs.e(5, this.tGu);
      }
      GMTrace.o(3901038264320L, 29065);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fMv == null) {
        break label466;
      }
    }
    label466:
    for (paramInt = b.a.a.b.b.a.f(1, this.fMv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.kqX != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.kqX);
      }
      i = i + b.a.a.a.fa(3, this.knw) + b.a.a.a.fa(4, this.tGt);
      paramInt = i;
      if (this.tGu != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tGu);
      }
      GMTrace.o(3901038264320L, 29065);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(3901038264320L, 29065);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        kb localkb = (kb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3901038264320L, 29065);
          return -1;
        case 1: 
          localkb.fMv = locala.xSv.readString();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        case 2: 
          localkb.kqX = locala.xSv.readString();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        case 3: 
          localkb.knw = locala.xSv.nm();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        case 4: 
          localkb.tGt = locala.xSv.nm();
          GMTrace.o(3901038264320L, 29065);
          return 0;
        }
        localkb.tGu = locala.xSv.readString();
        GMTrace.o(3901038264320L, 29065);
        return 0;
      }
      GMTrace.o(3901038264320L, 29065);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */