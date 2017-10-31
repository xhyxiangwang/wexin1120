package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class arl
  extends axc
{
  public at tEh;
  public int tsr;
  public b unA;
  public int unB;
  public int unC;
  public String uny;
  public String unz;
  
  public arl()
  {
    GMTrace.i(3874731589632L, 28869);
    GMTrace.o(3874731589632L, 28869);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3874865807360L, 28870);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uny != null) {
        paramVarArgs.e(2, this.uny);
      }
      if (this.unz != null) {
        paramVarArgs.e(3, this.unz);
      }
      if (this.unA != null) {
        paramVarArgs.b(4, this.unA);
      }
      paramVarArgs.fd(5, this.unB);
      paramVarArgs.fd(6, this.tsr);
      paramVarArgs.fd(7, this.unC);
      if (this.tEh != null)
      {
        paramVarArgs.ff(8, this.tEh.aWM());
        this.tEh.a(paramVarArgs);
      }
      GMTrace.o(3874865807360L, 28870);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.uny != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uny);
      }
      i = paramInt;
      if (this.unz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.unz);
      }
      paramInt = i;
      if (this.unA != null) {
        paramInt = i + b.a.a.a.a(4, this.unA);
      }
      i = paramInt + b.a.a.a.fa(5, this.unB) + b.a.a.a.fa(6, this.tsr) + b.a.a.a.fa(7, this.unC);
      paramInt = i;
      if (this.tEh != null) {
        paramInt = i + b.a.a.a.fc(8, this.tEh.aWM());
      }
      GMTrace.o(3874865807360L, 28870);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3874865807360L, 28870);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arl localarl = (arl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3874865807360L, 28870);
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
          localarl.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 2: 
        localarl.uny = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 3: 
        localarl.unz = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 4: 
        localarl.unA = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 5: 
        localarl.unB = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 6: 
        localarl.tsr = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3874865807360L, 28870);
        return 0;
      case 7: 
        localarl.unC = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3874865807360L, 28870);
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
        localarl.tEh = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3874865807360L, 28870);
      return 0;
    }
    GMTrace.o(3874865807360L, 28870);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/arl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */