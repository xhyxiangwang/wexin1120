package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqw
  extends axc
{
  public String orR;
  public int orZ;
  public String osk;
  public at tEh;
  public int umY;
  
  public aqw()
  {
    GMTrace.i(3930431946752L, 29284);
    GMTrace.o(3930431946752L, 29284);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3930566164480L, 29285);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.umY);
      if (this.orR != null) {
        paramVarArgs.e(3, this.orR);
      }
      paramVarArgs.fd(4, this.orZ);
      if (this.osk != null) {
        paramVarArgs.e(5, this.osk);
      }
      if (this.tEh != null)
      {
        paramVarArgs.ff(6, this.tEh.aWM());
        this.tEh.a(paramVarArgs);
      }
      GMTrace.o(3930566164480L, 29285);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.umY);
      paramInt = i;
      if (this.orR != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.orR);
      }
      i = paramInt + b.a.a.a.fa(4, this.orZ);
      paramInt = i;
      if (this.osk != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.osk);
      }
      i = paramInt;
      if (this.tEh != null) {
        i = paramInt + b.a.a.a.fc(6, this.tEh.aWM());
      }
      GMTrace.o(3930566164480L, 29285);
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
      GMTrace.o(3930566164480L, 29285);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqw localaqw = (aqw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3930566164480L, 29285);
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
          localaqw.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 2: 
        localaqw.umY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 3: 
        localaqw.orR = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 4: 
        localaqw.orZ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      case 5: 
        localaqw.osk = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3930566164480L, 29285);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localaqw.tEh = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3930566164480L, 29285);
      return 0;
    }
    GMTrace.o(3930566164480L, 29285);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */