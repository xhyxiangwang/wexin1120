package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class fs
  extends axc
{
  public LinkedList<bsw> tzt;
  
  public fs()
  {
    GMTrace.i(15349139374080L, 114360);
    this.tzt = new LinkedList();
    GMTrace.o(15349139374080L, 114360);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15349273591808L, 114361);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tzt);
      GMTrace.o(15349273591808L, 114361);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.tzt);
      GMTrace.o(15349273591808L, 114361);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tzt.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15349273591808L, 114361);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      fs localfs = (fs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15349273591808L, 114361);
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
          localfs.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15349273591808L, 114361);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bsw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bsw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localfs.tzt.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(15349273591808L, 114361);
      return 0;
    }
    GMTrace.o(15349273591808L, 114361);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */