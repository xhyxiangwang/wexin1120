package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xs
  extends com.tencent.mm.bl.a
{
  public int tUA;
  public String tUu;
  public kd tUx;
  public String tUy;
  public boolean tUz;
  
  public xs()
  {
    GMTrace.i(3966402297856L, 29552);
    GMTrace.o(3966402297856L, 29552);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3966536515584L, 29553);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUx != null)
      {
        paramVarArgs.ff(1, this.tUx.aWM());
        this.tUx.a(paramVarArgs);
      }
      if (this.tUu != null) {
        paramVarArgs.e(2, this.tUu);
      }
      if (this.tUy != null) {
        paramVarArgs.e(3, this.tUy);
      }
      paramVarArgs.af(4, this.tUz);
      paramVarArgs.fd(5, this.tUA);
      GMTrace.o(3966536515584L, 29553);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tUx != null) {
        i = b.a.a.a.fc(1, this.tUx.aWM()) + 0;
      }
      paramInt = i;
      if (this.tUu != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tUu);
      }
      i = paramInt;
      if (this.tUy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUy);
      }
      paramInt = b.a.a.b.b.a.cK(4);
      int j = b.a.a.a.fa(5, this.tUA);
      GMTrace.o(3966536515584L, 29553);
      return i + (paramInt + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3966536515584L, 29553);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xs localxs = (xs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3966536515584L, 29553);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((kd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localxs.tUx = ((kd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3966536515584L, 29553);
        return 0;
      case 2: 
        localxs.tUu = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3966536515584L, 29553);
        return 0;
      case 3: 
        localxs.tUy = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3966536515584L, 29553);
        return 0;
      case 4: 
        localxs.tUz = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(3966536515584L, 29553);
        return 0;
      }
      localxs.tUA = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3966536515584L, 29553);
      return 0;
    }
    GMTrace.o(3966536515584L, 29553);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */