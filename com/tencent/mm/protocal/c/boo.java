package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class boo
  extends com.tencent.mm.bl.a
{
  public int jWQ;
  public LinkedList<bon> uEP;
  
  public boo()
  {
    GMTrace.i(3778094825472L, 28149);
    this.uEP = new LinkedList();
    GMTrace.o(3778094825472L, 28149);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3778229043200L, 28150);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.uEP);
      paramVarArgs.fd(2, this.jWQ);
      GMTrace.o(3778229043200L, 28150);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.uEP);
      i = b.a.a.a.fa(2, this.jWQ);
      GMTrace.o(3778229043200L, 28150);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uEP.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3778229043200L, 28150);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      boo localboo = (boo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3778229043200L, 28150);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bon();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bon)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localboo.uEP.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3778229043200L, 28150);
        return 0;
      }
      localboo.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3778229043200L, 28150);
      return 0;
    }
    GMTrace.o(3778229043200L, 28150);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/boo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */