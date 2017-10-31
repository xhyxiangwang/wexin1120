package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqp
  extends com.tencent.mm.bl.a
{
  public LinkedList<bqi> tYL;
  public boolean uFC;
  
  public bqp()
  {
    GMTrace.i(3831379263488L, 28546);
    this.tYL = new LinkedList();
    GMTrace.o(3831379263488L, 28546);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3831513481216L, 28547);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.af(1, this.uFC);
      paramVarArgs.d(2, 8, this.tYL);
      GMTrace.o(3831513481216L, 28547);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      i = b.a.a.a.c(2, 8, this.tYL);
      GMTrace.o(3831513481216L, 28547);
      return paramInt + 1 + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tYL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3831513481216L, 28547);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqp localbqp = (bqp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3831513481216L, 28547);
        return -1;
      case 1: 
        localbqp.uFC = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3831513481216L, 28547);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bqi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bqi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbqp.tYL.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3831513481216L, 28547);
      return 0;
    }
    GMTrace.o(3831513481216L, 28547);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */