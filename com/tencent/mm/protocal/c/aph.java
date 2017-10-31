package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aph
  extends axc
{
  public int scene;
  public String ulC;
  public String ulF;
  
  public aph()
  {
    GMTrace.i(17874043273216L, 133172);
    GMTrace.o(17874043273216L, 133172);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17874177490944L, 133173);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.ulC != null) {
        paramVarArgs.e(2, this.ulC);
      }
      if (this.ulF != null) {
        paramVarArgs.e(3, this.ulF);
      }
      paramVarArgs.fd(4, this.scene);
      GMTrace.o(17874177490944L, 133173);
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
      if (this.ulC != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ulC);
      }
      i = paramInt;
      if (this.ulF != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ulF);
      }
      paramInt = b.a.a.a.fa(4, this.scene);
      GMTrace.o(17874177490944L, 133173);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(17874177490944L, 133173);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aph localaph = (aph)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17874177490944L, 133173);
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
          localaph.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874177490944L, 133173);
        return 0;
      case 2: 
        localaph.ulC = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874177490944L, 133173);
        return 0;
      case 3: 
        localaph.ulF = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(17874177490944L, 133173);
        return 0;
      }
      localaph.scene = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(17874177490944L, 133173);
      return 0;
    }
    GMTrace.o(17874177490944L, 133173);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */