package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class av
  extends com.tencent.mm.bl.a
{
  public boolean tun;
  
  public av()
  {
    GMTrace.i(16870631538688L, 125696);
    GMTrace.o(16870631538688L, 125696);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16870765756416L, 125697);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).af(1, this.tun);
      GMTrace.o(16870765756416L, 125697);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      GMTrace.o(16870765756416L, 125697);
      return paramInt + 1 + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(16870765756416L, 125697);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      av localav = (av)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16870765756416L, 125697);
        return -1;
      }
      localav.tun = locala.cpH();
      GMTrace.o(16870765756416L, 125697);
      return 0;
    }
    GMTrace.o(16870765756416L, 125697);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */