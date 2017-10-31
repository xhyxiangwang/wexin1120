package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bl.a
{
  public int mCZ;
  public int mDa;
  public int mDc;
  
  public d()
  {
    GMTrace.i(16560722804736L, 123387);
    GMTrace.o(16560722804736L, 123387);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16560857022464L, 123388);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.mCZ);
      paramVarArgs.fd(2, this.mDa);
      paramVarArgs.fd(3, this.mDc);
      GMTrace.o(16560857022464L, 123388);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.mCZ);
      int i = b.a.a.a.fa(2, this.mDa);
      int j = b.a.a.a.fa(3, this.mDc);
      GMTrace.o(16560857022464L, 123388);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16560857022464L, 123388);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16560857022464L, 123388);
        return -1;
      case 1: 
        locald.mCZ = locala.xSv.nm();
        GMTrace.o(16560857022464L, 123388);
        return 0;
      case 2: 
        locald.mDa = locala.xSv.nm();
        GMTrace.o(16560857022464L, 123388);
        return 0;
      }
      locald.mDc = locala.xSv.nm();
      GMTrace.o(16560857022464L, 123388);
      return 0;
    }
    GMTrace.o(16560857022464L, 123388);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */