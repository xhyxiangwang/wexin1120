package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xo
  extends axc
{
  public double latitude;
  public double longitude;
  public int scene;
  public String tUu;
  
  public xo()
  {
    GMTrace.i(3879563427840L, 28905);
    GMTrace.o(3879563427840L, 28905);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3879697645568L, 28906);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.latitude);
      paramVarArgs.a(3, this.longitude);
      paramVarArgs.fd(4, this.scene);
      if (this.tUu != null) {
        paramVarArgs.e(5, this.tUu);
      }
      GMTrace.o(3879697645568L, 28906);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8) + b.a.a.a.fa(4, this.scene);
      paramInt = i;
      if (this.tUu != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tUu);
      }
      GMTrace.o(3879697645568L, 28906);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3879697645568L, 28906);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xo localxo = (xo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3879697645568L, 28906);
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
          localxo.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3879697645568L, 28906);
        return 0;
      case 2: 
        localxo.latitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3879697645568L, 28906);
        return 0;
      case 3: 
        localxo.longitude = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(3879697645568L, 28906);
        return 0;
      case 4: 
        localxo.scene = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3879697645568L, 28906);
        return 0;
      }
      localxo.tUu = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3879697645568L, 28906);
      return 0;
    }
    GMTrace.o(3879697645568L, 28906);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */