package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bb
  extends com.tencent.mm.bl.a
{
  public long endTime;
  public int pWl;
  public int pWm;
  public long startTime;
  public float tuD;
  public float tuE;
  public float tuF;
  public long tuG;
  public long tuH;
  public long tuI;
  public long tuJ;
  
  public bb()
  {
    GMTrace.i(3663875538944L, 27298);
    GMTrace.o(3663875538944L, 27298);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3664009756672L, 27299);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.pWl);
      paramVarArgs.fd(2, this.pWm);
      paramVarArgs.n(3, this.tuD);
      paramVarArgs.n(4, this.tuE);
      paramVarArgs.n(5, this.tuF);
      paramVarArgs.R(6, this.startTime);
      paramVarArgs.R(7, this.endTime);
      paramVarArgs.R(8, this.tuG);
      paramVarArgs.R(9, this.tuH);
      paramVarArgs.R(10, this.tuI);
      paramVarArgs.R(11, this.tuJ);
      GMTrace.o(3664009756672L, 27299);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.pWl);
      int i = b.a.a.a.fa(2, this.pWm);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.b.b.a.cK(5);
      int n = b.a.a.a.Q(6, this.startTime);
      int i1 = b.a.a.a.Q(7, this.endTime);
      int i2 = b.a.a.a.Q(8, this.tuG);
      int i3 = b.a.a.a.Q(9, this.tuH);
      int i4 = b.a.a.a.Q(10, this.tuI);
      int i5 = b.a.a.a.Q(11, this.tuJ);
      GMTrace.o(3664009756672L, 27299);
      return paramInt + 0 + i + (j + 4) + (k + 4) + (m + 4) + n + i1 + i2 + i3 + i4 + i5;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3664009756672L, 27299);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bb localbb = (bb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3664009756672L, 27299);
        return -1;
      case 1: 
        localbb.pWl = locala.xSv.nm();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 2: 
        localbb.pWm = locala.xSv.nm();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 3: 
        localbb.tuD = locala.xSv.readFloat();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 4: 
        localbb.tuE = locala.xSv.readFloat();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 5: 
        localbb.tuF = locala.xSv.readFloat();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 6: 
        localbb.startTime = locala.xSv.nn();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 7: 
        localbb.endTime = locala.xSv.nn();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 8: 
        localbb.tuG = locala.xSv.nn();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 9: 
        localbb.tuH = locala.xSv.nn();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 10: 
        localbb.tuI = locala.xSv.nn();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      }
      localbb.tuJ = locala.xSv.nn();
      GMTrace.o(3664009756672L, 27299);
      return 0;
    }
    GMTrace.o(3664009756672L, 27299);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */