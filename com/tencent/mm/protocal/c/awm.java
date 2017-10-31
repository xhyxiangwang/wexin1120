package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awm
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public LinkedList<axm> twQ;
  
  public awm()
  {
    GMTrace.i(19141863931904L, 142618);
    this.twQ = new LinkedList();
    GMTrace.o(19141863931904L, 142618);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19141998149632L, 142619);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      paramVarArgs.d(2, 8, this.twQ);
      GMTrace.o(19141998149632L, 142619);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fuw != null) {
        paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;
      }
      i = b.a.a.a.c(2, 8, this.twQ);
      GMTrace.o(19141998149632L, 142619);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.twQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(19141998149632L, 142619);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awm localawm = (awm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19141998149632L, 142619);
        return -1;
      case 1: 
        localawm.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(19141998149632L, 142619);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axm();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localawm.twQ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(19141998149632L, 142619);
      return 0;
    }
    GMTrace.o(19141998149632L, 142619);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/awm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */