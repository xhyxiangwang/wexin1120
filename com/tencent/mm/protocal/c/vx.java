package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vx
  extends axk
{
  public int lpk;
  public String lpl;
  public LinkedList<ej> tTJ;
  
  public vx()
  {
    GMTrace.i(3986937610240L, 29705);
    this.tTJ = new LinkedList();
    GMTrace.o(3986937610240L, 29705);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3987071827968L, 29706);
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
      paramVarArgs.fd(2, this.lpk);
      if (this.lpl != null) {
        paramVarArgs.e(3, this.lpl);
      }
      paramVarArgs.d(4, 8, this.tTJ);
      GMTrace.o(3987071827968L, 29706);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.lpk);
      paramInt = i;
      if (this.lpl != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lpl);
      }
      i = b.a.a.a.c(4, 8, this.tTJ);
      GMTrace.o(3987071827968L, 29706);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3987071827968L, 29706);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vx localvx = (vx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3987071827968L, 29706);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localvx.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3987071827968L, 29706);
        return 0;
      case 2: 
        localvx.lpk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3987071827968L, 29706);
        return 0;
      case 3: 
        localvx.lpl = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3987071827968L, 29706);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ej();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ej)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
        localvx.tTJ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3987071827968L, 29706);
      return 0;
    }
    GMTrace.o(3987071827968L, 29706);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */