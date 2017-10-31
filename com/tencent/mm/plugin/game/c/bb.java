package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bb
  extends com.tencent.mm.bl.a
{
  public String mCH;
  public bn mCW;
  public String mDg;
  public String mFv;
  public String mFw;
  public String mFx;
  
  public bb()
  {
    GMTrace.i(15199352389632L, 113244);
    GMTrace.o(15199352389632L, 113244);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15199486607360L, 113245);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mCH != null) {
        paramVarArgs.e(1, this.mCH);
      }
      if (this.mFv != null) {
        paramVarArgs.e(2, this.mFv);
      }
      if (this.mFw != null) {
        paramVarArgs.e(3, this.mFw);
      }
      if (this.mFx != null) {
        paramVarArgs.e(4, this.mFx);
      }
      if (this.mCW != null)
      {
        paramVarArgs.ff(5, this.mCW.aWM());
        this.mCW.a(paramVarArgs);
      }
      if (this.mDg != null) {
        paramVarArgs.e(6, this.mDg);
      }
      GMTrace.o(15199486607360L, 113245);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mCH != null) {
        i = b.a.a.b.b.a.f(1, this.mCH) + 0;
      }
      paramInt = i;
      if (this.mFv != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mFv);
      }
      i = paramInt;
      if (this.mFw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mFw);
      }
      paramInt = i;
      if (this.mFx != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mFx);
      }
      i = paramInt;
      if (this.mCW != null) {
        i = paramInt + b.a.a.a.fc(5, this.mCW.aWM());
      }
      paramInt = i;
      if (this.mDg != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mDg);
      }
      GMTrace.o(15199486607360L, 113245);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      GMTrace.o(15199486607360L, 113245);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bb localbb = (bb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15199486607360L, 113245);
        return -1;
      case 1: 
        localbb.mCH = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 2: 
        localbb.mFv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 3: 
        localbb.mFw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 4: 
        localbb.mFx = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(15199486607360L, 113245);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localbb.mCW = ((bn)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15199486607360L, 113245);
        return 0;
      }
      localbb.mDg = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(15199486607360L, 113245);
      return 0;
    }
    GMTrace.o(15199486607360L, 113245);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */