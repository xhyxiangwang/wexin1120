package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bfp
  extends com.tencent.mm.bl.a
{
  public int jXN;
  public int tMS;
  public int uxJ;
  public int uxK;
  public int uxL;
  public int uxM;
  public int uxN;
  public int uxO;
  
  public bfp()
  {
    GMTrace.i(3992037883904L, 29743);
    GMTrace.o(3992037883904L, 29743);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3992172101632L, 29744);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.jXN);
      paramVarArgs.fd(2, this.tMS);
      paramVarArgs.fd(3, this.uxJ);
      paramVarArgs.fd(4, this.uxK);
      paramVarArgs.fd(5, this.uxL);
      paramVarArgs.fd(6, this.uxM);
      paramVarArgs.fd(7, this.uxN);
      paramVarArgs.fd(8, this.uxO);
      GMTrace.o(3992172101632L, 29744);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.jXN);
      int i = b.a.a.a.fa(2, this.tMS);
      int j = b.a.a.a.fa(3, this.uxJ);
      int k = b.a.a.a.fa(4, this.uxK);
      int m = b.a.a.a.fa(5, this.uxL);
      int n = b.a.a.a.fa(6, this.uxM);
      int i1 = b.a.a.a.fa(7, this.uxN);
      int i2 = b.a.a.a.fa(8, this.uxO);
      GMTrace.o(3992172101632L, 29744);
      return paramInt + 0 + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3992172101632L, 29744);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bfp localbfp = (bfp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3992172101632L, 29744);
        return -1;
      case 1: 
        localbfp.jXN = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 2: 
        localbfp.tMS = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 3: 
        localbfp.uxJ = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 4: 
        localbfp.uxK = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 5: 
        localbfp.uxL = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 6: 
        localbfp.uxM = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 7: 
        localbfp.uxN = locala.xSv.nm();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      }
      localbfp.uxO = locala.xSv.nm();
      GMTrace.o(3992172101632L, 29744);
      return 0;
    }
    GMTrace.o(3992172101632L, 29744);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */