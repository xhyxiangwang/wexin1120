package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class atd
  extends axc
{
  public String mGA;
  public int tNa;
  public long tNb;
  public long uoJ;
  public int uoK;
  public String uoL;
  public long uoM;
  
  public atd()
  {
    GMTrace.i(3635958251520L, 27090);
    GMTrace.o(3635958251520L, 27090);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3636092469248L, 27091);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tNa);
      paramVarArgs.R(3, this.tNb);
      if (this.mGA != null) {
        paramVarArgs.e(4, this.mGA);
      }
      paramVarArgs.R(5, this.uoJ);
      paramVarArgs.fd(6, this.uoK);
      if (this.uoL != null) {
        paramVarArgs.e(7, this.uoL);
      }
      paramVarArgs.R(8, this.uoM);
      GMTrace.o(3636092469248L, 27091);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tNa) + b.a.a.a.Q(3, this.tNb);
      paramInt = i;
      if (this.mGA != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mGA);
      }
      i = paramInt + b.a.a.a.Q(5, this.uoJ) + b.a.a.a.fa(6, this.uoK);
      paramInt = i;
      if (this.uoL != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uoL);
      }
      i = b.a.a.a.Q(8, this.uoM);
      GMTrace.o(3636092469248L, 27091);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3636092469248L, 27091);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      atd localatd = (atd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3636092469248L, 27091);
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
          localatd.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 2: 
        localatd.tNa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 3: 
        localatd.tNb = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 4: 
        localatd.mGA = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 5: 
        localatd.uoJ = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 6: 
        localatd.uoK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      case 7: 
        localatd.uoL = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3636092469248L, 27091);
        return 0;
      }
      localatd.uoM = ((b.a.a.a.a)localObject1).xSv.nn();
      GMTrace.o(3636092469248L, 27091);
      return 0;
    }
    GMTrace.o(3636092469248L, 27091);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */