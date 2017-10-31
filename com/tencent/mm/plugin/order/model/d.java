package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bl.a
{
  public int month;
  public String orL;
  public int year;
  
  public d()
  {
    GMTrace.i(6627134537728L, 49376);
    GMTrace.o(6627134537728L, 49376);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6627268755456L, 49377);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.year);
      paramVarArgs.fd(2, this.month);
      if (this.orL != null) {
        paramVarArgs.e(3, this.orL);
      }
      GMTrace.o(6627268755456L, 49377);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fa(1, this.year) + 0 + b.a.a.a.fa(2, this.month);
      paramInt = i;
      if (this.orL != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.orL);
      }
      GMTrace.o(6627268755456L, 49377);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(6627268755456L, 49377);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(6627268755456L, 49377);
        return -1;
      case 1: 
        locald.year = locala.xSv.nm();
        GMTrace.o(6627268755456L, 49377);
        return 0;
      case 2: 
        locald.month = locala.xSv.nm();
        GMTrace.o(6627268755456L, 49377);
        return 0;
      }
      locald.orL = locala.xSv.readString();
      GMTrace.o(6627268755456L, 49377);
      return 0;
    }
    GMTrace.o(6627268755456L, 49377);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */