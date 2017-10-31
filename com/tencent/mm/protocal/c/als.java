package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class als
  extends com.tencent.mm.bl.a
{
  public String fKY;
  public int tAS;
  public int ttY;
  public int ude;
  public int ugv;
  public int ugw;
  public String ugx;
  public int ugy;
  public String username;
  
  public als()
  {
    GMTrace.i(16872376369152L, 125709);
    GMTrace.o(16872376369152L, 125709);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16872510586880L, 125710);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fKY != null) {
        paramVarArgs.e(1, this.fKY);
      }
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      paramVarArgs.fd(3, this.ude);
      paramVarArgs.fd(4, this.tAS);
      paramVarArgs.fd(5, this.ttY);
      paramVarArgs.fd(6, this.ugv);
      paramVarArgs.fd(7, this.ugw);
      if (this.ugx != null) {
        paramVarArgs.e(8, this.ugx);
      }
      paramVarArgs.fd(9, this.ugy);
      GMTrace.o(16872510586880L, 125710);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fKY == null) {
        break label643;
      }
    }
    label643:
    for (paramInt = b.a.a.b.b.a.f(1, this.fKY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.username != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.username);
      }
      i = i + b.a.a.a.fa(3, this.ude) + b.a.a.a.fa(4, this.tAS) + b.a.a.a.fa(5, this.ttY) + b.a.a.a.fa(6, this.ugv) + b.a.a.a.fa(7, this.ugw);
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ugx);
      }
      i = b.a.a.a.fa(9, this.ugy);
      GMTrace.o(16872510586880L, 125710);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(16872510586880L, 125710);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        als localals = (als)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16872510586880L, 125710);
          return -1;
        case 1: 
          localals.fKY = locala.xSv.readString();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 2: 
          localals.username = locala.xSv.readString();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 3: 
          localals.ude = locala.xSv.nm();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 4: 
          localals.tAS = locala.xSv.nm();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 5: 
          localals.ttY = locala.xSv.nm();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 6: 
          localals.ugv = locala.xSv.nm();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 7: 
          localals.ugw = locala.xSv.nm();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 8: 
          localals.ugx = locala.xSv.readString();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        }
        localals.ugy = locala.xSv.nm();
        GMTrace.o(16872510586880L, 125710);
        return 0;
      }
      GMTrace.o(16872510586880L, 125710);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/als.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */