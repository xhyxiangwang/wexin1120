package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amg
  extends axc
{
  public String fMv;
  public int scene;
  public int uhb;
  public int uhc;
  
  public amg()
  {
    GMTrace.i(3949490864128L, 29426);
    GMTrace.o(3949490864128L, 29426);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3949625081856L, 29427);
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
      paramVarArgs.fd(3, this.uhb);
      paramVarArgs.fd(4, this.uhc);
      paramVarArgs.fd(5, this.scene);
      GMTrace.o(3949625081856L, 29427);
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
      paramInt = b.a.a.a.fa(3, this.uhb);
      int j = b.a.a.a.fa(4, this.uhc);
      int k = b.a.a.a.fa(5, this.scene);
      GMTrace.o(3949625081856L, 29427);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3949625081856L, 29427);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amg localamg = (amg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3949625081856L, 29427);
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
          localamg.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949625081856L, 29427);
        return 0;
      case 2: 
        localamg.fMv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3949625081856L, 29427);
        return 0;
      case 3: 
        localamg.uhb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949625081856L, 29427);
        return 0;
      case 4: 
        localamg.uhc = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3949625081856L, 29427);
        return 0;
      }
      localamg.scene = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3949625081856L, 29427);
      return 0;
    }
    GMTrace.o(3949625081856L, 29427);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */