package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ain
  extends axc
{
  public String mDD;
  public int ude;
  public bta udf;
  
  public ain()
  {
    GMTrace.i(3648306282496L, 27182);
    GMTrace.o(3648306282496L, 27182);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3648440500224L, 27183);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      paramVarArgs.fd(3, this.ude);
      if (this.udf != null)
      {
        paramVarArgs.ff(4, this.udf.aWM());
        this.udf.a(paramVarArgs);
      }
      GMTrace.o(3648440500224L, 27183);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.mDD != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDD);
      }
      i += b.a.a.a.fa(3, this.ude);
      paramInt = i;
      if (this.udf != null) {
        paramInt = i + b.a.a.a.fc(4, this.udf.aWM());
      }
      GMTrace.o(3648440500224L, 27183);
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
      GMTrace.o(3648440500224L, 27183);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ain localain = (ain)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3648440500224L, 27183);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localain.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648440500224L, 27183);
        return 0;
      case 2: 
        localain.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3648440500224L, 27183);
        return 0;
      case 3: 
        localain.ude = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3648440500224L, 27183);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bta();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bta)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localain.udf = ((bta)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3648440500224L, 27183);
      return 0;
    }
    GMTrace.o(3648440500224L, 27183);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */