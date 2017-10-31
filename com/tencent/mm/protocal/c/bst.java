package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import java.util.LinkedList;

public final class bst
  extends axc
{
  public b tAZ;
  public String uHG;
  public String uHH;
  
  public bst()
  {
    GMTrace.i(15344844406784L, 114328);
    GMTrace.o(15344844406784L, 114328);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344978624512L, 114329);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uHG != null) {
        paramVarArgs.e(2, this.uHG);
      }
      if (this.tAZ != null) {
        paramVarArgs.b(3, this.tAZ);
      }
      if (this.uHH != null) {
        paramVarArgs.e(4, this.uHH);
      }
      GMTrace.o(15344978624512L, 114329);
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
      if (this.uHG != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uHG);
      }
      i = paramInt;
      if (this.tAZ != null) {
        i = paramInt + b.a.a.a.a(3, this.tAZ);
      }
      paramInt = i;
      if (this.uHH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uHH);
      }
      GMTrace.o(15344978624512L, 114329);
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
      GMTrace.o(15344978624512L, 114329);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bst localbst = (bst)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15344978624512L, 114329);
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
          localbst.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344978624512L, 114329);
        return 0;
      case 2: 
        localbst.uHG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15344978624512L, 114329);
        return 0;
      case 3: 
        localbst.tAZ = ((b.a.a.a.a)localObject1).cpI();
        GMTrace.o(15344978624512L, 114329);
        return 0;
      }
      localbst.uHH = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(15344978624512L, 114329);
      return 0;
    }
    GMTrace.o(15344978624512L, 114329);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */