package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class er
  extends axc
{
  public int jWQ;
  public LinkedList<Integer> tyV;
  
  public er()
  {
    GMTrace.i(3635152945152L, 27084);
    this.tyV = new LinkedList();
    GMTrace.o(3635152945152L, 27084);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3635287162880L, 27085);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.jWQ);
      paramVarArgs.c(3, this.tyV);
      GMTrace.o(3635287162880L, 27085);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.jWQ);
      int j = b.a.a.a.b(3, this.tyV);
      GMTrace.o(3635287162880L, 27085);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tyV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3635287162880L, 27085);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      er localer = (er)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3635287162880L, 27085);
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
          localer.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3635287162880L, 27085);
        return 0;
      case 2: 
        localer.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3635287162880L, 27085);
        return 0;
      }
      localer.tyV = new b.a.a.a.a(((b.a.a.a.a)localObject1).cpI().toK, unknownTagHandler).cpF();
      GMTrace.o(3635287162880L, 27085);
      return 0;
    }
    GMTrace.o(3635287162880L, 27085);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */