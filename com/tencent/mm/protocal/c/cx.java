package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cx
  extends com.tencent.mm.bl.a
{
  public int iIQ;
  public int iIm;
  public int iIn;
  public int twA;
  public int twB;
  public int twC;
  public int twD;
  public int tww;
  public int twx;
  public int twy;
  public int twz;
  
  public cx()
  {
    GMTrace.i(3644011315200L, 27150);
    GMTrace.o(3644011315200L, 27150);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3644145532928L, 27151);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tww);
      paramVarArgs.fd(2, this.twx);
      paramVarArgs.fd(3, this.twy);
      paramVarArgs.fd(4, this.twz);
      paramVarArgs.fd(5, this.twA);
      paramVarArgs.fd(6, this.twB);
      paramVarArgs.fd(7, this.twC);
      paramVarArgs.fd(8, this.twD);
      paramVarArgs.fd(9, this.iIQ);
      paramVarArgs.fd(10, this.iIm);
      paramVarArgs.fd(11, this.iIn);
      GMTrace.o(3644145532928L, 27151);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tww);
      int i = b.a.a.a.fa(2, this.twx);
      int j = b.a.a.a.fa(3, this.twy);
      int k = b.a.a.a.fa(4, this.twz);
      int m = b.a.a.a.fa(5, this.twA);
      int n = b.a.a.a.fa(6, this.twB);
      int i1 = b.a.a.a.fa(7, this.twC);
      int i2 = b.a.a.a.fa(8, this.twD);
      int i3 = b.a.a.a.fa(9, this.iIQ);
      int i4 = b.a.a.a.fa(10, this.iIm);
      int i5 = b.a.a.a.fa(11, this.iIn);
      GMTrace.o(3644145532928L, 27151);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3 + i4 + i5;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3644145532928L, 27151);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cx localcx = (cx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3644145532928L, 27151);
        return -1;
      case 1: 
        localcx.tww = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 2: 
        localcx.twx = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 3: 
        localcx.twy = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 4: 
        localcx.twz = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 5: 
        localcx.twA = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 6: 
        localcx.twB = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 7: 
        localcx.twC = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 8: 
        localcx.twD = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 9: 
        localcx.iIQ = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 10: 
        localcx.iIm = locala.xSv.nm();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      }
      localcx.iIn = locala.xSv.nm();
      GMTrace.o(3644145532928L, 27151);
      return 0;
    }
    GMTrace.o(3644145532928L, 27151);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */