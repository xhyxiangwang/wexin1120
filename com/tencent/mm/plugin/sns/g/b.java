package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.amn;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bl.a
{
  public amn fNf;
  public int hzl;
  public String qhV;
  public int qhW;
  
  public b()
  {
    GMTrace.i(8866423111680L, 66060);
    GMTrace.o(8866423111680L, 66060);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8866557329408L, 66061);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fNf != null)
      {
        paramVarArgs.ff(1, this.fNf.aWM());
        this.fNf.a(paramVarArgs);
      }
      if (this.qhV != null) {
        paramVarArgs.e(2, this.qhV);
      }
      paramVarArgs.fd(3, this.hzl);
      paramVarArgs.fd(4, this.qhW);
      GMTrace.o(8866557329408L, 66061);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fNf != null) {
        paramInt = b.a.a.a.fc(1, this.fNf.aWM()) + 0;
      }
      i = paramInt;
      if (this.qhV != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.qhV);
      }
      paramInt = b.a.a.a.fa(3, this.hzl);
      int j = b.a.a.a.fa(4, this.qhW);
      GMTrace.o(8866557329408L, 66061);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(8866557329408L, 66061);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(8866557329408L, 66061);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((amn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localb.fNf = ((amn)localObject1);
          paramInt += 1;
        }
        GMTrace.o(8866557329408L, 66061);
        return 0;
      case 2: 
        localb.qhV = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(8866557329408L, 66061);
        return 0;
      case 3: 
        localb.hzl = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(8866557329408L, 66061);
        return 0;
      }
      localb.qhW = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(8866557329408L, 66061);
      return 0;
    }
    GMTrace.o(8866557329408L, 66061);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */