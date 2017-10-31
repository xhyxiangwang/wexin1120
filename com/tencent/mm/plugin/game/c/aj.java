package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class aj
  extends axc
{
  public String huS;
  public String mEm;
  public int mEn;
  
  public aj()
  {
    GMTrace.i(16562064982016L, 123397);
    GMTrace.o(16562064982016L, 123397);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16562199199744L, 123398);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mEm == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mEm != null) {
        paramVarArgs.e(2, this.mEm);
      }
      if (this.huS != null) {
        paramVarArgs.e(3, this.huS);
      }
      paramVarArgs.fd(4, this.mEn);
      GMTrace.o(16562199199744L, 123398);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.urE != null) {
        i = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      paramInt = i;
      if (this.mEm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mEm);
      }
      i = paramInt;
      if (this.huS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.huS);
      }
      paramInt = b.a.a.a.fa(4, this.mEn);
      GMTrace.o(16562199199744L, 123398);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mEm == null) {
        throw new b("Not all required fields were included: Lang");
      }
      GMTrace.o(16562199199744L, 123398);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aj localaj = (aj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16562199199744L, 123398);
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
          localaj.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16562199199744L, 123398);
        return 0;
      case 2: 
        localaj.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(16562199199744L, 123398);
        return 0;
      case 3: 
        localaj.huS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(16562199199744L, 123398);
        return 0;
      }
      localaj.mEn = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(16562199199744L, 123398);
      return 0;
    }
    GMTrace.o(16562199199744L, 123398);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */