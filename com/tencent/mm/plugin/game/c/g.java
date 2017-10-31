package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mCK;
  public String mDf;
  public String mDg;
  public String mDh;
  public String mDi;
  public LinkedList<p> mDj;
  
  public g()
  {
    GMTrace.i(12650423517184L, 94253);
    this.mDj = new LinkedList();
    GMTrace.o(12650423517184L, 94253);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12650557734912L, 94254);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      if (this.mCK != null) {
        paramVarArgs.e(2, this.mCK);
      }
      if (this.mDf != null) {
        paramVarArgs.e(3, this.mDf);
      }
      if (this.mDg != null) {
        paramVarArgs.e(4, this.mDg);
      }
      if (this.mDh != null) {
        paramVarArgs.e(5, this.mDh);
      }
      if (this.mDi != null) {
        paramVarArgs.e(6, this.mDi);
      }
      paramVarArgs.d(7, 8, this.mDj);
      GMTrace.o(12650557734912L, 94254);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.fuw != null) {
        i = b.a.a.b.b.a.f(1, this.fuw) + 0;
      }
      paramInt = i;
      if (this.mCK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mCK);
      }
      i = paramInt;
      if (this.mDf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mDf);
      }
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mDg);
      }
      i = paramInt;
      if (this.mDh != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mDh);
      }
      paramInt = i;
      if (this.mDi != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mDi);
      }
      i = b.a.a.a.c(7, 8, this.mDj);
      GMTrace.o(12650557734912L, 94254);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mDj.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12650557734912L, 94254);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12650557734912L, 94254);
        return -1;
      case 1: 
        localg.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 2: 
        localg.mCK = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 3: 
        localg.mDf = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 4: 
        localg.mDg = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 5: 
        localg.mDh = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 6: 
        localg.mDi = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new p();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((p)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localg.mDj.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(12650557734912L, 94254);
      return 0;
    }
    GMTrace.o(12650557734912L, 94254);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */