package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axn
  extends axc
{
  public String urX;
  public String urY;
  
  public axn()
  {
    GMTrace.i(3705885687808L, 27611);
    GMTrace.o(3705885687808L, 27611);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3706019905536L, 27612);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.urX != null) {
        paramVarArgs.e(2, this.urX);
      }
      if (this.urY != null) {
        paramVarArgs.e(3, this.urY);
      }
      GMTrace.o(3706019905536L, 27612);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.urX != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.urX);
      }
      i = paramInt;
      if (this.urY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.urY);
      }
      GMTrace.o(3706019905536L, 27612);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3706019905536L, 27612);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axn localaxn = (axn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3706019905536L, 27612);
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
          localaxn.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3706019905536L, 27612);
        return 0;
      case 2: 
        localaxn.urX = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3706019905536L, 27612);
        return 0;
      }
      localaxn.urY = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3706019905536L, 27612);
      return 0;
    }
    GMTrace.o(3706019905536L, 27612);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */