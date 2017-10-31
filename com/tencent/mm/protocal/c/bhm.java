package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhm
  extends axc
{
  public String fEf;
  public String uwG;
  public String uwH;
  public String uwI;
  
  public bhm()
  {
    GMTrace.i(20214934667264L, 150613);
    GMTrace.o(20214934667264L, 150613);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20215068884992L, 150614);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.uwH != null) {
        paramVarArgs.e(2, this.uwH);
      }
      if (this.uwG != null) {
        paramVarArgs.e(3, this.uwG);
      }
      if (this.uwI != null) {
        paramVarArgs.e(4, this.uwI);
      }
      if (this.fEf != null) {
        paramVarArgs.e(5, this.fEf);
      }
      GMTrace.o(20215068884992L, 150614);
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
      if (this.uwH != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uwH);
      }
      i = paramInt;
      if (this.uwG != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uwG);
      }
      paramInt = i;
      if (this.uwI != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uwI);
      }
      i = paramInt;
      if (this.fEf != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.fEf);
      }
      GMTrace.o(20215068884992L, 150614);
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
      GMTrace.o(20215068884992L, 150614);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhm localbhm = (bhm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20215068884992L, 150614);
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
          localbhm.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20215068884992L, 150614);
        return 0;
      case 2: 
        localbhm.uwH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20215068884992L, 150614);
        return 0;
      case 3: 
        localbhm.uwG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20215068884992L, 150614);
        return 0;
      case 4: 
        localbhm.uwI = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(20215068884992L, 150614);
        return 0;
      }
      localbhm.fEf = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(20215068884992L, 150614);
      return 0;
    }
    GMTrace.o(20215068884992L, 150614);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */