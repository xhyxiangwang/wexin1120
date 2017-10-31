package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xk
  extends axc
{
  public String fMv;
  
  public xk()
  {
    GMTrace.i(3632737026048L, 27066);
    GMTrace.o(3632737026048L, 27066);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3632871243776L, 27067);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fMv == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fMv != null) {
        paramVarArgs.e(2, this.fMv);
      }
      GMTrace.o(3632871243776L, 27067);
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
      if (this.fMv != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fMv);
      }
      GMTrace.o(3632871243776L, 27067);
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
      if (this.fMv == null) {
        throw new b("Not all required fields were included: card_id");
      }
      GMTrace.o(3632871243776L, 27067);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xk localxk = (xk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3632871243776L, 27067);
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
          localxk.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3632871243776L, 27067);
        return 0;
      }
      localxk.fMv = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3632871243776L, 27067);
      return 0;
    }
    GMTrace.o(3632871243776L, 27067);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */