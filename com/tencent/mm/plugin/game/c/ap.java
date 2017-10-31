package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class ap
  extends axc
{
  public String huS;
  public LinkedList<String> mEI;
  public String mEm;
  public int mFa;
  public int mFb;
  public int mFc;
  public boolean mFd;
  
  public ap()
  {
    GMTrace.i(12638612357120L, 94165);
    this.mEI = new LinkedList();
    GMTrace.o(12638612357120L, 94165);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12638746574848L, 94166);
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
      paramVarArgs.d(5, 1, this.mEI);
      if (this.huS != null) {
        paramVarArgs.e(6, this.huS);
      }
      paramVarArgs.fd(7, this.mFc);
      paramVarArgs.af(8, this.mFd);
      GMTrace.o(12638746574848L, 94166);
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
      i = paramInt + b.a.a.a.c(5, 1, this.mEI);
      paramInt = i;
      if (this.huS != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.huS);
      }
      i = b.a.a.a.fa(7, this.mFc);
      int j = b.a.a.b.b.a.cK(8);
      GMTrace.o(12638746574848L, 94166);
      return paramInt + i + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mEI.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = axc.a(paramVarArgs); paramInt > 0; paramInt = axc.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mEm == null) {
        throw new b("Not all required fields were included: Lang");
      }
      GMTrace.o(12638746574848L, 94166);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ap localap = (ap)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12638746574848L, 94166);
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
          localap.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12638746574848L, 94166);
        return 0;
      case 2: 
        localap.mFa = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12638746574848L, 94166);
        return 0;
      case 3: 
        localap.mFb = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12638746574848L, 94166);
        return 0;
      case 4: 
        localap.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12638746574848L, 94166);
        return 0;
      case 5: 
        localap.mEI.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(12638746574848L, 94166);
        return 0;
      case 6: 
        localap.huS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12638746574848L, 94166);
        return 0;
      case 7: 
        localap.mFc = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12638746574848L, 94166);
        return 0;
      }
      localap.mFd = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(12638746574848L, 94166);
      return 0;
    }
    GMTrace.o(12638746574848L, 94166);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */