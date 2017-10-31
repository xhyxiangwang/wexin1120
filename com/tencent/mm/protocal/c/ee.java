package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ee
  extends axc
{
  public long jXk;
  public int ttY;
  public int tyc;
  public LinkedList<nh> tyd;
  public String tye;
  public String tyf;
  public String tyg;
  
  public ee()
  {
    GMTrace.i(3976871280640L, 29630);
    this.tyd = new LinkedList();
    GMTrace.o(3976871280640L, 29630);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977005498368L, 29631);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      paramVarArgs.fd(2, this.tyc);
      paramVarArgs.d(3, 8, this.tyd);
      if (this.tye != null) {
        paramVarArgs.e(4, this.tye);
      }
      if (this.tyf != null) {
        paramVarArgs.e(5, this.tyf);
      }
      paramVarArgs.fd(6, this.ttY);
      paramVarArgs.R(7, this.jXk);
      if (this.tyg != null) {
        paramVarArgs.e(8, this.tyg);
      }
      GMTrace.o(3977005498368L, 29631);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.tyc) + b.a.a.a.c(3, 8, this.tyd);
      paramInt = i;
      if (this.tye != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tye);
      }
      i = paramInt;
      if (this.tyf != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tyf);
      }
      i = i + b.a.a.a.fa(6, this.ttY) + b.a.a.a.Q(7, this.jXk);
      paramInt = i;
      if (this.tyg != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tyg);
      }
      GMTrace.o(3977005498368L, 29631);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tyd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3977005498368L, 29631);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ee localee = (ee)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977005498368L, 29631);
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
          localee.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 2: 
        localee.tyc = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localee.tyd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 4: 
        localee.tye = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 5: 
        localee.tyf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 6: 
        localee.ttY = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 7: 
        localee.jXk = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      }
      localee.tyg = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(3977005498368L, 29631);
      return 0;
    }
    GMTrace.o(3977005498368L, 29631);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */