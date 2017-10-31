package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class at
  extends axc
{
  public String mCH;
  
  public at()
  {
    GMTrace.i(12645323243520L, 94215);
    GMTrace.o(12645323243520L, 94215);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645457461248L, 94216);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mCH != null) {
        paramVarArgs.e(2, this.mCH);
      }
      GMTrace.o(12645457461248L, 94216);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt;
      if (this.mCH != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mCH);
      }
      GMTrace.o(12645457461248L, 94216);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      GMTrace.o(12645457461248L, 94216);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      at localat = (at)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645457461248L, 94216);
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
          localat.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645457461248L, 94216);
        return 0;
      }
      localat.mCH = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12645457461248L, 94216);
      return 0;
    }
    GMTrace.o(12645457461248L, 94216);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */