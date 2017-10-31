package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bp
  extends com.tencent.mm.bl.a
{
  public int jXP;
  public int tvd;
  public int tve;
  public int tvf;
  public int tvg;
  
  public bp()
  {
    GMTrace.i(3686558334976L, 27467);
    GMTrace.o(3686558334976L, 27467);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3686692552704L, 27468);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tvd);
      paramVarArgs.fd(2, this.jXP);
      paramVarArgs.fd(3, this.tve);
      paramVarArgs.fd(4, this.tvf);
      paramVarArgs.fd(5, this.tvg);
      GMTrace.o(3686692552704L, 27468);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tvd);
      int i = b.a.a.a.fa(2, this.jXP);
      int j = b.a.a.a.fa(3, this.tve);
      int k = b.a.a.a.fa(4, this.tvf);
      int m = b.a.a.a.fa(5, this.tvg);
      GMTrace.o(3686692552704L, 27468);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3686692552704L, 27468);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bp localbp = (bp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3686692552704L, 27468);
        return -1;
      case 1: 
        localbp.tvd = locala.xSv.nm();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      case 2: 
        localbp.jXP = locala.xSv.nm();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      case 3: 
        localbp.tve = locala.xSv.nm();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      case 4: 
        localbp.tvf = locala.xSv.nm();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      }
      localbp.tvg = locala.xSv.nm();
      GMTrace.o(3686692552704L, 27468);
      return 0;
    }
    GMTrace.o(3686692552704L, 27468);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */