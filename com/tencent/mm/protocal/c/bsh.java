package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bsh
  extends axc
{
  public String fKY;
  public LinkedList<String> uHb;
  
  public bsh()
  {
    GMTrace.i(14305730756608L, 106586);
    this.uHb = new LinkedList();
    GMTrace.o(14305730756608L, 106586);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14305864974336L, 106587);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fKY != null) {
        paramVarArgs.e(2, this.fKY);
      }
      paramVarArgs.d(3, 1, this.uHb);
      GMTrace.o(14305864974336L, 106587);
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
      if (this.fKY != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fKY);
      }
      paramInt = b.a.a.a.c(3, 1, this.uHb);
      GMTrace.o(14305864974336L, 106587);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uHb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(14305864974336L, 106587);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bsh localbsh = (bsh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14305864974336L, 106587);
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
          localbsh.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14305864974336L, 106587);
        return 0;
      case 2: 
        localbsh.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14305864974336L, 106587);
        return 0;
      }
      localbsh.uHb.add(((b.a.a.a.a)localObject1).xSv.readString());
      GMTrace.o(14305864974336L, 106587);
      return 0;
    }
    GMTrace.o(14305864974336L, 106587);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bsh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */