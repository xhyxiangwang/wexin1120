package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bj
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public LinkedList<bk> mFJ;
  public bl mFK;
  
  public bj()
  {
    GMTrace.i(12648276033536L, 94237);
    this.mFJ = new LinkedList();
    GMTrace.o(12648276033536L, 94237);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12648410251264L, 94238);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      paramVarArgs.d(2, 8, this.mFJ);
      if (this.mFK != null)
      {
        paramVarArgs.ff(3, this.mFK.aWM());
        this.mFK.a(paramVarArgs);
      }
      GMTrace.o(12648410251264L, 94238);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fuw != null) {
        paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.mFJ);
      paramInt = i;
      if (this.mFK != null) {
        paramInt = i + b.a.a.a.fc(3, this.mFK.aWM());
      }
      GMTrace.o(12648410251264L, 94238);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mFJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      GMTrace.o(12648410251264L, 94238);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bj localbj = (bj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12648410251264L, 94238);
        return -1;
      case 1: 
        localbj.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12648410251264L, 94238);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbj.mFJ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12648410251264L, 94238);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bl();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
        localbj.mFK = ((bl)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12648410251264L, 94238);
      return 0;
    }
    GMTrace.o(12648410251264L, 94238);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */