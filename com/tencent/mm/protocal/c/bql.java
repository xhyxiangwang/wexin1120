package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bql
  extends com.tencent.mm.bl.a
{
  public LinkedList<Integer> uFV;
  public boolean uFW;
  
  public bql()
  {
    GMTrace.i(3723602427904L, 27743);
    this.uFV = new LinkedList();
    GMTrace.o(3723602427904L, 27743);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3723736645632L, 27744);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 2, this.uFV);
      paramVarArgs.af(2, this.uFW);
      GMTrace.o(3723736645632L, 27744);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 2, this.uFV);
      int i = b.a.a.b.b.a.cK(2);
      GMTrace.o(3723736645632L, 27744);
      return paramInt + 0 + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uFV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3723736645632L, 27744);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bql localbql = (bql)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3723736645632L, 27744);
        return -1;
      case 1: 
        localbql.uFV.add(Integer.valueOf(locala.xSv.nm()));
        GMTrace.o(3723736645632L, 27744);
        return 0;
      }
      localbql.uFW = locala.cpH();
      GMTrace.o(3723736645632L, 27744);
      return 0;
    }
    GMTrace.o(3723736645632L, 27744);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */