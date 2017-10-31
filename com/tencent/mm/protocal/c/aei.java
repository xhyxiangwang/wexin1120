package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aei
  extends axc
{
  public int tZV;
  public int tZW;
  public int ttY;
  
  public aei()
  {
    GMTrace.i(3837955932160L, 28595);
    GMTrace.o(3837955932160L, 28595);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3838090149888L, 28596);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.ttY);
      paramVarArgs.fd(3, this.tZV);
      paramVarArgs.fd(4, this.tZW);
      GMTrace.o(3838090149888L, 28596);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.ttY);
      int j = b.a.a.a.fa(3, this.tZV);
      int k = b.a.a.a.fa(4, this.tZW);
      GMTrace.o(3838090149888L, 28596);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3838090149888L, 28596);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aei localaei = (aei)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3838090149888L, 28596);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localaei.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838090149888L, 28596);
        return 0;
      case 2: 
        localaei.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3838090149888L, 28596);
        return 0;
      case 3: 
        localaei.tZV = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3838090149888L, 28596);
        return 0;
      }
      localaei.tZW = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3838090149888L, 28596);
      return 0;
    }
    GMTrace.o(3838090149888L, 28596);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */