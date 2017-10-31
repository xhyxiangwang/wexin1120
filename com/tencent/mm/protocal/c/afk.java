package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afk
  extends com.tencent.mm.bl.a
{
  public String mCJ;
  public LinkedList<amn> tKd;
  
  public afk()
  {
    GMTrace.i(3678773706752L, 27409);
    this.tKd = new LinkedList();
    GMTrace.o(3678773706752L, 27409);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3678907924480L, 27410);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCJ != null) {
        paramVarArgs.e(1, this.mCJ);
      }
      paramVarArgs.d(2, 8, this.tKd);
      GMTrace.o(3678907924480L, 27410);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.mCJ != null) {
        paramInt = b.a.a.b.b.a.f(1, this.mCJ) + 0;
      }
      i = b.a.a.a.c(2, 8, this.tKd);
      GMTrace.o(3678907924480L, 27410);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tKd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3678907924480L, 27410);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afk localafk = (afk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3678907924480L, 27410);
        return -1;
      case 1: 
        localafk.mCJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3678907924480L, 27410);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new amn();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((amn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localafk.tKd.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3678907924480L, 27410);
      return 0;
    }
    GMTrace.o(3678907924480L, 27410);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */