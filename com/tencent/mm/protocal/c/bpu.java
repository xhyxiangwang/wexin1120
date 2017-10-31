package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpu
  extends com.tencent.mm.bl.a
{
  public LinkedList<String> txY;
  
  public bpu()
  {
    GMTrace.i(3724139298816L, 27747);
    this.txY = new LinkedList();
    GMTrace.o(3724139298816L, 27747);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3724273516544L, 27748);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 1, this.txY);
      GMTrace.o(3724273516544L, 27748);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.txY);
      GMTrace.o(3724273516544L, 27748);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.txY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3724273516544L, 27748);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpu localbpu = (bpu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3724273516544L, 27748);
        return -1;
      }
      localbpu.txY.add(locala.xSv.readString());
      GMTrace.o(3724273516544L, 27748);
      return 0;
    }
    GMTrace.o(3724273516544L, 27748);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */