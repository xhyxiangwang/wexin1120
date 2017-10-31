package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class alx
  extends com.tencent.mm.bl.a
{
  public LinkedList<b> ugI;
  
  public alx()
  {
    GMTrace.i(15344307535872L, 114324);
    this.ugI = new LinkedList();
    GMTrace.o(15344307535872L, 114324);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344441753600L, 114325);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 6, this.ugI);
      GMTrace.o(15344441753600L, 114325);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 6, this.ugI);
      GMTrace.o(15344441753600L, 114325);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ugI.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15344441753600L, 114325);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      alx localalx = (alx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15344441753600L, 114325);
        return -1;
      }
      localalx.ugI.add(locala.cpI());
      GMTrace.o(15344441753600L, 114325);
      return 0;
    }
    GMTrace.o(15344441753600L, 114325);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/alx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */