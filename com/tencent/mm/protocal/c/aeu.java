package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aeu
  extends axc
{
  public double uat;
  public double uau;
  public String uav;
  public boolean uaw;
  
  public aeu()
  {
    GMTrace.i(14306267627520L, 106590);
    GMTrace.o(14306267627520L, 106590);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14306401845248L, 106591);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.uat);
      paramVarArgs.a(3, this.uau);
      if (this.uav != null) {
        paramVarArgs.e(4, this.uav);
      }
      paramVarArgs.af(5, this.uaw);
      GMTrace.o(14306401845248L, 106591);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8);
      paramInt = i;
      if (this.uav != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uav);
      }
      i = b.a.a.b.b.a.cK(5);
      GMTrace.o(14306401845248L, 106591);
      return paramInt + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(14306401845248L, 106591);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aeu localaeu = (aeu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14306401845248L, 106591);
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
          localaeu.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14306401845248L, 106591);
        return 0;
      case 2: 
        localaeu.uat = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(14306401845248L, 106591);
        return 0;
      case 3: 
        localaeu.uau = ((b.a.a.a.a)localObject1).xSv.readDouble();
        GMTrace.o(14306401845248L, 106591);
        return 0;
      case 4: 
        localaeu.uav = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(14306401845248L, 106591);
        return 0;
      }
      localaeu.uaw = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(14306401845248L, 106591);
      return 0;
    }
    GMTrace.o(14306401845248L, 106591);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */