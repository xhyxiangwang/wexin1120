package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;

public final class k
  extends com.tencent.mm.bl.a
{
  public String osy;
  public String osz;
  
  public k()
  {
    GMTrace.i(6625389707264L, 49363);
    GMTrace.o(6625389707264L, 49363);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6625523924992L, 49364);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.osy != null) {
        paramVarArgs.e(1, this.osy);
      }
      if (this.osz != null) {
        paramVarArgs.e(2, this.osz);
      }
      GMTrace.o(6625523924992L, 49364);
      return 0;
    }
    if (paramInt == 1) {
      if (this.osy == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.osy) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.osz != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.osz);
      }
      GMTrace.o(6625523924992L, 49364);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cpJ();
          }
        }
        GMTrace.o(6625523924992L, 49364);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6625523924992L, 49364);
          return -1;
        case 1: 
          localk.osy = locala.xSv.readString();
          GMTrace.o(6625523924992L, 49364);
          return 0;
        }
        localk.osz = locala.xSv.readString();
        GMTrace.o(6625523924992L, 49364);
        return 0;
      }
      GMTrace.o(6625523924992L, 49364);
      return -1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */