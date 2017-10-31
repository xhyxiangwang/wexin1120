package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bco
  extends com.tencent.mm.bl.a
{
  public int twh;
  public axt uus;
  public axt uuu;
  public int uuv;
  
  public bco()
  {
    GMTrace.i(3670854860800L, 27350);
    GMTrace.o(3670854860800L, 27350);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3670989078528L, 27351);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uus != null)
      {
        paramVarArgs.ff(1, this.uus.aWM());
        this.uus.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.twh);
      if (this.uuu != null)
      {
        paramVarArgs.ff(3, this.uuu.aWM());
        this.uuu.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.uuv);
      GMTrace.o(3670989078528L, 27351);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uus != null) {
        paramInt = b.a.a.a.fc(1, this.uus.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.twh);
      paramInt = i;
      if (this.uuu != null) {
        paramInt = i + b.a.a.a.fc(3, this.uuu.aWM());
      }
      i = b.a.a.a.fa(4, this.uuv);
      GMTrace.o(3670989078528L, 27351);
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
      GMTrace.o(3670989078528L, 27351);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bco localbco = (bco)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3670989078528L, 27351);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbco.uus = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3670989078528L, 27351);
        return 0;
      case 2: 
        localbco.twh = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3670989078528L, 27351);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbco.uuu = ((axt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3670989078528L, 27351);
        return 0;
      }
      localbco.uuv = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3670989078528L, 27351);
      return 0;
    }
    GMTrace.o(3670989078528L, 27351);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */