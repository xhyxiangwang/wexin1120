package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bee
  extends com.tencent.mm.bl.a
{
  public int jWQ;
  public LinkedList<axt> jWR;
  public String mFu;
  public long uwl;
  
  public bee()
  {
    GMTrace.i(3633273896960L, 27070);
    this.jWR = new LinkedList();
    GMTrace.o(3633273896960L, 27070);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3633408114688L, 27071);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.R(1, this.uwl);
      if (this.mFu != null) {
        paramVarArgs.e(2, this.mFu);
      }
      paramVarArgs.fd(3, this.jWQ);
      paramVarArgs.d(4, 8, this.jWR);
      GMTrace.o(3633408114688L, 27071);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.Q(1, this.uwl) + 0;
      paramInt = i;
      if (this.mFu != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFu);
      }
      i = b.a.a.a.fa(3, this.jWQ);
      int j = b.a.a.a.c(4, 8, this.jWR);
      GMTrace.o(3633408114688L, 27071);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jWR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3633408114688L, 27071);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bee localbee = (bee)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3633408114688L, 27071);
        return -1;
      case 1: 
        localbee.uwl = ((b.a.a.a.a)localObject1).xSv.nn();
        GMTrace.o(3633408114688L, 27071);
        return 0;
      case 2: 
        localbee.mFu = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(3633408114688L, 27071);
        return 0;
      case 3: 
        localbee.jWQ = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3633408114688L, 27071);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbee.jWR.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3633408114688L, 27071);
      return 0;
    }
    GMTrace.o(3633408114688L, 27071);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */