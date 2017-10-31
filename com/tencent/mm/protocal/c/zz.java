package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zz
  extends axc
{
  public String mdJ;
  public String mdK;
  public String mdL;
  public pf tsJ;
  public String tss;
  
  public zz()
  {
    GMTrace.i(3962375766016L, 29522);
    GMTrace.o(3962375766016L, 29522);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3962509983744L, 29523);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mdJ != null) {
        paramVarArgs.e(2, this.mdJ);
      }
      if (this.mdK != null) {
        paramVarArgs.e(3, this.mdK);
      }
      if (this.mdL != null) {
        paramVarArgs.e(4, this.mdL);
      }
      if (this.tss != null) {
        paramVarArgs.e(5, this.tss);
      }
      if (this.tsJ != null)
      {
        paramVarArgs.ff(6, this.tsJ.aWM());
        this.tsJ.a(paramVarArgs);
      }
      GMTrace.o(3962509983744L, 29523);
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
      if (this.mdJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mdJ);
      }
      i = paramInt;
      if (this.mdK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mdK);
      }
      paramInt = i;
      if (this.mdL != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mdL);
      }
      i = paramInt;
      if (this.tss != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tss);
      }
      paramInt = i;
      if (this.tsJ != null) {
        paramInt = i + b.a.a.a.fc(6, this.tsJ.aWM());
      }
      GMTrace.o(3962509983744L, 29523);
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
      GMTrace.o(3962509983744L, 29523);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zz localzz = (zz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3962509983744L, 29523);
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
          localzz.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 2: 
        localzz.mdJ = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 3: 
        localzz.mdK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 4: 
        localzz.mdL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      case 5: 
        localzz.tss = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3962509983744L, 29523);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new pf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((pf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
        localzz.tsJ = ((pf)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3962509983744L, 29523);
      return 0;
    }
    GMTrace.o(3962509983744L, 29523);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */