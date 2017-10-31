package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ats
  extends axc
{
  public int tNa;
  public long tNb;
  public long uoJ;
  public long uoM;
  public String upg;
  public int uph;
  public int upi;
  
  public ats()
  {
    GMTrace.i(3745614135296L, 27907);
    GMTrace.o(3745614135296L, 27907);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3745748353024L, 27908);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.upg == null) {
        throw new b("Not all required fields were included: FromUsername");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.upg != null) {
        paramVarArgs.e(2, this.upg);
      }
      paramVarArgs.fd(3, this.tNa);
      paramVarArgs.R(4, this.tNb);
      paramVarArgs.R(5, this.uoJ);
      paramVarArgs.fd(6, this.uph);
      paramVarArgs.R(7, this.uoM);
      paramVarArgs.fd(8, this.upi);
      GMTrace.o(3745748353024L, 27908);
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
      if (this.upg != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.upg);
      }
      paramInt = b.a.a.a.fa(3, this.tNa);
      int j = b.a.a.a.Q(4, this.tNb);
      int k = b.a.a.a.Q(5, this.uoJ);
      int m = b.a.a.a.fa(6, this.uph);
      int n = b.a.a.a.Q(7, this.uoM);
      int i1 = b.a.a.a.fa(8, this.upi);
      GMTrace.o(3745748353024L, 27908);
      return i + paramInt + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.upg == null) {
        throw new b("Not all required fields were included: FromUsername");
      }
      GMTrace.o(3745748353024L, 27908);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ats localats = (ats)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3745748353024L, 27908);
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
          localats.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 2: 
        localats.upg = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 3: 
        localats.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 4: 
        localats.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 5: 
        localats.uoJ = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 6: 
        localats.uph = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 7: 
        localats.uoM = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      }
      localats.upi = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(3745748353024L, 27908);
      return 0;
    }
    GMTrace.o(3745748353024L, 27908);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */