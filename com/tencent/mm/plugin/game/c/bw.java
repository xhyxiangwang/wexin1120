package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bw
  extends com.tencent.mm.bl.a
{
  public c mCC;
  public String mCG;
  public boolean mCQ;
  public LinkedList<String> mCR;
  
  public bw()
  {
    GMTrace.i(12642370453504L, 94193);
    this.mCR = new LinkedList();
    GMTrace.o(12642370453504L, 94193);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12642504671232L, 94194);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCC == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.mCC != null)
      {
        paramVarArgs.ff(1, this.mCC.aWM());
        this.mCC.a(paramVarArgs);
      }
      if (this.mCG != null) {
        paramVarArgs.e(2, this.mCG);
      }
      paramVarArgs.af(3, this.mCQ);
      paramVarArgs.d(4, 1, this.mCR);
      GMTrace.o(12642504671232L, 94194);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.mCC != null) {
        paramInt = b.a.a.a.fc(1, this.mCC.aWM()) + 0;
      }
      i = paramInt;
      if (this.mCG != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mCG);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      int j = b.a.a.a.c(4, 1, this.mCR);
      GMTrace.o(12642504671232L, 94194);
      return i + (paramInt + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mCR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mCC == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      GMTrace.o(12642504671232L, 94194);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bw localbw = (bw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12642504671232L, 94194);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbw.mCC = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12642504671232L, 94194);
        return 0;
      case 2: 
        localbw.mCG = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12642504671232L, 94194);
        return 0;
      case 3: 
        localbw.mCQ = ((b.a.a.a.a)localObject1).cpH();
        GMTrace.o(12642504671232L, 94194);
        return 0;
      }
      localbw.mCR.add(((b.a.a.a.a)localObject1).xSv.readString());
      GMTrace.o(12642504671232L, 94194);
      return 0;
    }
    GMTrace.o(12642504671232L, 94194);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */