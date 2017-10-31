package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.bl.a
{
  public int mDA;
  public String mDt;
  public String mDu;
  public String mDv;
  public co mDw;
  public int mDx;
  public int mDy;
  public String mDz;
  
  public l()
  {
    GMTrace.i(12649618210816L, 94247);
    GMTrace.o(12649618210816L, 94247);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12649752428544L, 94248);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mDt == null) {
        throw new b("Not all required fields were included: DownloadURL");
      }
      if (this.mDt != null) {
        paramVarArgs.e(1, this.mDt);
      }
      if (this.mDu != null) {
        paramVarArgs.e(2, this.mDu);
      }
      if (this.mDv != null) {
        paramVarArgs.e(4, this.mDv);
      }
      if (this.mDw != null)
      {
        paramVarArgs.ff(5, this.mDw.aWM());
        this.mDw.a(paramVarArgs);
      }
      paramVarArgs.fd(6, this.mDx);
      paramVarArgs.fd(7, this.mDy);
      if (this.mDz != null) {
        paramVarArgs.e(8, this.mDz);
      }
      paramVarArgs.fd(9, this.mDA);
      GMTrace.o(12649752428544L, 94248);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.mDt != null) {
        i = b.a.a.b.b.a.f(1, this.mDt) + 0;
      }
      paramInt = i;
      if (this.mDu != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mDu);
      }
      i = paramInt;
      if (this.mDv != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mDv);
      }
      paramInt = i;
      if (this.mDw != null) {
        paramInt = i + b.a.a.a.fc(5, this.mDw.aWM());
      }
      i = paramInt + b.a.a.a.fa(6, this.mDx) + b.a.a.a.fa(7, this.mDy);
      paramInt = i;
      if (this.mDz != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.mDz);
      }
      i = b.a.a.a.fa(9, this.mDA);
      GMTrace.o(12649752428544L, 94248);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bl.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bl.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cpJ();
        }
      }
      if (this.mDt == null) {
        throw new b("Not all required fields were included: DownloadURL");
      }
      GMTrace.o(12649752428544L, 94248);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      l locall = (l)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 3: 
      default: 
        GMTrace.o(12649752428544L, 94248);
        return -1;
      case 1: 
        locall.mDt = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 2: 
        locall.mDu = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 4: 
        locall.mDv = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).FK(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new co();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((co)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bl.a)localObject1, com.tencent.mm.bl.a.a((b.a.a.a.a)localObject2))) {}
          locall.mDw = ((co)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 6: 
        locall.mDx = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 7: 
        locall.mDy = ((b.a.a.a.a)localObject1).xSv.nm();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 8: 
        locall.mDz = ((b.a.a.a.a)localObject1).xSv.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      }
      locall.mDA = ((b.a.a.a.a)localObject1).xSv.nm();
      GMTrace.o(12649752428544L, 94248);
      return 0;
    }
    GMTrace.o(12649752428544L, 94248);
    return -1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */