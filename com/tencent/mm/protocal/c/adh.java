package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adh
  extends axc
{
  public int cyK;
  public String fKY;
  public boolean tZa;
  public LinkedList<String> tZb;
  
  public adh()
  {
    GMTrace.i(14998025797632L, 111744);
    this.tZb = new LinkedList();
    GMTrace.o(14998025797632L, 111744);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14998160015360L, 111745);
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
      paramVarArgs.af(3, this.tZa);
      paramVarArgs.d(4, 1, this.tZb);
      paramVarArgs.fd(5, this.cyK);
      GMTrace.o(14998160015360L, 111745);
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
      paramInt = b.a.a.b.b.a.cK(3);
      int j = b.a.a.a.c(4, 1, this.tZb);
      int k = b.a.a.a.fa(5, this.cyK);
      GMTrace.o(14998160015360L, 111745);
      return i + (paramInt + 1) + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tZb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(14998160015360L, 111745);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adh localadh = (adh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14998160015360L, 111745);
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
          localadh.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14998160015360L, 111745);
        return 0;
      case 2: 
        localadh.fKY = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14998160015360L, 111745);
        return 0;
      case 3: 
        localadh.tZa = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(14998160015360L, 111745);
        return 0;
      case 4: 
        localadh.tZb.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(14998160015360L, 111745);
        return 0;
      }
      localadh.cyK = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(14998160015360L, 111745);
      return 0;
    }
    GMTrace.o(14998160015360L, 111745);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/adh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */