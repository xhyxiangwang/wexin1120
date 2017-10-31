package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class wv
  extends com.tencent.mm.bl.a
  implements bcg
{
  public int tUi;
  public int tUj;
  public int tUk;
  public LinkedList<axt> tUl;
  public int tyi;
  
  public wv()
  {
    GMTrace.i(3834332053504L, 28568);
    this.tUl = new LinkedList();
    GMTrace.o(3834332053504L, 28568);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3834600488960L, 28570);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fd(1, this.tyi);
      paramVarArgs.fd(2, this.tUi);
      paramVarArgs.fd(3, this.tUj);
      paramVarArgs.fd(4, this.tUk);
      paramVarArgs.d(5, 8, this.tUl);
      GMTrace.o(3834600488960L, 28570);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fa(1, this.tyi);
      i = b.a.a.a.fa(2, this.tUi);
      int j = b.a.a.a.fa(3, this.tUj);
      int k = b.a.a.a.fa(4, this.tUk);
      int m = b.a.a.a.c(5, 8, this.tUl);
      GMTrace.o(3834600488960L, 28570);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tUl.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(3834600488960L, 28570);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wv localwv = (wv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3834600488960L, 28570);
        return -1;
      case 1: 
        localwv.tyi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      case 2: 
        localwv.tUi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      case 3: 
        localwv.tUj = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      case 4: 
        localwv.tUk = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(3834600488960L, 28570);
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
        localwv.tUl.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3834600488960L, 28570);
      return 0;
    }
    GMTrace.o(3834600488960L, 28570);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(3834466271232L, 28569);
    int i = this.tyi;
    GMTrace.o(3834466271232L, 28569);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/wv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */