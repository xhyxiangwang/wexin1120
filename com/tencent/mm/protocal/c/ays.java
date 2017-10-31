package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ays
  extends axc
{
  public int mFa;
  public int mFb;
  
  public ays()
  {
    GMTrace.i(4012438978560L, 29895);
    GMTrace.o(4012438978560L, 29895);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4012573196288L, 29896);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.mFa);
      paramVarArgs.fd(3, this.mFb);
      GMTrace.o(4012573196288L, 29896);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = b.a.a.a.fa(2, this.mFa);
      int j = b.a.a.a.fa(3, this.mFb);
      GMTrace.o(4012573196288L, 29896);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(4012573196288L, 29896);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ays localays = (ays)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4012573196288L, 29896);
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
          localays.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4012573196288L, 29896);
        return 0;
      case 2: 
        localays.mFa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4012573196288L, 29896);
        return 0;
      }
      localays.mFb = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(4012573196288L, 29896);
      return 0;
    }
    GMTrace.o(4012573196288L, 29896);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ays.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */