package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.en;
import java.util.LinkedList;

public final class al
  extends axc
{
  public String huS;
  public String mCH;
  public String mEm;
  public boolean mEv;
  public boolean mEw;
  public boolean mEx;
  
  public al()
  {
    GMTrace.i(12653107871744L, 94273);
    GMTrace.o(12653107871744L, 94273);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12653242089472L, 94274);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mEm == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.urE != null)
      {
        paramVarArgs.ff(1, this.urE.aWM());
        this.urE.a(paramVarArgs);
      }
      if (this.mEm != null) {
        paramVarArgs.e(2, this.mEm);
      }
      if (this.mCH != null) {
        paramVarArgs.e(3, this.mCH);
      }
      paramVarArgs.af(4, this.mEv);
      if (this.huS != null) {
        paramVarArgs.e(5, this.huS);
      }
      paramVarArgs.af(6, this.mEw);
      paramVarArgs.af(7, this.mEx);
      GMTrace.o(12653242089472L, 94274);
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
      if (this.mCH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mCH);
      }
      i += b.a.a.b.b.a.cK(4) + 1;
      paramInt = i;
      if (this.huS != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.huS);
      }
      i = b.a.a.b.b.a.cK(6);
      int j = b.a.a.b.b.a.cK(7);
      GMTrace.o(12653242089472L, 94274);
      return paramInt + (i + 1) + (j + 1);
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
      if (this.mCH == null) {
        throw new b("Not all required fields were included: AppID");
      }
      GMTrace.o(12653242089472L, 94274);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      al localal = (al)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12653242089472L, 94274);
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
          localal.urE = ((en)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 2: 
        localal.mEm = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 3: 
        localal.mCH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 4: 
        localal.mEv = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 5: 
        localal.huS = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      case 6: 
        localal.mEw = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12653242089472L, 94274);
        return 0;
      }
      localal.mEx = ((b.a.a.a.a)localObject1).cpH();
      GMTrace.o(12653242089472L, 94274);
      return 0;
    }
    GMTrace.o(12653242089472L, 94274);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */