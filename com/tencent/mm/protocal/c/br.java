package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class br
  extends axk
{
  public int tvd;
  public int tvg;
  public long tvl;
  
  public br()
  {
    GMTrace.i(3886408531968L, 28956);
    GMTrace.o(3886408531968L, 28956);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3886542749696L, 28957);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tvd);
      paramVarArgs.fd(3, this.tvg);
      paramVarArgs.R(4, this.tvl);
      GMTrace.o(3886542749696L, 28957);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.tvd);
      int j = b.a.a.a.fa(3, this.tvg);
      int k = b.a.a.a.Q(4, this.tvl);
      GMTrace.o(3886542749696L, 28957);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3886542749696L, 28957);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      br localbr = (br)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3886542749696L, 28957);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localbr.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3886542749696L, 28957);
        return 0;
      case 2: 
        localbr.tvd = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3886542749696L, 28957);
        return 0;
      case 3: 
        localbr.tvg = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3886542749696L, 28957);
        return 0;
      }
      localbr.tvl = ((b.a.a.a.a)localObject1).xSv.nn();
      GMTrace.o(3886542749696L, 28957);
      return 0;
    }
    GMTrace.o(3886542749696L, 28957);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */