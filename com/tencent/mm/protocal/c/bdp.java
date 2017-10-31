package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdp
  extends com.tencent.mm.bl.a
{
  public int ttY;
  public int uvB;
  public axt uvC;
  
  public bdp()
  {
    GMTrace.i(3637568864256L, 27102);
    GMTrace.o(3637568864256L, 27102);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3637703081984L, 27103);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uvB);
      if (this.uvC != null)
      {
        paramVarArgs.ff(2, this.uvC.aWM());
        this.uvC.a(paramVarArgs);
      }
      paramVarArgs.fd(3, this.ttY);
      GMTrace.o(3637703081984L, 27103);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.uvB) + 0;
      paramInt = i;
      if (this.uvC != null) {
        paramInt = i + b.a.a.a.fc(2, this.uvC.aWM());
      }
      i = b.a.a.a.fa(3, this.ttY);
      GMTrace.o(3637703081984L, 27103);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3637703081984L, 27103);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdp localbdp = (bdp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3637703081984L, 27103);
        return -1;
      case 1: 
        localbdp.uvB = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3637703081984L, 27103);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbdp.uvC = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3637703081984L, 27103);
        return 0;
      }
      localbdp.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3637703081984L, 27103);
      return 0;
    }
    GMTrace.o(3637703081984L, 27103);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */