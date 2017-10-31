package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class af
  extends axc
{
  public String mCH;
  public int mEf;
  public int mEg;
  
  public af()
  {
    GMTrace.i(12639686098944L, 94173);
    GMTrace.o(12639686098944L, 94173);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12639820316672L, 94174);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mCH != null) {
        paramVarArgs.e(2, this.mCH);
      }
      paramVarArgs.fd(3, this.mEf);
      paramVarArgs.fd(4, this.mEg);
      GMTrace.o(12639820316672L, 94174);
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
      paramInt = b.a.a.a.fa(3, this.mEf);
      int j = b.a.a.a.fa(4, this.mEg);
      GMTrace.o(12639820316672L, 94174);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(12639820316672L, 94174);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      af localaf = (af)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12639820316672L, 94174);
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
          localaf.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12639820316672L, 94174);
        return 0;
      case 2: 
        localaf.mCH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12639820316672L, 94174);
        return 0;
      case 3: 
        localaf.mEf = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12639820316672L, 94174);
        return 0;
      }
      localaf.mEg = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(12639820316672L, 94174);
      return 0;
    }
    GMTrace.o(12639820316672L, 94174);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */