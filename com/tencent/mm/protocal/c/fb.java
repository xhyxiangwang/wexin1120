package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class fb
  extends axc
{
  public int jWQ;
  public int tzb;
  public LinkedList<axt> tzc;
  
  public fb()
  {
    GMTrace.i(3923184189440L, 29230);
    this.tzc = new LinkedList();
    GMTrace.o(3923184189440L, 29230);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3923318407168L, 29231);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tzb);
      paramVarArgs.fd(3, this.jWQ);
      paramVarArgs.d(4, 8, this.tzc);
      GMTrace.o(3923318407168L, 29231);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.tzb);
      int j = b.a.a.a.fa(3, this.jWQ);
      int k = b.a.a.a.c(4, 8, this.tzc);
      GMTrace.o(3923318407168L, 29231);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tzc.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3923318407168L, 29231);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      fb localfb = (fb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3923318407168L, 29231);
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
          localfb.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923318407168L, 29231);
        return 0;
      case 2: 
        localfb.tzb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3923318407168L, 29231);
        return 0;
      case 3: 
        localfb.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3923318407168L, 29231);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localfb.tzc.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3923318407168L, 29231);
      return 0;
    }
    GMTrace.o(3923318407168L, 29231);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */