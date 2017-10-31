package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class pe
  extends com.tencent.mm.bl.a
{
  public String kns;
  public int tKX;
  public LinkedList<nc> tKY;
  public String title;
  
  public pe()
  {
    GMTrace.i(3908420239360L, 29120);
    this.tKY = new LinkedList();
    GMTrace.o(3908420239360L, 29120);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3908554457088L, 29121);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.kns != null) {
        paramVarArgs.e(2, this.kns);
      }
      paramVarArgs.fd(3, this.tKX);
      paramVarArgs.d(4, 8, this.tKY);
      GMTrace.o(3908554457088L, 29121);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.title != null) {
        paramInt = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      i = paramInt;
      if (this.kns != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.kns);
      }
      paramInt = b.a.a.a.fa(3, this.tKX);
      int j = b.a.a.a.c(4, 8, this.tKY);
      GMTrace.o(3908554457088L, 29121);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tKY.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3908554457088L, 29121);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      pe localpe = (pe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3908554457088L, 29121);
        return -1;
      case 1: 
        localpe.title = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3908554457088L, 29121);
        return 0;
      case 2: 
        localpe.kns = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3908554457088L, 29121);
        return 0;
      case 3: 
        localpe.tKX = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3908554457088L, 29121);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new nc();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((nc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localpe.tKY.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3908554457088L, 29121);
      return 0;
    }
    GMTrace.o(3908554457088L, 29121);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */