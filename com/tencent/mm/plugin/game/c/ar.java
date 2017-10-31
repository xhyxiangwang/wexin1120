package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class ar
  extends axc
{
  public String huS;
  public String mEm;
  public int mFa;
  public int mFb;
  public int mFi;
  public int mFj;
  
  public ar()
  {
    GMTrace.i(12645591678976L, 94217);
    GMTrace.o(12645591678976L, 94217);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645725896704L, 94218);
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
      paramVarArgs.fd(2, this.mFa);
      paramVarArgs.fd(3, this.mFb);
      if (this.mEm != null) {
        paramVarArgs.e(4, this.mEm);
      }
      paramVarArgs.fd(5, this.mFi);
      paramVarArgs.fd(6, this.mFj);
      if (this.huS != null) {
        paramVarArgs.e(7, this.huS);
      }
      GMTrace.o(12645725896704L, 94218);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.urE != null) {
        paramInt = b.a.a.a.fc(1, this.urE.aWM()) + 0;
      }
      i = paramInt + b.a.a.a.fa(2, this.mFa) + b.a.a.a.fa(3, this.mFb);
      paramInt = i;
      if (this.mEm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mEm);
      }
      i = paramInt + b.a.a.a.fa(5, this.mFi) + b.a.a.a.fa(6, this.mFj);
      paramInt = i;
      if (this.huS != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.huS);
      }
      GMTrace.o(12645725896704L, 94218);
      return paramInt;
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
      GMTrace.o(12645725896704L, 94218);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ar localar = (ar)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645725896704L, 94218);
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
          localar.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 2: 
        localar.mFa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 3: 
        localar.mFb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 4: 
        localar.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 5: 
        localar.mFi = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 6: 
        localar.mFj = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      }
      localar.huS = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12645725896704L, 94218);
      return 0;
    }
    GMTrace.o(12645725896704L, 94218);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */