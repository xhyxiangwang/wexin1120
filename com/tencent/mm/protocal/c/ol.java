package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ol
  extends com.tencent.mm.bl.a
{
  public int tvd;
  public int tyi;
  
  public ol()
  {
    GMTrace.i(3713938751488L, 27671);
    GMTrace.o(3713938751488L, 27671);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3714072969216L, 27672);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tyi);
      paramVarArgs.fd(2, this.tvd);
      GMTrace.o(3714072969216L, 27672);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tyi);
      int i = b.a.a.a.fa(2, this.tvd);
      GMTrace.o(3714072969216L, 27672);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3714072969216L, 27672);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ol localol = (ol)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3714072969216L, 27672);
        return -1;
      case 1: 
        localol.tyi = locala.xSv.nm();
        GMTrace.o(3714072969216L, 27672);
        return 0;
      }
      localol.tvd = locala.xSv.nm();
      GMTrace.o(3714072969216L, 27672);
      return 0;
    }
    GMTrace.o(3714072969216L, 27672);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */