package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcl
  extends com.tencent.mm.bl.a
{
  public axt uus;
  
  public bcl()
  {
    GMTrace.i(3641326960640L, 27130);
    GMTrace.o(3641326960640L, 27130);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3641461178368L, 27131);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uus != null)
      {
        paramVarArgs.ff(1, this.uus.aWM());
        this.uus.a(paramVarArgs);
      }
      GMTrace.o(3641461178368L, 27131);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uus != null) {
        paramInt = b.a.a.a.fc(1, this.uus.aWM()) + 0;
      }
      GMTrace.o(3641461178368L, 27131);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3641461178368L, 27131);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcl localbcl = (bcl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3641461178368L, 27131);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbcl.uus = ((axt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3641461178368L, 27131);
      return 0;
    }
    GMTrace.o(3641461178368L, 27131);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */