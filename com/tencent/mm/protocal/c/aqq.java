package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqq
  extends com.tencent.mm.bl.a
{
  public int uin;
  public axs umK;
  public int umL;
  public axs umM;
  public int version;
  
  public aqq()
  {
    GMTrace.i(3745345699840L, 27905);
    GMTrace.o(3745345699840L, 27905);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3745479917568L, 27906);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.uin);
      paramVarArgs.fd(2, this.version);
      if (this.umK != null)
      {
        paramVarArgs.ff(3, this.umK.aWM());
        this.umK.a(paramVarArgs);
      }
      paramVarArgs.fd(4, this.umL);
      if (this.umM != null)
      {
        paramVarArgs.ff(5, this.umM.aWM());
        this.umM.a(paramVarArgs);
      }
      GMTrace.o(3745479917568L, 27906);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fa(1, this.uin) + 0 + b.a.a.a.fa(2, this.version);
      paramInt = i;
      if (this.umK != null) {
        paramInt = i + b.a.a.a.fc(3, this.umK.aWM());
      }
      i = paramInt + b.a.a.a.fa(4, this.umL);
      paramInt = i;
      if (this.umM != null) {
        paramInt = i + b.a.a.a.fc(5, this.umM.aWM());
      }
      GMTrace.o(3745479917568L, 27906);
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
      GMTrace.o(3745479917568L, 27906);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqq localaqq = (aqq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3745479917568L, 27906);
        return -1;
      case 1: 
        localaqq.uin = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3745479917568L, 27906);
        return 0;
      case 2: 
        localaqq.version = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3745479917568L, 27906);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localaqq.umK = ((axs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3745479917568L, 27906);
        return 0;
      case 4: 
        localaqq.umL = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3745479917568L, 27906);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localaqq.umM = ((axs)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3745479917568L, 27906);
      return 0;
    }
    GMTrace.o(3745479917568L, 27906);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */