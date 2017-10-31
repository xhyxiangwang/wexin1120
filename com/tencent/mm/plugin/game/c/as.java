package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.eo;
import java.util.LinkedList;

public final class as
  extends axk
{
  public boolean mFg;
  public int mFh;
  public LinkedList<c> mFk;
  
  public as()
  {
    GMTrace.i(12641028276224L, 94183);
    this.mFk = new LinkedList();
    GMTrace.o(12641028276224L, 94183);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12641162493952L, 94184);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.urV != null)
      {
        paramVarArgs.ff(1, this.urV.aWM());
        this.urV.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.mFk);
      paramVarArgs.af(3, this.mFg);
      paramVarArgs.fd(4, this.mFh);
      GMTrace.o(12641162493952L, 94184);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urV != null) {
        paramInt = b.a.a.a.fc(1, this.urV.aWM()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.mFk);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.a.fa(4, this.mFh);
      GMTrace.o(12641162493952L, 94184);
      return paramInt + i + (j + 1) + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mFk.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axk.a(paramVarArgs); paramInt > 0; paramInt = axk.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.urV == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(12641162493952L, 94184);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      as localas = (as)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12641162493952L, 94184);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new eo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((eo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localas.urV = ((eo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641162493952L, 94184);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axk.a((b.a.a.a.a)localObject2))) {}
          localas.mFk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641162493952L, 94184);
        return 0;
      case 3: 
        localas.mFg = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12641162493952L, 94184);
        return 0;
      }
      localas.mFh = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(12641162493952L, 94184);
      return 0;
    }
    GMTrace.o(12641162493952L, 94184);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */