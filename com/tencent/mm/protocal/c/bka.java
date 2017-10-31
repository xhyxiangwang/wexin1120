package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bka
  extends axc
{
  public int jXN;
  public String mDD;
  public int mEh;
  public boolean uAi;
  
  public bka()
  {
    GMTrace.i(20072663875584L, 149553);
    GMTrace.o(20072663875584L, 149553);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20072798093312L, 149554);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mDD != null) {
        paramVarArgs.e(2, this.mDD);
      }
      paramVarArgs.fd(3, this.jXN);
      paramVarArgs.af(4, this.uAi);
      paramVarArgs.fd(5, this.mEh);
      GMTrace.o(20072798093312L, 149554);
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
      if (this.mDD != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mDD);
      }
      paramInt = b.a.a.a.fa(3, this.jXN);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.a.fa(5, this.mEh);
      GMTrace.o(20072798093312L, 149554);
      return i + paramInt + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(20072798093312L, 149554);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bka localbka = (bka)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20072798093312L, 149554);
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
          localbka.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20072798093312L, 149554);
        return 0;
      case 2: 
        localbka.mDD = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20072798093312L, 149554);
        return 0;
      case 3: 
        localbka.jXN = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(20072798093312L, 149554);
        return 0;
      case 4: 
        localbka.uAi = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(20072798093312L, 149554);
        return 0;
      }
      localbka.mEh = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(20072798093312L, 149554);
      return 0;
    }
    GMTrace.o(20072798093312L, 149554);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */