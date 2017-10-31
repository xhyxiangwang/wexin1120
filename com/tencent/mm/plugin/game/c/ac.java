package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ac
  extends com.tencent.mm.bl.a
{
  public c mCC;
  public String mCG;
  public String mDh;
  public LinkedList<ad> mEd;
  
  public ac()
  {
    GMTrace.i(12643175759872L, 94199);
    this.mEd = new LinkedList();
    GMTrace.o(12643175759872L, 94199);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12643309977600L, 94200);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCC == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.mCC != null)
      {
        paramVarArgs.ff(1, this.mCC.aWM());
        this.mCC.a(paramVarArgs);
      }
      if (this.mCG != null) {
        paramVarArgs.e(2, this.mCG);
      }
      paramVarArgs.d(3, 8, this.mEd);
      if (this.mDh != null) {
        paramVarArgs.e(4, this.mDh);
      }
      GMTrace.o(12643309977600L, 94200);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.mCC != null) {
        paramInt = b.a.a.a.fc(1, this.mCC.aWM()) + 0;
      }
      i = paramInt;
      if (this.mCG != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mCG);
      }
      i += b.a.a.a.c(3, 8, this.mEd);
      paramInt = i;
      if (this.mDh != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDh);
      }
      GMTrace.o(12643309977600L, 94200);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mEd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mCC == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      GMTrace.o(12643309977600L, 94200);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12643309977600L, 94200);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localac.mCC = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643309977600L, 94200);
        return 0;
      case 2: 
        localac.mCG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12643309977600L, 94200);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ad();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ad)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localac.mEd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643309977600L, 94200);
        return 0;
      }
      localac.mDh = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12643309977600L, 94200);
      return 0;
    }
    GMTrace.o(12643309977600L, 94200);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */