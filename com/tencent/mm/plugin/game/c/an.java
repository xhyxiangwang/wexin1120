package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class an
  extends axc
{
  public String huS;
  public LinkedList<String> mEI;
  public m mEJ;
  public int mEK;
  public boolean mEL;
  public String mEm;
  public int mEn;
  
  public an()
  {
    GMTrace.i(12645054808064L, 94213);
    this.mEI = new LinkedList();
    GMTrace.o(12645054808064L, 94213);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645189025792L, 94214);
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
      paramVarArgs.d(3, 1, this.mEI);
      if (this.huS != null) {
        paramVarArgs.e(4, this.huS);
      }
      if (this.mEJ != null)
      {
        paramVarArgs.ff(5, this.mEJ.aWM());
        this.mEJ.a(paramVarArgs);
      }
      paramVarArgs.fd(6, this.mEK);
      paramVarArgs.af(7, this.mEL);
      paramVarArgs.fd(8, this.mEn);
      GMTrace.o(12645189025792L, 94214);
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
      if (this.mEm != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mEm);
      }
      i += b.a.a.a.c(3, 1, this.mEI);
      paramInt = i;
      if (this.huS != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.huS);
      }
      i = paramInt;
      if (this.mEJ != null) {
        i = paramInt + b.a.a.a.fc(5, this.mEJ.aWM());
      }
      paramInt = b.a.a.a.fa(6, this.mEK);
      int j = b.a.a.b.b.a.cK(7);
      int k = b.a.a.a.fa(8, this.mEn);
      GMTrace.o(12645189025792L, 94214);
      return i + paramInt + (j + 1) + k;
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
      GMTrace.o(12645189025792L, 94214);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      an localan = (an)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645189025792L, 94214);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new en();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((en)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localan.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 2: 
        localan.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 3: 
        localan.mEI.add(((b.a.a.a.a)localObject1).xSv.readString());
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 4: 
        localan.huS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, axc.a((b.a.a.a.a)localObject2))) {}
          localan.mEJ = ((m)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 6: 
        localan.mEK = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      case 7: 
        localan.mEL = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12645189025792L, 94214);
        return 0;
      }
      localan.mEn = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(12645189025792L, 94214);
      return 0;
    }
    GMTrace.o(12645189025792L, 94214);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */