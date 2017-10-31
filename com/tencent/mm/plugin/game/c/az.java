package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class az
  extends com.tencent.mm.bl.a
{
  public String fuw;
  public String mFo;
  public String mFp;
  public LinkedList<ba> mFt;
  
  public az()
  {
    GMTrace.i(12647739162624L, 94233);
    this.mFt = new LinkedList();
    GMTrace.o(12647739162624L, 94233);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12647873380352L, 94234);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.fuw != null) {
        paramVarArgs.e(1, this.fuw);
      }
      paramVarArgs.d(2, 8, this.mFt);
      if (this.mFo != null) {
        paramVarArgs.e(3, this.mFo);
      }
      if (this.mFp != null) {
        paramVarArgs.e(4, this.mFp);
      }
      GMTrace.o(12647873380352L, 94234);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.fuw != null) {
        paramInt = b.a.a.b.b.a.f(1, this.fuw) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.mFt);
      paramInt = i;
      if (this.mFo != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mFo);
      }
      i = paramInt;
      if (this.mFp != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mFp);
      }
      GMTrace.o(12647873380352L, 94234);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mFt.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.fuw == null) {
        throw new b("Not all required fields were included: Title");
      }
      GMTrace.o(12647873380352L, 94234);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      az localaz = (az)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12647873380352L, 94234);
        return -1;
      case 1: 
        localaz.fuw = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647873380352L, 94234);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ba();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((ba)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          localaz.mFt.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647873380352L, 94234);
        return 0;
      case 3: 
        localaz.mFo = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12647873380352L, 94234);
        return 0;
      }
      localaz.mFp = ((b.a.a.a.a)localObject1).xSv.readString();
      GMTrace.o(12647873380352L, 94234);
      return 0;
    }
    GMTrace.o(12647873380352L, 94234);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */