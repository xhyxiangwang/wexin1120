package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bm
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mDI;
  public LinkedList<bq> mFM;
  
  public bm()
  {
    GMTrace.i(12643444195328L, 94201);
    this.mFM = new LinkedList();
    GMTrace.o(12643444195328L, 94201);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12643578413056L, 94202);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mDI == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      paramVarArgs.d(2, 8, this.mFM);
      if (this.mDI != null) {
        paramVarArgs.e(3, this.mDI);
      }
      GMTrace.o(12643578413056L, 94202);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fuw != null) {
        paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.mFM);
      paramInt = i;
      if (this.mDI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mDI);
      }
      GMTrace.o(12643578413056L, 94202);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mFM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.mDI == null) {
        throw new b("Not all required fields were included: Detail");
      }
      GMTrace.o(12643578413056L, 94202);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bm localbm = (bm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12643578413056L, 94202);
        return -1;
      case 1: 
        localbm.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12643578413056L, 94202);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbm.mFM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643578413056L, 94202);
        return 0;
      }
      localbm.mDI = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12643578413056L, 94202);
      return 0;
    }
    GMTrace.o(12643578413056L, 94202);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */