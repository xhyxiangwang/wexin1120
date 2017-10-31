package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ach
  extends axc
{
  public String code;
  public String fMv;
  public String knp;
  public int scene;
  
  public ach()
  {
    GMTrace.i(4021968437248L, 29966);
    GMTrace.o(4021968437248L, 29966);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4022102654976L, 29967);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.fMv != null) {
        paramVarArgs.e(2, this.fMv);
      }
      paramVarArgs.fd(3, this.scene);
      if (this.knp != null) {
        paramVarArgs.e(4, this.knp);
      }
      if (this.code != null) {
        paramVarArgs.e(5, this.code);
      }
      GMTrace.o(4022102654976L, 29967);
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
      i += b.a.a.a.fa(3, this.scene);
      paramInt = i;
      if (this.knp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.knp);
      }
      i = paramInt;
      if (this.code != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.code);
      }
      GMTrace.o(4022102654976L, 29967);
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
      GMTrace.o(4022102654976L, 29967);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ach localach = (ach)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4022102654976L, 29967);
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
          localach.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4022102654976L, 29967);
        return 0;
      case 2: 
        localach.fMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4022102654976L, 29967);
        return 0;
      case 3: 
        localach.scene = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(4022102654976L, 29967);
        return 0;
      case 4: 
        localach.knp = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(4022102654976L, 29967);
        return 0;
      }
      localach.code = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(4022102654976L, 29967);
      return 0;
    }
    GMTrace.o(4022102654976L, 29967);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */